package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class MembershipTest extends BrowserFactory  {
	@Test
	 public static void  Membership() throws InterruptedException {
		 
		Pages.Membership ks = PageFactory.initElements(driver,Pages.Membership.class);
		   	ks.mbutton("40000");
		   	

	} 

}
