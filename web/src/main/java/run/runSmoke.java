package run;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.Login;

public class runSmoke extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setFileName() {
		excelFileName="CMS_Web_Smoke_TestData";
		sheetName="TestData";
	}
	
	
	@Test(dataProvider="fetchdata")
	public void runSmokeTest(String emailid,String Password) throws Throwable {
		 Login Log = new Login(driver);
		 Log.email(emailid)
		 .password(Password)
		 .clickLogin(driver)
		 .dashboard()
		 .dashBoardSnap()
		 .requests()
		 .requestSnap()
		 .community()
		 .communitySnap()
		 .user()
		 .userSnap()
		 .logout();
		 
		 
		 
		
	}
}
