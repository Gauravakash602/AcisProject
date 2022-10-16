package com.acis.automation.testcases.checkout;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class BasicProviderMgmFlowTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(BasicProviderMgmFlowTest.class);

	public BasicProviderMgmFlowTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String parentFirstName = faker.name().firstName();
	String parentLastName = faker.name().lastName();

	@Test(enabled = false, description = "US-0224 Provider Management - Account Registration - Portal Registration Page", groups = {
			"High", "acisRegression", "Akash" }, priority = 2)
	public void CreatePlacementAccount()
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException {

		String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String phone = excel.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"),
				5);
		String email;
		String fosterParentInquiryID;

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		// email=accountPage.swiitchEmailpage();
		email = accountPage.swiitchEmailpage_updated();
		accountPage.swiitchInquiryPage();
		fosterParentInquiryFormPage.verifyFirstLast();
		fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
		fosterParentInquiryFormPage.setParent1LastName(parentLastName);
		fosterParentInquiryFormPage.setDatewithData(setdate);
		fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
		fosterParentInquiryFormPage.setParent1EmailAddress();
		fosterParentInquiryFormPage.clickOnPhoneRadioButton();
		fosterParentInquiryFormPage.clickNextButton();
		fosterInquirySecondPage.selectAddress("Jackson, MS, USA");
		fosterInquirySecondPage.selectFosterCheckBox();
		fosterInquirySecondPage.selectNext();
		fosterInquirySecondPage.selectFinishCheckBox();
		driver.close();
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		accountPage.changingStatus();
		fosterParentInquiryID = accountPage.getFosterParentInquiryID();
		accountPage.swiitchToEmailLast();
		accountPage.copyStringUrl();
		accountPage.usernamePasswordforFosterParent("Acis@123456");
		portalPage.FillingPortal_Firstpage();
		portalPage.clickNext();
		portalPage.FillingPortal_secondpage();
		portalPage.clickNext();
		portalPage.FillingPortal_lastpage();
		portalPage.AddingReference();
		portalPage.clickSubmitButton();
		homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH, Constants.FosterParentID_SHEET, 1,
				"userName", 0, email, 1);
		homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH, Constants.FosterParentID_SHEET, 2,
				"password", 0, "Acis@123456", 1);
		homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH, Constants.FosterParentID_SHEET, 3,
				"firstName", 0, parentFirstName, 1);
		homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH, Constants.FosterParentID_SHEET, 4,
				"lastName", 0, parentLastName, 1);
		homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH, Constants.FosterParentID_SHEET, 5,
				"fosterParentInquiryID", 0, fosterParentInquiryID, 1);

		/* Initializing excel data again */
		getCreatedData();
		System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("userName"));
		System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("password"));
		System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("firstName"));
		System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("lastName"));
		System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("fosterParentInquiryID"));
		accountPage.switchApplication();

	}

	@Test(enabled = false, description = "US-0224 Provider Management - Account Registration - coming banck to application", groups = {
			"High", "acisRegression", "Akash" }, priority = 1)
	public void createPlacementaccountApplication() throws AcisException, InterruptedException, IOException {

		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
//		String convertYes = testData.get(Constants.AccountProviderManagemnt).get("convertYes");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

		home.verfiyHomePage();

		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		// Relative Foster :Treatment Foster :Regular Foster
		accountPage.changingStatus();
		accountPage.swiitchEmail();

	}

	@Test(enabled = false, description = "US-0224 Provider Management - Account Registration and verifying foster parent", groups = {
			"High", "acisRegression", "Akash" }, priority = 2)
	public void createPlacementaccountApplicationFosterParent()
			throws AcisException, InterruptedException, IOException {

		String username = testData.get(Constants.AccountProviderManagemnt).get("fosterUsername");
		String password = testData.get(Constants.AccountProviderManagemnt).get("fosterPassword");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
		System.out.println(password);
		System.out.println(username);
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.loginToForestApplication(username, password);
		accountPage.fosterParentfields();

	}

	@Test(enabled = false, description = "US-0224 Provider Management - Account Registration - Portal Registration Page", groups = {
			"High", "acisRegression", "sankari" }, priority = 0)
	public String CreatePlacementAccountandUpdateStatus(String firstname, String lastname)
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException {

		String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String phone = excel.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"),
				5);
		String email;
		String fosterParentInquiryID;

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		email = accountPage.swiitchEmailpage_updated();
		accountPage.swiitchInquiryPage();
		fosterParentInquiryFormPage.verifyFirstLast();
		fosterParentInquiryFormPage.setParent1FirstName(firstname);
		fosterParentInquiryFormPage.setParent1LastName(lastname);
		fosterParentInquiryFormPage.setDatewithData(setdate);
		fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
		fosterParentInquiryFormPage.setParent1EmailAddress("ACIS@gmail.com");
		fosterParentInquiryFormPage.clickNextButton();
		fosterInquirySecondPage.selectAddress("Jackson, MS, USA");
		fosterInquirySecondPage.selectFosterCheckBox();
		fosterInquirySecondPage.selectNext();
		fosterInquirySecondPage.selectFinishCheckBox();
		driver.close();
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		accountPage.changingStatus();
		fosterParentInquiryID = accountPage.getFosterParentInquiryID();
		

		return fosterParentInquiryID;

	}

	@Test(enabled = true, description = "Provider data setup-Active license creation", groups = { "High",
			"acisRegression", "sankari" }, priority = 1)
	public String createActiveLicense()
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException, AWTException {
		CreatePlacementAccount();
		accountPage.switchApplication();
		homePage_SFDCPage.logoutUser();
		loginTest.login("Admin");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName + " " + "Home");

		String Record_id = licensingApplicationPage.locateRecordID();

		

		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.clickLicenseActivitiesTab();
		LicensingActivitiesCompletion.LicensingActivitiesCompletionwithoutWaiverandVariance_singleApplicant();
		homePage_SFDCPage.logoutUser();
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.selectLicensingRecommendation("Approve License");
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser();
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.AcceptLicensingApplication();
		licensingApplicationPage.checkStatus("Approved");
		homePage_SFDCPage.logoutUser();
		return Record_id;

	}

	@Test(enabled = false, description = "Provider data setup-Active license creation", groups = { "High",
			"acisRegression", "sankari" }, priority = 1)
	public void FillingMandatoryFields_portal() throws InterruptedException, AcisException {

		loginTest.login("LicesningWorker");
		home.verfiyHomePage();

		homePage_SFDCPage.clickDownArrowHome();
		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword("lawen36523@noobf.com", "Acis@123");
		portalPage.FillingPortal_Firstpage();
		portalPage.clickNext();
		portalPage.FillingPortal_secondpage();
		portalPage.clickNext();
		portalPage.FillingPortal_lastpage();
		portalPage.AddingReference();
		portalPage.clickSubmitButton();
		accountPage.switchApplication();

	}
}
