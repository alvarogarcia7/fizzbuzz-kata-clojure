(ns fizzbuzz.core-test
  (:use midje.sweet)
  (:require [clojure.string :as str])
  (:require [fizzbuzz.core :refer :all]))

(fact "about fizzbuzz"
  (fizzbuzz 1) => '("1")
  (fizzbuzz 3) => '("1" "2" "fizz")
  )
