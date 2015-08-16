(ns fizzbuzz.core-with-function-composition
  (:gen-class))

(defn- divisible-by? [i divisor]
  (= (rem i divisor) 0))

(defn- fizzbuzz? [i]
  (if (divisible-by? i 15)
    "fizzbuzz"
    i))

(defn- buzz? [i]
  (if (or (string? i) (not (= (rem i 5) 0)))
    i
    "buzz"))

(defn- fizz? [i]
  (if (or (string? i) (not (= (rem i 3) 0)))
    i
    "fizz"))

(defn- to-num [i]
  (str i))

(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))
        f #(to-num (fizz? (buzz? (fizzbuzz? %))))]
    (map f numbers)))
