(ns clojure-automation-starter.wikipedia-test
  (:require [clojure.test :refer :all])
  (:use [etaoin.api :all ()])
  (:use [clojure-automation-starter.config.url_config :all ()])
  (:use [clojure-automation-starter.pages.wikipedia_page :all ()]))

(def driver (chrome))

(doto driver
  (go wiki-url)
  (wait-visible [{:id :simpleSearch} {:tag :input :name :search}])
  (wiki-search-and-enter "Clojure programming language")
  (wait-visible {:class :mw-search-results})

  (click-search-results)
 ;;  (wait-visible {:id :firstHeading})

  (get-url)
  (get-title)

  (has-text? "Clojure")
  (back)
  (forward)
  (refresh)
  (get-title)
  (quit))

