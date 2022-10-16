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
import com.acis.automation.pages.licensingactivities.ReceiveReferencesPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class _0277_ReceiveReferenceTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_0277_ReceiveReferenceTest.class);
	public _0277_ReceiveReferenceTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String parentFirstName , parentLastName;
	
	@Test(enabled = true, description = "S-0277 IN - Receive References", groups = { "Medium",
			"acisRegression", "Prateeksha" },priority=0)
	public void receiveReferences() throws AcisException, InterruptedException, IOException, AWTException {
		
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
	
		
		receiveReferences_Portal_Page.receiveReferencesTab();
		receiveReferences_Portal_Page.checkTaskValue("Contact References");
		receiveReferences_Portal_Page.checkTaskOwnerValue("ACIS Supervisor");
		
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();
		
	    receiveReferencesPage.receiveReferenceTab();
	    receiveReferencesPage.ChecktaskValue("Contact References");
	    receiveReferencesPage.CheckTaskOwnerValue("ACIS Supervisor");
	    receiveReferencesPage.verifyStandarsMessage();
	    receiveReferencesPage.InstructionMessage();
	    
	    receiveReferencesPage.addReference();
	    receiveReferencesPage.firstName("John");
	    receiveReferencesPage.save();
	    receiveReferencesPage.addReference();
	    receiveReferencesPage.firstName("Park");
	    receiveReferencesPage.save();
	    receiveReferencesPage.addReference();
	    receiveReferencesPage.firstName("Danial");
	    receiveReferencesPage.save();
	    receiveReferencesPage.addReference();
	    receiveReferencesPage.firstName("Lara");
	    receiveReferencesPage.save();
	    
	    
	    receiveReferencesPage.reference("John");
	    receiveReferencesPage.referenceFormReceived();
	    receiveReferencesPage.clickAddFilesAndUpload(fileupload);
	   
	    receiveReferencesPage.reference("Park");
	    receiveReferencesPage.referenceFormReceived();
	    receiveReferencesPage.clickAddFilesAndUpload(fileupload);
	  
	    receiveReferencesPage.reference("Danial");
	    receiveReferencesPage.referenceFormReceived();
	    receiveReferencesPage.clickAddFilesAndUpload(fileupload);
	   
	    receiveReferencesPage.reference("Lara");
	    receiveReferencesPage.referenceFormReceived();
	    receiveReferencesPage.clickAddFilesAndUpload(fileupload);
	    receiveReferencesPage.refreshPageAndWait(10);
	    receiveReferencesPage.ChecktaskValue("Confirm Standards Met");
	    receiveReferencesPage.minimalOfFourReferences("Yes");
	    receiveReferencesPage.clickSaveButton();
	   //receiveReferencesPage.referenceFormReceivedPerReference("Yes");
	   // receiveReferencesPage.clickSaveButton();
	    receiveReferencesPage.selectStandardsMetValue("Meets");
	    receiveReferencesPage.ChecktaskValue("Completed");
	    receiveReferencesPage.selectStandardsMetValue("--None--");
	    receiveReferencesPage.ChecktaskValue("Confirm Standards Met");
	    receiveReferencesPage.selectStandardsMetValue("Meets");
	    receiveReferencesPage.ChecktaskValue("Completed");
    
	}
}




