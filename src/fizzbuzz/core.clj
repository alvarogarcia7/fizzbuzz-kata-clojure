(ns fizzbuzz.core
  (:gen-class))

(defn to-num[i]
  (str i))

(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))]
    (cond
      (<= n 2) (map to-num numbers)
      (= n 3) (flatten [(to-num 1) (to-num 2) "fizz"])
      (= n 5) (flatten [(to-num 1) (to-num 2) "fizz" (to-num 4) "buzz"]))))
