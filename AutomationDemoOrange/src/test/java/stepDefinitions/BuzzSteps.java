package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.BuzzPage;
import utilities.DriverManager;

public class BuzzSteps {

    BuzzPage buzzPage = new BuzzPage(DriverManager.getDriver().driver);

    @And("Escribo el mensaje {string} para postearlo")
    public void setPostMessageTextBox(String postMessage) throws InterruptedException {
        Thread.sleep(3000);
        buzzPage.setPostTextBox(postMessage);
    }
    @And("Doy click en Post Button")
    public void clickOnPostBuzzon() throws InterruptedException{
        Thread.sleep(3000);
        buzzPage.clickOnBuzzButton();
    }
    @Then("Verifico que el mensaje {string} se haya posteado el mensaje en la buzz page")
    public void verifycorrectMessageIsDisplayed(String message)throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertEquals(buzzPage.messagePostIsDisplayed(),message);
    }
}
