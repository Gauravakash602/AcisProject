package com.acis.automation.testcases.casemanagement;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class LockClosedOOHServicesCaseRecordTest_402 extends TestBase {

	public LockClosedOOHServicesCaseRecordTest_402() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID,fosterCaseID , fullName;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	String childFirstName="child".concat(faker.name().firstName());
	String childMiddleName=faker.name().firstName();
	String childLastName=excel.getLastName();
	String childFullName= childFirstName + " " + childMiddleName + " " +childLastName;
	String childName= childFirstName +  " " +childLastName;
	
	int count;
	
	
	/* A-003055 : Can not be automated */
	
	@Test(description = " US:0402 : Lock Closed OOH Services Case Record : Supervisor", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void lockClosedOOHServicesCaseRecord() throws AcisException, Exception {
	
		count=0;
		fullName = firstName+" "+lastName;
		
		allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID);
		loginTest.logout();
		loginTest.login("Supervisor");
		fosterCaseID = loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName);
	
		
		/*Create Case Person*/
		caseActionPage.clickRelatedTab();
		fosterCareCase_Page.clickPersonTab();
		fosterCareCase_Page.clickNewPerson();
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		personsInvovled_CP_OmniscriptPage.provideBirthdate("first", String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)));
		personsInvolved_SA_OmniscriptPage.provideDateOfDeath();
		personsInvolved_SA_OmniscriptPage.selectCauseOfDeath("Injury");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvolved_SA_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
		investigationCasePage.closeCasePersonTab();	
		
		
//		 /*Edit Person from person account and making age between 18 to 21*/
//		 caseActionPage.clickRelatedTab();
//		 fosterCareCase_Page.clickPersonTab();
//		 investigationCasePage.clickCasePerson(childFullName);
//		 editPersonAccountPage.clickEditButton("second");
//		 editPersonAccountPage.enterTextFieldValue("ageTextBoxClear", "");
//		 editPersonAccountPage.provideBirthdate(String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-22)));
//		 editPersonAccountPage.clickSaveButton();
//		 personsInformationPage.closePersonTab(childFullName);
//		 investigationCasePage.closeCasePersonTab();
		
			
		/*File Close*//*Supervisor Approval part*/
		fosterCareCase_Page.refreshPageAndWait(10);
		fosterCareCase_Page.clickCloseCaseButton();
		caseClosureDecisionPage.enterTextFieldValue("Demo comment");
		caseClosureDecisionPage.ClickOnSupervisoryApproval("Accept");
		caseClosureDecisionPage.clickSubmitbtn();
		fosterCareCase_Page.refreshPageAndWait(10);
		caseActionPage.checkStatusValue("Closed");
		
		count++;
		
		/*Check status*/
		 caseActionPage.clickDetailsTab();
		 detailsCaseActionPage.clickEditStatus();
	     detailsCaseActionPage.checkStatusValue("Closed");	 
	     detailsCaseActionPage.checkStatusValueByValue("In Progress");
	     detailsCaseActionPage.checkStatusValueByValue("Making Revisions");
	     detailsCaseActionPage.checkStatusValueByValue("In Supervisor Review");
	     detailsCaseActionPage.clickCancelButton();
	     
	     /*Checking Buttons : Follow and Edit must be present*/
	     fosterCareCase_Page.verifyButtonsPresent();
	     
	   //Verifying Error Message on Related Tab - Assessment
	 	investigationCasePage.clickRelatedTab();
	 	investigationCasePage.clickAssessmentsTab();
	 	fosterCareCase_Page.verifyErrorOnDecisionMakingToolTab();
	 	fosterCareCase_Page.verifyErrorOnNewSafetyAssessmentTab();
	 	investigationCasePage.closeAssessmentsTab();
	    
	 	
	    //Verifying Error Message on Insights Tab - Placement
	 	investigationCasePage.clickInsightTabOfInvestigation();
	 	fosterCareCase_Page.clickPlacementTab();
	 	fosterCareCase_Page.verifyErrorOnNewPlacementTab();
	}
	
	
	
	@Test(description = " US:0402 : Lock Closed OOH Services Case Record : OOH Worker", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void lockClosedOOHServicesCaseRecordOOHWorker() throws AcisException, Exception {
		
	if(count==1)
	{
		loginTest.login("OOHWorker");
		loginTest.caseMangementTest.searchFosterCaseID(fosterCaseID);
		
		/*Check status*/
		 caseActionPage.clickDetailsTab();
		 detailsCaseActionPage.clickEditStatus();
	     detailsCaseActionPage.checkStatusValue("Closed");	 
	     detailsCaseActionPage.checkStatusValueByValue("In Progress");
	     detailsCaseActionPage.checkStatusValueByValue("Making Revisions");
	     detailsCaseActionPage.checkStatusValueByValue("In Supervisor Review");
	     detailsCaseActionPage.clickCancelButton();
	     
	     /*Checking Buttons : Follow and Edit must be present*/
	     fosterCareCase_Page.verifyButtonsPresent();
	     
	   //Verifying Error Message on Related Tab - Assessment
	 	investigationCasePage.clickRelatedTab();
	 	investigationCasePage.clickAssessmentsTab();
	 	fosterCareCase_Page.verifyErrorOnDecisionMakingToolTab();
	 	fosterCareCase_Page.verifyErrorOnNewSafetyAssessmentTab();
	 	investigationCasePage.closeAssessmentsTab();
	    
	 	
	    //Verifying Error Message on Insights Tab - Placement
	 	investigationCasePage.clickInsightTabOfInvestigation();
	 	fosterCareCase_Page.clickPlacementTab();
	 	fosterCareCase_Page.verifyErrorOnNewPlacementTab();
		
	}
	else {
		throw new Exception("Pre-requisite of  Does Not completed Successfully, so can not run this test");
	}
	
}
}
