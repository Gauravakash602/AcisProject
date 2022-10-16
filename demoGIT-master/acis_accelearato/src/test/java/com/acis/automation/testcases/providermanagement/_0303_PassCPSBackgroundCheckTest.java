package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0303_PassCPSBackgroundCheckTest extends TestBase{

	public _0303_PassCPSBackgroundCheckTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(enabled = true, description = "S-0303 - Pass CPS Background Check", groups = { "High",
			"acisRegression", "Swati" },priority=0)
	public void PassCPSBackgroundCheck() throws AcisException, InterruptedException, IOException, AWTException {
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
		passCPSBackgroundCheck_Portal_Page.clickpassCPSBackgroundCheckPortalTab();
		passCPSBackgroundCheck_Portal_Page.checkTaskOwnerValue("Yusuf Pathan");
		passCPSBackgroundCheck_Portal_Page.checkTaskValue("Upload Documentation") ;
		passCPSBackgroundCheck_Portal_Page.verifyStandarsMessage();
		passCPSBackgroundCheck_Portal_Page.selectDocumentType();
		passCPSBackgroundCheck_Portal_Page.clickAddFilesAndUpload(fileupload);
		passCPSBackgroundCheck_Portal_Page.checkTaskValue("Run Background Checks");
		 accountPage.switchApplication();
		
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick("Yusuf Pathan");
		licensingApplicationPage.clickLicenseActivitiesTab();
		passCPSBackgroundCheckPage.licensingActivityName();
		passCPSBackgroundCheckPage.checkTaskOwnerValue("ACIS Licensing Worker");
		passCPSBackgroundCheckPage.checkTaskValue("Run Background Checks");
		passCPSBackgroundCheckPage.results( "Qualified");
		passCPSBackgroundCheckPage.clickOnSecondUpload(fileupload);
		passCPSBackgroundCheckPage.checkTaskValue("Confirms Standards Met");
		passCPSBackgroundCheckPage.applicant_A_Indicated_perpetrator("Yes");
		passCPSBackgroundCheckPage.applicant_B_Indicated_perpetrator("No");
		passCPSBackgroundCheckPage.OthersIndicatedPerpetrators("Yes");
		passCPSBackgroundCheckPage.standardsMet("Meets");
		passCPSBackgroundCheckPage.checkTaskValue("Completed");
		
		passCPSBackgroundCheckPage.standardsMet("Has Concerns");
		passCPSBackgroundCheckPage.checkTaskValue("Confirms Standards Met");
		passCPSBackgroundCheckPage.standardsMet("Meets");
		passCPSBackgroundCheckPage.requestWaiver("Yes");
		passCPSBackgroundCheckPage.saveButton();
		passCPSBackgroundCheckPage.waiverRequestComments();
		passCPSBackgroundCheckPage.saveButton();
		passCPSBackgroundCheckPage.requestVariance("Yes");
		passCPSBackgroundCheckPage.saveButton();
		passCPSBackgroundCheckPage.varianceRequestComments();
		passCPSBackgroundCheckPage.saveButton();
		passCPSBackgroundCheckPage.checkTaskValue("Completed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:301 Provider Management - Create Placement Resource Account and licensing Application");
		}
	

}
}
