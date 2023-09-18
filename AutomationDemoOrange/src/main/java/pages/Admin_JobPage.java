package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_JobPage {

    WebDriver driver;

    @FindBy(className = "oxd-userdropdown-tab")
    WebElement userDropDown;

    @FindBy(linkText = "Logout")
    WebElement logoutSelect;

    public Admin_JobPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnUserDropDown(){
        userDropDown.click();
    }

    public void clickOnLogoutSelect(){
        logoutSelect.click();
    }
}
