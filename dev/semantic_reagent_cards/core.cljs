(ns semantic-reagent-cards.core
  (:require [devcards.core :as dc :include-macros true]
            [reagent.core :as r :refer [atom]]
            [semantic-reagent.core :as c]
            [semantic-reagent-cards.elements]
            [semantic-reagent-cards.collections]
            [semantic-reagent-cards.views]
            [semantic-reagent-cards.modules]
            [semantic-reagent-cards.addons])
  (:require-macros [devcards.core :refer [defcard-rg]]))

(enable-console-print!)

(defn init []
      (dc/start-devcard-ui!))

