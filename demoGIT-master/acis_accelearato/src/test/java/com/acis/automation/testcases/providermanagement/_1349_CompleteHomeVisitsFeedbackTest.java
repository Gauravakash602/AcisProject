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

public class _1349_CompleteHomeVisitsFeedbackTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1349_CompleteHomeVisitsFeedbackTest.class);
	//This testcase also includes US-0001238 Complete Home Visits- Household
	public _1349_CompleteHomeVisitsFeedbackTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(enabled = true, description = "US-0001349 - Complete Home Visits Feedback", groups = { "High",
			"acisRegression", "Prateeksha" },priority=0)
	public void CompleteHomeVisitsFeedback() throws AcisException, InterruptedException, IOException, AWTException {
		
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
		
		String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
		
		
		

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("'licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("'licensingWorkerPassword"));
		
		home.verfiyHomePage();
				
	//Switching to Portal Page			
		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword(userName, password);
		//accountPage.enterUsernamePassword("tuvwjhyamkusyw@solarunited.org","Acis@5678");	
		licensingApplicationPortalPage.clickLicenseActivitiesTab();		
		completeHomeVisitFeedBack_Portal_Page.completeHomeVisitsTab();
		completeHomeVisitFeedBack_Portal_Page.checkTaskValue("Document Home Visits");
		completeHomeVisitFeedBack_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
		
	//Switching to Licensing Activity page
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		//homePage_SFDCPage.searchRecordAndClick("Stuart Little");
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();
 		completeHomeVisitFeedbackPage.completeHomeVisitsTab();
		completeHomeVisitFeedbackPage.checkTaskValue("Document Home Visits");
		completeHomeVisitFeedbackPage.checkTaskOwnerValue("ACIS Licensing Worker");
		completeHomeVisitFeedbackPage.verifyStandardsMessage();
		completeHomeVisitFeedbackPage.verifyInstructionsMessage();
		
		//Upload Documentation
		completeHomeVisitFeedbackPage.clickOnPerson("Person Name","Stuart Little","Stuart  Little Home");
		completeHomeVisitFeedbackPage.documentType("SAFE Questionnaire I");
		completeHomeVisitFeedbackPage.uploadDate();
		completeHomeVisitFeedbackPage.clickAddFilesAndUpload(fileupload);

	
		completeHomeVisitFeedbackPage.clickOnPerson("Person Name","Stuart Little","Stuart  Little Home");
		completeHomeVisitFeedbackPage.documentType("SAFE Questionnaire II");
		completeHomeVisitFeedbackPage.uploadDate();
		completeHomeVisitFeedbackPage.clickAddFilesAndUpload(fileupload);

		
		completeHomeVisitFeedbackPage.clickOnPerson("Person Name Home","Stuart Little","Stuart  Little Home");
		completeHomeVisitFeedbackPage.documentType("SAFE Questionnaire I");
		completeHomeVisitFeedbackPage.uploadDate();
		completeHomeVisitFeedbackPage.clickAddFilesAndUpload(fileupload);

		
		completeHomeVisitFeedbackPage.clickOnPerson("Person Name Home","Stuart Little","Stuart  Little Home");
		completeHomeVisitFeedbackPage.documentType("SAFE Questionnaire II");
		completeHomeVisitFeedbackPage.uploadDate();
		completeHomeVisitFeedbackPage.clickAddFilesAndUpload(fileupload);

		
		completeHomeVisitFeedbackPage.clickOnPerson("Person Name Home","Stuart Little","Stuart  Little Home");
		completeHomeVisitFeedbackPage.documentType("Adult Child SAFE Questionnaire");
		completeHomeVisitFeedbackPage.uploadDate();
		completeHomeVisitFeedbackPage.clickAddFilesAndUpload(fileupload);
		completeHomeVisitFeedbackPage.refreshPageAndWait(15);
		completeHomeVisitFeedbackPage.interaction();
		completeHomeVisitFeedbackPage.waitForPageLoadTill(20);
		//Switching to IFrame
		completeHomeVisitFeedbackPage.iframeSwitch();
		completeHomeVisitFeedbackPage.dateTime();
		completeHomeVisitFeedbackPage.attempt();
		completeHomeVisitFeedbackPage.selectType();
		completeHomeVisitFeedbackPage.selectSubType("Home Study Visit");
		completeHomeVisitFeedbackPage.narrative("Text");
		completeHomeVisitFeedbackPage.professionalOpinion("Text");
		completeHomeVisitFeedbackPage.participants();
		completeHomeVisitFeedbackPage.saveButton();
		completeHomeVisitFeedbackPage.confirmationMessage();
		//Switching back to Default Content
		completeHomeVisitFeedbackPage.switchToDefaultContent();
		completeHomeVisitFeedbackPage.switchTab();
		completeHomeVisitFeedbackPage.fosterParentsDeterminedAppropriate("Yes");
		completeHomeVisitFeedbackPage.clickSaveButton();
		completeHomeVisitFeedbackPage.didAllHouseholdMembersParticipate("Yes");
		completeHomeVisitFeedbackPage.ifNoWhoDidNotParticipateAndWhy("name");
		completeHomeVisitFeedbackPage.selectStandardsMetValue("Meets");
		completeHomeVisitFeedbackPage.refreshPageAndWait(15);
		completeHomeVisitFeedbackPage.checkTaskValue("Completed");
		//BackTracking
		completeHomeVisitFeedbackPage.selectStandardsMetValue("--None--");
		completeHomeVisitFeedbackPage.didAllHouseholdMembersParticipate("--None--");
		completeHomeVisitFeedbackPage.clickSaveButton();
		completeHomeVisitFeedbackPage.refreshPageAndWait(15);
		completeHomeVisitFeedbackPage.checkTaskValue("Confirm Standards Met");
		completeHomeVisitFeedbackPage.selectStandardsMetValue("Meets");
		completeHomeVisitFeedbackPage.didAllHouseholdMembersParticipate("Yes");
		completeHomeVisitFeedbackPage.clickSaveButton();
		completeHomeVisitFeedbackPage.refreshPageAndWait(15);
		completeHomeVisitFeedbackPage.checkTaskValue("Completed");
	}
}



