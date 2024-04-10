package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CartPage extends RunCucumberTest {
    private By botaoDresses = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private By textoDresses = By.cssSelector("#center_column > div.content_scene_cat > div > div > span");
    private By produtoPrintedChilfonDress = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[2]/h5/a");
    private By textoPrintedChiffonDress = By.cssSelector("#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1");
    private By quantityPrintedChiffonDress = By.id("quantity_wanted");
    private By sizePrintedChiffonDress = By.cssSelector("#group_1 > option:nth-child(2)");
    private By corVerdePrintedChiffonDress = By.id("color_15");
    private By botaoSubmitPrintedChiffonDress = By.name("Submit");
    private By textoDeConfirmacaocarrinho = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i");
    private By continueShoppingBotao = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span");

    private By botaoTshirts = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
    private By textoTshirts = By.cssSelector("#center_column > div.content_scene_cat > div > div > span");
    private By produtoFadedShortSleeveTshirt = By.cssSelector("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
    private By textoFadedShortSleeveTshirt = By.cssSelector("#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1");
    private By sizeFadedShortSleeveTshirt = By.cssSelector("#group_1 > option:nth-child(3)");
    private By quantityFadedShortSleeveTshirt = By.id("quantity_wanted");
    private By corAzulFadedShortSleeveTshirt = By.id("color_14");
    private By estoqueIndisponivelShortSleeveTshirt = By.cssSelector("#availability_value");

    private By botaoWoman = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a");
    private By opcaoBlouses = By.cssSelector("#block_top_menu > ul > li:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(2) > a");
    private By textoBluses = By.cssSelector("#center_column > div.content_scene_cat > div > div > span");
    private By produtoBlouse = By.cssSelector("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img");
    private By sizeBlouse = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option[2]");
    private By quantityBlouse = By.id("quantity_wanted");
    private By corPretoBlouse = By.id("color_11");
    private By botaoSubmitBlouse = By.name("Submit");
    private By continueShoppingBotaBlouse = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span");

    private By botaoDressesPrinteddress = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private By textoDressesPrinteddress = By.cssSelector("#center_column > div.content_scene_cat > div > div > span");
    private By produtoPrinteddress = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");
    private By estoqueIndisponivelPrintedDress = By.cssSelector("#availability_value");

    private By carrinho = By.cssSelector("#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a");


    public void clicarNoBotaoDresses() {
        Utils.waitElementBeVisible(botaoDresses, 5);
        getDriver().findElement(botaoDresses).click();

    }

    public boolean verificarCarregamentoPaginaDresses() {
        if (getDriver().findElement(textoDresses).isDisplayed()) {

            return true;
        } else {


            return false;


        }
    }

    public void clicarProdutoPrintedChiffonDress() {
        Utils.waitElementBeClickable(produtoPrintedChilfonDress, 5);

        Utils.scroll(produtoPrintedChilfonDress);
        getDriver().findElement(produtoPrintedChilfonDress).click();
    }

    public boolean validarTelaDoProdutoPrintedChiffonDress() {
        Utils.waitElementBeVisible(textoPrintedChiffonDress, 20);
        if (getDriver().findElement(textoPrintedChiffonDress).isDisplayed()) {
            return true;

        } else

            return false;


    }

    public void preencherCampoSizePrintedChiffonDress() {
        Utils.scroll(sizePrintedChiffonDress);
        Utils.waitElementBeVisible(sizePrintedChiffonDress, 20);

        getDriver().findElement(sizePrintedChiffonDress).click();


    }

    public void validarCampoQuantityPrintedChiffonDress() {
        Utils.waitElementBeVisible(quantityPrintedChiffonDress, 20);


        WebElement campo = getDriver().findElement((quantityPrintedChiffonDress));

        // Obter o valor do campo
        String valorCampo = campo.getAttribute("value");

        // Valor esperado
        String valorEsperado = "1";

        // Comparar o valor do campo com o valor esperado
        if (valorCampo.equals(valorEsperado)) {
            System.out.println("O campo está preenchido com o valor esperado.");
        } else {

            System.out.println("O campo não está preenchido com o valor esperado.");
        }
    }

    public void selecionarCorPrintedChiffonDress() {
        Utils.waitElementBeVisible(corVerdePrintedChiffonDress, 20);

        getDriver().findElement(corVerdePrintedChiffonDress).click();


    }

    public void adicionarPrintedChiffonDressAoCarrinho() {
        Utils.scroll(botaoSubmitPrintedChiffonDress);
        Utils.waitElementBeVisible(botaoSubmitPrintedChiffonDress, 20);

        getDriver().findElement(botaoSubmitPrintedChiffonDress).click();

    }

    public void validarAdicaoPrintedChiffonDressAoCarrinho() {

        String textoatual = "Product successfully added to your shopping cart";
        String textoEsperado = getDriver().findElement(textoDeConfirmacaocarrinho).getText();
        Assert.assertEquals(textoEsperado, textoatual);


    }

    public void clicarNobotaoContinueShoppingPrintedChiffonDress() {
        Utils.waitElementBeClickable(continueShoppingBotao, 5);
        getDriver().findElement(continueShoppingBotao).click();


    }

    public void clicarNobotaoTshirts() {
        Utils.waitElementBeClickable(botaoTshirts, 5);
        Utils.scroll(botaoTshirts);
        getDriver().findElement(botaoTshirts).click();


    }

    public boolean verificarCarregamentoPaginaTshirts() {
        Utils.waitElementBeVisible(textoTshirts, 20);
        if (getDriver().findElement(textoTshirts).isDisplayed()) {
            return true;

        } else
            return false;

    }

    public void clicarProdutoFadedShortSleeveTshirt() {
        Utils.waitElementBeClickable(produtoFadedShortSleeveTshirt, 5);

        Utils.scroll(produtoFadedShortSleeveTshirt);
        getDriver().findElement(produtoFadedShortSleeveTshirt).click();
    }

    public boolean validarTelaDoProdutoFadedShortSleeveTshirt() {
        Utils.waitElementBeVisible(textoFadedShortSleeveTshirt, 20);
        if (getDriver().findElement(textoFadedShortSleeveTshirt).isDisplayed()) {
            return true;

        } else

            return false;
    }

    public void preencherCampoSizeFadedShortSleeveTshirt() {
        Utils.scroll(sizeFadedShortSleeveTshirt);
        Utils.waitElementBeVisible(sizeFadedShortSleeveTshirt, 20);

        getDriver().findElement(sizeFadedShortSleeveTshirt).click();

    }

    public void validarCampoQuantityFadedShortSleeveTshirt() {
        Utils.waitElementBeVisible(quantityFadedShortSleeveTshirt, 20);


        WebElement campoTshirt = getDriver().findElement((quantityFadedShortSleeveTshirt));

        // Obter o valor do campo
        String valorCampo = campoTshirt.getAttribute("value");

        // Valor esperado
        String valorEsperado = "1";

        // Comparar o valor do campo com o valor esperado
        if (valorCampo.equals(valorEsperado)) {
            System.out.println("O campo está preenchido com o valor esperado.");
        } else {

            System.out.println("O campo não está preenchido com o valor esperado.");
        }

    }

    public void selecionarCorFadedShortSleeveTshirt() {
        Utils.waitElementBeVisible(corAzulFadedShortSleeveTshirt, 20);

        getDriver().findElement(corAzulFadedShortSleeveTshirt).click();


    }


    public void validarMensagemDeEstoqueindisponivel() {
        Utils.waitElementBeVisible(estoqueIndisponivelShortSleeveTshirt, 20);

        String esperado = getDriver().findElement(estoqueIndisponivelShortSleeveTshirt).getText();
        String atual = "This product is no longer in stock with those attributes but is available with others";

        Assert.assertEquals(atual, esperado);


    }


    public void clicarNoBotaoBlouse() {
        WebElement elemento =getDriver().findElement(botaoWoman);
        Utils.waitElementBeVisible(botaoWoman, 5);
        Utils.hover(elemento);
        Utils.waitElementBeVisible(opcaoBlouses, 5);
        getDriver().findElement(opcaoBlouses).click();

    }


    public boolean verificarCarregamentoPaginaBlouses() {
        if (getDriver().findElement(textoBluses).isDisplayed()) {

            return true;
        } else {


            return false;


        }
    }

    public void clicarProdutoBlouses() {
        Utils.waitElementBeClickable(produtoBlouse, 5);

        Utils.scroll(produtoBlouse);
        getDriver().findElement(produtoBlouse).click();
    }


    public void preencherCampoSizeBlouses() {
        Utils.waitElementBeVisible(sizeBlouse, 20);
        Utils.scroll(sizeBlouse);

        getDriver().findElement(sizeBlouse).click();


    }

    public void preencherCampoQuantityBlouse() {
        Utils.waitElementBeVisible(quantityBlouse, 30);
        getDriver().findElement(quantityBlouse).clear();
        Utils.waitElementBeVisible(quantityBlouse, 30);
        getDriver().findElement(quantityBlouse).sendKeys("2");


    }

    public void selecionarCorBlouse() {
        Utils.waitElementBeVisible(corPretoBlouse, 30);
        getDriver().findElement(corPretoBlouse).click();


    }

    public void adicionarBlouseAoCarrinho() {
        Utils.scroll(botaoSubmitBlouse);
        Utils.waitElementBeVisible(botaoSubmitBlouse, 20);

        getDriver().findElement(botaoSubmitBlouse).click();

    }

    public void validarAdicaoBlouse() {

        String textoatual = "Product successfully added to your shopping cart";
        String textoEsperado = getDriver().findElement(textoDeConfirmacaocarrinho).getText();
        Assert.assertEquals(textoEsperado, textoatual);


    }

    public void clicarNobotaoContinueShoppingBlouse() {
        Utils.waitElementBeClickable(continueShoppingBotaBlouse, 5);
        getDriver().findElement(continueShoppingBotaBlouse).click();


    }

    public void clicarNoBotaoDressesPrintedDress() {
        Utils.waitElementBeVisible(botaoDressesPrinteddress, 5);
        Utils.scroll(botaoDressesPrinteddress);
        getDriver().findElement(botaoDressesPrinteddress).click();

    }

    public boolean verificarCarregamentoPaginaPrintedDress() {
        if (getDriver().findElement(textoDressesPrinteddress).isDisplayed()) {

            return true;
        } else {


            return false;


        }
    }

    public void clicarProdutoPrintedDress() {
        Utils.waitElementBeClickable(produtoPrinteddress, 5);

        Utils.scroll(produtoPrinteddress);
        getDriver().findElement(produtoPrinteddress).click();
    }

    public boolean validarTelaDoProdutoPrintedDress() {
        Utils.waitElementBeVisible(textoPrintedChiffonDress, 20);
        if (getDriver().findElement(textoPrintedChiffonDress).isDisplayed()) {
            return true;

        } else

            return false;


    }


    public void validarMensagemDeEstoqueindisponivelPrintedDress() {
        Utils.waitElementBeVisible(estoqueIndisponivelPrintedDress, 20);
        Utils.scroll(estoqueIndisponivelPrintedDress);

        String esperado = getDriver().findElement(estoqueIndisponivelPrintedDress).getText();
        String atual = "This product is no longer in stock";

        Assert.assertEquals(atual, esperado);

    }

    public void clicarNoCarrinho(){
        Utils.waitElementBeVisible(carrinho, 20);
        Utils.scroll(carrinho);
        getDriver().findElement(carrinho).click();



    }

}