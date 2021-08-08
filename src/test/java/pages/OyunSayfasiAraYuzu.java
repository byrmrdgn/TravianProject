package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OyunSayfasiAraYuzu {

    public OyunSayfasiAraYuzu(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "village resourceView")
    public WebElement hammaddelerLinki;

    @FindBy(className = "map")
    public WebElement haritaLinki;

    @FindBy(xpath = "//a[@accesskey='4']")
    public WebElement istatistikLinki;

    @FindBy(className = "reports")
    public WebElement raporlarLinki;

    @FindBy(className = "messages")
    public WebElement mesajlarLinki;

    @FindBy(xpath = "//a[@accesskey='7']")
    public WebElement gunlukGörevlerLinki;



}
