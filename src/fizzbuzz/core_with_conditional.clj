(ns fizzbuzz.core-with-conditional
  (:gen-class))

(defn- divisible-by? [i divisor]
  (= (rem i divisor) 0))

(defn- conditional [i]
  (cond
   (divisible-by? i 15) "fizzbuzz"
   (divisible-by? i 3) "fizz"
   (divisible-by? i 5) "buzz"
   :else (str i)))

(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))]
    (map conditional numbers)))
