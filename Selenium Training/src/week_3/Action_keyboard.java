package week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_keyboard {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
		
		System.out.println("Launching Browser");
		
		driver.get("http://business.toancauxanh.vn:7664/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[ui-sref='search']")).click();
		WebElement element = driver.findElement(By.cssSelector("[ng-model='search.filter.filter']"));
		
		//Creating action class object
		      Actions action = new Actions(driver);
		      
		      //Creating action collection to perform numerous methods on element
		      Actions moreActions = action
		           .moveToElement(element)
		           .click()
		           .keyDown(element,Keys.SHIFT) //for Caps Lock
		           .sendKeys(element,"selenium");
		        
		      Action enterInCaps= moreActions.build();
		      enterInCaps.perform();
		      System.out.println("Text is entered in Captial letters"); 
		  
		driver.close();
	}

}
