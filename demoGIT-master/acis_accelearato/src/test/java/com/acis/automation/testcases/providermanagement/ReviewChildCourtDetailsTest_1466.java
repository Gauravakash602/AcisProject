package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class ReviewChildCourtDetailsTest_1466 extends TestBase {
	
	final static Logger logger = LoggerFactory.getLogger(ReviewChildCourtDetailsTest_1466.class);
	
	public ReviewChildCourtDetailsTest_1466() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(description = "S-1466 - Review Child Court Details", groups = { "High",
			"acisRegression", "Prateeksha" })
	public void reviewChildCourtDetails() throws AcisException, Exception {
		
		String fosterCaseID;

		String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
		
		String judgeName = faker.name().firstName();
		
		String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
		
		
		
		loginTest.login("Supervisor");
		fosterCaseID=loginTest. caseMangementTest.createFosterCareCaseFromFirstRecord();
		loginTest.caseMangementTest.FosterCareCreatePerson();
		loginTest.logout();
		
		loginTest.login("OOHWorker");		
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		fosterCareCase_Page.clickRelatedTab();
		fosterCareCase_Page.clickPersonTab();	
		investigationCasePage.clickNewPerson();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", parentFirstName + " " + parentLastName);
		//personsInvovled_OmniscriptPage.personInvolvedFromExistingRecord("Raghav","singh");		
		searchPerson_OmniscriptPage.selectingAddingPerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();	
		personsInvovled_OmniscriptPage.closeCasePersonTab();	
		investigationCasePage.closeCasePersonTab();
		investigationCasePage.clickInsightTabOfInvestigation();
		fosterCareCase_Page.clickCourtAction();	
		courtActionPage.clickNewCourtActionButton();
		
	
		courtActionPage.courtActionDateTime();		
		courtActionPage.courtActionType("Adjudication");
		courtActionPage.enterJudgeName(judgeName);	
		courtActionOutcomesPage.addCourtActionParticipant("Name:"+" "+parentFirstName + " " + parentLastName+";");
		//courtActionPage.courtActionParticipant();		
		courtActionPage.clickSaveButton();
	
		
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
        homePage_SFDCPage.selectAllAccount();
        homePage_SFDCPage.searchGlobalAccountRecord(parentFirstName + " " +  parentLastName);
		addressPage.RelatedTabPersonAccount();
		courtActionPage.clickCourtActionPersonAccount();
		courtActionPage.verifyCourtActionDetails("Adjudication",judgeName);
		
		
		//Switching to Portal Page
		accountPage.switchLoginPage();
		accountPage.enterUsernamePassword(userName, password);
		personHealthAppointmentsPage.clickOnParent1PersonAccount(parentFirstName + " " + parentLastName);
		accountPage.clickRelatedTab();
		courtActionPage.clickCourtActionPersonAccount();
		courtActionPage.verifyCourtActionDetails("Adjudication",judgeName);
	}
}