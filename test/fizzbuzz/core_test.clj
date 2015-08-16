(ns fizzbuzz.core-test
  (:use midje.sweet)
  (:require [clojure.string :as str])
  (:require [fizzbuzz.core :refer :all]))

(fact "about fizzbuzz"
  (fizzbuzz 1) => '("1")
  (fizzbuzz 3) => '("1" "2" "fizz")
  (fizzbuzz 5) => '("1" "2" "fizz" "4" "buzz")
    )

(fact "about number to string converter"
  (to-num 1) => "1"
  (to-num 2) => "2"
  (to-num 3) => "3")
