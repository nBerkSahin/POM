package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoalaResort {

    public WebDriver driver;

    public KoalaResort(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText = "Log in" )
    public WebElement ilkLoginLink;

    @FindBy(id = "Password")
    public WebElement pass;

    @FindBy(id="UserName")
    public WebElement username;

    @FindBy(id="details-button")
    public WebElement details;

    @FindBy(id="proceed-link")
    public WebElement proceedLink;

    @FindBy(id="btnSubmit")
    public WebElement buttonSubmit;

    @FindBy(id="divMessageResult")
    public WebElement wrongMessage;


}
