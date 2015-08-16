(ns fizzbuzz.core-test
  (:use midje.sweet)
  (:require [clojure.string :as str])
  (:require [fizzbuzz.core-with-fixed-schedule :as fs]))

(fact "about fizzbuzz"
  (fs/fizzbuzz 1) => '("1")
  (fs/fizzbuzz 2) => '("1" "2")
  (fs/fizzbuzz 3) => '("1" "2" "fizz")
  (fs/fizzbuzz 5) => '("1" "2" "fizz" "4" "buzz")
  (fs/fizzbuzz 15) => '("1" "2" "fizz" "4" "buzz" "fizz" "7" "8" "fizz" "buzz" "11" "fizz" "13" "14" "fizzbuzz")
    )

(fact "about number to string converter"
  (fs/to-num 1) => "1"
  (fs/to-num 2) => "2"
  (fs/to-num 3) => "3")
