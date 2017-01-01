
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Search Google example.
 *
 * @author Rahul
 */
public class MyProject {
    static WebDriver driver;
    static Wait<WebDriver> wait;

    public static void main(String[] args) {
    	
        System.setProperty("webdriver.gecko.driver","C:/downloads/geckodriver-v0.11.1-win64/geckodriver.exe");
        // DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        // capabilities.setCapability("marionette", true);
        // WebDriver driver = new FirefoxDriver(capabilities);
    	
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 30);
              
    	//WebDriver driver = new ChromeDriver();
    	driver.get("http://10.10.18.247/get-fit/supergym");
    	driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
     
    	driver.get("http://www.google.com");
    	driver.manage().window().maximize();
    	driver.close();
    	System.out.println("firefox");
    }
    	

 }
