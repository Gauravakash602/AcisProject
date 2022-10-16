package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.testcases.basicMethods.InvestigationTest;
import com.acis.automation.utilities.AcisException;

public class EndDateInvestigationPersonTest_0114 extends TestBase{

	public EndDateInvestigationPersonTest_0114() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InvestigationCaseTest_0098.class);

	String allegationID ;
	int count1;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName = excel.getLastName();
	
	 String newfirstName = faker.name().firstName();
	 String newmiddleName = faker.name().firstName();
	 String newlastName = excel.getLastName();

//	 String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
//	 String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);
//	 String newPerson=newfirstName.concat(" ").concat(newmiddleName).concat(" ").concat(newlastName);
	
	 String  victim = firstName.concat(" ").concat(lastName);
	 String maltreator = secondfirstName.concat(" ").concat(secondlastName);
	 String newPerson=newfirstName.concat(" ").concat(newlastName);


	
	@Test(description = " US:0114 Investigation - End date investigation person - Actual TS Investigation USer", groups = { "High",
			"acisRegression", "Mrunal" },priority = 2)

	public void endDateInvestigationPersonTest() throws AcisException, Exception {
		
			
			allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("Investigator");
			loginTest.investigationTest.openInvestigationCase(allegationID);
			
			/*For Disposition Value : None*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(victim);
			
			investigationCasePage.clickEditButton();
			investigationCasePage.verifyRuledOutError();
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeCasePersonIdTab();
			investigationCasePage.closeCasePersonTab();
			
			/*For Disposition Value : Substantiated*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAllegationTab();
			investigationCasePage.clickCaseAllegationID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.selectDispositionValue("Substantiated");
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeAllegationIdTab();
			investigationCasePage.closeAllegationTab();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.verifyRuledOutError();
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeCasePersonIdTab();
			investigationCasePage.closeCasePersonTab();
			
			/*For Disposition Value : Unsubstantiated*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAllegationTab();
			investigationCasePage.clickCaseAllegationID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.selectDispositionValue("Unsubstantiated");
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeAllegationIdTab();
			investigationCasePage.closeAllegationTab();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.verifyRuledOutError();
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeCasePersonIdTab();
			investigationCasePage.closeCasePersonTab();
			
			/*For Disposition Value : Ruleout*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAllegationTab();
			investigationCasePage.clickCaseAllegationID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.selectDispositionValue("Ruled Out");
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeAllegationIdTab();
			investigationCasePage.closeAllegationTab();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(victim);
			investigationCasePage.clickEditButton();
			/*End Date error and adding next month end date*/
			investigationCasePage.verifyEndDateError();
			investigationCasePage.selectNextMonthEndDate();
			investigationCasePage.closeCasePersonIdTab();
			
		
			/*Adding new Investigation person*/
			investigationCasePage.clickAddInvestigationPersonButton();
			personInvovled_IP_OmniScriptPage.searchPersonUsingvalidData("firstName", "a");
			personInvovled_IP_OmniScriptPage.linkToCreateNewPerson();
			personInvovled_IP_OmniScriptPage.setAllNames("first", newfirstName, newmiddleName, newlastName);
			personInvovled_IP_OmniScriptPage.clickSaveButton("next");
			personInvovled_IP_OmniScriptPage.closeCreateIntakePerson();
			personInvovled_IP_OmniScriptPage.clickRefresPersonButton();
			personInvovled_IP_OmniScriptPage.clickNextButton();
			
			establishRelations_IP_OmniScriptPage.submitSafetyAssesment();
			
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(newPerson);
			investigationCasePage.clickEditButton();
			/*End Date error and adding next month end date*/
			investigationCasePage.verifyEndDateError();
			investigationCasePage.selectNextMonthEndDate();
			homePage_SFDCPage.closeTabs();
				
		}
		
	
}
