(ns Player
  (:gen-class))

(defn scan-highest-mountain! [nb-mountains]
  "Scan the mountains' structure."
  (loop [i 0 highest-height -1 highest-indice 0]
    (if (= i nb-mountains)
      highest-indice
      (let [MH (read)
            [max-height indice-moutain] (if (< highest-height MH) [MH i] [highest-height highest-indice])]
        (recur (inc i) max-height indice-mountain)))))

(defn -main [& args]
  (while true
    (let [SX (read)
          SY (read)]
      (-> (scan-highest-mountain! 8)
           (= SX)
           (if "FIRE" "HOLD")
           println))))
