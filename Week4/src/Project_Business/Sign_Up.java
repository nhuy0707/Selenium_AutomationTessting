package Project_Business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sign_Up {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		//driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[ng-click='header.showSelectAccount()']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".ficon.ficons-investor")).click();
		driver.findElement(By.cssSelector(".bt-default-bl")).click();
		driver.findElement(By.cssSelector("[ng-model='reg.email']")).sendKeys("email3@gmail.com");
		driver.findElement(By.cssSelector("[ng-model='reg.password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("[ng-model='reg.repassword']")).sendKeys("123456");
		driver.findElement(By.id("check4")).click();
		driver.findElement(By.className("login-button")).click();
		
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://business.toancauxanh.vn:7664/edit-profile/profile")){
			System.out.println("Sign up successful!!!");
		}
		else{
			System.out.println("Sgin up failed :( ");
		}
		
		driver.close();

	}

}
