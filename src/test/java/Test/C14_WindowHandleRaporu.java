package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utilities.Driver;
import Utilities.ReusableMethods;
import Utilities.TestBaseRapor;
public class C14_WindowHandleRaporu extends TestBaseRapor {

    @Test
    public void test(){

        extentTest=extentReports.createTest("window handle test","yeni sayfada window handle değeri");
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("istenen adrese gidildi");

        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        extentTest.info("linke tıklandı");

        ReusableMethods.switchToWindow("New Window");
        extentTest.info("yeni sayfaya geçildi");

        WebElement newWindowYaziElementi=Driver.getDriver().findElement(By.tagName("h3"));
        extentTest.info("test edeceğimiz yer locate edildi");

        Assert.assertTrue(newWindowYaziElementi.isDisplayed());
        extentTest.info("yazının görünür olduğu test edildi");


    }

}
