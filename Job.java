package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Job {
	@FindBy(how = How.LINK_TEXT, using ="Job")
	WebElement jb;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement sv;
	
	@FindBy(how = How.ID, using ="job_job_title")
	WebElement tit ;
	@FindBy(how = How.ID, using ="job_emp_status")
	WebElement tat ;
	
	@FindBy(how = How.ID, using ="job_eeo_category")
	WebElement cat;
	
	@FindBy(how = How.ID, using ="job_sub_unit")
	WebElement sub ;
	@FindBy(how = How.ID, using ="job_location")
	WebElement loc ;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement stv;
	
	public void jobbutton()throws InterruptedException{
	jb.click();
	Thread.sleep(3000);
sv.click();
Thread.sleep(3000);

Select JobTitle =new Select(tit);
JobTitle .selectByVisibleText("Software Engineer");

Select EmploymentStatus =new Select(tat);
EmploymentStatus.selectByVisibleText("Full-Time Permanent");

Select JobCategory =new Select(cat);
JobCategory .selectByVisibleText("Officials and Managers");

Select SubUnit =new Select(sub);
SubUnit .selectByVisibleText("Engineering");

Select Location = new Select(loc);
Location .selectByVisibleText("New York Sales Office");

stv.click();
}
}