package week_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_Wait {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://en.wikipedia.org/wiki/Main_Page");

		By searchInput = By.id("searchInput");
		wait.until(ExpectedConditions.presenceOfElementLocated(searchInput));
		driver.findElement(searchInput).sendKeys("Software");

		By searchButton = By.id("searchButton");
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		driver.findElement(searchButton).click();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(
			By.tagName("body"), "Computer software also called a program or simply software"));
		
		driver.close();
	}

}
