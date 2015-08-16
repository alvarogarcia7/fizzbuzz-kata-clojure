(ns fizzbuzz.core-test
  (:use midje.sweet)
  (:require [clojure.string :as str])
  (:require [fizzbuzz.core-with-fixed-schedule :as fs]))

(def fzzbzz
  fs/fizzbuzz)

(fact "about fizzbuzz"
  (fzzbzz 1) => '("1")
  (fzzbzz 2) => '("1" "2")
  (fzzbzz 3) => '("1" "2" "fizz")
  (fzzbzz 5) => '("1" "2" "fizz" "4" "buzz")
  (fzzbzz 15) => '("1" "2" "fizz" "4" "buzz" "fizz" "7" "8" "fizz" "buzz" "11" "fizz" "13" "14" "fizzbuzz")
    )

(fact "about number to string converter"
  (fs/to-num 1) => "1"
  (fs/to-num 2) => "2"
  (fs/to-num 3) => "3")
