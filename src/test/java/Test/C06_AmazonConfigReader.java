package Test;

import Pages.Amazon;
import Utilities.ConfigReader;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class C06_AmazonConfigReader extends TestBase {

    @Test
    public void test(){
        driver.get(ConfigReader.getProperty("URLa"));

        Amazon amazon = new Amazon(driver);

        amazon.aramakutusu.sendKeys("Nutella");

//        System.out.println(amazon.sonucyazisiElemnti.getText());

    }

}
