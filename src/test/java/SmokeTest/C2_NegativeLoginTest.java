package SmokeTest;

import Pages.KoalaResort;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C2_NegativeLoginTest extends TestBase {

//1) smokeTest paketi altinda yeni bir Class olustur: NegativeTest 3 Farkli test Methodunda 3 senaryoyu test et
//- yanlisSifre
//- yanlisKulllanici
//- yanlisSifreKullanici
//    test data yanlis username: manager1 , yanlis password : manager1!
//2) http://qa-environment.koalaresorthotels.com adresine git
//3) Login butonuna bas
//4) Verilen senaryolar ile giris yapilamadigini test et

    @Test
    public void wrongPassTest(){

//http://qa-environment.koalaresorthotels.com adresine git login butonuna bas

        Driver.getDriver().get(ConfigReader.getProperty("koalaURL"));

        KoalaResort koalaResort = new KoalaResort();

        koalaResort.details.click();
        koalaResort.proceedLink.click();
        koalaResort.ilkLoginLink.click();

//- yanlisSifre
        koalaResort.username.sendKeys("manager");
        koalaResort.pass.sendKeys("xxxxx");
        koalaResort.buttonSubmit.click();

        Assert.assertTrue(koalaResort.wrongMessage.isDisplayed());

    }

    @Test
    public void wrongUser(){

//http://qa-environment.koalaresorthotels.com adresine git login butonuna bas

        Driver.getDriver().get(ConfigReader.getProperty("koalaURL"));

        KoalaResort koalaResort = new KoalaResort();

//        koalaResort.details.click();
//        koalaResort.proceedLink.click();
//        koalaResort.ilkLoginLink.click();

//- yanlisKulllanici
        koalaResort.username.sendKeys("xxxxxxxx");
        koalaResort.pass.sendKeys("manager1!");
        koalaResort.buttonSubmit.click();

        Assert.assertTrue(koalaResort.wrongMessage.isDisplayed());

    }

    @Test
    public void wrongPassWrongUser(){

//http://qa-environment.koalaresorthotels.com adresine git login butonuna bas

        Driver.getDriver().get(ConfigReader.getProperty("koalaURL"));

        KoalaResort koalaResort = new KoalaResort();

//        koalaResort.details.click();
//        koalaResort.proceedLink.click();
//        koalaResort.ilkLoginLink.click();

//- yanlisSifreKullanici
        koalaResort.username.sendKeys("xxxxxxxx");
        koalaResort.pass.sendKeys("xxxxxxxx");
        koalaResort.buttonSubmit.click();

        Assert.assertTrue(koalaResort.wrongMessage.isDisplayed());

        Driver.closeDriver();
    }


}
