(comment "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?")
(def dividers '(2 3 5 7 11 13 17 19))
(def step (apply * dividers))
(def s (iterate (partial + step) step))

(defn lcm []
  (->> s
       (filter (fn [n]
                 (every? #(zero? (mod n %)) (range 2 20))))
       (first)))

(lcm); 232792560
