#language:pt
#Author:Jeremias Nascimento
#Encoding:UTF-8

@compra-de-produtos
Funcionalidade: Compra de produtos no automationpractice.pl/index.php

  Como um cliente cadastrado
  Eu quero fazer a compra de ao menos três produtos
  Para que eu possa estar bem vestida
 @compra
  Cenario: Compra de tres produtos

    Dado que eu esteja na pagina do ecomerce
    E esteja cadastrado e logado
    Quando adiciono tres produtos ao carrinho
    E finalizo a compra
    Entao devo receber uma confirmação de pedido