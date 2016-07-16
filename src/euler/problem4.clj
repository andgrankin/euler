(comment
  "A palindromic number reads the same both ways.
  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
  Find the largest palindrome made from the product of two 3-digit numbers.")

; problem 4

(require '[clojure.string :as str])

(defn to-int [n]
  (Integer/parseInt n))

(defn palindrome [num]
  (to-int (str num (str/reverse (str num)))))

(defn max-palindrome []
  (let [palindromes (for [x (range 999 100 -1)
                          :let [y (palindrome x)]
                          :when (<= (* 100 100) y (* 999 999))]
                      y)]
    (->> palindromes
         (filter (fn [p]
                   (->> (range 999 100 -1)
                        (filter #(and (zero? (mod p %)) (<= 100 (/ p %) 999)))
                        (first))))
         (first))))

(max-palindrome) ;; 906609

