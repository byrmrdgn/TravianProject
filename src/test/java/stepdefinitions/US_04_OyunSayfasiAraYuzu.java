package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.OyunSayfasiAraYuzu;
import utilities.Driver;
import utilities.MyMethods;

import java.util.ArrayList;
import java.util.List;

public class US_04_OyunSayfasiAraYuzu {

    Actions actions=new Actions(Driver.getDriver());




    OyunSayfasiAraYuzu page=new OyunSayfasiAraYuzu();
    MyMethods myMethods=new MyMethods();
/*
    @Given("kullanici hammadde kaynaklarina tiklar ve geri döner")
    public void kullanici_hammadde_kaynaklarina_tiklar_ve_geri_döner() {

        myMethods.acceptAll();



        for (int i=0;i<page.hammaddeKaynaklari.size();i++){

            page.hammaddeKaynaklari.get(i).click();
            if (page.hammaddeTurununBasligi.getText().contains("Oduncu")){
                odunKaynaklari.add(i);
            } else if (page.hammaddeTurununBasligi.getText().contains("Tarla")){
                tahilKaynaklari.add(i);
            } else if (page.hammaddeTurununBasligi.getText().contains("Demir")){
                demirKaynaklari.add(i);
            } else if (page.hammaddeTurununBasligi.getText().contains("Tuğla")){
                tuglaKaynaklari.add(i);
            }
            Driver.getDriver().navigate().back();
        }

    }

    @Given("kullanici en az gelismis olani odun kaynagini secer ve onu gelistirir")
    public void kullanici_en_az_gelismis_olani_odun_kaynagini_secer_ve_onu_gelistirir() {

      for (int i=0;i<page.hammaddeKaynaklari.size();i++){
         if (page.hammaddeKaynaklari.get(i).getText().equals("")){
             page.hammaddeKaynaklari.get(i).click();
         }
      }
      page.buSeviyeyiGelistir1.click();
    }
    */

//    @Given("kullanici bina alanlarina tiklar ve geri döner")
//    public void kullanici_bina_alanlarina_tiklar_ve_geri_döner() {
//
//      myMethods.acceptAll();
//      page.köyMerkeziLinki.click();
//      //for (int i=0;i<page.köyiciBinaAlanlari.size();i++){
//
//          actions.moveToElement(page.köyiciBinaAlanlari.get(20)).click().perform();
//
//          //actions.moveToElement(page.köyiciBinaAlanlari.get(i)).click().perform();
//          //Driver.getDriver().navigate().back();
//      //}
//    }

}
