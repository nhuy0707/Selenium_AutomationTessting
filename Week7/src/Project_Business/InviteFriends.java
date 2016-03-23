package Project_Business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InviteFriends {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[ng-model='auth.email']")).sendKeys("email1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.className("login-button")).click();
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//button[contains(.,'Invite Friends')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[ng-model='dashboard.vm_email']")).sendKeys("email@gmail.com");
		driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
		Thread.sleep(1000);
			
		String strMess = driver.findElement(By.xpath("//p[contains(@class,'error-msg')]")).getText();	
		if(strMess.contains("Email is invalid")){
			System.out.println("Test Failed");
		}
		else{
			driver.findElement(By.xpath("//button[contains(.,'Send invite')]")).click();
			Thread.sleep(3000);
				
			String strMess1 = driver.findElement(By.className("toast-message")).getText();
			if(strMess1.contains("Successful")){
				System.out.println("Test Passed!!!");
			}
			else{
				System.out.println("Test Failed :(");
			}
					
		}
		Thread.sleep(3000);	
		driver.close();             
	}

}
