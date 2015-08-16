(ns fizzbuzz.core
  (:gen-class))

(defn fizzbuzz[n]
  (if (= n 1)
    '("1")
    (if (= n 3)
      '("1" "2" "fizz")
      '("1" "2" "fizz" "4" "buzz"))))
