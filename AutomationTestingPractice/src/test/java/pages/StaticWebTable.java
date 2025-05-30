package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaticWebTable {
	
	private WebDriver driver;
	
	public StaticWebTable(WebDriver driver) 
	{
		this.driver= driver;
	}
	
	private int rows;
	private int cols;
	
	//Scroll to static web table
	public void scrolltostaticwebtable() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']"));
		js.executeScript("arguments[0].scrollIntoView()", scroll);
	}
	
	//Find total number of rows in the table
	public void countrows() 
	{
		rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of rows"+rows);
	}
	
	//Find total number of columns
	public void countcolumns()
	{
		cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println("Number of columns:"+cols);
	}
	
	//Read data from specific row or column
	public void Specificdata()
	{
		String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[05]//td")).getText();
		System.out.println(data);
		
	}
	
	//Read all data from the table
	public void alldata() {
		
		for(int r=2; r<=rows; r++) 
		{
			for(int c=1; c<=cols; c++)
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(String.format("%-20s", data));
			}
			System.out.println();
		}
		
		
	}
}
