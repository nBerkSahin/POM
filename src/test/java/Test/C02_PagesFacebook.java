package Test;

import Pages.Facebook;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class C02_PagesFacebook extends TestBase {

    @Test
public void test(){
        driver.get("https://www.facebook.com");
        Facebook facebook = new Facebook(driver);
        facebook.cookiesgec();
        facebook.mailkutusu.sendKeys("ali@gmail.com");
        facebook.sifrekutusu.sendKeys("1234567");
        facebook.loginkutusu.click();


}


}
