(ns my-clojure-project.data-structures-nested)

; What this episode will cover:
; * Nested data structures
; - How, When, Why?

; What if we wanted to create a collection of movie characters?
{:characters
  [{:first-name "Harry" :last-name "Potter"}
   {:first-name "Ron" :last-name "Weasley"}
   {:first-name "Hermione" :last-name "Granger"}]}

; What if we wanted to expand on this and create a collection
; of multiple movies with their characters?
{:movies
  [{:harry-potter
    {:characters
      [{:first-name "Harry" :last-name "Potter"}
      {:first-name "Ron" :last-name "Weasley"}
      {:first-name "Hermione" :last-name "Granger"}]}}

      {:star-wars
        {:characters
          [{:first-name "Leia" :last-name "Skywalker"}
          {:first-name "Luke" :last-name "Skywalker"}
          {:first-name "Kylo" :last-name "Ren"}]}}]}
