(ns lgc.teste
  (:require [lgc.dados :as dados]
            [java-time :as jt]))

;(def pessoas [{:nome "Leonardo" :idade 33} {:nome "Camila" :idade 30} {:nome "Gustavo" :idade 1}])
;(def pessoas (update-in pessoas [2 :idade] #(= 4)))
;(println pessoas)


(defn saudacao
  [a]
  (println "Qual é o seu nome amigo?")
  (def nome (read-line))
    (println "Olá" nome))

(saudacao "a")