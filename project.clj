(defproject collatz-clojure "1.0.0"
  :description "Takes a number and calculates the number of steps to reach 1 using steps outlined in the Collatz Conjecture"
  :url "https://github.com/kgengler/collatz-clojure"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot collatz-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
