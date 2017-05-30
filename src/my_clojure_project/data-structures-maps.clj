(ns my-clojure-project.data-structures-maps)

; * Maps - Another form of a collection
; ----------------------------------------------------------------------

; Can be empty
{}

; Hold a collection of key-value pairs of data

; key        value
{:first-name "Harry"}

; Can hold multiple key-value pairs
{:first-name "Harry" :last-name "Potter"}

; Values can also be other, nested maps
{:names {:first-name "Ron" :last-name "Weasley"}}

; Can be created multiple ways
; - With a literal
{:first-name "Harry"}

; - With a function call
(hash-map :first-name "Harry" :last-name "Potter")

; - Can have key-value pairs added (or associated) with them, creating a new map
(assoc {:first-name "Harry"} :last-name "Potter")

; - Can also have key-value pairs removed
(dissoc {:first-name "Harry"} :last-name)
