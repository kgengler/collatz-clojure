(ns collatz-clojure.core
  (:gen-class))

(defn parse-int 
  "Parse a string as an integer"
  [s]
  (Integer. (re-find  #"\d+" s )))

(defn hotpo
  "If n is even, divide it by 2, otherwise multiply it by 3 and add 1"
  [n]
  (if (even? n)
    (/ n 2)
    (+ 1 (* 3 n))))

(defn collatz 
  "Calculate number of steps to reach 1 for number n using Collatz conjecture"
  ([n] (collatz n 0))
  ([n, acc]
    (if (= 1 n)
      acc
      (recur (hotpo n) (+ 1 acc)))))

(defn -main
  "Run collatz function for first arg"
  [& args]
  (println (collatz (parse-int (first args))))) 

