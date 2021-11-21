package Test;

import Pages.Amazon;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class C03_Pages_2 extends TestBase {

    @Test
    public void test(){
        driver.get("https://www.amazon.com/");
        Amazon amazon = new Amazon(driver);
        Select select = new Select(amazon.dropdownMenu);
        select.selectByVisibleText("Books");

        amazon.aramakutusu.sendKeys("java"+ Keys.ENTER);

        System.out.println(amazon.ilkurunIsım.getText());

    }

}
