package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.BildirimlerPage;
import utilities.Driver;
import utilities.MyMethods;

public class BildirimlerStepDef {

    MyMethods myMethods =new MyMethods();
    BildirimlerPage bildirimlerPage =new BildirimlerPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici bildirimler linkini tiklar")
    public void kullanici_bildirimler_linkini_tiklar() {
        bildirimlerPage.bildrimlerLinki.click();
    }

    @Given("hepsi linkini tiklar ve raporlari göruntuler")
    public void hepsi_linkini_tiklar_ve_raporlari_göruntuler() {
        bildirimlerPage.hepsiBildirimlerininLinki.click();
    }

    @Given("tumunu secer")
    public void tumunu_secer() {
        bildirimlerPage.bildirimlerTumunuSecKutusu.click();
    }

    @Given("saldiri linkini tiklar ve raporlari göruntuler")
    public void saldiri_linkini_tiklar_ve_raporlari_göruntuler() {
        bildirimlerPage.saldiriBildirimlerininLinki.click();
    }

    @Given("savunma linkini tiklar ve raporlari göruntuler")
    public void savunma_linkini_tiklar_ve_raporlari_göruntuler() {
        bildirimlerPage.savunmaBildirimlerininLinki.click();
    }


    @Given("gözetleme linkini tiklar ve raporlari göruntuler")
    public void gözetleme_linkini_tiklar_ve_raporlari_göruntuler() {
        bildirimlerPage.gözetlemeBildirimlerininLinki.click();
    }


    @Given("digerleri linkini tiklar ve raporlari göruntuler")
    public void digerleri_linkini_tiklar_ve_raporlari_göruntuler() {
        bildirimlerPage.diğerleriBildirimlerininLinki.click();
    }

    @Given("arsiv linkini tiklar ve raporlari göruntuler")
    public void arsiv_linkini_tiklar_ve_raporlari_göruntuler() {
        bildirimlerPage.arşivBildirimlerininLinki.click();
    }

    @Given("cevre linkini tiklar ve raporlari göruntuler")
    public void cevre_linkini_tiklar_ve_raporlari_göruntuler() {
        bildirimlerPage.cevreBildirimlerininLinki.click();
    }

    @Given("tumunu secerek mesajlari siler")
    public void tumunu_secerek_mesajlari_siler() {
        myMethods.hepsiniSil(bildirimlerPage.bildirimlerSonSayfa, bildirimlerPage.bildirimlerTumunuSecKutusu, bildirimlerPage.silButonu);
    }
}
