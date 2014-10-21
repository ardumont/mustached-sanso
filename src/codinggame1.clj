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

(defn -main [& args]
  (while true
    ;; count: The number of current enemy ships within range
    (let [nb-enemies (read)
          map-enemies (doseq [_ (range nb-enemies)] (read-enemy!))]
      (doseq [[dist enemy] (into (sorted-map) map-enemies)
              (println enemy)))))
