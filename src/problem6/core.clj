(ns problem6.core)

(defn square [x]
  (reduce * (repeat 2 x)))

(defn sum-of-squares
  "sum of squares up to a number"
  [num]
  (let [nums (take num (iterate inc 1))]
    (reduce + (map square nums))))

(defn square-of-sum 
  "square of sum to a number"
  [num]
  (let [sum (reduce + (take num (iterate inc 1)))]
    (square sum)))

(defn square-sum-diff
  "difference between square of sums and sum of squares"
  [num]
  (let [subtrahend (sum-of-squares num)
        minuend (square-of-sum num)]
  (- minuend subtrahend)))
