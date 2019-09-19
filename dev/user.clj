(ns user
  (:require [figwheel.main.api :as fig]))

(defn fig-start []
  (fig/start "dev"))

(defn fig-stop []
  (fig/stop "dev"))

(defn fig-prod-start []
  (fig/start "prod"))

(defn fig-prod-stop []
  (fig/stop "prod"))

(defn cljs-repl []
  (fig/cljs-repl "dev"))

(comment
 (require '[camel-snake-kebab.core :as csk]
          '[clojure.string :as str])

 (let [components (->> (slurp "https://raw.githubusercontent.com/Semantic-Org/Semantic-UI-React/v0.88.1/src/index.js")
                       (str/split-lines)
                       ;; Only named exports
                       (filter #(re-matches #"export\s[A-z].+from.+$" %))
                       (map #(re-find #"export\s([A-z]+)\sfrom" %))
                       (map second))]
   ;; Generate jsObj definitions
   (->> components
        (map (fn [s] (format "(def js%s (get-obj \"%s\"))" s s)))
        (str/join "\n")
        (spit "/tmp/jsobj.txt"))
   ;; Generate Reagent components
   (->> components
        (map (fn [s] (format "(def %s (adapt js%s))" s s)))
        (str/join "\n")
        (spit "/tmp/adapt.txt"))))
