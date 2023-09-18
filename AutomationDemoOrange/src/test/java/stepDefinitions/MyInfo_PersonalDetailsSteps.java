package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pages.MyInfo_PersonalDetailsPage;
import utilities.DriverManager;

import java.util.List;

public class MyInfo_PersonalDetailsSteps {
    MyInfo_PersonalDetailsPage myInfoPersonalDetailsPage = new MyInfo_PersonalDetailsPage(DriverManager.getDriver().driver);

    @And("Los detalles personales deberian mostrarse")
    public void verifyPersonalDetailsIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assertions.assertTrue(myInfoPersonalDetailsPage.personalDetailsTitleIsDisplayed());
        Thread.sleep(5000);
    }
    @And("Relleno los detalles personales con")
    public void fillPersonalDetails(DataTable personalDetails) throws InterruptedException {
        List<String> data = personalDetails.transpose().asList(String.class);
        myInfoPersonalDetailsPage.setMiddleNameTextBox(data.get(0));
        myInfoPersonalDetailsPage.setNickNameTextBox(data.get(1));
        myInfoPersonalDetailsPage.setOtherIdTextBox(data.get(2));
        myInfoPersonalDetailsPage.setDriverLicenseNumberTextBox(data.get(3));
        myInfoPersonalDetailsPage.setLicenseExpiryDateTextBox(data.get(4));
        myInfoPersonalDetailsPage.setSsnNumberTextBox(data.get(5));
        myInfoPersonalDetailsPage.setSinNumberTextBox(data.get(6));
        Thread.sleep(3000);

    }
    @And("Doy click en el boton guardar detalles generales")
    public void clickOnSaveButtonGeneralDetails(){
        myInfoPersonalDetailsPage.clickOnSaveButton();
    }
    @And("Verifico los siguientes datos en la pagina de Datos Personales")
    public void verifyInformationPersonalDetails(DataTable personalDetails){
        List<String> data = personalDetails.transpose().asList(String.class);
        Assertions.assertEquals(myInfoPersonalDetailsPage.getMiddleNameTextBox(), data.get(0));
        Assertions.assertEquals(myInfoPersonalDetailsPage.getNickNameTextBox(), data.get(1));
        Assertions.assertEquals(myInfoPersonalDetailsPage.getOtherIdTextBox(), data.get(2));
        Assertions.assertEquals(myInfoPersonalDetailsPage.getDriverLicenseNumberTextBox(), data.get(3));
        Assertions.assertEquals(myInfoPersonalDetailsPage.getLicenseExpiryDateTextBox(), data.get(4));
        Assertions.assertEquals(myInfoPersonalDetailsPage.getSsnNumberTextBox(), data.get(5));
        Assertions.assertEquals(myInfoPersonalDetailsPage.getSinNumberTextBox(), data.get(6));

    }
}
