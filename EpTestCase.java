package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;
import Pages.Login;

public class EpTestCase extends BrowserFactory  {
	@Test
	 public static void  Employ() throws InterruptedException {
		 Pages.Employ ty= PageFactory.initElements(driver,Pages.Employ.class);
		   	ty.Employbutton("16755","777564321","4543","8987","Nope","Sweety");
			   	 }

	}


