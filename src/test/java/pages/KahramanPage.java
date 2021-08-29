package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(id = "headProfile")
    public WebElement kafaSekliSecenekleri;

    @FindBy(id = "attribute_button_51")
    public WebElement kafaSekliniSec;

    @FindBy(id = "hairColor")
    public WebElement sacRengiSecenekleri;

    @FindBy(id = "attribute_button_1500")
    public WebElement sacRenginiSec;

    @FindBy(id = "hairStyle")
    public WebElement sacSekliSecenekleri;

    @FindBy(id = "attribute_button_1000")
    public WebElement sacSekliniSec;

    @FindBy(id = "ears")
    public WebElement kulakSekliSecenekleri;

    @FindBy(id = "attribute_button_2000")
    public WebElement kulakSekliniSec;

    @FindBy(id = "eyebrow")
    public WebElement kasSekliSecenekleri;

    @FindBy(id = "attribute_button_7000")
    public WebElement kasSekliniSec;

    @FindBy(id = "eyes")
    public WebElement gözRengiSecenekleri;

    @FindBy(id = "attribute_button_4004")
    public WebElement gözRenginiSec;

    @FindBy(id = "nose")
    public WebElement burunSekliSecenekleri;

    @FindBy(id = "attribute_button_3001")
    public WebElement burunSekliniSec;

    @FindBy(id = "mouth")
    public WebElement agizSekliSecenekleri;

    @FindBy(id = "attribute_button_6002")
    public WebElement agizSekliniSec;

    @FindBy(id = "beard")
    public WebElement sakalSekliSecenekleri;

    @FindBy(id = "attribute_button_5003")
    public WebElement sakalSekliniSec;

    @FindBy(id = "save")
    public WebElement kahramaninFizikselDegisiklikleriKaydet;

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

    @FindBy(id = "inventory_7")
    public WebElement itemKutusu7;

    @FindBy(xpath = "//*[.='Tamam']")
    public WebElement itemiOnayla;

    @FindBy(id = "attackBehaviourFight")
    public WebElement saldiriEsnasindaSavas;

    @FindBy(id = "attackBehaviourHide")
    public WebElement saldiriEsnasindaSaklan;

    @FindBy(id = "saveHeroAttributes")
    public WebElement kahramandakiDegisiklikleriKaydet;

    @FindBy(xpath = "//tr[@id='attributepower']/td[4]")
    public WebElement kahramaninSavasGucunuAzalt;

    @FindBy(xpath = "//tr[@id='attributepower']/td[6]")
    public WebElement kahramaninSavasGucunuArttir;

    @FindBy(xpath = "//tr[@id='attributeoffBonus']/td[4]")
    public WebElement kahramaninSaldiriBonusunuAzalt;

    @FindBy(xpath = "//tr[@id='attributeoffBonus']/td[6]")
    public WebElement kahramaninSaldiriBonusunuArttir;

    @FindBy(xpath = "//tr[@id='attributedefBonus']/td[4]")
    public WebElement kahramaninSavunmaBonusunuAzalt;

    @FindBy(xpath = "//tr[@id='attributedefBonus']/td[6]")
    public WebElement kahramaninSavunmaBonusunuArttir;

    @FindBy(xpath = "//tr[@id='attributeproductionPoints']/td[4]")
    public WebElement kahramaninHammaddeUretiminiAzalt;

    @FindBy(xpath = "//tr[@id='attributeproductionPoints']/td[6]")
    public WebElement kahramaninHammaddeUretiminiArttir;

    @FindBy(xpath = "//span[@class='value']")
    public WebElement saglikSeviyesi;

    @FindBy(xpath = "//td[@id='availablePoints']")
    public WebElement sahipOlunanPuanlar;

    @FindBy(xpath = "//button[@data-key='10']")
    public WebElement sifaMerhemiLinki;

    @FindBy(xpath = "//button[@data-key='0']")
    public WebElement migferLinki;

    @FindBy(xpath = "//button[@data-key='1']")
    public WebElement gövdeIcinKullanilanEsyaLinki;

    @FindBy(xpath = "//button[@data-key='2']")
    public WebElement solEldeKullanilanEsyaLinki;

    @FindBy(xpath = "//button[@data-key='3']")
    public WebElement sagEldeKullanilanEsyaLinki;

    @FindBy(xpath = "//button[@data-key='4']")
    public WebElement cizmeLinki;

    @FindBy(xpath = "//button[@data-key='5']")
    public WebElement atLinki;

    @FindBy(xpath = "//tr//td[6]")
    public List<WebElement> teklifVer;

    @FindBy(name = "maxBid")
    public WebElement teklifKutusu;

    @FindBy(className = "submitBid")
    public WebElement teklifiOnayla;

    @FindBy(xpath = "//div[@class='value ajaxReplaceableSilverAmount']")
    public WebElement kasadaOlanGumusMiktari;

    @FindBy(xpath = "//td[@class='silver selected']")
    public WebElement urununAnlikFiyati;

    @FindBy(className = "notEnoughSilver")
    public WebElement cokAzGumus;

    @FindBy(xpath = "//img[@alt='sonraki sayfa']")
    public WebElement sonrakiSayfa;


}
