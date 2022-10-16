package com.acis.automation.testcases.reporting;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class MonthlyVisitsReportUpdatesRequestedforS0415Part2Test_01058 extends TestBase  {

	public MonthlyVisitsReportUpdatesRequestedforS0415Part2Test_01058() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(MonthlyVisitsReportUpdatesRequestedforS0415Part2Test_01058.class);

	String allegationID,fosterCaseID ;
	int count;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName =excel.getLastName();

	String  fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	String secondPersonFullName = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);
	String secondPersonName = secondfirstName.concat(" ").concat(secondlastName);

	
	@Test(description = "Create placement account", groups = {
			"High", "acisRegression", "Mrunal" }, priority = 0)
	public void createPlacementAccount() throws AcisException, InterruptedException, IOException {
		
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData("Demo", 3));
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setStatus("OnHold");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.setTextOnPlacement("Capacity", testData.get(Constants.PlacementAccount_SHEET).get("capacity"));
			placementResourcePage.setTextOnPlacement("Occupancy", testData.get(Constants.PlacementAccount_SHEET).get("occupancy"));
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("Street", testData.get(Constants.PlacementAccount_SHEET).get("street"));
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", testData.get(Constants.PlacementAccount_SHEET).get("city"));
			placementResourcePage.setState(testData.get(Constants.PlacementAccount_SHEET).get("state"));
			placementResourcePage.setTextOnSite("ZipCode", testData.get(Constants.PlacementAccount_SHEET).get("zipCode"));
			placementResourcePage.setTextOnSite("Latitude", testData.get(Constants.PlacementAccount_SHEET).get("latitude"));
			placementResourcePage.setTextOnSite("Longitude", testData.get(Constants.PlacementAccount_SHEET).get("longitude"));
			placementResourcePage.setTextOnSite("LocationName", testData.get(Constants.PlacementAccount_SHEET).get("locationName"));
			providerAgencyAccountPage.clickOnSaveSite();
			count++;
		
	}	
		
	
	@Test(description = "US:01058 : Monthly Visits report - Updates Requested for S-0415 (part 2) ", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void createOutofHomeServicesCase() throws AcisException, Exception {
	
	if(count==1)	
	{
		allegationID = loginTest.intakeTest.intakeCreationFosterCareCaseWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID);
		loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName);

		caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
		
		/*Create placement and check under case person whether it is getting created*/
		
		fosterCareCase_Page.clickPlacementTab();
		fosterCareCase_Page.clickNewPlacement();

//		newPlacement_OmniScriptPage.enterTextChildTextbox(childFirstName+" "+childLastName);
		newPlacement_OmniScriptPage.clickDownIconEdit();
		newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
		newPlacement_OmniScriptPage.saveButton();
		newPlacement_OmniScriptPage.selectICPCPlacement("No");
		newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
		newPlacement_OmniScriptPage.enterZipCode("90036");
		newPlacement_OmniScriptPage.selectStartDate();
		newPlacement_OmniScriptPage.clickSearchButton();				
		placementSearchResults_OmniScriptPage.verifyLabels();
		placementSearchResults_OmniScriptPage.selectFirstRecord();
		placementSearchResults_OmniScriptPage.clickSubmitButton();	
		
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickCasePersonTab();
		investigationCasePage.verifyCasePersondetails("");
		investigationCasePage.closeCasePersonTab();
		
		/*Create Interaction of type Collateral contact*/
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickInteractionsTab();
		newInteractionVisitsPage.clickNewbtnOfInteraction();
		newInteractionPage.selectInteractionType("CollateralContact");
		newInteractionPage.clickNextButton();
		
		collateralTypeInteractionPage.iframeSwitch();
		collateralTypeInteractionPage.selectDate();
		collateralTypeInteractionPage.selectAttempts("Successfull");
		collateralTypeInteractionPage.prvoideType("Collateral");
		collateralTypeInteractionPage.setSubtype("medical");
		collateralTypeInteractionPage.setText("CollateralName", "Test");
		collateralTypeInteractionPage.setText("Narrative", "Test1 narrative");
		collateralTypeInteractionPage.setText("ProffesionalOpinion", "Test2 Professional ");
		collateralTypeInteractionPage.clickSave();
		collateralTypeInteractionPage.closeNewInteraction();
		
		investigationCasePage.closeInteractionTab();
		
		
		/*Make a case person unactive*/
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickCasePersonTab();
		/*Open a case person ID*/
		
		investigationCasePage.clickCasePersonID(secondPersonFullName);
		investigationCasePage.clickEditButton();
		investigationCasePage.verifyEndDateError();
		investigationCasePage.clickSaveButton();
		
		/* ######### Can not automate ################### 8/
		/*Provide end date - code pending*/
	
		/*Create Interaction of type Meeting*/
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickInteractionsTab();
		newInteractionVisitsPage.clickNewbtnOfInteraction();
		newInteractionPage.selectInteractionType("Meeting");
		newInteractionPage.clickNextButton();
		
		meetingTypeInteractionPage.iframeSwitch();
		meetingTypeInteractionPage.provideDate();
		meetingTypeInteractionPage.prvoideType("Visit");
		meetingTypeInteractionPage.selectAttempts("Successfull");
		meetingTypeInteractionPage.prvoideLocation("Biological Home");
		meetingTypeInteractionPage.prvoideSubType("Child");
		meetingTypeInteractionPage.prvoideMethod("FaceToFace");
		meetingTypeInteractionPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
		meetingTypeInteractionPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
		meetingTypeInteractionPage.checkParticipantNotPresent(secondPersonName);
		meetingTypeInteractionPage.clickParticipantCheckbox(fullName);
		meetingTypeInteractionPage.clickSavebutton();
		meetingTypeInteractionPage.closeNewInteraction();
		
		investigationCasePage.closeInteractionTab();
	
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickInteractionsTab();
		investigationCasePage.checkTypeOfInteractionCreated("Meeting");
		investigationCasePage.checkTypeOfInteractionCreated("Collateral Contact");
		
		investigationCasePage.closeInteractionTab();

	}
	else {
		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
	}

	}
}
