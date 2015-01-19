(ns alexa-to-aurora.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [cljs.core.async :refer [<! chan put!]]
            [cljs-http.client :as http]
            [alexa-to-aurora.styles :as sty]
            )
  )

(enable-console-print!)

(def app-state
  (atom {}))

(defn dump[x] (.log js/console x))

(defn get-data
  []
  (go
   (let [response (<! (http/get "/data"))
         status (:status response)]
     (condp status
       200 (js->clj (:body response))))))

(defn post-data [app]
  (go
   (let [response (<! (http/post "/run" {:edn-params app}))
         status (:status response)]
     (condp status
       200 (js->clj (:body response))))))


(defn handle-change [app edit-key e]
  (om/transact! app edit-key (fn [_] (.. e -target -value)))
  )

(defn prompt-text[app [p v]]
  (dom/tr #js{:style (sty/survey-item)}
          (dom/td (sty/prompt) (name p))
          (dom/td nil (dom/input (sty/merge-js
                                  (sty/text-field p v)
                                  #js{:onChange #(handle-change app p %)})))
          ))

(defn controls-view[app owner]
  (reify
    om/IWillMount
    (will-mount [_]
                (go(let [state (<!(get-data))]
                     (om/update! app state))))
    om/IRender
    (render [_]
            (dom/div #js {:id "controls"}
                     (dom/h1 #js{:style #js{:font-family "Tahoma" :color "SteelBlue"}}
                             "Copy Alexa SQL DB to Aurora Datomic DB")
                     (dom/h2 #js{:style #js{:font-family "Tahoma" :color "SteelBlue"}}
                             "Parameters")

                     (apply dom/table nil (map (partial prompt-text app) app))

                     (dom/button
                      #js {:style #js{:color "Red" :width "85"
                           :margin "20px 0px 0px 0px"}
                           :onClick #(post-data @app)}
                      "Run"))
            )))

(om/root controls-view app-state
 {:target (. js/document (getElementById "controls"))})

