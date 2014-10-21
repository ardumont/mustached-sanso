(ns Player
  (:gen-class))

;; The code below will read all the game information for you.
;; On each game turn, information will be available on the standard input, you will be sent:
;; -> the total number of visible enemies
;; -> for each enemy, its name and distance from you
;; The system will wait for you to write an enemy name on the standard output.
;; Once you have designated a target:
;; -> the cannon will shoot
;; -> the enemies will move
;; -> new info will be available for you to read on the standard input.

(defn read-enemy! []
  "Read from standard input the enemy and distance and return the couple [dist enemy]."
  (let [enemy (read)
        dist (read)]
    [dist enemy]))

(defn nearest-enemy! [count]
  "Return the scanned enemies."
  (loop [i count min-dist 0 nearest-enemy nil]
    (if (= 0 i)
      nearest-enemy
      (let [[dist enemy] (read-enemy!)]
        (if (<= dist min-dist)
          (recur (dec i) dist enemy)
          (recur (dec i) min-dist nearest-enemy))))))

(defn -main [& args]
  (while true
    ;; count: The number of current enemy ships within range
    (let [nb-enemies (read)]
      (println (nearest-enemy! nb-enemies)))))
