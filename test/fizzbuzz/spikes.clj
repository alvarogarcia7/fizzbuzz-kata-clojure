

(def numbers2 (range 1 (inc 8)))
numbers2
(map to-num numbers2)

(def functions
  (flatten (repeat [identity identity (fn [n] "fizz")])))
functions

; convert to a pair of <fn, value>
; http://stackoverflow.com/questions/2588227/is-there-an-equivalent-for-the-zip-function-in-clojure-core-or-contrib
(def fn-num
  (map vector functions numbers2))
fn-num
(defn apply-1-on-2 [v]
  ((first v) (second v)))
(map apply-1-on-2 fn-num)

; (cons (eval identity) '())

; how to create a list of functions in clojure:
; http://stackoverflow.com/questions/3311331/apply-first-of-a-list-of-functions-in-clojure
[identity inc]
; is an array (see [])
; to convert it to a list:
(flatten [identity inc])

