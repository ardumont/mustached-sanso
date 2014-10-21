(ns Player
  (:gen-class))

; The code below will read all the game information for you.
; On each game turn, information will be available on the standard input, you will be sent:
; -> the total number of visible enemies
; -> for each enemy, its name and distance from you
; The system will wait for you to write an enemy name on the standard output.
; Once you have designated a target:
; -> the cannon will shoot
; -> the enemies will move
; -> new info will be available for you to read on the standard input.

(defn -main [& args]
  (while true
    ;; count: The number of current enemy ships within range
    (let [count (read)]
      (loop [i count]
        (when (> i 0)
          (let [enemy (read)
                dist (read)]
            (println enemy)
            ;; enemy: The name of this enemy
            ;; dist: The distance to your cannon of this enemy
            (recur (dec i)))))

      ;; (binding [*out* *err*]
      ;;   (println "Debug messages..."))

      ;; The name of the most threatening enemy (HotDroid is just one example)
      ;;;(println "HotDroid")
      )))
