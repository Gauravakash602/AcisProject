package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CreateOutofHomeServicesCaseTest_0162 extends TestBase {

	public CreateOutofHomeServicesCaseTest_0162() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(CreateOutofHomeServicesCaseTest_0162.class);
	String allegationID,fosterCaseID ,firstPersonName;
	int count;



	@Test(description = " US:0162 : Create Out-of-Home Services Case", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void createOutofHomeServicesCase() throws AcisException, Exception {
		
		String firstName=faker.name().firstName();
		String middleName=faker.name().lastName();
		String lastName=excel.getLastName();
		
		firstPersonName = firstName+" "+lastName;
		
		allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID);
		loginTest.logout();
		loginTest.login("Supervisor");
		loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(firstPersonName);
		
		   /*Case management Pre-requisite*/
	      caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
	      caseActionPage.checkLabelsOnCaseActionPage("Case Head");
	      caseActionPage.checkLabelsOnCaseActionPage("Status");
	      caseActionPage.checkLabelsOnCaseActionPage("Date Opened");
	      caseActionPage.checkLabelsOnCaseActionPage("Date Closed");
	      caseActionPage.checkStatusValue("New");
	      caseActionPage.checkDateOpnedValue();
	      caseActionPage.checkDateClosedValue();
	      caseActionPage.clickDetailsTab();
	      detailsCaseActionPage.clickEditStatus();
	      detailsCaseActionPage.checkStatusValue("New");
	      detailsCaseActionPage.checkStatusValue("In Progress");
	      detailsCaseActionPage.checkStatusValue("Submitted");
	      detailsCaseActionPage.checkStatusValue("Approved");
	      detailsCaseActionPage.checkStatusValue("Closed");
	      detailsCaseActionPage.clickCancelButton();
	      /*Invalid- We can not change Case Supervisor Value*/
/*	      detailsCaseActionPage.provideCaseSupervisorValue("ACIS Supervisor");
	      detailsCaseActionPage.clickSaveButton();
	      detailsCaseActionPage.checkCaseSupervisorValue("ACIS Supervisor");
*/	      detailsCaseActionPage.checkCaseOwnerValue("ACIS Supervisor");
	      homePage_SFDCPage.closeTabs();
	}

}
