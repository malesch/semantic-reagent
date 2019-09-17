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
