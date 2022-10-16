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

public class _1182_MeetAgeCitizenshipRequirementsTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1182_MeetAgeCitizenshipRequirementsTest.class);

	public _1182_MeetAgeCitizenshipRequirementsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
String parentFirstName , parentLastName;
	@Test(enabled = true, description = "US-0001182 IN - Meet Age & Citizenship Req", groups = { "Medium",
			"acisRegression", "Dharmesh" },priority=0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException, AWTException {
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
		
		String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

			home.verfiyHomePage();
			accountPage.switchLoginPage();
			accountPage.enterUsernamePassword(userName, password);
			licensingApplicationPortalPage.clickLicenseActivitiesTab();
			meetAgeCitizenshipRequirements_Portal_Page.clickLicenseActivitiesTab();
			meetAgeCitizenshipRequirements_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
			meetAgeCitizenshipRequirements_Portal_Page.checkTaskValue("Upload Documentation");
			meetAgeCitizenshipRequirements_Portal_Page.clickAddFilesAndUpload(fileupload);
			meetAgeCitizenshipRequirements_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
			meetAgeCitizenshipRequirements_Portal_Page.checkTaskValue("Confirm Standards Met");
			accountPage.switchApplication();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
//			homePage_SFDCPage.searchRecordAndClick("Sandra Thomas");
			licensingApplicationPage.clickLicenseActivitiesTab();
			meetAgeCitizenshipRequirementsPage.clickLicenseActivitiesTab();
			meetAgeCitizenshipRequirements_Portal_Page.checkTaskValue("Confirm Standards Met");
			meetAgeCitizenshipRequirementsPage.checkTaskOwnerValue("ACIS Licensing Worker");
			meetAgeCitizenshipRequirementsPage.clickAddFilesAndUpload(fileupload);
			meetAgeCitizenshipRequirementsPage.editStandards();
			meetAgeCitizenshipRequirementsPage.selectApplicantAAge("Yes");
			meetAgeCitizenshipRequirementsPage.selectApplicantACitizen("Yes");
			meetAgeCitizenshipRequirementsPage.selectApplicantBAge("Yes");
			meetAgeCitizenshipRequirementsPage.selectApplicantBCitizen("Yes");
			meetAgeCitizenshipRequirementsPage.clickSaveButton();
			meetAgeCitizenshipRequirementsPage.selectStandardsMet("Meets");
			meetAgeCitizenshipRequirementsPage.editStandards();
			meetAgeCitizenshipRequirementsPage.selectApplicantAAge("None");
			meetAgeCitizenshipRequirements_Portal_Page.checkTaskValue("Confirm Standards Met");
			meetAgeCitizenshipRequirementsPage.editStandards();
			meetAgeCitizenshipRequirementsPage.selectApplicantAAge("Yes");
			meetAgeCitizenshipRequirements_Portal_Page.checkTaskValue("Completed");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0001182 IN - Meet Age & Citizenship Req");
		}
		
	}
}