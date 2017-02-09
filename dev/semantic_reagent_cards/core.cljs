(ns semantic-reagent-cards.core
  (:require [devcards.core :as dc :include-macros true]
            [reagent.core :as r :refer [atom]]
            [semantic-reagent.core :as c])
  (:require-macros [devcards.core :refer [defcard-rg]]))

(enable-console-print!)

(defcard-rg Buttons
  [:div.examples
   [:div.ex
    [c/Button "Click here"]]
   [:div.ex
    [c/Button {:primary true} "Primary"]
    [c/Button {:secondary true} "Secondary"]]
   [:div.ex
    [c/Button {:animated true}
     [c/ButtonContent {:visible true} "Next"]
     [c/ButtonContent {:hidden true} "Previous"]]
    [c/Button {:animated :fade}
     [c/ButtonContent {:visible true} "Sign-up for a Pro account"]
     [c/ButtonContent {:hidden true} "$12.99 a month"]]]
   [:div.ex
    [c/Button {:content "Pause"
               :icon :pause
               :label-position :left}]
    [c/Button {:content "Next"
               :icon "right arrow"
               :label-position :right}]]
   [:div.ex
    [c/ButtonGroup
     [c/Button {:icon "align left"}]
     [c/Button {:icon "align center"}]
     [c/Button {:icon "align right"}]
     [c/Button {:icon "align justify"}]]
    " "
    [c/ButtonGroup
     [c/Button {:icon :bold}]
     [c/Button {:icon :underline}]
     [c/Button {:icon "text width"}]]]
   [:div.ex
    [c/ButtonGroup
     [c/Button "Cancel"]
     [c/ButtonOr]
     [c/Button {:positive true} "Save"]]]
   [:div.ex
    [c/Button {:color :red :content "Like" :icon :heart
               :label (r/as-element [c/Label {:basic true :color :red :pointing :left :content "2,048"}])}]]])

(defcard-rg Container
  [:div.examples
   [:div.ex
    [c/Container
     [:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa strong. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede link mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi."]]]
   [:div.ex
    [c/Container {:text true}
     [c/Header {:as :h2} "Header"]
     [:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa strong. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede link mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi."]
     [:p "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa strong. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede link mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi."]]]
   [:div.ex
    [c/Container {:fluid true}
     [c/Header {:as :h2} "Dogs Roles with Humans"]
     [:p "Domestic dogs inherited complex behaviors, such as bite inhibition, from their wolf ancestors, which would have been pack hunters with complex body language. These sophisticated forms of social cognition and communication may account for their trainability, playfulness, and ability to fit into human households and social situations, and these attributes have given dogs a relationship with humans that has enabled them to become one of the most successful species on the planet today."]
     [:p "The dogs' value to early human hunter-gatherers led to them quickly becoming ubiquitous across world cultures. Dogs perform many roles for people, such as hunting, herding, pulling loads, protection, assisting police and military, companionship, and, more recently, aiding handicapped individuals. This impact on human society has given them the nickname \"man's best friend\" in the Western world. In some cultures, however, dogs are also a source of meat."]]]])

(defcard-rg Divider
  [:div.examples
   [:div.ex
    [c/Divider]]
   [:div.ex
    [c/Grid {:columns 3 :relaxed true}
     [c/GridColumn
      [c/Segment {:basic true} "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio."]]
     [c/Divider {:vertical true} "Or"]
     [c/GridColumn
      [c/Segment {:basic true} "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio."]]
     [c/Divider {:vertical true} "And"]
     [c/GridColumn
      [c/Segment {:basic true} "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio."]]]]
   [:div.ex
    [c/Segment {:padded true}
     [c/Button {:primary true :fluid true} "Login"]
     [c/Divider {:horizontal true} "Or"]
     [c/Button {:secondary true :fluid true} "Sign Up Now"]]]])

(defcard-rg Flag
  [:div.examples
   [:div.ex
    [c/Segment
     [c/Flag {:name :ae}]
     [c/Flag {:name :france}]
     [c/Flag {:name "myanmar"}]]]])

(defcard-rg Header
  [:div.examples
   [:div.ex
    [c/Header {:as :h1} "First Header"]
    [c/Header {:as "h2"} "Second Header"]
    [c/Header {:as :h3} "Third Header"]
    [c/Header {:as :h4} "Forth Header"]
    [c/Header {:as "h5"} "Fifth Header"]
    [c/Header {:as :h6} "Sixth Header"]]
   [:div.ex
    [c/Header {:as :h2
               :icon true
               :text-align :center}
     [c/Icon {:name "users" :circular true}]
     [c/HeaderContent
      "Friends"]
     [c/Image {:centered true
               :size :large
               :src "http://semantic-ui.com/images/wireframe/centered-paragraph.png"}]]]
   [:div.ex
    [c/Header {:sub true} "Price"]
    [:span "$10.99"]]
   [:div.ex
    [c/Header {:as :h2}
     [c/Image {:shape :circular
               :src "http://semantic-ui.com/images/avatar2/large/patrick.png"}]]]
   [:div.ex
    [c/IconGroup {:size :huge}
     [c/Icon {:size :big :color :red :name "dont"}]
     [c/Icon {:color :black :name "user"}]]
    [c/IconGroup {:size :huge}
     [c/Icon {:loading true :size :big :name "sun"}]
     [c/Icon {:name "user"}]]]])

(defcard-rg Icon
  [:div.examples
   [:div.ex
    [c/Icon {:disabled true :name "users"}]]
   [:div.ex
    [c/Icon {:loading true :name "spinner"}]
    [c/Icon {:loading true :name "certificate"}]
    [c/Icon {:loading true :name "asterisk"}]]])

(defcard-rg Image
  [:div.examples
   [:div.ex
    [c/Image {:size :small
              :src "/assets/kristy.png"}]]
   [:div.ex
    [c/Image {:size :medium
              :shape :rounded
              :src "/assets/kristy.png"}]]])

(defcard-rg Input
  [:div.examples
   [:div.ex
    [c/Input {:focus true :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:loading true :icon "user" :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:disabled true :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:error true :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:icon "users" :icon-position :left :placeholder "Searching..."}]]
   [:div.ex
    [c/Input {:icon (r/as-element [c/Icon {:name "search" :inverted true :circular true :link true}])
              :placeholder "Search..."}]]
   [:div.ex
    [c/Input {:label "http://" :placeholder "mysite.com"}]]
   [:div.ex
    [c/Input {:label (r/as-element
                       [c/Dropdown {:defaultValue ".com"
                                    :options      [{:key ".com" :text ".com" :value ".com"}
                                                   {:key ".net" :text ".net" :value ".net"}
                                                   {:key ".org" :text ".org" :value ".org"}]}])
              :label-position :right
              :placeholder    "Find domain"}]]
   [:div.ex
    [c/Input {:label          (r/as-element [c/Label {:icon "asterisk"}])
              :label-position "right corner"
              :placeholder    "Search..."}]]])

(defcard-rg Label
  [:div.examples
   [:div.ex
    [c/Label
     [c/Icon {:name "mail"}] "23"]]
   [:div.ex
    [c/Label {:as :a :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/joe.jpg"}] "Joe"]
    [c/Label {:as :a :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/elliot.jpg"}] "Elliot"]
    [c/Label {:as :a :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/stevie.jpg"}] "Stevie"]]
   [:div.ex
    [c/Label {:as :a :color :blue :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/veronika.jpg"}] "Veronika"
     [c/LabelDetail "Friend"]]
    [c/Label {:as :a :color :teal :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/jenny.jpg"}] "Veronika"
     [c/LabelDetail "Friend"]]
    [c/Label {:as :a :color :yellow :image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/christian.jpg"}] "Helen"
     [c/LabelDetail "Co-worker"]]]
   [:div.ex
    [c/Label {:image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/ade.jpg"}] "Adrienne"
     [c/Icon {:name "delete"}]]
    [c/Label {:image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/zoe.jpg"}] "Zoe"
     [c/Icon {:name "delete"}]]
    [c/Label {:image true}
     [:img {:src "http://semantic-ui.com/images/avatar/small/nan.jpg"}] "Nan"
     [c/Icon {:name "delete"}]]]
   [:div.ex
    [c/Form
     [c/FormField
      [:input {:type "text" :placeholder "First name"}]
      [c/Label {:pointing true} "Please enter a value"]]
     [c/Divider]
     [c/FormField
      [c/Label {:pointing :below} "Please enter a value"]
      [:input {:type "text" :placeholder "Last Name"}]]
     [c/Divider]
     [c/FormField {:inline true}
      [:input {:type "text" :placeholder "Username"}]
      [c/Label {:pointing :left} "That name is taken!"]]
     [c/Divider]
     [c/FormField {:inline true}
      [c/Label {:pointing :right} "Your password must be 6 character or more"]
      [:input {:type "password" :placeholder "Password"}]]]]
   [:div.ex
    [c/Form
     [c/FormField
      [:input {:type "text" :placeholder "First name"}]
      [c/Label {:basic true :color :red :pointing true} "Please enter a value"]]]]
   [:div.ex
    [c/Image {:src   "http://semantic-ui.com/images/avatar2/small/patrick.png"
              :label (r/as-element [c/Label {:as     :a
                                             :color  :red
                                             :corner :right
                                             :icon   "heart"}])}]]
   [:div.ex
    [c/List {:divided true :selection true}
     [c/ListItem
      [c/Label {:color :red :horizontal true} "Fruit"] "Kumquats"]
     [c/ListItem
      [c/Label {:color :purple :horizontal true} "Candy"] "Ice Cream"]
     [c/ListItem
      [c/Label {:color :red :horizontal true} "Fruit"] "Orange"]
     [c/ListItem
      [c/Label {:horizontal true} "Dog"] "Poodle"]]]])


(defcard-rg List
  [:div.examples
   [:div.ex
    [c/List
     [c/ListItem "Apples"]
     [c/ListItem "Pears"]
     [c/ListItem "Oranges"]]]
   [:div.ex
    [c/List
     [c/ListItem
      [c/ListIcon {:name "user"}]
      [c/ListContent "Semantic UI"]]
     [c/ListItem
      [c/ListIcon {:name "marker"}]
      [c/ListContent "New York, NY"]]
     [c/ListItem
      [c/ListIcon {:name :mail}]
      [c/ListContent
       [:a {:href "mailto:jack@semantic-ui.com"} "jack@semantic-ui.com"]]]
     [c/ListItem
      [c/ListIcon {:name "linkify"}]
      [c/ListContent
       [:a {:href "http://www.semantic-ui.com"} "semantic-ui.com"]]]]]])

(defcard-rg Loader
  [:div.examples
   [:div.ex
    [c/Segment
     [c/Dimmer {:active true}
      [c/Loader]]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]
   [:div.ex
    [c/Segment
     [c/Dimmer {:active true}
      [c/Loader "Loading"]]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]
    [c/Segment
     [c/Dimmer {:active true :inverted true}
      [c/Loader {:inverted true} "Loading"]]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]
   [:div.ex
    [c/Segment
     [c/Dimmer {:active true}
      [c/Loader {:indeterminate true} "Preparing Files"]]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]
   [:div.ex
    [c/Segment
     [c/Loader {:active true}]
     [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]])

(defcard-rg Rail
  [:div.examples
   [:div.ex
    [c/Grid {:centered true :columns 3}
     [c/GridColumn
      [c/Segment
       [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
       [c/Rail {:position :left}
        [c/Segment "Left Rail Content"]]
       [c/Rail {:position :right}
        [c/Segment "Right Rail Content"]]]]]]
   [:div.ex
    [c/Segment {:text-align :center}
     [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
     [c/Rail {:internal true :position :left}
      [c/Segment "Left Rail Content"]]
     [c/Rail {:internal true :position :right}
      [c/Segment "Right Rail Content"]]]]
   [:div.ex
    [c/Grid {:centered true :columns 3}
     [c/GridColumn
      [c/Segment {:text-align :center}
       [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
       [c/Rail {:dividing true :position :left}
        [c/Segment "Left Rail Content"]]
       [c/Rail {:dividing true :position :right}
        [c/Segment "Right Rail Content"]]]]]]
   [:div.ex
    [c/Grid {:centered true :columns 3}
     [c/GridColumn
      [c/Segment {:text-align :center}
       [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
       [c/Rail {:attached true :position :left}
        [c/Segment "Left Rail Content"]]
       [c/Rail {:attached true :position :right}
        [c/Segment "Right Rail Content"]]]]]]
   [:div.ex
    [c/Segment
     [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]
     [c/Rail {:attached true :internal true :position :left}
      [c/Segment "Left Rail Content"]]
     [c/Rail {:attached true :internal true :position :right}
      [c/Segment "Right Rail Content"]]]]])

(defcard-rg Reveal
  [:div.examples
   [:div.ex
    [c/Reveal {:animated :fade}
     [c/RevealContent {:visible true}
      [c/Image {:src "http://semantic-ui.com/images/wireframe/square-image.png" :size :small}]]
     [c/RevealContent {:hidden true}
      [c/Image {:src "http://semantic-ui.com/images/avatar/large/ade.jpg" :size :small}]]]]
   [:div.ex
    [c/Reveal {:animated :move}
     [c/RevealContent {:visible true}
      [c/Image {:src "http://semantic-ui.com/images/wireframe/square-image.png" :size :small}]]
     [c/RevealContent {:hidden true}
      [c/Image {:src "http://semantic-ui.com/images/avatar/large/chris.jpg" :size :small}]]]]
   [:div.ex
    [c/Reveal {:animated "move right"}
     [c/RevealContent {:visible true}
      [c/Image {:src "http://semantic-ui.com/images/wireframe/square-image.png" :size :small}]]
     [c/RevealContent {:hidden true}
      [c/Image {:src "http://semantic-ui.com/images/avatar/large/jenny.jpg" :size :small}]]]]
   [:div.ex
    [c/Reveal {:animated :rotate}
     [c/RevealContent {:visible true}
      [c/Image {:src "http://semantic-ui.com/images/wireframe/square-image.png" :shape :circular :size :small}]]
     [c/RevealContent {:hidden true}
      [c/Image {:src "http://semantic-ui.com/images/avatar/large/stevie.jpg" :shape :circular :size :small}]]]]
   [:div.ex
    [c/SegmentGroup
     [c/Segment "Top"]
     [c/SegmentGroup
      [c/Segment "Nested Top"]
      [c/Segment "Nested Middle"]
      [c/Segment "Nested Bottom"]]
     [c/SegmentGroup {:horizontal true}
      [c/Segment "Top"]
      [c/Segment "Middle"]
      [c/Segment "Bottom"]]
     [c/Segment "Bottom"]]]])

(defcard-rg Segment
  [:div.examples
   [:div.ex
    [c/Segment "Pellentesque habitant morbi tristique senectus."]]
   [:div.ex
    [c/Segment {:stacked true} "Pellentesque habitant morbi tristique senectus."]]
   [:div.ex
    [c/Segment {:vertical true} "Te eum doming eirmod, nominati pertinacia argumentum ad his."]
    [c/Segment {:vertical true} "Pellentesque habitant morbi tristique senectus."]
    [c/Segment {:vertical true} "Eu quo homero blandit intellegebat. Incorrupte consequuntur mei id."]]])

(defcard-rg Step
  [:div.examples
   [:div.ex
    [c/StepGroup
     [c/Step "Shipping"]]]
   [:div.ex
    [c/StepGroup
     [c/Step
      [c/Icon {:name "truck"}]
      [c/StepContent
       [c/StepTitle "Shipping"]
       [c/StepDescription "Choose your shipping options"]]]
     [c/Step {:active true}
      [c/Icon {:name "payment"}]
      [c/StepContent {:title "Billing" :description "Enter billing information"}]]
     [c/Step {:disabled true :icon "info" :title "Confirm order"}]]
    [:br]
    [c/StepGroup {:items [{:icon "truck" :title "Shhipping" :description "Choose your shipping options"}
                          {:active true :icon "payment" :title "Billing" :description "Enter billing information"}
                          {:disabled true :icon "info" :title "Confirm Order"}]}]]
   [:div.ex
    [c/StepGroup {:vertical true :items [{:completed true :icon "truck" :title "Shipping" :description "Choose your shipping options"}
                                         {:completed true :icon "credit card" :title "Billing" :description "Enter billing information"}
                                         {:active true :icon "info" :title "Confirm Order" :description "Verify order details"}]}]]])

(defcard-rg Breadcrumb
  [:div.examples
   [:div.ex
    [c/Breadcrumb
     [c/BreadcrumbSection {:link true} "Home"]
     [c/BreadcrumbDivider {:icon "right angle"}]
     [c/BreadcrumbSection {:link true} "Store"]
     [c/BreadcrumbDivider {:icon "right angle"}]
     [c/BreadcrumbSection {:link true} "T-Shirt"]]]
   [:div.ex
    [c/Breadcrumb
     [c/BreadcrumbSection {:link true} "Home"]
     [c/BreadcrumbDivider "/"]
     [c/BreadcrumbSection {:link true} "Store"]
     [c/BreadcrumbDivider {:icon "right angle"}]
     [c/BreadcrumbSection {:active true} "Search for:" [:a {:href "#"} "paper towels"]]]]])

(defcard-rg Form
  (fn [state]
      [:div.ex
       [c/Form {:on-submit (fn [evt form]
                               (.preventDefault evt)
                               (reset! state (get (js->clj form) "formData")))}
        [c/FormGroup {:widths :equal}
         [c/FormInput {:label "Name" :name "name" :placeholder "Name"}]
         [c/FormSelect {:label  "Gender" :name "Gender" :placeholder "Gender"
                        :options [{:key "m" :text "Male" :value "male"}
                                  {:key "f" :text "Female" :value "female"}]}]]
        [c/FormSelect {:label   "Products" :name "products" :placeholder "Search..." :search true :multiple true
                       :options [{:key "hat" :text "Hat" :value "hat"}
                                 {:key "scarf" :text "Scarf" :value "scarf"}
                                 {:key "jacket" :text "Jacket" :value "jacket"}
                                 {:key "t_shirt" :text "T-Shirt" :value "t_shirt"}
                                 {:key "gloves" :text "Gloves" :value "gloves"}
                                 {:key "watch" :text "Watch" :value "watch"}
                                 {:key "belt" :text "Belt" :value "belt"}
                                 {:key "pants" :text "Pants" :value "pants"}
                                 {:key "shoes" :text "Shoes" :value "shoes"}
                                 {:key "socks" :text "Socks" :value "socks"}]}]
        [c/FormGroup {:widths 2}
         [c/FormField
          [:label "Plan"]
          [c/FormGroup {:inline true}
           [c/FormRadio {:label "A" :name "plan" :value "a"}]
           [c/FormRadio {:label "B" :name "plan" :value "a"}]
           [c/FormRadio {:label "C" :name "plan" :value "a"}]]]
         [c/FormField
          [:label "Shipping Options"]
          [c/FormGroup {:inline true}
           [c/FormCheckbox {:label "Expedite" :name "shippingOptions" :value "expedite"}]
           [c/FormCheckbox {:label "Gift Wrap" :name "shippingOptions" :value "giftWrap"}]
           [c/FormCheckbox {:label "C.O.D" :name "shippingOptions" :value "cod"}]]]]
        [c/FormTextArea {:name "details" :label "Details" :placeholder "Anything else we should know?" :rows 3}]
        [c/FormCheckbox {:name "terms" :label "I agree to the Terms and Conditions"}]
        [c/Button {:primary true :type :submit} "Submit"]]
       [:br]])
  (r/atom {})
  {:inspect-data true})

(defcard-rg Grid
  [:div.examples
   [:div.ex
    [c/Grid
     (for [i (range 16)]
          ^{:key i}
          [c/GridColumn
           [c/Image {:src "http://semantic-ui.com/images/wireframe/image.png"}]])]]
   [:div.ex
    [:span.title "Divided"]
    [c/Grid {:columns 3 :divided true}
     [c/GridRow
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]]
     [c/GridRow
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]
      [c/GridColumn [c/Image {:src "http://semantic-ui.com/images/wireframe/media-paragraph.png"}]]]]]
   [:div.ex
    [:span.title "Celled"]
    [c/Grid {:celled true}
     [c/GridRow
      [c/GridColumn {:width 3} [c/Image {:src "http://semantic-ui.com/images/wireframe/image.png"}]]
      [c/GridColumn {:width 13} [c/Image {:src "http://semantic-ui.com/images/wireframe/centered-paragraph.png"}]]]
     [c/GridRow
      [c/GridColumn {:width 3} [c/Image {:src "http://semantic-ui.com/images/wireframe/image.png"}]]
      [c/GridColumn {:width 10} [c/Image {:src "http://semantic-ui.com/images/wireframe/paragraph.png"}]]
      [c/GridColumn {:width 3} [c/Image {:src "http://semantic-ui.com/images/wireframe/image.png"}]]]]]])

(defcard-rg Menu-1
            (fn [active-item]
                (let [handle-item-click (fn [_ data] (reset! active-item (aget data "name")))]
                     [:div.examples
                      [:div.ex
                       [:span.title "Simple Menu"]
                       [c/Menu
                        [c/MenuItem {:name     "editorials"
                                     :active   (= @active-item "editorials")
                                     :on-click handle-item-click}]
                        [c/MenuItem {:name     "reviews"
                                     :active   (= @active-item "reviews")
                                     :on-click handle-item-click}]
                        [c/MenuItem {:name     "upcomingEvents"
                                     :active   (= @active-item "upcomingEvents")
                                     :on-click handle-item-click}]]]]))
            (r/atom nil))

(defcard-rg Menu-2
            (fn [active-item]
                (let [handle-item-click (fn [_ data] (reset! active-item (aget data "name")))]
                     [:div.examples
                      [:div.ex
                       [:span.title "Menu Tabular"]
                       [c/Menu {:tabular true}
                        [c/MenuItem {:name     "bio"
                                     :active   (= @active-item "bio")
                                     :on-click handle-item-click}]
                        [c/MenuItem {:name     "photos"
                                     :active   (= @active-item "photos")
                                     :on-click handle-item-click}]]]]))
            (r/atom nil))

(defcard-rg Menu-3
            (fn [active-item]
                (let [handle-item-click (fn [_ data] (reset! active-item (aget data "name")))]
                     [:div.examples
                      [:div.ex
                       [:span.title "Menu Vertical"]
                       [c/Menu {:vertical true}
                        [c/MenuItem {:name     "inbox"
                                     :active   (= @active-item "inbox")
                                     :on-click handle-item-click}
                         [c/Label {:color :teal} "1"]
                         "Inbox"]
                        [c/MenuItem {:name     "spam"
                                     :active   (= @active-item "spam")
                                     :on-click handle-item-click}
                         [c/Label "51"]
                         "Spam"]
                        [c/MenuItem {:name     "updates"
                                     :active   (= @active-item "updates")
                                     :on-click handle-item-click}
                         [c/Label "1"]
                         "Updates"]
                        [c/MenuItem
                         [c/Input {:icon "search" :placeholder "Search mail..."}]]]]]))
            (r/atom nil))

(defcard-rg Message
            [:div.examples
             [:div.ex
              [c/Message
               [c/MessageHeader "Changes in Service"]
               [:p "We updated our privacy policy here to better service our customers. We recommend reviewing the changes."]]]
             [:div.ex
              [c/Message {:icon true}
               [c/Icon {:name "circle notched" :loading true}]
               [c/MessageContent
                [c/MessageHeader "Just one second"]
                "We are fetching that content for you."]]]
             [:div.ex
              [c/Message {:error true :header "There was some errors with your submission"
                          :list ["You must include both a upper and lower case letters in your password."
                                 "You need to select your home country."]}]]])

(defcard-rg Table
  [:div.examples
   [:div.ex
    [c/Table {:celled true :padded true}
     [c/TableHeader
      [c/TableRow
       [c/TableHeaderCell {:single-line true} "Evidence Rating"]
       [c/TableHeaderCell "Effect"]
       [c/TableHeaderCell "Efficacy"]
       [c/TableHeaderCell "Consensus"]
       [c/TableHeaderCell "Comments"]]]
     [c/TableBody
      [c/TableRow
       [c/TableCell [c/Header {:as :h2 :text-align :center} "A"]]
       [c/TableCell {:single-line true} "Power Output"]
       [c/TableCell [c/Rating {:icon :star :default-rating 3 :max-rating 3}]]
       [c/TableCell {:text-align :right} "80%" [:br] [:a {:href "#"} "18 studies"]]
       [c/TableCell "Creatine supplementation is the reference compound for increasing muscular creatine levels; there is\nvariability in this increase, however, with some nonresponders."]]
      [c/TableRow
       [c/TableCell [c/Header {:as :h2 :text-align :center} "A"]]
       [c/TableCell {:single-line true} "Weight"]
       [c/TableCell [c/Rating {:icon :star :default-rating 2 :max-rating 3}]]
       [c/TableCell {:text-align :right} "100%" [:br] [:a {:href "#"} "65 studies"]]
       [c/TableCell "Creatine is the reference compound for power improvement, with numbers from one meta-analysis to assess\npotency"]]]]]
   [:div.ex
    [c/Table {:compact true :celled true :definition true}
     [c/TableHeader
      [c/TableRow
       [c/TableHeaderCell]
       [c/TableHeaderCell "Name"]
       [c/TableHeaderCell "Registration Date"]
       [c/TableHeaderCell "E-mail address"]
       [c/TableHeaderCell "Premium Plan"]]]
     [c/TableBody
      [c/TableRow
       [c/TableCell {:collapsing true} [c/Checkbox {:slider true}]]
       [c/TableCell "John Lilki"]
       [c/TableCell "September 14, 2013"]
       [c/TableCell "jhlilk22@yahoo.com"]
       [c/TableCell "No"]]
      [c/TableRow
       [c/TableCell {:collapsing true} [c/Checkbox {:slider true}]]
       [c/TableCell "Jamie Harington"]
       [c/TableCell "January 11, 2014"]
       [c/TableCell "jamieharingonton@yahoo.com"]
       [c/TableCell "Yes"]]
      [c/TableRow
       [c/TableCell {:collapsing true} [c/Checkbox {:slider true}]]
       [c/TableCell "Jill Lewis"]
       [c/TableCell "May 11, 2014"]
       [c/TableCell "jilsewris22@yahoo.com"]
       [c/TableCell "Yes"]]]
     [c/TableFooter {:full-width true}
      [c/TableRow
       [c/TableHeaderCell]
       [c/TableHeaderCell {:col-span 4}
        [c/Button {:floated :right :icon true :label-position :left
                   :primary true :size :small}
         [c/Icon {:name "user"}] "Add User"]
        [c/Button {:size :small} "Approve"]
        [c/Button {:disabled true :size :small} "Approve All"]]]]
     ]]])

(defcard-rg Card
  [:div.examples
   [:div.ex
    [c/Card
     [c/Image {:src "http://semantic-ui.com/images/avatar2/large/matthew.png"}]
     [c/CardContent
      [c/CardHeader "Matthew"]
      [c/CardMeta [:span {:class-name "date"} "Joined in 2015"]]
      [c/CardDescription "Matthew is a musician living in Nashville."]]
     [c/CardContent {:extra true}
      [:a [c/Icon {:name "user"}] "22 Friends"]]]]
   [:div.ex
    [c/CardGroup
     [c/Card
      [c/CardContent
       [c/Image {:floated true :size :mini :src "http://semantic-ui.com/images/avatar/large/steve.jpg"}]
       [c/CardHeader "Steve Sanders"]
       [c/CardMeta "Friends of Elliot"]
       [c/CardDescription "Steve wants to add you to the group" [:strong "best friends"]]]
      [c/CardContent {:extra true}
       [:div {:class-name "ui two buttons"}
        [c/Button {:basic true :color :green} "Approve"]
        [c/Button {:basic true :color :red} "Decline"]]]]
     [c/Card
      [c/CardContent
       [c/Image {:floated true :size :mini :src "http://semantic-ui.com/images/avatar2/large/molly.png"}]
       [c/CardHeader "Molly Thomas"]
       [c/CardMeta "New User"]
       [c/CardDescription " Molly wants to add you to the group" [:strong "musicians"]]]
      [c/CardContent {:extra true}
       [:div {:class-name "ui two buttons"}
        [c/Button {:basic true :color :green} "Approve"]
        [c/Button {:basic true :color :red} "Decline"]]]]
     [c/Card
      [c/CardContent
       [c/Image {:floated true :size :mini :src "http://semantic-ui.com/images/avatar/large/jenny.jpg"}]
       [c/CardHeader "Jenny Lawrence"]
       [c/CardMeta "New User"]
       [c/CardDescription "Jenny requested permission to view your contact details"]]
      [c/CardContent {:extra true}
       [:div {:class-name "ui two buttons"}
        [c/Button {:basic true :color :green} "Approve"]
        [c/Button {:basic true :color :red} "Decline"]]]]]]])

(defcard-rg Comment
  [:div.examples
   [:div.ex
    [c/CommentGroup
     [c/Header {:as :h3 :dividing true} "Comments"]
     [c/Comment
      [c/CommentAvatar {:src "http://semantic-ui.com/images/avatar/small/matt.jpg"}]
      [c/CommentContent
       [c/CommentAuthor {:as :a} "Matt"]
       [c/CommentMetadata [:div "Today at 5:42PM"]]
       [c/CommentText "How artistic!"]
       [c/CommentActions [c/CommentAction "Reply"]]]]
     [c/Comment
      [c/CommentAvatar {:src "http://semantic-ui.com/images/avatar/small/elliot.jpg"}]
      [c/CommentContent
       [c/CommentAuthor {:as :a} "Elliot Fu"]
       [c/CommentMetadata [:div "Yesterday at 12:30AM"]]
       [c/CommentText [:p "This has been very useful for my research. Thanks as well!"]]
       [c/CommentActions [c/CommentAction "Reply"]]]
      [c/CommentGroup
       [c/Comment
        [c/CommentAvatar {:src "http://semantic-ui.com/images/avatar/small/jenny.jpg"}]
        [c/CommentContent
         [c/CommentAuthor {:as :a} "Jenny Hess"]
         [c/CommentMetadata [:div "Just now"]]
         [c/CommentText "Elliot you are always so right :)"]
         [c/CommentActions [c/CommentAction "Reply"]]]]]]
     [c/Comment
      [c/CommentAvatar {:src "http://semantic-ui.com/images/avatar/small/joe.jpg"}]
      [c/CommentContent
       [c/CommentAuthor {:as :a} "Joe Henderson"]
       [c/CommentMetadata [:div "5 days ago"]]
       [c/CommentText "Dude, this is awesome. Thanks so much"]
       [c/CommentActions [c/CommentAction "Reply"]]]]
     [c/Form {:reply true :on-submit (fn [evt] (.preventDefault evt))}
      [c/FormTextArea]
      [c/Button {:content "Add Reply" :label-position :left :icon "edit" :primary true}]]]]])

(defcard-rg Feed
  [:div.examples
   [:div.ex
    [c/Feed
     [c/FeedEvent
      [c/FeedLabel [:img {:src "http://semantic-ui.com/images/avatar/small/elliot.jpg"}]]
      [c/FeedContent "You added Elliot Fu to the group" [:a "Coworkers"]]]]]
   [:div.ex
    [c/Feed
     [c/FeedEvent
      [c/FeedLabel {:image "http://semantic-ui.com/images/avatar/small/jenny.jpg"}]
      [c/FeedContent
       [c/FeedDate "3 days ago"]
       [c/FeedSummary "You added " [:a "Jenny Hess"] " to your " [:a "coworker"] " group"]]]]]])

(defcard-rg Item
  [:div.examples
   [:div.ex
    [c/ItemGroup
     [c/Item
      [c/ItemImage {:size :tiny :src "http://semantic-ui.com/images/wireframe/image.png"}]
      [c/ItemContent
       [c/ItemHeader {:as :a} "Header"]
       [c/ItemMeta "Description"]
       [c/ItemDescription [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]
       [c/ItemExtra "Additional Details"]]]]]
   [:div.ex
    [c/ItemGroup
     [c/Item
      [c/ItemImage {:size :tiny :src "http://semantic-ui.com/images/wireframe/image.png"}]
      [c/ItemContent
       [c/ItemHeader "Arrowhead Valley Camp"]
       [c/ItemMeta
        [:span {:class-name "price"} "$1200"]
        [:span {:class-name "stay"} "1 Month"]]
       [c/ItemDescription [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]]
     [c/Item
      [c/ItemImage {:size :tiny :src "http://semantic-ui.com/images/wireframe/image.png"}]
      [c/ItemContent
       [c/ItemHeader "Buck's Homebrew Stayaway"]
       [c/ItemMeta {:content "$1000 2 Weeks"}]
       [c/ItemDescription [c/Image {:src "http://semantic-ui.com/images/wireframe/short-paragraph.png"}]]]]
     [c/Item
      [c/ItemImage {:size :tiny :src "http://semantic-ui.com/images/wireframe/image.png"}]
      [c/ItemContent {:header "Arrowhead Valley Camp" :meta "$1200 1 Month"}]]]]])

(defcard-rg Statistic
  [:div.examples
   [:div.ex
    [c/Statistic
     [c/StatisticValue "5,550"]
     [c/StatisticLabel "Downloads"]]
    [c/Statistic {:value "5,500" :label "Downloads"}]]
   [:div.ex
    [c/StatisticGroup
     [c/Statistic
      [c/StatisticValue "22"]
      [c/StatisticLabel "Saves"]]
     [c/Statistic
      [c/StatisticValue {:text true} "Three" [:br] "Thousand"]
      [c/StatisticLabel "Signups"]]
     [c/Statistic
      [c/StatisticValue
       [c/Icon {:name "plane"} "5"]]
      [c/StatisticLabel "Flights"]]
     [c/Statistic
      [c/StatisticValue
       [c/Image {:src "http://semantic-ui.com/images/avatar/small/joe.jpg"
                 :inline true
                 :shape :circular}]
       "42"]
      [c/StatisticLabel "Team Members"]]]]])

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
        [c/DimmerDimmable {:as c/jsSegment :dimmed=@state}
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
     [c/TextArea {:placeholder "Try adding multiple lines" :auto-height true}]]]])


(defn init []
      (dc/start-devcard-ui!))

