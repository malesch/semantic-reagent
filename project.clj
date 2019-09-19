(defproject malesch/semantic-reagent "1.1.1-SNAPSHOT"
  :description "Library for using Semantic UI React components with Reagent"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/malesch/semantic-reagent"
  :deploy-repositories [["releases" {:url "https://repo.clojars.org" :creds :gpg}]
                        ["snapshots" :clojars]]
  :clean-targets ^{:protect false} ["target"]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [cljsjs/semantic-ui-react "0.88.1-0"]]
  :profiles {:provided {:dependencies [[org.clojure/clojurescript "1.10.520"]
                                       [reagent "0.9.0-rc1"]]}
             :dev {:source-paths ["dev"]
                   :resource-paths ["target"]
                   :dependencies [[nrepl/nrepl "0.6.0"]
                                  [cider/piggieback "0.4.1"]
                                  [com.bhauman/figwheel-main "0.2.3"]
                                  [devcards "0.2.6"]
                                  [camel-snake-kebab "0.4.0"]]
                   :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}})
