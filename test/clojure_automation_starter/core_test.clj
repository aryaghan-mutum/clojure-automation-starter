(ns clojure-automation-starter.core-test
  (:require [clojure.test :refer :all]
            [clojure-automation-starter.core :refer :all]))


(is (= 4 (+ 2 3)))
;
;(testing "Arithmetic"
;  (testing "with positive integers"
;    (is (= 4 (+ 2 2)))
;    (is (= 7 (+ 3 4))))
;  (testing "with negative integers"
;    (is (= -4 (+ -2 -2)))
;    (is (= -1 (+ 3 -4)))))
;
;
;(deftest a-test
;  (testing "FIXME, I fail."
;    (is (= 0 1))))
;
;(a-test)