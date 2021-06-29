package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Tax {
	@FindBy(how = How.LINK_TEXT, using ="Tax Exemptions")
	WebElement tx;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement ns;
	@FindBy(how = How.NAME, using ="tax[federalStatus]")
	WebElement tfs;
	@FindBy(how = How.ID, using ="tax_federalExemptions")
	WebElement tfe;
	@FindBy(how = How.NAME, using ="tax_state")
	WebElement tss;
	@FindBy(how = How.NAME, using ="tax[stateStatus]")
	WebElement stat;
	@FindBy(how = How.ID, using ="tax_stateExemptions")
	WebElement tst;
	@FindBy(how = How.NAME, using ="tax[workState]")
	WebElement wst;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement ts;
	
	
	
	
		
	public void tbutton(String jm, String jh,String je,String jw)throws InterruptedException{
		tx.click();
		ns.click();
		Select Status = new Select(tfs);
		Status.selectByVisibleText("Single");
		tfe.sendKeys(jm);
		Select State  = new Select(tss);
		State.selectByVisibleText("Indiana");
		tst.sendKeys(jh);
		Select Status1  = new Select(stat);
		Status1.selectByVisibleText("Single");
		
		Select UnemploymentState = new Select(ts);
		UnemploymentState.selectByVisibleText("Indiana");
		
		Select WorkState = new Select(wst);
		WorkState.selectByVisibleText("Indiana");
		
		ts.click();
		}

}

