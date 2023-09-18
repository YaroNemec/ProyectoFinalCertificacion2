package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage {
    WebDriver driver;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])[1]")
    WebElement addButton;

    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement employeeNameTextBox;

    @FindBy(xpath = "(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]")
    WebElement searchButton;

    @FindBy(xpath = "(//div[@data-v-6c07a142=''])[2]")
    WebElement firstMiddleNameLabel;

    public PimPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddButton(){
        addButton.click();
    }



    public void setEmployeeNameTextBox(String employeeName){
        employeeNameTextBox.sendKeys(employeeName);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public boolean isFirstMiddleNameDisplayed(String firstMiddleName){
        if(firstMiddleNameLabel.getText().equalsIgnoreCase(firstMiddleName)){
            return true;
        }
        return false;
    }



}
