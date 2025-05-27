package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GUIElementsPage;

public class GUIElementsTest extends BaseTest {
	
	@Test
	public void GUIElementsSubmission() throws InterruptedException
	{
		
		GUIElementsPage guielementspage = new GUIElementsPage(driver);
		
		guielementspage.enterName("Shoaib");
		Thread.sleep(500);
		guielementspage.enterEmail("shoaib786@gmail.com");
		Thread.sleep(500);
		guielementspage.enterPhone("7483544616");
		Thread.sleep(500);						
		guielementspage.enterAddress("Bangalore");
		Thread.sleep(500);					
		guielementspage.selectGenderMale();
		//guielementspage.selectGenderFemale();
		Thread.sleep(500);					
		guielementspage.selectday();
		Thread.sleep(500);
		guielementspage.selectcountry();
		Thread.sleep(500);
		guielementspage.selectcolor();
		Thread.sleep(500);
		guielementspage.selectanimal();
		Thread.sleep(500);
		guielementspage.selectdate1();
		Thread.sleep(500);
		guielementspage.selectdate2();
		Thread.sleep(500);
		guielementspage.selectdate3();
		
		
	}

}
