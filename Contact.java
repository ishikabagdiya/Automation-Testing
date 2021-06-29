package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Contact {
	@FindBy(how = How.LINK_TEXT, using ="Contact Details")
	WebElement contact;
	@FindBy(how = How.ID, using ="btnSave")
	WebElement edit;
	@FindBy(how = How.ID, using ="contact_street1")
	WebElement str;
	@FindBy(how = How.ID, using ="contact_street2")
	WebElement st;
	@FindBy(how = How.ID, using ="contact_city")
	WebElement city;
	@FindBy(how = How.ID, using ="contact_province")
	WebElement province;
	@FindBy(how = How.ID, using ="contact_emp_zipcode")
	WebElement code;
	@FindBy(how = How.ID, using ="contact_country")
	WebElement con;
	

public void contactbutton(String i,String j,String k,String l,String m) throws InterruptedException
{

contact.click();
edit.click();
str.sendKeys(i);
  st.sendKeys(j);
  city.sendKeys(k);
  province.sendKeys(l);
  code.sendKeys(m);
  Select Country = new Select(con);
  Country.selectByVisibleText("India");
 
}
}