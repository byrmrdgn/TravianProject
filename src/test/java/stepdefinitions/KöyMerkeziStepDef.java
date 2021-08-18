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

    @Then("askeri us kurmak icin alan secer")
    public void askeri_us_kurmak_icin_alan_secer() {
       myMethods.binaIcinAlanSec(köyMerkeziPage.askeriUsAlani);
    }

    @Then("ve binayi insa eder")
    public void ve_binayi_insa_eder() {
        köyMerkeziPage.binaInsaEtButonu.click();
    }

    @Then("askeri usse giris yapar")
    public void askeri_usse_giris_yapar() {
        actions.moveToElement(köyMerkeziPage.askeriUsAlani).click().perform();
    }

    @Then("ve binayi gelistirir")
    public void ve_binayi_gelistirir() {
        köyMerkeziPage.buSeviyeyeGelistir.click();
    }

    @Then("siginak kurmak icin alan secer")
    public void siginak_kurmak_icin_alan_secer() {
        myMethods.binaIcinAlanSec(köyMerkeziPage.siginakAlani);
    }

    @Then("siginaga giris yapar")
    public void siginaga_giris_yapar() {
        actions.moveToElement(köyMerkeziPage.siginakAlani).click().perform();
    }

    @Then("hammadde deposu kurmak icin alan secer")
    public void hammadde_deposu_kurmak_icin_alan_secer() {
        myMethods.binaIcinAlanSec(köyMerkeziPage.hammaddeDepoAlani);
    }

    @Then("tahil ambari kurmak icin alan secer")
    public void tahil_ambari_kurmak_icin_alan_secer() {
        myMethods.binaIcinAlanSec(köyMerkeziPage.tahilAmbariAlani);
    }

    @Then("merkez binasina giris yapar")
    public void merkez_binasina_giris_yapar() {
        myMethods.binaIcinAlanSec(köyMerkeziPage.merkezBinasi);
    }

    @Then("kisla kurmak icin alan secer")
    public void kisla_kurmak_icin_alan_secer() {
        myMethods.binaIcinAlanSec(köyMerkeziPage.kislaAlani);
    }

    @Then("askeri yapi kurmak icin askeri butona tiklar")
    public void askeri_yapi_kurmak_icin_askeri_butona_tiklar() {
        köyMerkeziPage.askeriYapiKur.click();
    }

    @Then("pazar yeri kurmak icin alan secer")
    public void pazar_yeri_kurmak_icin_alan_secer() {
        myMethods.binaIcinAlanSec(köyMerkeziPage.pazarAlani);
    }

    @Then("kislaya giris yapar")
    public void kislaya_giris_yapar() {
        myMethods.binaIcinAlanSec(köyMerkeziPage.kislaAlani);
    }

    @Then("akademi kurmak icin alan secer")
    public void akademi_kurmak_icin_alan_secer() {
    myMethods.binaIcinAlanSec(köyMerkeziPage.akademiAlani);
    }

    @Then("akademiye giris yapar")
    public void akademiye_giris_yapar() {
        myMethods.binaIcinAlanSec(köyMerkeziPage.akademiAlani);
    }

}
