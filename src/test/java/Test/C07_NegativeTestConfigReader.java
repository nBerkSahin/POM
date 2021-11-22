package Test;

import Pages.ConcortHptelPage;
import Utilities.ConfigReader;
import Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C07_NegativeTestConfigReader extends TestBase {

//    Bir test method olustur NegativeLoginTest()
//    http://qa-environment.koalaresorthotels.com adresine git
//    login butonuna bas
//    test data username: manager1 ,
//    test data password : manager1!
//    Degerleri girildiginde sayfaya girilemedigini test et

    @Test
    public void NegativeLoginTest(){
        ConcortHptelPage concortHptelPage = new ConcortHptelPage(driver);
        driver.get(ConfigReader.getProperty("URL"));
        concortHptelPage.ilkLoginLink.click();
        concortHptelPage.username.sendKeys(ConfigReader.getProperty("CHInValidUsername"));
        concortHptelPage.pass.sendKeys(ConfigReader.getProperty("CHInValidPassword"));
        concortHptelPage.buttonSubmit.click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='validation-summary-errors']")).isDisplayed());

    }



}
