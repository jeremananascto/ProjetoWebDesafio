$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/compradeprodutos.feature");
formatter.feature({
  "name": "Compra de produtos no automationpractice.pl/index.php",
  "description": "  Como um cliente cadastrado\n  Eu quero fazer a compra de ao menos três produtos\n  Para que eu possa estar bem vestida",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@compra-de-produtos"
    }
  ]
});
formatter.scenario({
  "name": "Compra de tres produtos",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@compra-de-produtos"
    },
    {
      "name": "@compra"
    }
  ]
});
formatter.step({
  "name": "que eu esteja na pagina do ecomerce",
  "keyword": "Dado "
});
formatter.match({
  "location": "CompraDeProdutosSteps.que_eu_esteja_na_pagina_do_ecomerce()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "esteja cadastrado e logado",
  "keyword": "E "
});
formatter.match({
  "location": "CompraDeProdutosSteps.esteja_cadastrado_e_logado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adiciono tres produtos ao carrinho",
  "keyword": "Quando "
});
formatter.match({
  "location": "CompraDeProdutosSteps.adiciono_tres_produtos_ao_carrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "finalizo a compra",
  "keyword": "E "
});
formatter.match({
  "location": "CompraDeProdutosSteps.finalizo_a_compra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo receber uma confirmação de pedido",
  "keyword": "Entao "
});
formatter.match({
  "location": "CompraDeProdutosSteps.devo_receber_uma_confirmação_de_pedido()"
});
formatter.result({
  "status": "passed"
});
});