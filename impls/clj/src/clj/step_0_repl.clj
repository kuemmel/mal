(ns clj.step-0-repl
  (:require [clj.utils.prompt :as prompt])
  (:gen-class))

(defn READ [xs]
  xs)

(defn EVAL [xs environment]
  xs)

(defn PRINT [xs]
  xs)

(defn rep [xs]
  (-> xs READ (EVAL "") PRINT))

(defn -main [& args]
  (recur
    (println (rep (prompt/read-input "user> ")))))
