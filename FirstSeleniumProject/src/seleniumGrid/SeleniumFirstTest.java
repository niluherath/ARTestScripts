package seleniumGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFirstTest {
	
	public static void main(String[] args) {
		
		WebDriver driver;
	    Wait<WebDriver> wait;

		
		 System.setProperty("webdriver.gecko.driver","C:/downloads/geckodriver-v0.11.1-win64/geckodriver.exe");
	        // DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	        // capabilities.setCapability("marionette", true);
	        // WebDriver driver = new FirefoxDriver(capabilities);
	    	
	       	       
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Nelly");
		driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("Herath");
		driver.findElement(By.xpath(".//*[@id='u_0_5']")).sendKeys("niluherath@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).sendKeys("niluherath@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("coolherath1!");
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='day']"))); 
		sel1.selectByIndex(25);
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel2.selectByIndex(10);
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByValue("1980");
		driver.findElement(By.xpath(".//*[@id='u_0_k']/span[1]/label")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).click();
	
	}
}
