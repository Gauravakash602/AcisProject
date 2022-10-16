package com.acis.automation.testcases.basicMethods;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class CaseMangementTest extends TestBase{

	public CaseMangementTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID ;
	String firstName = faker.name().firstName();
	String middleName =faker.name().lastName();
	String lastName = faker.name().lastName();
	Actions act = new Actions(driver);
	
	@Test(description = "Create Foster Care Case from Specific Case Head", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public String createFosterCareCaseFromCaseHeadAndSearchID(String personName ) throws AcisException, Exception {
	
		String fosterCaseID ;
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.selectAllCaseHeads();
		homePage_SFDCPage.searchRecordAndClick(personName);
		fosterCaseID=caseHeadPage.newFosterCase();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		
		return fosterCaseID;
		
	}
	
	@Test(description = "Create Foster Care Case from First Case Head", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public String createFosterCareCaseFromFirstRecord() throws AcisException, Exception {
		
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.selectAllCaseHeads();
		homePage_SFDCPage.clickFirstRecord();
		fosterCaseID = caseHeadPage.newFosterCase();
		return fosterCaseID;
	}
	
	
	
	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public String FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				personsInvovled_CP_OmniscriptPage.searchNewPerson("First");
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", firstName, middleName, lastName);
				personsInvovled_CP_OmniscriptPage.clickPrimaryAddress();
				personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first","street1", "17 toms dr");
				personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "city", "bloomington");
				personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "zipcode","61701");
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.prvoideGender("first", "Male");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				String FullName=firstName.concat(" ").concat(lastName);
				return (FullName);
				
				
				//Adding Multiple case persons
//				addressPage.addCasePersonsInvolved(firstName);
//				personsInvovled_CP_OmniscriptPage.clickNextButton();
//				establishRelationships_CP_OmniScriptPage.clickSubmit();
	}
	
	
	
	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person with exisiting Address", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void FosterCareCreatePersonwithExistingAddress() throws AcisException, InterruptedException, IOException {
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				personsInvovled_CP_OmniscriptPage.searchNewPerson(firstName);
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", firstName, middleName, lastName);
				personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first","emailId", "ACIS@mail.com");
//				personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first","street1", "17 toms dr");
				act.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(10);
				act.sendKeys(Keys.SPACE).build().perform();
				Thread.sleep(10);
				act.sendKeys(Keys.TAB).build().perform();
				Thread.sleep(10);
				act.sendKeys(Keys.SPACE).build().perform();
				personsInvovled_CP_OmniscriptPage.clickPrimaryAddress();
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.prvoideGender("first", "Male");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				//Adding Multiple case persons
//				addressPage.addCasePersonsInvolved(firstName);
//				personsInvovled_CP_OmniscriptPage.clickNextButton();
//				establishRelationships_CP_OmniScriptPage.clickSubmit();
	}
	
	@Test(description = "Create Foster Care Case from Specific Case Head By Selecting Both Victim Maltreator", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public String createFosterCareCaseFromCaseHeadBySelectingMaltreatorVictimAndSearchID(String personName ) throws AcisException, Exception {
	
		String fosterCaseID ;
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.selectAllCaseHeads();
		homePage_SFDCPage.searchRecordAndClick(personName);
		fosterCaseID=caseHeadPage.newFosterCaseBySelectingMaltreatorAndVictim();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		
		return fosterCaseID;
		
	}
	@Test(description = "Global Search Foster Case ID", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public void searchFosterCaseID( String fosterCaseID) throws AcisException, Exception {
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
	}

	@Test(description = "Create Placement Resource Account", groups = {
			"High", "acisRegression", "Dharmesh" })
	
	public void createPlacementAccount(String accountName, String placementType ,String status,String specialNeeds,
										String capacity,String occupancy,String locationName,String street,String city,
										String state,String zipCode, String latitude, String longitude) 
					throws AcisException, InterruptedException, IOException {
		
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", accountName);
			placementResourcePage.setPlacementType(placementType);
			placementResourcePage.setStatus(status);
			placementResourcePage.selectSpecialNeeds(specialNeeds);
			placementResourcePage.setTextOnPlacement("Capacity", capacity);
			placementResourcePage.setTextOnPlacement("Occupancy", occupancy);
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("LocationName",locationName);
			placementResourcePage.setTextOnSite("Street", street);
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", city);
			placementResourcePage.setState(state);
			placementResourcePage.setTextOnSite("ZipCode",zipCode);
			placementResourcePage.setTextOnSite("Latitude",latitude);
			placementResourcePage.setTextOnSite("Longitude",longitude);
			providerAgencyAccountPage.clickOnSaveSite();
			
		}

}
