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
import com.acis.automation.pages.interaction.ConductStaffingPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class _1253_ConductStaffingTest extends TestBase {
	
	final static Logger logger = LoggerFactory.getLogger(_1253_ConductStaffingTest.class);
	
	public _1253_ConductStaffingTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String fosterCaseID;
	
	String firstName = faker.name().firstName();
	String middleName =faker.name().lastName();
	String lastName = faker.name().lastName();
	int count = 2;
	
	
// Test Script when case worker or Supervisor is on a Child Welfare Case account
	
	@Test(enabled = true, description = "US-0001253 IN - Conduct Staffing", groups = { "High",
			"acisRegression", "Prateeksha" },priority=3)
	public void ConductStaffingCase() throws AcisException, Exception {
		
		loginTest.login("Supervisor");
		fosterCaseID=loginTest. caseMangementTest.createFosterCareCaseFromFirstRecord();
		loginTest.caseMangementTest.FosterCareCreatePerson();
		loginTest.logout();
		loginTest.login("Supervisor");
		homePage_SFDCPage.closeTabs();
		home.verfiyHomePage();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		conductStaffingPage.interactions();
		//Switching to IFrame
		conductStaffingPage.iframeSwitch();
		conductStaffingPage.dateTime();
		conductStaffingPage.attempt();
		conductStaffingPage.selectType();
		conductStaffingPage.selectSubType("Staffing");
		conductStaffingPage.narrative("Text");
		conductStaffingPage.professionalOpinion("Text");
		conductStaffingPage.regarding();
		conductStaffingPage.participants("Automated Process");
		conductStaffingPage.saveButton();
		conductStaffingPage.confirmationMessage();
		//Switching back to Default Content
		conductStaffingPage.switchToDefaultContent();
		//To view the Added Users on User related list on Interaction.		
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		conductStaffingPage.refreshPageAndWait(15);
		conductStaffingPage.insightsTab();
		conductStaffingPage.verifyingUsers();

// The Acceptance Criteria -> A-002895 can not be Automated as we need to Validate it after 30 Days
	}
	
	
	
// Test Script when case worker or Supervisor is on a placement resource account
	
	@Test(enabled = true, description = "US-0001253 IN - Conduct Staffing", groups = { "High",
			"acisRegression", "Prateeksha" },priority=4)
	
	public void ConductStaffingPlacement() throws AcisException, Exception {
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		
		loginTest.login("Supervisor");
		fosterCaseID=loginTest. caseMangementTest.createFosterCareCaseFromFirstRecord();
		loginTest.caseMangementTest.FosterCareCreatePerson();
		loginTest.logout();
		loginTest.login("Supervisor");
		homePage_SFDCPage.closeTabs();
		home.verfiyHomePage();
		homePage_SFDCPage.clickDownArrowAccount();
		conductStaffingPage.allOptionForFosterParent();
		homePage_SFDCPage.searchRecordAndClick("Natlie Korson");
		licensingApplicationPage.relatedTab();
		conductStaffingPage.interactionsForPlacementResource();
		//Switching to IFrame
		conductStaffingPage.iframeSwitch();
		conductStaffingPage.dateTime();
		conductStaffingPage.attempt();
		conductStaffingPage.selectType();
		conductStaffingPage.selectSubType("Staffing");
		conductStaffingPage.narrative("Text");
		conductStaffingPage.professionalOpinion("Text");
		conductStaffingPage.regarding();
		conductStaffingPage.participants("Automated Process");
		conductStaffingPage.saveButton();
		conductStaffingPage.confirmationMessage();
		//Switching back to Default Content
		conductStaffingPage.switchToDefaultContent();
		//To view the Added Users on User related list on Interaction.
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		conductStaffingPage.allOptionForFosterParent();
		homePage_SFDCPage.searchRecordAndClick("Natlie Korson");
		conductStaffingPage.refreshPageAndWait(10);
		licensingApplicationPage.relatedTab();
		conductStaffingPage.verifyingUsers();
		
// The Acceptance Criteria -> A-002895 can not be Automated as we need to Validate it after 30 Days
	}

}


