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

    @FindBy(xpath = "//div[@class='labelLayer']")
    public List<WebElement> hammaddeKaynaklari;

    @FindBy(className = "titleInHeader")
    public WebElement hammaddeTurununBasligi;


}
