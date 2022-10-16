package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1427_ApproveLicensingrecordwithwaiverORvarianceORExceptionRequestAsCO extends TestBase {

	public _1427_ApproveLicensingrecordwithwaiverORvarianceORExceptionRequestAsCO() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String parentFirstName = faker.name().firstName();
	String parentLastName = faker.name().lastName();
	String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
	String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
	String phone = excel.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"), 5);
	String email;

	

	@Test(enabled=false,description = "US-0001427 : Filling up Foster Parent Inquiry Form", groups = { "High",
			"acisRegression", "sankari" },priority=0)
	public void FillingupFosterParentInquiryForm() throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {
		
		loginTest.login("LicesningWorker");
	homePage_SFDCPage.clickDownArrowHome();
	email=accountPage.swiitchEmailpage();
		accountPage.swiitchInquiryPage();
		fosterParentInquiryFormPage.verifyFirstLast();
		fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
		fosterParentInquiryFormPage.setParent1LastName(parentLastName);
		fosterParentInquiryFormPage.setDatewithData(setdate);
		fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
		fosterParentInquiryFormPage.setParent1EmailAddress();
		fosterParentInquiryFormPage.clickNextButton();
		fosterInquirySecondPage.selectAddress("Jackson, MS, USA");
		fosterInquirySecondPage.selectFosterCheckBox();
		fosterInquirySecondPage.selectNext();
		fosterInquirySecondPage.selectFinishCheckBox();
		driver.close();
		accountPage.switchApplication();
		home.verfiyHomePage(); 
		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		accountPage.changingStatus(); 
		
		homePage_SFDCPage.closeTabs();
		
	/*	homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
	

	
		licensingApplicationPage.clicksubmit();
		
		licensingApplicationPage.closeSubmitWindow(); */
	}
	
	
	@Test(description = "US0001427 : Licensing activity completion", groups = { "High",
			"acisRegression", "sankari" },priority=1)
	public void Licensingactivitycompletion() throws AcisException, InterruptedException, IOException, AWTException {
	
	loginTest.login("Admin");
		
		
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
//		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		homePage_SFDCPage.searchRecordAndClick("Jacinto Gottlieb");	
		
		
		//System Admin
		licensingApplicationPage.clickLicenseActivitiesTab(); 
		
/*	// Licensing Activity 1 : Meet Age & Citizenship Requirements
		meetAgeCitizenshipRequirementsPage.clickLicenseActivitiesTab();
		meetAgeCitizenshipRequirementsPage.selectApplicantAAge("Yes");
		meetAgeCitizenshipRequirementsPage.selectApplicantACitizen("Yes");
		//meetAgeCitizenshipRequirementsPage.selectApplicantBAge("Yes");
		//meetAgeCitizenshipRequirementsPage.selectApplicantBCitizen("Yes");
		meetAgeCitizenshipRequirementsPage.selectStandardsMet("Meets");
	    meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
	    meetAgeCitizenshipRequirementsPage.clickSaveButton();
		meetAgeCitizenshipRequirementsPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		// Licensing Activity 2 : Possess Valid Driver License
		possessValidDriverLicensePage.clickLicenseActivitiesTab();
		possessValidDriverLicensePage.selectApplicantALicense("Yes");
		//possessValidDriverLicensePage.selectApplicantBLicense("Yes");
		possessValidDriverLicensePage.selectOther("Yes");
		possessValidDriverLicensePage.selectStandardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetAgeCitizenshipRequirementsPage.clickSaveButton();
		possessValidDriverLicensePage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
	// Licensing Activity 3 : Complete Child Care Plan
		completeChildCarePlanPage.completeChildCarePlanTab();
		completeChildCarePlanPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		completeChildCarePlanPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
		// Licensing Activity 4 : Pass CPS Background Check
		passCPSBackgroundCheckPage.licensingActivityName();
		passCPSBackgroundCheckPage.applicant_A_Indicated_perpetrator("Yes");
		//passCPSBackgroundCheckPage.applicant_B_Indicated_perpetrator("No");
		passCPSBackgroundCheckPage.OthersIndicatedPerpetrators("Yes");
		passCPSBackgroundCheckPage.standardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		passCPSBackgroundCheckPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		 //Licensing Activity 5 : Pass Fingerprint Background Check
		passFingerprintBackgroundCheckPage.passFingerprintBackgroundCheckPageTab();
		passFingerprintBackgroundCheckPage.applicantA("Yes");
	//	passFingerprintBackgroundCheckPage.applicantB("Yes");
		passFingerprintBackgroundCheckPage.othersIndicatedperpetrators("Yes");
		passFingerprintBackgroundCheckPage.selectStandardsMet("Has Concerns");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		passFingerprintBackgroundCheckPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		 //Licensing Activity 6 : Pass Sex/Violent Offender Background Check
		passSexViolentOffenderBackgroundCheckPage.clickPassSexViolentOffenderBackgroundCheckTab();
		passSexViolentOffenderBackgroundCheckPage.selectApplicantAValue("Yes");
		//passSexViolentOffenderBackgroundCheckPage.selectApplicantBValue("Yes");
		passSexViolentOffenderBackgroundCheckPage.selectResidentsValue("No");
		passSexViolentOffenderBackgroundCheckPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		passSexViolentOffenderBackgroundCheckPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
		 //Licensing Activity 7 : Pass Criminal History Background Check
		passCriminalHistoryBackgroundCheckPage.clickPassCriminalHistoryBackgroundCheckFormTab();
	//	passCriminalHistoryBackgroundCheckPage.questionRelatedToApplicant_A("Yes");
		passCriminalHistoryBackgroundCheckPage.questionRelatedToOtherHouseholdMembers("Yes");
		passCriminalHistoryBackgroundCheckPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		passCriminalHistoryBackgroundCheckPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
		
		 //Licensing Activity 8 : Complete Foster Parent Assessment
		completeFosterParentAssessmentPage.clickCompleteFosterParentAssessmentTab();
		completeFosterParentAssessmentPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		completeFosterParentAssessmentPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); */
		
		// Licensing Activity 9 : Access to Safe Water
		accessToSafeWaterPage.clickAccessToSafeWaterTab();
		accessToSafeWaterPage.selectHouseHoldAccessValue("Yes");
	//	accessToSafeWaterPage.selectApplicantAValue();
		accessToSafeWaterPage.selectStandardsMetValue("Does Not Meet");	
		requestforWaiverAndVarianceSection.RequestforVarianceSection();
		meetHomeSafetyStandardspage.clickSaveButton();
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		accessToSafeWaterPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
	/*	// Licensing Activity 10 : Agree to Resource Parent Roles and Responsibilities
		agreetoResourceParentRolesandResponsibilitiesPage.agreetoResourceParentRolesandResponsibilitiesTab();
		agreetoResourceParentRolesandResponsibilitiesPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		agreetoResourceParentRolesandResponsibilitiesPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
		// Licensing Activity 11 : Prove Financial Stability
		proveFinancialStabilityPage.clickLicenseActivitiesTab();
		//proveFinancialStabilityPage.applicant1SignatureDate();
		//proveFinancialStabilityPage.applicant2SignatureDate();
		proveFinancialStabilityPage.monthlyIncomeCoversExpensesdebts("Yes");
		proveFinancialStabilityPage.standardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		proveFinancialStabilityPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); */
	
		// Licensing Activity 12 : Complete Home Visits
		completeHomeVisitFeedbackPage.completeHomeVisitsTab();
		completeHomeVisitFeedbackPage.fosterParentsDeterminedAppropriate("Yes");
		completeHomeVisitFeedbackPage.clickSaveButton();
		completeHomeVisitFeedbackPage.didAllHouseholdMembersParticipate("Yes");
		completeHomeVisitFeedbackPage.ifNoWhoDidNotParticipateAndWhy("Text");
	completeHomeVisitFeedbackPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		completeHomeVisitFeedbackPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
		// Licensing Activity 13 : Meet Home Safety Standards
		meetHomeSafetyStandardspage. meetHomeSafetyStandardPageTab();
		meetHomeSafetyStandardspage.descriptionofHome("Demo");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.confirmStandardsMet("Yes");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.enterNoOfBedrooms("10");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.enterNoOfBeds("20");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.EnterDate();
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.selectStandardsMet("Does Not Meet");	
		meetHomeSafetyStandardspage.WaiverandVarianceSection();
		meetHomeSafetyStandardspage.clickSaveButton();
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 14 : Complete Pre-Service Training
		completePreServiceTrainingPages.completePreServiceTrainingTab();
		completePreServiceTrainingPages.applicantCompletedRapt("Yes");
		completePreServiceTrainingPages.clickSaveButton();
		completePreServiceTrainingPages.selectStandardsMetValue("Does Not Meet");
		meetHomeSafetyStandardspage.WaiverandVarianceSection();
		meetHomeSafetyStandardspage.clickSaveButton();
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		completePreServiceTrainingPages.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
		// Licensing Activity 15 : Complete Medical Training
		completeMedicalTrainingPage.licensingActivityName();
		completeMedicalTrainingPage.applicant_A_CompletedMedicalTraining("Yes");
		completeMedicalTrainingPage.applicant_A_meetsWithWaiverVariance("Yes");
		completeMedicalTrainingPage.standardsMet("Does Not Meet");
		meetHomeSafetyStandardspage.WaiverandVarianceSection();
		meetHomeSafetyStandardspage.clickSaveButton();
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		completeMedicalTrainingPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
		
	/*	// Licensing Activity 16 : Complete Family Network Diagram
		completeFamilyNetworkDiagramPage.completeFamilyNetworkDiagramTab();
		completeFamilyNetworkDiagramPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		completeFamilyNetworkDiagramPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
		// Licensing Activity 17 : Obtain Medical Clearance
		obtainMedicalClearancePage.obtainMedicalClearancePageTab();
		obtainMedicalClearancePage.meetmedicalrequirementsPerson1("Yes");
		obtainMedicalClearancePage.selectStandardsMet("Does Not Meet");
		requestforWaiverAndVarianceSection.RequestforWaiverSection();
		meetHomeSafetyStandardspage.clickSaveButton();
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		obtainMedicalClearancePage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab(); 
	
	/*	// Licensing Activity 18 : Receive References
		receiveReferencesPage.receiveReferenceTab();
		receiveReferencesPage.minimalOfFourReferences("Yes");
		receiveReferencesPage.clickSaveButton();
		receiveReferencesPage.selectStandardsMetValue("Does Not Meet");
		requestforWaiverAndVarianceSection.RequestforWaiverSection();
		meetHomeSafetyStandardspage.clickSaveButton();
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		receiveReferencesPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
		 
		// Licensing Activity 19 : Provide Home Study
		provideHomeStudyPage.provideHomeStudyTab();
		provideHomeStudyPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		provideHomeStudyPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 20 : Complete Vendor Information
		completeVendorInformationPage.completeVendorInformationPageTab();
		completeVendorInformationPage.selectStandardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		completeVendorInformationPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		// Licensing Activity 21 : Resource Parent Role Acknowledgment
		resourceParentRoleAcknowledgmentPage.clickResourceParentRoleAcknowledgmentTab();
		resourceParentRoleAcknowledgmentPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		resourceParentRoleAcknowledgmentPage.closeLicensingActivityTab(); */
	}
	@Test(enabled = false,description = "US0001427 : Licensing application submission", groups = { "High",
			"acisRegression", "sankari" },priority=2)
	public void Licensingapplicationsubmission() throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {
		
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
//		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		homePage_SFDCPage.searchRecordAndClick("sankari N");	

		
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.selectLicensingRecommendation("Approve License");
		licensingApplicationPage.verifyApplicationWaiverRequests();
		licensingApplicationPage.selectExceptionRequested("Yes");
		licensingApplicationPage.clickNextButton();
	}
	@Test(enabled=false,description = "US0001427 : Licensing application submission to CO", groups = { "High",
			"acisRegression", "sankari" },priority=2)
	
public void LicensingapplicationsubmissiontoCO() throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {
		
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
//		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		homePage_SFDCPage.searchRecordAndClick("sankari N");	
		licensingApplicationPage.endorseToCO();
		

		
	}

	@Test(enabled = false,description = "US0001427 : Licensing application approval as central officer", groups = { "High",
			"acisRegression", "sankari" },priority=2)
	public void LicensingapplicationapprovalfromCOLogin() throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {
		
		loginTest.login("CentralOfficeWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
//		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		homePage_SFDCPage.searchRecordAndClick("Evangelina Kirlin");	
// Include code for CO Accept
		//Pop Up verification
		//LA status changed to approved
		
				
		
		
	}
}
