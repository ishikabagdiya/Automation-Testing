package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class EmerTest extends BrowserFactory {
	@Test
	 public static void Emergency() throws InterruptedException {
		 Pages.Emergency tt = PageFactory.initElements(driver,Pages.Emergency.class);
		   	tt.Emerbutton("Divya","Sister","8995644221","787654231","787644331");
}
}