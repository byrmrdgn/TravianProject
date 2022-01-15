package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US_01_IlkSayfaninGörunurluguPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyMethods;

import java.util.Set;


public class US_01_IlkSayfaninGörunurlugu {
/*
                        ****************************  NESNELER     ******************
*/
    US_01_IlkSayfaninGörunurluguPage ilkSayfaPage =new US_01_IlkSayfaninGörunurluguPage();
    MyMethods myMethods=new MyMethods();
    Actions actions =new Actions(Driver.getDriver());

/*
                        ****************************  KODLAR     ******************
 */

//  ************** Test Case 1 **************

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("travian_Url"));
        myMethods.assertToMainUrl();
        //myMethods.acceptAll();

    }

//  ************** Test Case 2 **************

    @Given("kullanici oyun dropdownuna gider")
    public void kullanici_oyun_dropdownuna_gider() {
        myMethods.elementeGit(ilkSayfaPage.oyunDropdown);
    }

    @Given("oyun tarzi linkine tiklar ve geri döner")
    public void oyun_tarzi_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.oyunDrpdwnOyunTarziLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("oyun_tarzi_url"));
        myMethods.elementeGit(ilkSayfaPage.oyunDropdown);
    }

    @Given("oyuncu etkilesimine tiklar ve geri döner")
    public void oyuncu_etkilesimine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.oyunDrpdwnOyuncuEtkilesimiLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("oyuncu_etkilesimi_url"));
        myMethods.elementeGit(ilkSayfaPage.oyunDropdown);
    }

    @Given("imparatorluk kur linkine tiklar ver geri döner")
    public void imparatorluk_kur_linkine_tiklar_ver_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.oyunDrpdwnİmparatorlukKurLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("imparatorluk_kur_url"));
        myMethods.elementeGit(ilkSayfaPage.oyunDropdown);
    }

    @Given("Carpisma linkine tiklar ve geri döner")
    public void carpisma_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.oyunDrpdwnÇarpışmaLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("carpisma_url"));
        myMethods.elementeGit(ilkSayfaPage.oyunDropdown);
    }

    @Given("Gec oyun linkine tiklar ve geri döner")
    public void gec_oyun_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.oyunDrpdwnGeçOyunLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("gec_oyun_url"));
    }

    @Given("Kullanici driveri kapatir")
    public void kullanici_driveri_kapatir() {
        Driver.closeDriver();
    }

//  ************** Test Case 3 **************

    @Given("tournament linkine tiklar ve geri döner")
    public void tournament_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.tournamentLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("tournament_url"));
    }

//  ************** Test Case 4 **************

    @Given("kullanici medya linkine gider")
    public void kullanici_medya_linkine_gider() {
        myMethods.elementeGit(ilkSayfaPage.medyaDropdown);
    }

    @Given("ekran göruntuleri linkine tiklar ve geri döner")
    public void ekran_göruntuleri_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.medyaDrpdwnEkranGörüntüleriLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("ekran_goruntuleri_url"));
        myMethods.elementeGit(ilkSayfaPage.medyaDropdown);
    }

    @Given("tv reklamlari linkine tiklar ve geri döner")
    public void tv_reklamlari_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.medyaDrpdwnTVreklamlarıLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("tv_reklamlari_url"));
    }

//  ************** Test Case 5 **************

    @Given("discord dropdownuna gider")
    public void discord_dropdownuna_gider() {
        myMethods.elementeGit(ilkSayfaPage.discordDrpdwn);
    }

    @Given("blog linkine tiklar")
    public void blog_linkine_tiklar() {
        ilkSayfaPage.blogLinki.click();
        myMethods.getHandlesAndUrl();
        myMethods.assertToUrl(ConfigurationReader.getProperty("discord_blog_url"));
    }

    @Given("discord linkine tiklar")
    public void discord_linkine_tiklar() {
        myMethods.elementeGit(ilkSayfaPage.discordDrpdwn);
        ilkSayfaPage.discordLinki.click();
        myMethods.getHandlesAndUrl();
        myMethods.assertToUrl(ConfigurationReader.getProperty("discord_discord_url"));
    }

    @Given("calender linkine tiklar")
    public void calender_linkine() {
        myMethods.elementeGit(ilkSayfaPage.discordDrpdwn);
        ilkSayfaPage.calenderLinki.click();
        myMethods.getHandlesAndUrl();
        myMethods.assertToUrl(ConfigurationReader.getProperty("discord_calender_url"));
    }

//  ************** Test Case 6 **************

    @Given("travian logosunun görunurlugunu test eder")
    public void travian_logosunun_görunurlugunu_test_eder() {
        Assert.assertTrue(ilkSayfaPage.travianLogo.isDisplayed());
    }

//  ************** Test Case 7 **************

    @Given("dil secenekleri linkini tiklar")
    public void dil_secenekleri_linkini_tiklar() {
        ilkSayfaPage.dilSecenekleriLinki.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("acilan sayfadan dilleri secer")
    public void acilan_sayfadan_dilleri_secer() {
        myMethods.dilSec();
    }

//  ************** Test Case 8 **************

    @Given("ana sayfada buyuk yazinin görunup görunmedigine bakar")
    public void ana_sayfada_buyuk_yazinin_görunup_görunmedigine_bakar() {
       Assert.assertTrue(ilkSayfaPage.anaSayfadakiBuyukYazi.isDisplayed());
    }

//  ************** Test Case 9 **************

    @Given("ana sayfada kucuk yazinin görunup görunmedigine bakar")
    public void ana_sayfada_kucuk_yazinin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(ilkSayfaPage.anaSayfadakiKucukYazi.isDisplayed());
    }

//  ************** Test Case 10 **************

    @Given("ana sayfada hemen oyna yazisinin görunup görunmedigine bakar")
    public void ana_sayfada_hemen_oyna_yazisinin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(ilkSayfaPage.hemenOyna.isDisplayed());
    }

//  ************** Test Case 11 **************

    @Given("ana sayfada kale arka plan resminin görunup görunmedigine bakar")
    public void ana_sayfada_kale_arka_plan_resminin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(ilkSayfaPage.girisSayfasiKaleResmi.isDisplayed());
    }

//  ************** Test Case 12 **************

    @Given("ana sayfada roma ordusu resminin görunup görunmedigine bakar")
    public void ana_sayfada_roma_ordusu_resminin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(ilkSayfaPage.girisSayfasiOrduResmi.isDisplayed());
    }

//  ************** Test Case 13 **************

    @Given("ana sayfada roma komutan resminin görunup görunmedigine bakar")
    public void ana_sayfada_roma_komutan_resminin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(ilkSayfaPage.girisSayfasiKomutanResmi.isDisplayed());
    }

//  ************** Test Case 14 **************

    @Given("facebook linkine tiklar ve geri döner")
    public void facebook_linkine_tiklar_ve_geri_döner() {
        ilkSayfaPage.facebookLinki.click();
        myMethods.getHandlesAndUrl();
        myMethods.assertToUrl(ConfigurationReader.getProperty("travian_facebook_url"));
    }

//  ************** Test Case 15 **************

    @Given("sayfanin altindaki discord linkine tiklar")
    public void sayfanin_altindaki_discord_linkine_tiklar() {
       ilkSayfaPage.sayfaAltiDiscordLinki.click();
       myMethods.getHandlesAndUrl();
       myMethods.assertToUrl(ConfigurationReader.getProperty("sayfanin_altindaki_discord_linki"));
    }

//  ************** Test Case 16 **************

    @Given("sayfanin altindaki youtube linkine tiklar")
    public void sayfanin_altindaki_youtube_linkine_tiklar() {
        ilkSayfaPage.youTubeLinki.click();
        myMethods.getHandlesAndUrl();
        myMethods.assertToUrl(ConfigurationReader.getProperty("travian_youtube_linki"));
    }

//  ************** Test Case 17 **************

    @Given("sayfanin altindaki destek linkine tiklar ve geri döner")
    public void sayfanin_altindaki_destek_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.sayfaAltiDestekLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("destek_url"));
    }

//  ************** Test Case 18 **************

    @Given("sayfanin altindaki daha fazla oyna linkine tiklar ve geri döner")
    public void sayfanin_altindaki_daha_fazla_oyna_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.sayfaAltiDahaFazlaOynaLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("daha_fazla_oyna_url"));
    }

//  ************** Test Case 19 **************

    @Given("sayfanin altindaki oyun kurallari linkine tiklar ve geri döner")
    public void sayfanin_altindaki_oyun_kurallari_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(ilkSayfaPage.sayfaAltiOyunKurallariLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("oyun_kurallari_url"));
    }
}