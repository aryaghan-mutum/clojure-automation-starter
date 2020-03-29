(ns clojure-automation-starter.google_test
  (:require [clojure.test :refer :all])
  (:use [etaoin.api :all ()])
  (:use [clojure-automation-starter.config.url_config :all ()])
  (:use [clojure-automation-starter.pages.google-search-page :all ()]))

(def driver (chrome))

(doto driver
  (go google-url)
  (google-search-and-enter "Clojure")
  (quit))
