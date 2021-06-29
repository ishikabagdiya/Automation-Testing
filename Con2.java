
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Con2 {
	@FindBy(how = How.NAME, using ="contact[emp_hm_telephone]")
	WebElement hm;
	@FindBy(how = How.ID, using ="contact_emp_mobile")
	WebElement phone;
	@FindBy(how = How.NAME, using ="contact[emp_work_telephone]")
	WebElement tph;
	@FindBy(how = How.NAME, using ="contact[emp_work_email]")
	WebElement em;
	@FindBy(how = How.NAME, using ="contact[emp_oth_email]")
	WebElement oem;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement sv;
	
		public void con2button(String pp,String n,String hh,String kk,String jj) throws InterruptedException{
	 hm.sendKeys(pp);
	   phone.sendKeys(n);
	   tph.sendKeys(hh);
	   em.sendKeys(kk);
	   oem.sendKeys(jj);
	   sv.click();
}
}

