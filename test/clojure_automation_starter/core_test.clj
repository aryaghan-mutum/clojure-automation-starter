(ns clojure-automation-starter.core-test)

(require '[clojure.test :refer :all])

;(ns clojure-automation-starter.core-test3
;  (:use faker.name faker.lorem))

;(testing "Arithmetic"
;  (testing "with positive integers"
;    (is (= 4 (+ 2 2)))
;    (is (= 7 (+ 3 4))))
;  (testing "with negative integers"
;    (is (= -4 (+ -2 -2)))
;    (is (= -1 (+ 3 -4)))))
;
;
;(deftest a-test
;  (testing "FIXME, I fail."
;    (is (= 1 1))))
;
;(a-test)


;(deftest fff
;  []
;  (is (= 4 (+ 2 3))))
;
;(fff)

(defn capitalize-entries [m & ks]
  (reduce (fn [m k] (update-in m [k] clojure.string/capitalize))
          m
          ks))

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