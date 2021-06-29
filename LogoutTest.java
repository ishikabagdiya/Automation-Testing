package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class LogoutTest extends BrowserFactory {
	@Test
	 public static void Logout() throws InterruptedException {
		 Pages.Logout ek = PageFactory.initElements(driver,Pages.Logout.class);
		   	ek.lbutton();
		   	

	} 

}
