(use 'etaoin.api)
(require '[etaoin.keys :as k])

(use-fixtures :once once-fixture)

(defn setup []
  (choose-driver "chrome"))

(defn teardown []
  (quit driver))

(defn once-fixture [f]
  (setup)
  (f)
  (teardown))

(def chrome-driver (chrome))
(def firefox-driver (firefox))

(defn choose-driver [driver-name]
  (cond (nil? driver-name) (println str "Driver Name is empty:" driver-name)
        (= "chrome" driver-name) (chrome-driver)
        (= "firefox" driver-name (firefox-driver))))




