(ns clojure-automation-starter.core-test3
  (:require [clojure.test :refer :all]
            [clojure-automation-starter.some_page :refer :all]))

(ns clojure-automation-starter.core-test3
  (:use faker.name faker.lorem))

;(deftest test-numbers
;  (is (= 1 0)))
;
;(test-numbers)

(defn one-time-setup []
  (println "one time setup"))

(defn one-time-teardown []
  (println "one time teardown"))

(defn once-fixture [f]
  (one-time-setup)
  (f)
  (one-time-teardown))

;; register as a one-time callback
(use-fixtures :once once-fixture)



(def n (take 10 (last-name)))
(def p (take 10 (paragraphs)))
(def x (take 10 (phone-numbers)))