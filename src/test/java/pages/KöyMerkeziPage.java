package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class KöyMerkeziPage {

    public KöyMerkeziPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@accesskey='2']")
    public WebElement köyMerkeziLinki;

    @FindBy(xpath = "//div[@id='villageContent']//div//a")
    public List <WebElement> köyiciBinaAlanlari;

    @FindBy(xpath = "//a[@class='tabItem infrastructure active']")
    public WebElement altYapiKur;

    @FindBy(xpath = "//a[@class='tabItem military normal']")
    public WebElement askeriYapiKur;

    @FindBy(xpath = "//a[@class='tabItem resources normal']")
    public WebElement hammaddeYapisiKur;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[1]")
    public WebElement siginakAlani;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[2]")
    public WebElement hammaddeDepoAlani;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[3]")
    public WebElement tahilAmbariAlani;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[4]")
    public WebElement insaAlani4;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[5]")
    public WebElement insaAlani5;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[6]")
    public WebElement insaAlani6;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[7]")
    public WebElement insaAlani7;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[8]")
    public WebElement merkezBinasi;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[9]")
    public WebElement akademiAlani;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[10]")
    public WebElement insaAlani10;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[11]")
    public WebElement zirhDökumhanesiAlani;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[12]")
    public WebElement kislaAlani;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[13]")
    public WebElement pazarAlani;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[14]")
    public WebElement insaAlani14;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[15]")
    public WebElement insaAlani15;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[16]")
    public WebElement insaAlani16;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[17]")
    public WebElement insaAlani17;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[18]")
    public WebElement insaAlani18;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[19]")
    public WebElement insaAlani19;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[20]")
    public WebElement insaAlani20;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[21]")
    public WebElement askeriUsAlani;

    @FindBy(xpath = "//a[@class='level colorLayer notNow underConstruction aid40 teuton']")
    public WebElement toprakSiper;



    @FindBy(xpath = "//button[@value='Bina inşa et']")
    public WebElement binaInsaEtButonu;

    @FindBy(xpath = "//button[@class='textButtonV1 green build']")
    public WebElement buSeviyeyeGelistir;




}


