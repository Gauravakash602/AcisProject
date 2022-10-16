package com.acis.automation.testcases.investigation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0092_FreezeInvestigationTest extends TestBase{
	
	final static Logger logger = LoggerFactory.getLogger(_0092_FreezeInvestigationTest.class);

	public _0092_FreezeInvestigationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	int count1;
	String allegationID,caseID;
	
	String firstName = faker.name().firstName();
	String middleName =faker.name().lastName();
	String lastName = faker.name().lastName();
	
	
	String secondFirstName = faker.name().firstName();
	String secondMiddleName = faker.name().firstName();
	String secondLastName = faker.name().lastName();
	
	String maltreator = secondFirstName.concat(" ").concat(secondMiddleName).concat(secondLastName);
	String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	
//The Acceptance Criteria -> A-000168 can not be Automated because the status of Freeze Assessment CheckBox is Non Automatable
	
	@Test(description = "US-0000369: Freeze Investigation", groups = { "High",
			"ACIS_Regression", "Prateeksha" })
	public void FreezeInvestigation() throws AcisException, Exception {

	allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondFirstName, secondMiddleName, secondLastName);
          loginTest.logout();
          loginTest.intakeTest.intakeApproval(allegationID);
          loginTest.logout();
          loginTest.login("Supervisor");
          loginTest.investigationTest.getInvestigationID(allegationID);
	homePage_SFDCPage.closeTabs();
	homePage_SFDCPage.searchGlobal(allegationID);
	investigationCasePage.clickDetailsTabOfInvestigation();
	investigationCasePage.changeStatusToApproved("Approved");
	investigationCasePage.saveButton();
	investigationCasePage.changeStatusToApproved("In Progress");
	investigationCasePage.saveButton();
	investigationCasePage.errorMessage();
	investigationCasePage.clickOnCancel();
	
	//Verifying Error Message on Details Tab
	investigationCasePage.errorOnDetailsTab();
	investigationCasePage.saveButton();
	investigationCasePage.errorMessage();
	investigationCasePage.clickOnCancel();
	
	//Verifying Error Message on Related Tab - Case Person
	investigationCasePage.clickRelatedTab();
	investigationCasePage.verifingButtonsOnRelatedTab();
	investigationCasePage.clickCasePersonTab();
	investigationCasePage.clickNewPerson();
	investigationCasePage.errorMessage();
	investigationCasePage.clickNewRelationship();
	investigationCasePage.errorMessage();
	investigationCasePage.closeCasePersonTab();
	
	//Verifying Error Message on Related Tab - Assessment
	investigationCasePage.clickRelatedTab();
	investigationCasePage.clickAssessmentsTab();
	investigationCasePage.errorOnDecisionMakingToolTab();
	investigationCasePage.errorOnNewSafetyAssessmentTab();
	investigationCasePage.closeAssessmentsTab();
	
	
	//Verifying Error Message for a Case Person
	investigationCasePage.clickRelatedTab();
	investigationCasePage.clickCasePersonTab();
	investigationCasePage.errorOnCasePerson("1");
	investigationCasePage.saveButton();
	investigationCasePage.errorMessage();
	investigationCasePage.clickOnCancel();
		}
	}


