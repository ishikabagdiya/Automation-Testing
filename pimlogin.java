package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class pimlogin   {
	@FindBy(how = How.ID, using ="menu_pim_viewPimModule")
	WebElement pim;
	@FindBy(how = How.ID, using ="menu_pim_addEmployee")
	WebElement add;
	@FindBy(how = How.ID, using ="firstName")
	WebElement first;
	@FindBy(how = How.ID, using ="lastName")
	WebElement last;
	@FindBy(how = How.ID, using ="employeeId")
	WebElement employid;
	@FindBy(how = How.ID, using ="chkLogin")
	WebElement check;
	@FindBy(how = How.ID, using ="user_name")
	WebElement user;
	@FindBy(how = How.ID, using ="user_password")
	WebElement pass;
	@FindBy(how = How.ID, using ="re_password")
	WebElement repass;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement save;
	
	
	public void Pimloginbutton(String c,String d,String e,String f,String g,String h) throws InterruptedException
	{
		pim.click();
		add.click();
		first.clear();
		first.sendKeys(c);
		last.clear();
		last.sendKeys(d);
		Thread.sleep(3000);
		employid.clear();
		employid.sendKeys(e);
		check.click();
		user.sendKeys(f);
		pass.sendKeys(g);
		repass.sendKeys(h);
		save.click();
		
		
		}
}

