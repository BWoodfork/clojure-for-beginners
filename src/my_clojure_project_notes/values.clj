(ns my-clojure-project-notes.values)

; What this episode will cover:
; Explaining the basic values that we use in Clojure
; * Strings
; * Booleans
; * Nil
; * Keywords
; * Numbers
;   - Basic Clojure arithmetic
;
; Values allow us to do things in programming
;
; In Clojure, String is a type of value
; Strings simply allow us to display text

; ----------------------------------------------------------------------

; Strings
"Short String"
"Strings can be as long as you would like for them to be"
"Strings can have 'single' quotes inside them"
"Strings can have \"double\" quotes inside them as well"

; Comments
; Hello, I am a comment =)
; I don't evaluate to anything
; I can be used as helper text

; Booleans
true
false

(= 1 1)
(= 2 1)

; Nil Represents 'nothing' or 'no value' in Clojure
nil

; Keywords
; Similar to strings. Normally used to label values in Clojure.
:harry
:ron
:hermione

; Normally used in maps (we'll learn about later)
{:harry "potter"
 :ron "weasley"
 :hermione "granger"}

; Numbers
; (Clojure has several different number types)
; * Integers

 0 ; Include zero
 1 ; Include positive numbers
-1 ; Include negative numbers

; * Decimals (or floats)
 100.25
 0.23425
-0.23425

; * Ratios
1/2
3/5

; Arithmetic
(+ 1 2 3)   ; Addition
(- 1 2 3)   ; Subtraction
(* 1 3)     ; Multiplication
(/ 100 50)  ; Division

(inc 1)     ; Incrementing a number
(max 1 2 3) ; Get the maximum value
(min 1 2 3) ; Get the minimum value

; Variable Assignment: "let"
; Also known as a "let binding"
(let [Harry "Harry "
      Potter "Potter"]
      (str Harry Potter))

(let [salary 80000
      bonus 5000]
      (+ salary bonus))
