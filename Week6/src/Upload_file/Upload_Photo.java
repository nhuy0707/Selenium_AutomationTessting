package Upload_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload_Photo {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
		
		driver.get("http://share.pho.to/");
		Thread.sleep(1000);

		WebElement UploadImg = driver.findElement(By.xpath("//input[contains(@name,'images[src]')]"));
		UploadImg.sendKeys("D:\\Job_NY\\Project1\\Business Matching\\Image\\Lnd_chekcard.gif");
		Thread.sleep(10000);		
		
		driver.close();

	}
}
