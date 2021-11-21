package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon {

    WebDriver driver;

    public Amazon(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramakutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small")
    public WebElement sonucyazisiElemnti;

    @FindBy(id="searchDropdownBox")
    public WebElement dropdownMenu;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    public WebElement ilkurunIsım;


}
