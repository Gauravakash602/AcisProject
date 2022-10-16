package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class _1364_ExtendTextFieldsinLicensingActivitiesTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1364_ExtendTextFieldsinLicensingActivitiesTest.class);

	public _1364_ExtendTextFieldsinLicensingActivitiesTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S-1364: Extend Text Fields in Licensing Activities", groups = { "Medium", "ACIS_Regression",
			"Khushboo" })
	public void checkUploadInstrctions() throws AcisException, InterruptedException, IOException {

		/*
		 * userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get(
		 * "licensingWorkerUserName"),
		 * testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
		 */
		LoginTest loginTest = new LoginTest();
		
		loginTest.login("LicesningWorker");
		home.verfiyHomePage();
		// accountPage.switchLoginPage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.clickFirstRecord();
		licensingApplicationPage.clickLicenseActivitiesTab();
		meetHomeSafetyStandards_Portal_page.clickMeetHomeSafetyStandardsTab();
		meetHomeSafetyStandards_Portal_page.checkUploadInstructions();
	}
}
