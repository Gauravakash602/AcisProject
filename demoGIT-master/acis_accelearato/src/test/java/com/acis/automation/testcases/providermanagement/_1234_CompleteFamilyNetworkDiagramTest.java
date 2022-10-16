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

public class _1234_CompleteFamilyNetworkDiagramTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1234_CompleteFamilyNetworkDiagramTest.class);
	public _1234_CompleteFamilyNetworkDiagramTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	@Test(enabled = true,description = "US-0001234 - Complete Family Network Diagram", groups = { "Medium",
			"acisRegression", "Prateeksha" },priority=0)
	public void completeFamilyNetworkDiagramTest() throws AcisException, InterruptedException, IOException, AWTException {
		
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
				completeFamilyNetworkDiagram_Portal_Page.completeFamilyNetworkDiagramTab();
				completeFamilyNetworkDiagram_Portal_Page.checkTaskValue("Upload Documentation");
				completeFamilyNetworkDiagram_Portal_Page.checkTaskOwnerValue(parentFirstName + " " + parentLastName);
				completeFamilyNetworkDiagram_Portal_Page.verifyStandardsMessage();
				completeFamilyNetworkDiagram_Portal_Page.verifyInstructionsMessage();
				completeFamilyNetworkDiagram_Portal_Page.clickAddFilesAndUpload(fileupload);
				completeFamilyNetworkDiagram_Portal_Page.checkTaskValue("Confirm Standards Met");
				completeFamilyNetworkDiagram_Portal_Page.checkTaskOwnerValue("ACIS Licensing Worker");
				
				accountPage.switchApplication();
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowLicensingApplication();
				homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
				licensingApplicationPage.clickLicenseActivitiesTab();

				
		completeFamilyNetworkDiagramPage.completeFamilyNetworkDiagramTab();
		completeFamilyNetworkDiagramPage.checkTaskValue("Confirm Standards Met");
		completeFamilyNetworkDiagramPage.checkTaskOwnerValue("ACIS Licensing Worker");
		completeFamilyNetworkDiagramPage.verifyStandarsMessage();
		completeFamilyNetworkDiagramPage.verifyInstructionsMessage();
		//completeFamilyNetworkDiagramPage.familyNetworkDiagramprovidedbyhome("No");
		//completeFamilyNetworkDiagramPage.clickSaveButton();
		completeFamilyNetworkDiagramPage.selectStandardsMetValue("Meets");
		completeFamilyNetworkDiagramPage.checkTaskValue("Completed");
		completeFamilyNetworkDiagramPage.selectStandardsMetValue("--None--");
		completeFamilyNetworkDiagramPage.checkTaskValue("Confirm Standards Met");
		completeFamilyNetworkDiagramPage.selectStandardsMetValue("Meets");
		completeFamilyNetworkDiagramPage.checkTaskValue("Completed");
	}
}