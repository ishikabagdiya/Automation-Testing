package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.BrowserFactory;

public class SalaryTest  extends BrowserFactory {
	@Test
	 public static void  Salary() throws InterruptedException {
		 Pages.Salary df = PageFactory.initElements(driver,Pages.Salary.class);
		   	df.Sbutton("51000","55000","All the information of salaries are added","789012452345121","12345","2500");
		   	
	
 

}
}