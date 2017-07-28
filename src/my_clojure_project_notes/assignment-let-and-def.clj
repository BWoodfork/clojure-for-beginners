(ns my-clojure-project-notes.assignment-let-and-def)

; What this episode will cover:
;  * bindings/assignmeent in Clojure
;    - def
;    - let

; ----------------------------------------------------------------------

; (def) is known as a var binding. Not a "Variable".
; the name 'my-number' is now bound to the value 123
(def my-number 123)

; We will go more in depth with (def) in future episodes
; as it will not be our go-to for assignment for a few reasons.

; ----------------------------------------------------------------------

; Our go-to for assignments will be the (let) binding

; 'my-name' is now bound to the value "Byron Woodfork".
(let [my-name "Byron Woodfork"]
  my-name)

; let bindings have a "Lexical Scope"
; - Sets the scope (or range of functionality) of a variable so that it may only
; be called (refered) within the block of code that it was defined.

; let is a "Lexical Binding"
; - Meaning, when we create a binding using let, we can only use that binding
; within that let block.

; We cannot access let bindings outside of a let statement
(let [my-name "Byron Woodfork"]
  my-name)

my-name

; Let bindings can be assigned to function results as well!
(let [a (+ 1 1)]
  a)

(let [a (+ 3 1)]
  a)

; Or bound to string values!
(let [harrys-name "Harry James Potter"]
  harrys-name)

; We can assign as many let bindings as we want!
(let [a 1
      b 2
      c 3
      d 4
      e 5]
  (+ a b c d e))

; let bindings are normally used within other functions
(defn print-my-name []
  (let [my-name "Byron Woodfork"]
    (println my-name)))
