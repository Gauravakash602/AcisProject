package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0283_PassFingerprintBackgroundCheckTest extends TestBase{

	public _0283_PassFingerprintBackgroundCheckTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(enabled = true, description = " S-0283 - Pass Fingerprint Background Check", groups = { "High",
			"acisRegression", "Swati" },priority=0)
	public void PassFingerprintBackgroundCheck() throws AcisException, InterruptedException, IOException, AWTException {
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		
	
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

		home.verfiyHomePage();
		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword("yulmesespa@biyac.com", "Acis@123456");
//		homePage_SFDCPage.closeTabs();
//		homePage_SFDCPage.clickDownArrowLicensingApplication();
//		homePage_SFDCPage.searchRecordAndClick("Yusuf Pathan");
		licensingApplicationPage.clickLicenseActivitiesTab();
		 passFingerprintBackgroundCheck_Portal_Page.passFingerprintBackgroundCheckPortalTab();
		 passFingerprintBackgroundCheck_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
		 passFingerprintBackgroundCheck_Portal_Page.verifyStandarsMessage();
		 passFingerprintBackgroundCheck_Portal_Page.clickAddFilesAndUpload(fileupload);
		 passFingerprintBackgroundCheck_Portal_Page.checkTaskValue("Run Background Checks");
	     

		 accountPage.switchApplication();
		 
		 home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			homePage_SFDCPage.searchRecordAndClick("Yusuf Pathan");
			licensingApplicationPage.clickLicenseActivitiesTab();
			passFingerprintBackgroundCheckPage.passFingerprintBackgroundCheckPageTab();
			passFingerprintBackgroundCheckPage.checkTaskOwnerValue("ACIS Licensing Worker");
			passFingerprintBackgroundCheckPage.checkTaskValue("Run Background Check");
			passFingerprintBackgroundCheckPage.verifyStandarsMessage();
			passFingerprintBackgroundCheckPage.backgroundCheckType("fBIFingerprinting");
			passFingerprintBackgroundCheckPage.clickAddFilesAndUpload(fileupload);
			passFingerprintBackgroundCheckPage.results("qualified");
			passFingerprintBackgroundCheckPage.checkTaskValue("Confirm Standards Met");
			passFingerprintBackgroundCheckPage.applicantA("Yes");
			passFingerprintBackgroundCheckPage.applicantB("Yes");
			passFingerprintBackgroundCheckPage.othersIndicatedperpetrators("Yes");
			passFingerprintBackgroundCheckPage.selectStandardsMet("Has Concerns");
			passFingerprintBackgroundCheckPage.requestWaiver("--None--");
			passFingerprintBackgroundCheckPage.clickSaveButton();
			passFingerprintBackgroundCheckPage.waiverRequestComments();
			passFingerprintBackgroundCheckPage.clickSaveButton();
			passFingerprintBackgroundCheckPage.requestVariance("Yes");
			passFingerprintBackgroundCheckPage.clickSaveButton();
			passFingerprintBackgroundCheckPage.varianceRequestComments();
			passFingerprintBackgroundCheckPage.clickSaveButton();
			passFingerprintBackgroundCheckPage.checkTaskValue("Completed");
			
			
			
		

}
}
