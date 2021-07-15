package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyMethods;


public class US_01_SayfaGörunurlugu {

    Page page=new Page();
    MyMethods myMethods=new MyMethods();

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("travian_Url"));
        String url=Driver.getDriver().getCurrentUrl();
        myMethods.acceptAll();

/*
        try {
           if (page.acceptAll.isDisplayed()){
                page.acceptAll.click();
                Assert.assertEquals(url,ConfigurationReader.getProperty("travian_Url"));
                System.out.println("if calisti");
           }
        }catch (Exception e){
            System.out.println("Catch calisti");
            Assert.assertEquals(url,ConfigurationReader.getProperty("travian_Url"));
        }

        bu kismi isVisibilityOfAcceptAll methodu yapabilirim
         */

    }

    @Given("kullanici oyun dropdownuna gider")
    public void kullanici_oyun_dropdownuna_gider() {
        Actions actions =new Actions(Driver.getDriver());
        actions.moveToElement(page.oyunDropdown).perform();
       }
    @Given("dropdown icindekileri kontrol eder")
    public void dropdown_icindekileri_kontrol_eder() {

        Actions actions =new Actions(Driver.getDriver());
        actions.moveToElement(page.oyunDropdown).perform();
        for (WebElement w: page.oyunDropdownIcerik){
            System.out.println(w.getText());
        }

    }

}
