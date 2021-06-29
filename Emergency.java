package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Emergency {
	@FindBy(how = How.LINK_TEXT, using ="Emergency Contacts")
	WebElement emer;
	@FindBy(how = How.ID, using ="btnAddContact")
	WebElement btd;
	@FindBy(how = How.ID, using ="emgcontacts_name")
	WebElement emg;
	@FindBy(how = How.ID, using ="emgcontacts_relationship")
	WebElement real;
	@FindBy(how = How.ID, using ="emgcontacts_mobilePhone")
	WebElement mobile;
	@FindBy(how = How.NAME, using ="emgcontacts[homePhone]")
	WebElement mep;
	@FindBy(how = How.NAME, using ="emgcontacts[workPhone]")
	WebElement wkp;
	@FindBy(how = How.ID, using ="btnSaveEContact")
	WebElement ct;
	
	
	
	

public void Emerbutton(String o,String p,String q,String bb,String ll)throws InterruptedException{
	
	emer.click();
	btd.click();
	Thread.sleep(3000);
	emg.sendKeys(o);
	real.sendKeys(p);
	mobile.sendKeys(q);
	mep.sendKeys(bb);
	wkp.sendKeys(ll);
	ct.click();

	
}	
}