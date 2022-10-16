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

public class _1233_AgreetoResourceParentRolesandResponsibilitiesTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1233_AgreetoResourceParentRolesandResponsibilitiesTest.class);
	
	public _1233_AgreetoResourceParentRolesandResponsibilitiesTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(enabled = true, description = "US-0001233 - Agree to Resource Parent Roles and Responsibilities", groups = { "Medium",
			"acisRegression", "Prateeksha" },priority=0)
	public void agreetoResourceParentRolesandResponsibilities() throws AcisException, InterruptedException, IOException, AWTException {
		
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
		
		String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
		
		
		

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
				home.verfiyHomePage();
				
					
		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword(userName, password);	
		licensingApplicationPortalPage.clickLicenseActivitiesTab();		
		agreetoResourceParentRolesandResponsibilities_Portal_Page.agreetoResourceParentRolesandResponsibilitiesTab();
		agreetoResourceParentRolesandResponsibilities_Portal_Page.checkTaskValue("Upload Documentation");
		agreetoResourceParentRolesandResponsibilities_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
		agreetoResourceParentRolesandResponsibilities_Portal_Page.verifyStandardsMessage();
		agreetoResourceParentRolesandResponsibilities_Portal_Page.verifyInstructionsMessage();
		agreetoResourceParentRolesandResponsibilities_Portal_Page.clickAddFilesAndUpload(fileupload);
		agreetoResourceParentRolesandResponsibilities_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
		agreetoResourceParentRolesandResponsibilities_Portal_Page.checkTaskValue("Confirm Standards Met");

		
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();

		
		agreetoResourceParentRolesandResponsibilitiesPage.agreetoResourceParentRolesandResponsibilitiesTab();
		agreetoResourceParentRolesandResponsibilitiesPage.checkTaskValue("Confirm Standards Met");
		agreetoResourceParentRolesandResponsibilitiesPage.checkTaskOwnerValue("ACIS Licensing Worker");
		agreetoResourceParentRolesandResponsibilitiesPage.verifyStandarsMessage();
		agreetoResourceParentRolesandResponsibilitiesPage.verifyInstructionsMessage();
		agreetoResourceParentRolesandResponsibilitiesPage.applicant_A_AcknowledgesTheirRole("Yes");
		agreetoResourceParentRolesandResponsibilitiesPage.clickSaveButton();
		agreetoResourceParentRolesandResponsibilitiesPage.selectApplicantAValue();
		agreetoResourceParentRolesandResponsibilitiesPage.clickSaveButton();
		agreetoResourceParentRolesandResponsibilitiesPage.selectStandardsMetValue("Meets");
		agreetoResourceParentRolesandResponsibilitiesPage.checkTaskValue("Completed");
		agreetoResourceParentRolesandResponsibilitiesPage.selectStandardsMetValue("--None--");
		agreetoResourceParentRolesandResponsibilitiesPage.checkTaskValue("Confirm Standards Met");
		agreetoResourceParentRolesandResponsibilitiesPage.selectStandardsMetValue("Meets");
		agreetoResourceParentRolesandResponsibilitiesPage.checkTaskValue("Completed");

		
	}
}



