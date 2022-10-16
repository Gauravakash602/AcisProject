package com.acis.automation.testcases.investigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class InvestigationContactRecordTest_0190 extends TestBase {
	public InvestigationContactRecordTest_0190() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String firstName = faker.name().firstName();
	String middleName = "";
	String lastName = faker.name().lastName();
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = "";
	String secondlastName = faker.name().lastName();
	String victim = firstName.concat(" ").concat(lastName);
	String maltreator = secondfirstName.concat(" ").concat(secondlastName);

	final static Logger logger = LoggerFactory.getLogger(InvestigationContactRecordTest_0190.class);
	public static String allegationID;

	@Test(enabled = true, priority = 9, description = "S:0190 Investigation Contact Records using investigation User", groups = {
			"Simple", "ACIS_Regression", "Khushboo" })
	public void FindingsInvestigator() throws AcisException, InterruptedException {
		try {
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickCreateAddButton();
			establishRelationships__OmniScriptPage.searchText(maltreator, "Person");
			establishRelationships__OmniScriptPage.setRelationShip("Child-Father");
			establishRelationships__OmniScriptPage.searchText(victim, "Related");
			establishRelationships__OmniScriptPage.clickSaveButton("Save");
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickCreateInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interview_OmniScriptPage.provideDate();
			interview_OmniScriptPage.selectAttempts("Successfull");
			interview_OmniScriptPage.prvoideType("Visit");
			interview_OmniScriptPage.prvoideLocation("Biological Home");
			interview_OmniScriptPage.prvoideSubType("Child");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion",
					"Interviw profesionalopinion Demo");
			interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
			interview_OmniScriptPage.clickSavebutton();
			interview_OmniScriptPage.closeCaregiverTab();
			interview_OmniScriptPage.clickNextButton(); // Collateral
			collaterals_OmniScriptPage.clickCreateCollateral();
			collaterals_OmniScriptPage.iframeSwitch();
			collaterals_OmniScriptPage.setDate();
			collaterals_OmniScriptPage.selectAttempts("Successfull");
			collaterals_OmniScriptPage.typePicklist("Collateral");
			collaterals_OmniScriptPage.subTypePicklist("Medical");
			collaterals_OmniScriptPage.verifyLocation("Foster Home");
			collaterals_OmniScriptPage.prvoideMethod("FaceToFace");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPerson", "Test");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
			collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
			collaterals_OmniScriptPage.clickSaveButton();
			collaterals_OmniScriptPage.verifyError();
			collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
			collaterals_OmniScriptPage.clickSaveButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed :S:0107 Investigation - Findings   using investigation User");
		}
	}

	@Test(enabled = true, priority = 1, description = "S:0111 Investigation Contact Records using Supervisor User", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void InvestigationCaseRecordSupervisor() throws AcisException, InterruptedException {
		try {
			allegationID = loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName,
					lastName, secondfirstName, secondmiddleName, secondlastName);
			loginTest.logout();
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			investigationTest.intakeApproval();
			allegationReportPage.verifyingAllegationReportStatus();
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.verifyAlligationReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using Superviosr User");
		}
	}

	@Test(enabled = true, priority = 2, description = "S:0111 Investigation Contact Records using Supervisor User", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void InvestigationCaseRecordIntake() throws AcisException, InterruptedException {

		try {
			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			caseHeadPage.clickRelatedTab("Second Related tab");
			investigationCasePage.verifyAlligationReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using Intake User");
		}
	}

	@Test(enabled = true, priority = 3, description = "S:0111 Investigation Contact Records using Supervisor User", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void InvestigationCaseRecordInvestigator() throws AcisException, InterruptedException {

		try {

			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			caseHeadPage.clickRelatedTab("Second Related tab");
			investigationCasePage.verifyAlligationReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using investigator User");
		}
	}

	@Test(enabled = false, priority = 4, description = "S:0111 Investigation Contact Records using Supervisor User", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void InvestigationCaseRecordAdmin() throws AcisException, InterruptedException {

		try {
			loginTest.login("Admin");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			caseHeadPage.clickRelatedTab("Second Related tab");
			investigationCasePage.verifyAlligationReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using investigator User");
		}
	}

	@Test(enabled = true, priority = 5, description = "S:0111 Assessments Contact Records using Intake User", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void AssessmentsCaseRecordsIntake() throws AcisException, InterruptedException {
		try {
			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			// investigationCasePage.clickInsightTabOfInvestigation();
			investigationCasePage.verifyNewReferralAssignment();
			investigationCasePage.verifyHighlightPanel();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAssessmentField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0111 Assessments Contact Records using Intake User");
		}
	}

	@Test(enabled = true, priority = 6, description = "S:0111 Assessments Contact Records using Investigator User", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void AssessmentsCaseRecordsInvestigator() throws AcisException, InterruptedException {
		try {
			loginTest.login("Investigator");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.verifyNewReferralAssignment();
			investigationCasePage.verifyHighlightPanel();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAssessmentField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0111 Assessments Contact Records using Investigator User");
		}
	}

	@Test(enabled = true, priority = 7, description = "S:0111 Assessments Contact Records using Supervisor User", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void AssessmentsCaseRecordsSupervisor() throws AcisException, InterruptedException {
		try {
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.verifyNewReferralAssignment();
			investigationCasePage.verifyHighlightPanel();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAssessmentField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using Supervisor User");
		}
	}

	@Test(enabled = true, priority = 8, description = "S:0111 Assessments Contact Records using Admin User", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void AssessmentsCaseRecordsAdmin() throws AcisException, InterruptedException {
		try {
			loginTest.login("Admin");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.verifyNewReferralAssignment();
			investigationCasePage.verifyHighlightPanel();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAssessmentField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0111 Assessments Contact Records using Admin User");
		}
	}

}
