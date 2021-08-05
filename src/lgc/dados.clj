(ns lgc.dados)
(use 'java-time)

(def cliente1 {:id 1
               :nome "Leonardo"
               :cpf "12332112332"
               :email "leonardo.gleison@nubank.com.br"
               :cartoes [
                         {:numero "0001"
                          :cvv "123"
                          :validade "2029-04"
                          :limite 5000.00}]})

(def compra1 {:data (local-date-time 2021 05 01 0 00)
              :valor 12.12
              :loja "Mercadinho pururuca"
              :categoria "alimentação"
              :cliente (dissoc cliente1 :cartoes)
              :cartao (get-in cliente1 [:cartoes 0])})

(def compra2 {:data (local-date-time 2021 05 10 8 34)
              :valor 127.41
              :loja "bar do zé"
              :categoria "Bebidas"
              :cliente (dissoc cliente1 :cartoes)
              :cartao (get-in cliente1 [:cartoes 0])})

(def compra3 {:data (local-date-time 2021 05 12 8 34)
              :valor 12.12
              :loja "Mercadinho pururuca"
              :categoria "alimentação"
              :cliente (dissoc cliente1 :cartoes)
              :cartao (get-in cliente1 [:cartoes 0])})

(def compra4 {:data (local-date-time 2021 05 15 8 34)
              :valor 12.12
              :loja "Mercadinho pururuca"
              :categoria "alimentação"
              :cliente (dissoc cliente1 :cartoes)
              :cartao (get-in cliente1 [:cartoes 0])})

(def compra5 {:data (local-date-time 2021 05 17 8 34)
              :valor 12.12
              :loja "Mercadinho pururuca"
              :categoria "alimentação"
              :cliente (dissoc cliente1 :cartoes)
              :cartao (get-in cliente1 [:cartoes 0])})

(def compras [compra1 compra2 compra3 compra4 compra5])
