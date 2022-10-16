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

public class _1254_CompleteChildCarePlanTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1254_CompleteChildCarePlanTest.class);
	
	public _1254_CompleteChildCarePlanTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(enabled = true, description = "US-0001254 IN - Complete Child Care Plan", groups = { "Medium",
			"acisRegression", "Prateeksha" },priority=0)
	public void completeChildCarePlan() throws AcisException, InterruptedException, IOException, AWTException {
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
		
		//Portal
		completeChildCarePlan_Portal_page.completeChildCarePlanTab();
		completeChildCarePlan_Portal_page.checkTaskValue("Upload Documentation");
		completeChildCarePlan_Portal_page.CheckTaskOwnerValue(parentFirstName + " " + parentLastName);
		completeChildCarePlan_Portal_page.verifyStandardsMessage();
		completeChildCarePlan_Portal_page.documentType("Child Care Plan");
		completeChildCarePlan_Portal_page.clickAddFilesAndUpload(fileupload);
		completeChildCarePlan_Portal_page.allDocumentationUploaded("Yes");
		completeChildCarePlan_Portal_page.refreshPageAndWait(10);
		completeChildCarePlan_Portal_page.CheckTaskOwnerValue("ACIS Licensing Worker");
		completeChildCarePlan_Portal_page.checkTaskValue("Run Background Checks");
		
		//Switching to Licensing
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();
 
		//Licensing 
		completeChildCarePlanPage.completeChildCarePlanTab();
		completeChildCarePlanPage.CheckTaskOwnerValue("ACIS Licensing Worker");
		completeChildCarePlanPage.checkTaskValue("Run Background Checks");
		completeChildCarePlanPage.verifyStandardsMessage();
		completeChildCarePlanPage.verifyInstructionsMessage();
		completeChildCarePlanPage.backgroundCheckType("CPS History (with Results)");
		completeChildCarePlanPage.clickAddFilesAndUpload2(fileupload);
		completeChildCarePlanPage.results("Qualified");
		completeChildCarePlanPage.allDocumentationUploaded2("Yes");
		completeChildCarePlanPage.checkTaskValue("Confirm Standards Met");
		completeChildCarePlanPage.isThereAnAppropriateChildCarePlan("Yes");
		completeChildCarePlanPage.clickSaveButton();
		completeChildCarePlanPage.selectStandardsMetValue("Meets");
		completeChildCarePlanPage.checkTaskValue("Completed");
		
		//BackTracking
		completeChildCarePlanPage.selectStandardsMetValue("--None--");
		completeChildCarePlanPage.isThereAnAppropriateChildCarePlan("--None--");
		completeChildCarePlanPage.clickSaveButton();
		completeChildCarePlanPage.checkTaskValue("Confirm Standards Met");
		completeChildCarePlanPage.allDocumentationUploaded2("No");
		completeChildCarePlanPage.refreshPageAndWait(10);
		completeChildCarePlanPage.checkTaskValue("Run Background Checks");
		completeChildCarePlanPage.allDocumentationUploaded2("Yes");
		completeChildCarePlanPage.checkTaskValue("Confirm Standards Met"); 
		completeChildCarePlanPage.isThereAnAppropriateChildCarePlan("Yes");
		completeChildCarePlanPage.clickSaveButton();
		completeChildCarePlanPage.selectStandardsMetValue("Meets");
		completeChildCarePlanPage.checkTaskValue("Completed");

		
	}
}



