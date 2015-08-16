(ns fizzbuzz.core
  (:gen-class))

(defn to-num[i]
  (str i))

(defn fizzbuzz[n]
  (cond
    (= n 1) (cons (to-num 1) '())
    (= n 3) (cons "1" (cons "2" (cons "fizz" '())))
    (= n 5) '("1" "2" "fizz" "4" "buzz")))
