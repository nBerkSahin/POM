package Test;

import Pages.ConcortHptelPage;
import Utilities.ConfigReader;
import Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C05_LoginPositiveTestConfigReaderIle extends TestBase {

//    URL="https://www.concorthotel.com/ adresine git
//    login butonuna bas
//    test data username: manager1
//    test data password : manager1!
//    Degerleri girildiginde sayfaya girildigini test et

@Test
public void test(){
    //    URL="https://www.concorthotel.com/ adresine git
    driver.get(ConfigReader.getProperty("URL"));

    //    login butonuna bas
    ConcortHptelPage concortHptelPage = new ConcortHptelPage(driver);

    concortHptelPage.ilkLoginLink.click();

    //    test data username: manager1
    concortHptelPage.username.sendKeys(ConfigReader.getProperty("CHvalidUsername"));

    //    test data password : manager1!
    concortHptelPage.pass.sendKeys(ConfigReader.getProperty("CHValidPassword"));
    concortHptelPage.ilkLoginLink.click();

    //    Degerleri girildiginde sayfaya girildigini test et


}




}
