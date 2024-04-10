package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.DataFaker;
import support.Utils;

public class CheckoutPage extends RunCucumberTest {


    private By tituloCarrinho = By.cssSelector("#cart_title");
    private By sumarry = By.cssSelector("#order_step > li.step_current.first > span");
    private By quantidadeDeProdutos = By.cssSelector("#cart_title > span");
    private By botaoProcedCheckout = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    private By customerFirst_Name = By.id("firstname");
    private By customerLast_Name = By.id("lastname");
    private By customercompany = By.id("company");
    private By customerAdress = By.id("address1");
    private By customerAdress_Line_2 = By.id("address2");
    private By customerCity = By.id("city");
    private By customerState = By.cssSelector("#id_state > option:nth-child(4)");
    private By postCode = By.id("postcode");
    private By country = By.cssSelector("#id_country > option");
    private By mobile_Phone = By.id("phone_mobile");
    private By my_Adress = By.id("alias");
    private By btn_save = By.id("submitAddress");
    private By procedCheckoutbtn = By.cssSelector("#center_column > form > p > button");
    private By aceitarTermos = By.id("uniform-cgv");
    private By btncheck = By.cssSelector("#form > p > button");


    public void validarTelaDocarrinho() {
        getDriver().findElement(tituloCarrinho).isDisplayed();
    }

    public void validarPresencaDoSummary() {
        String textoesperado = getDriver().findElement(sumarry).getText();
        String textoaetual = "01. Summary";
        Assert.assertEquals(textoesperado, textoaetual);


    }

    public void validarQuantidadeDeProdutsoNocarrinho() {
        String textoesperado = getDriver().findElement(quantidadeDeProdutos).getText();
        String textoaetual = "Your shopping cart contains: 3 products";
        Assert.assertEquals(textoesperado, textoaetual);

    }

    public void clicarBotaoCheckout() {
        Utils.waitElementBeVisible(botaoProcedCheckout, 5);
        Utils.scroll(botaoProcedCheckout);
        getDriver().findElement(botaoProcedCheckout).click();
    }


    public void preencherCampoFirstName() {
        Utils.waitElementBeVisible(customerFirst_Name, 5);
        getDriver().findElement(customerFirst_Name).sendKeys(DataFaker.gerarRandomFirstName());
    }

    public void preencherCampoLastName() {
        Utils.waitElementBeVisible(customerLast_Name, 5);
        getDriver().findElement(customerLast_Name).sendKeys(DataFaker.gerarRandomLastName());
    }

    public void preencherCampoCompany() {
        Utils.waitElementBeVisible(customercompany, 5);
        getDriver().findElement(customercompany).sendKeys(DataFaker.gerarRandomCompany());
    }

    public void preencherCampoAdress() {
        Utils.waitElementBeVisible(customerAdress, 5);
        getDriver().findElement(customerAdress).sendKeys(DataFaker.gerarRandomAdress());
    }

    public void preencherCampoAdressLine() {
        Utils.waitElementBeVisible(customerAdress_Line_2, 5);
        getDriver().findElement(customerAdress_Line_2).sendKeys(DataFaker.gerarRandomAdress());
    }

    public void preencherCampoCity() {
        Utils.waitElementBeVisible(customerCity, 5);
        getDriver().findElement(customerCity).sendKeys(DataFaker.gerarRandomCity());
    }

    public void preencherCampoState() {
        Utils.waitElementBeVisible(customerState, 5);
        getDriver().findElement(customerState).click();
    }

    public void preencherCampoPostCode() {
        Utils.waitElementBeVisible(postCode, 5);
        getDriver().findElement(postCode).sendKeys("12345");
    }

    public void preencherCampoCountry() {
        Utils.waitElementBeVisible(country, 5);
        getDriver().findElement(country).click();
    }

    public void preencherCampoMobilePhone() {
        Utils.waitElementBeVisible(mobile_Phone, 5);
        getDriver().findElement(mobile_Phone).sendKeys(DataFaker.gerarRandomCellPhone());
    }


    public void preencherCampoMyAdress() {
        Utils.waitElementBeVisible(my_Adress, 5);
        getDriver().findElement(my_Adress).sendKeys("av sao camilo");
    }

    public void clicarBtnSalvar() {
        Utils.waitElementBeVisible(btn_save, 5);
        getDriver().findElement(btn_save).click();
    }

    public void clicarBtnProceddCheckout() {
        Utils.waitElementBeVisible(procedCheckoutbtn, 5);
        getDriver().findElement(procedCheckoutbtn).click();

    }


    public void aceitarTermos() {
        Utils.waitElementBeVisible(aceitarTermos, 5);
        getDriver().findElement(aceitarTermos).click();

    }

    public void btnCheck() {
        Utils.waitElementBeVisible(btncheck, 5);
        getDriver().findElement(btncheck).click();
    }
}