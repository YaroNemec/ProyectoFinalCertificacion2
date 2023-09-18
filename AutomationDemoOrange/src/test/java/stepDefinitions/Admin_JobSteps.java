package stepDefinitions;

import io.cucumber.java.en.And;
import pages.Admin_JobPage;
import utilities.DriverManager;

public class Admin_JobSteps {

    Admin_JobPage adminJobEmploymentStatusPage = new Admin_JobPage(DriverManager.getDriver().driver);


    @And("Doy click en el user drop down")
    public void clickOnUserDrop() throws InterruptedException {
        Thread.sleep(5000);
        adminJobEmploymentStatusPage.clickOnUserDropDown();
    }

    @And("Doy click en el boton de Logout")
    public void clickOnLogout() throws InterruptedException {
        Thread.sleep(5000);
        adminJobEmploymentStatusPage.clickOnLogoutSelect();
    }

}
