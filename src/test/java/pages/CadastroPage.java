package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.DataFaker;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    private By emailAddressLocator = By.id("email_create");
    private By submitBtnLocator = By.id("SubmitCreate");
    private By emailLocator = By.id("email");
    private By alertAdditionalInformationLocator = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[11]");
    private By firstNameLocator = By.id("firstname");
    private By lastNameLocator = By.id("lastname");
    //Locators YOUR PERSONAL INFORMATION
    private By genderFemaleLocator = By.id("id_gender2");
    private By genderMascLocator = By.id("id_gender1");
    private By customerFirstNameLocator = By.id("customer_firstname");
    private By customerLastNameLocator = By.id("customer_lastname");
    private By passwordLocator = By.cssSelector("#passwd");
    private By daysLocator = By.id("days");
    private By monthsLocator = By.id("months");
    private By yearsLocator = By.id("years");
    private By newsletterLocator = By.id("newsletter");
    private By receiveOffersLocator = By.id("uniform-optin");
    //Locators YOUR ADDRESS
    private By companyLocator = By.id("company");
    private By address1Locator = By.id("address1");
    private By address2Locator = By.id("address2");
    private By cityLocator = By.id("city");
    private By stateLocator = By.id("id_state");
    private By postCodeLocator = By.id("postcode");
    private By countryLocator = By.id("id_country");
    private By additionalInformationLocator = By.name("other");
    private By homePhoneLocator = By.id("phone");
    private By mobilePhoneLocator = By.id("phone_mobile");
    private By futureAddressLocator = By.id("alias");
    private By registerBtnLocator = By.id("submitAccount");
    private By welcomeMessageLocator = By.cssSelector("#center_column > p");


    public void preencherTitle() {
        WebElement botaoMasc = getDriver().findElement(genderMascLocator);
        WebElement botaoFem = getDriver().findElement(genderFemaleLocator);

        if (botaoMasc.isDisplayed() && botaoMasc.isEnabled()) {
            botaoMasc.click();
        } else if (botaoFem.isDisplayed() && botaoFem.isEnabled()) {
            botaoFem.click();
        } else {
            // Tratar caso nenhum dos botões seja encontrado ou esteja habilitado
            System.out.println("Nenhum botão de gênero disponível ou habilitado.");
        }


    }


    public void preencherCampoFirstName() {
        Utils.waitElementBeVisible(customerFirstNameLocator, 5);
        getDriver().findElement(customerFirstNameLocator).sendKeys(DataFaker.gerarRandomFirstName());


    }

    public void preencherCampoLastName() {
        Utils.waitElementBeVisible(customerLastNameLocator, 5);
        getDriver().findElement(customerLastNameLocator).sendKeys(DataFaker.gerarRandomLastName());


    }


    public boolean verificarCampoEmail() {
        if (getDriver().findElement(emailLocator).isDisplayed()) {
            return true;
        } else
            return false;


    }

    public void preencherCampoPassword() {
        Utils.waitElementBeVisible(passwordLocator, 5);

        getDriver().findElement(passwordLocator).sendKeys("12314578");


    }

    public void preencherCampoDateOfBirth() {

        WebElement selectDia = getDriver().findElement(daysLocator);
        WebElement selectMes = getDriver().findElement(monthsLocator);
        WebElement selectAno = getDriver().findElement(yearsLocator);

        Select dropdownDia = new Select(selectDia);
        dropdownDia.selectByValue("5");

        Select dropdownMes = new Select(selectMes);
        dropdownMes.selectByValue("10");

        Select dropdownAno = new Select(selectAno);
        dropdownAno.selectByValue("2000");

    }


    public void clicarBotaoRegister() {
        getDriver().findElement(registerBtnLocator).click();


    }

    public void validarMensagemCadstroConcluido(){
        getDriver().findElement(welcomeMessageLocator).isDisplayed();
       String esperado =  getDriver().findElement(welcomeMessageLocator).getText();
       String atual = "Your account has been created.";
        Assert.assertEquals(atual,esperado);




    }
}
