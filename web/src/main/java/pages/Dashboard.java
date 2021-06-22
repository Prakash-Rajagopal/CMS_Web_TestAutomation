package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class Dashboard extends ProjectSpecificMethods {
	
	public Dashboard(RemoteWebDriver driver) {
	 this.driver=driver;
	}
	
	public Dashboard dashBoardSnap() throws Throwable {
		snapShot("Dashboard");
		return this;
	}
	
	public Requests requests() throws Throwable {
		driver.findElementByLinkText("Requests").click();	
		Thread.sleep(3000);
		 return new Requests(driver);

	}
	
	
}
