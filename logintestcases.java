package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;
import Pages.Login;

public class logintestcases extends BrowserFactory {
     @Test
     public static void login() 
     {
    	 Login lp= PageFactory.initElements(driver,Login.class);
    	 lp.loginbutton("Admin","admin123");
     }
}
     


