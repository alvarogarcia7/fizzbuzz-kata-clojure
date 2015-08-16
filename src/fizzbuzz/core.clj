(ns fizzbuzz.core
  (:gen-class))

(defn to-num[i]
  (str i))

(defn- fizz [n] "fizz")
(defn- buzz [n] "buzz")
(defn- fizzbuzz- [n] "fizzbuzz")

(def ^:private fizz-buzz-schedule
  (flatten (repeat [to-num  to-num  fizz
                    to-num  buzz    fizz
                    to-num  to-num  fizz
                    buzz    to-num  fizz
                    to-num  to-num  fizzbuzz-])))

(defn- zip [functions numbers]
  (map vector functions numbers))

(defn- apply-first-on-second [v]
  ((first v) (second v)))

(defn fizzbuzz[n]
  (let [numbers (range 1 (inc n))
        function-and-number (zip fizz-buzz-schedule numbers)]
    (map apply-first-on-second function-and-number)))
