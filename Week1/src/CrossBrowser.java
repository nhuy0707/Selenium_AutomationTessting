import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CrossBrowser {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
				
				//Mở trang web bằng trình duyệt Firefox
				//WebDriver driver = new FirefoxDriver();
				
				//Mở trang web bằng trình duyệt Chrome
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Mở trang web bằng trình duyệt IE  
				//System.setProperty("webdriver.ie.driver","D:\\IEDriverServer32.exe");
			    //WebDriver driver = new InternetExplorerDriver();
			    
				driver.get("http://workupload.com/");
				Thread.sleep(1000);
				
				WebElement UploadImg = driver.findElement(By.name("userFile[]"));
				UploadImg.sendKeys("D:\\Job_NY\\Jmeter-Load testing\\LinkDocument.txt");
				driver.findElement(By.cssSelector("[type='submit']")).click();
				

	}

}
