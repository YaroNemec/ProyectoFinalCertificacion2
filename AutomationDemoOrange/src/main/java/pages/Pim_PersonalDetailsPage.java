package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pim_PersonalDetailsPage {

    WebDriver driver;

    @FindBy(xpath = "//a[text()='Employee List']")
    WebElement employeeListButton;

    public Pim_PersonalDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnEmployeeListButton(){
        employeeListButton.click();
    }


}
