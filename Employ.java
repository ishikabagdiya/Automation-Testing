package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Employ {
	@FindBy(how = How.ID, using ="btnSave")
	WebElement tn;
	
	@FindBy(how = How.ID, using ="personal_txtOtherID")
	WebElement oth;
	@FindBy(how = How.ID, using ="personal_txtLicenNo")
	WebElement licen ;
	@FindBy(how = How.ID, using ="personal_txtNICNo")
	WebElement icno;
	@FindBy(how = How.ID, using ="personal_txtSINNo")
	WebElement scno ;
	@FindBy(how = How.ID, using ="personal_txtMilitarySer")
	WebElement mili ;
	@FindBy(how = How.ID, using ="personal_optGender_2")
	WebElement gender;
	@FindBy(how = How.NAME, using ="personal[cmbMarital]")
	WebElement status;
	@FindBy(how = How.NAME, using ="personal[cmbNation]")
	WebElement nation;
	
	@FindBy(how = How.ID, using ="personal_txtEmpNickName")
	WebElement nick;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement ns;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement ss;
	@FindBy(how = How.ID, using ="btnEditCustom")
	WebElement edi;
	@FindBy(how = How.NAME, using ="custom1")
	WebElement blood;
	@FindBy(how = How.ID, using ="btnEditCustom")
	WebElement it;
	
	
	
	public void Employbutton(String t,String u,String v,String tt,String pv,String cp)throws InterruptedException{
		Thread.sleep(3000);
		tn.click();
		gender.click();
		 Select Maritalstatus =new Select(status);
	       Maritalstatus.selectByVisibleText("Single");
		Thread.sleep(3000);
		 Select Nationality = new Select(nation);
	       Nationality.selectByVisibleText("Indian");
	       Thread.sleep(3000);
		oth.sendKeys(t);
		Thread.sleep(3000);
		Thread.sleep(3000);
		licen.sendKeys(u);
		Thread.sleep(3000);
		icno.sendKeys(v);
		Thread.sleep(3000);
		scno.sendKeys(tt);
		Thread.sleep(3000);
		mili.sendKeys(pv);
		Thread.sleep(3000);
		nick.sendKeys(cp);
	       Thread.sleep(3000);
	       ns.click();
	       Thread.sleep(3000);
	       ss.click();
	       edi.click();
	       Select BloodType= new Select(blood);
	       BloodType.selectByVisibleText("O+");
	       it.click();
	       
	    }
}