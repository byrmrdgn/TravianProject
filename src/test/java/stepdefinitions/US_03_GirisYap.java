package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.OyunSayfasiAraYuzu;
import pages.US_01_IlkSayfaninGörunurluguPage;
import utilities.ConfigurationReader;
import utilities.MyMethods;

public class US_03_GirisYap {

    US_01_IlkSayfaninGörunurluguPage page=new US_01_IlkSayfaninGörunurluguPage();
    OyunSayfasiAraYuzu oyunSayfasiAraYuzuPage=new OyunSayfasiAraYuzu();
    MyMethods myMethods=new MyMethods();
    //JSExecutor jsExecutor=new JSExecutor();

    @Given("giris yap linkkine tiklar")
    public void giris_yap_linkkine_tiklar() {
        page.girisLinki.click();
    }

    @Given("oynadigi serveri secer")
    public void oynadigi_serveri_secer() {
        page.farkliBölgeSec.click();
        page.bölgeSec.get(1).click();
        page.oynanServer.click();
    }
    @Given("sifre kutusuna sifesini girer")
    public void sifre_kutusuna_sifesini_girer() {
        page.passwordKutusu.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @Given("kullanici kutusuna kullanici adini girer")
    public void kullanici_kutusuna_kullanici_adini_girer() {
        page.kullaniciAdiKutusu.sendKeys(ConfigurationReader.getProperty("kullanici_ismi"));
    }

    @Then("giris yap butonuna tiklar")
    public void giris_yap_butonuna_tiklar() {
        page.girisYapButonu.click();
        Assert.assertTrue(oyunSayfasiAraYuzuPage.haritaLinki.isDisplayed());
    }


    @Then("kullanici cerez uyarisini kabul eder")
    public void kullanici_cerez_uyarisini_kabul_eder() {
        myMethods.acceptAll();
    }

    /*

    Bu satirlar yeni server'a kayit olurken gerekli olan millet secmeyi ve haritadan yer belirlemeyi yapiyor kodlar son asamaya kadar gelip
    en son asamada nihayi secimi onaylayacak butonun tiklanmasi kaldi. o buton manuel tiklandigi icin yarim kaldi.

    @Given("{string} secer")
    public void secer(String string) {
        myMethods.milletSec("cermenler");
        for (int i=0; i<page.milletiOnaylaButonu.size();i++){
            JSExecutor.clickElementByJS(page.milletiOnaylaButonu.get(i));
        }
    }

    @Given("oynayacagi haritayi onaylar")
    public void oynayacagi_haritayi_onaylar() {
        for (int i=0; i<page.haritayiOnayla.size();i++){
            JSExecutor.clickElementByJS(page.haritayiOnayla.get(i));
        }
    }

    */
}
