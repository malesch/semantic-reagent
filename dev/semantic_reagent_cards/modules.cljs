(ns semantic-reagent-cards.modules
  (:require [devcards.core :as dc :include-macros true]
            [reagent.core :as r :refer [atom]]
            [semantic-reagent.core :as c])
  (:require-macros [devcards.core :refer [defcard-rg]]))


(defcard-rg Accordion
            [:div.examples
             [:div.ex
              [c/Accordion
               [c/AccordionTitle [c/Icon {:name "dropdown"}] "What is a dog?"]
               [c/AccordionContent
                [:p "A dog is a type of domesticated animal. Known for its loyalty and faithfulness, it can be found as a welcome guest in many households across the world."]]
               [c/AccordionTitle [c/Icon {:name "dropdown"}] "What kinds of dogs are there?"]
               [c/AccordionContent
                [:p "There are many breeds of dogs. Each breed varies in size and temperament. Owners often select a breed of dog that they find to be compatible\nwith their own lifestyle and desires from a companion."]]
               [c/AccordionTitle [c/Icon {:name "dropdown"}] "How do you acquire a dog?"]
               [c/AccordionContent
                [:p "Three common ways for a prospective owner to acquire a dog is from pet shops, private owners, or shelters."]
                [:p "A pet shop may be the most convenient way to buy a dog. Buying a dog from a private owner allows you to assess the pedigree and upbringing of your dog before choosing to take it home. Lastly, finding your do from a shelter, helps give a good home to a dog who may not find one so readily."]]]]
             [:div.ex
              [c/Accordion {:exclusive false :fluid true}
               [c/AccordionTitle [c/Icon {:name "dropdown"}] "What is a dog?"]
               [c/AccordionContent
                [:p "A dog is a type of domesticated animal. Known for its loyalty and faithfulness, it can be found as a welcome guest in many households across the world."]]
               [c/AccordionTitle [c/Icon {:name "dropdown"}] "What kinds of dogs are there?"]
               [c/AccordionContent
                [:p "There are many breeds of dogs. Each breed varies in size and temperament. Owners often select a breed of dog that they find to be compatible\nwith their own lifestyle and desires from a companion."]]
               [c/AccordionTitle [c/Icon {:name "dropdown"}] "How do you acquire a dog?"]
               [c/AccordionContent
                [:p "Three common ways for a prospective owner to acquire a dog is from pet shops, private owners, or shelters."]
                [:p "A pet shop may be the most convenient way to buy a dog. Buying a dog from a private owner allows you to assess the pedigree and upbringing of your dog before choosing to take it home. Lastly, finding your do from a shelter, helps give a good home to a dog who may not find one so readily."]]]]])

(defcard-rg Checkbox
            [:div.examples
             [:div.ex
              [c/Checkbox {:label "Make my profile visible"}]]
             [:div.ex
              [c/Checkbox {:toggle true}]]
             [:div.ex
              [c/Checkbox {:slider true}]]
             [:div.ex
              [c/Checkbox {:radio true :label "Radio choice"}]]])

(defcard-rg Dimmer-1
            (fn [state]
                [:div.examples
                 [:div.ex
                  [:span.title "Simple Dimmer"]
                  [c/DimmerDimmable {:as c/jsSegment :dimmed @state}
                   [c/Dimmer {:active @state :on-click-outside #(reset! state false)}]
                   [c/Header {:as :h3} "Overlayable Section"]
                   [c/ImageGroup {:size :small :class-name "ui small images"}
                    [c/Image {:src "/assets/images/wireframe/image.png"}]
                    [c/Image {:src "/assets/images/wireframe/image.png"}]
                    [c/Image {:src "/assets/images/wireframe/image.png"}]]
                   [c/Image {:size :medium :src "/assets/images/wireframe/media-paragraph.png"}]]
                  [c/ButtonGroup
                   [c/Button {:icon :plus :on-click #(reset! state true)}]
                   [c/Button {:icon :minus :on-click #(reset! state false)}]]]])
            (r/atom false))

(defcard-rg Dimmer
            (fn [state]
                [:div.examples
                 [:div.ex
                  [:span.title "Page Dimmer"]
                  [c/Button {:content "show" :icon :plus :label-position :left :on-click #(reset! state true)}]
                  [c/Dimmer {:active @state :on-click-outside #(reset! state false) :page true}
                   [c/Header {:as :h2 :icon true :inverted true}
                    [c/Icon {:name "heart"}] "Dimmed Message!" [c/HeaderSubheader "Dimmer sub-header"]]]]])
            (r/atom false))

(defcard-rg Dropdown
            [:div.examples
             [:div.ex
              [c/Dropdown {:text "File"}
               [c/DropdownMenu
                [c/DropdownItem {:text "New"}]
                [c/DropdownItem {:text "Open..." :description "ctrl + o"}]
                [c/DropdownItem {:text "Save as..." :description "ctrl + s"}]
                [c/DropdownItem {:text "Rename" :description "ctrl + r"}]
                [c/DropdownItem {:text "Make a copy"}]
                [c/DropdownItem {:icon :folder :text "Move to folder"}]
                [c/DropdownItem {:icon :trash :text "Move to trash"}]
                [c/DropdownDivider]
                [c/DropdownItem {:text "Download As..."}]
                [c/DropdownItem {:text "Publish To Web..."}]
                [c/DropdownItem "E-mail Collaborators"]]]]
             [:div.ex
              [c/Dropdown {:placeholder "Select Friend" :fluid true :selection true
                           :options     [{:text  "Jenny Hess" :value "Jenny Hess"
                                          :image (r/as-element [c/Image {:avatar true :src "http://semantic-ui.com/images/avatar/small/jenny.jpg"}])}
                                         {:text  "Joe Henderson" :value "Joe Henderson"
                                          :image (r/as-element [c/Image {:avatar true :src "http://semantic-ui.com/images/avatar/small/joe.jpg"}])}
                                         {:text  "Elliot Fu" :value "Elliot Fu"
                                          :image (r/as-element [c/Image {:avatar true :src "http://semantic-ui.com/images/avatar/small/elliot.jpg"}])}]}]]
             [:div.ex
              [c/Header {:as :h4}
               [c/Icon {:name "trophy"}]
               [c/HeaderContent "Trending repos "
                [c/Dropdown {:inline true :header "Adjust time span"
                             :options [{:key "today" :text "today" :value "today" :content "Today"}
                                       {:key "this week" :text "this week" :value "this week" :content "This Week"}
                                       {:key "this month" :text "this month" :value "this month" :content "This Month"}]}]]]]])

(defcard-rg Embed
            [:div.examples
             [:div.ex
              [c/Embed {:id "125292332" :placeholder "http://semantic-ui.com/images/vimeo-example.jpg" :source "vimeo"}]]])

(defcard-rg Modal
            [:div.examples
             [:div.ex
              [:span.title "Basic Modal"]
              [c/Modal {:trigger (r/as-element [c/Button "Show Modal"])}
               [c/ModalHeader "Select a Photo"]
               [c/ModalContent {:image true}
                [c/Image {:wrapped true :size :medium :src "http://semantic-ui.com/images/avatar2/large/rachel.png"}]
                [c/ModalDescription
                 [c/Header "Default Profile Image"]
                 [:p "We've found the following gravatar image associated with your e-mail address."]
                 [:p "Is it okay to use this photo?"]]]]]
             [:div.ex
              [:span.title "Scrolling Modal"]
              [c/Modal {:trigger (r/as-element [c/Button "Show Modal"])}
               [c/ModalHeader "Profile Picture"]
               [c/ModalContent {:image true}
                [c/Image {:wrapped true :size :medium :src "http://semantic-ui.com/images/wireframe/image.png"}]
                [c/ModalDescription
                 [c/Header "Modal Header"]
                 [:p "This is an example of expanded content that will cause the modal's dimmer to scroll"]
                 [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
                 [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
                 [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
                 [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
                 [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
                 [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
                 [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
                 [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]]]
               [c/ModalActions
                [c/Button {:primary true} "Proceed" [c/Icon {:name "right chevron"}]]]]]])

(defcard-rg Popup
            [:div.examples
             [:div.ex
              [c/Popup {:trigger (r/as-element [c/Button {:icon "add"}])
                        :content "Add users to your feed"}]]
             [:div.ex
              [c/Grid {:columns 3 :style {:width "600px"}}
               [c/GridRow
                [c/GridColumn
                 [c/Popup {:trigger (r/as-element [c/Icon {:name "heart" :color :red :size :large :circular true}])
                           :content "I am positioned to the top left"
                           :positioning "top left"}]]
                [c/GridColumn {:text-align :center}
                 [c/Popup {:trigger (r/as-element [c/Icon {:name "heart" :color :red :size :large :circular true}])
                           :content "I am positioned to the top center"
                           :positioning "top center"}]]
                [c/GridColumn {:text-align :right}
                 [c/Popup {:trigger (r/as-element [c/Icon {:name "heart" :color :red :size :large :circular true}])
                           :content "I am positioned to the top right"
                           :positioning "top right"}]]]
               [c/GridRow
                [c/GridColumn {:floated :left}
                 [c/Popup {:trigger (r/as-element [c/Icon {:name "heart" :color :red :size :large :circular true}])
                           :content "I am positioned to the left center"
                           :positioning "left center"}]]
                [c/GridColumn {:floated :right :text-align :right}
                 [c/Popup {:trigger (r/as-element [c/Icon {:name "heart" :color :red :size :large :circular true}])
                           :content "I am positioned to the right center"
                           :positioning "right center"}]]]
               [c/GridRow
                [c/GridColumn
                 [c/Popup {:trigger     (r/as-element [c/Icon {:name "heart" :color :red :size :large :circular true}])
                           :content     "I am positioned to the bottom left"
                           :positioning "bottom left"}]]
                [c/GridColumn {:text-align :center}
                 [c/Popup {:trigger     (r/as-element [c/Icon {:name "heart" :color :red :size :large :circular true}])
                           :content     "I am positioned to the bottom center"
                           :positioning "bottom center"}]]
                [c/GridColumn {:text-align :right}
                 [c/Popup {:trigger     (r/as-element [c/Icon {:name "heart" :color :red :size :large :circular true}])
                           :content     "I am positioned to the bottom right"
                           :positioning "bottom right"}]]]]]
             [:div.ex
              [c/Popup {:trigger (r/as-element [c/Icon {:name "heart" :size :large :circular true}])
                        :content "Way off to the left"
                        :offset 50
                        :positioning "left center"}]
              [c/Popup {:trigger (r/as-element [c/Icon {:name "heart" :size :large :circular true}])
                        :content "Way off to the right"
                        :offset 50
                        :positioning "right center"}]]
             [:div.ex
              [c/Popup {:trigger (r/as-element [c/Button {:icon "eye"}])
                        :content "Popup with a custom style prop"
                        :style {:border-radius 0
                                :opacity 0.7
                                :padding "2em"}
                        :inverted true}]]])

(defcard-rg Progress
            [:div.examples
             [:div.ex
              [c/Progress {:percent 11}]]
             [:div.ex
              [c/Progress {:percent 44 :progress true} "Active"]]
             [:div.ex
              [c/Progress {:percent 60 :active true} "Active"]]])

(defcard-rg Rating
            [:div.examples
             [:div.ex
              [c/Rating {:icon "star" :default-rating 3 :max-rating 4}]]
             [:div.ex
              [c/Rating {:icon "heart" :default-rating 1 :max-rating 3}]]
             [:div.ex
              [c/Rating {:max-rating 5 :clearable true}]]])

(defcard-rg Sidebar-1
            (fn [state]
                [:div.examples
                 [:div.ex
                  [:span.title "Left Overlay"]
                  [c/Button {:on-click #(swap! state update :visible not)} "Toggle Visibility"]
                  [c/SidebarPushable {:as c/jsSegment}
                   [c/Sidebar {:as c/jsMenu :animation :overlay :width :thin :visible (:visible @state)
                               :icon "labeled" :vertical true :inverted true}
                    [c/MenuItem {:name "home"} [c/Icon {:name "home"}] "Home"]
                    [c/MenuItem {:name "gamepad"} [c/Icon {:name "gamepad"}] "Games"]
                    [c/MenuItem {:name "camera"} [c/Icon {:name "camera"}] "Channels"]]
                   [c/SidebarPusher
                    [c/Segment {:basic true}
                     [c/Header {:as :h3} "Application Content"]
                     [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]]]]]])
            (r/atom {:visible false}))

(defcard-rg Sidebar-2
            (fn [state]
                [:div.examples
                 [:div.ex
                  [:span.title "Top Scale Down"]
                  [c/Button {:on-click #(swap! state update :visible not)} "Toggle Visibility"]
                  [c/SidebarPushable {:as c/jsSegment}
                   [c/Sidebar {:as c/jsMenu :animation "scale down" :direction :top
                               :visible (:visible @state) :inverted true}
                    [c/MenuItem {:name "home"} [c/Icon {:name "home"}] "Home"]
                    [c/MenuItem {:name "gamepad"} [c/Icon {:name "gamepad"}] "Games"]
                    [c/MenuItem {:name "camera"} [c/Icon {:name "camera"}] "Channels"]]
                   [c/SidebarPusher
                    [c/Segment {:basic true}
                     [c/Header {:as :h3} "Application Content"]
                     [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]]]]]])
            (r/atom {:visible false}))


