(ns collatz-clojure.core-test
  (:require [clojure.test :refer :all]
            [collatz-clojure.core :refer :all]))

(deftest parse-int-type
  (testing "string is now a long"
    (is (= java.lang.Integer (type (parse-int "4"))))))

(deftest parse-int-4-value
  (testing "4 is still 4"
    (is (= 4 (parse-int "4")))))

(deftest parse-int-hello4-value
  (testing "hello4 is 4"
    (is (= 4 (parse-int "hello4")))))

(deftest parse-int-4hello-value
  (testing "4hello is 4"
    (is (= 4 (parse-int "4hello")))))

(deftest parse-int-4hello4-value
  (testing "4hello4 is 4"
    (is (= 4 (parse-int "4hello4")))))

(deftest parse-int-he11o-value
  (testing "he11o is 11"
    (is (= 11 (parse-int "he11o")))))

(deftest hotpo-even-test
  (testing "even is divided by 2"
    (is (= 10 (hotpo 20)))))

(deftest hotpo-odd-test
  (testing "odd is multiplied by 3 and added to 1"
    (is (= 22 (hotpo 7)))))

(deftest collatz-1-test
  (testing "1 is 0 steps"
    (is (= 0 (collatz 1)))))

(deftest collatz-2-test
  (testing "2 is 1 step"
    (is (= 1 (collatz 2)))))

(deftest collatz-9-test
  (testing "9 is 19 steps"
    (is (= 19 (collatz 9)))))

(deftest collatz-27-test
  (testing "27 is 111 steps"
    (is (= 111 (collatz 27)))))

(deftest collatz-97-test
  (testing "97 is 118 steps"
    (is (= 118 (collatz 97)))))

(deftest collatz-871-test
  (testing "871 is 178 steps"
    (is (= 178 (collatz 871)))))

(deftest collatz-6171-test
  (testing "6171 is 261 steps"
    (is (= 261 (collatz 6171)))))

