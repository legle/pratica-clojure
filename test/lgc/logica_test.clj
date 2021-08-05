(ns lgc.logica-test
  (:require [clojure.test :refer :all]
            [lgc.logica :refer :all]
            [lgc.dados :refer :all]))

(deftest adiciona-compra-test
  (testing "Testando novas compras"
    (is (= (count (adiciona-compra compras compra1)) 6))))

(deftest compras-por-categoria-test
  [compras]
  (testing "Teste de agrupamento por categoria das compras"
    (is (= 48.48 (:alimentação (first (totais-por-categoria compras)))))))


;(println (totais-por-categoria compras))
;(println (:alimentação (first (totais-por-categoria compras))))
;(println (:alimentação (totais-por-categoria compras)))