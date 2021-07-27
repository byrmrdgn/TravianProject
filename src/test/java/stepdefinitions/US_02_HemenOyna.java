package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Page;
import utilities.MyMethods;

import java.util.ArrayList;
import java.util.Collection;
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
       for (int i =0 ; i<page.sunucuYasi.size(); i++){
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           //System.out.println(page.sunucuYasi.get(i).getText());
           Assert.assertTrue(page.sunucuYasi.get(i).isDisplayed());

       }
    }
    @Then("en kucuk gun sayisi olani secer")
    public void en_kucuk_gun_sayisi_olani_secer() {


        for (int i=0; i <page.sunucuYasi.size();i++){
            System.out.println(page.sunucuYasi.get(i).getText());
        }

  }

    @Given("acilan pencereden arap bölgesinin oynandigi gun sayilarina bakar")
    public void acilan_pencereden_arap_bölgesinin_oynandigi_gun_sayilarina_bakar() {
        page.bölgeSec.get(2).click();
        for (int i =0 ; i<page.sunucuYasi.size(); i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(page.sunucuYasi.get(i).getText());
            Assert.assertTrue(page.sunucuYasi.get(i).isDisplayed());

        }
    }

    @Given("acilan pencereden amerika bölgesinin oynandigi gun sayilarina bakar")
    public void acilan_pencereden_amerika_bölgesinin_oynandigi_gun_sayilarina_bakar() {
        page.bölgeSec.get(3).click();
        for (int i =0 ; i<page.sunucuYasi.size(); i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println(page.sunucuYasi.get(i).getText());
            Assert.assertTrue(page.sunucuYasi.get(i).isDisplayed());

        }
    }
}


