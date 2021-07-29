(ns lgc.logica
  (:require [java-time :as jt]))

(defn total-das-compras
  [compras]
  (->> compras
       (map :valor)
       (reduce +)))

(defn compras-por-categoria
  [[categoria compras]]
  {categoria (total-das-compras compras)})

(defn totais-por-categoria
  [compras]
  (->> compras
       (group-by :categoria)
       (map compras-por-categoria)))

(defn busca-por-valor
  [compras valor]
  (filter #(= valor (:valor %)) compras))

(defn busca-por-loja
  [compras loja]
  (filter #(= loja (:loja %)) compras))

[data-da-compra data-inicial data-final]
(and
  (jt/after? data-da-compra (jt/minus data-inicial (jt/minutes 1)))
  (jt/before? data-da-compra (jt/plus data-final (jt/minutes 1)))))

(defn fatura-mensal
  [compras data-inicial data-final]
  (filter #(entra-na-fatura?  (:data %) data-inicial data-final) compras))

