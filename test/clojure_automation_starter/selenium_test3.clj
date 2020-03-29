(ns clojure-automation-starter.selenium-test3
  (:require [clojure.test :refer :all])
  (:use [clojure-automation-starter.pages.wikipedia_page :all ()]))

(require '[etaoin.keys :as k])
(use 'etaoin.api)

(def driver (chrome))

(go driver "https://en.wikipedia.org/")
(wait-visible driver [{:id :simpleSearch} {:tag :input :name :search}])

(setText driver "Clojure programming language")
(fill driver {:tag :input :name :search} k/enter)
(wait-visible driver {:class :mw-search-results})

(click driver [{:class :mw-search-results} {:class :mw-search-result-heading} {:tag :a}])
(wait-visible driver {:id :firstHeading})

;; let's ensure
(get-url driver)                                            ;; "https://en.wikipedia.org/wiki/Clojure"

(get-title driver)                                          ;; "Clojure - Wikipedia"

(has-text? driver "Clojure")                                ;; true

;; navigate on history
(back driver)
(forward driver)
(refresh driver)
(get-title driver)                                          ;; "Clojure - Wikipedia"

;; stops Firefox and HTTP server
(quit driver)