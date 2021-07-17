package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyMethods;

import java.util.Set;


public class US_01_SayfaGörunurlugu {
/*
                        ****************************  NESNELER     ******************
*/
    Page page=new Page();
    MyMethods myMethods=new MyMethods();
    SoftAssert softAssert=new SoftAssert();
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

        Set<String> tumPencereler=Driver.getDriver().getWindowHandles();

        for (String w:tumPencereler){
            System.out.println(w);
        }
        String ikinciSayfaHandle= (String) (tumPencereler.toArray())[tumPencereler.size()-1];
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String url=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigurationReader.getProperty("discord_url"),url);
        System.out.println("String : "+url);
        System.out.println("config : "+ConfigurationReader.getProperty("discord_url"));
    }

}
