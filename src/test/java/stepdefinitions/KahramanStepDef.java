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

    @Given("kahramanin saldiri bonusunu arttirir")
    public void kahramanin_saldiri_bonusunu_arttirir() {
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

    @Given("kahrmani duzenleyi secer")
    public void kahrmani_duzenleyi_secer() {
        kahramanPage.kahramanDuzenleyici.click();
    }

    @Given("kafa seklini secmek icin secenekelere bakar")
    public void kafa_seklini_secmek_icin_secenekelere_bakar() {
        kahramanPage.kafaSekliSecenekleri.click();
    }

    @Given("kafa seklini secer")
    public void kafa_seklini_secer() {
        kahramanPage.kafaSekliniSec.click();
    }

    @Given("sac rengini secmek icin secenekelere bakar")
    public void sac_rengini_secmek_icin_secenekelere_bakar() {
        kahramanPage.sacRengiSecenekleri.click();
    }

    @Given("sac rengini secer")
    public void sac_rengini_secer() {
        kahramanPage.sacRenginiSec.click();
    }

    @Given("sac seklini secmek icin secenekelere bakar")
    public void sac_seklini_secmek_icin_secenekelere_bakar() {
        kahramanPage.sacSekliSecenekleri.click();
    }

    @Given("sac seklini secer")
    public void sac_seklini_secer() {
        kahramanPage.sacSekliniSec.click();
    }

    @Given("kulak seklini secmek icin secenekelere bakar")
    public void kulak_seklini_secmek_icin_secenekelere_bakar() {
        kahramanPage.kulakSekliSecenekleri.click();
    }
    @Given("kulak seklini secer")
    public void kulak_seklini_secer() {
        kahramanPage.kulakSekliniSec.click();
    }


    @Given("kas seklini secmek icin secenekelere bakar")
    public void kas_seklini_secmek_icin_secenekelere_bakar() {
        kahramanPage.kasSekliSecenekleri.click();
    }
    @Given("kas seklini secer")
    public void kas_seklini_secer() {
        kahramanPage.kasSekliniSec.click();
    }

    @Given("göz rengini secmek icin secenekelere bakar")
    public void göz_rengini_secmek_icin_secenekelere_bakar() {
        kahramanPage.gözRengiSecenekleri.click();
    }
    @Given("göz rengini secer")
    public void göz_rengini_secer() {
        kahramanPage.gözRenginiSec.click();
    }

    @Given("burun seklini secmek icin secenekelere bakar")
    public void burun_seklini_secmek_icin_secenekelere_bakar() {
        kahramanPage.burunSekliSecenekleri.click();
    }
    @Given("burun seklini secer")
    public void burun_seklini_secer() {
        kahramanPage.burunSekliniSec.click();
    }

    @Given("agiz seklini secmek icin secenekelere bakar")
    public void agiz_seklini_secmek_icin_secenekelere_bakar() {
        kahramanPage.agizSekliSecenekleri.click();
    }
    @Given("agiz seklini secer")
    public void agiz_seklini_secer() {
        kahramanPage.agizSekliniSec.click();
    }

    @Given("sakal seklini secmek icin secenekelere bakar")
    public void sakal_seklini_secmek_icin_secenekelere_bakar() {
        kahramanPage.sakalSekliSecenekleri.click();
    }
    @Given("sakal seklini secer")
    public void sakal_seklini_secer() {
        kahramanPage.sakalSekliniSec.click();
    }
    @Given("kahramanin fiziksel degisikliklerini kaydeder")
    public void kahramanin_fiziksel_degisikliklerini_kaydeder() {
        kahramanPage.kahramaninFizikselDegisiklikleriKaydet.click();
    }

    @Given("acik arttirma linkine tiklar")
    public void acik_arttirma_linkine_tiklar() {
        kahramanPage.acikArttirma.click();
    }

    @Given("sifa merhemine tiklar")
    public void sifa_merhemine_tiklar() {
        kahramanPage.sifaMerhemiLinki.click();
    }

    @Given("teklfi ver butonuna tiklar ve teklif edecegi miktari girerek teklifi onaylar")
    public void teklfi_ver_butonuna_tiklar_ve_teklif_edecegi_miktari_girerek_teklifi_onaylar() {
        myMethods.wait(5);

        ;

        int urununAnlikFiyati=0;


        for (int i=0;i<20;i++){
            System.out.println(kahramanPage.kasadaOlanGumusMiktari.getText());
            kahramanPage.teklifVer.get(i).click();

            urununAnlikFiyati=Integer.parseInt(kahramanPage.urununAnlikFiyati.getText());
            kahramanPage.teklifKutusu.sendKeys(urununAnlikFiyati+100+"");





            //kahramanPage.teklifiOnayla.click();

            myMethods.wait(3);

        // bu kodda kasada bulunan gumus miktarini alip, urunun aktif miktari ile karsilastiran kasadaki gumus miktari urunun fiyatindan fazla ise o urune +50 gumus ile
        // teklif yapan yeni bir kod ekleyecegim.


        }

    }


}
