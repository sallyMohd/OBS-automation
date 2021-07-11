package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.cloudPage;
import pages.googleResultsPage;
import pages.googleSearchPage;
import pages.managedApp;
import pages.orangeMainPage;

public class UserSearch extends testBase {
	googleSearchPage goobject;
	googleResultsPage reobject;
	orangeMainPage mainobject;
	cloudPage cloudobject;
	managedApp mngobject;
	
	@Test
	public void userSearchForOBS() throws InterruptedException 
	{
		
		goobject = new googleSearchPage(driver);
		goobject.userSearchGoogle();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		reobject = new googleResultsPage(driver);
		reobject.openOBSwebsite();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		mainobject = new orangeMainPage(driver);
		mainobject.userClicksSolutions();
		mainobject.userClicksCloud();
		
		cloudobject = new cloudPage(driver);
		cloudobject.userClicksMngApp();
		
		mngobject = new managedApp(driver);
		mngobject.confirmUserOpenMngapp();


}
}