package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PermanencyDashboardDefaultPermanencyGoalTest_0602 extends TestBase {

	public PermanencyDashboardDefaultPermanencyGoalTest_0602() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(PermanencyDashboardDefaultPermanencyGoalTest_0602.class);
	String allegationID,fosterCaseID , fullName;
	int count;
	
	
	@Test(description = " US:0602 : Permanency Dashboard - Default Permanency Goal", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 2)
		public void permanencyDashboardDefaultPermanencyGoalActual() throws AcisException, Exception {
	
		
			System.out.println("in test case 60");
			String firstName = faker.name().firstName();
			String middleName =faker.name().lastName();
			String lastName = faker.name().lastName();
			fullName = firstName+" "+lastName;
		
			String childFirstName="child".concat(faker.name().firstName());
			String childMiddleName=faker.name().firstName();;
			String childLastName=faker.name().lastName();
			String childFullName= childFirstName + " " + childMiddleName + " " +childLastName;
			
			
			allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			fosterCaseID= loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName);
			
			fosterCareCase_Page.clickAssignOwner();
			caseAssignmentPage.selectApproval("Override");
			caseAssignmentPage.selectNewOwner("Case Worker");
			caseAssignmentPage.enterComments("Demo");
			caseAssignmentPage.clickSubmit();
			
			loginTest.logout();
			loginTest.login("OOHWorker");
			loginTest.caseMangementTest.searchFosterCaseID(fosterCaseID);
			
					
			/*Case management Pre-requisite*/
			caseActionPage.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			 homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			fosterCareHomePage.checkPermanencyLabel();
			fosterCareHomePage.checkReunification(childFullName);
			homePage_SFDCPage.closeTabs(); 
		}
		
	
}
