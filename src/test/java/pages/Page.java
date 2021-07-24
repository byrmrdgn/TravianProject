package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;
import java.util.List;

public class Page {

    public Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "cmpbntyestxt")
    public WebElement acceptAll;

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

    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement discordLinki;

    @FindBy(xpath = "(//img)[4]")
    public WebElement travianLogo;

    @FindBy(xpath = "(//span[@class='selectedLanguage language'])[1]")
    public WebElement dilSecenekleriLinki;

    @FindBy(xpath = "//label [@class='radioButton']")
    public List <WebElement> dilSecenekleri;

    @FindBy(xpath = "(//label [@class='radioButton'])[48]")
    public WebElement turkce;

    @FindBy (xpath = "(//a[@target='_blank'])[2]")
    public WebElement haberlerLinki;

    @FindBy(partialLinkText = "Giriş")
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

    @FindBy (xpath = "(//a[@target='_blank'])[8]")
    public WebElement facebookLinki;

    @FindBy (xpath = "(//a[@target='_blank'])[9]")
    public WebElement sayfaAltiDiscordLinki;

    @FindBy (xpath = "(//a[@target='_blank'])[10]")
    public WebElement youTubeLinki;

    @FindBy(xpath = "(//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc IIdkle'])[2]")
    public WebElement Iagree;

    @FindBy(xpath = "//a[@title='Destek']")
    public WebElement sayfaAltiDestekLinki;

    @FindBy(xpath = "//a[@title='Daha fazla oyun']")
    public WebElement sayfaAltiDahaFazlaOynaLinki;

    @FindBy(xpath = "//a[@title='Oyun Kuralları']")
    public WebElement sayfaAltiOyunKurallariLinki;

    @FindBy(xpath = "//div[@class='header']")
    public WebElement oyunDunyasiSec;

    @FindBy(xpath = "//div[@class='regionSelection']/div")
    public List<WebElement> bölgeSec;

    @FindBy(id = "changeRegion")
    public WebElement farkliBölgeSec;

    @FindBy(xpath = "//i[@class='calendarIcon']")
    public WebElement takvimResmi;

    @FindBy(xpath = "(//h4)[2]")
    public WebElement sunucuBölgesininAdi;





}
