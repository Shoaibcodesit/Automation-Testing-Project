package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.StaticWebTable;

public class StaticTableTest extends BaseTest {
	
	@Test
	public void StaticTabledata()
	{
		StaticWebTable Staticdata = new StaticWebTable(driver);
		Staticdata.scrolltostaticwebtable();
		Staticdata.countrows();
		Staticdata.countcolumns();
		Staticdata.Specificdata();
		Staticdata.alldata();
	}

}
