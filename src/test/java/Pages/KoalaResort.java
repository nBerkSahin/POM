package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KoalaResort {

    public WebDriver driver;

    public KoalaResort(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText = "Log in" )
    public WebElement ilkLoginLink;

    @FindBy(id = "Password")
    public WebElement pass;

    @FindBy(id="UserName")
    public WebElement username;

    @FindBy(id="details-button")
    public WebElement details;

    @FindBy(id="proceed-link")
    public WebElement proceedLink;

    @FindBy(id="btnSubmit")
    public WebElement buttonSubmit;

    @FindBy(id="divMessageResult")
    public WebElement wrongMessage;

    @FindBy(linkText = "Hotelrooms")
    public WebElement addroomHotelRoomsLinki;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRoomsLinki;

    @FindBy(xpath = "//thead/tr[1]/th")
    public List<WebElement> baslıklarListesi;

    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> tümListe;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> tbodytr;

    @FindBy(xpath = "//tbody//tr//td")
    public List<WebElement> tbodytrtd;




    public String printData(int satir, int sutun){
        String xpath = "//tbody//tr[" +satir +"]//td["+ sutun + "]";

        String istenenData = Driver.getDriver().findElement(By.xpath(xpath)).getText();
        System.out.println("satir no "+ satir+ ", sutun no : " + sutun + "'deki data : " + istenenData);

        return istenenData;

    }


}
