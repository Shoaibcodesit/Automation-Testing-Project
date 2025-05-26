package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GUIElementsPage {
	
	private WebDriver driver;
	
	public GUIElementsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	private By nameInput = By.xpath("//input[@id='name']");
	private By emailInput = By.xpath("//input[@id='email']");
	private By phoneInput = By.xpath("//input[@id='phone']");
	private By addressInput = By.xpath("//textarea[@id='textarea']");
	private By maleoption = By.xpath("//input[@id='male']");
	private By femaleoption = By.xpath("//input[@id='female']");
	private By days = By.xpath("//input[@class ='form-check-input' and @type='checkbox']");
	private By country = By.xpath("//select[@id='country']");
	private By colors = By.xpath("//select[@class = 'form-control' and @id='colors']");
	private By animals = By.xpath("//select[@class = 'form-control' and @id='animals']");
	private By datepicker1 = By.xpath("//input[@id='datepicker']");
	private By datepicker2 = By.xpath("//input[@id='txtDate']");
	private By datepicker3 = By.xpath("//button[@class='submit-btn']");
	
	
	
	// Actions
    public void enterName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }
    
    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }
    
    public void enterPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }
    
    public void enterAddress(String textarea) {
        driver.findElement(addressInput).sendKeys(textarea);
    }
    
    public void selectGenderMale() {
    	driver.findElement(maleoption).click();
    }
    
    public void selectGenderFemale() {
        driver.findElement(femaleoption).click();
    }
    
    public void selectday() {
    	
		List<WebElement> checkb =driver.findElements(days);
    	
		//To select some few checkboxes
		for(int i=3; i<checkb.size(); i++) {
			checkb.get(i).click();
		}
		
		//driver.findElement(By.xpath("//input[@id='thursday']")).click();
		//To select all the checkboxes
		/*for(WebElement checkboxes:checkb) {
			checkboxes.click();
		}*/
    }
    
    public void selectcountry() {
    	
    	WebElement dcountry = driver.findElement(country);
    	Select drpcountry = new Select(dcountry);
    	
    	drpcountry.selectByVisibleText("India");
    }
    
    public void selectcolor() {
    	
    	WebElement color = driver.findElement(colors);
    	Select dropcolor = new Select(color);
    	
    	dropcolor.selectByVisibleText("Green");
    	
    }
    
    public void selectanimal() {
    	
    	WebElement animal = driver.findElement(animals);
    	Select dropanimals = new Select(animal);
    	
    	dropanimals.selectByVisibleText("Lion");
    }
    
    public void selectdate1() {
    	
    	//Select a future date
    	driver.findElement(datepicker1).click();
    	String monthandyear = "May 2028";
    	String date = "16";
    	
    	while(true) {
    		
    		String currentmonthandyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
    		if(currentmonthandyear.equals(monthandyear)) {
    			break;
    		}
    		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    		
    	}
    	
    	List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
    	for(WebElement dt:alldates) {
    		if(dt.getText().equals(date)) {
    			dt.click();
    			break;
    		}
    	}
    	
    	//Select a past date
    	/*driver.findElement(datepicker1).click();
    	String monthandyear = "August 2022";
    	String date = "12";
    	
    	while(true) {
    		
    		String currentmonthandyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
    		if(currentmonthandyear.equals(monthandyear)) {
    			break;
    		}
    		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
    		
    	}
    	
    	List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
    	for(WebElement dt:alldates) {
    		if(dt.getText().equals(date)) {
    			dt.click();
    			break;
    		}
    	}*/
    	
    }
    
    public void selectdate2() {
    	
    	driver.findElement(datepicker2).click();
    	String month = "May";
    	String year = "2027";
    	String date = "17";
    	
    	while(true) {
    		
    		// Locate the month and year dropdown elements
    		WebElement monthdropdown = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
    		Select selectmonth = new Select(monthdropdown);
    	    selectmonth.selectByVisibleText(month);
    	    
    		WebElement yeardropdown = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
    		Select selectyear = new Select(yeardropdown);
    		selectyear.selectByVisibleText(year);
    		
    		
    		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        	for(WebElement dt:alldates) {
        		if(dt.getText().equals(date)) {
        			dt.click();
        			
        		}
        	}
        	
        	break;
    	}
    	
    	
    }
    
    public void selectdate3() {
    	
    	driver.findElement(By.xpath("//input[@id='start-date']")).sendKeys("14-05-2026");
    	driver.findElement(By.xpath("//input[@id='end-date']")).sendKeys("15-09-2026");
    	driver.findElement(datepicker3).click();
    }

}
