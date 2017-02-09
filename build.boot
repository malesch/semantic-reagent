(set-env!
 :source-paths    #{"src"}
 :dependencies '[[cljsjs/semantic-ui-react      "0.64.0-0"]
                 ;;
                 [org.clojure/clojurescript     "1.9.293"   :scope "provided"]
                 [reagent                       "0.6.0"     :scope "provided"]
                 [adzerk/boot-cljs              "1.7.228-2" :scope "test"]
                 [adzerk/boot-cljs-repl         "0.3.3"     :scope "test"]
                 [adzerk/boot-reload            "0.4.13"    :scope "test"]
                 [pandeiro/boot-http            "0.7.6"     :scope "test" :exclusions [org.clojure/clojure]]
                 [com.cemerick/piggieback       "0.2.1"     :scope "test" :exclusions [org.clojure/clojure]]
                 [org.clojure/tools.nrepl       "0.2.12"    :scope "test" :exclusions [org.clojure/clojure]]
                 [weasel                        "0.7.0"     :scope "test" :exclusions [org.clojure/clojure]]
                 [devcards                      "0.2.2"     :scope "test"]
                 [adzerk/bootlaces              "0.1.13"    :scope "test"]])

(require
  '[adzerk.bootlaces              :refer [bootlaces! build-jar push-release]]
  '[adzerk.boot-cljs              :refer [cljs]]
  '[adzerk.boot-cljs-repl         :refer [cljs-repl start-repl]]
  '[adzerk.boot-reload            :refer [reload]]
  '[pandeiro.boot-http            :refer [serve]])

(def +version+ "1.0.0")

(bootlaces! +version+)

(task-options!
  pom {:project     'malesch/semantic-reagent
       :version     +version+
       :description "Library for using Semantic UI React components with Reagent."
       :url         "https://github.com/malesch/semantic-reagent"
       :scm         {:url "https://github.com/malesch/semantic-reagent"}}
  cljs {:optimizations :none
        :source-map true
        :compiler-options {:devcards true}}
  reload {:on-jsload 'semantic-reagent-cards.core/init})

(deftask deploy []
  (comp (pom)
        (build-jar)
        (push-release :repo "clojars" :tag true)))

(deftask dev []
  (set-env! :source-paths #(conj % "dev")
            :resource-paths #{"resources"})
  (comp
    (serve)
    (watch)
    (cljs-repl)
    (reload)
    (speak :theme "woodblock")
    (cljs)))


