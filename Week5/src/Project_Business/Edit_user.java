package Project_Business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edit_user {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.cssSelector("[ng-model='auth.email']")).sendKeys("email@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("icons-circle-down")).click();
		driver.findElement(By.className("txt-lk")).click();
		Thread.sleep(3000);
		
		//Edit user
		driver.findElement(By.id("inputFirstName")).clear();
		driver.findElement(By.id("inputFirstName")).sendKeys("Vo Thi");
		driver.findElement(By.id("inputLastName")).clear();
		driver.findElement(By.id("inputLastName")).sendKeys("Nhu Y");
		
		driver.findElement(By.cssSelector("[ng-disabled='editInvestorProfile.continue_loading']")).click();
		Thread.sleep(2000);
		
		String strUser = driver.findElement(By.cssSelector("[ng-if='userInfo.firstname && userInfo.lastname']")).getText();	
		
		if(strUser.contains("Vo Thi Nhu Y")){
			System.out.println("Test Passed !!!");
		}
		else{
			System.out.println("Test Failed :(");
		}
		
		driver.close();                 

	}

}
