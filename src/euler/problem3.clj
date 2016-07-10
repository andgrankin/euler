(comment
  "The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?")

; problem 3
(defn max-prime [number]
  (loop [i 2 num number]
    (do
      (if (and (<= i num) (> num i)) ; actually i shpould be in interval from 2 to square root from number
        (if (not= 0 (mod num i))
          (recur (inc i) num) ;
          (recur 2 (/ num i)))
        num))))


(max-prime 600851475143); 6857

