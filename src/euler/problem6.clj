(comment "The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.")

(def s (range 1 101))
(defn square [x] (* x x))

(defn sum-of-squares [s]
  (square (apply + s)))

(defn square-of-sum [s]
  (->> s
       (map square)
       (apply +)))

(defn diff [s]
  (- (sum-of-squares s) (square-of-sum s)))

(diff s); 25164150
