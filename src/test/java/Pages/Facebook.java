package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Facebook {

    WebDriver driver;

public Facebook(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver, this);
}

@FindBy(id="email")
    public WebElement mailkutusu;

@FindBy(id="pass")
    public WebElement sifrekutusu;

@FindBy(name="login")
    public WebElement loginkutusu;

@FindBy(className = "_9ay7")
public  WebElement girilmediyazı;

public void cookiesgec(){
    driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\']")).click();

}


}

