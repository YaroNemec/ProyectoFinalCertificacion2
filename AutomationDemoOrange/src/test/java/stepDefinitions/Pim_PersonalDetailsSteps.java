package stepDefinitions;

import io.cucumber.java.en.And;
import pages.Pim_PersonalDetailsPage;
import utilities.DriverManager;

public class Pim_PersonalDetailsSteps {

    Pim_PersonalDetailsPage pimPersonalDetailsPage = new Pim_PersonalDetailsPage(DriverManager.getDriver().driver);

    @And("Doy click en el boton de employeeList")
    public void clickBotonEmployeeList() throws InterruptedException {
        Thread.sleep(5000);
        pimPersonalDetailsPage.clickOnEmployeeListButton();
    }
}
