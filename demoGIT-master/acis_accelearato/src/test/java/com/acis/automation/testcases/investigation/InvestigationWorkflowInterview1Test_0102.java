package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class InvestigationWorkflowInterview1Test_0102 extends TestBase {

	public InvestigationWorkflowInterview1Test_0102() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InvestigationWorkflowInterview1Test_0102.class);
	int count1, count2, count3;
	String allegationID1,allegationID2,allegationID3;
	
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
	
	String seventhfirstName = faker.name().firstName();
	String seventhmiddleName = faker.name().firstName();
	String seventhlastName = excel.getLastName();

	String victim1  = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	String maltreator1 = secondfirstName.concat(" ").concat(secondlastName);

	String victim2  = thirdfirstName.concat(" ").concat(thirdmiddleName).concat(" ").concat(thirdlastName);
	String maltreator2 = fourthfirstName.concat(" ").concat(fourthlastName);

	String victim3  = fifthfirstName.concat(" ").concat(fifthmiddleName).concat(" ").concat(fifthlastName);
	String maltreator3 = sixthfirstName.concat(" ").concat(sixthlastName);

	
	
	

	
	@Test(description = " US:0102 Investigation Workflow-Interview 1 - Investigation USer", groups = { "High",
			"acisRegression", "Mrunal" },priority = 2)

	public void investigationWorkflowInterviewInvestiagtionTest() throws AcisException, Exception {
	
			
			allegationID1=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID1);
			loginTest.logout();
			loginTest.login("Investigator");
			loginTest.investigationTest.openInvestigationCase(allegationID1);
		
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickInvestigationWorkflow();
			//workflow
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			// Add New Person
			personsInvovled_Workflow_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			personsInvovled_Workflow_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_Workflow_OmniscriptPage.setAllNames(seventhfirstName, seventhmiddleName, seventhlastName);
			personsInvovled_Workflow_OmniscriptPage.clickSaveButton("next");
			personsInvovled_Workflow_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_Workflow_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_Workflow_OmniscriptPage.clickNextButton();
		
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickCreateInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interview_OmniScriptPage.provideDate();
			interview_OmniScriptPage.prvoideType("Visit");
			interview_OmniScriptPage.selectAttempts("Successfull");
			interview_OmniScriptPage.prvoideLocation("Biological Home");
			interview_OmniScriptPage.prvoideSubType("Child");
			interview_OmniScriptPage.prvoideMethod("Phone");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
			interview_OmniScriptPage.clickParticipantCheckbox(maltreator1);
			interview_OmniScriptPage.clickSavebutton();
			interview_OmniScriptPage.verifyInterviewClosedTabMessage();
			interview_OmniScriptPage.closeCaregiverTab();
			interview_OmniScriptPage.clickNextButton();
			// Collateral
			collaterals_OmniScriptPage.clickCreateCollateral();
			collaterals_OmniScriptPage.iframeSwitch();
			collaterals_OmniScriptPage.setDate();
			collaterals_OmniScriptPage.selectAttempts("Successfull");
			collaterals_OmniScriptPage.typePicklist("Collateral");
			collaterals_OmniScriptPage.subTypePicklist("MentalHealth");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPerson", "Test");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
			collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
			collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
			collaterals_OmniScriptPage.clickSaveButton();
			collaterals_OmniScriptPage.verifyCollateralClosedTabMessage();
			collaterals_OmniScriptPage.closeCollateraltab();
			collaterals_OmniScriptPage.clickNextButton();
			homePage_SFDCPage.closeTabs();
			
		}
		
		
	
	
	
	
	
	@Test(description = " US:0102 Investigation Workflow-Interview 1 - Supervisor USer :Approval &Validation", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 4)


	public void investigationWorkflowInterviewSupervisorAproval() throws AcisException, Exception {
	
		allegationID2=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(thirdfirstName, thirdmiddleName, thirdlastName, fourthfirstName, fourthmiddleName, fourthlastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID2);
		loginTest.logout();
		loginTest.login("Supervisor");
		loginTest.investigationTest.openInvestigationCase(allegationID2);
	
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickInvestigationWorkflow();
		//workflow
		reviewAllegationReport_OmniScriptPage.clickNextButton();
		personsInvovled_Workflow_OmniscriptPage.clickNextButton();
		establishRelationships__OmniScriptPage.clickNextButton();
		interview_OmniScriptPage.clickCreateInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interview_OmniScriptPage.provideDate();
		interview_OmniScriptPage.prvoideType("Visit");
		interview_OmniScriptPage.selectAttempts("Successfull");
		interview_OmniScriptPage.prvoideLocation("Biological Home");
		interview_OmniScriptPage.prvoideSubType("Child");
		interview_OmniScriptPage.prvoideMethod("Phone");
		interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
		interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
		interview_OmniScriptPage.clickParticipantCheckbox(maltreator2);
		interview_OmniScriptPage.clickSavebutton();
		interview_OmniScriptPage.verifyInterviewClosedTabMessage();
		interview_OmniScriptPage.closeCaregiverTab();
		interview_OmniScriptPage.clickNextButton();
		// Collateral
		collaterals_OmniScriptPage.clickCreateCollateral();
		collaterals_OmniScriptPage.iframeSwitch();
		collaterals_OmniScriptPage.setDate();
		collaterals_OmniScriptPage.selectAttempts("Successfull");
		collaterals_OmniScriptPage.typePicklist("Collateral");
		collaterals_OmniScriptPage.subTypePicklist("MentalHealth");
		collaterals_OmniScriptPage.enterTextFieldValue("CollateralPerson", "Test");
		collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
		collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
		collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
		collaterals_OmniScriptPage.clickSaveButton();
		collaterals_OmniScriptPage.verifyCollateralClosedTabMessage();
		collaterals_OmniScriptPage.closeCollateraltab();
		collaterals_OmniScriptPage.clickNextButton();
		homePage_SFDCPage.closeTabs();
			
		
		
	}
	

	/*############################## This Functionality is INVALID NOW     #####################*/
	@Test(enabled = false,description = " US:0102 Investigation Workflow-Interview 1 - Investigation User Part 2", groups = { "High",
			"acisRegression", "Mrunal" },priority = 7)

	public void investigationWorkflowInterviewInvestiagtionTestPart2() throws AcisException, Exception {
	
		allegationID3=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(fifthfirstName, fifthmiddleName, fifthlastName, sixthfirstName, sixthmiddleName, sixthlastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID3);
		loginTest.logout();
		loginTest.login("Investigator");
		loginTest.investigationTest.openInvestigationCase(allegationID3);
		
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickInvestigationWorkflow();
		//workflow
		reviewAllegationReport_OmniScriptPage.clickNextButton();
		personsInvovled_Workflow_OmniscriptPage.clickNextButton();
		establishRelationships__OmniScriptPage.clickNextButton();
		interview_OmniScriptPage.clickCreateInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interview_OmniScriptPage.provideDate();
		interview_OmniScriptPage.prvoideType("Visit");
		interview_OmniScriptPage.selectAttempts("Successfull");
		interview_OmniScriptPage.prvoideLocation("Biological Home");
		interview_OmniScriptPage.prvoideSubType("Child");
		interview_OmniScriptPage.prvoideMethod("Phone");
		interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
		interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
		interview_OmniScriptPage.clickParticipantCheckbox(maltreator3);
		interview_OmniScriptPage.clickSavebutton();
		interview_OmniScriptPage.verifyInterviewClosedTabMessage();
		interview_OmniScriptPage.closeCaregiverTab();
		interview_OmniScriptPage.clickSaveForLaterbutton();
		interview_OmniScriptPage.clickOkbutton();
		interview_OmniScriptPage.verifySaveForLaterMessage();
		homePage_SFDCPage.closeTabs();

		
	}

}
