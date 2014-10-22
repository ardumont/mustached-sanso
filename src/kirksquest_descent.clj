(ns Player
  (:gen-class))

;; Auto-generated code below aims at helping you parse
;; the standard input according to the problem statement.

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
          mountain-to-fire-at-current-pos (mountains SX)]
      (binding [*out* *err*]
        (println (format "mountains: %s - sx: %s - below mountain height: %s" mountains SX mountain-to-fire-at-current-pos)))
      (println (if (zero? mountain-to-fire-at-current-pos) "HOLD" "FIRE")))))
