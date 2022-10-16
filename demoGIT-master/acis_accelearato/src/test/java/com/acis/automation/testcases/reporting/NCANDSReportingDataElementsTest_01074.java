package com.acis.automation.testcases.reporting;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class NCANDSReportingDataElementsTest_01074 extends TestBase {

	public NCANDSReportingDataElementsTest_01074() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NCANDSReportingDataElementsTest_01074.class);

	
	int count1, count2;
	String allegationID,caseID,fosterCaseID ;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName = excel.getLastName();

	String thirdfirstName = faker.name().firstName();
	String thirdmiddleName = faker.name().firstName();
	String thirdlastName = excel.getLastName();

	String fourthfirstName = faker.name().firstName();
	String fourthmiddleName = faker.name().firstName();
	String fourthlastName = excel.getLastName();

	String fifthfirstName = faker.name().firstName();
	String fifthmiddleName = faker.name().firstName();
	String fifthlastName = excel.getLastName();
	
	String sixthfirstName = faker.name().firstName();
	String sixthmiddleName = faker.name().firstName();
	String sixthlastName = excel.getLastName();

	
	String childFirstName="child".concat(faker.name().firstName());
	String childMiddleName=faker.name().firstName();
	String childLastName=excel.getLastName();
	String childFullName= childFirstName + " " + childMiddleName + " " +childLastName;
	String childName= childFirstName +  " " +childLastName;


	String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);
	String fullName = sixthfirstName+" "+sixthmiddleName+" "+sixthlastName;


	
	
	@Test(description = "US01074: NCANDS Reporting Data Elements : Investigation Safety Assessment and Workflow - Investigation USer", groups = { "High",
			"acisRegression", "Mrunal" },priority = 2)

	public void nCANDSReportingDataElementsInvestigation() throws AcisException, Exception {
		
			allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("Investigator");
			loginTest.investigationTest.openInvestigationCase(allegationID);
		
			
			/*Safety Assessment flow*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			//Review Allegation page
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			// Add new person
			personsInvolved_SA_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			personsInvolved_SA_OmniscriptPage.linkToCreateNewPerson();
			personsInvolved_SA_OmniscriptPage.setAllNames(fourthfirstName, fourthmiddleName, fourthlastName);
			personsInvolved_SA_OmniscriptPage.provideBirthdate(String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)));
			personsInvolved_SA_OmniscriptPage.provideDateOfDeath();
			personsInvolved_SA_OmniscriptPage.verifyCauseOfDeathValues();
			personsInvolved_SA_OmniscriptPage.verifyCauseOfDeathRequiredError();
			personsInvolved_SA_OmniscriptPage.selectCauseOfDeath("Injury");
			personsInvolved_SA_OmniscriptPage.clickSaveButton("next");
			personsInvolved_SA_OmniscriptPage.closeCreateIntakePerson();
			personsInvolved_SA_OmniscriptPage.clickRefresPersonButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();

			// Add relationship 
			establishRelations_SA_OmniScriptPage.clickNextButton();
			// Interview children
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			// Interview Care giver 
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			//Assess the home
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			//Decision Making Tool page
			safetyScale_SA_OmniScriptPage.clickNextButton();
			//Safety Decision
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.closeAssessmentsTab();									
						
		
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickInvestigationWorkflow();
			
			/* Workflow */
			
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			// Add New Person
			personsInvovled_Workflow_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			personsInvovled_Workflow_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_Workflow_OmniscriptPage.setAllNames(thirdfirstName, thirdmiddleName, thirdlastName);
			personsInvovled_Workflow_OmniscriptPage.provideBirthdate(String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)));
			personsInvovled_Workflow_OmniscriptPage.provideDateOfDeath();
			personsInvovled_Workflow_OmniscriptPage.verifyCauseOfDeathValues();
			personsInvovled_Workflow_OmniscriptPage.verifyCauseOfDeathRequiredError();
			personsInvovled_Workflow_OmniscriptPage.selectCauseOfDeath("Injury");
			personsInvovled_Workflow_OmniscriptPage.clickSaveButton("next");
			personsInvovled_Workflow_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_Workflow_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				
			investigationCasePage.closeInvestigationWorkflowOS();
			
			
			/*Adding New Person in Case Person*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			
			investigationCasePage.clickAddInvestigationPersonButton();
			personInvovled_IP_OmniScriptPage.searchPersonUsingvalidData("firstName", "a");
			personInvovled_IP_OmniScriptPage.linkToCreateNewPerson();
			personInvovled_IP_OmniScriptPage.setAllNames("first", fifthfirstName, fifthmiddleName, fifthlastName);
			personInvovled_IP_OmniScriptPage.provideBirthdate(String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)));
			personInvovled_IP_OmniScriptPage.provideDateOfDeath();
			personInvovled_IP_OmniScriptPage.verifyCauseOfDeathValues();
			personInvovled_IP_OmniScriptPage.verifyCauseOfDeathRequiredError();
			personInvovled_IP_OmniScriptPage.selectCauseOfDeath("Injury");
			personInvovled_IP_OmniScriptPage.clickSaveButton("next");
			personInvovled_IP_OmniScriptPage.closeCreateIntakePerson();
			personInvovled_IP_OmniScriptPage.clickRefresPersonButton();
			personInvovled_IP_OmniScriptPage.clickNextButton();
			
			homePage_SFDCPage.closeTabs();
			
		}
	

	
	
	
	@Test(description = "US01074: NCANDS Reporting Data Elements :Case person ", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 5)
	public void nCANDSReportingDataElementsOOHCaseWorker() throws AcisException, Exception {
	
			allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(sixthfirstName, sixthmiddleName, sixthlastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("OOHWorker");
			loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName);
			
			/*Case management Pre-requisite*/
			/*Create Case Person*/
			caseActionPage.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)));
			personsInvovled_CP_OmniscriptPage.provideDateOfDeath();
			personsInvovled_CP_OmniscriptPage.verifyCauseOfDeathValues();
			personsInvovled_CP_OmniscriptPage.verifyCauseOfDeathRequiredError();
			personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "dateOfDeathTextboxClear", " ");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();
			caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			
			 investigationCasePage.closeCasePersonTab();
			 
			 /*Creating child removal episode process*/
			 caseActionPage.clickInsightsTab();
			 fosterCareCase_Page.clickCourtAction();
			 newLegalAction_OmniScriptPage.clickOnCourtAction();
			 newLegalAction_OmniScriptPage.courtCaseNumber("1");
			 newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
			 newLegalAction_OmniScriptPage.courtActionType("Court Order");
			 newLegalAction_OmniScriptPage.addCourtActionParticipant(childFirstName, childMiddleName, childLastName);
			 newLegalAction_OmniScriptPage.saveButton();
			 courtActionPage.closeCourtActionTab();
		
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			 caseActionPage.clickInsightsTab();
			 fosterCareCase_Page.clickCourtAction();
			 courtActionPage.clickFirstRecordCourtOrder();
			 caseHeadPage.clickRelatedTab("Second Related tab");
			//court outcomes
			 
			courtActionOutcomesPage.clickCourtActionOutcomes();
			 courtActionOutcomesPage.setlectType("Shelter Granted");
			 courtActionOutcomesPage.provideDate();
			 courtActionOutcomesPage.enterCourtActionID("6488");
			 courtActionOutcomesPage.Savebutton();
				
			 courtActionOutcomesPage.closeCourtOutComesTab();
			 courtActionOutcomesPage.closeCourtActionOutcomeWindow();
			 courtActionOutcomesPage.closeCourtOrder();
			 courtActionPage.closeCourtActionTab();
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
		
			 
			 /*Edit Person from person account and making age between 18 to 21*/
			 caseActionPage.clickRelatedTab();
			 fosterCareCase_Page.clickPersonTab();
			 investigationCasePage.clickCasePerson(childFullName);
			 editPersonAccountPage.clickEditButton("second");
			 editPersonAccountPage.enterTextFieldValue("ageTextBoxClear", "");
			 editPersonAccountPage.provideBirthdate(String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-20)));
			 editPersonAccountPage.clickSaveButton();
			 personsInformationPage.closePersonTab(childFullName);
			   
		
			 /*Open same person and check cause od death*/
			 fosterCareCase_Page.clickNewPerson();
			 personsInvovled_CP_OmniscriptPage.clickEditRecordButton(childFullName);
			 personsInvovled_CP_OmniscriptPage.provideDateOfDeathAfterEdit();
			 personsInvovled_CP_OmniscriptPage.verifyCauseOfDeathValuesAfterEdit();
			 personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "dateOfDeathTextboxClearAfterEdit", " ");
			 personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			 establishRelationships_CP_OmniScriptPage.clickSubmit();
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
				
			 investigationCasePage.closeCasePersonTab();
			 
			 /*Open child removal episode and provide Date of exit as past date*/
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			 caseActionPage.clickRelatedTab();
			 fosterCareCase_Page.clickChildRemovalEpisodes();
			 childRemovalEpisodePage.clickFirstChildRemovalRecord();
			 childRemovalEpisodePage.clickDetailsTab();
			 childRemovalEpisodePage.provideDateOfExit();
			 childRemovalEpisodePage.clickSaveButton();
			 childRemovalEpisodePage.closeChildRemovalEpisodeRecordWindow();
			 childRemovalEpisodePage.closeChildRemovalEpisodeTab();
			
			 /*Open same person and check Cause of death is not visible*/
			 fosterCareCase_Page.clickNewPerson();
			 personsInvovled_CP_OmniscriptPage.clickEditRecordButton(childFullName);
			 personsInvovled_CP_OmniscriptPage.provideDateOfDeathAfterEdit();
			 personsInvovled_CP_OmniscriptPage.verifyCauseOfDeathNotPresent();
			
			
			 
		}
	
}
