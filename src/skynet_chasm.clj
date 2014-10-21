(ns Player
  (:gen-class))

;; Auto-generated code below aims at helping you parse
;; the standard input according to the problem statement.

(defn -main [& args]
  (let [R (read) G (read) L (read)]
    ;; R: the length of the road before the gap.
    ;; G: the length of the gap.
    ;; L: the length of the landing platform.
    (while true
      (let [S (read) X (read)]
        ;; S: the motorbike's speed.
        ;; X: the position on the road of the motorbike.

        ;; (binding [*out* *err*]
        ;;   (println "Debug messages..."))

        ;; A single line containing one of 4 keywords: SPEED, SLOW, JUMP, WAIT.
        (println "SPEED")))))
