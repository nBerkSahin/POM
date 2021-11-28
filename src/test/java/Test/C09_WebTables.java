package Test;

import Pages.KoalaResort;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class C09_WebTables {

//● Bir class oluşturun : D18_WebTables
//● login() metodun oluşturun ve oturum açın.
//● http://qa-environment.koalaresorthotels.com /admin/HotelRoomAdmin adresine gidin
//○ Username : manager
//○ Password : Manager1!
//● table() metodu oluşturun
//○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
//○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
//● printRows() metodu oluşturun //tr
//○ table body’sinde bulunan toplam satir(row) sayısını bulun.
//○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
//○ 4.satirdaki(row) elementleri konsolda yazdırın.
//○ table body’sinde bulunan toplam hücre(cell) sayısını bulun.
//○ table body’sinde bulunan toplam sutun(column) sayısını bulun.
//○ Table body’sinde bulunan sutunlari(column) konsolda yazdırın.
//○ 5.column daki elementleri konsolda yazdırın.


    @Test
    public void test(){

//● http://qa-environment.koalaresorthotels.com /admin/HotelRoomAdmin adresine gidin
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

//○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody

        System.out.println(koalaResort.baslıklarListesi.size());

//○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.

        for (WebElement each: koalaResort.baslıklarListesi){
            System.out.println(each.getText());
        }

//○ table body’sinde bulunan toplam satir(row) sayısını bulun.

        System.out.println(koalaResort.tbodytr.size());

//○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        for (WebElement each:koalaResort.tbodytr) {
            System.out.println(each.getText());
        }

        for (int i=0; i<koalaResort.tbodytr.size();i++){
            System.out.println(i+1+".satır "+koalaResort.tbodytr.get(i).getText());
        }

//○ 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println(koalaResort.tbodytr.get(4).getText());

//○ table body’sinde bulunan toplam hücre(cell) sayısını bulun.


//○ table body’sinde bulunan toplam sutun(column) sayısını bulun.


//○ Table body’sinde bulunan sutunlari(column) konsolda yazdırın.


//○ 5.column daki elementleri konsolda yazdırın.


    }



}
