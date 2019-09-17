(ns semantic-reagent.core
  (:refer-clojure :exclude [List])
  (:require [cljsjs.semantic-ui-react]
            [goog.object :as go]
            [reagent.core :as r]))

;; See also: http://react.semantic-ui.com

(def semantic-ui js/semanticUIReact)

(defn- get-obj
  ([k] (go/get semantic-ui k))
  ([k base] (go/get base k)))

;;
;; Elements
;;

;; Button
(def jsButton (get-obj "Button"))
(def Button (r/adapt-react-class jsButton))
(def ButtonContent (r/adapt-react-class (get-obj "Content" jsButton)))
(def ButtonGroup (r/adapt-react-class (get-obj "Group" jsButton)))
(def ButtonOr (r/adapt-react-class (get-obj "Or" jsButton)))

;; Container
(def Container (r/adapt-react-class (get-obj "Container")))

;; Divider
(def Divider (r/adapt-react-class (get-obj "Divider")))

;; Flag
(def Flag (r/adapt-react-class (get-obj "Flag")))

;; Header
(def jsHeader (get-obj "Header"))
(def Header (r/adapt-react-class jsHeader))
(def HeaderContent (r/adapt-react-class (get-obj "Content" jsHeader)))
(def HeaderSubheader (r/adapt-react-class (get-obj "Subheader" jsHeader)))

;; Icon
(def jsIcon (get-obj "Icon"))
(def Icon (r/adapt-react-class jsIcon))
(def IconGroup (r/adapt-react-class (get-obj "Group" jsIcon)))

;; Image
(def jsImage (get-obj "Image"))
(def Image (r/adapt-react-class jsImage))
(def ImageGroup (r/adapt-react-class (get-obj "Group" jsImage)))

;; Input
(def Input (r/adapt-react-class (get-obj "Input")))

;; Label
(def jsLabel (get-obj "Label"))
(def Label (r/adapt-react-class jsLabel))
(def LabelDetail (r/adapt-react-class (get-obj "Detail" jsLabel)))
(def LabelGroup (r/adapt-react-class (get-obj "Group" jsLabel)))

;; List
(def jsList (get-obj "List"))
(def List (r/adapt-react-class jsList))
(def ListContent (r/adapt-react-class (get-obj "Content" jsList)))
(def ListHeader (r/adapt-react-class (get-obj "Header" jsList)))
(def ListIcon (r/adapt-react-class (get-obj "Icon" jsList)))
(def ListItem (r/adapt-react-class (get-obj "Item" jsList)))
(def ListList (r/adapt-react-class (get-obj "List" jsList)))

;; Loader
(def Loader (r/adapt-react-class (get-obj "Loader")))

;; Rail
(def Rail (r/adapt-react-class (get-obj "Rail")))

;; Reveal
(def jsReveal (get-obj "Reveal"))
(def Reveal (r/adapt-react-class jsReveal))
(def RevealContent (r/adapt-react-class (get-obj "Content" jsReveal)))

;; Segment
(def jsSegment (get-obj "Segment"))
(def Segment (r/adapt-react-class jsSegment))
(def SegmentGroup (r/adapt-react-class (get-obj "Group" jsSegment)))

;; Step
(def jsStep (get-obj "Step"))
(def Step (r/adapt-react-class jsStep))
(def StepContent (r/adapt-react-class (get-obj "Content" jsStep)))
(def StepDescription (r/adapt-react-class (get-obj "Description" jsStep)))
(def StepGroup (r/adapt-react-class (get-obj "Group" jsStep)))
(def StepTitle (r/adapt-react-class (get-obj "Title" jsStep)))


;;
;; Collections
;;

;; Breadcrumb
(def jsBreadcrumb (get-obj "Breadcrumb"))
(def Breadcrumb (r/adapt-react-class jsBreadcrumb))
(def BreadcrumbDivider (r/adapt-react-class (get-obj "Divider" jsBreadcrumb)))
(def BreadcrumbSection (r/adapt-react-class (get-obj "Section" jsBreadcrumb)))

;; Form
(def jsForm (get-obj "Form"))
(def Form (r/adapt-react-class jsForm))
(def FormField (r/adapt-react-class (get-obj "Field" jsForm)))
(def FormButton (r/adapt-react-class (get-obj "Button" jsForm)))
(def FormCheckbox (r/adapt-react-class (get-obj "Checkbox" jsForm)))
(def FormDropdown (r/adapt-react-class (get-obj "Dropdown" jsForm)))
(def FormGroup (r/adapt-react-class (get-obj "Group" jsForm)))
(def FormInput (r/adapt-react-class (get-obj "Input" jsForm)))
(def FormRadio (r/adapt-react-class (get-obj "Radio" jsForm)))
(def FormSelect (r/adapt-react-class (get-obj "Select" jsForm)))
(def FormTextArea (r/adapt-react-class (get-obj "TextArea" jsForm)))

;; Grid
(def jsGrid (get-obj "Grid"))
(def Grid (r/adapt-react-class jsGrid))
(def GridColumn (r/adapt-react-class (get-obj "Column" jsGrid)))
(def GridRow (r/adapt-react-class (get-obj "Row" jsGrid)))

;; Menu
(def jsMenu (get-obj "Menu"))
(def Menu (r/adapt-react-class jsMenu))
(def MenuHeader (r/adapt-react-class (get-obj "Header" jsMenu)))
(def MenuItem (r/adapt-react-class (get-obj "Item" jsMenu)))
(def MenuMenu (r/adapt-react-class (get-obj "Menu" jsMenu)))

;; Message
(def jsMessage (get-obj "Message"))
(def Message (r/adapt-react-class jsMessage))
(def MessageContent (r/adapt-react-class (get-obj "Content" jsMessage)))
(def MessageHeader (r/adapt-react-class (get-obj "Header" jsMessage)))
(def MessageList (r/adapt-react-class (get-obj "List" jsMessage)))
(def MessageItem (r/adapt-react-class (get-obj "Item" jsMessage)))

;; Table
(def jsTable (get-obj "Table"))
(def Table (r/adapt-react-class jsTable))
(def TableBody (r/adapt-react-class (get-obj "Body" jsTable)))
(def TableCell (r/adapt-react-class (get-obj "Cell" jsTable)))
(def TableFooter (r/adapt-react-class (get-obj "Footer" jsTable)))
(def TableHeader (r/adapt-react-class (get-obj "Header" jsTable)))
(def TableHeaderCell (r/adapt-react-class (get-obj "HeaderCell" jsTable)))
(def TableRow (r/adapt-react-class (get-obj "Row" jsTable)))

;;
;; Views
;;

;; Card
(def jsCard (get-obj "Card"))
(def Card (r/adapt-react-class jsCard))
(def CardContent (r/adapt-react-class (get-obj "Content" jsCard)))
(def CardDescription (r/adapt-react-class (get-obj "Description" jsCard)))
(def CardGroup (r/adapt-react-class (get-obj "Group" jsCard)))
(def CardHeader (r/adapt-react-class (get-obj "Header" jsCard)))
(def CardMeta (r/adapt-react-class (get-obj "Meta" jsCard)))

;; Comment
(def jsComment (get-obj "Comment"))
(def Comment (r/adapt-react-class jsComment))
(def CommentAuthor (r/adapt-react-class (get-obj "Author" jsComment)))
(def CommentAction (r/adapt-react-class (get-obj "Action" jsComment)))
(def CommentActions (r/adapt-react-class (get-obj "Actions" jsComment)))
(def CommentAvatar (r/adapt-react-class (get-obj "Avatar" jsComment)))
(def CommentContent (r/adapt-react-class (get-obj "Content" jsComment)))
(def CommentGroup (r/adapt-react-class (get-obj "Group" jsComment)))
(def CommentMetadata (r/adapt-react-class (get-obj "Metadata" jsComment)))
(def CommentText (r/adapt-react-class (get-obj "Text" jsComment)))

;; Feed
(def jsFeed (get-obj "Feed"))
(def Feed (r/adapt-react-class jsFeed))
(def FeedContent (r/adapt-react-class (get-obj "Content" jsFeed)))
(def FeedDate (r/adapt-react-class (get-obj "Date" jsFeed)))
(def FeedEvent (r/adapt-react-class (get-obj "Event" jsFeed)))
(def FeedExtra (r/adapt-react-class (get-obj "Extra" jsFeed)))
(def FeedLabel (r/adapt-react-class (get-obj "Label" jsFeed)))
(def FeedLike (r/adapt-react-class (get-obj "Like" jsFeed)))
(def FeedMeta (r/adapt-react-class (get-obj "Meta" jsFeed)))
(def FeedSummary (r/adapt-react-class (get-obj "Summary" jsFeed)))
(def FeedUser (r/adapt-react-class (get-obj "User" jsFeed)))

;; Item
(def jsItem (get-obj "Item"))
(def Item (r/adapt-react-class jsItem))
(def ItemContent (r/adapt-react-class (get-obj "Content" jsItem)))
(def ItemDescription (r/adapt-react-class (get-obj "Description" jsItem)))
(def ItemExtra (r/adapt-react-class (get-obj "Extra" jsItem)))
(def ItemGroup (r/adapt-react-class (get-obj "Group" jsItem)))
(def ItemHeader (r/adapt-react-class (get-obj "Header" jsItem)))
(def ItemImage (r/adapt-react-class (get-obj "Image" jsItem)))
(def ItemMeta (r/adapt-react-class (get-obj "Meta" jsItem)))

;; Statistic
(def jsStatistic (get-obj "Statistic"))
(def Statistic (r/adapt-react-class jsStatistic))
(def StatisticGroup (r/adapt-react-class (get-obj "Group" jsStatistic)))
(def StatisticLabel (r/adapt-react-class (get-obj "Label" jsStatistic)))
(def StatisticValue (r/adapt-react-class (get-obj "Value" jsStatistic)))

;;
;; Modules
;;

;; Accordion
(def jsAccordion (get-obj "Accordion"))
(def Accordion (r/adapt-react-class jsAccordion))
(def AccordionContent (r/adapt-react-class (get-obj "Content" jsAccordion)))
(def AccordionTitle (r/adapt-react-class (get-obj "Title" jsAccordion)))

;; Checkbox
(def Checkbox (r/adapt-react-class (get-obj "Checkbox")))

;; Dimmer
(def jsDimmer (get-obj "Dimmer"))
(def Dimmer (r/adapt-react-class jsDimmer))
(def DimmerDimmable (r/adapt-react-class (get-obj "Dimmable" jsDimmer)))

;; Dropdown
(def jsDropdown (get-obj "Dropdown"))
(def Dropdown (r/adapt-react-class jsDropdown))
(def DropdownDivider (r/adapt-react-class (get-obj "Divider" jsDropdown)))
(def DropdownHeader (r/adapt-react-class (get-obj "Header" jsDropdown)))
(def DropdownItem (r/adapt-react-class (get-obj "Item" jsDropdown)))
(def DropdownMenu (r/adapt-react-class (get-obj "Menu" jsDropdown)))

;; Embed
(def Embed (r/adapt-react-class (get-obj "Embed")))

;; Modal
(def jsModal (get-obj "Modal"))
(def Modal (r/adapt-react-class jsModal))
(def ModalHeader (r/adapt-react-class (get-obj "Header" jsModal)))
(def ModalContent (r/adapt-react-class (get-obj "Content" jsModal)))
(def ModalDescription (r/adapt-react-class (get-obj "Description" jsModal)))
(def ModalActions (r/adapt-react-class (get-obj "Actions" jsModal)))

;; Popup
(def jsPopup (get-obj "Popup"))
(def Popup (r/adapt-react-class jsPopup))
(def PopupContent (r/adapt-react-class (get-obj "Content" jsPopup)))
(def PopupHeader (r/adapt-react-class (get-obj "Header" jsPopup)))

;; Progress
(def Progress (r/adapt-react-class (get-obj "Progress")))

;; Rating
(def jsRating (get-obj "Rating"))
(def Rating (r/adapt-react-class jsRating))
(def RatingIcon (r/adapt-react-class (get-obj "Icon" jsRating)))

;; Search
(def jsSearch (get-obj "Search"))
(def Search (r/adapt-react-class jsSearch))
(def SearchCategory (r/adapt-react-class (get-obj "Category" jsSearch)))
(def SearchResult (r/adapt-react-class (get-obj "Result" jsSearch)))
(def SearchResults (r/adapt-react-class (get-obj "Results" jsSearch)))

;; Sidebar
(def jsSidebar (get-obj "Sidebar"))
(def Sidebar (r/adapt-react-class jsSidebar))
(def SidebarPushable (r/adapt-react-class (get-obj "Pushable" jsSidebar)))
(def SidebarPusher (r/adapt-react-class (get-obj "Pusher" jsSidebar)))


;;
;; Addons
;;

;; Confirm
(def Confirm (r/adapt-react-class (get-obj "Confirm")))

;; Portal
(def Portal (r/adapt-react-class (get-obj "Portal")))

;; Radio
(def Radio (r/adapt-react-class (get-obj "Radio")))

;; Select
(def Select (r/adapt-react-class (get-obj "Select")))

;; TextArea
(def TextArea (r/adapt-react-class (get-obj "TextArea")))
