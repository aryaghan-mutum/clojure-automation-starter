(ns clojure-automation-starter.pages.some_page)
(use 'etaoin.api)
(require '[etaoin.keys :as k])

(defn setText [driver text]
  (fill driver {:tag :input :name :search} text))