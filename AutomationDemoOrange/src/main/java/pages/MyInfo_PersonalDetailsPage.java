package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class MyInfo_PersonalDetailsPage {
    WebDriver driver;

    @FindBy(xpath = "//h6[text()='Personal Details']")
    WebElement personalDetailsTitle;

    @FindBy(name = "middleName")
    WebElement middleNameTextBox;

    @FindBy(name = "lastName")
    WebElement lastNameTextBox;

    //@FindBy(xpath = "(//input[@class = 'oxd-input oxd-input--active'])[2]")
    @FindBy(xpath = "//label[text()='Nickname']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    WebElement nickNameTextBox;

    @FindBy(xpath = "//label[text()='Employee Id']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")

    WebElement employeeIdTextBox;

    @FindBy(xpath = "//label[text()='Other Id']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    WebElement otherIdTextBox;

    @FindBy(xpath = "//label[text()=\"Driver's License Number\"]/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    WebElement driverLicenseNumberTextBox;

    @FindBy(xpath = "//label[text()='License Expiry Date']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/div/div/input[@class='oxd-input oxd-input--active']")
    WebElement licenseExpiryDateTextBox;

    @FindBy(xpath = "//label[text()='SSN Number']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    WebElement ssnNumberTextBox;

    @FindBy(xpath = "//label[text()='SIN Number']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/input[@class='oxd-input oxd-input--active']")
    WebElement sinNumberTextBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement saveButton;


    public MyInfo_PersonalDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean personalDetailsTitleIsDisplayed(){
        boolean personalInfoTitleIsDisplayed = personalDetailsTitle.isDisplayed();
        return personalInfoTitleIsDisplayed;
    }

    public void setMiddleNameTextBox(String middleNme){
        middleNameTextBox.sendKeys(middleNme);
    }

    public String getMiddleNameTextBox(){
        String getTextmiddle = middleNameTextBox.getAttribute("value");
        return getTextmiddle;
    }

    public void setNickNameTextBox(String nickName){
        nickNameTextBox.clear();
        nickNameTextBox.sendKeys(nickName);
    }

    public String getNickNameTextBox(){
        String getNickName = nickNameTextBox.getAttribute("value");
        return getNickName;
    }

    public void setOtherIdTextBox(String otherId){
        otherIdTextBox.clear();
        otherIdTextBox.sendKeys(otherId);
    }

    public String getOtherIdTextBox(){
        String getOtherId = otherIdTextBox.getAttribute("value");
        return getOtherId;
    }

    public void setDriverLicenseNumberTextBox(String driverLicenseNumber){
        driverLicenseNumberTextBox.clear();
        driverLicenseNumberTextBox.sendKeys(driverLicenseNumber);
    }

    public String getDriverLicenseNumberTextBox(){
        String getDriverLicenseNumber = driverLicenseNumberTextBox.getAttribute("value");
        return getDriverLicenseNumber;
    }

    public void setLicenseExpiryDateTextBox(String licenseExpiryDate){
        licenseExpiryDateTextBox.clear();
        licenseExpiryDateTextBox.sendKeys(licenseExpiryDate);
    }

    public String getLicenseExpiryDateTextBox(){
        String getLicenseExpiryDate = licenseExpiryDateTextBox.getAttribute("value");
        return getLicenseExpiryDate;
    }

    public void setSsnNumberTextBox(String ssnNumber){
        ssnNumberTextBox.clear();
        ssnNumberTextBox.sendKeys(ssnNumber);
    }

    public String getSsnNumberTextBox(){
        String getSsnNumber = ssnNumberTextBox.getAttribute("value");
        return getSsnNumber;
    }

    public void setSinNumberTextBox(String sinNumber){
        sinNumberTextBox.clear();
        sinNumberTextBox.sendKeys(sinNumber);
    }

    public String getSinNumberTextBox(){
        String getSinNumber = sinNumberTextBox.getAttribute("value");
        return getSinNumber;
    }

    public void clickOnSaveButton(){
        saveButton.click();
    }


}
