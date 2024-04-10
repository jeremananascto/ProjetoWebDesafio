# Desafio Técnico Web

Este é o projeto Desafio Técnico Web, que contém uma automação para testes web utilizando Selenium e Cucumber. Este README fornece uma visão geral do projeto, suas dependências e como configurar e executar os testes.

## Requisitos

Certifique-se de ter o seguinte software instalado em seu sistema:

- Java Development Kit (JDK) versão 11 ou superior
- Maven

## Configuração do Projeto

Para configurar o projeto em sua máquina local, siga estas etapas:

1. Clone este repositório em sua máquina local:
   ```bash
   git clone https://exemplo.com/seu-repositorio.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd Desafio-tecnico-web
   ```

## Dependências

Este projeto utiliza várias dependências Maven para facilitar o desenvolvimento e execução dos testes. Algumas das principais dependências incluem:

- [Selenium](https://www.selenium.dev/): Uma ferramenta de automação de navegador web.
- [Cucumber](https://cucumber.io/): Uma ferramenta de automação de teste que suporta Behavior Driven Development (BDD).
- [Lombok](https://projectlombok.org/): Uma biblioteca Java que ajuda a reduzir o código boilerplate.
- [Java Faker](https://github.com/DiUS/java-faker): Uma biblioteca Java útil para gerar dados falsos.
- [Cluecumber Report Plugin](https://github.com/trivago/cluecumber-report-plugin): Um plugin Maven para gerar relatórios de teste baseados em Cucumber.

## Executando os Testes

Para executar os testes do projeto, utilize o comando Maven:

```bash
Acessar a arvore do projeto na pasta "test" em "java" e na package Runner executar a java class "RunCucumbertest"  

```

Este comando executará todos os testes incluídos no projeto.

## Gerando Relatórios

Este projeto está configurado para gerar relatórios de teste utilizando o plugin Cluecumber Report. Para gerar e visualizar os relatórios, execute o seguinte comando Maven:

```bash
mvn cluecumber-report:reporting
```

Isso gerará relatórios HTML formatados e os colocará no diretório `target/formated-report`.

## Contribuição

Se você quiser contribuir para este projeto, sinta-se à vontade para enviar um pull request. Antes de enviar um pull request, certifique-se de seguir as diretrizes de contribuição.

## Suporte

Se você tiver dúvidas ou encontrar problemas ao usar este projeto, abra uma issue no repositório ou entre em contato com a equipe de desenvolvimento.

## Licença



