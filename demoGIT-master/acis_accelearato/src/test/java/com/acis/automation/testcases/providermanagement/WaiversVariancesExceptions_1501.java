package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class WaiversVariancesExceptions_1501 extends TestBase {

	public WaiversVariancesExceptions_1501() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	
	String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
	String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
	String parentHome = createdData.get(Constants.FosterParentID_SHEET).get("home");
	
	String parentLastNameGlobal = createdData.get(Constants.FosterParentID_SHEET).get("lastNameGlobal");
	
	
	
	// Completing All 21 Licensing Activites
	@Test(enabled=true, description = "S-1501 : Waivers/Variances/Exceptions", groups = { "High",
			"acisRegression", "Prateeksha" },priority=0)
	public void complete21LA() throws AcisException, InterruptedException, IOException, AWTException {
	
		loginTest.login("Admin");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		licensingApplicationPage.clickLicenseActivitiesTab(); 
		LicensingActivitiesCompletion.LicensingActivitiesCompletionwithoutWaiverandVariance_singleApplicant();
		homePage_SFDCPage.logoutUser();
	}
	
	
	//Completing 6 Licensing Activities with waiver and/or variance
	@Test(enabled=true,description = "S-1501 : Waivers/Variances/Exceptions", groups = { "High",
			"acisRegression", "Prateeksha" },priority=1)
	public void waiversVariancesExceptions() throws AcisException, Exception {
	
		loginTest.login("Admin");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		licensingApplicationPage.clickLicenseActivitiesTab(); 
		LicensingActivitiesCompletion.LicensingActivitiesCompletionwithWaiverandVariance_SingleApplicant();
		homePage_SFDCPage.logoutUser();
}
	
	
	//Adding waiver and/or variance on the Application Level
	@Test(enabled=true,description = "S-1501 : Waivers/Variances/Exceptions", groups = { "High",
			"acisRegression", "Prateeksha" },priority=2)
	public void addingWaiverVarianceOnApplicationLevel() throws AcisException, InterruptedException, IOException, AWTException {
	
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		
		//Selecting Variance on Application Level
		licensingApplicationPage.Requestmodification_clicknewbutton();
		licensingApplicationPage.recordTypeSelector("Variance");
		licensingApplicationPage.clickCreateRecord();
		licensingApplicationPage.selectPlacementResource(parentFirstName + " " + parentLastName);
		licensingApplicationPage.enterSummary("variance requested");
		licensingApplicationPage.clickOnSaveButton();
		licensingApplicationPage.closecurrenttab();
		
		//Selecting Waiver on Application Level
		licensingApplicationPage.Requestmodification_clicknewbutton();
		licensingApplicationPage.recordTypeSelector("Waiver");
		licensingApplicationPage.clickCreateRecord();
		licensingApplicationPage.selectPlacementResource(parentFirstName + " " + parentLastName);
		licensingApplicationPage.enterSummary("Waiver requested");
		licensingApplicationPage.clickOnSaveButton();
		licensingApplicationPage.closecurrenttab();

		licensingApplicationPage.Review_modification();
		
		//Verifying Waiver/Variance Section on Application Level
		licensingApplicationPage.verifySummary("Waiver requested");
		licensingApplicationPage.verifySummary("variance requested");
		
		//Verifying Waiver/Variance Section on Activity Level
		licensingApplicationPage.verifyWaiverVarianceAtActivityLevel("Yes"); 
		licensingApplicationPage.closecurrenttab();
		
		
		
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.selectLicensingRecommendation("Approve License");
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser();
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.Review_modification();
		licensingApplicationPage.endorseToCO();
		homePage_SFDCPage.logoutUser(); 
		loginTest.login("CentralOfficeWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.Review_modification();
		licensingApplicationPage.approveWaiverandVariance();
		licensingApplicationPage.ReviewModification_submitbutton();
		licensingApplicationPage.AcceptLicensingApplication();
		licensingApplicationPage.checkStatus("Approved");
		
	}
	
	
	//Adding a revision to a placement resource and Submit to Supervisor
	@Test(enabled=true,description = "S-1501 : Waivers/Variances/Exceptions", groups = { "High",
			"acisRegression", "Prateeksha" },priority=3)
	public void waiverandvariancesectionVerification_LW() throws AcisException, InterruptedException, IOException, AWTException {
	
	loginTest.login("LicesningWorker");
	 homePage_SFDCPage.clickDownArrowAccount();
     homePage_SFDCPage.selectAllAccount();
     homePage_SFDCPage.searchGlobalAccountRecord(parentFirstName + " " +  parentLastNameGlobal + " " + parentHome);
     providerAgencyAccountPage.clickReviseLicense();
     providerAgencyAccountPage.createLicenseRevisionRecord("Voluntary Relinquishment");
     providerAgencyAccountPage.clickNextButton();
     providerAgencyAccountPage.clickOnFinish();
     providerAgencyAccountPage. clickRelatedTab();
     providerAgencyAccountPage.selectLicenseRevisionRecord();
     
     //Filling Request Modification field on License Revision
	licensingApplicationPage.Requestmodification_clicknewbutton();
	licensingApplicationPage.recordTypeSelector("Variance");
	licensingApplicationPage.clickCreateRecord();
	licensingApplicationPage.selectPlacementResource(parentFirstName + " " + parentLastName);
	licensingApplicationPage.enterSummary("variance requested");
	licensingApplicationPage.clickOnSaveButton();
	licensingApplicationPage.closecurrenttab(); 
	
	//Submitting to Supervisor
	licensingApplicationPage.clicksubmitButton();
	 providerAgencyAccountPage.clickNextButton();
	}
}
