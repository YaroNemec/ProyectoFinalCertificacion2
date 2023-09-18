package stepDefinitions;

import io.cucumber.java.en.And;
import pages.PimPage;
import utilities.DriverManager;

public class UserExistance {

    PimPage pimPage = new PimPage(DriverManager.getDriver().driver);

    @And("Le doy click al boton Add en la pagina de PIM")
    public void clickAddButton() throws InterruptedException {
        Thread.sleep(5000);
        pimPage.clickOnAddButton();
    }


    @And("Relleno el campo de nombre con {string}")
    public void setEmployeeNameEnElCampo(String employeeName) throws InterruptedException {
        Thread.sleep(5000);
        pimPage.setEmployeeNameTextBox(employeeName);
    }

    @And("Doy click al boton buscar")
    public void clickBotonBuscar() throws InterruptedException {
        Thread.sleep(5000);
        pimPage.clickOnSearchButton();
    }

    @And("Verifico nombre de empleado {string}")
    public void verifyIsFirstMiddleNameDisplayed(String firstMiddleName) throws InterruptedException {
        Thread.sleep(5000);
        pimPage.isFirstMiddleNameDisplayed(firstMiddleName);
    }


}
