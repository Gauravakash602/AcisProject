package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1199_CompleteSexViolentOffenderBackgroundCheckTest extends TestBase {

	public _1199_CompleteSexViolentOffenderBackgroundCheckTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Test(description = "US-0001199 - Pass Sex/Violent Offender Background Check", groups = { "High",
			"acisRegression", "Mrunal" },priority=0)
	public void completeSexViolentOffenderBackgroundCheckTest() throws AcisException, InterruptedException, IOException, AWTException {
		
		  String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		  String fullFileName = "DemoDoc.txt";
		  String fileName="DemoDoc";
		  
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
		  passSexViolentOffenderBackgroundCheck_Portal_Page.clickPassSexViolentOffenderBackgroundCheckTab();
		  passSexViolentOffenderBackgroundCheck_Portal_Page.checkTaskOwnerValue("Licensing Worker");
		  passSexViolentOffenderBackgroundCheck_Portal_Page.verifyStandarsMessage();

		  /*Switch back to Salesforce window*/
		  accountPage.switchApplication();

		  home.verfiyHomePage();
		  homePage_SFDCPage.closeTabs();
		  homePage_SFDCPage.clickDownArrowLicensingApplication();
		  homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
//		  homePage_SFDCPage.searchRecordAndClick("Yusuf Pathan");
		  licensingApplicationPage.clickLicenseActivitiesTab();
		  passSexViolentOffenderBackgroundCheckPage.clickPassSexViolentOffenderBackgroundCheckTab();
		  passSexViolentOffenderBackgroundCheckPage.checkTaskValue("Run Background Checks");
		  passSexViolentOffenderBackgroundCheckPage.checkTaskOwnerValue("Licensing Worker");
		  passSexViolentOffenderBackgroundCheckPage.verifyStandarsMessage();
		  passSexViolentOffenderBackgroundCheckPage.clickAddFilesAndUpload(fileupload);
		  passSexViolentOffenderBackgroundCheckPage.clickOnFileName(fullFileName);
		  passSexViolentOffenderBackgroundCheckPage.clickDetailsTabOfOpenedFile();
		  passSexViolentOffenderBackgroundCheckPage.selectResultFileTab("Match");
		  passSexViolentOffenderBackgroundCheckPage.clickSaveButtonFileTab();
		  passSexViolentOffenderBackgroundCheckPage.closeOpenFileTab(fileName);
		  passSexViolentOffenderBackgroundCheckPage.refreshPageAndWait(10);

		  passSexViolentOffenderBackgroundCheckPage.verifyInstructionsMessage();
		  passSexViolentOffenderBackgroundCheckPage.checkTaskValue("Confirm Standards Met");
		  passSexViolentOffenderBackgroundCheckPage.selectApplicantAValue("Yes");
		  passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		  passSexViolentOffenderBackgroundCheckPage.selectApplicantBValue("Yes");
		  passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		  passSexViolentOffenderBackgroundCheckPage.selectResidentsValue("No");
		  passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		  passSexViolentOffenderBackgroundCheckPage.selectStandardsMetValue("Meets");
		  passSexViolentOffenderBackgroundCheckPage.checkTaskValue("Completed");

		  /*Check Backtracking by changing value of std meets to none and back to Meets*/
		  passSexViolentOffenderBackgroundCheckPage.selectStandardsMetValue("--None--");
		  passSexViolentOffenderBackgroundCheckPage.checkTaskValue("Confirm Standards Met");
		  passSexViolentOffenderBackgroundCheckPage.checkTaskOwnerValue("Licensing Worker");
		  passSexViolentOffenderBackgroundCheckPage.selectStandardsMetValue("Meets");
		  passSexViolentOffenderBackgroundCheckPage.checkTaskValue("Completed");
		  


		
		
	
	}
}
