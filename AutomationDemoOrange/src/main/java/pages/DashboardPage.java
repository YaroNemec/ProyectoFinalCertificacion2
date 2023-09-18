package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardTitle;

    //@FindBy(xpath = "//a[@href = '/web/index.php/pim/viewMyDetails']")
    //WebElement myInfoButton;

    //@FindBy(xpath = "//a[@href = '/web/index.php/admin/viewAdminModule']")
    //WebElement adminButton;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean pageDashboardTitleIsDisplayed(){
        boolean pageTitleDashBoardIsDisplayed = dashboardTitle.isDisplayed();
        return pageTitleDashBoardIsDisplayed;
    }

    public void clickOnMyInfoButton(){

        WebElement myInfoButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = '/web/index.php/pim/viewMyDetails']")));

        myInfoButton.click();
    }

    public void clickOnAdminButton(){
        //waiter
        WebElement adminButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = '/web/index.php/admin/viewAdminModule']")));

        adminButton.click();
    }

    public void clickOnPIMButton(){
        WebElement pimButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));

        pimButton.click();
    }

    public void clickOnBuzzButton(){
        WebElement buzzButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, 'uzz')]")));

        buzzButton.click();
    }

}
