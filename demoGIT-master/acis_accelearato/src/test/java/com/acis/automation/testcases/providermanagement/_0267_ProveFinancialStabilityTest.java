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

public class _0267_ProveFinancialStabilityTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_0267_ProveFinancialStabilityTest.class);

	public _0267_ProveFinancialStabilityTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
String parentFirstName , parentLastName;
	@Test(enabled = true, description = "S-0267 - IN - Prove Financial Stability", groups = { "Medium",
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
			proveFinancialStability_Portal_Page.clickLicenseActivitiesTab();
			proveFinancialStability_Portal_Page.verifyStandardsMessage();
			proveFinancialStability_Portal_Page.verifyInstructionsMessage();
			proveFinancialStability_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
//			proveFinancialStability_Portal_Page.checkTaskOwnerValue("Yusuf Pathan");
			proveFinancialStability_Portal_Page.checkTaskValue("Upload Documentation");
			proveFinancialStability_Portal_Page.documentType("Financial Verification for Foster Family Homes (SF 55734)");
			proveFinancialStability_Portal_Page.clickAddFilesAndUpload(fileupload);
			proveFinancialStability_Portal_Page.documentType("Financial Verification Document");
			proveFinancialStability_Portal_Page.clickAddFilesAndUpload(fileupload);
			proveFinancialStability_Portal_Page.allDocuments("Yes");
			proveFinancialStability_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
			proveFinancialStability_Portal_Page.checkTaskValue("Confirm Standards Met");
			accountPage.switchApplication();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
//			homePage_SFDCPage.searchRecordAndClick("Yusuf Pathan");
			licensingApplicationPage.clickLicenseActivitiesTab();
			proveFinancialStabilityPage.clickLicenseActivitiesTab();
			proveFinancialStabilityPage.verifyStandardsMessage();
			proveFinancialStabilityPage.verifyInstructionsMessage();
			proveFinancialStabilityPage.checkTaskValue("Confirm Standards Met");
			proveFinancialStabilityPage.checkTaskOwnerValue("ACIS Licensing Worker");
			proveFinancialStabilityPage.editStandards();
			proveFinancialStabilityPage.enterIncome("Income","2000");
			proveFinancialStabilityPage.enterIncome("Expenses","200");
			proveFinancialStabilityPage.monthlyIncomeCoversExpensesdebts("Yes"); 
			proveFinancialStabilityPage.applicant1SignatureDate();
			proveFinancialStabilityPage.saveButton();
			proveFinancialStabilityPage.standardsMet("Meets");
			proveFinancialStabilityPage.checkTaskValue("Completed");
			proveFinancialStabilityPage.standardsMet("None");
			proveFinancialStabilityPage.checkTaskValue("Confirm Standards Met");
			proveFinancialStabilityPage.standardsMet("Meets");
			proveFinancialStabilityPage.checkTaskValue("Completed");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000117 IN - Prove Financial Stability");
		}
		
	}
}