package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class Community extends ProjectSpecificMethods {

	public Community(RemoteWebDriver driver) {
	 this.driver=driver;
	}
	public Community communitySnap() throws Throwable {
		snapShot("Community");
		return this;
	}
	
	public User user() throws Throwable {
		driver.findElementByLinkText("User").click();
		Thread.sleep(3000);
	 return new User(driver);

	}
	
	
}
