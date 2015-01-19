(ns alexa-to-aurora.styles

  )

(defn merge-js
  [s1 s2]
  (clj->js (merge (js->clj s1) (js->clj s2))))

(defn prompt
  []
  #js {
       :font-family "Tahoma"
       :position "relative"
       :border "0px"
       :margin "0px 0px 1px 0px"
       :padding "2px"
       :text-align "left"
       :-webkit-border-radius "8px"
       :-moz-border-radius "8px"
       :border-radius "8px"
       :background "#e4e4e4"
       :cursor "pointer"
       :color: "#333"
       })

(defn text-field[n v]
  #js {:style #js {:width "300"}
       :type "text"
       :name n
       :value v
       })

(defn list-item
  []
  #js {
       :position "relative"
       :border "0px"
       :margin "0px 0px 1px 0px"
       :padding "2px"
       :text-align "left"
       :-webkit-border-radius "8px"
       :-moz-border-radius "8px"
       :border-radius "8px"
       :background "#e4e4e4"
       :cursor "pointer"
       :color: "#333"
       })

(defn list-item-button
  []
  #js {
       :font-size "1em"
       :color "#333"
       :border "none"
       :width "1.5em"
       :height "1.5em"
       :background "#c0c0c0"
       :-webkit-border-radius "6px"
       :-moz-border-radius "6px"
       :border-radius "6px"
       :padding "0px"
       :line-height "1.1em"
       })

(defn survey-section
  []
  #js {
       :position "relative"
       :height "auto"
       :border "0px"
       :padding "4px"
       :margin "0px 0px 5px 0px"
       :text-align "left"
       :-webkit-border-radius "8px"
       :-moz-border-radius "8px"
       :border-radius "8px"
       :background "#e4e4e4"
       :font-size "small"
       })

(defn sub-header
  []
  #js {
       :margin "12px 0px 5px 0px"
       :padding "2px"
       :-webkit-border-radius "8px"
       :-moz-border-radius "8px"
       :border-radius "8px"
       :background "#d4d4d4"
       :color "#333"
       })

(defn section-selector
  []
  #js {
       :width "100%"
       })


(defn sub-header-button
  []
  #js {
       :float "right"
       :background "#fff"
       :font-family "Trebuchet MS, Verdana, Sans-Serif"
       :width "auto"
       :height: "28px"
       :margin "0px 4px 0px 2px"
       :font-size "small"
       :font-weight "normal"
       :color "#444"
       :-webkit-border-radius "8px"
       :-moz-border-radius "8px"
       :border-radius "8px"
       :border "2px solid #d4d4d4"
       })

(defn button-container
  []
  #js {
       :float "right"
       :margin "10px 10px 10px 10px"
       })

(defn survey-item
  []
  #js {
       :border "0px"
       :padding "10px"
       :margin "0px 0px 10px 0px"
       :text-align "left"
       :background "#dadada"
       :-webkit-border-radius "8px"
       :-moz-border-radius "8px"
       :border-radius "8px"
       })

(defn survey-item-label-container
  []
  #js {
    :float "left"
})

(defn help-button
  []
  #js {
    :font-size "larger"
    :font-weight "bold"
    :color "#fff"
    :border "2px solid #999"
    :width "28px"
    :height "28px"
    :margin "2px 2px 2px -16px"
    :background "#999"
    :-webkit-border-radius "8px"
    :-moz-border-radius "8px"
    :border-radius "8px"
})

(defn warning-button
  []
  #js {
    :font-size "larger"
    :font-weight "bold"
    :color "#fff"
    :border "2px solid #f00"
    :width "28px"
    :height "28px"
    :margin "2px 2px 2px -16px"
    :background "#f00"
    :-webkit-border-radius "8px"
    :-moz-border-radius "8px"
    :border-radius "8px"
})
