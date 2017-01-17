package seleniumGrid;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ARTestLoginVerification {
	
	WebDriver driver;
    Wait<WebDriver> wait;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:/downloads/geckodriver-v0.11.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
		}

	

	@Test
	public void testValidUserCredentials() throws InterruptedException {
				
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//login button
		
		driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[4]/a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("nellyherath@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("chem4kids");
		
		driver.findElement(By.xpath(".//*[@id='login_button']")).click();
		
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[1]/a"));
		
		Assert.assertNotNull(element);
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
