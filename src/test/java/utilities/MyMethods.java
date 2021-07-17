package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.Page;

public class MyMethods {

    Actions actions=new Actions(Driver.getDriver());
    Page page=new Page();
    SoftAssert softAssert=new SoftAssert();
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
        System.out.println(url);
        System.out.println(string);
    }

    public void elementeGit(WebElement element){
        actions.moveToElement(element).perform();
    }
}
