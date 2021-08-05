(ns lgc.model
  (:require [schema.core :as s]))

(def Cartao
  {:numero s/Str
   :cvv s/Str
   :validade s/Str
   :limite BigDecimal})

(def Cliente
  {:id      (s/pred pos-int? 'inteiro-positivo)
   :nome    s/Str
   :cpf     s/Str
   :email   s/Str
   :cartoes [Cartao]})

(def Compra
  {:data java.time.LocalDate
   :valor BigDecimal
   :loja s/Str
   :categoria s/Str
   :cliente Cliente
   :cartao Cartao})
