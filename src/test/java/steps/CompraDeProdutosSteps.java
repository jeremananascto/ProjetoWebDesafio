package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.*;
import runner.RunCucumberTest;

public class CompraDeProdutosSteps extends RunCucumberTest {

    HomePage homePage = new HomePage();
    CadastroPage cadastroPage = new CadastroPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();


    @Dado("^que eu esteja na pagina do ecomerce$")
    public void que_eu_esteja_na_pagina_do_ecomerce() throws Exception {
        homePage.acessarAplicacao();
        homePage.clicarBotaoSignIn();
        homePage.verificarCarregamentoAuthentication();
        homePage.preencherEmail();
        homePage.clicarBotaoCreateAccount();
        homePage.validarCarregamentoPaginaDeCadastro();

    }

    @Dado("^esteja cadastrado e logado$")
    public void esteja_cadastrado_e_logado() throws Exception {
        cadastroPage.preencherTitle();
        cadastroPage.preencherCampoFirstName();
        cadastroPage.preencherCampoLastName();
        cadastroPage.verificarCampoEmail();
        cadastroPage.preencherCampoPassword();
        cadastroPage.preencherCampoDateOfBirth();
        cadastroPage.clicarBotaoRegister();
        cadastroPage.validarMensagemCadstroConcluido();


    }

    @Quando("^adiciono tres produtos ao carrinho$")
    public void adiciono_tres_produtos_ao_carrinho() throws Exception {
        cartPage.clicarNoBotaoDresses();
        cartPage.verificarCarregamentoPaginaDresses();
        cartPage.clicarProdutoPrintedChiffonDress();
        cartPage.validarTelaDoProdutoPrintedChiffonDress();
        cartPage.preencherCampoSizePrintedChiffonDress();
        cartPage.validarCampoQuantityPrintedChiffonDress();
        cartPage.selecionarCorPrintedChiffonDress();
        cartPage.adicionarPrintedChiffonDressAoCarrinho();
        //cartPage.validarAdicaoPrintedChiffonDressAoCarrinho();
        cartPage.clicarNobotaoContinueShoppingPrintedChiffonDress();
        cartPage.clicarNobotaoTshirts();
        cartPage.verificarCarregamentoPaginaTshirts();
        cartPage.clicarProdutoFadedShortSleeveTshirt();
        cartPage.validarTelaDoProdutoFadedShortSleeveTshirt();
        cartPage.preencherCampoSizeFadedShortSleeveTshirt();
        cartPage.validarCampoQuantityFadedShortSleeveTshirt();
        cartPage.selecionarCorFadedShortSleeveTshirt();
        cartPage.clicarNoBotaoBlouse();
        cartPage.verificarCarregamentoPaginaBlouses();
        cartPage.clicarProdutoBlouses();
        cartPage.preencherCampoSizeBlouses();
        cartPage.preencherCampoQuantityBlouse();
        cartPage.selecionarCorBlouse();
        cartPage.adicionarBlouseAoCarrinho();
        cartPage.clicarNobotaoContinueShoppingBlouse();
        cartPage.clicarNoBotaoDressesPrintedDress();
        cartPage.verificarCarregamentoPaginaPrintedDress();
        cartPage.clicarProdutoPrintedDress();
        cartPage.validarTelaDoProdutoPrintedDress();
        cartPage.validarMensagemDeEstoqueindisponivelPrintedDress();
        cartPage.clicarNoCarrinho();
    }

    @Quando("^finalizo a compra$")
    public void finalizo_a_compra() throws Exception {
        checkoutPage.validarTelaDocarrinho();
        checkoutPage.validarPresencaDoSummary();
        checkoutPage.validarQuantidadeDeProdutsoNocarrinho();
        checkoutPage.clicarBotaoCheckout();
        checkoutPage.preencherCampoFirstName();
        checkoutPage.preencherCampoLastName();
        checkoutPage.preencherCampoCompany();
        checkoutPage.preencherCampoAdress();
        checkoutPage.preencherCampoAdressLine();
        checkoutPage.preencherCampoCity();
        checkoutPage.preencherCampoState();
        checkoutPage.preencherCampoPostCode();
        checkoutPage.preencherCampoCountry();
        checkoutPage.preencherCampoMobilePhone();
        checkoutPage.preencherCampoMyAdress();
        checkoutPage.clicarBtnSalvar();
        checkoutPage.clicarBtnProceddCheckout();
        checkoutPage.aceitarTermos();
          checkoutPage.btnCheck();





    }

    @Entao("^devo receber uma confirmação de pedido$")
    public void devo_receber_uma_confirmação_de_pedido() throws Exception {
        confirmationPage.clickPaybank();
        confirmationPage.clickConfirmOrder();
        confirmationPage.ValidarMensagemDeconfirmacaoDeOrdem();


    }

}
