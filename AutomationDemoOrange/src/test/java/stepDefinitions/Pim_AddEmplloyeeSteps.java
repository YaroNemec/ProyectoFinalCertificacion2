package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Pim_AddEmployeePage;
import utilities.DriverManager;

import java.util.List;

public class Pim_AddEmplloyeeSteps {

    Pim_AddEmployeePage pimAddEmployeePage = new Pim_AddEmployeePage(DriverManager.getDriver().driver);

    @And("Lleno los datos de add Employe con")
    public void fillInformationAddEmployee(DataTable addEmployee) throws InterruptedException {
        Thread.sleep(5000);
        List<String> data = addEmployee.transpose().asList(String.class);

        pimAddEmployeePage.setFirstNameEmployeeTextBox(data.get(0));
        pimAddEmployeePage.setMiddleNameEmployeeTextBox(data.get(1));
        pimAddEmployeePage.setLastNameEmployeeTextBox(data.get(2));
        pimAddEmployeePage.setEmployeeIdTextBox(data.get(3));

    }


    @Then("Doy click en el boton guardar Empleado")
    public void clickBotonGuardar() throws InterruptedException {
        Thread.sleep(5000);
        pimAddEmployeePage.clickOnSaveButton();
    }


}
