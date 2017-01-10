package seleniumGrid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * AgileReadyFreeEvaluation class has code scripts to automate testing for a free evaluation for a single person.
 * Date : 1/3/2017
 * Developer : Nilu Herath
 * Project : AgileReady
 *
 */

public class ARAddMembersScript {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
	    Wait<WebDriver> wait;

		
		System.setProperty("webdriver.gecko.driver","C:/downloads/geckodriver-v0.11.1-win64/geckodriver.exe");
	      	       	       
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//sign in 		
			
		//log in
		
		driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[4]/a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("nellyherath@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("chem4kids");
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='login_button']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[1]/a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/form/fieldset/div[1]/div/input")).sendKeys("xyz");
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/form/fieldset/div[2]/div/input")).sendKeys("008");
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/form/fieldset/div[3]/div/input")).sendKeys("alpha");
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='country_list']")));
		
		sel1.selectByValue("1");
		
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='industry_list']")));
		
		sel2.selectByValue("1");
						
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/form/fieldset/div[6]/div/div[1]/label")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='saveEvaluationButton']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/div/a")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[1]/div/form/fieldset/div[6]/div")).click();		
		
		Thread.sleep(5000);
		
		//ng-model script	
		driver.findElement(By.cssSelector("input[ng-model='member.email']")).sendKeys("nellyherath@gmail.com");
		
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='selectTeamRoleID']")));
		
		sel3.selectByValue("2");
		
		//ng-model script
		//click save button
		Thread.sleep(5000);
		//click participant************************
		
			
		//participant checkbox already selected
	
		driver.findElement(By.xpath(".//*[@id='saveQuestionButton']")).click();
		Thread.sleep(3000);
		
		//click evaluations button
		
		driver.findElement(By.xpath(".//*[@id='navbar-brand-centered']/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		// the application presents a list of evaluations in a table
		// need to find the last entry in the table and then press start button.
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover table-striped']/tbody/tr"));
		int rowCount = rows.size()-1;
		
		String rowCinS = Integer.toString(rowCount);
		
			
		//click start button process
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/table/tbody[1]/tr[" + rowCinS +"]/td[9]/p/button")).click();
		
		//click "ok" button to start the evalutaion
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='EveluationSratAlertDialog']/div/div/div[3]/button")).click();
		
	}
	
}