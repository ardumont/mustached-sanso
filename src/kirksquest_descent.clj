(ns Player
  (:gen-class))

;; Auto-generated code below aims at helping you parse
;; the standard input according to the problem statement.

(defn scan-mountains! [nb-moutains]
  "Scan the mountains' structure"
  (loop [i nb-mountains map-mountains {}]
    (if (= i 0)
      map-mountains
      (let [MH (read)
            j  (dec i)]
        ;; MH: represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
        (recur j (assoc map-mountains j MH))))))

(defn -main [& args]
  (while true
    (let [SX (read)
          SY (read)
          mountains (scan-mountains! 8)
          mountain-to-fire-at-current-pos (mountains SX)]
      (println (if (zero? mountain-to-fire-at-current-pos) "HOLD" "FIRE")))))
