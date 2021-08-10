package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KahramanPage {

    public KahramanPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "heroImageButton")
    public WebElement kahramanGenelBakisButonu;

    @FindBy(xpath = "//div[@class='content  favor  favorKeyattributes']/a")
    public WebElement kahramanGenelÖzellikler;

    @FindBy(xpath = "//div[@class='content  favor  favorKeyappearance']/a")
    public WebElement kahramanDuzenleyici;

    @FindBy(xpath = "//div[@class='content  favor  favorKeyadventures']/a")
    public WebElement kahramanMacera;

    @FindBy(xpath = "//div[@class='content  favor  favorKeyauction']/a")
    public WebElement acikArttirma;

    @FindBy(xpath = "//a[@class='gotoAdventure arrow']")
    public WebElement macerayiBaslat;

    @FindBy(xpath = "//div[@class='adventureSendButton']")
    public WebElement macerayiOnayla;

    @FindBy(xpath = "//label[@for='resourceHero0']")
    public WebElement kahramaninHammmaddeUretimiKarisik;

    @FindBy(xpath = "//label[@for='resourceHero1']")
    public WebElement kahramaninHammmaddeUretimiOdun;

    @FindBy(xpath = "//label[@for='resourceHero2']")
    public WebElement kahramaninHammmaddeUretimiTugla;

    @FindBy(xpath = "//label[@for='resourceHero3']")
    public WebElement kahramaninHammmaddeUretimiDemir;

    @FindBy(xpath = "//label[@for='resourceHero4']")
    public WebElement kahramaninHammmaddeUretimiTahil;

    @FindBy(id = "inventory_1")
    public WebElement itemKutusu1;





}
