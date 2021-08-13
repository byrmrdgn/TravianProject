package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.KahramanPage;
import utilities.Driver;
import utilities.MyMethods;

public class KahramanStepDef {

    KahramanPage kahramanPage=new KahramanPage();
    MyMethods myMethods =new MyMethods();
    Actions actions=new Actions(Driver.getDriver());


    @Given("kullanici kahramani secer")
    public void kullanici_kahramani_secer() {
        kahramanPage.kahramanGenelBakisButonu.click();
    }
    @Given("macera butonuna tiklar")
    public void macera_butonuna_tiklar() {
        kahramanPage.kahramanMacera.click();
    }
    @Given("macerayi baslatir")
    public void macerayi_baslatir() {
        kahramanPage.macerayiBaslat.click();
    }

    @Given("ve macerayi onaylar")
    public void ve_macerayi_onaylar() {
        kahramanPage.macerayiOnayla.click();
    }

    @Given("birinci itemi kullanir")
    public void birinci_itemi_kullanir() {
        kahramanPage.itemKutusu1.click();
    }

    @Given("saldiri esnasinda savas")
    public void saldiri_esnasinda_savas() {
        kahramanPage.saldiriEsnasindaSavas.click();
    }

    @Given("saldiri esnasinda saklan")
    public void saldiri_esnasinda_saklan() {
        kahramanPage.saldiriEsnasindaSaklan.click();
    }

    @Given("degisiklikleri kaydeder")
    public void degisiklikleri_kaydeder() {
        kahramanPage.kahramandakiDegisiklikleriKaydet.click();
    }

    @Given("saglik seviyesini alir")
    public void saglik_seviyesini_alir() {
        String saglikSeviyesi=kahramanPage.saglikSeviyesi.getText();
        System.out.println("Kahramanin maceraya cikarken sahip oldugu Saglik seviyesi = "+saglikSeviyesi);
    }

    @Given("kahramanin savunma bonusunu arttirir")
    public void kahramanin_savunma_bonusunu_arttirir() {
        myMethods.kahramanÖzelliginiDegistir(kahramanPage.sahipOlunanPuanlar, kahramanPage.kahramaninSaldiriBonusunuArttir);
    }

    @Given("item ekler")
    public void item_ekler() {
        myMethods.itemSec(kahramanPage.itemKutusu7);
    }

    @Given("itemi onaylar")
    public void itemi_onaylar() {
        myMethods.wait(5);
        kahramanPage.itemiOnayla.click();
    }


}
