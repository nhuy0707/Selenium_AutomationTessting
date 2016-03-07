package Download_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Not_dialog {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxProfile firefoxprofile = new FirefoxProfile();

		firefoxprofile.setPreference("browser.download.dir", "D:\\Job_NY");
		firefoxprofile.setPreference("browser.download.folderList", 0);

		firefoxprofile.setPreference(
		  "browser.helperApps.neverAsk.saveToDisk",
		  "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"
		      + "application/pdf;"
		      + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;"
		      + "text/plain;" + "text/csv");
		 
		firefoxprofile.setPreference(
		  "browser.download.manager.showWhenStarting", false);
		 
		firefoxprofile.setPreference("pdfjs.disabled", true);

		  driver = new FirefoxDriver(firefoxprofile);

		  driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html#sthash.D47RdOVC.dpuf");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//a[contains(.,'Download Text File')]")).click();	
		  Thread.sleep(5000);
		  
		  //driver.findElement(By.xpath("//a[contains(.,'Download PDF File')]")).click();
		  //Thread.sleep(5000);

		  //driver.findElement(By.xpath("//a[contains(.,'Download CSV File')]")).click();
		  //Thread.sleep(5000);

		  //driver.findElement(By.xpath("//a[contains(.,'Download Excel File')]")).click();
		  //Thread.sleep(5000);

		  //driver.findElement(By.xpath("//a[contains(.,'Download Doc File')]")).click();
		  //Thread.sleep(5000);

		  //driver.close();
		  
	}
}
