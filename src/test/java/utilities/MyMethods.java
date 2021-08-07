package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MyMethods {

    Actions actions=new Actions(Driver.getDriver());
    Page page=new Page();
    static String url="";

    public void acceptAll(){
        Page page=new Page();
        try {
            if (page.acceptAll.isDisplayed()){
                page.acceptAll.click();
            }
        }catch (Exception e){
        }
    }

    public void urlAssert(){
        String url=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url,ConfigurationReader.getProperty("travian_Url"));
    }

    public void linkiTiklaGeriDön(WebElement element){
        element.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        url=Driver.driver.getCurrentUrl();
        Driver.getDriver().navigate().back();
    }

    public void urlDogrula(String string){
        Assert.assertEquals(string,url);
    }

    public void elementeGit(WebElement element){
        actions.moveToElement(element).perform();
    }

    public void windowsHandleAl(String string){

        Set<String> tumPencereler=Driver.getDriver().getWindowHandles();
    /*
        for (String w:tumPencereler){
            System.out.println(w);
        }
    */
        String ikinciSayfaHandle= (String) (tumPencereler.toArray())[tumPencereler.size()-1];
        Driver.getDriver().switchTo().window(ikinciSayfaHandle);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String url=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(string,url);
    }

    public void dilSec(){

        for (int i=1;i<page.dilSecenekleri.size();i++){

            Assert.assertTrue(page.dilSecenekleri.get(i).isDisplayed());

            page.dilSecenekleri.get(i).click();

            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i!=48){
                page.dilSecenekleriLinki.click();
            }
        }
    }

    public void sec(List <WebElement> element, WebElement element1){

        for (int i=1;i<element.size();i++){

           element.get(i).click();

          /*switch (page.sunucuBölgesininAdi.getText()){
               case "Uluslararası sunucu":
                   Assert.assertEquals(page.sunucuBölgesininAdi.getText(),"Uluslararası sunucu");
                   element1.click();
                   break;
               case "Arap sunucusu":
                   Assert.assertEquals(page.sunucuBölgesininAdi.getText(),ConfigurationReader.getProperty("arap_sunucusu"));
                   element1.click();
                   break;
               case "Amerikan sunucusu":
                   Assert.assertEquals(page.sunucuBölgesininAdi.getText(),ConfigurationReader.getProperty("amerikan_sunucusu"));
                   element1.click();
                   break;
               case "Asya sunucusu":
                   Assert.assertEquals(page.sunucuBölgesininAdi.getText(),ConfigurationReader.getProperty("asya_sunucusu"));
                   element1.click();
                   break;
               case "Avrupa sunucusu":
                   Assert.assertEquals(page.sunucuBölgesininAdi.getText(),ConfigurationReader.getProperty("avrupa_sunucusu"));
                   element1.click();
                   break;
           }*/
            element1.click();

        }
    }

    public void selectNewestServer(List <WebElement>  element){
        List <Integer> list=new ArrayList<>();
        int siralamaIcin;
        int enKucuk = 0;

        for (int i = 1; i<element.size();i++){
            siralamaIcin= Integer.parseInt(element.get(i).getText());
            list.add(siralamaIcin);

            Collections.sort(list);
            if (list.get(0)==Integer.parseInt(element.get(i).getText())){
                enKucuk=i;
            }
        }
        System.out.println(list);
        element.get(enKucuk).click();
        //System.out.println("En yeni Server "+element.get(0).getText()+" gun önce acildi.");
    }

    public void milletSec(String string){
            switch (string){
                case "galyalilar":
                    page.oyundakiMilletler.get(0).click();
                    break;
                case "romalilar":
                    page.oyundakiMilletler.get(1).click();
                    break;
                case "cermenler":
                    page.oyundakiMilletler.get(2).click();
                    break;
                case "misirlilar":
                    page.oyundakiMilletler.get(3).click();
                    break;
                case "hunlar":
                    page.oyundakiMilletler.get(4).click();
                    break;
            }
    }

    public void kaynaklariTespitEt(List <WebElement> element, WebElement element1){

        List <Integer> odunKaynaklari = new ArrayList<>();
        List <Integer> tahilKaynaklari = new ArrayList<>();
        List <Integer> tuglaKaynaklari = new ArrayList<>();
        List <Integer> demirKaynaklari = new ArrayList<>();

        for (int i=0;i<element.size();i++){
            element.get(i).click();
            if (element1.getText().contains("Oduncu")){
                odunKaynaklari.add(i);
            } else if (element1.getText().contains("Tarla")){
                tahilKaynaklari.add(i);
            } else if (element1.getText().contains("Demir")){
                demirKaynaklari.add(i);
            } else if (element1.getText().contains("Tuğla")){
                tuglaKaynaklari.add(i);
            }
            Driver.getDriver().navigate().back();
        }
    }
}
