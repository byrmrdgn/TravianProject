package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import pages.Page;
import utilities.ConfigurationReader;
import utilities.MyMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class US_02_HemenOyna {

    Page page=new Page();
    MyMethods myMethods=new MyMethods();

    @Given("hemen oyna linkine tiklar")
    public void hemen_oyna_linkine_tiklar() {
        page.hemenOyna.click();
    }

    @Given("acilan pencereden oyun dunyalarina bakar")
    public void acilan_pencereden_oyun_dunyalarina_bakar() {
        page.oyunDunyasiniDegistir.click();
    }

    @Then("oyun dunyalarini kontrol eder")
    public void oyun_dunyalarini_kontrol_eder() {
        myMethods.sec(page.bölgeSec,page.farkliBölgeSec);
    }

    @Given("acilan pencereden uluslararasi bölgenin oynandigi gun sayilarina bakar")
    public void acilan_pencereden_uluslararasi_bölgenin_oynandigi_gun_sayilarina_bakar() {
        page.bölgeSec.get(1).click();
        myMethods.selectNewestServer(page.sunucuYasi);


    }

    @Then("en kucuk gun sayisi olani secer")
    public void en_kucuk_gun_sayisi_olani_secer() {


        for (int i=0; i <page.sunucuYasi.size();i++){
            //System.out.println(page.sunucuYasi.get(i).getText());
        }

  }

    @Given("acilan pencereden arap bölgesinin oynandigi gun sayilarina bakar")
    public void acilan_pencereden_arap_bölgesinin_oynandigi_gun_sayilarina_bakar() {
        page.bölgeSec.get(2).click();
        myMethods.selectNewestServer(page.sunucuYasi);
    }

    @Given("acilan pencereden amerika bölgesinin oynandigi gun sayilarina bakar")
    public void acilan_pencereden_amerika_bölgesinin_oynandigi_gun_sayilarina_bakar() {
        page.bölgeSec.get(3).click();
        myMethods.selectNewestServer(page.sunucuYasi);
    }

    @Given("acilan pencereden asya bölgesinin oynandigi gun sayilarina bakar")
    public void acilan_pencereden_asya_bölgesinin_oynandigi_gun_sayilarina_bakar() {
        page.bölgeSec.get(4).click();
        myMethods.selectNewestServer(page.sunucuYasi);
    }

    @Given("acilan pencereden avrupa bölgesinin oynandigi gun sayilarina bakar")
    public void acilan_pencereden_avrupa_bölgesinin_oynandigi_gun_sayilarina_bakar() {
        page.bölgeSec.get(5).click();
        myMethods.selectNewestServer(page.sunucuYasi);

        }

    @Given("oyun dunyasini degistir linkine tiklar")
    public void oyun_dunyasini_degistir_linkine_tiklar() {
      page.oyunDunyasiniDegistir.click();
    }

    @Then("acilan dunyalardan en yeni server'i secer")
    public void acilan_dunyalardan_en_yeni_server_i_secer() {

        List<Integer> list = new ArrayList<>();

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
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            page.farkliBölgeSec.click();
        }

        try{
            for (int i=1;i<page.bölgeSec.size();i++) {
                page.bölgeSec.get(i).click();
                for (int j = 1; j < page.sunucuYasi.size(); j++) {
                    if (list.get(0)==Integer.parseInt(page.sunucuYasi.get(j).getText())){
                        page.sunucuYasi.get(j).click();
                        break;
                    }
                }
                page.farkliBölgeSec.click();
            }
        }catch (Exception e){}
    }

    @Then("ePosta kutusuna e posta adresini girer")
    public void e_posta_kutusuna_e_posta_adresini_girer() {
        page.emailKutusu.sendKeys(ConfigurationReader.getProperty("gecerliKullanici_email"));
    }
    @Then("hemen Kaydol butonuna tiklar")
    public void hemen_kaydol_butonuna_tiklar() {
        page.hemenKaydolButonu.click();
    }
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
}



