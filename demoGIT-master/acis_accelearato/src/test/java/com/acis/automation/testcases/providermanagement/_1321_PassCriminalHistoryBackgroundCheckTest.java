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

public class _1321_PassCriminalHistoryBackgroundCheckTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1321_PassCriminalHistoryBackgroundCheckTest.class);
	
	public _1321_PassCriminalHistoryBackgroundCheckTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(enabled = true, description = "US-0001321 IN Feedback - Update Criminal History Licensing Activity", groups = { "High",
			"acisRegression", "Prateeksha" },priority=0)
	public void passCriminalHistoryBackgroungCheck() throws AcisException, InterruptedException, IOException, AWTException {
		
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
		//accountPage.enterUsernamePassword("ls0fbp5yo6@greencafe24.com","Acis@12345");
		licensingApplicationPortalPage.clickLicenseActivitiesTab();	
		
		//Portal
		passCriminalHistoryBackgroundCheckForm_Portal_Page.clickPassCriminalHistoryBackgroundCheckFormTab();
		passCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskValue("Upload Documentation");
		passCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
		//passCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskOwnerValue("Peter Lukie");
		passCriminalHistoryBackgroundCheckForm_Portal_Page.verifyStandardsMessage();
		passCriminalHistoryBackgroundCheckForm_Portal_Page.verifyInstructionsMessage();
		passCriminalHistoryBackgroundCheckForm_Portal_Page.clickAddFilesAndUpload(fileupload);
		passCriminalHistoryBackgroundCheckForm_Portal_Page.refreshPageAndWait(15);
		passCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskValue("Run Background Checks");
		passCriminalHistoryBackgroundCheckForm_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
		
		//Switching to Licensing
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		//homePage_SFDCPage.searchRecordAndClick("Peter Lukie");
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();
 
		//Licensing 
		passCriminalHistoryBackgroundCheckPage.clickPassCriminalHistoryBackgroundCheckFormTab();
		passCriminalHistoryBackgroundCheckPage.checkTaskValue("Run Background Checks");
		passCriminalHistoryBackgroundCheckPage.checkTaskOwnerValue("ACIS Licensing Worker");
		passCriminalHistoryBackgroundCheckPage.verifyrunBackgroundCheckInstruction();
		passCriminalHistoryBackgroundCheckPage.clickAddFilesAndUpload2(fileupload);
		passCriminalHistoryBackgroundCheckPage.clickOnResults("History Found");
		passCriminalHistoryBackgroundCheckPage.refreshPageAndWait(15);
		passCriminalHistoryBackgroundCheckPage.checkTaskValue("Confirm Standards Met");
		passCriminalHistoryBackgroundCheckPage.checkTaskOwnerValue("ACIS Licensing Worker");
		passCriminalHistoryBackgroundCheckPage.verifyconfirmStandardsInstruction();
		passCriminalHistoryBackgroundCheckPage.questionRelatedToApplicant_A("Yes");
		passCriminalHistoryBackgroundCheckPage.questionRelatedToOtherHouseholdMembers("Yes");
		passCriminalHistoryBackgroundCheckPage.selectStandardsMetValue("Meets");
		passCriminalHistoryBackgroundCheckPage.refreshPageAndWait(15);
		passCriminalHistoryBackgroundCheckPage.checkTaskValue("Completed");
		//BackTracking
		passCriminalHistoryBackgroundCheckPage.selectStandardsMetValue("--None--");
		passCriminalHistoryBackgroundCheckPage.refreshPageAndWait(15);
		passCriminalHistoryBackgroundCheckPage.checkTaskValue("Confirm Standards Met");
		passCriminalHistoryBackgroundCheckPage.deleteRunBackgroundCheckFile();
		passCriminalHistoryBackgroundCheckPage.refreshPageAndWait(15);
		passCriminalHistoryBackgroundCheckPage.checkTaskValue("Run Background Checks");
		passCriminalHistoryBackgroundCheckPage.verifyrunBackgroundCheckInstruction();
		passCriminalHistoryBackgroundCheckPage.clickAddFilesAndUpload2(fileupload);
		passCriminalHistoryBackgroundCheckPage.clickOnResults("History Found");
		passCriminalHistoryBackgroundCheckPage.selectStandardsMetValue("Meets");
		passCriminalHistoryBackgroundCheckPage.refreshPageAndWait(15);
		passCriminalHistoryBackgroundCheckPage.checkTaskValue("Completed");
		
	}
}



