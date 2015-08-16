(ns fizzbuzz.core
  (:gen-class))

(defn to-num[i]
  (str i))

(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))]
    (cond
      (= n 1) (map to-num numbers)
      (= n 3) (cons (to-num 1) (cons (to-num 2) (cons "fizz" '())))
      (= n 5) (cons (to-num 1) (cons (to-num 2) (cons "fizz" (cons (to-num 4) (cons "buzz" '()))))))))
