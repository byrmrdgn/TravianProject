package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.cert.X509Certificate;

public class Page {

    public Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "cmpbntyestxt")
    public WebElement acceptAll;

    @FindBy(xpath = "(//li [@class='dropdown'])[1]")
    public WebElement oyunDropdown;

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


}
