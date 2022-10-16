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
import com.acis.automation.pages.licensingactivities.CompleteHomeVisitFeedbackPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class _1386_CompleteFosterParentAssessmentTest extends TestBase {
	
	final static Logger logger = LoggerFactory.getLogger(_1386_CompleteFosterParentAssessmentTest.class);
	
	public _1386_CompleteFosterParentAssessmentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(enabled = true, description = "US-0001386 IN - Complete Foster Parent Assessment", groups = { "High",
			"acisRegression", "Prateeksha" },priority=0)
	public void CompleteFosterParentAssessment() throws AcisException, InterruptedException, IOException, AWTException {
		
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
		
		String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
		

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
		testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
		home.verfiyHomePage();
				
	//Switching to Portal Page			
		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword(userName, password);
		//accountPage.enterUsernamePassword("ls0fbp5yo6@greencafe24.com","Acis@12345");	
		licensingApplicationPortalPage.clickLicenseActivitiesTab();		
		completeFosterParentAssessment_Portal_Page.clickCompleteFosterParentAssessmentTab();
		completeFosterParentAssessment_Portal_Page.checkTaskValue("Upload Documentation");
		completeFosterParentAssessment_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
		//completeFosterParentAssessment_Portal_Page.checkTaskOwnerValue("Peter Lukie");
		completeFosterParentAssessment_Portal_Page.verifyStandardsMessage();
		completeFosterParentAssessment_Portal_Page.verifyuploadDocumentationInstruction();
		completeFosterParentAssessment_Portal_Page.documentType("SAFE Compatibility Inventory");
		completeFosterParentAssessment_Portal_Page.clickAddFilesAndUpload(fileupload);
		completeFosterParentAssessment_Portal_Page.refreshPageAndWait(15);
		completeFosterParentAssessment_Portal_Page.checkTaskValue("Confirm Standards Met");
		completeFosterParentAssessment_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
		
	//Switching to Licensing Activity page
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		//homePage_SFDCPage.searchRecordAndClick("Peter Lukie");
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();
 	
		completeFosterParentAssessmentPage.clickCompleteFosterParentAssessmentTab();
		completeFosterParentAssessmentPage.checkTaskValue("Confirm Standards Met");
		completeFosterParentAssessmentPage.checkTaskOwnerValue("ACIS Licensing Worker");
		completeFosterParentAssessmentPage.selectStandardsMetValue("Meets");
		completeFosterParentAssessmentPage.checkTaskValue("Completed");
	//BackTracking
		completeFosterParentAssessmentPage.selectStandardsMetValue("--None--");
		completeFosterParentAssessmentPage.checkTaskValue("Confirm Standards Met");
		completeFosterParentAssessmentPage.selectStandardsMetValue("Meets");
		completeFosterParentAssessmentPage.checkTaskValue("Completed");
	}
}



