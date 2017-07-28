(ns my-clojure-project-notes.if-else-control-flow)

; What this episode will cover:
;  * Basic control flow operators in Clojure: if, do, when

; ----------------------------------------------------------------------

; "If" statements are generally universal among programming languages
; They allow us to decifer between making decisions within code.
; We make daily decisions all of the time...

; If it's raining outside, I'll grab an umbrella.
; If it isn't, I shouldn't grab my umbrella.

; What does this look like in Clojure?

(defn decide-accessory [weather]
  (if (= weather "rain")
  "grab your umbrella"
  "don't grab your umbrella"))

(decide-accessory "rain")
