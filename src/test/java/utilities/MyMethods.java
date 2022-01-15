package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US_01_IlkSayfaninGörunurluguPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MyMethods {

    Actions actions = new Actions(Driver.getDriver());
    US_01_IlkSayfaninGörunurluguPage page = new US_01_IlkSayfaninGörunurluguPage();
    static String url = "";

    public void acceptAll() {
        US_01_IlkSayfaninGörunurluguPage page = new US_01_IlkSayfaninGörunurluguPage();
        try {
            if (page.acceptAll.isDisplayed()) {
                page.acceptAll.click();
            }
        } catch (Exception e) {
        }
    }

    public void assertToMainUrl() {
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url, ConfigurationReader.getProperty("travian_Url"));
    }

    public void linkiTiklaGeriDön(WebElement element) {
        element.click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        url = Driver.driver.getCurrentUrl();
        Driver.getDriver().navigate().back();
    }

    public void assertToUrl(String string) {
        Assert.assertEquals(string, url);
    }

    public void getHandlesAndUrl(){
        Set<String> allHandles=Driver.getDriver().getWindowHandles();
        Object[] handlesArray=allHandles.toArray();

        for (int i=0;i<handlesArray.length;i++){
            Driver.getDriver().switchTo().window(handlesArray[i].toString());
            url=Driver.getDriver().getCurrentUrl();
            Driver.getDriver().switchTo().window(handlesArray[0].toString());
        }

    }

    public void elementeGit(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void dilSec() {

        for (int i = 1; i < page.dilSecenekleri.size(); i++) {

            Assert.assertTrue(page.dilSecenekleri.get(i).isDisplayed());


            page.dilSecenekleri.get(i).click();

            Set<String>dilLinkleri= Collections.singleton(Driver.getDriver().getCurrentUrl());
            Object[] urlToLangues=dilLinkleri.toArray();

            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i != 48) {
                page.dilSecenekleriLinki.click();
            }



        }
    }

    public void sec(List<WebElement> element, WebElement element1) {

        for (int i = 1; i < element.size(); i++) {

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

    public void selectNewestServer(List<WebElement> element) {
        List<Integer> list = new ArrayList<>();
        int siralamaIcin;
        int enKucuk = 0;

        for (int i = 1; i < element.size(); i++) {
            siralamaIcin = Integer.parseInt(element.get(i).getText());
            list.add(siralamaIcin);

            Collections.sort(list);
            if (list.get(0) == Integer.parseInt(element.get(i).getText())) {
                enKucuk = i;
            }
        }
        System.out.println(list);
        element.get(enKucuk).click();
        //System.out.println("En yeni Server "+element.get(0).getText()+" gun önce acildi.");
    }

    public void milletSec(String string) {
        switch (string) {
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

    public void kaynaklariTespitEt(List<WebElement> element, WebElement element1) {

        List<Integer> odunKaynaklari = new ArrayList<>();
        List<Integer> tahilKaynaklari = new ArrayList<>();
        List<Integer> tuglaKaynaklari = new ArrayList<>();
        List<Integer> demirKaynaklari = new ArrayList<>();

        for (int i = 0; i < element.size(); i++) {
            element.get(i).click();
            if (element1.getText().contains("Oduncu")) {
                odunKaynaklari.add(i);
            } else if (element1.getText().contains("Tarla")) {
                tahilKaynaklari.add(i);
            } else if (element1.getText().contains("Demir")) {
                demirKaynaklari.add(i);
            } else if (element1.getText().contains("Tuğla")) {
                tuglaKaynaklari.add(i);
            }
            Driver.getDriver().navigate().back();
        }
    }

    public void binaIcinAlanSec(WebElement element) {
        actions.moveToElement(element).click().perform();
    }

    public void wait(int n) {
        n = n * 100;
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void hammaddeGelistir(WebElement element, WebElement element1, WebElement element2, WebElement element3) {

        boolean bosMu = element.getText().equals("") || element1.getText().equals("") || element2.getText().equals("") || element3.getText().equals("");
        if (bosMu) {

            if (element.getText().equals("")) {
                wait(5);
                actions.moveToElement(element).click().perform();
            } else if (element1.getText().equals("")) {
                wait(5);
                actions.moveToElement(element1).click().perform();
            } else if (element2.getText().equals("")) {
                wait(5);
                actions.moveToElement(element2).click().perform();
            } else if (element3.getText().equals("")) {
                wait(5);
                actions.moveToElement(element3).click().perform();
            }
        } else {
            int kaynak1 = Integer.parseInt(element.getText());
            int kaynak2 = Integer.parseInt(element1.getText());
            int kaynak3 = Integer.parseInt(element2.getText());
            int kaynak4 = Integer.parseInt(element3.getText());

            if (kaynak1 < kaynak2 || kaynak1 < kaynak3 || kaynak1 < kaynak4) {
                actions.moveToElement(element).click().perform();
            } else if (kaynak2 < kaynak1 || kaynak2 < kaynak3 || kaynak2 < kaynak4) {
                actions.moveToElement(element1).click().perform();
            } else if (kaynak3 < kaynak1 || kaynak3 < kaynak2 || kaynak3 < kaynak4) {
                actions.moveToElement(element2).click().perform();
            } else if (kaynak4 < kaynak1 || kaynak4 < kaynak2 || kaynak4 < kaynak3) {
                actions.moveToElement(element3).click().perform();
            }else{
                actions.moveToElement(element).click().perform();
            }
        }
    }

    public void tahilGelistir(WebElement element, WebElement element1, WebElement element2, WebElement element3, WebElement element4, WebElement element5) {

        boolean bosMu = element.getText().equals("") || element1.getText().equals("") ||
                element2.getText().equals("") || element3.getText().equals("") ||
                element4.getText().equals("") || element5.getText().equals("");
        if (bosMu) {

            if (element.getText().equals("")) {
                wait(5);
                actions.moveToElement(element).click().perform();
            } else if (element1.getText().equals("")) {
                wait(5);
                actions.moveToElement(element1).click().perform();
            } else if (element2.getText().equals("")) {
                wait(5);
                actions.moveToElement(element2).click().perform();
            } else if (element3.getText().equals("")) {
                wait(5);
                actions.moveToElement(element3).click().perform();
            } else if (element4.getText().equals("")) {
                wait(5);
                actions.moveToElement(element4).click().perform();
            } else if (element5.getText().equals("")) {
                wait(5);
                actions.moveToElement(element5).click().perform();
            }
        } else {
            int kaynak1 = Integer.parseInt(element.getText());
            int kaynak2 = Integer.parseInt(element1.getText());
            int kaynak3 = Integer.parseInt(element2.getText());
            int kaynak4 = Integer.parseInt(element3.getText());
            int kaynak5 = Integer.parseInt(element4.getText());
            int kaynak6 = Integer.parseInt(element5.getText());

            if (kaynak1 < kaynak2 || kaynak1 < kaynak3 || kaynak1 < kaynak4 || kaynak1 < kaynak5 || kaynak1 < kaynak6) {
                actions.moveToElement(element).click().perform();
            } else if (kaynak2 < kaynak1 || kaynak2 < kaynak3 || kaynak2 < kaynak4 || kaynak2 < kaynak5 || kaynak2 < kaynak6) {
                actions.moveToElement(element1).click().perform();
            } else if (kaynak3 < kaynak1 || kaynak3 < kaynak2 || kaynak3 < kaynak4 || kaynak3 < kaynak5 || kaynak3 < kaynak6) {
                actions.moveToElement(element2).click().perform();
            } else if (kaynak4 < kaynak1 || kaynak4 < kaynak2 || kaynak4 < kaynak3 || kaynak4 < kaynak5 || kaynak4 < kaynak6) {
                actions.moveToElement(element3).click().perform();
            } else if (kaynak5 < kaynak1 || kaynak5 < kaynak2 || kaynak5 < kaynak4 || kaynak5 < kaynak3 || kaynak5 < kaynak6) {
                actions.moveToElement(element4).click().perform();
            } else if (kaynak6 < kaynak1 || kaynak6 < kaynak2 || kaynak6 < kaynak3 || kaynak6 < kaynak4 || kaynak6 < kaynak5) {
                actions.moveToElement(element5).click().perform();
            }else{
                actions.moveToElement(element).click().perform();
            }
        }

    }

    public void kahramanÖzelliginiDegistir(WebElement element,WebElement element1){

        String sahipOlunanPuanlar =element.getText();

        int sonDeger=Integer.parseInt(String.valueOf(sahipOlunanPuanlar.charAt(2)));

        for (int i=0;i<sonDeger;i++){
            element1.click();
        }
    }

    public void itemSec(WebElement element){
        element.click();
    }

    public void hepsiniSil(WebElement element, WebElement element1, WebElement element2){
        int sonSayfaSayisi=Integer.parseInt(element.getText());
        for (int i=0;i<sonSayfaSayisi;i++){
            element1.click();
            element2.click();
        }
    }

}
