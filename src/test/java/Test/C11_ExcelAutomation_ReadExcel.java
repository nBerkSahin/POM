package Test;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C11_ExcelAutomation_ReadExcel {

    @Test
    public void test() throws IOException {

//7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/test/java/Resources/Kitap2.xlsx";

//8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

//9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook = WorkbookFactory.create(fileInputStream);

//10. WorkbookFactory.create(fileInputStream)


//11. Worksheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet = workbook.getSheet("Sayfa1");

//12. Row objesi olusturun sheet.getRow(index)
        Row row =sheet.getRow(2);

//13. Cell objesi olusturun row.getCell(index)
        Cell cell = row.getCell(3);

        System.out.println(cell);

    }

    @Test
    public void test2() throws IOException {
        //7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/test/java/Resources/Kitap2.xlsx";

//8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

//9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook = WorkbookFactory.create(fileInputStream);

//10. WorkbookFactory.create(fileInputStream)


//11. Worksheet objesi olusturun workbook.getSheetAt(index)


//12. Row objesi olusturun sheet.getRow(index)


//13. Cell objesi olusturun row.getCell(index)
        Cell cell=workbook.getSheet("Sayfa1").getRow(5).getCell(3);

        System.out.println(cell);

    }

    @Test
    public void test3() throws IOException {
        //tablodaki 2. sütunu liste olarak yazdıralım
        List<String> ikinciSutun = new ArrayList<>();

        String dosyaYolu = "src/test/java/Resources/Kitap2.xlsx";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        Workbook workbook = WorkbookFactory.create(fileInputStream);


        for (int i=0; i<=workbook.getSheet("Sayfa1").getLastRowNum();i++){
            ikinciSutun.add(workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString());

        }
        System.out.println(ikinciSutun);

        //tablodaki 2. sütunda b ile başlayanlar
        List<String> ikinciSutun2 = new ArrayList<>();

        for (int i=0; i<workbook.getSheet("Sayfa1").getLastRowNum();i++){
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().contains("b")){
                ikinciSutun2.add(workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString());
            }
        }
        System.out.println(ikinciSutun2);

        //or
        List<String> ailebaslayan = new ArrayList<>();
        for (String each: ikinciSutun){
            if (each.startsWith("b")){
                ailebaslayan.add(each);
            }
        }
        System.out.println(ailebaslayan);

        // eger tum datayi java'da kullanilabilir bir collection'a cevirmek istesek
        // en uygun yapi map olur
        // map icin unique degerlere sahip bir sutunu key
        // geriye kalan tum sutunlari ise virgulle ayrilan string'ler olarak value yapmaliyiz
        // key=Turkey value=Ankara, Turkiye, Ankara

        Map<String, String> ulkelerMap=new HashMap<>();
        String key="";
        String value="";

        for (int i=0; i<=workbook.getSheet("Sayfa1").getLastRowNum();i++){

            key = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            value = workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString() + "=" +
                    workbook.getSheet("Sayfa1").getRow(i).getCell(2).toString() + "="+
                    workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString();
            ulkelerMap.put(key,value);
        }
        System.out.println(ulkelerMap);

    }

}