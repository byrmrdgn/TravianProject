package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyMethods;


public class US_01_SayfaGörunurlugu {
/*
                        ****************************  NESNELER     ******************
*/
    Page page=new Page();
    MyMethods myMethods=new MyMethods();
    Actions actions =new Actions(Driver.getDriver());

/*
                        ****************************  KODLAR     ******************
 */

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("travian_Url"));
        //myMethods.acceptAll();
        myMethods.urlAssert();
    }

    @Given("kullanici oyun dropdownuna gider")
    public void kullanici_oyun_dropdownuna_gider() {
        myMethods.elementeGit(page.oyunDropdown);
    }

    @Given("oyun tarzi linkine tiklar ve geri döner")
    public void oyun_tarzi_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnOyunTarziLinki);
        myMethods.elementeGit(page.oyunDropdown);
        myMethods.urlDogrula(ConfigurationReader.getProperty("oyun_tarzi_url"));
    }

    @Given("oyuncu etkilesimine tiklar ve geri döner")
    public void oyuncu_etkilesimine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnOyuncuEtkilesimiLinki);
        myMethods.elementeGit(page.oyunDropdown);
        myMethods.urlDogrula(ConfigurationReader.getProperty("oyuncu_etkilesimi_url"));
    }

    @Given("imparatorluk kur linkine tiklar ver geri döner")
    public void imparatorluk_kur_linkine_tiklar_ver_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnİmparatorlukKurLinki);
        myMethods.elementeGit(page.oyunDropdown);
        myMethods.urlDogrula(ConfigurationReader.getProperty("imparatorluk_kur_url"));
    }

    @Given("Carpisma linkine tiklar ve geri döner")
    public void carpisma_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnÇarpışmaLinki);
        myMethods.urlDogrula(ConfigurationReader.getProperty("carpisma_url"));
        myMethods.elementeGit(page.oyunDropdown);

    }

    @Given("Gec oyun linkine tiklar ve geri döner")
    public void gec_oyun_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.oyunDrpdwnGeçOyunLinki);
        myMethods.urlDogrula(ConfigurationReader.getProperty("gec_oyun_url"));
    }

    @Given("tournament linkine tiklar ve geri döner")
    public void tournament_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.tournamentLinki);
        myMethods.urlDogrula(ConfigurationReader.getProperty("tournament_url"));
    }

    @Given("kullanici medya linkine gider")
    public void kullanici_medya_linkine_gider() {
        myMethods.elementeGit(page.medyaDropdown);
    }

    @Given("ekran göruntuleri linkine tiklar ve geri döner")
    public void ekran_göruntuleri_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.medyaDrpdwnEkranGörüntüleriLinki);
        myMethods.elementeGit(page.medyaDropdown);
        myMethods.urlDogrula(ConfigurationReader.getProperty("ekran_goruntuleri_url"));
    }

    @Given("tv reklamlari linkine tiklar ve geri döner")
    public void tv_reklamlari_linkine_tiklar_ve_geri_döner() {
        myMethods.linkiTiklaGeriDön(page.medyaDrpdwnTVreklamlarıLinki);
        myMethods.urlDogrula(ConfigurationReader.getProperty("tv_reklamlari_url"));
    }

    @Given("discord linkine tiklar ve geri döner")
    public void discord_linkine_tiklar_ve_geri_döner() {
       page.discordLinki.click();
       myMethods.windowsHandleAl(ConfigurationReader.getProperty("discord_url"));
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
        for (WebElement w : page.dilSecenekleri){
            System.out.println(w.getText());
        }
    }

    @Given("haberler linkine tiklar ve geri döner")
    public void haberler_linkine_tiklar_ve_geri_döner() {
        page.haberlerLinki.click();
        myMethods.windowsHandleAl(ConfigurationReader.getProperty("haberler_url"));
    }

    @Given("ana sayfada buyuk yazinin görunup görunmedigine bakar")
    public void ana_sayfada_buyuk_yazinin_görunup_görunmedigine_bakar() {
       Assert.assertTrue(page.anaSayfadakiBuyukYazi.isDisplayed());
    }

    @Given("ana sayfada kucuk yazinin görunup görunmedigine bakar")
    public void ana_sayfada_kucuk_yazinin_görunup_görunmedigine_bakar() {
        Assert.assertTrue(page.anaSayfadakiKucukYazi.isDisplayed());
    }

}
