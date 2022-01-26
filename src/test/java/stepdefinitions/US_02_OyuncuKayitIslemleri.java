package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US_01_IlkSayfaninGörunurluguPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class US_02_OyuncuKayitIslemleri {
/*
                        ****************************  NESNELER     ******************
*/
    US_01_IlkSayfaninGörunurluguPage page=new US_01_IlkSayfaninGörunurluguPage();
    MyMethods myMethods=new MyMethods();
    Actions actions =new Actions(Driver.getDriver());

/*
                        ****************************  KODLAR     ******************
*/

//  ************** Test Case 20 **************
    @Given("hemen oyna linkine tiklar")
    public void hemen_oyna_linkine_tiklar() {
        page.hemenOyna.click();
        myMethods.wait(10);
        Assert.assertTrue(page.oynamakIcinKaydol.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }

    @Given("sayfada asagi inerek cikan kaydol linkine tiklar")
    public void sayfada_asagi_inerek_cikan_kaydol_linkine_tiklar() {
        myMethods.goToPageDown();
        page.kaydolLinki.click();
        myMethods.wait(10);
        Assert.assertTrue(page.oynamakIcinKaydol.isDisplayed());
        Driver.getDriver().navigate().refresh();
    }

    @Given("sayfanin altindaki hemen oyna linkine tiklar")
    public void sayfanin_altindaki_hemen_oyna_linkine_tiklar() {
        page.sayfaAltiHemenOyna.click();
        myMethods.wait(2);
        Assert.assertTrue(page.oynamakIcinKaydol.isDisplayed());
    }

//  ************** Test Case 21 **************

    @Given("hemen oyna linkine tiklayarak acilan pencereden oyun dunyalarina bakar")
    public void hemen_oyna_linkine_tiklayarak_acilan_pencereden_oyun_dunyalarina_bakar() {
        page.hemenOyna.click();
        page.oyunDunyasiniDegistir.click();
        myMethods.wait(10);
        Assert.assertTrue(page.bölgelereBak.isDisplayed());
    }

    @Then("oyun dunyalarini kontrol eder")
    public void oyun_dunyalarini_kontrol_eder() {
        myMethods.sec(page.bölgeSec,page.farkliBölgeSec);
    }

//  ************** Test Case 22 **************

    @Given("acilan pencereden uluslararasi bölgenin oynandigi gun sayilarina bakararak en yeni olani secer")
    public void acilan_pencereden_uluslararasi_bölgenin_oynandigi_gun_sayilarina_bakararak_en_yeni_olani_secer() {
        page.bölgeSec.get(1).click();
        myMethods.selectNewestServer(page.sunucuYasi);
    }

//  ************** Test Case 23 **************

    @Given("acilan pencereden arap bölgesinin oynandigi gun sayilarina bakararak en yeni olani secer")
    public void acilan_pencereden_arap_bölgesinin_oynandigi_gun_sayilarina_bakararak_en_yeni_olani_secer() {
        page.bölgeSec.get(2).click();
        myMethods.selectNewestServer(page.sunucuYasi);
    }

//  ************** Test Case 24 **************

    @Given("acilan pencereden amerika bölgesinin oynandigi gun sayilarina bakararak en yeni olani secer")
    public void acilan_pencereden_amerika_bölgesinin_oynandigi_gun_sayilarina_bakararak_en_yeni_olani_secer() {
        page.bölgeSec.get(3).click();
        myMethods.selectNewestServer(page.sunucuYasi);
    }

//  ************** Test Case 25 **************

    @Given("acilan pencereden asya bölgesinin oynandigi gun sayilarina bakararak en yeni olani secer")
    public void acilan_pencereden_asya_bölgesinin_oynandigi_gun_sayilarina_bakararak_en_yeni_olani_secer() {
        page.bölgeSec.get(4).click();
        myMethods.selectNewestServer(page.sunucuYasi);
    }

//  ************** Test Case 26 **************

    @Given("acilan pencereden avrupa bölgesinin oynandigi gun sayilarina bakararak en yeni olani secer")
    public void acilan_pencereden_avrupa_bölgesinin_oynandigi_gun_sayilarina_bakararak_en_yeni_olani_secer() {
        page.bölgeSec.get(5).click();
        myMethods.selectNewestServer(page.sunucuYasi);
    }

//  ************** Test Case 27 **************

    @Then("acilan dunyalardan en yeni server'i secer")
    public void acilan_dunyalardan_en_yeni_server_i_secer() {

        List<Integer> list = new ArrayList<>(); // sunucu yaslarini icine acmak icin bir list olusturduk

        for (int i=1;i<page.bölgeSec.size();i++) {
            page.bölgeSec.get(i).click();

            int siralamaIcin;
            for (int j = 1; j < page.sunucuYasi.size(); j++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                siralamaIcin = Integer.parseInt(page.sunucuYasi.get(j).getText());
                list.add(siralamaIcin);
                Collections.sort(list);
                //System.out.println(list);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            page.farkliBölgeSec.click();
        } // for icinde tum oyun dunyalarini gezerek oyun
                                                       // yaslarini olusturdugumuz list icine attik ve onlari osrt ettik.

        try{
            for (int i=1;i<page.bölgeSec.size();i++) {
                page.bölgeSec.get(i).click();
                for (int j = 1; j < page.sunucuYasi.size(); j++) {
                    if (list.get(0)==Integer.parseInt(page.sunucuYasi.get(j).getText())){
                        page.sunucuYasi.get(j).click();
                        Assert.assertTrue(list.get(0)==Integer.parseInt(page.sunucuYasi.get(0).getText()));
                        //break;
                    }
                }
                page.farkliBölgeSec.click();

            }
        }catch (Exception e){} // bir try catch icinde list'in ilk elemani olan server'i aradik.
                                      // Bulunca o server'i sectik ve sonra da assert ettik
/*
        System.out.println(list.get(0));
        System.out.println(page.sunucuYasi.get(0).getText());

 */
    }

//  ************** Test Case 28 **************

    @Then("ePosta kutusuna e posta adresini girer")
    public void e_posta_kutusuna_e_posta_adresini_girer() {
        page.emailKutusu.sendKeys(ConfigurationReader.getProperty("gecerliKullanici_email"));
    }

    @Then("hemen Kaydol butonuna tiklar")
    public void hemen_kaydol_butonuna_tiklar() {
        page.hemenKaydolButonu.click();
        Assert.assertTrue(page.oynamakIcinKaydol.isDisplayed());
    }

//  ************** Test Case 29 **************

    @Then("isim kutusuna ismini girer")
    public void isim_kutusuna_ismini_girer() {
        page.isimKutusu.sendKeys(ConfigurationReader.getProperty("kullanici_ismi"));
    }

    @Then("email kutusuna gecersiz email girer")
    public void email_kutusuna_gecersiz_email_girer() {
        page.emailKutusu.sendKeys(ConfigurationReader.getProperty("gecersizKullaniciEmail1"));
    }

    /* suana kadar en yeni server bulundu. bundan sonra yeni bir us icinde kayit islemi yapilacak.
    a) gecersiz mail
    b) gecerli mail
    c) mailsiz
    d) isimsiz girisler yapilacak

     */

    @Then("email kutusuna email girer")
    public void email_kutusuna_email_girer() {
       page.emailKutusu.sendKeys(ConfigurationReader.getProperty("gecerliKullanici_email"));
    }

    @Then("genel sartlari kabul eder")
    public void genel_sartlari_kabul_eder() {
        page.genelSartlarKabul.click();
    }
}



