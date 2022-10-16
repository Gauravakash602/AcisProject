package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonRelatedToFilterEstablishingRelationshipsTest_1029 extends TestBase {

	public PersonRelatedToFilterEstablishingRelationshipsTest_1029() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	 String firstName = faker.name().firstName();
	 String middleName = "";
	 String lastName = faker.name().lastName();

	 String secondfirstName = faker.name().firstName();
	 String secondmiddleName = "";
	 String secondlastName = faker.name().lastName();
	 String  victim = firstName.concat(" ").concat(lastName);
	 String maltreator = secondfirstName.concat(" ").concat(secondlastName);
	public static String allegationID, victimSecond;

	@Test(priority = 0, description = "US-1029: filter establish relationship of intake test case", groups = { "Simple",
			"ACIS_Regression", "khushboo" })
	public void filterEstablishingRelationshipsIntake() throws AcisException, Exception {
		allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
		loginTest.logout();			
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		investigationTest.intakeApproval();
		loginTest.logout();			
		loginTest.login("OOHWorker");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		investigationCasePage.clickRelatedTab();
		investigationSafetyAssessmentPage.newSafetyAssesment();
		reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
		personsInvolved_SA_OmniscriptPage.clickNextButton();
		establishRelations_SA_OmniScriptPage.clickCreateAddButton();
		establishRelations_SA_OmniScriptPage.checkMessage();
		establishRelations_SA_OmniScriptPage.selectRelation("Person","Name:"+" "+victim+";");
		/* establishRelations_SA_OmniScriptPage.checkTexT("Person", victim); */
		establishRelations_SA_OmniScriptPage.setRelationShip("Child-Mother");
		establishRelations_SA_OmniScriptPage.checkTexT("Related",maltreator);
		establishRelations_SA_OmniScriptPage.clickSaveButton();

	}

	@Test(priority = 1, description = "US-1029: filter establish relationship of foster care", groups = { "Simple",
			"ACIS_Regression", "khushboo" })
	public void filterEstablishingRelationshipsFosterCare() throws AcisException, InterruptedException, IOException {
		loginTest.login("OOHWorker");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		allegationReportPage.clickRelatedTabInvestigation();
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
		establishRelations_SA_OmniScriptPage.checkMessage();
		establishRelationships_CP_OmniScriptPage.checkText("Person", firstName);
		establishRelationships_CP_OmniScriptPage.setRelationShip("Child-Mother");
		establishRelationships_CP_OmniScriptPage.checkText("Related",secondfirstName);
		establishRelationships_CP_OmniScriptPage.clickSaveButton("Save");

	}
}
