(ns my-clojure-project-notes.data-structures-maps)

; * Maps - Another form of collections
; ----------------------------------------------------------------------

; Can be empty
{}

; Hold a collection of key-value pairs of data

; key        value
{:first-name "Harry"}

; Can hold multiple key-value pairs
{:first-name "Harry" :last-name "Potter"}

; Values can also be other, nested maps
{:names {:first-name "Ron" :last-name "Weasley"}
        {:first-name "Hermione" :last-name "Granger"}}

; Can be created multiple ways
; - With a literal
{:first-name "Harry"}

; - With a function call
(hash-map :first-name "Harry" :last-name "Potter")

; - Can have key-value pairs added (or associated) with them, creating a new map
(assoc {:first-name "Harry"} :last-name "Potter")

; - Can also have key-value pairs removed (or dissocated) with them
(dissoc {:first-name "Harry" :last-name "Potter"} :last-name)

; Retrieving items in a Map
; - Get item according to key - using `get`
(get {:first-name "Harry" :last-name "Potter"} :first-name)
(get {:first-name "Harry" :last-name "Potter"} :last-name)

; - An alternative way to achieve the same thing
(:first-name {:first-name "Harry" :last-name "Potter"})

; - What happens when we want to retrieve something that's not there?
(get {:first-name "Harry" :last-name "Potter"} :middle-name)

; - Get all of the keys!
(keys {:first-name "Harry" :last-name "Potter"})

; - Get all of the values!
(vals {:first-name "Harry" :last-name "Potter"})
