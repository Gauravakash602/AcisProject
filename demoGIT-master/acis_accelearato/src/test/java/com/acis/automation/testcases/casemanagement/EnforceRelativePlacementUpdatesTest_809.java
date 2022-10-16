package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EnforceRelativePlacementUpdatesTest_809 extends TestBase{
	
	
	
	public EnforceRelativePlacementUpdatesTest_809() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(EnforceRelativePlacementUpdatesTest_809.class);
	String allegationID,fosterCaseID , firstPersonfullName, firstPersonName  , secondPersonfullName, secondPersonName;
	int count;
	
	@Test(enabled = false,description = "US:0809 : Enforce Relative Placement - Updates : Intake creation", groups = { "High",
		"acisRegression", "Mrunal" }, priority = 0)

	public void enforceRelativePlacementUpdatesIntake() throws AcisException, InterruptedException, IOException {


			String firstName=faker.name().firstName();
			String middleName=faker.name().lastName();
			String lastName=faker.name().lastName();
			
			String secondfirstName = faker.name().firstName();
			String secondmiddleName = faker.name().lastName();
			String secondlastName = faker.name().firstName();

			firstPersonfullName = firstName+" "+middleName+" "+lastName;
			firstPersonName = firstName+" "+ lastName;
			
			secondPersonfullName = secondfirstName +" " + secondmiddleName +" " + secondlastName;
			secondPersonName = secondfirstName+ " " + secondlastName;
			
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();

		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		
		createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage
//				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
	
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		
		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
//		createIntakePerson_OmniscriptPage
//				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		screeningDecision_OmniscriptPage.selectCaseHead(firstPersonfullName);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.clickSubmitbtn();

		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		count++;

	

}

	@Test(enabled = false,description = "US:01202 : Interactions Clean-Up : Intake approval", groups = { "High",
		"acisRegression", "Mrunal" }, priority = 1)
	public void enforceRelativePlacementUpdatesSupervisor() throws AcisException, Exception {
	if(count==1)
	{
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
		count++;
	}
		else {
			throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
		}

	
}



	@Test(description = "US:01202 : Interactions Clean-Up : Foster Care case", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void enforceRelativePlacementUpdates() throws AcisException, Exception {
	
		String firstName=faker.name().firstName();
		String middleName=faker.name().firstName();
		String lastName=excel.getLastName();
		
		String secondfirstName = faker.name().firstName();
		String secondmiddleName = faker.name().firstName();
		String secondlastName = excel.getLastName();

		firstPersonfullName = firstName+" "+middleName+" "+lastName;
		firstPersonName = firstName+" "+ lastName;
		
		secondPersonfullName = secondfirstName +" " + secondmiddleName +" " + secondlastName;
		secondPersonName = secondfirstName+ " " + secondlastName;


		allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithVictimMaltreator(firstName, middleName, lastName, 
																							secondfirstName, secondmiddleName, secondlastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID);
		loginTest.logout();
		loginTest.login("Supervisor");
		loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadBySelectingMaltreatorVictimAndSearchID(firstPersonName);
		
		 /*Case management Pre-requisite*/
	     caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
	
		/*check in Family finding*/
		locateRelativesPage.openFamilyFinding();
		locateRelativesPage.selectCheckBox("Ask family members");
		locateRelativesPage.verifyAttemptsOption();
		locateRelativesPage.clickNextButton();
		personsInvovledPage.clickNextButton();
		// Add relationship 
		establishRelationshipsPage.clickCreateAddButton();
		establishRelationshipsPage.searchText(firstPersonName, "Person");
		establishRelationshipsPage.setRelationShip("Child-Mother");
		establishRelationshipsPage.searchText( secondPersonName, "Related");
		establishRelationshipsPage.clickSaveButton("first");
		establishRelationshipsPage.clickNext();
		
		createPlacementResourcePage.selectPlacementCreate("Yes");
		createPlacementResourcePage.verifyKinshipMessage();
	
	
	  	}
	
}
