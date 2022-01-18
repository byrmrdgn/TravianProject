package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_01_IlkSayfaninGörunurluguPage {

    public US_01_IlkSayfaninGörunurluguPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "cmpbntyestxt")
    public WebElement acceptAll;

    @FindBy(id = "cmpbntnotxt")
    public WebElement rejecttAll;


    @FindBy(xpath = "(//li [@class='dropdown'])[1]")
    public WebElement oyunDropdown;

    @FindBy(xpath = "(//li [@class='dropdown']/ul/li)")
    public List <WebElement> oyunDropdownListe;

    @FindBy(partialLinkText = "Oyun tarzı")
    public WebElement oyunDrpdwnOyunTarziLinki;

    @FindBy(partialLinkText = "Oyuncu etkileşimi")
    public WebElement oyunDrpdwnOyuncuEtkilesimiLinki;

    @FindBy(partialLinkText = "İmparatorluk kur")
    public WebElement oyunDrpdwnİmparatorlukKurLinki;

    @FindBy(partialLinkText = "Çarpışma")
    public WebElement oyunDrpdwnÇarpışmaLinki;

    @FindBy(partialLinkText = "Geç oyun")
    public WebElement oyunDrpdwnGeçOyunLinki;

    @FindBy(xpath = "(//a[@title='Tournament'])[1]")
    public WebElement tournamentLinki;

    @FindBy(xpath = "(//li [@class='dropdown'])[2]")
    public WebElement medyaDropdown;

    @FindBy(partialLinkText = "Ekran Görüntüleri")
    public WebElement medyaDrpdwnEkranGörüntüleriLinki;

    @FindBy(partialLinkText = "TV reklamları")
    public WebElement medyaDrpdwnTVreklamlarıLinki;

    @FindBy(xpath = "(//*[.='Community'])")
    public WebElement discordDrpdwn;

    @FindBy(partialLinkText = "Blog")
    public WebElement blogLinki;

    @FindBy(partialLinkText = "Discord")
    public WebElement discordLinki;

    @FindBy(partialLinkText = "Calendar")
    public WebElement calenderLinki;

    @FindBy(xpath = "(//img)[4]")
    public WebElement travianLogo;

    @FindBy(xpath = "(//span[@class='selectedLanguage language'])[1]")
    public WebElement dilSecenekleriLinki;

    @FindBy(xpath = "//label [@class='radioButton']")
    public List <WebElement> dilSecenekleri;

    @FindBy(xpath = "(//label [@class='radioButton'])[48]")
    public WebElement turkce;

    @FindBy(xpath = "//a[@title='Giriş']")
    public WebElement girisLinki;

    @FindBy (xpath = "//h1")
    public WebElement anaSayfadakiBuyukYazi;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement anaSayfadakiKucukYazi;

    @FindBy(id = "playNowButton")
    public WebElement hemenOyna;

    @FindBy(xpath = "//img[@alt='Travian: Legends Kale Arkaplanı']")
    public WebElement girisSayfasiKaleResmi;

    @FindBy(xpath = "//img[@alt='Travian: Legends Roma Ordusu']")
    public WebElement girisSayfasiOrduResmi;

    @FindBy(xpath = "//img[@alt='Travian: Legends Roma Komutanı']")
    public WebElement girisSayfasiKomutanResmi;

    @FindBy(xpath = "(//a[@title='Hemen oyna'])[3]")
    public WebElement sayfaAltiHemenOyna;

    @FindBy (xpath = "//*[.='Facebook']")
    public WebElement facebookLinki;

    @FindBy (xpath = "(//*[.='Discord'])[3]")
    public WebElement sayfaAltiDiscordLinki;

    @FindBy (xpath = "(//*[.='YouTube'])")
    public WebElement youTubeLinki;

    @FindBy(xpath = "(//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc IIdkle'])[2]")
    public WebElement Iagree;

    @FindBy(xpath = "//a[@title='Destek']")
    public WebElement sayfaAltiDestekLinki;

    @FindBy(xpath = "//a[@title='Daha fazla oyun']")
    public WebElement sayfaAltiDahaFazlaOynaLinki;

    @FindBy(xpath = "//a[@title='Oyun Kuralları']")
    public WebElement sayfaAltiOyunKurallariLinki;

    //Us02

    @FindBy(xpath = "//h1/*[.='Oynamak için kaydol']")
    public WebElement oynamakIcinKaydol;

    @FindBy(xpath = "//*[.='Kaydol']")
    public WebElement kaydolLinki;

    @FindBy(xpath = "//div[@class='header']")
    public WebElement oyunDunyasiniDegistir;

    @FindBy(xpath = "//div[@class='regionSelection']/div")
    public List<WebElement> bölgeSec;

    @FindBy(id = "changeRegion")
    public WebElement farkliBölgeSec;

    @FindBy(xpath = "//*[@id='Registration']//div[2]/div[1]/span")
    public List <WebElement> sunucuYasi;

    @FindBy(xpath = "(//h4)[2]")
    public WebElement sunucuBölgesininAdi;

    @FindBy(id = "name")
    public WebElement isimKutusu;

    @FindBy(xpath = "//*[.='Open Beta']")
    public WebElement betaServer;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy (xpath = "//button[@class='button default']")
    public WebElement hemenKaydolButonu;

    @FindBy(className = "checkmark")
    public WebElement genelSartlarKabul;

    @FindBy(id = "usernameOrEmail")
    public WebElement kullaniciAdiKutusu;

    @FindBy(xpath = "//*[.='Giriş yap ve oyna']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//*[@id=\"tribeSelectors\"]/label")
    public List<WebElement> oyundakiMilletler;

    @FindBy(xpath = "//button[@value='Onayla']")
    public List<WebElement>  milletiOnaylaButonu;

    @FindBy(xpath = "//*[@value='<span>HEMEN OYNA</span>']")
    public List<WebElement>  haritayiOnayla;






}
