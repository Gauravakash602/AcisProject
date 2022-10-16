package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;

public class AccountRegistrationTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(AccountRegistrationTest.class);

	public AccountRegistrationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(enabled = true, description = "US-0224 Provider Management - Account Registration - Portal Registration Page", groups = { "High",
			"acisRegression", "Akash" },priority=0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		String parentFirstName = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("ParentFirstName"), 6);
		
		String parentLastName = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("ParentLastName"), 6);
		
		String phoneFirst = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("PhoneNoFirst"), 6);
		
	
		String email1 = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("emailFirst"), 6);
		

		String email2 = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("emailSecond"), 6);
		String parentTwoFirst = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("Parent2FirstName"), 6);
		String parentTwoLast = excel
				.generateRandomTestData(testData.get(Constants.AccountProviderManagemnt).get("Parent2LastName"), 6);
		String street1 = testData.get(Constants.AccountProviderManagemnt).get("street1");
		
		String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
		String city = testData.get(Constants.AccountProviderManagemnt).get("city");
		//String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String whatname = testData.get(Constants.AccountProviderManagemnt).get("whatname");
		String zip = testData.get(Constants.AccountProviderManagemnt).get("zip");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));

		home.verfiyHomePage();

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		
		accountPage.swiitchInquiryPage();
		fosterParentInquiryFormPage.verifyFirstLast();
		fosterParentInquiryFormPage.setParent1FirstName("axzfe");
		fosterParentInquiryFormPage.setParent1LastName("aswef");
		fosterParentInquiryFormPage.setDatewithData(setdate);
	
		fosterParentInquiryFormPage.setParent1PhoneNumber("9720413814");
		fosterParentInquiryFormPage.setParent1EmailAddress("abcvc@xzyz.com");
		fosterParentInquiryFormPage.setenterParent2FirstName("ahoas");
		fosterParentInquiryFormPage.setParent2LastName("zdsdsd");
		fosterParentInquiryFormPage.setParent2EmailAddress("ajoc@oaiu.com");
		fosterParentInquiryFormPage.clickNextButton();
		fosterInquirySecondPage.enterText("street1", street1);
		fosterInquirySecondPage.enterText("city", city);
		fosterInquirySecondPage.provideState("California");
		fosterInquirySecondPage.providCountry("Allen");

		fosterInquirySecondPage.enterText("zip", zip);
		fosterInquirySecondPage.selectCheckBox();
		fosterInquirySecondPage.alreadyTalk("Yes");
		fosterInquirySecondPage.enterText("ifSo", whatname);
		fosterInquirySecondPage.selectNext();
		fosterInquirySecondPage.clickRegisterNext();

	

	

	}
	@Test(enabled = true, description = "US-0224 Provider Management - Account Registration - coming banck to application", groups = { "High",
			"acisRegression", "Akash" },priority=1)
	public void createPlacementaccountApplication() throws AcisException, InterruptedException, IOException {

	
		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String convertYes = testData.get(Constants.AccountProviderManagemnt).get("convertYes");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));

		home.verfiyHomePage();

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		accountPage.fosterParentAccountLink();
		//Relative Foster :Treatment Foster :Regular Foster
		accountPage.placement("Relative Foster");
		accountPage.verifyStatusConverttoPerson(convertYes);
		
	



	

	}
	@Test(enabled = false, description = "US-0224 Provider Management - Account Registration and verifying foster parent", groups = { "High",
			"acisRegression", "Akash" },priority=2)
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
		
}}
