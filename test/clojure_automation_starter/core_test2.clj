(require '[clojure.test :refer :all])

(is (= 4 (+ 2 3)))

;; A function in namespace com.example.core
(defn capitalize-entries [m & ks]
  (reduce (fn [m k] (update-in m [k] clojure.string/capitalize)) m ks))

(deftest test-capitalize-entries
  (let [employee {:last-name "smith"
                  :job-title "engineer"
                  :level 5
                  :office "seattle"}]
    ;; Passes
    (is (= (capitalize-entries employee :job-title :last-name)
           {:job-title "Engineer"
            :last-name "Smith"
            :office "seattle"
            :level 5}))
    ;; Fails
    (is (= (capitalize-entries employee :office)
           {}))))

(run-tests)