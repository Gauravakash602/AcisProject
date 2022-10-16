package com.acis.automation.testcases.personmanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ImplementNewTypeaheadInvWorkflowTest_00871 extends TestBase  {

	public ImplementNewTypeaheadInvWorkflowTest_00871() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ImplementNewTypeaheadInvWorkflowTest_00871.class);
	
	String investigationID , allegation_ID ;
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	int count;

	


	// Adding data
	@Test(priority=1,description = "US00871 : Implement Updates - Implement New/Remove Typeahead-Inv Workflow", groups = { "Medium",
			"ACIS_Regression", "Mrunal" })
	public void implementNewTypeaheadInvWorkflowgetInvestigationID() throws AcisException, Exception {

		
			allegation_ID =loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
			loginTest.logout();
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickFirstRecord();
			investigationID=investigationCasePage.getInvestigationID();
			count++;
	}

	@Test(description = "US00871 : Implement Updates - Implement New/Remove Typeahead-Inv Workflow" , groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 2)
	   public void implementNewTypeaheadInvWorkflow() throws AcisException, Exception 
	
	{
		if(count==1) {
			loginTest.login("Investigator");
			loginTest.caseMangementTest.searchFosterCaseID(investigationID);
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.searchPersonUsingvalidData("firstName", "a");
			reviewAllegationReport_OmniScriptPage.linkToCreateNewPerson();
			reviewAllegationReport_OmniScriptPage.setAllNames(firstName, middleName, lastName);
			reviewAllegationReport_OmniScriptPage.clickSaveButtonPersonsInvolved();
			reviewAllegationReport_OmniScriptPage.closeCreateIntakePerson();
			reviewAllegationReport_OmniScriptPage.clickRefresPersonButton();
			reviewAllegationReport_OmniScriptPage.searchPersonUsingvalidData("firstName", firstName);
			reviewAllegationReport_OmniScriptPage.searchRecordLabelsVerify();
		}
		else
		{
			throw new Exception("Pre-requisite for  Does Not completed Successfully, so can not run this test");

		}
		
	}
	
	    
}
