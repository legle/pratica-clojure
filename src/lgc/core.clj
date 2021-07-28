(ns lgc.core
  (:require [lgc.dados :as dados]
            [lgc.logica :as logica]))

(println logica/totais-por-categoria dados/compras)