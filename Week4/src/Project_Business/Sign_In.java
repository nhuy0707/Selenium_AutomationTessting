package Project_Business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sign_In {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://business.toancauxanh.vn:7664/");
		
		driver.findElement(By.cssSelector("[ng-click='header.showSignIn()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[ng-model='auth.email']")).sendKeys("email@gmail.com");
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
