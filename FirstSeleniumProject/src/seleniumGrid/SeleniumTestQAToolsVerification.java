package seleniumGrid;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;
 
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
 
public class SeleniumTestQAToolsVerification {
	 
		static WebDriver driver;
	    Wait<WebDriver> wait;
		  	
 
	 @BeforeClass
     public static void openBrowser(){
		 
		 System.setProperty("webdriver.gecko.driver","C:/downloads/geckodriver-v0.11.1-win64/geckodriver.exe");
         driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} 
 
	 @Test
     public void valid_UserCredential() throws InterruptedException{
		 
		 Thread.sleep(5000);
 
		 driver.get("http://www.store.demoqa.com");	
	     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	     driver.findElement(By.id("log")).sendKeys("testuser_3");
	     driver.findElement(By.id("pwd")).sendKeys("Test@123");
	     driver.findElement(By.id("login")).click();
	     
		
	WebElement element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
		
	Assert.assertNotNull(element);
	System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }
 
	 @Test
     public void inValid_UserCredential()
     {
		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     driver.get("http://www.store.demoqa.com");	
	     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	     driver.findElement(By.id("log")).sendKeys("testuser");
	     driver.findElement(By.id("pwd")).sendKeys("Test@123");
	     driver.findElement(By.id("login")).click();
	     
		WebElement element2 = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
	    	
	    Assert.assertNotNull(element2);
	    System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }
 
	 @AfterClass
	 public static void closeBrowser(){
		 driver.quit();
	 }
}