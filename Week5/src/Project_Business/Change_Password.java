package Project_Business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Change_Password {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.cssSelector("[ng-model='auth.email']")).sendKeys("email1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123123");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("icons-circle-down")).click();
		driver.findElement(By.cssSelector("[ui-sref='account.privacy']")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://business.toancauxanh.vn:7664/account/recovery");
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputCurrentPassword")).sendKeys("123123");
		driver.findElement(By.id("inputNewPassword")).sendKeys("123456");
		driver.findElement(By.id("inputConfirm")).sendKeys("123456");
		driver.findElement(By.cssSelector("[ladda='account.passwordLoading']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		driver.findElement(By.cssSelector("[ng-model='auth.email']")).sendKeys("email1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://business.toancauxanh.vn:7664/dashboard")){
		System.out.println("Sign in successful!!!");
		}
		else{
			System.out.println("Sgin in failed :( ");
		}
		
	driver.close();
		
	}

}
