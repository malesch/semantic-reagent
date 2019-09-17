(ns ^:figwheel-hooks semantic-reagent-cards.core
  (:require [devcards.core :as dc :include-macros true]
            [semantic-reagent.core]
            [semantic-reagent-cards.elements]
            [semantic-reagent-cards.collections]
            [semantic-reagent-cards.views]
            [semantic-reagent-cards.modules]
            [semantic-reagent-cards.addons]))

(defn ^:after-load init []
  (js/console.log "foo")
  (dc/start-devcard-ui!))

(init)
