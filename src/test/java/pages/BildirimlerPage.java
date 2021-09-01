package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BildirimlerPage {

    public BildirimlerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "reports")
    public WebElement bildrimlerLinki;

    @FindBy(partialLinkText = "Hepsi")
    public WebElement hepsiBildirimlerininLinki;

    @FindBy(partialLinkText = "Saldırı")
    public WebElement saldiriBildirimlerininLinki;

    @FindBy(partialLinkText = "Savunma")
    public WebElement savunmaBildirimlerininLinki;

    @FindBy(partialLinkText = "Gözetleme")
    public WebElement gözetlemeBildirimlerininLinki;

    @FindBy(partialLinkText = "Diğerleri")
    public WebElement diğerleriBildirimlerininLinki;

    @FindBy(partialLinkText = "Arşiv")
    public WebElement arşivBildirimlerininLinki;

    @FindBy(partialLinkText = "Çevre")
    public WebElement cevreBildirimlerininLinki;

    @FindBy(id = "markAll")
    public WebElement bildirimlerTumunuSecKutusu;

    @FindBy(xpath = "//button[@value='delete']")
    public WebElement silButonu;

    @FindBy(xpath = "(//a[@class='number'])[2]")
    public WebElement bildirimlerSonSayfa;
}
