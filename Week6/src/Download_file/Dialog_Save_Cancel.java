package Download_file;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Dialog_Save_Cancel {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		FirefoxProfile firefoxprofile = new FirefoxProfile();
		
		firefoxprofile.setPreference("browser.download.dir", "D:\\Job_NY");
		firefoxprofile.setPreference("browser.download.folderList", 2);

		firefoxprofile.setPreference(
			"browser.helperApps.neverAsk.saveToDisk",
			"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"
			    + "application/pdf;"
			    + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;"
			    + "text/plain;" + "text/csv");
		
		firefoxprofile.setPreference("pdfjs.disabled", true);
		
		driver = new FirefoxDriver(firefoxprofile);
		
		driver.get("https://java.com/en/download/");
		Thread.sleep(2000);
		  
		driver.findElement(By.xpath("//span[contains(.,'Free Java Download')]")).click();
		Thread.sleep(1000);
		  
		driver.findElement(By.xpath("//span[contains(.,'Agree and Start Free Download')]")).click();
		Thread.sleep(2000);
		  
		//Handling window based controls
		Robot r = new Robot();
		//Click on tab operation 
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		//Click on Enter option
		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		driver.close();
	}
}
