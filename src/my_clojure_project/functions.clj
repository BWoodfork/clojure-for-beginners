(ns my-clojure-project.functions)

; What this video will cover:
; * What are functions?
; * How to use functions

; ----------------------------------------------------------------------

; An Example Function
(defn add-two-numbers []
  "I am a function that adds two numbers"
  (+ 1 1))

; Functions can take arguments
(defn add-two-numbers-with-args [num1 num2]
  (+ num1 num2))

; Some built in functions
(count [1 2 3 4])
(first [1 2 3 4])
(last [1 2 3 4])
(rest [1 2 3 4])

; Functions can take optional arguments
