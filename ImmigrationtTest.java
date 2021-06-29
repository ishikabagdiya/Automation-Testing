package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;
import Pages.Login;


public class ImmigrationtTest extends BrowserFactory {
	@Test
	 public static void  Immigration() throws InterruptedException {
		 Pages.Immigration pq = PageFactory.initElements(driver,Pages.Immigration.class);
		   	pq.immibutton("45555677","good","This is what the automation testing looks like");
		   	}
	}
