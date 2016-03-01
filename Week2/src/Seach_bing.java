import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Seach_bing {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer32.exe");
		WebDriver driver = new InternetExplorerDriver();
				
		driver.get("http://www.bing.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");		
				
		driver.findElement(By.name("go")).click();
				
		Thread.sleep(3000);
		
		driver.close();	
	}
}
