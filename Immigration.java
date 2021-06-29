package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Immigration {
	@FindBy(how = How.LINK_TEXT, using ="Immigration")
	WebElement im;
	@FindBy(how = How.ID, using ="btnAdd")
	WebElement add;
	@FindBy(how = How.NAME, using ="immigration[type_flag]")
	WebElement flg;
	@FindBy(how = How.NAME, using ="immigration[number]")
	WebElement num;
	@FindBy(how = How.NAME, using ="immigration[i9_status]")
	WebElement ii;
	@FindBy(how = How.NAME, using ="immigration[country]")
	WebElement se;
	@FindBy(how = How.NAME, using ="immigration[comments]")
	WebElement comm;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement svv;

	public void immibutton(String nn, String mm,String ff)throws InterruptedException{
		im.click();
		add.click();
		Thread.sleep(3000);
		flg.click();
		num.sendKeys(nn);
		ii.sendKeys(mm);
Select country = new Select(se);
country.selectByVisibleText("India");
comm.sendKeys(ff);
svv.click();

}
}