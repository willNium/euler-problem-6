(ns problem6.core-test
  (:require [clojure.test :refer :all]
            [problem6.core :refer :all]))

(deftest square-sum
  (testing "should find differences between square of sum and sum of squares"
    (is (= (square-sum-diff 100) 25164150))))
