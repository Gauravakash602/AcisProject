package com.acis.automation.testcases.providermanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ApplicationRecordsWithoutLicensingactivitiesTest_1497 extends TestBase {

	public ApplicationRecordsWithoutLicensingactivitiesTest_1497() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ApplicationRecordsWithoutLicensingactivitiesTest_1497.class);

	@Test(priority = 0, description = "US-0001497-Application Records without licensing activities for complaint licensing type", groups = {
			"Medium", "ACIS_Regression", "sankari" })
	public void Licensingapplication_Complaintcreation() throws AcisException {
		try {
//			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
//					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
//			home.verfiyHomePage();
//			homePage_SFDCPage.closeTabs();
			loginTest.login("LicesningWorker");
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			licensingApplicationPage.clickNewLicenseApplication();
		licensingApplicationPage.Licensingapplicationtype_ComplaintOptionSelection();

			licensingApplicationPage.clickNextOpt_NewLicenseApplicationpopup();
			licensingApplicationPage.enterComments();
			licensingApplicationPage.saveButton_licensingpopup();
			licensingApplicationPage.ActivityVerification();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "US-0001497-Application Records without licensing activities for complaint licensing type");

		}
	}

	@Test(priority = 1, description = "US-0001497-Application Records without licensing activities for placement hold licensing type", groups = {
			"Medium", "ACIS_Regression", "sankari" })
	public void Licensingapplication_placementholdcreation() throws AcisException {
		try {
//			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
//					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
//			home.verfiyHomePage();
//			homePage_SFDCPage.closeTabs();
			loginTest.login("LicesningWorker");
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			licensingApplicationPage.clickNewLicenseApplication();
			licensingApplicationPage.Licensingapplicationtype_PlacementholdOptionSelection();
			licensingApplicationPage.clickNextOpt_NewLicenseApplicationpopup();
			licensingApplicationPage.enterStartdate();
			licensingApplicationPage.enterreason();
			licensingApplicationPage.saveButton_licensingpopup();
			licensingApplicationPage.ActivityVerification();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "US-0001497-Application Records without licensing activities for placement hold licensing type");

		}
	}
	
	@Test(priority = 2, description = "US-0001497-Application Records without licensing activities for License Revocation licensing type", groups = {
			"Medium", "ACIS_Regression", "sankari" })
	public void Licensingapplication_LicenseRevocation() throws AcisException {
		try {
//			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
//					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
//			home.verfiyHomePage();
//			homePage_SFDCPage.closeTabs();
			loginTest.login("LicesningWorker");
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			licensingApplicationPage.clickNewLicenseApplication();
			licensingApplicationPage.Licensingapplicationtype_licenserevocationSelection();
			licensingApplicationPage.clickNextOpt_NewLicenseApplicationpopup();
			licensingApplicationPage.saveButton_licensingpopup();
			licensingApplicationPage.ActivityVerification();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "US-0001497-Application Records without licensing activities for License Revocation licensing type");

		}
	}

}
