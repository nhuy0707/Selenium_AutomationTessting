package Upload_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_file {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://workupload.com/");
		Thread.sleep(1000);
		
		WebElement UploadImg = driver.findElement(By.name("userFile[]"));
		UploadImg.sendKeys("D:\\Job_NY\\Jmeter-Load testing\\Loadtest_Template.doc");
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}
