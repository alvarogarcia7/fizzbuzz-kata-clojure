(ns fizzbuzz.core
  (:gen-class))

(defn to-num[i]
  (str i))

(def ^:private fizz-buzz-schedule
  (flatten (repeat [to-num to-num (fn [n] "fizz") to-num (fn [n] "buzz")])))

(defn- zip [functions numbers]
  (map vector functions numbers))

(defn apply-first-on-second [v]
  ((first v) (second v)))


(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))
        function-and-number (zip fizz-buzz-schedule numbers)]
    (map apply-first-on-second function-and-number)))
