(ns clojure-automation-starter.pages.clojure_app.clojure_home_page
  (:require [etaoin.keys :as k])
  (:use [etaoin.api :all ()]))

(def overview-link {:tag :a :href "/about/rationale"})
(def reference-link {:xpath "//a[text()='Reference']"})
(def api-link {:tag :a :href "/api/api"})
(def releases-link {:tag :a :href "/community/downloads"})
(def guides-link {:tag :a :href "/guides/guides"})
(def community-link {:xpath "//a[text()='Community']"})
(def dev-link {:xpath "//a[text()='Dev']"})
(def news-link {:tag :a :href "/news/news"})
(def search-link {:xpath "//a[@class='w-nav-link clj-nav-link clj-nav-search']"})

(def getting-started-btn {:xpath "//a[text()='Get Started!']"})

(defn click-getting-started-btn [driver]
  (click driver getting-started-btn))

(defn click-overview [driver]
  (click driver overview-link))

(defn click-reference [driver]
  (click driver reference-link))

(defn click-api [driver]
  (click driver api-link))

(defn click-releases [driver]
  (click driver releases-link))

(defn click-guides [driver]
  (click driver guides-link))

(defn click-community [driver]
  (click driver community-link))

(defn click-dev [driver]
  (click driver dev-link))

(defn click-news [driver]
  (click driver news-link))

(defn click-search [driver]
  (click driver search-link))