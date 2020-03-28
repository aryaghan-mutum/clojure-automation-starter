(use 'etaoin.api)
(require '[etaoin.keys :as k])


(def driver (firefox))
(doto driver
  (go "https://en.wikipedia.org/")
  (wait-visible [{:id :simpleSearch} {:tag :input :name :search}])
  ;; ...
  (fill {:tag :input :name :search} k/enter)
  ;(wait-visible {:class :mw-search-results})
  (click :some-button)
  ;; ...
  (wait-visible {:id :firstHeading})
  ;; ...
  (quit))
