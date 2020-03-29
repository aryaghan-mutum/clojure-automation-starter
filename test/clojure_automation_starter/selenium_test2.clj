;
;(use 'etaoin.api)
;(require '[etaoin.keys :as k])
;
;;(extend clojure-automation-starter.base_test)
;
;;(import clojure-automation-starter.pages.some_page)
;
;;(require clojure-automation-starter.pages.some_page)
;
;(def driver (chrome))
;
;(go driver "https://en.wikipedia.org/")
;(wait-visible driver [{:id :simpleSearch} {:tag :input :name :search}])
;
;;; search for something
;;(setText driver "Clojure programming language")
;
;(fill driver {:tag :input :name :search} "Clojure programming language")
;(fill driver {:tag :input :name :search} k/enter)
;(wait-visible driver {:class :mw-search-results})
;
;;; I'm sure the first link is what I was looking for
;(click driver [{:class :mw-search-results} {:class :mw-search-result-heading} {:tag :a}])
;(wait-visible driver {:id :firstHeading})
;
;;; let's ensure
;(get-url driver) ;; "https://en.wikipedia.org/wiki/Clojure"
;
;(get-title driver) ;; "Clojure - Wikipedia"
;
;(has-text? driver "Clojure") ;; true
;
;;; navigate on history
;(back driver)
;(forward driver)
;(refresh driver)
;(get-title driver) ;; "Clojure - Wikipedia"
;
;;; stops Firefox and HTTP server
;(quit driver)