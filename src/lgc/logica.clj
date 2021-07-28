(ns lgc.logica)

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
