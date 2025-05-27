package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {
	
    private WebDriver driver;
	
	public FileUpload(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	//Locators
		private By SingleFile = By.xpath("//input[@id='singleFileInput']");
		private By MultipleFile = By.xpath("//input[@id='multipleFilesInput']");
		private By UploadSingleFile = By.xpath("//button[normalize-space()='Upload Single File']");
		private By UploadMultipleFile = By.xpath("//button[normalize-space()='Upload Multiple Files']");
		
		
		//Actions
		
		// Scroll method (to call explicitly)
	    public void scrollToUploadSection() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement scroll = driver.findElement(By.xpath("//h2[normalize-space()='Upload Files']"));
	        js.executeScript("arguments[0].scrollIntoView()", scroll);
	    }
		
		public void Singlefileupload() {
			driver.findElement(SingleFile).sendKeys("D:\\NEW FOLDER\\manual.txt");
			driver.findElement(UploadSingleFile).click();
		}
		
		public void Multiplefileupload() {
			String file1 = "D:\\NEW FOLDER\\notes.txt";
			String file2 = "D:\\NEW FOLDER\\manual.txt";
			driver.findElement(MultipleFile).sendKeys(file1 +"\n"+ file2);
			driver.findElement(UploadMultipleFile).click();
		}

}
