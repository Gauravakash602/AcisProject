package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _01076_EstablishingRelationshipsTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(_01076_EstablishingRelationshipsTest.class);

	public _01076_EstablishingRelationshipsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String allegationID,maltreator,victim;
	int count = 0;
	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);
	
	@Test(priority=0,description = "US-0001076:Show Full Person Details in Establishing Relationships ", groups = { "High", "ACIS_Regression", "Dharmesh" })
	public void intakeCreationAccept() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			maltreator = firstName.concat(" ").concat(middleName);
			victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
					testData.get(Constants.REPORTDETAILSPAGE).get("email"),
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(
					firstName,
					middleName,
					lastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
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
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			// Options : screenOut||familyServices||investigation
			// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("No");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			// Options : workerComments||supervisoryComments||narrative
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationID = allegationReportPage.getAllegationID();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0001076:Show Full Person Details in Establishing Relationships");

		}

	}
	
	@Test(priority=2,description = "US-0001076:Show Full Person Details in Establishing Relationships", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void safetyAssessmentAccept() throws AcisException {
		try {
			if (count == 1) {
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
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationSafetyAssessmentPage.clickDetailVerifyingStatusInProgress();
				investigationSafetyAssessmentPage.newSafetyAssesment();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				establishRelations_SA_OmniScriptPage.clickCreateAddButton();
				establishRelations_SA_OmniScriptPage.verifyPerson();
				establishRelations_SA_OmniScriptPage.verifyPlacementMessage();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0001076:Show Full Person Details in Establishing Relationships");

		}
	}
	
	@Test(priority=3,description = "US-0001076:Show Full Person Details in Establishing Relationships", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void investigationFlowAccept() throws AcisException {
		try {
			String caseHead = firstName+" "+middleName+" "+lastName;
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickCreateAddButton();
				establishRelationships__OmniScriptPage.verifyPerson();
				establishRelationships__OmniScriptPage.verifyPlacementMessage();
				count++;
				
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0001076:Show Full Person Details in Establishing Relationships");

		}
	}
	
	
	@Test(priority=4,description = "US-0001076:Show Full Person Details in Establishing Relationships", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void safetyAssessmentAcceptInvestigator() throws AcisException {
		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationSafetyAssessmentPage.clickDetailVerifyingStatusInProgress();
				investigationSafetyAssessmentPage.newSafetyAssesment();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				establishRelations_SA_OmniScriptPage.clickCreateAddButton();
				establishRelations_SA_OmniScriptPage.verifyPerson();
				establishRelations_SA_OmniScriptPage.verifyPlacementMessage();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0001076:Show Full Person Details in Establishing Relationships");

		}
	}
	
	@Test(priority=5,description = "US-0001076:Show Full Person Details in Establishing Relationships", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void investigationFlowInvestigator() throws AcisException {
		try {
			String caseHead = firstName+" "+middleName+" "+lastName;
			if (count == 4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickCreateAddButton();
				establishRelationships__OmniScriptPage.verifyPerson();
				establishRelationships__OmniScriptPage.verifyPlacementMessage();
				count++;
				
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0001076:Show Full Person Details in Establishing Relationships");

		}
	}
	
	@Test(priority=6,description = "US-0001076:Show Full Person Details in Establishing Relationships", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void safetyAssessmentAcceptCaseworker() throws AcisException {
		try {
			if (count == 5) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationSafetyAssessmentPage.clickDetailVerifyingStatusInProgress();
				investigationSafetyAssessmentPage.newSafetyAssesment();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				establishRelations_SA_OmniScriptPage.clickCreateAddButton();
				establishRelations_SA_OmniScriptPage.verifyPerson();
				establishRelations_SA_OmniScriptPage.verifyPlacementMessage();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0001076:Show Full Person Details in Establishing Relationships");

		}
	}
	
	@Test(priority=7,description = "US-0001076:Show Full Person Details in Establishing Relationships", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void investigationFlowAcceptCaseworker() throws AcisException {
		try {
			if (count == 6) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickCreateAddButton();
				establishRelationships__OmniScriptPage.verifyPerson();
				establishRelationships__OmniScriptPage.verifyPlacementMessage();
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0001076:Show Full Person Details in Establishing Relationships");

		}
	}
	
	
}
