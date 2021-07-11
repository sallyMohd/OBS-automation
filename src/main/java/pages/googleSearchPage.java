package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class googleSearchPage extends PageBase {

	public googleSearchPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	WebElement search ;
	
	@FindBy(xpath ="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]")
	WebElement searchbtn ;



public void userSearchGoogle() {
	search.sendKeys("Orange Business services");
	searchbtn.click();
	
}
}