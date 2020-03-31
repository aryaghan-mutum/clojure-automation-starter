(ns clojure-automation-starter.clojure-app-tests.clojure-test
  (:require [clojure.test :refer :all])
  (:use [etaoin.api :all ()])
  (:use [clojure-automation-starter.config.url_config :all ()])
  (:use [clojure-automation-starter.pages.clojure-app.clojure-book-page :all ()])
  (:use [clojure-automation-starter.pages.clojure-app.clojure-get-started-page :all ()])
  (:use [clojure-automation-starter.pages.clojure_app.clojure_home_page :all ()]))

(def driver (chrome))

(deftest test-headers

  (go driver clojure-url)

  (testing "test-overview"
    (doto driver
      (is (= overview? true))
      (click-overview)))

  (testing "test-releases"
    (doto driver
      (is (= releases? true))
      (click-releases)))

  (testing "test-api"
    (doto driver
      (is (= api? true))
      (click-api)))

  (testing "test-reference"
    (doto driver
      (go clojure-url)
      (is (= reference? true))
      (click-reference)))

  (testing "test-releases"
    (doto driver
      (go clojure-url)
      (is (= releases? true))
      (click-releases)))

  (testing "test-guides"
    (doto driver
      (go clojure-url)
      (is (= guides? true))
      (click-guides)))

  (testing "test-community"
    (doto driver
      (go clojure-url)
      (is (= community? true))
      (click-community)))

  (testing "test-dev"
    (doto driver
      (is (= dev? true))
      (click-dev)))

  (testing "test-news"
    (doto driver
      (is (= news? true))
      (click-news)))

  (testing "test-search"
    (doto driver
      (go clojure-url)
      (assert (= (search? driver) true))
      (search-text "Clojure as a Dialect of Lisp")
      (assert (= (first-search-result? driver) true))
      (get-search-result-text)
      (click-first-search-result)))

    (quit driver))

(deftest test-getting-started
  (testing "test-getting-started"
    (doto driver
      (go clojure-url)
      (click-getting-started-btn)
      (click-learn-clojure-link)
      (back)
      (click-resources-link)
      (back)
      (click-books-link)
      ;(has-text? "Getting Started")
      (quit))))

;(test-headers)
(test-getting-started)


