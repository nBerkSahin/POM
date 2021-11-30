package Test;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class C13_ReusableMethod {

    @Test
    public void Test(){
        // https://the-internet.herokuapp.com/windows adrese gidelim
        // click here yazisina basalim
        // yeni sayfada New Window yazisinin gorundugunu test edelim

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        Set<String> windowHandle=Driver.getDriver().getWindowHandles();

        String ikinciSayfaHandleDegeri="";
        for (String each: windowHandle){
            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        System.out.println(Driver.getDriver().getTitle());

        WebElement newWindowHandleElementi = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(newWindowHandleElementi.isDisplayed());

        Driver.closeDriver();

    }
    // II.WAY
        @Test
    public void testReusable(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        ReusableMethods.switchToWindow("New Window");
        WebElement newWindowYaziElementi = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(newWindowYaziElementi.isDisplayed());
        ReusableMethods.waitFor(5);


        }

}
