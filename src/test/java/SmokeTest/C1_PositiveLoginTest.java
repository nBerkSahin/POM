package SmokeTest;

import Pages.KoalaResort;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class C1_PositiveLoginTest extends TestBase {

//    Bir test method olustur positiveLoginTest()
//    http://qa-environment.koalaresorthotels.com adresine git login butonuna bas
//    test data username: manager ,
//    test data password : Manager1!
//    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


    @Test
    public void positiveLoginTest(){

        Faker faker = new Faker();
//http://qa-environment.koalaresorthotels.com adresine git login butonuna bas

        Driver.getDriver().get(ConfigReader.getProperty("koalaURL"));

        KoalaResort koalaResort = new KoalaResort();

        koalaResort.details.click();
        koalaResort.proceedLink.click();


        koalaResort.ilkLoginLink.click();

//test data username: manager
        koalaResort.username.sendKeys("manager");

//test data password : Manager1!
        koalaResort.pass.sendKeys("Manager1!");

//Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        koalaResort.buttonSubmit.click();

    }



}
