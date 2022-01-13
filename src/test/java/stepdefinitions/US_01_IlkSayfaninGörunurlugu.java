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
    US_01_IlkSayfaninGörunurluguPage page=new US_01_IlkSayfaninGörunurluguPage();
    MyMethods myMethods=new MyMethods();
    Actions actions =new Actions(Driver.getDriver());
    Set<String> tumPencereler = Driver.getDriver().getWindowHandles();

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
        myMethods.elementeGit(page.oyunDropdown);
    }

    @Given("oyun tarzi linkine tiklar ve geri döner")
    public void oyun_tarzi_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnOyunTarziLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("oyun_tarzi_url"));
        myMethods.elementeGit(page.oyunDropdown);
    }

    @Given("oyuncu etkilesimine tiklar ve geri döner")
    public void oyuncu_etkilesimine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnOyuncuEtkilesimiLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("oyuncu_etkilesimi_url"));
        myMethods.elementeGit(page.oyunDropdown);
    }

    @Given("imparatorluk kur linkine tiklar ver geri döner")
    public void imparatorluk_kur_linkine_tiklar_ver_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnİmparatorlukKurLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("imparatorluk_kur_url"));
        myMethods.elementeGit(page.oyunDropdown);
    }

    @Given("Carpisma linkine tiklar ve geri döner")
    public void carpisma_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnÇarpışmaLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("carpisma_url"));
        myMethods.elementeGit(page.oyunDropdown);
    }

    @Given("Gec oyun linkine tiklar ve geri döner")
    public void gec_oyun_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnGeçOyunLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("gec_oyun_url"));
    }

//  ************** Test Case 3 **************

    @Given("tournament linkine tiklar ve geri döner")
    public void tournament_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.tournamentLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("tournament_url"));
    }

//  ************** Test Case 4 **************

    @Given("kullanici medya linkine gider")
    public void kullanici_medya_linkine_gider() {
        myMethods.elementeGit(page.medyaDropdown);
    }

    @Given("ekran göruntuleri linkine tiklar ve geri döner")
    public void ekran_göruntuleri_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.medyaDrpdwnEkranGörüntüleriLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("ekran_goruntuleri_url"));
        myMethods.elementeGit(page.medyaDropdown);
    }

    @Given("tv reklamlari linkine tiklar ve geri döner")
    public void tv_reklamlari_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.medyaDrpdwnTVreklamlarıLinki);
        myMethods.assertToUrl(ConfigurationReader.getProperty("tv_reklamlari_url"));
    }

//  ************** Test Case 5 **************

    @Given("discord dropdownuna gider")
    public void discord_dropdownuna_gider() {
        myMethods.elementeGit(page.discordDrpdwn);
    }

    @Given("blog linkine tiklar")
    public void blog_linkine() {
        page.blogLinki.click();
        String handles = (String) (tumPencereler.toArray())[tumPencereler.size()-1];
        Driver.getDriver().switchTo().window(handles);

    }

    @Given("discord linkine tiklar")
    public void discord_linkine_tiklar() {
        myMethods.elementeGit(page.discordDrpdwn);
        page.discordLinki.click();
        String handles = (String) (tumPencereler.toArray())[tumPencereler.size()-1];
        Driver.getDriver().switchTo().window(handles);

    }

    @Given("calender linkine tiklar")
    public void calender_linkine() {
        myMethods.elementeGit(page.discordDrpdwn);
        page.calenderLinki.click();
        String handles = (String) (tumPencereler.toArray())[tumPencereler.size()-1];
        Driver.getDriver().switchTo().window(handles);

    }


    @Given("travian logosunun görunurlugunu test eder")
    public void travian_logosunun_görunurlugunu_test_eder() {
        Assert.assertTrue(page.travianLogo.isDisplayed());
    }

    @Given("dil secenekleri linkini tiklar")
    public void dil_secenekleri_linkini_tiklar() {
        page.dilSecenekleriLinki.click();
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

    @Given("haberler linkine tiklar ve geri döner")
    public void haberler_linkine_tiklar_ve_geri_döner() {
        page.haberlerLinki.click();
        //myMethods.windowsHandleAl(ConfigurationReader.getProperty("haberler_url"));
    }

    @Given("ana sayfada buyuk yazinin görunup görunmedigine bakar")
    public void ana_sayfada_buyuk_yazinin_görunup_görunmedigine_bakar() {
       Assert.assertTrue(page.anaSayfadakiBuyukYazi.isDisplayed());
    }

    @Given("ana sayfada kucuk yazinin görunup görunmedigine bakar")
    public void ana_sayfada_kucuk_yazinin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(page.anaSayfadakiKucukYazi.isDisplayed());
    }

    @Given("ana sayfada hemen oyna yazisinin görunup görunmedigine bakar")
    public void ana_sayfada_hemen_oyna_yazisinin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(page.hemenOyna.isDisplayed());
    }

    @Given("ana sayfada kale arka plan resminin görunup görunmedigine bakar")
    public void ana_sayfada_kale_arka_plan_resminin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(page.girisSayfasiKaleResmi.isDisplayed());
    }

    @Given("ana sayfada roma ordusu resminin görunup görunmedigine bakar")
    public void ana_sayfada_roma_ordusu_resminin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(page.girisSayfasiOrduResmi.isDisplayed());
    }

    @Given("ana sayfada roma komutan resminin görunup görunmedigine bakar")
    public void ana_sayfada_roma_komutan_resminin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(page.girisSayfasiKomutanResmi.isDisplayed());
    }

    @Given("facebook linkine tiklar ve geri döner")
    public void facebook_linkine_tiklar_ve_geri_döner() {
        page.facebookLinki.click();
        String handles = (String) (tumPencereler.toArray())[tumPencereler.size()-1];
        Driver.getDriver().switchTo().window(handles);
        //myMethods.windowsHandleAl(ConfigurationReader.getProperty("travian_facebook_url"));
    }

    @Given("sayfanin altindaki discord linkine tiklar")
    public void sayfanin_altindaki_discord_linkine_tiklar() {
       page.sayfaAltiDiscordLinki.click();
       //myMethods.windowsHandleAl(ConfigurationReader.getProperty("sayfanin_altindaki_discord_linki"));
    }

    @Given("sayfanin altindaki youtube linkine tiklar")
    public void sayfanin_altindaki_youtube_linkine_tiklar() {
        page.youTubeLinki.click();
        String handles = (String) (tumPencereler.toArray())[tumPencereler.size()-3];
        Driver.getDriver().switchTo().window(handles);
       // myMethods.windowsHandleAl(ConfigurationReader.getProperty("travian_youtube_linki"));
    }

    @Given("sayfanin altindaki destek linkine tiklar ve geri döner")
    public void sayfanin_altindaki_destek_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.sayfaAltiDestekLinki);
    }

    @Given("sayfanin altindaki daha fazla oyna linkine tiklar ve geri döner")
    public void sayfanin_altindaki_daha_fazla_oyna_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.sayfaAltiDahaFazlaOynaLinki);
    }

    @Given("sayfanin altindaki oyunk kurallari linkine tiklar ve geri döner")
    public void sayfanin_altindaki_oyunk_kurallari_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.sayfaAltiOyunKurallariLinki);
    }
}


// Bu sayfada discord linkinde islemler yapilacak.
// bu islemler acilan yeni pencerelrin kapatilmasi ve diger methodlara gecilemsi