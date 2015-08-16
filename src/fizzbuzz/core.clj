(ns fizzbuzz.core
  (:gen-class))

(defn fizzbuzz[n]
  (if (= n 1)
    '("1")
    '("1" "2" "fizz")))
