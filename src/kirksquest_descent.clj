(ns Player
  (:gen-class))

(defn highest-mountain? [map-mountains]
  "Compute the highest mountain indice."
  (->> map-mountains
       (reduce (fn [[i h] [j k]]
                 (if (< h k)
                   [j k]
                   [i h]))
               [-1 -1])
       first))

(defn scan-mountains! [nb-mountains]
  "Scan the mountains' structure."
  (loop [i 0 map-mountains {}]
    (if (= i nb-mountains)
      map-mountains
      (let [MH (read)]
        (recur (inc i) (assoc map-mountains i MH))))))

(defn -main [& args]
  (while true
    (let [SX (read)
          SY (read)]
      (-> (scan-mountains! 8)
           highest-mountain?
           (= SX)
           (if "FIRE" "HOLD")
           println))))
