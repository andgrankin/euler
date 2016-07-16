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
