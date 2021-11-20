package Test;

import Pages.Amazon;
import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Pages extends TestBase {

    @Test
    public void test(){
        driver.get("https://www.amazon.com");
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("nutella"+ Keys.ENTER);
        WebElement sonucYazı = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazı.getText());
        Assert.assertTrue(sonucYazı.getText().contains("nutella"));

    }

    @Test
    public void testPOM(){
        driver.get("https://www.amazon.com");
        Amazon amazon = new Amazon(driver);
        amazon.aramakutusu.sendKeys("Nutella"+Keys.ENTER);
        System.out.println(amazon.sonucyazisiElemnti.getText());
        Assert.assertTrue(amazon.sonucyazisiElemnti.getText().contains("Nutella"));

    }






}
