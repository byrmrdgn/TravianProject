package utilities;

import pages.Page;

public class MyMethods {

    public void acceptAll(){
        Page page=new Page();
        try {
            if (page.acceptAll.isDisplayed()){
                page.acceptAll.click();
                System.out.println("if calisti");
            }
        }catch (Exception e){
            System.out.println("Catch calisti");
        }
    }
}
