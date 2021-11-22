package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConcortHptelPage {

    WebDriver driver;

    public ConcortHptelPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Log in" )
    public WebElement ilkLoginLink;

    @FindBy(id = "Password")
    public WebElement pass;

    @FindBy(id="UserName")
    public WebElement username;

    @FindBy(id="btnSubmit")
    public WebElement buttonSubmit;


}
