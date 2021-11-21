package Test;

import Pages.ConcortHptelPage;
import Utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C04_LoginPositive extends TestBase {

//1 ) Bir Class olustur : PositiveTest
//2) Bir test method olustur positiveLoginTest()
//http://qa-environment.koalaresorthotels.com adresine git
//login butonuna bas
//test data username: manager ,
//test data password : Manager1!
//Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

    @Test
    public void PositiveTest(){
        //http://qa-environment.koalaresorthotels.com adresine git
        driver.get("http://qa-environment.koalaresorthotels.com");

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();


        //login butonuna bas
        driver.findElement(By.id("navLogon")).click();

        //test data username: manager ,
        ConcortHptelPage concortHptelPage = new ConcortHptelPage(driver);
        concortHptelPage.username.sendKeys("manager");

        //test data password : Manager1!
        concortHptelPage.pass.sendKeys("Manager1!");

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        concortHptelPage.ilkLoginLink.click();



    }



}
