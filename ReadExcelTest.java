package Pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelTest extends BrowserFactory {

	public static final String INPUT_DATA_TITLE = "C:\\Users\\ishik\\Desktop\\project.xlsx";
	
	@Test(dataProvider = "ref")
	public static void login(String un, String pwd)
	{
	Login lp = PageFactory.initElements(driver,Login.class);
	lp.loginbutton(un, pwd);
	}


@DataProvider()
public static String[][] ref() {
	ReadExcel re = new ReadExcel(INPUT_DATA_TITLE);
	int rows = 1;
	int cols = re.getColCount(0);
	String[][] data = new String[rows][cols];
	for (int i = 0; i < re.getRowCount(0); i++) {

		for (int j = 0; j < cols; j++) {
			data[0][j] = re.getData(0, i, j);
		}
	}
	return data;
}
}
