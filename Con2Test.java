package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Pages.BrowserFactory;

	public class Con2Test extends BrowserFactory {
		@Test
		 public static void Con2() throws InterruptedException {
			 Pages.Con2 eg = PageFactory.initElements(driver,Pages.Con2.class);
			   	eg.con2button("02455431","8995534221","221221","officework32890@gmail.com","vanshika34231@gmail.com");
			   	
	
		}
	

}



