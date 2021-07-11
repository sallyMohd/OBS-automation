package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class googleResultsPage extends PageBase{

	public googleResultsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a")
	WebElement obswebsite ;

    public void openOBSwebsite() {
	
	obswebsite.click();
	
}
}