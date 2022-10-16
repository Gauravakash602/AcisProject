package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SP29_LicenseRevisionFlowAutomation extends TestBase {

	String parentFirstName, parentLastName, userName, password, Record_id;

	public SP29_LicenseRevisionFlowAutomation() throws AcisException {
	}

	// Adding a revision to a placement resource and Submit to Supervisor
	@Test(enabled = true, description = "S-1501 : Waivers/Variances/Exceptions", groups = { "High", "acisRegression",
			"Prateeksha" }, priority = 1)

	public void LicenseRevision() throws AcisException, InterruptedException {

		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchGlobalAccountRecord(parentFirstName + " " + parentLastName + " " + "Home");
		providerAgencyAccountPage.clickReviseLicense();
		providerAgencyAccountPage.createLicenseRevisionRecord("Voluntary Relinquishment");
		providerAgencyAccountPage.clickNextButton();
		providerAgencyAccountPage.clickOnFinish();
		providerAgencyAccountPage.clickRelatedTab();
		providerAgencyAccountPage.selectLicenseRevisionRecord();
		// TODO Auto-generated constructor stub
	}
	
	public void AddandRemoveApplicant_LicenseRevisionAutoCreation() throws AcisException, InterruptedException {

		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchGlobalAccountRecord(parentFirstName + " " + parentLastName + " " + "Home");
		providerAgencyAccountPage.clickReviseLicense();
		providerAgencyAccountPage.createLicenseRevisionRecord("Voluntary Relinquishment");
		providerAgencyAccountPage.clickNextButton();
		providerAgencyAccountPage.clickOnFinish();
		providerAgencyAccountPage.clickRelatedTab();
		providerAgencyAccountPage.selectLicenseRevisionRecord();
		// TODO Auto-generated constructor stub
	}
	
	

	@Test(enabled = true, description = "Data creation-Changing the license status to Approved using Admin login ", groups = {
			"High", "acisRegression", "sankari" }, priority = 0)

	public void DataManipulationUsingAdminLogin()
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException {

		// New placement account gets created and Data gets updated in createdData Excel
		// in following method

		basicProviderMgmFlowTest.CreatePlacementAccount();

		// Reading the Excel data
		parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
		userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		password = createdData.get(Constants.FosterParentID_SHEET).get("password");
		
		//Locating Record id
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName + " " + "Home");
		Record_id = licensingApplicationPage.locateRecordID();
		homePage_SFDCPage.logoutUser();

		// Override license status to Approved using Admin login
		loginTest.login("Admin");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.AdminLogin_StatusUpdate("Approved");
		homePage_SFDCPage.logoutUser();

	}

	@Test(enabled = false, description = "Data creation", groups = { "High", "acisRegression",
			"sankari" }, priority = 0)

	public void DataPreRequsiteCreation()
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException, AWTException {

		// New placement account gets created and Data gets updated in createdData
		// Excel.

		Record_id = basicProviderMgmFlowTest.createActiveLicense();
		parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
		userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		password = createdData.get(Constants.FosterParentID_SHEET).get("password");

	}

}
