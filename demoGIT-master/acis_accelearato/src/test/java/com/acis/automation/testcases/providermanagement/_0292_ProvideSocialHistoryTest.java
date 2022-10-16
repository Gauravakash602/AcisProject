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
import com.acis.automation.pages.licensingactivities.ProvideSocialHistoryPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class _0292_ProvideSocialHistoryTest extends TestBase {

	public _0292_ProvideSocialHistoryTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(description = "S-0292 - Provide Social History", groups = { "High",
			"acisRegression", "swati" },priority=0)
	public void provideSocialHistory() throws AcisException, InterruptedException, IOException, AWTException {
		
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
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		//Portal
		provideSocialHistory_Portal_Page.provideSocialHistoryTab();
		provideSocialHistory_Portal_Page.checkTaskValue("Upload Documentation");
		provideSocialHistory_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
		provideSocialHistory_Portal_Page.verifyStandardsMessage();
		
		//Switching to Licensing
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		//Licensing 
		provideSocialHistoryPage.provideSocialHistoryPageTab();
		provideSocialHistoryPage.checkTaskOwnerValue("ACIS Licensing Worker");
		provideSocialHistoryPage.checkTaskValue("Upload Documentation");
		provideSocialHistoryPage.verifyInstructionsMessage();
		provideSocialHistoryPage.clickAddFilesAndUpload(fileupload);
		provideSocialHistoryPage.checkbox();
		provideSocialHistoryPage.refreshPageAndWait(10);
		provideSocialHistoryPage.checkTaskValue("Review/Sign Home Study");
		provideSocialHistoryPage.clickAddFilesAndUpload2(fileupload);
		provideSocialHistoryPage.refreshPageAndWait(10);
		provideSocialHistoryPage.checkTaskValue("Confirm Standards Met");
		provideSocialHistoryPage.EnterDate();
		provideSocialHistoryPage.selectStandardsMet("Meets");
		provideSocialHistoryPage.clickSaveButton();
		provideSocialHistoryPage.checkTaskValue("Completed");
		
		
		
	}
}




