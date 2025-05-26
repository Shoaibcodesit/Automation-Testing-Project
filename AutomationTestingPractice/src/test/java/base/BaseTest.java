package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver = DriverFactory.getDriver();                                     //Launches chrome and opens the driver
		driver.manage().window().maximize();                                    //Maximizes the chrome page to full screen
		driver.get("https://testautomationpractice.blogspot.com/");             //Opens the application url
	}
	
	@AfterMethod
	public void teardown()
	{
		 try {
		        Thread.sleep(3000); // Wait for 3 seconds (not recommended in real tests)
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		
		DriverFactory.quitDriver();
	}

}
