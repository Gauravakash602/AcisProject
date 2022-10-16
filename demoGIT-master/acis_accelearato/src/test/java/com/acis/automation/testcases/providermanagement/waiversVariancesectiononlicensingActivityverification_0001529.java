package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class waiversVariancesectiononlicensingActivityverification_0001529 extends TestBase {

	public waiversVariancesectiononlicensingActivityverification_0001529() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	
	@Test(enabled=false,description = "US0001529 :waiver and variance section verification", groups = { "High",
			"acisRegression", "sankari" },priority=0)
	public void waiverandvariancesectionVerification_LW() throws AcisException, InterruptedException, IOException, AWTException {
	
	loginTest.login("LicesningWorker");
		
		
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
//		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		homePage_SFDCPage.searchRecordAndClick("Jacinto Gottlieb");	
		
		licensingApplicationPage.clickLicenseActivitiesTab(); 
		
	        	// Licensing Activity 15 : Complete Medical Training
				completeMedicalTrainingPage.licensingActivityName();
				completeMedicalTrainingPage.standardsMet("Does Not Meet");
				licensingApplicationPage.WaiverandVarianceSection_labelverification();
				licensingApplicationPage.COWaiverandVarianceSection_labelverification();
			   //meetHomeSafetyStandardspage.clickSaveButton();
				completeMedicalTrainingPage.closeLicensingActivityTab();
				licensingApplicationPage.CloseLicensingActivitiesTab();
				licensingApplicationPage.clickLicenseActivitiesTab(); 
				
				// Licensing Activity 9 : Access to Safe Water
				accessToSafeWaterPage.clickAccessToSafeWaterTab();
				accessToSafeWaterPage.selectStandardsMetValue("Does Not Meet");	
				//meetHomeSafetyStandardspage.clickSaveButton();
				licensingApplicationPage.VarianceSection_labelverification();
				licensingApplicationPage.COVarianceSection_labelverification();
				accessToSafeWaterPage.closeLicensingActivityTab();
				licensingApplicationPage.CloseLicensingActivitiesTab();
				licensingApplicationPage.clickLicenseActivitiesTab(); 
				
				// Licensing Activity 17 : Obtain Medical Clearance
				obtainMedicalClearancePage.obtainMedicalClearancePageTab();
				obtainMedicalClearancePage.selectStandardsMet("Does Not Meet");
				licensingApplicationPage.WaiverSection_labelverification();
				licensingApplicationPage.COWaiverSection_labelverification();
				//meetHomeSafetyStandardspage.clickSaveButton();
				obtainMedicalClearancePage.closeLicensingActivityTab();
				licensingApplicationPage.CloseLicensingActivitiesTab();
				licensingApplicationPage.clickLicenseActivitiesTab(); 
			
				// Licensing Activity 18 : Receive References
				receiveReferencesPage.receiveReferenceTab();
				receiveReferencesPage.selectStandardsMetValue("Does Not Meet");
				licensingApplicationPage.WaiverSection_labelverification();
				licensingApplicationPage.COWaiverSection_labelverification();
			//	meetHomeSafetyStandardspage.clickSaveButton();
				receiveReferencesPage.closeLicensingActivityTab();
				licensingApplicationPage.CloseLicensingActivitiesTab();
				licensingApplicationPage.clickLicenseActivitiesTab();
				
				// Licensing Activity 13 : Meet Home Safety Standards
				meetHomeSafetyStandardspage. meetHomeSafetyStandardPageTab();
				meetHomeSafetyStandardspage.selectStandardsMet("Does Not Meet");	
				licensingApplicationPage.WaiverSection_labelverification();
				licensingApplicationPage.COWaiverSection_labelverification();
				//meetHomeSafetyStandardspage.clickSaveButton();
				meetHomeSafetyStandardspage.closeLicensingActivityTab();
				licensingApplicationPage.CloseLicensingActivitiesTab();
				licensingApplicationPage.clickLicenseActivitiesTab();
			
				// Licensing Activity 14 : Complete Pre-Service Training
				completePreServiceTrainingPages.completePreServiceTrainingTab();
				completePreServiceTrainingPages.selectStandardsMetValue("Does Not Meet");
				licensingApplicationPage.WaiverSection_labelverification();
				licensingApplicationPage.COWaiverSection_labelverification();
				//meetHomeSafetyStandardspage.clickSaveButton();
				completePreServiceTrainingPages.closeLicensingActivityTab();
				licensingApplicationPage.CloseLicensingActivitiesTab();
				licensingApplicationPage.clickLicenseActivitiesTab(); 

}
	
	@Test(enabled=true,description = "US0001529 :waiver and variance section verification", groups = { "High",
			"acisRegression", "sankari" },priority=0)
	public void UpdateWaiverandVariance() throws AcisException, InterruptedException, IOException, AWTException {
	
	loginTest.login("Admin");
		
		
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
//		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		homePage_SFDCPage.searchRecordAndClick("Paula Darren &" + " " + "Joseph Darren");	
		
		licensingApplicationPage.clickLicenseActivitiesTab(); 
		LicensingActivitiesCompletion.LicensingActivitiesCompletionwithWaiverandVariance_SingleApplicant();
		homePage_SFDCPage.logoutUser();
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick("Paula  Darren &" + " " + "Joseph  Darren");
		
		licensingApplicationPage.WaiverandVarianceSelection_applicationlevel("Paula  Darren &" + " " + "Joseph  Darren");
		
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.selectLicensingRecommendation("Approve License");

		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser(); 
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick("Paula  Darren &" + " " + "Joseph  Darren");
		licensingApplicationPage.Review_modification_Method2();
		licensingApplicationPage.ReviewModification_submitbutton();
		licensingApplicationPage.endorseToCO();
		homePage_SFDCPage.logoutUser(); 
		loginTest.login("CentralOfficeWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick("Paula  Darren &" + " " + "Joseph  Darren");
		licensingApplicationPage.Review_modification_Method1();
	
		licensingApplicationPage.approveWaiverandVariance();
		licensingApplicationPage.ReviewModification_submitbutton();
		licensingApplicationPage.AcceptLicensingApplication();
		licensingApplicationPage.checkStatus("Approved");
		
		
	}
}
