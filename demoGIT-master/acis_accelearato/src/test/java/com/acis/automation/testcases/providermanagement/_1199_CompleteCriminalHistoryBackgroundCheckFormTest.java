package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1199_CompleteCriminalHistoryBackgroundCheckFormTest extends TestBase {

	public _1199_CompleteCriminalHistoryBackgroundCheckFormTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S-1199 - Pass Sex/Violent Offender Background Check", groups = { "High",
			"acisRegression", "Mrunal" },priority=0)
	public void completeCriminalHistoryBackgroundCheckFormTest() throws AcisException, InterruptedException, IOException, AWTException {
		
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");

		String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

			home.verfiyHomePage();
			accountPage.switchLoginPage();
			accountPage.enterUsernamePassword(userName, password);
			licensingApplicationPortalPage.clickLicenseActivitiesTab();
			completeCriminalHistoryBackgroundCheckForm_Portal_Page.clickCriminalHistoryBackgroundCheckFormTab();
			completeCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskValue("Upload Documentation");
			completeCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
			completeCriminalHistoryBackgroundCheckForm_Portal_Page.verifyStandarsMessage();
			completeCriminalHistoryBackgroundCheckForm_Portal_Page.verifyInstructionsMessage();
			completeCriminalHistoryBackgroundCheckForm_Portal_Page.clickAddFilesAndUpload(fileupload);
			completeCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskValue("Confirm Standards Met");
			completeCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskOwnerValue("Licensing Worker");
		
			accountPage.switchApplication();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
//			homePage_SFDCPage.searchRecordAndClick("Yusuf Pathan");
			licensingApplicationPage.clickLicenseActivitiesTab();
			completeCriminalHistoryBackgroundCheckFormPage.clickCompleteCriminalHistoryBackgroundCheckFormTab();
			completeCriminalHistoryBackgroundCheckFormPage.verifyStandarsMessage();
			completeCriminalHistoryBackgroundCheckFormPage.verifyInstructionsMessage();
			completeCriminalHistoryBackgroundCheckFormPage.checkTaskValue("Confirm Standards Met");
			completeCriminalHistoryBackgroundCheckFormPage.checkTaskOwnerValue("Licensing Worker");
			completeCriminalHistoryBackgroundCheckFormPage.selectReceivedSignedFormsValue("Yes");
			completeCriminalHistoryBackgroundCheckFormPage.clickSaveButton();
			completeCriminalHistoryBackgroundCheckFormPage.selectStandardsMetValue("Meets");
			completeCriminalHistoryBackgroundCheckFormPage.checkTaskValue("Completed");
			/*Check Backtracking by changing value of std meets to none and back to Meets*/
			completeCriminalHistoryBackgroundCheckFormPage.selectStandardsMetValue("--None--");
			completeCriminalHistoryBackgroundCheckFormPage.checkTaskValue("Confirm Standards Met");
			completeCriminalHistoryBackgroundCheckFormPage.checkTaskOwnerValue("Licensing Worker");
			completeCriminalHistoryBackgroundCheckFormPage.selectStandardsMetValue("Meets");
			completeCriminalHistoryBackgroundCheckFormPage.checkTaskValue("Completed");
			
		
			
			
			

		
	}
}
