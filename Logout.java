package Pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Logout {
	private static final String driver = null;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using ="Welcome")
	WebElement wlc;
	@FindBy(how = How.LINK_TEXT, using ="Logout")
	WebElement lg;
	 
	
	
	public void lbutton()throws InterruptedException{
		wlc.click();
		lg.click();
		  
		
	}

}
