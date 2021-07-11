package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orangeMainPage extends PageBase {

	public orangeMainPage(WebDriver driver) {
		super(driver);
		// 
	}
	@FindBy(xpath ="/html/body/div[3]/header/div/nav/div/div[3]/div[1]/nav/ul/li[1]/a")
	WebElement solutions ;
	
	

	@FindBy(xpath ="/html/body/div[3]/header/div/nav/div/div[3]/div[1]/nav/ul/li[1]/ul/li/div")
	WebElement menuitems ;
	
	

	public void userClicksSolutions() throws InterruptedException {
	  
		solutions.click();
	    Thread.sleep(2000);
	    List<WebElement> list = menuitems.findElements(By.xpath("/html/body/div[3]/header/div/nav/div/div[3]/div[1]/nav/ul/li[1]/ul/li/div"));
	  
	    for(int i=0; i<list.size(); i++)
		{
	    	System.out.println(list.get(i).getText());
	    	
	    
	    	list.get(i).findElement(By.xpath( "/html/body/div[3]/header/div/nav/div/div[3]/div[1]/nav/ul/li[1]/ul/li/div/div[3]/ul/li/a")).click();
			}
		}
	public void userClicksCloud() throws InterruptedException {
		  
		solutions.click();
	    Thread.sleep(2000);
	    List<WebElement> list = menuitems.findElements(By.xpath("/html/body/div[3]/header/div/nav/div/div[3]/div[1]/nav/ul/li[1]/ul/li/div"));
	  
	    for(int i=0; i<list.size(); i++)
		{
	    list.get(i).findElement(By.xpath( "/html/body/div[3]/header/div/nav/div/div[3]/div[1]/nav/ul/li[1]/ul/li/div/div[1]/ul/li[1]/a")).click();
			}
		}
	}

