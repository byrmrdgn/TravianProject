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
    public List <WebElement> oyunDropdownIcerik;

    @FindBy(xpath = "(//a[@title='Tournament'])[1]")
    public WebElement tournamentLinki;

    @FindBy(xpath = "(//li [@class='dropdown'])[2]")
    public WebElement medyaDropdown;

    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement discordLinki;

    @FindBy(xpath = "(//img)[6]")
    public WebElement travianLogo;

    @FindBy (xpath = "(//span[@class='selectedLanguage language'])[1]")
    public WebElement dilSecenekleri;

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

}
