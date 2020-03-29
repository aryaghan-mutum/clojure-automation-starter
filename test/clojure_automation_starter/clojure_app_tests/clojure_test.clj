(ns clojure-automation-starter.clojure-app-tests.clojure-test
  (:require [clojure.test :refer :all])
  (:use [etaoin.api :all ()])
  (:use [clojure-automation-starter.config.url_config :all ()])
  (:use [clojure-automation-starter.pages.clojure-app.clojure-book-page :all ()])
  (:use [clojure-automation-starter.pages.clojure-app.clojure-get-started-page :all ()])
  (:use [clojure-automation-starter.pages.clojure_app.clojure_home_page :all ()]))

(def driver (chrome))

(deftest test-getting-started
  (doto driver
    (go clojure-url)
    (click-getting-started-btn)
    (click-learn-clojure-link)
    (back)
    (click-resources-link)
    (back)
    (click-books-link)
    ;(has-text? "Getting Started")
    (quit)))

(deftest test-overview
  (doto driver
    (go clojure-url)
    (click-overview)
    (quit)))

(deftest test-releases
  (doto driver
    (go clojure-url)
    (click-releases)
    (quit)))

(deftest test-api
  (doto driver
    (go clojure-url)
    (click-api)
    (quit)))

(deftest test-reference
  (doto driver
    (go clojure-url)
    (click-reference)
    (quit)))

(deftest test-releases
  (doto driver
    (go clojure-url)
    (click-releases)
    (quit)))

(deftest test-guides
  (doto driver
    (go clojure-url)
    (click-guides)
    (quit)))

(deftest test-community
  (doto driver
    (go clojure-url)
    (click-community)
    (quit)))

(deftest test-dev
  (doto driver
    (go clojure-url)
    (click-dev)
    (quit)))

(deftest test-news
  (doto driver
    (go clojure-url)
    (click-news)
    (quit)))

(deftest test-search
  (doto driver
    (go clojure-url)
    (search-text "Clojure as a Dialect of Lisp")
    (quit)))

(test-search)