package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1227_CompleteAccessToSafeWaterTest extends TestBase{

	public _1227_CompleteAccessToSafeWaterTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "US-0001227 - Access to Safe Water", groups = { "High",
			"acisRegression", "Mrunal" },priority=0)
	public void completeAccessToSafeWaterTest() throws AcisException, InterruptedException, IOException, AWTException {
		
		  String fileupload_one = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		  String fileupload_two = Constants.UPLOAD_FILE_PATH + "demoFile.txt";
		   String fileupload_three = Constants.UPLOAD_FILE_PATH + "FileOne.txt";
		   
			String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
			String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
			
			String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
			String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
		
		  
		  userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				  testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
		  home.verfiyHomePage();
		  /*Switch to Portal Window*/
		  accountPage.switchLoginPage();
		  accountPage.enterUsernamePassword(userName, password);
		  licensingApplicationPortalPage.clickLicenseActivitiesTab();
		  accessToSafeWater_Portal_Page.clickAccessToSafeWaterTab();
		  accessToSafeWater_Portal_Page.checkTaskValue("Upload Documentation");
		  accessToSafeWater_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);			
		  accessToSafeWater_Portal_Page.verifyStandarsMessage();
		  accessToSafeWater_Portal_Page.verifyInstructionsMessage();
		  accessToSafeWater_Portal_Page.selectDocumentType("Proof of Water Service");
		  accessToSafeWater_Portal_Page.clickAddFilesAndUpload(fileupload_one);
		  accessToSafeWater_Portal_Page.selectDocumentType("Water Agreement (SF 54612)");
		  accessToSafeWater_Portal_Page.clickAddFilesAndUpload(fileupload_two);
		  accessToSafeWater_Portal_Page.selectDocumentType("Well Water Analysis");
		  accessToSafeWater_Portal_Page.clickAddFilesAndUpload(fileupload_three);
		  accessToSafeWater_Portal_Page.selectAllDocumentValue("Yes");			
		  accessToSafeWater_Portal_Page.refreshPageAndWait(10);
		  accessToSafeWater_Portal_Page.checkTaskValue("Confirm Standards Met");
		  accessToSafeWater_Portal_Page.checkTaskOwnerValue("Licensing Worker");

		  /*Switch back to Salesforce window*/
		  accountPage.switchApplication();

		  home.verfiyHomePage();
		  homePage_SFDCPage.closeTabs();
		  homePage_SFDCPage.clickDownArrowLicensingApplication();
		  homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		  licensingApplicationPage.clickLicenseActivitiesTab();
		  accessToSafeWaterPage.clickAccessToSafeWaterTab();
		  accessToSafeWaterPage.checkTaskValue("Confirm Standards Met");
		  accessToSafeWaterPage.checkTaskOwnerValue("Licensing Worker");
		  accessToSafeWaterPage.verifyStandarsMessage();
		  accessToSafeWaterPage.verifyInstructionsMessage();
		  accessToSafeWaterPage.selectHouseHoldAccessValue("Yes");
		  accessToSafeWaterPage.clickSaveButton();
		  accessToSafeWaterPage.selectApplicantAValue();
		  accessToSafeWaterPage.clickSaveButton();
		  accessToSafeWaterPage.selectStandardsMetValue("Meets");
		  accessToSafeWaterPage.checkTaskValue("Completed");
		 
		  /*Check Backtracking by changing value of std meets to none and back to Meets*/
		  accessToSafeWaterPage.selectStandardsMetValue("--None--");
		  accessToSafeWaterPage.checkTaskValue("Confirm Standards Met");
		  accessToSafeWaterPage.checkTaskOwnerValue("Licensing Worker");
		  accessToSafeWaterPage.selectStandardsMetValue("Meets");
		  accessToSafeWaterPage.checkTaskValue("Completed");
		 

		
			
	}
}
