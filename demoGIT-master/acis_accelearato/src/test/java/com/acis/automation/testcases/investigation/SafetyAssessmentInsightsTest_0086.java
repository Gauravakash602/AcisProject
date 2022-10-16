package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SafetyAssessmentInsightsTest_0086 extends TestBase{

	public SafetyAssessmentInsightsTest_0086() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InvestigationCaseTest_0098.class);

	public static String allegationID;
	int count;

	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=faker.name().lastName();
	
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName = faker.name().lastName();
	

	@Test(description = " US:0086 Investigation Safety Assessment-Insights 1.3 ", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 2)

	public void veirfySafetyAssessmentInsights() throws AcisException, Exception {
			
		
			allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("Investigator");
			loginTest.investigationTest.openInvestigationCase(allegationID);
		
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelations_SA_OmniScriptPage.clickNextButton();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			safetyDecision_SA_OmniScriptPage.verifyInsightsSection();
	
		
 
	}
}

