package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Login {
        
	@FindBy(how = How.ID, using = "txtUsername")
	WebElement username;
	@FindBy(how = How.ID, using = "txtPassword")
	WebElement pwd;
	@FindBy(how = How.ID, using ="btnLogin")
	WebElement login;
	
	public void loginbutton(String a,String b)
	{
		username.sendKeys(a);
		pwd.sendKeys(b);
		login.click();
	}
}