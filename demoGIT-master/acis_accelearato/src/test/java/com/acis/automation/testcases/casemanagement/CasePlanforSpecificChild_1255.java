package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CasePlanforSpecificChild_1255 extends TestBase {

	public CasePlanforSpecificChild_1255()  throws AcisException{
		// TODO Auto-generated constructor stub
		super();
	}
	
	String fosterCaseID, casePlanID;
	String firstName = faker.name().firstName();
	String middleName = faker.name().firstName();
	String lastName = faker.name().lastName();
	
	
	@Test(enabled=true,description = "S-1255 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"Medium", "acisRegression", "Varun" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
			loginTest.login("Supervisor");
			fosterCaseID = loginTest.caseMangementTest.createFosterCareCaseFromFirstRecord();
//				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
//						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
//				home.verfiyHomePage();
//				homePage_SFDCPage.closeTabs();
//				homePage_SFDCPage.clickDownArrowCaseHead();
//				homePage_SFDCPage.selectAllCaseHeads();
//			    homePage_SFDCPage.clickFirstRecord();
//				fosterCaseID = caseHeadPage.newFosterCase();
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1255 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	@Test(enabled=true,description = "US:01255 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Varun" }, priority = 1)
	public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
//			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
//					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			loginTest.login("Supervisor");
//			home.verfiyHomePage();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			System.out.println(firstName+" "+middleName+" "+lastName);
			for(int i =0;i<=3;i++)
			{
			personsInvovled_CP_OmniscriptPage.searchNewPerson("First");
			personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", firstName, middleName, lastName);
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	
	@Test(enabled = true, description = "US-01255 Insights Tab - Case Plans & case plan review", groups = { "High",
			"acisRegression", "varun" }, priority = 3)
	public void CreatePlacementAccount() throws AcisException, Exception {

	
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		visitationPlan_OmniScriptPage.casePlan();
		// visitationPlan_OmniScriptPage.addPermanencyPlan("First");
		permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(firstName+" "+lastName);
		permanencyPlan_OmniScriptPage.primaryFirst("reunification");
		permanencyPlan_OmniScriptPage.setPermanencyNarrative("demo");
		permanencyPlan_OmniScriptPage.clickNextButton();
		servicesToTheChildren_OmniScriptPage.clickNextButton();
		serviceAgreementWithParents_OmniScriptPage.clickNextButton();
		visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
		visitationPlan_OmniScriptPage.addSiblingVisitations("No");
		visitationPlan_OmniScriptPage.clickNext();
		serviceToProviderPage.clickNext();
		serviceToProviderPage.generateCasePlan();
	
	}

	
	
}
