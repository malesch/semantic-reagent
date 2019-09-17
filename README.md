# semantic-reagent

A Clojure library for using [Semantic UI React](http://react.semantic-ui.com) with [Reagent](http://reagent-project.github.io/).

[![Clojars Project](https://img.shields.io/clojars/v/malesch/semantic-reagent.svg)](https://clojars.org/malesch/semantic-reagent)
[![cljdoc badge](https://cljdoc.org/badge/malesch/semantic-reagent)](https://cljdoc.org/d/malesch/semantic-reagent/CURRENT)


## Usage

```clojure
(:require '[reagent.core :as r]
          '[semantic-reagent :as sui])

(defn- sidebar []
  (let [visible (r/atom false)
        on-click (fn [] (reset! visible (not @visible)))]
    (fn []
      [:div
       [sui/Button {:on-click on-click} "Toggle"]
       [sui/SidebarPushable {:as sui/jsSegment}
        [sui/Sidebar {:as sui/jsMenu
                      :animation "push"
                      :icon "labeled"
                      :inverted true
                      :visible @visible
                      :vertical true
                      :width "thin"}
         [sui/MenuItem {:as "a"}
          [sui/Icon {:name "home"}]
          "HOME"]
         [sui/MenuItem {:as "a"}
          [sui/Icon {:name "gamepad"}]
          "Games"]]
        [sui/SidebarPusher
         [sui/Segment {:basic true}
          [sui/Header {:as "h3"} "Content"]
          [sui/Image {:src "https://react.semantic-ui.com/images/wireframe/paragraph.png"}]]]]])))

(defn- main-component []
  [:<>
   [sui/Container
    [sidebar]]])

(defn main []
  (r/render [main-component] (.getElementById js/document "app")))
```

More usage examples of the UI components can be found in the Devcards when starting up in dev mode.
For building [Leiningen](https://leiningen.org) is required.

The dev mode is started with

```
$ lein repl
user=> (fig-start)
[Figwheel] Compiling build dev to "target/public/js/main.js"
[Figwheel] Successfully compiled build dev to "target/public/js/main.js" in 0.636 seconds.
[Figwheel] Watching paths: ("src" "dev") to compile build - dev
[Figwheel] Starting Server at http://localhost:9500
Opening URL http://localhost:9500
nil
user=>
```

then opening http://localhost:9500/ automatically.

## License

Copyright © 2017 Marcus Spiegel

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
