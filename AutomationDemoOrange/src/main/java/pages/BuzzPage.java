package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPage {

    WebDriver driver;

    //@FindBy(xpath = "//textarea[contains(@class, 'buzz')]")
    @FindBy(className = "oxd-buzz-post-input")
    WebElement postTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement postButton;
    @FindBy(xpath = "(//p[@class='oxd-text oxd-text--p orangehrm-buzz-post-body-text'])[1]")
    WebElement messageLabel;
    public BuzzPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setPostTextBox(String post){
        postTextBox.sendKeys(post);
    }
    public void clickOnBuzzButton() {postButton.click();
    }
    public String messagePostIsDisplayed(){
        String messagePost = messageLabel.getText();
        return messagePost;
        //boolean correctMessageIsDisplayed = messageLabel.isDisplayed();
        //return correctMessageIsDisplayed;
    }
}
