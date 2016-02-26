package week_3;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_Robot {	
		@Test
		public void setup() throws Exception {

			  WebDriver driver = new FirefoxDriver();		               
			  // driver.manage().window().maximize();		 
			  driver.get("http://www.facebook.com");		 		  
			  
			  Robot r = new Robot();
			  
			  driver.findElement(By.id("email")).sendKeys("nhuydt90@gmail.com");		 
			  driver.findElement(By.id("pass")).sendKeys("123123");		 
			  
			  Thread.sleep(1000);		  
			  // Press Enter
			  r.keyPress(KeyEvent.VK_ENTER);
			  
			  driver.close();	
	}
}
