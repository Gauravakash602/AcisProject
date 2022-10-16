package com.acis.automation.testcases.personmanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class UpdateMessageOnPersonSearchAddTest_0884 extends TestBase  {

	public UpdateMessageOnPersonSearchAddTest_0884() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(UpdateMessageOnPersonSearchAddTest_0884.class);
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();

	
	@Test(description = "US 884 : Update Message on Person Search/Add : Data Creation" , groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 0)
	   public void updateMessageOnPersonSearchAddIntakeCreation() throws AcisException, Exception 
	
	{
		String allegation_ID;
		loginTest.login("Intake");
		loginTest.intakeTest.clickNewButtonFromAllAllegations();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegation_ID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
	}
	    
	
	@Test(description = "US 884 : Update Message on Person Search/Add " , groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 1)
	   public void updateMessageOnPersonSearchAddIntake() throws AcisException, Exception 
	
	{
		loginTest.login("Intake");
		loginTest.intakeTest.clickNewButtonFromAllAllegations();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", firstName, lastName);
		searchPerson_OmniscriptPage.selectPerson(firstName, lastName, "AllegedVictim", "No");
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.selectPerson("first", "last", "AllegedVictim", "No");
		searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", firstName, lastName);
		searchPerson_OmniscriptPage.selectPerson(firstName, lastName, "AllegedVictim", "No");
		searchPerson_OmniscriptPage.verifyPersonAddMessage();
	}
}
