package com.acis.automation.testcases.basicMethods;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class ProviderMangementTest extends TestBase{

	public ProviderMangementTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test(description = "Switching to Portal Licensing Activity", groups = { "High",
			"aCIS_Regression", "Prateeksha" })
	public void switchingToPortalPage(String userName, String password) throws AcisException, Exception {
		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword(userName, password);	
		licensingApplicationPortalPage.clickLicenseActivitiesTab();	
	}
	
	
	String parentFirstName , parentLastName;
	
	@Test(description = "Switching to Salesforce Licensing activity", groups = { "High",
			"aCIS_Regression", "Prateeksha" })
	public void switchingToLicensingPage(String parentFirstName, String parentLastName) throws AcisException, Exception {
		
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.clickLicenseActivitiesTab();
	}
	
	
	@Test(description = "Click on Account and Select New Button From HomePage", groups = { "High",
			"aCIS_Regression", "Prateeksha" })
	public void clickAccountSelectNewFromHomePage() throws AcisException, Exception {
	
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.clickNewButton();
	}

	
	
	/**
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	@Test(description = "Complete 21 Licensing Activities by System Admin", groups = { "High",
			"acisRegression", "Mrunal" })
	public void updateLicensingApplicationSubmissionApprovalProcess(String parentFirstName, String parentLastName) throws AcisException, InterruptedException, IOException, AWTException {
	
		loginTest.login("Admin");
		
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);	
	
		//System Admin
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		// Licensing Activity 1 : Meet Age & Citizenship Requirements
		meetAgeCitizenshipRequirementsPage.clickLicenseActivitiesTab();
		meetAgeCitizenshipRequirementsPage.selectApplicantAAge("Yes");
		meetAgeCitizenshipRequirementsPage.selectApplicantACitizen("Yes");
//		meetAgeCitizenshipRequirementsPage.selectApplicantBAge("Yes");
//		meetAgeCitizenshipRequirementsPage.selectApplicantBCitizen("Yes");
		meetAgeCitizenshipRequirementsPage.selectStandardsMet("Meets");
	    meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
	    meetAgeCitizenshipRequirementsPage.clickSaveButton();
		meetAgeCitizenshipRequirementsPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
		
		// Licensing Activity 2 : Possess Valid Driver License
		possessValidDriverLicensePage.clickLicenseActivitiesTab();
		possessValidDriverLicensePage.selectApplicantALicense("Yes");
//		possessValidDriverLicensePage.selectApplicantBLicense("Yes");
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
//		passCPSBackgroundCheckPage.applicant_B_Indicated_perpetrator("No");
		passCPSBackgroundCheckPage.OthersIndicatedPerpetrators("Yes");
		passCPSBackgroundCheckPage.standardsMet("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		passCPSBackgroundCheckPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 5 : Pass Fingerprint Background Check
		passFingerprintBackgroundCheckPage.passFingerprintBackgroundCheckPageTab();
		passFingerprintBackgroundCheckPage.applicantA("Yes");
//		passFingerprintBackgroundCheckPage.applicantB("Yes");
		passFingerprintBackgroundCheckPage.othersIndicatedperpetrators("Yes");
		passFingerprintBackgroundCheckPage.selectStandardsMet("Has Concerns");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		passFingerprintBackgroundCheckPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
		// Licensing Activity 6 : Pass Sex/Violent Offender Background Check
		passSexViolentOffenderBackgroundCheckPage.clickPassSexViolentOffenderBackgroundCheckTab();
		passSexViolentOffenderBackgroundCheckPage.selectApplicantAValue("Yes");
//		passSexViolentOffenderBackgroundCheckPage.selectApplicantBValue("Yes");
		passSexViolentOffenderBackgroundCheckPage.selectResidentsValue("No");
		passSexViolentOffenderBackgroundCheckPage.selectStandardsMetValue("Meets");
		meetAgeCitizenshipRequirementsPage.provideTaskValue("Completed");
		passSexViolentOffenderBackgroundCheckPage.clickSaveButton();
		passSexViolentOffenderBackgroundCheckPage.closeLicensingActivityTab();
		licensingApplicationPage.CloseLicensingActivitiesTab();
		licensingApplicationPage.clickLicenseActivitiesTab();
	
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
		accessToSafeWaterPage.selectApplicantAValue();
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
//		proveFinancialStabilityPage.applicant2SignatureDate();
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
		
		homePage_SFDCPage.closeTabs();
	}
}
