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



    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[1]")
    public WebElement insaAlani1;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[2]")
    public WebElement insaAlani2;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[3]")
    public WebElement insaAlani3;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[4]")
    public WebElement insaAlani4;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[5]")
    public WebElement insaAlani5;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[6]")
    public WebElement insaAlani6;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[7]")
    public WebElement insaAlani7;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[8]")
    public WebElement MerkezBinasi;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[9]")
    public WebElement insaAlani9;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[10]")
    public WebElement insaAlani10;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[11]")
    public WebElement insaAlani11;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[12]")
    public WebElement insaAlani12;

    @FindBy(xpath = "(//div[@id='villageContent']/div/a)[13]")
    public WebElement insaAlani13;

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



    @FindBy(xpath = "//button[@value='Bina inşa et']")
    public WebElement binaInsaEtButonu;

    @FindBy(xpath = "//button[@class='textButtonV1 green build']")
    public WebElement buSeviyeyeGelistir;




}


