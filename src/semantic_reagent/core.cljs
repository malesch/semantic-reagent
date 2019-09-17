(ns semantic-reagent.core
  (:refer-clojure :exclude [List])
  (:require [reagent.core :as r]
            [cljsjs.semantic-ui-react]))

;; See also: http://react.semantic-ui.com

(def semantic-ui js/semanticUIReact)

;;
;; Elements
;;

;; Button
(def jsButton (.-Button semantic-ui))
(def Button (r/adapt-react-class jsButton))
(def ButtonContent (r/adapt-react-class (.-Content jsButton)))
(def ButtonGroup (r/adapt-react-class (.-Group jsButton)))
(def ButtonOr (r/adapt-react-class (.-Or jsButton)))

;; Container
(def Container (r/adapt-react-class (.-Container semantic-ui)))

;; Divider
(def Divider (r/adapt-react-class (.-Divider semantic-ui)))

;; Flag
(def Flag (r/adapt-react-class (.-Flag semantic-ui)))

;; Header
(def jsHeader (.-Header semantic-ui))
(def Header (r/adapt-react-class jsHeader))
(def HeaderContent (r/adapt-react-class (.-Content jsHeader)))
(def HeaderSubheader (r/adapt-react-class (.-Subheader jsHeader)))

;; Icon
(def jsIcon (.-Icon semantic-ui))
(def Icon (r/adapt-react-class jsIcon))
(def IconGroup (r/adapt-react-class (.-Group jsIcon)))

;; Image
(def jsImage (.-Image semantic-ui))
(def Image (r/adapt-react-class jsImage))
(def ImageGroup (r/adapt-react-class (.-Group jsImage)))

;; Input
(def Input (r/adapt-react-class (.-Input semantic-ui)))

;; Label
(def jsLabel (.-Label semantic-ui))
(def Label (r/adapt-react-class jsLabel))
(def LabelDetail (r/adapt-react-class (.-Detail jsLabel)))
(def LabelGroup (r/adapt-react-class (.-Group jsLabel)))

;; List
(def jsList (.-List semantic-ui))
(def List (r/adapt-react-class jsList))
(def ListContent (r/adapt-react-class (.-Content jsList)))
(def ListHeader (r/adapt-react-class (.-Header jsList)))
(def ListIcon (r/adapt-react-class (.-Icon jsList)))
(def ListItem (r/adapt-react-class (.-Item jsList)))
(def ListList (r/adapt-react-class (.-List jsList)))

;; Loader
(def Loader (r/adapt-react-class (.-Loader semantic-ui)))

;; Rail
(def Rail (r/adapt-react-class (.-Rail semantic-ui)))

;; Reveal
(def jsReveal (.-Reveal semantic-ui))
(def Reveal (r/adapt-react-class jsReveal))
(def RevealContent (r/adapt-react-class (.-Content jsReveal)))

;; Segment
(def jsSegment (.-Segment semantic-ui))
(def Segment (r/adapt-react-class jsSegment))
(def SegmentGroup (r/adapt-react-class (.-Group jsSegment)))

;; Step
(def jsStep (.-Step semantic-ui))
(def Step (r/adapt-react-class jsStep))
(def StepContent (r/adapt-react-class (.-Content jsStep)))
(def StepDescription (r/adapt-react-class (.-Description jsStep)))
(def StepGroup (r/adapt-react-class (.-Group jsStep)))
(def StepTitle (r/adapt-react-class (.-Title jsStep)))


;;
;; Collections
;;

;; Breadcrumb
(def jsBreadcrumb (.-Breadcrumb semantic-ui))
(def Breadcrumb (r/adapt-react-class jsBreadcrumb))
(def BreadcrumbDivider (r/adapt-react-class (.-Divider jsBreadcrumb)))
(def BreadcrumbSection (r/adapt-react-class (.-Section jsBreadcrumb)))

;; Form
(def jsForm (.-Form semantic-ui))
(def Form (r/adapt-react-class jsForm))
(def FormField (r/adapt-react-class (.-Field jsForm)))
(def FormButton (r/adapt-react-class (.-Button jsForm)))
(def FormCheckbox (r/adapt-react-class (.-Checkbox jsForm)))
(def FormDropdown (r/adapt-react-class (.-Dropdown jsForm)))
(def FormGroup (r/adapt-react-class (.-Group jsForm)))
(def FormInput (r/adapt-react-class (.-Input jsForm)))
(def FormRadio (r/adapt-react-class (.-Radio jsForm)))
(def FormSelect (r/adapt-react-class (.-Select jsForm)))
(def FormTextArea (r/adapt-react-class (.-TextArea jsForm)))

;; Grid
(def jsGrid (.-Grid semantic-ui))
(def Grid (r/adapt-react-class jsGrid))
(def GridColumn (r/adapt-react-class (.-Column jsGrid)))
(def GridRow (r/adapt-react-class (.-Row jsGrid)))

;; Menu
(def jsMenu (.-Menu semantic-ui))
(def Menu (r/adapt-react-class jsMenu))
(def MenuHeader (r/adapt-react-class (.-Header jsMenu)))
(def MenuItem (r/adapt-react-class (.-Item jsMenu)))
(def MenuMenu (r/adapt-react-class (.-Menu jsMenu)))

;; Message
(def jsMessage (.-Message semantic-ui))
(def Message (r/adapt-react-class jsMessage))
(def MessageContent (r/adapt-react-class (.-Content jsMessage)))
(def MessageHeader (r/adapt-react-class (.-Header jsMessage)))
(def MessageList (r/adapt-react-class (.-List jsMessage)))
(def MessageItem (r/adapt-react-class (.-Item jsMessage)))

;; Table
(def jsTable (.-Table semantic-ui))
(def Table (r/adapt-react-class jsTable))
(def TableBody (r/adapt-react-class (.-Body jsTable)))
(def TableCell (r/adapt-react-class (.-Cell jsTable)))
(def TableFooter (r/adapt-react-class (.-Footer jsTable)))
(def TableHeader (r/adapt-react-class (.-Header jsTable)))
(def TableHeaderCell (r/adapt-react-class (.-HeaderCell jsTable)))
(def TableRow (r/adapt-react-class (.-Row jsTable)))

;;
;; Views
;;

;; Card
(def jsCard (.-Card semantic-ui))
(def Card (r/adapt-react-class jsCard))
(def CardContent (r/adapt-react-class (.-Content jsCard)))
(def CardDescription (r/adapt-react-class (.-Description jsCard)))
(def CardGroup (r/adapt-react-class (.-Group jsCard)))
(def CardHeader (r/adapt-react-class (.-Header jsCard)))
(def CardMeta (r/adapt-react-class (.-Meta jsCard)))

;; Comment
(def jsComment (.-Comment semantic-ui))
(def Comment (r/adapt-react-class jsComment))
(def CommentAuthor (r/adapt-react-class (.-Author jsComment)))
(def CommentAction (r/adapt-react-class (.-Action jsComment)))
(def CommentActions (r/adapt-react-class (.-Actions jsComment)))
(def CommentAvatar (r/adapt-react-class (.-Avatar jsComment)))
(def CommentContent (r/adapt-react-class (.-Content jsComment)))
(def CommentGroup (r/adapt-react-class (.-Group jsComment)))
(def CommentMetadata (r/adapt-react-class (.-Metadata jsComment)))
(def CommentText (r/adapt-react-class (.-Text jsComment)))

;; Feed
(def jsFeed (.-Feed semantic-ui))
(def Feed (r/adapt-react-class jsFeed))
(def FeedContent (r/adapt-react-class (.-Content jsFeed)))
(def FeedDate (r/adapt-react-class (.-Date jsFeed)))
(def FeedEvent (r/adapt-react-class (.-Event jsFeed)))
(def FeedExtra (r/adapt-react-class (.-Extra jsFeed)))
(def FeedLabel (r/adapt-react-class (.-Label jsFeed)))
(def FeedLike (r/adapt-react-class (.-Like jsFeed)))
(def FeedMeta (r/adapt-react-class (.-Meta jsFeed)))
(def FeedSummary (r/adapt-react-class (.-Summary jsFeed)))
(def FeedUser (r/adapt-react-class (.-User jsFeed)))

;; Item
(def jsItem (.-Item semantic-ui))
(def Item (r/adapt-react-class jsItem))
(def ItemContent (r/adapt-react-class (.-Content jsItem)))
(def ItemDescription (r/adapt-react-class (.-Description jsItem)))
(def ItemExtra (r/adapt-react-class (.-Extra jsItem)))
(def ItemGroup (r/adapt-react-class (.-Group jsItem)))
(def ItemHeader (r/adapt-react-class (.-Header jsItem)))
(def ItemImage (r/adapt-react-class (.-Image jsItem)))
(def ItemMeta (r/adapt-react-class (.-Meta jsItem)))

;; Statistic
(def jsStatistic (.-Statistic semantic-ui))
(def Statistic (r/adapt-react-class jsStatistic))
(def StatisticGroup (r/adapt-react-class (.-Group jsStatistic)))
(def StatisticLabel (r/adapt-react-class (.-Label jsStatistic)))
(def StatisticValue (r/adapt-react-class (.-Value jsStatistic)))

;;
;; Modules
;;

;; Accordion
(def jsAccordion (.-Accordion semantic-ui))
(def Accordion (r/adapt-react-class jsAccordion))
(def AccordionContent (r/adapt-react-class (.-Content jsAccordion)))
(def AccordionTitle (r/adapt-react-class (.-Title jsAccordion)))

;; Checkbox
(def Checkbox (r/adapt-react-class (.-Checkbox semantic-ui)))

;; Dimmer
(def jsDimmer (.-Dimmer semantic-ui))
(def Dimmer (r/adapt-react-class jsDimmer))
(def DimmerDimmable (r/adapt-react-class (.-Dimmable jsDimmer)))

;; Dropdown
(def jsDropdown (.-Dropdown semantic-ui))
(def Dropdown (r/adapt-react-class jsDropdown))
(def DropdownDivider (r/adapt-react-class (.-Divider jsDropdown)))
(def DropdownHeader (r/adapt-react-class (.-Header jsDropdown)))
(def DropdownItem (r/adapt-react-class (.-Item jsDropdown)))
(def DropdownMenu (r/adapt-react-class (.-Menu jsDropdown)))

;; Embed
(def Embed (r/adapt-react-class (.-Embed semantic-ui)))

;; Modal
(def jsModal (.-Modal semantic-ui))
(def Modal (r/adapt-react-class jsModal))
(def ModalHeader (r/adapt-react-class (.-Header jsModal)))
(def ModalContent (r/adapt-react-class (.-Content jsModal)))
(def ModalDescription (r/adapt-react-class (.-Description jsModal)))
(def ModalActions (r/adapt-react-class (.-Actions jsModal)))

;; Popup
(def jsPopup (.-Popup semantic-ui))
(def Popup (r/adapt-react-class jsPopup))
(def PopupContent (r/adapt-react-class (.-Content jsPopup)))
(def PopupHeader (r/adapt-react-class (.-Header jsPopup)))

;; Progress
(def Progress (r/adapt-react-class (.-Progress semantic-ui)))

;; Rating
(def jsRating (.-Rating semantic-ui))
(def Rating (r/adapt-react-class jsRating))
(def RatingIcon (r/adapt-react-class (.-Icon jsRating)))

;; Search
(def jsSearch (.-Search semantic-ui))
(def Search (r/adapt-react-class jsSearch))
(def SearchCategory (r/adapt-react-class (.-Category jsSearch)))
(def SearchResult (r/adapt-react-class (.-Result jsSearch)))
(def SearchResults (r/adapt-react-class (.-Results jsSearch)))

;; Sidebar
(def jsSidebar (.-Sidebar semantic-ui))
(def Sidebar (r/adapt-react-class jsSidebar))
(def SidebarPushable (r/adapt-react-class (.-Pushable jsSidebar)))
(def SidebarPusher (r/adapt-react-class (.-Pusher jsSidebar)))


;;
;; Addons
;;

;; Confirm
(def Confirm (r/adapt-react-class (.-Confirm semantic-ui)))

;; Portal
(def Portal (r/adapt-react-class (.-Portal semantic-ui)))

;; Radio
(def Radio (r/adapt-react-class (.-Radio semantic-ui)))

;; Select
(def Select (r/adapt-react-class (.-Select semantic-ui)))

;; TextArea
(def TextArea (r/adapt-react-class (.-TextArea semantic-ui)))
