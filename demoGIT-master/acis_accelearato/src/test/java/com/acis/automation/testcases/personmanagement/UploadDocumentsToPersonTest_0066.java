package com.acis.automation.testcases.personmanagement;

import java.awt.AWTException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class UploadDocumentsToPersonTest_0066 extends TestBase {

	public UploadDocumentsToPersonTest_0066() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

final static Logger logger = LoggerFactory.getLogger(UploadDocumentsToPersonTest_0066.class);
	
	@Test(description = " US-0066 : Upload Essential Documents Related to Person - Intake", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void uploadDcoumentsToPersonIntake() throws AcisException, InterruptedException, AWTException 
	   {
		 
		  System.out.println("File Path : " + Constants.UPLOAD_FILE_PATH + "DemoDoc.txt");
	      String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		
		  loginTest.login("Intake");
		  homePage_SFDCPage.clickDownArrowAccount();
	      homePage_SFDCPage.selectAllAccount();
	      homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
	      personsInformationPage.clickRelatedTab();
		  relatedPersonTabPage.clickFilesTab(); 
		  filesPage.clickAddFilesAndUpload(fileupload);
//		  filesPage.verifyFileUploaded("DemoDoc");
		  filesPage.deleteFiles("DemoDoc");
		  homePage_SFDCPage.closeTabs();
		}

		
	
	
}
