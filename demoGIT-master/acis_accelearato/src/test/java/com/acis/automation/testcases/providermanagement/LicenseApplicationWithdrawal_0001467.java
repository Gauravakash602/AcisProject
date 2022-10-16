package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class LicenseApplicationWithdrawal_0001467 extends TestBase {

	public LicenseApplicationWithdrawal_0001467() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	String parentFirstName;
	String parentLastName;
	
	String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
	
	String email, fosterParentInquiryID;
	String userName;
	String password;
	String Record_id;

	// licensingApplicationPage.closeSubmitWindow();

	@Test(enabled = true, description = "US-0001467 : License Application Withdrawal", groups = { "High",
			"acisRegression", "sankari" }, priority = 1)

	public void Licenseapplication_withdrawal()
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException, AWTException {

		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
	System.out.println(userName);
	System.out.println(password);
	
		loginTest.login("LicesningWorker");
		home.verfiyHomePage();

		homePage_SFDCPage.clickDownArrowHome();
		accountPage.switchLoginPage();

		accountPage.enterUsernamePassword(userName, password);
		licensingApplicationPage.relatedTab();
		obtainMedicalClearance_Portal_Page.clickAddFilesAndUpload(fileupload);
		fosterPlacementPage.UpdateDocumentType();
		accountPage.switchApplication();
		home.verfiyHomePage();

		obtainMedicalClearance_Portal_Page.clickAddFilesAndUpload_Updated(fileupload);
		licensingApplicationPage.clickNextButton();

		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser();
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.ReturnforEdit();
		licensingApplicationPage.checkStatus("Initial App Pending");
		homePage_SFDCPage.logoutUser();
		loginTest.login("LicesningWorker");

		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword(userName, password);
		licensingApplicationPage.relatedTab();
		accountPage.clicking_addFilesAndUpload(fileupload);
		// obtainMedicalClearance_Portal_Page.clickAddFilesAndUpload(fileupload);
		fosterPlacementPage.UpdateDocumentType();
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.checkStatus("Withdraw Application (Voluntary)");
		licensingApplicationPage.clicksubmit();
		obtainMedicalClearance_Portal_Page.clickAddFilesAndUpload_Updated(fileupload);
		licensingApplicationPage.clickNextButton();

		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser();
		loginTest.login("Supervisor");

		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.AcceptLicensingApplication();
		licensingApplicationPage.checkStatus("Application Withdrawn");

	}

	@Test(enabled = true, description = "Data creation-Changing the license status to Approved using Admin login ", groups = {
			"High", "acisRegression", "sankari" }, priority = 0)

	public void DataManipulationUsingAdminLogin()
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException {

		// New placement account gets created and Data gets updated in createdData Excel in following method
	
		//basicProviderMgmFlowTest.CreatePlacementAccount();
		
		// Reading the Excel data

		parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");

		userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		password = createdData.get(Constants.FosterParentID_SHEET).get("password");

		loginTest.login("Admin");
		
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName + " " + "Home");

		Record_id = licensingApplicationPage.locateRecordID();

	//	 homePage_SFDCPage.logoutUser();
	//	 loginTest.login("Admin");

		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.AdminLogin_StatusUpdate("Approved");
		homePage_SFDCPage.logoutUser();

	}
	
	@Test(enabled = false, description = "Data creation", groups = {
			"High", "acisRegression", "sankari" }, priority = 0)

	public void DataPreRequsiteCreation()
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException, AWTException {

		// New placement account gets created and Data gets updated in createdData
		// Excel.
	
		Record_id=basicProviderMgmFlowTest.createActiveLicense();
		
		parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");

		userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		password = createdData.get(Constants.FosterParentID_SHEET).get("password");

		

	}
}
