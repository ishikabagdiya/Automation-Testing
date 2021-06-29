package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Salary {
	@FindBy(how = How.LINK_TEXT, using ="Salary")
	WebElement sy;
	@FindBy(how = How.ID, using ="addSalary")
	WebElement ads;
	
	@FindBy(how = How.ID, using ="salary_sal_grd_code")
	WebElement syg ;
	@FindBy(how = How.ID, using ="salary_salary_component")
	WebElement syc;
	
	@FindBy(how = How.ID, using ="salary_payperiod_code")
	WebElement pay;
	
	@FindBy(how = How.ID, using ="salary_currency_id")
	WebElement cur;
	@FindBy(how = How.ID, using ="salary_basic_salary")
	WebElement bas;
	@FindBy(how = How.ID, using ="salary_comments")
	WebElement scom ;
	@FindBy(how = How.NAME, using ="salary[set_direct_debit]")
	WebElement debit ;
	@FindBy(how = How.NAME, using ="directdeposit[account]")
	WebElement acc ;
	@FindBy(how = How.ID, using ="directdeposit_account_type")
	WebElement typ  ;
	@FindBy(how = How.NAME, using ="directdeposit[routing_num]")
	WebElement rou  ;
	@FindBy(how = How.ID, using ="directdeposit_amount")
	WebElement amoun ;
	@FindBy(how = How.ID, using ="btnSalarySave")
	WebElement st;

	public void Sbutton(String oo, String vv,String lo,String qo,String aw,String ew)throws InterruptedException{
		
		sy.click();
      Thread.sleep(3000);
		ads.click();
		Select PayGrade = new Select(syg);
		PayGrade.selectByVisibleText("Grade 1");
		syc.sendKeys(oo);
		 Thread.sleep(3000);
		Select PayFrequency = new Select(pay);
		PayFrequency.selectByVisibleText("Monthly on first pay of month.");
		 Thread.sleep(3000);
		Select Currency  = new Select(cur);
		Currency.selectByVisibleText("United States Dollar");
		Thread.sleep(3000);
		bas.sendKeys(vv);
		scom.sendKeys(lo);
		debit.click();
		acc.sendKeys(qo);
		Select AccountType  = new Select(typ);
		AccountType.selectByVisibleText("Savings");
		Thread.sleep(3000);
		rou.sendKeys(aw);
		amoun.sendKeys(ew);
		st.click();
		}
	}
