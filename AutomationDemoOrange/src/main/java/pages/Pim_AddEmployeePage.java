package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pim_AddEmployeePage {

    WebDriver driver;

    @FindBy(name = "firstName")
    WebElement firstNameEmployeeTextBox;

    @FindBy(name = "middleName")
    WebElement middleNameEmployeeTextBox;

    @FindBy(name = "lastName")
    WebElement lastNameEmployeeTextBox;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement employeeIdTextBox;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]")
    WebElement saveButton;

    public Pim_AddEmployeePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstNameEmployeeTextBox(String firstNameEmployee){
        firstNameEmployeeTextBox.sendKeys(firstNameEmployee);
    }

    public void setMiddleNameEmployeeTextBox(String middleNameEmployee){
        middleNameEmployeeTextBox.sendKeys(middleNameEmployee);
    }

    public void setLastNameEmployeeTextBox(String lastNameEmployee){
        lastNameEmployeeTextBox.sendKeys(lastNameEmployee);
    }

    public void setEmployeeIdTextBox(String employeeId){
        employeeIdTextBox.clear();
        employeeIdTextBox.sendKeys(employeeId);
    }

    public void clickOnSaveButton(){
        saveButton.click();
    }
}
