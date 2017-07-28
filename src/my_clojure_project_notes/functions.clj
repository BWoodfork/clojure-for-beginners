(ns my-clojure-project-notes.functions)

; What this episode will cover:
;  * What are functions?
;  * How to call functions
;  * How to define our own functions
;  * How to use some of Clojure's functions

; ----------------------------------------------------------------------

; What are functions?
; - Code that executes one or mulitple actions

; How to call functions
; Wrap the function name & its parameters in parenthesis
(println "Yo dawg, I heard you like functions")

; Some pre-existing functions in Clojure
(count [1 2 3 4])
(first [1 2 3 4])
(last [1 2 3 4])
(rest [1 2 3 4])

; Defining a function in Clojure

; Functions are composed of the following:
; * defn
; * name
; * arguments (optional)
; * doc string (optional)
; * function body

(defn add-one-plus-one []
  "I am a function that returns the sum of 1 + 1"
  (+ 1 1))
  (add-one-plus-one)

; Functions can take arguments
(defn add-two-numbers-with-args [num1 num2]
  (+ num1 num2))
  (add-two-numbers-with-args 200 300)

; Functions can take optional arguments
(defn add-numbers [& args]
  (apply + args))

(add-numbers 1)
(add-numbers 1 2)
(add-numbers 1 2 3)

; Functions have arity overloading
; This means that you can define a function
; so a different function body will run depending on the arity.
(defn add-more-numbers
  ([first-arg second-arg third-arg]
    (+ first-arg second-arg third-arg))
    ([first-arg second-arg]
      (+ first-arg second-arg))
      ([first-arg]
        (+ first-arg)))

(add-more-numbers 1)
(add-more-numbers 1 2)
(add-more-numbers 1 2 3)
