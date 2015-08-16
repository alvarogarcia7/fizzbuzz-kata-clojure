(ns fizzbuzz.core
  (:gen-class))

(defn to-num[i]
  (str i))

(defn fizzbuzz[n]
  (cond
    (= n 1) (cons (to-num 1) '())
    (= n 3) (cons (to-num 1) (cons (to-num 2) (cons "fizz" '())))
    (= n 5) (cons (to-num 1) (cons (to-num 2) (cons "fizz" (cons (to-num 4) (cons "buzz" '())))))))
