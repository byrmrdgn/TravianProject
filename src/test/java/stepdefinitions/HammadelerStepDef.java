package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.HammadelerPage;
import utilities.Driver;
import utilities.MyMethods;

import java.util.ArrayList;
import java.util.List;


public class HammadelerStepDef {

    List <Integer> odunKaynaklari = new ArrayList<>();
    List <Integer> tahilKaynaklari = new ArrayList<>();
    List <Integer> tuglaKaynaklari = new ArrayList<>();
    List <Integer> demirKaynaklari = new ArrayList<>();

    HammadelerPage hammadelerPage = new HammadelerPage();
    MyMethods myMethods = new MyMethods();
    Actions actions =new Actions(Driver.getDriver());

    @Given("kullanici ormani gelistirmek icin alan secer")
    public void kullanici_ormani_gelistirmek_icin_alan_secer() {

        if (hammadelerPage.ormanAlani1.getText().equals("")){
            myMethods.wait(5);
            actions.moveToElement(hammadelerPage.ormanAlani1).click().perform();
            //myMethods.binaIcinAlanSec(hammadelerPage.ormanAlani1);
        }else if (hammadelerPage.ormanAlani2.getText().equals("")){
            myMethods.wait(5);
            actions.moveToElement(hammadelerPage.ormanAlani2).click().perform();
        }else if (hammadelerPage.ormanAlani3.getText().equals("")){
            myMethods.wait(5);
            actions.moveToElement(hammadelerPage.ormanAlani3).click().perform();
        }else if (hammadelerPage.ormanAlani4.getText().equals("")){
            myMethods.wait(5);
            actions.moveToElement(hammadelerPage.ormanAlani4).click().perform();
        }
        int ormanAlani1=Integer.parseInt(hammadelerPage.ormanAlani1.getText());
        int ormanAlani2=Integer.parseInt(hammadelerPage.ormanAlani2.getText());
        int ormanAlani3=Integer.parseInt(hammadelerPage.ormanAlani3.getText());
        int ormanAlani4=Integer.parseInt(hammadelerPage.ormanAlani4.getText());

        if (ormanAlani1<ormanAlani2||ormanAlani1<ormanAlani3||ormanAlani1<ormanAlani4){
            actions.moveToElement(hammadelerPage.ormanAlani1).click().perform();
        }else if (ormanAlani2<ormanAlani1||ormanAlani2<ormanAlani3||ormanAlani2<ormanAlani4){
            actions.moveToElement(hammadelerPage.ormanAlani2).click().perform();
        }else if (ormanAlani3<ormanAlani1||ormanAlani3<ormanAlani2||ormanAlani3<ormanAlani4){
            actions.moveToElement(hammadelerPage.ormanAlani3).click().perform();
        }else if (ormanAlani4<ormanAlani1||ormanAlani4<ormanAlani2||ormanAlani4<ormanAlani3){
            actions.moveToElement(hammadelerPage.ormanAlani4).click().perform();
        }
    }

    @Given("ve ormani gelistirir")
    public void ve_ormani_gelistirir() {
        myMethods.wait(5);
        hammadelerPage.buSeviyeyiGelistir.click();
    }

    @Given("kullanici tuglayi gelistirmek icin alan secer")
    public void kullanici_tuglayi_gelistirmek_icin_alan_secer() {
        myMethods.hammaddeGelistir(hammadelerPage.tuglaAlani1,hammadelerPage.tuglaAlani2,hammadelerPage.tuglaAlani3, hammadelerPage.tuglaAlani4);
    }
    @Given("ve tuglayi gelistirir")
    public void ve_tuglayi_gelistirir() {
        hammadelerPage.buSeviyeyiGelistir.click();
    }
    @Given("kullanici demiri gelistirmek icin alan secer")
    public void kullanici_demiri_gelistirmek_icin_alan_secer() {
        myMethods.hammaddeGelistir(hammadelerPage.demirAlani1,hammadelerPage.demirAlani2, hammadelerPage.demirAlani3, hammadelerPage.demirAlani4);
    }
    @Given("ve demiri gelistirir")
    public void ve_demiri_gelistirir() {
        hammadelerPage.buSeviyeyiGelistir.click();
    }

    @Given("kullanici tahil gelistirmek icin alan secer")
    public void kullanici_tahil_gelistirmek_icin_alan_secer() {
        myMethods.tahilGelistir(hammadelerPage.tahilAlani1, hammadelerPage.tahilAlani2, hammadelerPage.tahilAlani3,
                                hammadelerPage.tahilAlani4, hammadelerPage.tahilAlani5, hammadelerPage.tahilAlani6);
    }
    @Given("ve tahil gelistirir")
    public void ve_tahil_gelistirir() {
        hammadelerPage.buSeviyeyiGelistir.click();
    }



}
