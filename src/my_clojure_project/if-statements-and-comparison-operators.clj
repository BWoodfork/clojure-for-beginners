(ns my-clojure-project.if-statements-and-comparison-operators)

; What this episode will cover:
;  * Precursor: Intro to Clojure syntax
;  * Learning how to use the if statement in Clojure for flowcontrol
;  * Basic comparison operators: =, >, <, =<

; ----------------------------------------------------------------------

;             ~~~~ A precursor to this episode ~~~~~

; * Let's talk about Clojure syntax.

; What do the parenthesis do? How do I use them? OMG!!
; * Wrapping a function in parenthesis is how you call (or execute) a function

; Because the function name comes first,
; arithmetic can be a little confusing at first.
; * Hint: All you have to do is move the operator to the left =)

; ----------------------------------------------------------------------

; "If" statements are generally universal among programming languages.

; They differ a bit in some languages, but they're the building blocks of
; software development.

; If it's below 70 degrees outside
; Grab a jacket
; Otherwise, leave your jacket at home

; What does this look like in Clojure?

; let's create a "temperature" binding to make this easier to reason about
; if temperature is less than 70, "Grab your jacket". If not, leave it.


; What if we only want to grab a jacket when it's exactly 70 degrees?
; Hint: We can use the 'equal to' operator!






; ----------------------------------------------------------------------


(let [temperature 70]
  (if (= temperature 70)
  "Grab your jacket"
  "Leave your jacket at home"))

; What if we only want to grab a jacket when it's less than or equal to 70?
; Hint: We can use the 'less than or equal to' operator!

(let [temperature 70]
  (if (<= temperature 70)
  "Grab your jacket"
  "Leave your jacket at home"))

; What if we don't want to return anything if temperature is above 70?
; Hint: Don't specify an alternative to what's true
(let [temperature 80]
  (if (< temperature 70)
  "Grab your jacket"))

; Let's turn this into a function, so that we don't have to keep reusing
; the same code example. If you don't know what a function is, totally fine.
; We will cover functions in the next episode!
