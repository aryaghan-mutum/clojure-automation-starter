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
(def search-box {:id "q"})
(def first-search-result {:id "doc-5b1af98e12205608aa142f452b1b0fbd"})
(def clojure-as-a-dialect-of-lisp-text {:xpath "//a[text()='Clojure - Clojure as a Dialect of Lisp']"})

(def getting-started-btn {:xpath "//a[text()='Get Started!']"})

(defn click-getting-started-btn [driver]
  (click driver getting-started-btn))

(defn click-overview [driver]
  (click driver overview-link))

(defn overview? [driver]
  (exists? driver overview-link))

(defn click-reference [driver]
  (click driver reference-link))

(defn reference? [driver]
  (exists? driver reference-link))

(defn click-api [driver]
  (click driver api-link))

(defn api? [driver]
  (exists? driver api-link))

(defn click-releases [driver]
  (click driver releases-link))

(defn releases? [driver]
  (exists? driver releases-link))

(defn click-guides [driver]
  (click driver guides-link))

(defn guides? [driver]
  (exists? driver guides-link))

(defn click-community [driver]
  (click driver community-link))

(defn community? [driver]
  (exists? driver click-community))

(defn click-dev [driver]
  (click driver dev-link))

(defn dev? [driver]
  (exists? driver dev-link))

(defn click-news [driver]
  (click driver news-link))

(defn news? [driver]
  (exists? driver news-link))

(defn click-search [driver]
  (click driver search-link))

(defn search? [driver]
  (exists? driver search-link))

(defn search-text [driver text]
  (click-search driver)
  (fill driver search-box text)
  (fill driver search-box k/enter))

(defn click-first-search-result [driver]
  (click driver first-search-result))

(defn first-search-result? [driver]
  (exists? driver first-search-result))

(defn get-search-result-text [driver]
  (get-element-text driver clojure-as-a-dialect-of-lisp-text))
