package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.DataFaker;
import support.Utils;

public class ConfirmationPage extends RunCucumberTest {

    private By Pay_ByBank = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    private By confirmOrder = By.cssSelector("#cart_navigation > button");
    private By textoConfirm = By.cssSelector("#center_column > p.alert.alert-success");


    public void clickPaybank() {
        Utils.waitElementBeVisible(Pay_ByBank, 5);
        getDriver().findElement(Pay_ByBank).click();
    }


    public void clickConfirmOrder() {
        Utils.waitElementBeVisible(confirmOrder, 5);
        getDriver().findElement(confirmOrder).click();

    }

    public void ValidarMensagemDeconfirmacaoDeOrdem() {
        String textoesperado = getDriver().findElement(textoConfirm).getText();
        String textoaetual = "Your order on My Shop is complete.";
        Assert.assertEquals(textoesperado, textoaetual);

    }
}