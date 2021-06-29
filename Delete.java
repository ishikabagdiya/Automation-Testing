package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Delete {
	@FindBy(how = How.NAME, using ="chkecontactdel[]")
	WebElement ckh;
	@FindBy(how = How.ID, using ="delContactsBtn")
	WebElement del;
	@FindBy(how = How.LINK_TEXT, using ="Dependents")
	WebElement dt;
	@FindBy(how = How.ID, using ="btnAddDependent")
	WebElement adde;
	@FindBy(how = How.NAME, using ="dependent[name]")
	WebElement pn;
	@FindBy(how = How.NAME, using ="dependent[relationshipType]")
	WebElement rltype;
	@FindBy(how = How.ID, using ="btnSaveDependent")
	WebElement nt;
	
	
public void dbutton(String kk) throws InterruptedException{
ckh.click();
del.click();
Thread.sleep(5000);
dt.click();
Thread.sleep(3000);
adde.click();
pn.sendKeys(kk);
Select Relationship  =new Select(rltype);
	Relationship.selectByVisibleText("Child");
nt.click();



}
}
