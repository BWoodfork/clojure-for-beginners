(ns my-clojure-project-notes.crap-file)

(let [result (future (Thread/sleep 1000) (+ 20 20))
      other-result (future (Thread/sleep 7000) (println "I print after 7"))]
; (println "ref: " (ref result))
; (println "deref: " (deref result))
(println "I am result: " (realized? result))
; (println "I am the other result" other-result)
  )

  (future
    (Thread/sleep 4000) (println "I print after 4 seconds")
    (Thread/sleep 4000) (println "I print after 4 seconds")
    )

    ; (dotimes [i 10] (.start (Thread. (fn [] (println i)))))
    (.start (Thread/sleep 3000) (println "sup"))

    (future ; I create a new thread
      (expression) ; I run on that new thread
      (expression)) ; I also run on that same newly created thread

(let [result (future
               (Thread/sleep 2000)
               (+ 20 20))]
  (deref (future (Thread/sleep 1000)
(realized? result))))
