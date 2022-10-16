package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EditSafetyAssessmentsOOHTest_1023 extends TestBase {

	public EditSafetyAssessmentsOOHTest_1023() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String allegationID, fosterCaseID;
	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();
	String secondPersonFirstName=faker.name().firstName();
	String secondPersonMiddleName= faker.name().lastName();
	String  secondPersonLastName= faker.name().lastName();
	String  maltreator, victim, victimSecond, riskAssessmentID, safetyAssessmentID, investigationCaseId;;
	int count1 = 0;
	@Test(enabled = true, description = "S-1023:create intake flow  pre-requisite 1", groups = { "High",
			"ACIS_Regression", "khushboo" }, priority = 0)
	public void creatingIntake() throws AcisException, Exception {

		if (count1 == 0) {
			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			// testData.get(Constants.REPORTDETAILSPAGE).get("phone")
			// testData.get(Constants.REPORTDETAILSPAGE).get("email")
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
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
			createIntakePerson_OmniscriptPage.setAllNames(secondPersonFirstName, secondPersonMiddleName, secondPersonLastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
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

			// Options : workerComments||supervisoryComments||narrative

			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			// screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("No");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			// Options : workerComments||supervisoryComments||narrative
			// Options : newCase||existingCase
			/*
			 * screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			 */
			 screeningDecision_OmniscriptPage.clickSubmitbtn();	
			allegationID = allegationReportPage.getAllegationID();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();

			count1++;
		} else {
			throw new Exception(
					"Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
		}

	}

	@Test(enabled = true, description = "S-1023:approval of intake flow Safety Assesment intake pre-Requesit 2", groups = {
			"High", "ACIS_Regression", "khushboo" }, priority = 1)
	public void validatingInvestigationWorkflowSubmititngIntake() throws AcisException, Exception {

		if (count1 == 1) {
			loginTest.login("Supervisor");
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
			allegationReportPage.cancelIntakeOmniscript();
			allegationReportPage.verifyingAllegationReportStatus();
			investigationCaseId = allegationReportPage.getInvestigationCaseID();
			count1++;
		} else {
			throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
		}

	}

	@Test(enabled = true, description = "S-1023:add  Safety Assesment flow", groups = { "High", "ACIS_Regressions",
			"khushboo" }, priority = 2)
	public void validatingInvestigationSafetyAssesment() throws AcisException, InterruptedException, IOException {
		try {

			loginTest.login("Investigator");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			// homePage_SFDCPage.searchGlobalFosterCase(investigationCaseId);
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickRelatedTab();
			mandatoryPersonSearchSafetyAssesmentPage.clickOnNewSafetyAssessmentlink();
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelations_SA_OmniScriptPage.clickNextButton();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();

		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(enabled = true, description = "S-1023:add  Safety Assesment flow", groups = { "High", "ACIS_Regressions",
			"khushboo" }, priority = 3)
	public void editSafetyAssessment() throws AcisException, InterruptedException, IOException {
		loginTest.login("OOHWorker");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		investigationCasePage.clickRelatedTab();
		// Open safety assesment table	
		mandatoryPersonSearchSafetyAssesmentPage.editSafetyAssessment();
		mandatoryPersonSearchSafetyAssesmentPage.enterCaptureNarrative("demo23");
		mandatoryPersonSearchSafetyAssesmentPage.clickSavebtn();

	}
}
