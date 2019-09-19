(ns semantic-reagent.core
  (:refer-clojure :exclude [List])
  (:require [cljsjs.semantic-ui-react]
            [goog.object :as go]
            [reagent.core :as r]))

;; See also: http://react.semantic-ui.com

(def semantic-ui js/semanticUIReact)

(defn- get-obj [k]
  (go/get semantic-ui k))

(defn- adapt [obj]
  (r/adapt-react-class obj))

;;
;; JavaScript objects
;; A example usage is `as` props
;;

(def jsConfirm (get-obj "Confirm"))
(def jsMountNode (get-obj "MountNode"))
(def jsPagination (get-obj "Pagination"))
(def jsPaginationItem (get-obj "PaginationItem"))
(def jsPortal (get-obj "Portal"))
(def jsPortalInner (get-obj "PortalInner"))
(def jsRadio (get-obj "Radio"))
(def jsResponsive (get-obj "Responsive"))
(def jsSelect (get-obj "Select"))
(def jsTextArea (get-obj "TextArea"))
(def jsTransitionablePortal (get-obj "TransitionablePortal"))
(def jsVisibility (get-obj "Visibility"))
(def jsBreadcrumb (get-obj "Breadcrumb"))
(def jsBreadcrumbDivider (get-obj "BreadcrumbDivider"))
(def jsBreadcrumbSection (get-obj "BreadcrumbSection"))
(def jsForm (get-obj "Form"))
(def jsFormButton (get-obj "FormButton"))
(def jsFormCheckbox (get-obj "FormCheckbox"))
(def jsFormDropdown (get-obj "FormDropdown"))
(def jsFormField (get-obj "FormField"))
(def jsFormGroup (get-obj "FormGroup"))
(def jsFormInput (get-obj "FormInput"))
(def jsFormRadio (get-obj "FormRadio"))
(def jsFormSelect (get-obj "FormSelect"))
(def jsFormTextArea (get-obj "FormTextArea"))
(def jsGrid (get-obj "Grid"))
(def jsGridColumn (get-obj "GridColumn"))
(def jsGridRow (get-obj "GridRow"))
(def jsMenu (get-obj "Menu"))
(def jsMenuHeader (get-obj "MenuHeader"))
(def jsMenuItem (get-obj "MenuItem"))
(def jsMenuMenu (get-obj "MenuMenu"))
(def jsMessage (get-obj "Message"))
(def jsMessageContent (get-obj "MessageContent"))
(def jsMessageHeader (get-obj "MessageHeader"))
(def jsMessageItem (get-obj "MessageItem"))
(def jsMessageList (get-obj "MessageList"))
(def jsTable (get-obj "Table"))
(def jsTableBody (get-obj "TableBody"))
(def jsTableCell (get-obj "TableCell"))
(def jsTableFooter (get-obj "TableFooter"))
(def jsTableHeader (get-obj "TableHeader"))
(def jsTableHeaderCell (get-obj "TableHeaderCell"))
(def jsTableRow (get-obj "TableRow"))
(def jsButton (get-obj "Button"))
(def jsButtonContent (get-obj "ButtonContent"))
(def jsButtonGroup (get-obj "ButtonGroup"))
(def jsButtonOr (get-obj "ButtonOr"))
(def jsContainer (get-obj "Container"))
(def jsDivider (get-obj "Divider"))
(def jsFlag (get-obj "Flag"))
(def jsHeader (get-obj "Header"))
(def jsHeaderContent (get-obj "HeaderContent"))
(def jsHeaderSubheader (get-obj "HeaderSubheader"))
(def jsIcon (get-obj "Icon"))
(def jsIconGroup (get-obj "IconGroup"))
(def jsImage (get-obj "Image"))
(def jsImageGroup (get-obj "ImageGroup"))
(def jsInput (get-obj "Input"))
(def jsLabel (get-obj "Label"))
(def jsLabelDetail (get-obj "LabelDetail"))
(def jsLabelGroup (get-obj "LabelGroup"))
(def jsList (get-obj "List"))
(def jsListContent (get-obj "ListContent"))
(def jsListDescription (get-obj "ListDescription"))
(def jsListHeader (get-obj "ListHeader"))
(def jsListIcon (get-obj "ListIcon"))
(def jsListItem (get-obj "ListItem"))
(def jsListList (get-obj "ListList"))
(def jsLoader (get-obj "Loader"))
(def jsPlaceholder (get-obj "Placeholder"))
(def jsPlaceholderHeader (get-obj "PlaceholderHeader"))
(def jsPlaceholderImage (get-obj "PlaceholderImage"))
(def jsPlaceholderLine (get-obj "PlaceholderLine"))
(def jsPlaceholderParagraph (get-obj "PlaceholderParagraph"))
(def jsRail (get-obj "Rail"))
(def jsReveal (get-obj "Reveal"))
(def jsRevealContent (get-obj "RevealContent"))
(def jsSegment (get-obj "Segment"))
(def jsSegmentGroup (get-obj "SegmentGroup"))
(def jsSegmentInline (get-obj "SegmentInline"))
(def jsStep (get-obj "Step"))
(def jsStepContent (get-obj "StepContent"))
(def jsStepDescription (get-obj "StepDescription"))
(def jsStepGroup (get-obj "StepGroup"))
(def jsStepTitle (get-obj "StepTitle"))
(def jsAccordion (get-obj "Accordion"))
(def jsAccordionAccordion (get-obj "AccordionAccordion"))
(def jsAccordionContent (get-obj "AccordionContent"))
(def jsAccordionPanel (get-obj "AccordionPanel"))
(def jsAccordionTitle (get-obj "AccordionTitle"))
(def jsCheckbox (get-obj "Checkbox"))
(def jsDimmer (get-obj "Dimmer"))
(def jsDimmerDimmable (get-obj "DimmerDimmable"))
(def jsDimmerInner (get-obj "DimmerInner"))
(def jsDropdown (get-obj "Dropdown"))
(def jsDropdownDivider (get-obj "DropdownDivider"))
(def jsDropdownHeader (get-obj "DropdownHeader"))
(def jsDropdownItem (get-obj "DropdownItem"))
(def jsDropdownMenu (get-obj "DropdownMenu"))
(def jsDropdownSearchInput (get-obj "DropdownSearchInput"))
(def jsEmbed (get-obj "Embed"))
(def jsModal (get-obj "Modal"))
(def jsModalActions (get-obj "ModalActions"))
(def jsModalContent (get-obj "ModalContent"))
(def jsModalDescription (get-obj "ModalDescription"))
(def jsModalHeader (get-obj "ModalHeader"))
(def jsPopup (get-obj "Popup"))
(def jsPopupContent (get-obj "PopupContent"))
(def jsPopupHeader (get-obj "PopupHeader"))
(def jsProgress (get-obj "Progress"))
(def jsRating (get-obj "Rating"))
(def jsRatingIcon (get-obj "RatingIcon"))
(def jsSearch (get-obj "Search"))
(def jsSearchCategory (get-obj "SearchCategory"))
(def jsSearchResult (get-obj "SearchResult"))
(def jsSearchResults (get-obj "SearchResults"))
(def jsSidebar (get-obj "Sidebar"))
(def jsSidebarPushable (get-obj "SidebarPushable"))
(def jsSidebarPusher (get-obj "SidebarPusher"))
(def jsSticky (get-obj "Sticky"))
(def jsTab (get-obj "Tab"))
(def jsTabPane (get-obj "TabPane"))
(def jsTransition (get-obj "Transition"))
(def jsTransitionGroup (get-obj "TransitionGroup"))
(def jsAdvertisement (get-obj "Advertisement"))
(def jsCard (get-obj "Card"))
(def jsCardContent (get-obj "CardContent"))
(def jsCardDescription (get-obj "CardDescription"))
(def jsCardGroup (get-obj "CardGroup"))
(def jsCardHeader (get-obj "CardHeader"))
(def jsCardMeta (get-obj "CardMeta"))
(def jsComment (get-obj "Comment"))
(def jsCommentAction (get-obj "CommentAction"))
(def jsCommentActions (get-obj "CommentActions"))
(def jsCommentAuthor (get-obj "CommentAuthor"))
(def jsCommentAvatar (get-obj "CommentAvatar"))
(def jsCommentContent (get-obj "CommentContent"))
(def jsCommentGroup (get-obj "CommentGroup"))
(def jsCommentMetadata (get-obj "CommentMetadata"))
(def jsCommentText (get-obj "CommentText"))
(def jsFeed (get-obj "Feed"))
(def jsFeedContent (get-obj "FeedContent"))
(def jsFeedDate (get-obj "FeedDate"))
(def jsFeedEvent (get-obj "FeedEvent"))
(def jsFeedExtra (get-obj "FeedExtra"))
(def jsFeedLabel (get-obj "FeedLabel"))
(def jsFeedLike (get-obj "FeedLike"))
(def jsFeedMeta (get-obj "FeedMeta"))
(def jsFeedSummary (get-obj "FeedSummary"))
(def jsFeedUser (get-obj "FeedUser"))
(def jsItem (get-obj "Item"))
(def jsItemContent (get-obj "ItemContent"))
(def jsItemDescription (get-obj "ItemDescription"))
(def jsItemExtra (get-obj "ItemExtra"))
(def jsItemGroup (get-obj "ItemGroup"))
(def jsItemHeader (get-obj "ItemHeader"))
(def jsItemImage (get-obj "ItemImage"))
(def jsItemMeta (get-obj "ItemMeta"))
(def jsStatistic (get-obj "Statistic"))
(def jsStatisticGroup (get-obj "StatisticGroup"))
(def jsStatisticLabel (get-obj "StatisticLabel"))
(def jsStatisticValue (get-obj "StatisticValue"))

;;
;; Reagent components that area sorted same as index.js of Semantic-UI-React.
;;

(def Confirm (adapt jsConfirm))
(def MountNode (adapt jsMountNode))
(def Pagination (adapt jsPagination))
(def PaginationItem (adapt jsPaginationItem))
(def Portal (adapt jsPortal))
(def PortalInner (adapt jsPortalInner))
(def Radio (adapt jsRadio))
(def Responsive (adapt jsResponsive))
(def Select (adapt jsSelect))
(def TextArea (adapt jsTextArea))
(def TransitionablePortal (adapt jsTransitionablePortal))

(def Visibility (adapt jsVisibility))

(def Breadcrumb (adapt jsBreadcrumb))
(def BreadcrumbDivider (adapt jsBreadcrumbDivider))
(def BreadcrumbSection (adapt jsBreadcrumbSection))

(def Form (adapt jsForm))
(def FormButton (adapt jsFormButton))
(def FormCheckbox (adapt jsFormCheckbox))
(def FormDropdown (adapt jsFormDropdown))
(def FormField (adapt jsFormField))
(def FormGroup (adapt jsFormGroup))
(def FormInput (adapt jsFormInput))
(def FormRadio (adapt jsFormRadio))
(def FormSelect (adapt jsFormSelect))
(def FormTextArea (adapt jsFormTextArea))

(def Grid (adapt jsGrid))
(def GridColumn (adapt jsGridColumn))
(def GridRow (adapt jsGridRow))

(def Menu (adapt jsMenu))
(def MenuHeader (adapt jsMenuHeader))
(def MenuItem (adapt jsMenuItem))
(def MenuMenu (adapt jsMenuMenu))

(def Message (adapt jsMessage))
(def MessageContent (adapt jsMessageContent))
(def MessageHeader (adapt jsMessageHeader))
(def MessageItem (adapt jsMessageItem))
(def MessageList (adapt jsMessageList))

(def Table (adapt jsTable))
(def TableBody (adapt jsTableBody))
(def TableCell (adapt jsTableCell))
(def TableFooter (adapt jsTableFooter))
(def TableHeader (adapt jsTableHeader))
(def TableHeaderCell (adapt jsTableHeaderCell))
(def TableRow (adapt jsTableRow))

(def Button (adapt jsButton))
(def ButtonContent (adapt jsButtonContent))
(def ButtonGroup (adapt jsButtonGroup))
(def ButtonOr (adapt jsButtonOr))

(def Container (adapt jsContainer))

(def Divider (adapt jsDivider))

(def Flag (adapt jsFlag))

(def Header (adapt jsHeader))
(def HeaderContent (adapt jsHeaderContent))
(def HeaderSubheader (adapt jsHeaderSubheader))

(def Icon (adapt jsIcon))
(def IconGroup (adapt jsIconGroup))

(def Image (adapt jsImage))
(def ImageGroup (adapt jsImageGroup))

(def Input (adapt jsInput))

(def Label (adapt jsLabel))
(def LabelDetail (adapt jsLabelDetail))
(def LabelGroup (adapt jsLabelGroup))

(def List (adapt jsList))
(def ListContent (adapt jsListContent))
(def ListDescription (adapt jsListDescription))
(def ListHeader (adapt jsListHeader))
(def ListIcon (adapt jsListIcon))
(def ListItem (adapt jsListItem))
(def ListList (adapt jsListList))

(def Loader (adapt jsLoader))

(def Placeholder (adapt jsPlaceholder))
(def PlaceholderHeader (adapt jsPlaceholderHeader))
(def PlaceholderImage (adapt jsPlaceholderImage))
(def PlaceholderLine (adapt jsPlaceholderLine))
(def PlaceholderParagraph (adapt jsPlaceholderParagraph))

(def Rail (adapt jsRail))

(def Reveal (adapt jsReveal))
(def RevealContent (adapt jsRevealContent))

(def Segment (adapt jsSegment))
(def SegmentGroup (adapt jsSegmentGroup))
(def SegmentInline (adapt jsSegmentInline))

(def Step (adapt jsStep))
(def StepContent (adapt jsStepContent))
(def StepDescription (adapt jsStepDescription))
(def StepGroup (adapt jsStepGroup))
(def StepTitle (adapt jsStepTitle))

(def Accordion (adapt jsAccordion))
(def AccordionAccordion (adapt jsAccordionAccordion))
(def AccordionContent (adapt jsAccordionContent))
(def AccordionPanel (adapt jsAccordionPanel))
(def AccordionTitle (adapt jsAccordionTitle))

(def Checkbox (adapt jsCheckbox))

(def Dimmer (adapt jsDimmer))
(def DimmerDimmable (adapt jsDimmerDimmable))
(def DimmerInner (adapt jsDimmerInner))

(def Dropdown (adapt jsDropdown))
(def DropdownDivider (adapt jsDropdownDivider))
(def DropdownHeader (adapt jsDropdownHeader))
(def DropdownItem (adapt jsDropdownItem))
(def DropdownMenu (adapt jsDropdownMenu))
(def DropdownSearchInput (adapt jsDropdownSearchInput))

(def Embed (adapt jsEmbed))

(def Modal (adapt jsModal))
(def ModalActions (adapt jsModalActions))
(def ModalContent (adapt jsModalContent))
(def ModalDescription (adapt jsModalDescription))
(def ModalHeader (adapt jsModalHeader))

(def Popup (adapt jsPopup))
(def PopupContent (adapt jsPopupContent))
(def PopupHeader (adapt jsPopupHeader))

(def Progress (adapt jsProgress))

(def Rating (adapt jsRating))
(def RatingIcon (adapt jsRatingIcon))

(def Search (adapt jsSearch))
(def SearchCategory (adapt jsSearchCategory))
(def SearchResult (adapt jsSearchResult))
(def SearchResults (adapt jsSearchResults))

(def Sidebar (adapt jsSidebar))
(def SidebarPushable (adapt jsSidebarPushable))
(def SidebarPusher (adapt jsSidebarPusher))

(def Sticky (adapt jsSticky))

(def Tab (adapt jsTab))
(def TabPane (adapt jsTabPane))

(def Transition (adapt jsTransition))
(def TransitionGroup (adapt jsTransitionGroup))

(def Advertisement (adapt jsAdvertisement))

(def Card (adapt jsCard))
(def CardContent (adapt jsCardContent))
(def CardDescription (adapt jsCardDescription))
(def CardGroup (adapt jsCardGroup))
(def CardHeader (adapt jsCardHeader))
(def CardMeta (adapt jsCardMeta))

(def Comment (adapt jsComment))
(def CommentAction (adapt jsCommentAction))
(def CommentActions (adapt jsCommentActions))
(def CommentAuthor (adapt jsCommentAuthor))
(def CommentAvatar (adapt jsCommentAvatar))
(def CommentContent (adapt jsCommentContent))
(def CommentGroup (adapt jsCommentGroup))
(def CommentMetadata (adapt jsCommentMetadata))
(def CommentText (adapt jsCommentText))

(def Feed (adapt jsFeed))
(def FeedContent (adapt jsFeedContent))
(def FeedDate (adapt jsFeedDate))
(def FeedEvent (adapt jsFeedEvent))
(def FeedExtra (adapt jsFeedExtra))
(def FeedLabel (adapt jsFeedLabel))
(def FeedLike (adapt jsFeedLike))
(def FeedMeta (adapt jsFeedMeta))
(def FeedSummary (adapt jsFeedSummary))
(def FeedUser (adapt jsFeedUser))

(def Item (adapt jsItem))
(def ItemContent (adapt jsItemContent))
(def ItemDescription (adapt jsItemDescription))
(def ItemExtra (adapt jsItemExtra))
(def ItemGroup (adapt jsItemGroup))
(def ItemHeader (adapt jsItemHeader))
(def ItemImage (adapt jsItemImage))
(def ItemMeta (adapt jsItemMeta))

(def Statistic (adapt jsStatistic))
(def StatisticGroup (adapt jsStatisticGroup))
(def StatisticLabel (adapt jsStatisticLabel))
(def StatisticValue (adapt jsStatisticValue))
