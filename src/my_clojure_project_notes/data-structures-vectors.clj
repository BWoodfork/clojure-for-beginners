(ns my-clojure-project-notes.data-structures-vectors)

; What this episode will cover:
;  * Data structures in Clojure:
;   - Vectors
;   - Maps
;   - Sets
;  * The basics of how they can be used

; ----------------------------------------------------------------------

; * Vectors - Groups of data (collections)

; Can be empty
[]

; Can hold a collection of data
["a" "b" "c" "d" "e"]

; Value types can be different
[1 "b" 600.10 "d" "e"]

; Values can also be other, nested vectors
[["a" "b" "c"] ["d" "e" "f"]]

; Have indexes
;           0   1   2   3   4
(.indexOf ["a" "b" "c" "d" "e"] "a")
(.indexOf ["a" "b" "c" "d" "e"] "c")

; Can be created multiple ways
; - With a literal
["I" "am" "a" "vector"]

; - With a function call
(vector "I" "am" "a" "vector")

; - Can be appended to, creating a new vector
(conj ["I" "am" "a"] "vector")

; - Can have items removed as well
(rest ["I" "am" "a" "vector"])


; Retrieving items in a Vector
; - Get the first item
(first ["I" "am" "a" "vector"])

; - Get the last item
(last ["I" "am" "a" "vector"])

; - Get the item at a given index
(nth ["I" "am" "a" "vector"] 3)



; (Jump to data-structures-maps.clj for the maps lesson)
