package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cloudPage extends PageBase {

	public cloudPage(WebDriver driver) {
		super(driver);
		
		
	}
	@FindBy(xpath ="/html/body/div[3]/div[2]/section/div/article/div/div/div[4]/div[2]/div[1]/div/div[3]/div/div/p[1]/a")
	WebElement managedApplications ;
	
	public void userClicksMngApp() throws InterruptedException {
		  
		managedApplications.click();
	    Thread.sleep(3000);
	}
	   
	    
	    
}

