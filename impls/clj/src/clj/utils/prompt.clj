(ns clj.utils.prompt)

(defn read-input [prompt]
  (do
    (print prompt)
    (flush)
    (read-line)))
