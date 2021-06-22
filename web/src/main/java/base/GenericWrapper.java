package base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login;

public class GenericWrapper {

	public static RemoteWebDriver driver;
	public static String excelFileName;
	public static String sheetName;
	
	public void setDrive() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");

		driver=new ChromeDriver(opt); 

	}
	public void snapShot(String fileName) throws Throwable {
		System.out.println(fileName);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./snap/"+fileName+".png");
		try {
			Thread.sleep(5000);
			FileUtils.copyFile(src, target);
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		
	}
	
	public Login logout() {
		 
		driver.findElementByLinkText("Logout").click();
		return new Login(driver);

	}
}
