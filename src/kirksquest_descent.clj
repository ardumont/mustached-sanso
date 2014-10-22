(ns Player
  (:gen-class))

;; Auto-generated code below aims at helping you parse
;; the standard input according to the problem statement.

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
        ;; MH: represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
        (recur (inc i) (assoc map-mountains i MH))))))

(defn -main [& args]
  (while true
    (let [SX (read)
          SY (read)
          mountains (scan-mountains! 8)
          highest-mountain-to-fire (highest-mountain? mountains)]
      (binding [*out* *err*]
        (println (format "mountains: %s - sx: %s - highest mountain: %s" mountains SX highest-mountain-to-fire)))
      (println (if (= SX highest-mountain-to-fire) "FIRE" "HOLD")))))
