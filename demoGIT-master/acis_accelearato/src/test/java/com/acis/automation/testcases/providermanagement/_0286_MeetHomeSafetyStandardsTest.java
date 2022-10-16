package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0286_MeetHomeSafetyStandardsTest extends TestBase {

	public _0286_MeetHomeSafetyStandardsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(enabled = true, description = "S-0286 - Meet Home Safety Standards", groups = { "High",
			"acisRegression", "Swati" },priority=0)
	public void MeetHomeSafetyStandards() throws AcisException, InterruptedException, IOException, AWTException {
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

		home.verfiyHomePage();
		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword("yulmesespa@biyac.com", "Acis@123456");
//		homePage_SFDCPage.closeTabs();
//		homePage_SFDCPage.clickDownArrowLicensingApplication();
		licensingApplicationPage.clickLicenseActivitiesTab();
		meetHomeSafetyStandards_Portal_page.clickMeetHomeSafetyStandardsTab();
		meetHomeSafetyStandards_Portal_page.checkTaskOwnerValue("Yusuf Pathan");
		meetHomeSafetyStandards_Portal_page.checkTaskValue("Upload Documentation");
		meetHomeSafetyStandards_Portal_page.verifyStandarsMessage();
		meetHomeSafetyStandards_Portal_page.verifyInstructionsMessage();
//		meetHomeSafetyStandards_Portal_page.selectPersonHouseholdName("YusufPathan");
		meetHomeSafetyStandards_Portal_page.DocumentType("optionPetVaccination");
		meetHomeSafetyStandards_Portal_page.clickAddFilesAndUpload(fileupload);
		meetHomeSafetyStandards_Portal_page.selectAllDocumentValue("Yes");
		meetHomeSafetyStandards_Portal_page.DocumentType("optionProofofCarInsurance");
		meetHomeSafetyStandards_Portal_page.clickAddFilesAndUpload(fileupload);
		meetHomeSafetyStandards_Portal_page.checkTaskOwnerValue("Yusuf Pathan");
		meetHomeSafetyStandards_Portal_page.checkTaskValue("Confirm Standards Met");
		accountPage.switchApplication();
//	
		
		
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick("Yusuf Pathan");
		licensingApplicationPage.clickLicenseActivitiesTab();
		meetHomeSafetyStandardspage. meetHomeSafetyStandardPageTab();
		meetHomeSafetyStandardspage.checkTaskValue("Confirm Standards Met");
		meetHomeSafetyStandardspage.checkTaskOwnerValue("ACIS Licensing Worker");
		meetHomeSafetyStandardspage.verifyStandarsMessage();
		meetHomeSafetyStandardspage.verifyInstructionsMessage();
		meetHomeSafetyStandardspage.descriptionofHome("descriptionofHome");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.confirmStandardsMet("Yes");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.enterNoOfBedrooms("10");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.enterNoOfBeds("20");
		meetHomeSafetyStandardspage.EnterDate();
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.confirmStandardsMet("Meets");
		meetHomeSafetyStandardspage.checkTaskValue("Completed");
		
		 /*Check Backtracking by changing value of std meets to none and back to Meets*/
		meetHomeSafetyStandardspage.selectStandardsMet("None");
		meetHomeSafetyStandardspage.checkTaskValue("Confirm Standards Met");
		meetHomeSafetyStandardspage.selectStandardsMet("Meets");
		meetHomeSafetyStandardspage.checkTaskValue("Completed");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:301 Provider Management - Create Placement Resource Account and licensing Application");
		}
		

}
}
