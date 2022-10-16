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
import com.acis.automation.pages.licensingactivities.ObtainMedicalClearancePage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class _0274_ObtainMedicalClearanceTest extends TestBase {

	public _0274_ObtainMedicalClearanceTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(description = "S-0274 - Obtain Medical Clearance", groups = { "High",
			"acisRegression", "swati" },priority=0)
	public void ObtainMedicalClearance() throws AcisException, InterruptedException, IOException, AWTException {
		
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
		obtainMedicalClearance_Portal_Page.obtainMedicalClearanceTab();
		obtainMedicalClearance_Portal_Page.checkTaskValue("Upload Documentation");
		obtainMedicalClearance_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
		obtainMedicalClearance_Portal_Page.verifyStandardsMessage();
		obtainMedicalClearance_Portal_Page.verifyInstructionsMessage();
		obtainMedicalClearance_Portal_Page.clickAddFilesAndUpload(fileupload);
		obtainMedicalClearance_Portal_Page.refreshPageAndWait(10);
		obtainMedicalClearance_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
		obtainMedicalClearance_Portal_Page.checkTaskValue("Confirm Standards Met");
		

		accountPage.switchApplication();
	
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();
		obtainMedicalClearancePage.obtainMedicalClearancePageTab();
		obtainMedicalClearancePage.refreshPageAndWait(10);
		obtainMedicalClearancePage.checkTaskOwnerValue("ACIS Licensing Worker");
		obtainMedicalClearancePage.checkTaskValue("Confirm Standards Met");
		obtainMedicalClearancePage.verifyStandardsMessage();
		obtainMedicalClearancePage.verifyInstructionsMessage();
		obtainMedicalClearancePage.meetmedicalrequirementsPerson1("Yes");
		obtainMedicalClearancePage.selectStandardsMet("Meets");
		obtainMedicalClearancePage.refreshPageAndWait(10);
		obtainMedicalClearancePage.checkTaskValue("Completed");
		
		
	}
}




