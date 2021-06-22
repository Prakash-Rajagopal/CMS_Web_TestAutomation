package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class User extends ProjectSpecificMethods {

	public User(RemoteWebDriver driver) {
	 this.driver=driver;
	}
	
	public User userSnap() throws Throwable {
		snapShot("User");
		return this;
	}
	
	public void clickLogout() throws Throwable{
		Thread.sleep(3000);
		logout();

	}

}
