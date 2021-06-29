package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class AddnoTest extends BrowserFactory  { 
	@Test
	 public static void AddNo() throws InterruptedException {
		 Pages.AddNo ss = PageFactory.initElements(driver,Pages.AddNo.class);
		   	ss.Addbutton("Ishika","Friend","778832231","904321314","942312132");
			   	 }


}
