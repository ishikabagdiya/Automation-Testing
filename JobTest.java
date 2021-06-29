package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class JobTest extends BrowserFactory  {
	@Test
	 public static void Job() throws InterruptedException {
		 Pages.Job kh= PageFactory.initElements(driver,Pages.Job.class);
		   	kh.jobbutton();
			   	 }
}


