package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1215_ViewPlacementSearchResultsTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1215_ViewPlacementSearchResultsTest.class);

	public _1215_ViewPlacementSearchResultsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;
	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);
	String childsecondName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"), 3);
	String childsecondMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"), 3);
	String childsecondLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"), 3);
	int count = 2;

	@Test(description = "US:1215 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 1)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.clickFirstRecord();
				fosterCaseID = caseHeadPage.newFosterCase();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(description = "US:1215 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 1)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 3) {
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
				personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.prvoideGender("first","Male");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.searchNewPerson(childsecondName);
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childsecondName, childsecondMiddleName, childsecondLastName);
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2019");
				personsInvovled_CP_OmniscriptPage.prvoideGender("first","Male");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
				establishRelationships_CP_OmniScriptPage.searchText("Person", childFirstName);
				establishRelationships_CP_OmniScriptPage.setRelationShip("Sibling-Sibling");
				establishRelationships_CP_OmniScriptPage.searchText("Related", childsecondName);
				establishRelationships_CP_OmniScriptPage.clickSubmit();				
				fosterCareCase_Page.clickPlacementTab();
				fosterCareCase_Page.clickNewPlacement();
				newPlacement_OmniScriptPage.selectICPCPlacement("No");
				newPlacement_OmniScriptPage.selectTypeOfPlacement("Kinship");
				newPlacement_OmniScriptPage.enterZipCode("90036");
				providerAgencyAccountPage.setTextOnSite("Latitude", "34.0662764");
				providerAgencyAccountPage.setTextOnSite("Longitude", "-118.3501339");
				providerAgencyAccountPage.setTextOnSite("LocationName", "Demo Location new");
				providerAgencyAccountPage.clickOnSaveSite();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
}
