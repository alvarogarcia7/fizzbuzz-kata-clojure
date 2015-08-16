(ns fizzbuzz.core-with-pattern-matching
  (:gen-class)
  (:require [clojure.core.match :refer [match]]))

(defn- divisible-by? [i divisor]
  (= (rem i divisor) 0))

(defn- conditional [i]
 (match [(divisible-by? i 3) (divisible-by? i 5)]
      [true true] "fizzbuzz"
      [true _] "fizz"
      [_ true] "buzz"
      :else (str i)))

(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))]
    (map conditional numbers)))
