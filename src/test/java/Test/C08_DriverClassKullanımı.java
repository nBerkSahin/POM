package Test;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C08_DriverClassKullanımı {

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("URLa"));
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        // Driver driver=new Driver();
        // Driver class'indan obje uretilemesin istedigimiz icin Driver class'i SINGLETON yapiyoruz
        // bunun icin default constructor yerine parametresiz bir constructor olusturup
        // access modiefier'i private seciyoruz

        // Driver driver=new Driver("ben istedim ama olmadi");
        // Driver class'inda parametreli constructor olmadigi icin kullanamayiz

        Driver.closeDriver();



    }



}
