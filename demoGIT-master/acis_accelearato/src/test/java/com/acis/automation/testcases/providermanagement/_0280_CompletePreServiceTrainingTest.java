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

public class _0280_CompletePreServiceTrainingTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(_0280_CompletePreServiceTrainingTest.class);
	
	public _0280_CompletePreServiceTrainingTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(enabled = true, description = "S-0280 - Complete Pre Service Training", groups = { "Medium",
			"acisRegression", "Prateeksha" },priority=0)
	public void completePreServiceTrainingTest() throws AcisException, InterruptedException, IOException, AWTException {
		
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
			
				completePreServiceTraining_Portal_Page.completePreServiceTrainingTab();
				completePreServiceTraining_Portal_Page.checkTaskValue("Attend Resource and Adoptive Parent Training");
			    completePreServiceTraining_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
			
				accountPage.switchApplication();
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowLicensingApplication();
				homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
				licensingApplicationPage.clickLicenseActivitiesTab();

		completePreServiceTrainingPages.completePreServiceTrainingTab();
		completePreServiceTrainingPages.checkTaskOwnerValue("ACIS Licensing Worker");
		completePreServiceTrainingPages.checkTaskValue("Attend Resource and Adoptive Parent Training");
		completePreServiceTrainingPages.verifyStandarsMessage();
		completePreServiceTrainingPages.verifyInstructionsMessage();
		completePreServiceTrainingPages.trainingType("RAPT I Certificate");
		completePreServiceTrainingPages.selectDateAttendedValue();
		completePreServiceTrainingPages.clickAddFilesAndUpload(fileupload);
		completePreServiceTrainingPages.trainingType("RAPT II Certificate");
		completePreServiceTrainingPages.selectDateAttendedValue();
		completePreServiceTrainingPages.clickAddFilesAndUpload(fileupload);
		completePreServiceTrainingPages.trainingType("RAPT III Certificate");
		completePreServiceTrainingPages.selectDateAttendedValue();
		completePreServiceTrainingPages.clickAddFilesAndUpload(fileupload);
		completePreServiceTrainingPages.checkTaskValue("Confirm Standards Met");
		completePreServiceTrainingPages.applicantCompletedRapt("Yes");
		completePreServiceTrainingPages.clickSaveButton();
		completePreServiceTrainingPages.selectStandardsMetValue("Meets");
		completePreServiceTrainingPages.checkTaskValue("Completed");
		completePreServiceTrainingPages.selectStandardsMetValue("--None--");
		completePreServiceTrainingPages.checkTaskValue("Confirm Standards Met");
		completePreServiceTrainingPages.selectStandardsMetValue("Meets");
		completePreServiceTrainingPages.checkTaskValue("Completed");
	}
}