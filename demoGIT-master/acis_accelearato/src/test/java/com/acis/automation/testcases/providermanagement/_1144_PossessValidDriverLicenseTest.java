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

public class _1144_PossessValidDriverLicenseTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1144_PossessValidDriverLicenseTest.class);

	public _1144_PossessValidDriverLicenseTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
String parentFirstName , parentLastName;
	@Test(enabled = true, description = "US-0001144 IN - Possess Valid Driver License", groups = { "High",
			"acisRegression", "Dharmesh" },priority=0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException, AWTException {
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		String parentFirstName = faker.name().firstName();
		String parentLastName = faker.name().lastName();
		String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String phone = excel
				.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"), 5);
		
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

			home.verfiyHomePage();

//			home.verfiyHomePage();
//			homePage_SFDCPage.closeTabs();
//			homePage_SFDCPage.clickDownArrowHome();
//			accountPage.swiitchEmailpage();
//			accountPage.swiitchInquiryPage();
//			fosterParentInquiryFormPage.verifyFirstLast();
//			fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
//			fosterParentInquiryFormPage.setParent1LastName(parentLastName);
//			fosterParentInquiryFormPage.setDatewithData(setdate);
//		
//			fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
//			fosterParentInquiryFormPage.setParent1EmailAddress();
//			fosterParentInquiryFormPage.setenterParent2FirstName("abc");
//			fosterParentInquiryFormPage.clickOnPhoneRadioButton();
//			fosterParentInquiryFormPage.clickNextButton();
//			fosterInquirySecondPage.selectAddress("Jackson, MS, USA");
//			fosterInquirySecondPage.selectFosterCheckBox();
//			fosterInquirySecondPage.selectNext();
//			fosterInquirySecondPage.selectFinishCheckBox();
//
//
//			driver.close();
//			accountPage.switchApplication();
//
//			
//
//			home.verfiyHomePage();
//
//			homePage_SFDCPage.closeTabs();
//			accountPage.clickingFosterInquiry(prospective);
//			accountPage.selectAll();
//			accountPage.changingStatus();
//			accountPage.swiitchToEmailLast();
//			accountPage.copyStringUrl();
//			accountPage.usernamePasswordforFosterParent("Acis@123456");
//			portalPage.clickNext();
//			portalPage.clickNext();
//			portalPage.clickSubmitButton();
//			accountPage.swiitchToEmailLast();
//			licensingApplicationPortalPage.clickLicenseActivitiesTab();
//			possessValidDriverLicense_Portal_Page.clickLicenseActivitiesTab();
//			possessValidDriverLicense_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
//			possessValidDriverLicense_Portal_Page.checkTaskOwnerValue("Park Linkens");
//			possessValidDriverLicense_Portal_Page.checkTaskValue("Upload Documentation");
//			possessValidDriverLicense_Portal_Page.selectAbleToDriveType("Yes");
//			possessValidDriverLicense_Portal_Page.clickAddFilesAndUpload(fileupload);
//			possessValidDriverLicense_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
//			possessValidDriverLicense_Portal_Page.checkTaskValue("Confirm Standards Met");
//			accountPage.switchApplication();
			accountPage.switchLoginPage();
			accountPage.enterUsernamePassword("yulmesespa@biyac.com", "Acis@123456");
			licensingApplicationPortalPage.clickLicenseActivitiesTab();
			possessValidDriverLicense_Portal_Page.clickLicenseActivitiesTab();
			possessValidDriverLicense_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
			possessValidDriverLicense_Portal_Page.checkTaskValue("Upload Documentation");
			possessValidDriverLicense_Portal_Page.clickAddFilesAndUpload(fileupload);
			possessValidDriverLicense_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
			possessValidDriverLicense_Portal_Page.checkTaskValue("Confirm Standards Met");
			accountPage.switchApplication();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
//			homePage_SFDCPage.searchRecordAndClick("Park Linkens");
			licensingApplicationPage.clickLicenseActivitiesTab();
			possessValidDriverLicensePage.clickLicenseActivitiesTab();
			possessValidDriverLicensePage.checkTaskValue("Confirm Standards Met");
			possessValidDriverLicensePage.checkTaskOwnerValue("ACIS Licensing Worker");
			possessValidDriverLicensePage.editStandards();
			possessValidDriverLicensePage.selectApplicantALicense("Yes");
			possessValidDriverLicensePage.selectApplicantBLicense("Yes");
			possessValidDriverLicensePage.selectOther("Yes");
			possessValidDriverLicensePage.clickSaveButton();
			possessValidDriverLicensePage.selectStandardsMet("Meets");
			possessValidDriverLicensePage.editStandards();
			possessValidDriverLicensePage.selectApplicantALicense("None");
			possessValidDriverLicensePage.checkTaskValue("Confirm Standards Met");
			possessValidDriverLicensePage.editStandards();
			possessValidDriverLicensePage.selectApplicantALicense("Yes");
			possessValidDriverLicensePage.checkTaskValue("Completed");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0001144 IN - Possess Valid Driver License");
		}
		
	}
}