package TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class DeleteTest  extends BrowserFactory {
	private static final WebElement rltype = null;

	@Test
	 public static void Delete() throws InterruptedException {
		 Pages.Delete fd = PageFactory.initElements(driver,Pages.Delete.class);
		   	fd.dbutton("Ashwin");
		   	
	}


}


