package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.FileUpload;

public class FileUploadTest extends BaseTest {
	
	@Test
	public void Singlefileuploading() {
		FileUpload file = new FileUpload(driver);
		
		file.scrollToUploadSection();
		file.Singlefileupload();
		file.Multiplefileupload();
}
	
}
