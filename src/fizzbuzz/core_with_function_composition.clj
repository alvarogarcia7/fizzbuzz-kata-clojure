(ns fizzbuzz.core-with-function-composition
  (:gen-class))

(defn- divisible-by? [i divisor]
  (= (rem i divisor) 0))

(defn- fizzbuzz? [i]
  (if (divisible-by? i 15)
    "fizzbuzz"
    i))

(defn- buzz? [i]
  (if (or (string? i) (not (divisible-by? i 5)))
    i
    "buzz"))

(defn- fizz? [i]
  (if (or (string? i) (not (divisible-by? i 3)))
    i
    "fizz"))

(defn- to-num [i]
  (str i))

(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))
        f #(to-num (fizz? (buzz? (fizzbuzz? %))))]
    (map f numbers)))
