package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class Requests extends ProjectSpecificMethods {

	public Requests(RemoteWebDriver driver) {
	 this.driver=driver;
	}
	
	public Requests requestSnap() throws Throwable {
		snapShot("Request");
		return this;
	}
	
	public Community community() throws Throwable {
		driver.findElementByLinkText("Community").click();
		Thread.sleep(3000);
		return new Community(driver);

	}
}
