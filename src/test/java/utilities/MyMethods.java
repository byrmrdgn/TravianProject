package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Page;

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
}
