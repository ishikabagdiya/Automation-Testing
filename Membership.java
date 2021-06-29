package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Membership {
	@FindBy(how = How.LINK_TEXT, using ="Memberships")
	WebElement ql;
	@FindBy(how = How.ID, using ="btnAddMembershipDetail")
	WebElement klp ;
	@FindBy(how = How.ID, using ="membership_membership")
	WebElement rew;
	@FindBy(how = How.NAME, using ="membership[subscriptionPaidBy]")
	WebElement paid;
	@FindBy(how = How.NAME, using ="membership[subscriptionAmount]")
	WebElement bhi;
	@FindBy(how = How.NAME, using ="membership[currency]")
	WebElement mcc;
	@FindBy(how = How.ID,using ="btnSaveMembership")
	WebElement st;
	
	
	
	public void mbutton(String t)throws InterruptedException{
		ql.click();
		klp.click();
		Select Membership = new Select(rew);
		Membership.selectByVisibleText("Chartered Institute of Marketing (CIM)");
		Thread.sleep(3000);
		Select SubscriptionPaidBy = new Select(paid);
		SubscriptionPaidBy.selectByVisibleText("Company");
		Thread.sleep(3000);
		bhi.sendKeys(t);
		Select Currency = new Select(mcc);
		Currency.selectByVisibleText("Indian Rupee");
		st.click();
		}
}
