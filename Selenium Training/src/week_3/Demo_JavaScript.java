package week_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo_JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1024,768");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);

		driver.get("http://google.com/");
		
		// Uses WebDriver to load “google.com”, and executes a simple alert() later.

		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("alert('hello world');");
		}
		
		Thread.sleep(2000);
		driver.close();
	}
}
