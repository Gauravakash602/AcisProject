package com.acis.automation.testcases.intake;

import java.io.IOException;
import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class RemoveRelationshipFieldTest_0311 extends TestBase{

	public RemoveRelationshipFieldTest_0311() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(RemoveRelationshipFieldTest_0311.class);
	
	@Test(description = "US-0311: Remove Relationship Field from Intake Omniscript", groups = { "Simple",
			"aCIS_Regression", "Mrunal" })
	   public void verifyRemoveRelationshipFieldTest() throws AcisException, InterruptedException, ParseException, IOException {
	
		String firstName = faker.name().firstName();
		String middleName = faker.name().firstName();
		 String lastName = faker.name().lastName();

			
		loginTest.login("Intake");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();
		createIntakePerson_OmniscriptPage.verifyspecificFieldPresent();
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();
		personsInvovled_OmniscriptPage.verifyspecificFieldPresent();
		personsInvovled_OmniscriptPage.clickSaveButton("first");
		homePage_SFDCPage.closeTabs();
		
		
	}
	
}
