package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;
import utilities.ConfigurationReader;
import utilities.Driver;


public class US_01_SayfaGörunurlugu {

    Page page=new Page();

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("travian_Url"));
        String url=Driver.getDriver().getCurrentUrl();

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

}
