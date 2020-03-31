(ns step0-repl)

(defn READ [xs]
  xs)

(defn EVAL [xs]
  xs)

(defn PRINT [xs]
  xs)

(defn rep []
  (-> READ EVAL PRINT))

(defn -main [& args]
  (loop ))
