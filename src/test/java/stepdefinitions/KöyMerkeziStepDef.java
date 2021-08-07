package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.KöyMerkeziPage;
import utilities.Driver;
import utilities.MyMethods;

public class KöyMerkeziStepDef {

    KöyMerkeziPage köyMerkeziPage = new KöyMerkeziPage();
    MyMethods myMethods =new MyMethods();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Kullanici Köy Merkezi linkine tiklar")
    public void kullanici_köy_merkezi_linkine_tiklar() {
        köyMerkeziPage.köyMerkeziLinki.click();
    }

    @Then("bina gelistirmek icin alan secer")
    public void bina_gelistirmek_icin_alan_secer() {
        actions.moveToElement(köyMerkeziPage.askeriUsAlani).click().perform();
    }

    @Then("ve binayi insa eder")
    public void ve_binayi_insa_eder() {
        köyMerkeziPage.binaInsaEtButonu.click();
    }

    @Then("askeri usse giris yapar")
    public void askeri_usse_giris_yapar() {
        actions.moveToElement(köyMerkeziPage.askeriUsAlani).click().perform();
    }

    @Then("ve askeri ussu gelistirir")
    public void ve_askeri_ussu_gelistirir() {
        köyMerkeziPage.buSeviyeyeGelistir.click();
    }

}
