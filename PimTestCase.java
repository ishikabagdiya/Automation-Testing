package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class PimTestCase extends BrowserFactory {
    @Test
    public static void pimlogin() throws InterruptedException 
    {
    	 Pages.pimlogin  tp = PageFactory.initElements(driver,Pages.pimlogin.class);
   	tp.Pimloginbutton("Vanshikaa","Vermaa","894531","Vanshikaa","Ishu1@@2804","Ishu1@@2804");
    }
}
    



