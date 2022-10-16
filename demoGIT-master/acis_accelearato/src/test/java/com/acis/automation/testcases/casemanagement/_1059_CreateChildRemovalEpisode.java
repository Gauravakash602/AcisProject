package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1059_CreateChildRemovalEpisode extends TestBase {

	public _1059_CreateChildRemovalEpisode() throws AcisException{
		// TODO Auto-generated constructor stub
	}
	String allegationID, fosterCaseID;
	
	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();

	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().lastName();
	String childLastName = faker.name().lastName();
	
	@Test(enabled =false,description = "US:01059 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:01059 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	@Test(enabled =false,description = "S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			 {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				System.out.println(childFirstName+" "+childMiddleName+" "+childLastName);
				personsInvovled_CP_OmniscriptPage.searchNewPerson("First");
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();
			 }
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}
	@Test(description = "S-01059 Case Management - Create Child Removal Episode", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 2)
	public void ChildRemovalEpisode() throws AcisException, InterruptedException, IOException {
		try {
			{
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase("C-00001696");
				fosterCareCase_Page.clickRelatedTab();
				courtActionOutcomesPage.childRemovalEpisode();
			}
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"S-01059 Case Management - Create Child Removal Episode");
		
	}
	}
}
