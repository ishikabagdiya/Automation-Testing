package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.BrowserFactory;

public class ContactTest extends BrowserFactory {
	@Test
	 public static void Contact() throws InterruptedException {
		 Pages.Contact pq = PageFactory.initElements(driver,Pages.Contact.class);
		   	pq.contactbutton("Shaniwarwada","Swargate","Pune","Maharashtra","411042");
		   	}
}
