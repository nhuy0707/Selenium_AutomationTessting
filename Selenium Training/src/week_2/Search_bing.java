package week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Search_bing {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer32.exe");
	    WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.bing.com/");
		//driver.findElement(By.className("b_searchbox")).sendKeys("selenium");		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		//driver.findElement(By.id("sb_form_go")).click();
		//driver.findElement(By.cssSelector("#sb_form_go")).click();
		driver.findElement(By.name("go")).click();
		
		Thread.sleep(3000);
		driver.close();				  			
		
}

}

