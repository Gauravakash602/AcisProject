package com.acis.automation.testcases.investigation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1496_AddFosterParentToInvestigationAsAllegedMaltreatorTest extends TestBase{
	
	final static Logger logger = LoggerFactory.getLogger(_1496_AddFosterParentToInvestigationAsAllegedMaltreatorTest.class);

	public _1496_AddFosterParentToInvestigationAsAllegedMaltreatorTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String allegationID,caseID;
	
	String firstName = faker.name().firstName();
	String middleName =faker.name().lastName();
	String lastName = faker.name().lastName();
	
	
	String secondFirstName = faker.name().firstName();
	String secondMiddleName = faker.name().firstName();
	String secondLastName = faker.name().lastName();
	
	
	String maltreator = secondFirstName.concat(" ").concat(secondMiddleName).concat(secondLastName);
	String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);


	
	@Test(description = "US-0001496 - Add Foster Parent to Investigation as Alleged Maltreator", groups = { "High",
			"acisRegression", "Prateeksha" },priority = 1)

	public void addFosterParentToInvestigationAsAllegedMaltreatorFlow1() throws AcisException, Exception {
		
		allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondFirstName, secondMiddleName, secondLastName);
		            loginTest.logout();
		            loginTest.intakeTest.intakeApproval(allegationID);
		            loginTest.logout();
		            loginTest.login("Investigator");
		            loginTest.investigationTest.openInvestigationCase(allegationID);
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickNewPerson();
			investigationCasePage.waitForPageLoadTill(10);
			investigationCasePage.closeCasePersonTab();
			investigationCasePage.addButtonPlacementResourceInformation();
			investigationCasePage.searchingPlacementResource("Ricky  Wayne");
			investigationCasePage.clickSaveButtonOfPlacement();
			investigationCasePage.checkAddedPersons(" Ricky  Wayne"," John  Jhones");	
		}
		
	
	//Alternate flow for adding Foster Parent To Investigation As Alleged Maltreator
	
	@Test(description = "US-0001496 - Add Foster Parent to Investigation as Alleged Maltreator - Alternate Flow", groups = { "High",
			"acisRegression", "Prateeksha" },priority = 2)

	public void addFosterParentToInvestigationAsAllegedMaltreatorFlow2() throws AcisException, Exception {
		
		allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondFirstName, secondMiddleName, secondLastName);
            loginTest.logout();
            loginTest.intakeTest.intakeApproval(allegationID);
            loginTest.logout();
            loginTest.login("Investigator");
            loginTest.investigationTest.getInvestigationID(allegationID);
        homePage_SFDCPage.closeTabs();
        homePage_SFDCPage.searchGlobal(allegationID);
        investigationCasePage.clickOnWorkflow();
		investigationCasePage.addButtonPlacementResourceInformation();
		investigationCasePage.searchingPlacementResource("Ricky  Wayne");
		investigationCasePage.clickSaveButtonOfPlacement();
		investigationCasePage.checkAddedPersons(" Ricky  Wayne"," John  Jhones");
		}
	}
	
	
	
	
	
	
	
	
	
	
	