package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HammadelerPage {

    public HammadelerPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "village resourceView")
    public WebElement hammaddelerLinki;

    @FindBy(xpath = "//div[@id='resourceFieldContainer']/a")
    public List <WebElement> hammaddeKaynaklari;

    @FindBy(className = "titleInHeader")
    public WebElement hammaddeTurununBasligi;

    @FindBy(xpath = "//div[@class='section1']//button")
    public WebElement buSeviyeyiGelistir;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[2]")
    public WebElement ormanAlani1;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[4]")
    public WebElement ormanAlani2;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[15]")
    public WebElement ormanAlani3;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[18]")
    public WebElement ormanAlani4;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[3]")
    public WebElement tahilAlani1;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[9]")
    public WebElement tahilAlani2;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[10]")
    public WebElement tahilAlani3;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[13]")
    public WebElement tahilAlani4;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[14]")
    public WebElement tahilAlani5;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[16]")
    public WebElement tahilAlani6;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[5]")
    public WebElement demirAlani1;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[8]")
    public WebElement demirAlani2;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[11]")
    public WebElement demirAlani3;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[12]")
    public WebElement demirAlani4;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[6]")
    public WebElement tuglaAlani1;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[7]")
    public WebElement tuglaAlani2;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[17]")
    public WebElement tuglaAlani3;

    @FindBy(xpath = "(//div[@id='resourceFieldContainer']/a)[19]")
    public WebElement tuglaAlani4;
}
