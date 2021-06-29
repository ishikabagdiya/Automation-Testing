package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNo  {
	@FindBy(how = How.ID, using ="btnAddContact")
	WebElement mn;
	
	@FindBy(how = How.NAME, using ="emgcontacts[name]")
	WebElement kl;
	@FindBy(how = How.NAME, using ="emgcontacts[relationship]")
	WebElement pl;
	@FindBy(how = How.NAME, using ="emgcontacts[homePhone]")
	WebElement jk;
	@FindBy(how = How.NAME, using ="emgcontacts[mobilePhone]")
	WebElement qw;
	@FindBy(how = How.NAME, using ="emgcontacts[workPhone]")
	WebElement kw;
	
	@FindBy(how = How.ID, using ="btnSaveEContact")
	WebElement save;
	

	public void Addbutton(String aa,String bb,String cc,String dd,String ss)throws InterruptedException{
mn.click();
Thread.sleep(3000);
kl.sendKeys(aa);
pl.sendKeys(bb);
jk.sendKeys(cc);
qw.sendKeys(dd);
kw.sendKeys(ss);
save.click();
}
}