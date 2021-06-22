package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class Home extends ProjectSpecificMethods{
	
	public Home(RemoteWebDriver driver) {
		 this.driver=driver;

	}

	public Dashboard dashboard() throws Throwable {
		 driver.findElementByLinkText("Dashboard").click();
		 Thread.sleep(3000);
		 return new Dashboard(driver);
	}
}
