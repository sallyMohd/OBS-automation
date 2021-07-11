package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class managedApp extends PageBase{

	public managedApp(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="//*[@id=\"block-theme-boosted-page-title\"]/h1/span")
	WebElement managedlink ;

    public void confirmUserOpenMngapp() {
    	System.out.println(managedlink.getText());
    	String actual = managedlink.getText();
    	assertEquals(actual, "Managed Applications: improve operational capability in the cloud");
    }
}
