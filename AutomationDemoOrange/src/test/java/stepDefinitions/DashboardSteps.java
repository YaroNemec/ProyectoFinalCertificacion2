package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.DashboardPage;
import utilities.DriverManager;

public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver().driver);

    @Then("La pagina principal debería mostrarse")
    public void verificarDashboardPageIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assertions.assertTrue(dashboardPage.pageDashboardTitleIsDisplayed());
    }

    @Then("Doy click en My Info Button")
    public void clickOnButtonMyInfo() throws InterruptedException {
        //necesita un waiters
        Thread.sleep(5000);
        dashboardPage.clickOnMyInfoButton();
        //Thread.sleep(5000);
    }

    @Then("Doy click en el botón menu burguer de PIM")
    public void clickOnPimButton() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickOnPIMButton();
        Thread.sleep(5000);
    }

    @Then("Doy click en el buzz button")
    public void clickOnBuzzButton() throws InterruptedException {
        Thread.sleep(5000);
        dashboardPage.clickOnBuzzButton();
    }
}
