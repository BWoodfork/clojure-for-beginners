(ns my-clojure-project-notes.true-and-false)

; What this episode will cover:
;  * What is a boolean?
;  * What is true in Clojure?
;  * What is false in Clojure?

; ----------------------------------------------------------------------

; A boolean is a value used to represent logic in code
true ; yes
false ; no

; We can check if a value is true
(true? true)

; We can check if a value is false
(false? false)

; And the reverse
(true? false)

; Some functions return true/false values
(= 2 2)

; We can test whether or not these values are truthy or falsey
(true? (= 2 2))

; We can get the opposite of a boolean using (not)
(not true)
