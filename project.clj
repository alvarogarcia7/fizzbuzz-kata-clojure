(defproject fizzbuzz "0.1.0-SNAPSHOT"
  :description "the fizzbuzz kata"
  :url "http://codingdojo.org/cgi-bin/index.pl?KataFizzBuzz"
  :license {:name "BSD 3 License"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot fizzbuzz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
	     :dev {
                     :dependencies [[midje "1.6.3"]]
                     :plugins      [[lein-midje "3.1.3"]]
               }})
