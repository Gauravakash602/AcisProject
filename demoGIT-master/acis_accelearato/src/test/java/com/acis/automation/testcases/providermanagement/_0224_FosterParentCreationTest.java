package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
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
import com.github.javafaker.Faker;

public class _0224_FosterParentCreationTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_0224_FosterParentCreationTest.class);

	public _0224_FosterParentCreationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String parentFirstName , parentLastName;
	
	/*This is Foster Creation Account Test : Moved to Basic Checkout Script*/
	
	@Test(enabled = false, description = "US-0224 Provider Management - Account Registration - Portal Registration Page", groups = { "High",
			"acisRegression", "Akash" },priority=0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException, AWTException {
		String parentFirstName = faker.name().firstName();
		String parentLastName = faker.name().lastName();
		String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String phone = excel
				.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"), 5);
		String email;
		String fosterParentInquiryID;
		
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			email=accountPage.swiitchEmailpage();
			accountPage.swiitchInquiryPage();
			fosterParentInquiryFormPage.verifyFirstLast();
			fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
			fosterParentInquiryFormPage.setParent1LastName(parentLastName);
			fosterParentInquiryFormPage.setDatewithData(setdate);
			fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
			fosterParentInquiryFormPage.setParent1EmailAddress();
//			fosterParentInquiryFormPage.setenterParent2FirstName("abc");
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
			fosterParentInquiryID = accountPage.getFosterParentInquiryID();
			accountPage.changingStatus();
			accountPage.swiitchToEmailLast();
			accountPage.copyStringUrl();
			accountPage.usernamePasswordforFosterParent("Acis@123456");
			portalPage.clickNext();
			portalPage.clickNext();
			portalPage.clickSubmitButton();
			homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH,
					Constants.FosterParentID_SHEET, 1, "userName", 0, email, 1);
			homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH,
					Constants.FosterParentID_SHEET, 2, "password", 0, "Acis@123456", 1);
			homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH,
					Constants.FosterParentID_SHEET, 3, "firstName", 0, parentFirstName, 1);
			homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH,
					Constants.FosterParentID_SHEET, 4, "lastName", 0,parentLastName, 1);
			homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH,
					Constants.FosterParentID_SHEET, 5, "fosterParentInquiryID", 0,fosterParentInquiryID, 1);
		
			/* Initializing excel data again */
			getCreatedData();
			System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("userName"));
			System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("password"));
			System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("firstName"));
			System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("lastName"));
			System.out.println(createdData.get(Constants.FosterParentID_SHEET).get("fosterParentInquiryID"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:301 Provider Management - Create Placement Resource Account and licensing Application");
		}
		
	}
}