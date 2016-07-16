(def s (iterate (partial + 2) 1))

(defn prime? [n]
         (not-any? zero? (map #(rem n %) (range 2 n))))

(nth (filter prime? s) 10000); 104743

