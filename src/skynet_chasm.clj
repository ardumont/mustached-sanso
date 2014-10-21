(ns Player
  (:gen-class))

; Auto-generated code below aims at helping you parse
; the standard input according to the problem statement.

(defn -main [& args]
  (let [length-road-before-gap  (read)
        length-gap              (read)
        length-landing-platform (read)
        min-speed-to-jump       (inc length-gap)
        pos-to-jump             (dec length-road-before-gap)]
    (while true
      (let [current-speed  (read)
            current-pos    (read)
            jump-size      current-speed
            pos-next-turn  (+ current-pos current-speed)]
        (let [action
              (cond (and (< pos-next-turn pos-to-jump) (< jump-size min-speed-to-jump)) "SPEED"
                    (and (< pos-next-turn pos-to-jump) (= jump-size min-speed-to-jump)) "WAIT"
                    (= pos-next-turn pos-to-jump)                                       "WAIT"
                    (= current-pos   pos-to-jump)                                       "JUMP"
                    :else                                                               "SLOW")]
                (println action))))))
