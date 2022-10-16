package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1192_Sprint21feedbackTest extends TestBase {

	public _1192_Sprint21feedbackTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	int count1;
	String allegationID, caseID;
	String firstName = excel.generateRandomTestData(excel.generateRandomTestData("FP", 4), 4);
	String middleName = excel.generateRandomTestData(excel.generateRandomTestData("FP", 3), 3);
	String lastName = excel.generateRandomTestData(excel.generateRandomTestData("FP", 3), 3);

	String secondfirstName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 4), 4);
	String secondmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 3), 3);
	String secondlastName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 3), 4);

	String thirdfirstName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 4), 4);
	String thirdmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 3), 3);
	String thirdlastName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 3), 4);

	String fourthfirstName = excel.generateRandomTestData(excel.generateRandomTestData("P", 4), 4);
	String fourthmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("P", 3), 3);
	String fourthlastName = excel.generateRandomTestData(excel.generateRandomTestData("P", 3), 4);

	String victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);

	String firstPersonName = firstName.concat(" ").concat(lastName);
	String secondPersonName = secondfirstName.concat(" ").concat(secondlastName);

	final static Logger logger = LoggerFactory.getLogger(_1192_Sprint21feedbackTest.class);

	@Test(description = "S-1192: Sprint 21 feedback Test by ooh ", groups = { "Medium", "ACIS_Regression", "Khushboo" })

	public void FamilyFindingOOH() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		// homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.clickNewButton();
		placementResourcePage.selectKPResourceRadioButton();
		createKinShipPage.selectChild("FirstNameAEDO");
		createKinShipPage.selectCaseID();
		createKinShipPage.clickNextButton();
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
		createKinShipPage.selectAddress("NXP Main Entrance, Austin, TX, USA");
		createKinShipPage.selectType("Home");
		createKinShipPage.clickNextButton();
		createKinShipPage.clickSubmit();
		locateRelativesPage.openFamilyFinding();
		// AC002678
		locateRelativesPage.checkIntialsText();
		locateRelativesPage.selectCheckBox("Ask family members");
		locateRelativesPage.clickNextButton();
		personsInvovledPage.clickNextButton();
		establishRelationshipsPage.clickNext();
		// AC002681
		createPlacementResourcePage.selectPlacementCreate("Yes");
		// createPlacementResourcePage.selectParent("" , "Parent 1");
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
		createKinShipPage.clickNextButton();
		createPlacementResourcePage.clickSubmitButton();
		// AC2626
		locateRelativesPage.openVerificationChecklist();

	}

	@Test(description = " US:1192 Investigation Workflow-Interview 1 - Investigation User :Intake login", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 0)

	public void investigationWorkflowInterviewInvestiagtionIntakeLogin()
			throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();

		String victim = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName")).concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		maltreator = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName")).concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		// Options : screenOut||familyServices||investigation
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();

		count1++;
	}

	@Test(description = " US:1192 Investigation Workflow-Interview 1 - Investigation USer : Approval", groups = {
			"High", "acisRegression", "khushboo" }, priority = 1)

	public void investigationWorkflowInterviewInvestiagtionAproval() throws AcisException, Exception {

		if (count1 == 1) {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.closeIntakeOmniscript();

			allegationReportPage.verifyingAllegationReportStatus();
			homePage_SFDCPage.closeTabs();

			count1++;
		} else {
			throw new Exception(
					"Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
		}

	}

	@Test(description = " US:1192 Investigation Workflow-Interview 1 - Investigation USer", groups = { "High",
			"acisRegression", "Khushboo" }, priority = 2)

	public void investigationWorkflowInterviewInvestiagtionTest() throws AcisException, Exception {

		if (count1 == 2) {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			personsInvovled_Workflow_OmniscriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickNextButton();
			collaterals_OmniScriptPage.clickNextButton();
			recordReview_OmniScriptPage.enterRecordreviewSummary("demo");
			recordReview_OmniScriptPage.clickNextButton();

		}
	}
}