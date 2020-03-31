(ns clojure-automation-starter.pages.clojure-app.clojure-get-started-page
  (:require [etaoin.keys :as k])
  (:use [etaoin.api :all ()]))

(def learn-clojure-link {:tag :a :href "learn/syntax"})
(def resources-link {:tag :a :href "xref/../../community/resources"})
(def books-link {:tag :a :href "xref/../../community/books"})

(defn click-learn-clojure-link [driver]
  (click driver learn-clojure-link))

(defn click-resources-link [driver]
  (click driver resources-link))

(defn click-books-link [driver]
  (click driver books-link))

