(ns clojure-automation-starter.pages.clojure-app.clojure-book-page
  (:require [etaoin.keys :as k])
  (:use [etaoin.api :all ()]))

(def books-table {:tag :table :class "ableblock frame-all grid-all table"})

(defn get-books-table [driver]
  (println "sdffs")
  (get-title driver))