package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverManager;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);

    @Given("Coloco como username {string}")
    public void setUserName(String userName) {
        //Thread.sleep(10000);
        loginPage.setUserNameTextBox(userName);
    }

    @And("Coloco de contraseña {string}")
    public void setPassword(String password) throws InterruptedException {
        //Thread.sleep(5000);
        loginPage.setPasswordTextBox(password);
    }

    @When("Le doy click al botón Login")
    public void clickOnLoginButton() throws InterruptedException {
        //Thread.sleep(5000);
        loginPage.clickOnLoginButton();
    }
}
