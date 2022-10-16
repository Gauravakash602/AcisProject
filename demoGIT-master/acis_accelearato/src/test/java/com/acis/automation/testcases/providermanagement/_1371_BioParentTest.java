package com.acis.automation.testcases.providermanagement;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class _1371_BioParentTest extends TestBase {

	public _1371_BioParentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String fosterCaseID;
	@Test(enabled = true, description = "US-1371 Provider Management - Account Registration - Portal Registration Page", groups = { "High",
			"acisRegression", "Khushboo" },priority=0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException, UnsupportedFlavorException {
		
		Faker faker =new Faker();

		String parentFirstName = excel
				.generateRandomTestData("", 4);
		
		
		String parentLastName = excel
				.generateRandomTestData("", 4);
		
		String phoneFirst = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("PhoneNoFirst"), 6);
		
	
		String email1 = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("emailFirst"), 6);
		

		String email2 = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("emailSecond"), 6);
		String parentTwoFirst = excel
				.generateRandomTestData("", 6);
		String parentTwoLast = excel
				.generateRandomTestData("", 6);
		String street1 = testData.get(Constants.AccountProviderManagemnt).get("street1");
		
		String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
		String city = testData.get(Constants.AccountProviderManagemnt).get("city");
		//String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String whatname = testData.get(Constants.AccountProviderManagemnt).get("whatname");
		String zip = testData.get(Constants.AccountProviderManagemnt).get("zip");
		
		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String convertYes = testData.get(Constants.AccountProviderManagemnt).get("convertYes");
		
	
		
		String phone = excel
				.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"), 5);
		
		
		LoginTest loginTest = new LoginTest();
		
		loginTest.login("licensingWorkerUserName");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		accountPage.swiitchEmailpage();
		accountPage.swiitchInquiryPage();
		fosterParentInquiryFormPage.verifyFirstLast();
		fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
		fosterParentInquiryFormPage.setParent1LastName(parentLastName);
		fosterParentInquiryFormPage.setDatewithData(setdate);
	
		fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
		fosterParentInquiryFormPage.setParent1EmailAddress();
		fosterParentInquiryFormPage.setenterParent2FirstName("abc");
		fosterParentInquiryFormPage.clickOnPhoneRadioButton();
		fosterParentInquiryFormPage.clickNextButton();
		fosterInquirySecondPage.providCountry("Alll");

		fosterInquirySecondPage.selectRelatedCheckBox();
		fosterInquirySecondPage.selectNext();
		fosterInquirySecondPage.selectFinishCheckBox();
		driver.close();
		accountPage.switchApplication();
		home.verfiyHomePage();

		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		//Relative Foster :Treatment Foster :Regular Foster
		accountPage.changingStatus();
		accountPage.swiitchToEmailLast();
		accountPage.copyStringUrl();
		accountPage.usernamePasswordforFosterParent("Acis@123456");

	}
	@Test(enabled = true, description = "US-1371 editing person and enable person", groups = { "High",
			"acisRegression", "Khushboo" },priority=1)


	public void childWelfareSupervisorHomeDashboardIntakeCreation() throws AcisException, Exception {
		LoginTest loginTest = new LoginTest();

		loginTest.login("OOHWorker");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseActions();
		investigationCasePage.clickFirstRecord();
		fosterCaseID = caseHeadPage.newFosterCaseWithoutHousholdMember();
		fosterCareCase_Page.clickRelatedTab();
		fosterCareCase_Page.clickPersonTab();
		fosterCareCase_Page.clickNewPerson();
		//open case person 
		personsInvovled_CP_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first","emailId","");
		personsInvovled_CP_OmniscriptPage.clickOnSave();
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickDownIconEdit();
		establishRelationships_CP_OmniScriptPage.searchTextPlacementResourceRelationships("Placement Resource","Placement Name:");
		establishRelationships_CP_OmniScriptPage.clickSaveButtonPlacementResourceRelationships();
		establishRelationships_CP_OmniScriptPage.clickSubmit();

	}
	@Test(enabled = true, description = "US-1371 Provider Management - Account Registration and verifying foster parent", groups = { "High",
			"acisRegression", "Khushboo" },priority=2)
	public void createPlacementaccountApplicationFosterParent() throws AcisException, InterruptedException, IOException {

	
		String username = testData.get(Constants.AccountProviderManagemnt).get("fosterUsername");
		String password = testData.get(Constants.AccountProviderManagemnt).get("fosterPassword");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
System.out.println(password);
System.out.println(username);
		home.verfiyHomePage();

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();

		accountPage.loginToForestApplication(username, password);
		accountPage.fosterParentfields();
	}
}
