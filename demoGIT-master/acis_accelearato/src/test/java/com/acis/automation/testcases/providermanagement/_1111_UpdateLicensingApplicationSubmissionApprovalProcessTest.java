package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1111_UpdateLicensingApplicationSubmissionApprovalProcessTest extends TestBase {

	public _1111_UpdateLicensingApplicationSubmissionApprovalProcessTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String parentFirstName = faker.name().firstName();
	String parentLastName = faker.name().lastName();
	String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
	String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
	String phone = excel.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"), 5);
	String email;

	int count;
	

	@Test(enabled = false,description = "S:01111 : Update Licensing Application Submission & Approval Process : Foster Parent Inquiry Form", groups = { "High",
			"acisRegression", "Mrunal" },priority=0)
	public void updateLicensingApplicationSubmissionApprovalProcessFosterParentInquiryForm() throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {
		
		loginTest.login("LicesningWorker");

//		home.verfiyHomePage();
//		homePage_SFDCPage.closeTabs();
//		homePage_SFDCPage.clickDownArrowHome();
//		email=accountPage.swiitchEmailpage();
//		accountPage.swiitchInquiryPage();
		fosterParentInquiryFormPage.verifyFirstLast();
//		fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
//		fosterParentInquiryFormPage.setParent1LastName(parentLastName);
//		fosterParentInquiryFormPage.setDatewithData(setdate);
//		fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
//		fosterParentInquiryFormPage.setParent1EmailAddress();
//		fosterParentInquiryFormPage.clickNextButton();
//		fosterInquirySecondPage.selectAddress("Jackson, MS, USA");
//		fosterInquirySecondPage.selectFosterCheckBox();
//		fosterInquirySecondPage.selectNext();
//		fosterInquirySecondPage.selectFinishCheckBox();
//		driver.close();
//		accountPage.switchApplication();
//		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		accountPage.changingStatus();
		
		homePage_SFDCPage.closeTabs();
		
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
//		homePage_SFDCPage.searchRecordAndClick("Andra Mayer");	

	
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.verifyLicensingRecommendationOption("Deny License");
		licensingApplicationPage.verifyLicensingRecommendationOption("Voluntary Withdrawal");
		licensingApplicationPage.closeSubmitWindow();
		count++;
	}
	
	
	@Test(description = "S:01111 : Update Licensing Application Submission & Approval Process", groups = { "High",
			"acisRegression", "Mrunal" },priority=1)
	public void updateLicensingApplicationSubmissionApprovalProcess() throws AcisException, Exception {
	
	if(count==1)
	{
		loginTest.login("Admin");
		
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
//		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
		homePage_SFDCPage.searchRecordAndClick("Andra Mayer");	
		
		
		//System Admin
		licensingApplicationPage.clickLicenseActivitiesTab();
//		
//		// Licensing Activity 1 : Meet Age & Citizenship Requirements
//		meetAgeCitizenshipRequirementsPage.clickLicenseActivitiesTab();
//		meetAgeCitizenshipRequirementsPage.selectApplicantAAge("Yes");
//		meetAgeCitizenshipRequirementsPage.selectApplicantACitizen("Yes");
////		meetAgeCitizenshipRequirementsPage.selectApplicantBAge("Yes");
////		meetAgeCitizenshipRequirementsPage.selectApplicantBCitizen("Yes");
//		meetAgeCitizenshipRequirementsPage.selectStandardsMet("Meets");
//	    meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
//	    meetAgeCitizenshipRequirementsPage.clickSaveButton();
//		meetAgeCitizenshipRequirementsPage.closeLicensingActivityTab();
//		licensingApplicationPage.CloseLicensingActivitiesTab();
//		licensingApplicationPage.clickLicenseActivitiesTab();
//		
//		// Licensing Activity 2 : Possess Valid Driver License
//		possessValidDriverLicensePage.clickLicenseActivitiesTab();
//		possessValidDriverLicensePage.selectApplicantALicense("Yes");
////		possessValidDriverLicensePage.selectApplicantBLicense("Yes");
//		possessValidDriverLicensePage.selectOther("Yes");
//		possessValidDriverLicensePage.selectStandardsMet("Meets");
//		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
//		meetAgeCitizenshipRequirementsPage.clickSaveButton();
//		possessValidDriverLicensePage.closeLicensingActivityTab();
//		licensingApplicationPage.CloseLicensingActivitiesTab();
//		licensingApplicationPage.clickLicenseActivitiesTab();
//	
//		// Licensing Activity 3 : Complete Child Care Plan
//		completeChildCarePlanPage.completeChildCarePlanTab();
//		completeChildCarePlanPage.selectStandardsMetValue("Meets");
//		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
//		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
//		completeChildCarePlanPage.closeLicensingActivityTab();
//		licensingApplicationPage.CloseLicensingActivitiesTab();
//		licensingApplicationPage.clickLicenseActivitiesTab();
//	
//		// Licensing Activity 4 : Pass CPS Background Check
//		passCPSBackgroundCheckPage.licensingActivityName();
//		passCPSBackgroundCheckPage.applicant_A_Indicated_perpetrator("Yes");
////		passCPSBackgroundCheckPage.applicant_B_Indicated_perpetrator("No");
//		passCPSBackgroundCheckPage.OthersIndicatedPerpetrators("Yes");
//		passCPSBackgroundCheckPage.standardsMet("Meets");
//		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
//		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
//		passCPSBackgroundCheckPage.closeLicensingActivityTab();
//		licensingApplicationPage.CloseLicensingActivitiesTab();
//		licensingApplicationPage.clickLicenseActivitiesTab();
//	
//		// Licensing Activity 5 : Pass Fingerprint Background Check
//		passFingerprintBackgroundCheckPage.passFingerprintBackgroundCheckPageTab();
//		passFingerprintBackgroundCheckPage.applicantA("Yes");
////		passFingerprintBackgroundCheckPage.applicantB("Yes");
//		passFingerprintBackgroundCheckPage.othersIndicatedperpetrators("Yes");
//		passFingerprintBackgroundCheckPage.selectStandardsMet("Has Concerns");
//		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
//		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
//		passFingerprintBackgroundCheckPage.closeLicensingActivityTab();
//		licensingApplicationPage.CloseLicensingActivitiesTab();
//		licensingApplicationPage.clickLicenseActivitiesTab();
//	
//		// Licensing Activity 6 : Pass Sex/Violent Offender Background Check
//		passSexViolentOffenderBackgroundCheckPage.clickPassSexViolentOffenderBackgroundCheckTab();
//		passSexViolentOffenderBackgroundCheckPage.selectApplicantAValue("Yes");
////		passSexViolentOffenderBackgroundCheckPage.selectApplicantBValue("Yes");
//		passSexViolentOffenderBackgroundCheckPage.selectResidentsValue("No");
//		passSexViolentOffenderBackgroundCheckPage.selectStandardsMetValue("Meets");
//		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
//		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
//		passSexViolentOffenderBackgroundCheckPage.closeLicensingActivityTab();
//		licensingApplicationPage.CloseLicensingActivitiesTab();
//		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 7 : Pass Criminal History Background Check
		passCriminalHistoryBackgroundCheckPage.clickPassCriminalHistoryBackgroundCheckFormTab();
		passCriminalHistoryBackgroundCheckPage.questionRelatedToApplicant_A("Yes");
		passCriminalHistoryBackgroundCheckPage.questionRelatedToOtherHouseholdMembers("Yes");
		passCriminalHistoryBackgroundCheckPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		passCriminalHistoryBackgroundCheckPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		// Licensing Activity 8 : Complete Foster Parent Assessment
		completeFosterParentAssessmentPage.clickCompleteFosterParentAssessmentTab();
		completeFosterParentAssessmentPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		completeFosterParentAssessmentPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		// Licensing Activity 9 : Access to Safe Water
		accessToSafeWaterPage.clickAccessToSafeWaterTab();
		accessToSafeWaterPage.selectHouseHoldAccessValue("Yes");
//		accessToSafeWaterPage.selectApplicantAValue();
		accessToSafeWaterPage.selectStandardsMetValue("Meets");		  
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		accessToSafeWaterPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 10 : Agree to Resource Parent Roles and Responsibilities
		agreetoResourceParentRolesandResponsibilitiesPage.agreetoResourceParentRolesandResponsibilitiesTab();
		agreetoResourceParentRolesandResponsibilitiesPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		agreetoResourceParentRolesandResponsibilitiesPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 11 : Prove Financial Stability
		proveFinancialStabilityPage.clickLicenseActivitiesTab();
		proveFinancialStabilityPage.applicant1SignatureDate();
		proveFinancialStabilityPage.monthlyIncomeCoversExpensesdebts("Yes");
		proveFinancialStabilityPage.standardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		proveFinancialStabilityPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
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
		meetHomeSafetyStandardspage.selectStandardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		meetHomeSafetyStandardspage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 14 : Complete Pre-Service Training
		completePreServiceTrainingPages.completePreServiceTrainingTab();
		completePreServiceTrainingPages.applicantCompletedRapt("Yes");
		completePreServiceTrainingPages.clickSaveButton();
		completePreServiceTrainingPages.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		completePreServiceTrainingPages.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 15 : Complete Medical Training
		completeMedicalTrainingPage.licensingActivityName();
		completeMedicalTrainingPage.applicant_A_CompletedMedicalTraining("Yes");
		completeMedicalTrainingPage.applicant_A_meetsWithWaiverVariance("Yes");
		completeMedicalTrainingPage.standardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		completeMedicalTrainingPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		// Licensing Activity 16 : Complete Family Network Diagram
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
		obtainMedicalClearancePage.selectStandardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		meetHomeSafetyStandardspage.clickSaveButton();
		obtainMedicalClearancePage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 18 : Receive References
		receiveReferencesPage.receiveReferenceTab();
		receiveReferencesPage.minimalOfFourReferences("Yes");
		receiveReferencesPage.clickSaveButton();
		receiveReferencesPage.selectStandardsMetValue("Meets");
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
		resourceParentRoleAcknowledgmentPage.closeLicensingActivityTab();
		
		count++;
	}
	else {
		throw new Exception("Pre-requisite for Foster Account Creation Does Not completed Successfully, so can not run this test");
	}

	}
	

	@Test(description = "S:01111 : Update Licensing Application Submission & Approval Process ", groups = { "High",
			"acisRegression", "Mrunal" },priority=2)
	public void updateLicensingApplicationSubmissionApprovalProcessWorker() throws AcisException, Exception {
	
	if(count==2)
	{
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
//		homePage_SFDCPage.searchRecordAndClick("AccountA AccountA");	

		
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.verifyLicensingRecommendationOption("Deny License");
		licensingApplicationPage.verifyLicensingRecommendationOption("Voluntary Withdrawal");
		licensingApplicationPage.verifyLicensingRecommendationOption("Approve License");
		licensingApplicationPage.selectLicensingRecommendation("Approve License");
		licensingApplicationPage.verifyApplicationWaiverRequests();
		licensingApplicationPage.selectExceptionRequested("No");
		licensingApplicationPage.clickNextButton();
				
	}
	else {
		throw new Exception("Pre-requisite of Licensing Application Does Not completed Successfully, so can not run this test");
	}
}
	
}
