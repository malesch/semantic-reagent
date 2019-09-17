(ns semantic-reagent-cards.addons
  (:require [devcards.core :as dc :include-macros true]
            [reagent.core :as r :refer [atom]]
            [semantic-reagent.core :as c])
  (:require-macros [devcards.core :refer [defcard-rg]]))


(defcard-rg Confirm
            (fn [state]
                [:div.examples
                 [:div.ex
                  [c/Button {:on-click #(swap! state update :open not)} "Show"]
                  [c/Confirm {:open (:open @state)
                              :on-confirm #(swap! state assoc :open false :selection :confirm)
                              :on-cancel #(swap! state assoc :open false :selection :cancel)}]]])
            (r/atom {:open false})
            {:inspect-data true})

(defcard-rg Radio
            [:div.examples
             [:div.ex
              [c/Radio {:label "Make my profile visible"}]]
             [:div.ex
              [c/Radio {:toggle true}]]
             [:div.ex
              [c/Radio {:slider true}]]])

(defcard-rg Select
            [:div.examples
             [:div.ex
              [c/Select {:placeholder "Select your country"
                         :options [{:key "at" :value "at" :flag "at" :text "Austria"}
                                   {:key "fr" :value "fr" :flag "fr" :text "France"}
                                   {:key "de" :value "de" :flag "de" :text "Germany"}
                                   {:key "it" :value "it" :flag "it" :text "Italy"}
                                   {:key "ch" :value "ch" :flag "ch" :text "Switzerland"}]}]]])

(defcard-rg TextArea
            [:div.examples
             [:div.ex
              [c/Form
               [c/TextArea {:placeholder "Tell us more"}]]]
             [:div.ex
              [c/Form
               [c/TextArea {:placeholder "Try adding multiple lines" :rows 3}]]]])
