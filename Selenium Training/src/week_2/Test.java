package week_2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	public class Test {
		public static void main(String[] args) throws InterruptedException  {		     
			   
		       System.setProperty("webdriver.ie.driver","D:\\Job_NY\\Selenium\\Selenium\\IEDriverServer.exe");
		       WebDriver driver = new InternetExplorerDriver();	      
		      
		       driver.get("http://www.gmail.com");
	       
		       driver.findElement(By.id("Email")).sendKeys("nhuydt90@gmail.com");	      	   
		       driver.findElement(By.id("next")).click();
		       Thread.sleep(1000);
		       driver.findElement(By.id("Passwd")).sendKeys("nhuy");
		       driver.findElement(By.id("signIn")).click();
		       Thread.sleep(5000);
		       String url = driver.getCurrentUrl();	       	
		       
		       if(url.contains("https://mail.google.com/mail/u/0")){
		    	   System.out.println("Test Passed");
		       }
		          	      
		       else {
		    	   System.out.println("Test Failed");
		       }
		       	      	       
		       driver.close();		       

	}

}
