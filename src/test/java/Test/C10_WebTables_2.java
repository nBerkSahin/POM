package Test;

import Pages.KoalaResort;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C10_WebTables_2 {


    @Test
    public void test(){

//1. Bir metod oluşturun : printData(int row, int column);
//a. Satır(row) ve sütun(column) numarasını girdiğinizde, printData metodu bu hücredeki(cell) veriyi yazdırmalıdır.
//2. Baska bir Test metodu oluşturun: printDataTest();
//b. Örnek: printData (3,5); => 3. satır, 5. Sütundaki veriyi yazdırmalıdır
//c. yazdirilan datanin olmasi gereken dataya esit oldugunu test edin

        Driver.getDriver().get(ConfigReader.getProperty("koalaURL"));

        KoalaResort koalaResort = new KoalaResort();

        koalaResort.details.click();
        koalaResort.proceedLink.click();


        koalaResort.ilkLoginLink.click();

        koalaResort.username.sendKeys("manager");
        koalaResort.pass.sendKeys("Manager1!");
        koalaResort.buttonSubmit.click();

        koalaResort.hotelManagementLinki.click();
        koalaResort.hotelRoomsLinki.click();

//1. Bir metod oluşturun : printData(int row, int column);
//a. Satır(row) ve sütun(column) numarasını girdiğinizde, printData metodu bu hücredeki(cell) veriyi yazdırmalıdır.

        String actualData = koalaResort.printData(3,5);

//2. Baska bir Test metodu oluşturun: printDataTest();
//b. Örnek: printData (3,5); => 3. satır, 5. Sütundaki veriyi yazdırmalıdır
//c. yazdirilan datanin olmasi gereken dataya esit oldugunu test edin

        Assert.assertEquals(actualData, "Turkiye","yazılan data istenilenden farklı");



    }
}
