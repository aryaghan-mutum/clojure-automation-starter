(ns clojure-automation-starter.pages.google-search-page
  (:use [etaoin.api :all ()])
  (:require [etaoin.keys :as k]))

(def google-search-name {:tag :input :name :q})

(defn google-search [driver text]
  (fill driver google-search-name text))

(defn google-search-and-enter [driver text]
  (google-search driver text)
  (fill driver google-search-name k/enter))

;(defn click-first-link [driver]
;  (click driver))