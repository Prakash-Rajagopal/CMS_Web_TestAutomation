package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods extends GenericWrapper {
	
	
	
	@BeforeMethod
	public void launchURL() {
		//WebDriverManager.chromedriver().setup();
	//	driver=new ChromeDriver();
		setDrive();
		driver.manage().window().maximize();
		driver.get("https://cm-app-admin.web.app");

	}
	
//	@AfterMethod
	public void postcondition() {
		driver.close();

	}
	
	@DataProvider(name="fetchdata")
	public String[][] dataSource() throws Throwable {
		return utils.DynamicDataHandling.returnData(excelFileName,sheetName);

	}
}
