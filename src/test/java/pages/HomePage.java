package pages;

import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.RunCucumberTest;
import support.DataFaker;
import support.Utils;


public class HomePage extends RunCucumberTest {

    private By login = By.className("login");
    private By validarTextocadastousuario = By.cssSelector("#center_column > h1");
    private By email = By.id("email_create");
    private By botaoSubmit = By.id("SubmitCreate");
    private By textoDescerScroll = By.cssSelector("#create-account_form > h3");
    private By textoTelaCadastro = By.cssSelector("#noSlide > h1");


    private String URL = "http://www.automationpractice.pl/index.php";

    public void acessarAplicacao() {
        getDriver("chrome").get(URL);
        //getDriver().manage().window().maximize();


    }

    public void clicarBotaoSignIn() {
        Utils.waitElementBeClickable(login, 30);
        getDriver().findElement(login).click();


    }

    public boolean verificarCarregamentoAuthentication() {
        if (getDriver().findElement(validarTextocadastousuario).isDisplayed()) {
            return true;
        } else
            return false;


    }

    public void preencherEmail() {
        Utils.waitElementBeClickable(email, 30);
        getDriver().findElement(email).sendKeys(DataFaker.gerarRandomEmail());

    }

    public void clicarBotaoCreateAccount(){
        Utils.scroll(textoDescerScroll);
        getDriver().findElement(botaoSubmit).click();






    }

    public boolean validarCarregamentoPaginaDeCadastro(){
        if (getDriver().findElement(textoTelaCadastro).isDisplayed()) {
            return true;
        } else
            return false;


    }



}