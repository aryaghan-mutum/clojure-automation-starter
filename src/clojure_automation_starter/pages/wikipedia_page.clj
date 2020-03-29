(ns clojure-automation-starter.pages.wikipedia_page
  (:require [etaoin.keys :as k])
  (:use [etaoin.api :all ()]))

(def wiki-search-name {:tag :input :name :search})
(def search-results [{:class :mw-search-results} {:class :mw-search-result-heading} {:tag :a}])

(defn wiki-search [driver text]
  (fill driver wiki-search-name text))

(defn wiki-search-and-enter [driver text]
  (wiki-search driver text)
  (fill driver wiki-search-name k/enter))

(defn click-search-results [driver]
  (click driver search-results))