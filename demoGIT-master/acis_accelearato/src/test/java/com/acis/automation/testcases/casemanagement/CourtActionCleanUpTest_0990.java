package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CourtActionCleanUpTest_0990 extends TestBase {

	public CourtActionCleanUpTest_0990() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(CourtActionCleanUpTest_0990.class);
	
	String allegationID,fosterCaseID ;
	int count;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName= faker.name().firstName();
	String fullName = firstName+" "+middleName+" "+lastName;
	
	String childFirstName= faker.name().firstName();
	String childMiddleName=faker.name().firstName();
	String childLastName=excel.getLastName();
	
	String childFullName= childFirstName + " " + childMiddleName + " " +childLastName;
	String childName= childFirstName +  " " +childLastName;
	

	@Test(description = "US:0990 : Court Action Clean-Up", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void courtActionCleanUp() throws AcisException, Exception {
			
		
		allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID);
		loginTest.logout();
		loginTest.login("OOHWorker");
		loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName);
		
		
		/*Create Case Person*/
		caseActionPage.clickRelatedTab();
		fosterCareCase_Page.clickPersonTab();
		fosterCareCase_Page.clickNewPerson();
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
		
		investigationCasePage.closeCasePersonTab();
		
		 caseActionPage.clickInsightsTab();
		 fosterCareCase_Page.clickCourtAction();
		 newLegalAction_OmniScriptPage.clickOnCourtAction();
		 newLegalAction_OmniScriptPage.courtCaseNumber("1");
		 newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		 newLegalAction_OmniScriptPage.courtActionType("Juvenile Petition");
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Emergency Custody");
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Shelter Order");
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Removal");
		 newLegalAction_OmniScriptPage.courtActionType("Hearing");
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Shelter");
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Adjudication");
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Dispositional");
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Review");
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Permanency"); 
		 newLegalAction_OmniScriptPage.verifyCourtActionSubtypeOption("Termination of Parental Rights"); 
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
		 courtActionOutcomesPage.setlectType("Custody Granted");
		 courtActionOutcomesPage.provideDate();
		 courtActionOutcomesPage.enterCourtActionID("6488");
		 courtActionOutcomesPage.verifyFutureDate();
		 courtActionOutcomesPage.provideTodayDate();
		 courtActionOutcomesPage.Savebutton();
			
		 homePage_SFDCPage.closeTabs();
			 
		
	}
	
}
