import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Detect_subject {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		  		
				WebDriver driver = new FirefoxDriver();
				
				driver.get("http://www.bing.com/");
				
				//Ditect đối tượng className và sendKey và id
				//driver.findElement(By.className("b_searchbox")).sendKeys("selenium");		
				driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
				
				
				//Ditect đối tượng cssSelector và click và name
				//driver.findElement(By.cssSelector("#sb_form_go")).click();
				driver.findElement(By.name("go")).click();
				
				Thread.sleep(2000);
				driver.close();	

	}

}
