(ns fizzbuzz.core-with-conditional
  (:gen-class))

(defn- divisible-by? [i divisor]
  (= (rem i divisor) 0))

(defn- conditional [i]
  (if (divisible-by? i 15)
    "fizzbuzz"
    (if (divisible-by? i 3)
      "fizz"
      (if (divisible-by? i 5)
      "buzz"
      (str i)))))

(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))]
    (map conditional numbers)))
