package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods {

	public Login(RemoteWebDriver driver) {
	 this.driver=driver;
	 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	public Login email(String uname) {
		 driver.findElementByXPath("//input[@name='email']").sendKeys(uname);
		return this;
	}
	
	public Login password(String pwd) {
		driver.findElementByXPath("//input[@name='password']").sendKeys(pwd);
		
		return this;

	}
	
	public void handleAlert() throws Throwable {
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
	}
	public Home clickLogin(RemoteWebDriver driver) throws Throwable {
		driver.findElementByXPath("//button").click();
		Thread.sleep(3000);
		handleAlert();
		Thread.sleep(3000);
		return new Home(driver);

	}
}
