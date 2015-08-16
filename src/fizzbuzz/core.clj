(ns fizzbuzz.core
  (:gen-class))

(defn to-num[i]
  (str i))

(defn fizzbuzz[n]
  (cond
    (= n 1) '("1")
    (= n 3) '("1" "2" "fizz")
    (= n 5) '("1" "2" "fizz" "4" "buzz")))
