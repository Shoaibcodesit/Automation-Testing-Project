package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private static WebDriver driver;
	
	//Method used to open the Chrome 
	public static WebDriver getDriver()
	{
		if(driver == null)
		{
			WebDriverManager.chromedriver().setup();           //Automatically downloads and sets up chromedriver 
			driver = new ChromeDriver();                       //Launches the chrome browser
		}
	return driver;	
	}
	
	
	//Method used to close all the browsers
	public static void quitDriver()
	{
		if(driver != null)
		{
			driver.quit();                                     //Closes all the browsers and ends up the webdriver session
			driver = null;                                     //Resets driver to null so a fresh one can be created next time 
		}
	}

}
