package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;


public class OOHServicesCasePageNewSafetyAssessmentTest_0324 extends TestBase {

	public OOHServicesCasePageNewSafetyAssessmentTest_0324() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(OOHServicesCasePageNewSafetyAssessmentTest_0324.class);
	
	String allegationID,fosterCaseID , fullName;
	int count;
	
	

	/*############# Child welfare User = Intake + Investigation + OOH case worker #######################*/
	
	/*#####################  Intake User dnt have permission to edit SA so not including ###########################*/

	@Test(description = " US:0324 : OOH Services Case Page - New Safety Assessments: Intake USer", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void oohServicesCasePageNewSafetyAssessmentIntakeUser() throws AcisException, Exception {
		
		String firstName=faker.name().firstName();
		String middleName=faker.name().firstName();
		String lastName=faker.name().lastName();
		
		allegationID=loginTest.intakeTest.intakeCreationInvestigationWithOnePerson(firstName, middleName, lastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID);
		count++;
		loginTest.logout();
		loginTest.login("OOHWorker");
		loginTest.investigationTest.openInvestigationCase(allegationID);
		
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickAssessmentsTab();
		investigationCasePage.clickNewSafetyAssessmentButton();
		homePage_SFDCPage.closeTabs();
		
	}
	

	@Test(description = " US:0324 : OOH Services Case Page - New Safety Assessments: Investigation USer", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 3)
	public void oohServicesCasePageNewSafetyAssessmentInvestigation() throws AcisException, Exception {
	
	if(count==1)	
	{
		loginTest.login("Investigator");
		loginTest.investigationTest.openInvestigationCase(allegationID);
		
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickAssessmentsTab();
		investigationCasePage.clickNewSafetyAssessmentButton();
		homePage_SFDCPage.closeTabs();
		
	}
	else {
		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
	}
	
	}

}
