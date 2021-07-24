package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.Page;
import utilities.Driver;
import utilities.MyMethods;

public class US_02_HemenOyna {

    Page page=new Page();
    MyMethods myMethods=new MyMethods();

    @Given("hemen oyna linkine tiklar")
    public void hemen_oyna_linkine_tiklar() {
        page.hemenOyna.click();
    }

    @Given("acilan pencereden oyun dunyalarina bakar")
    public void acilan_pencereden_oyun_dunyalarina_bakar() {
        page.oyunDunyasiSec.click();
    }
    @Then("oyun dunyalarini kontrol eder")
    public void oyun_dunyalarini_kontrol_eder() {
        myMethods.sec(page.bölgeSec,page.farkliBölgeSec);
    }
}


