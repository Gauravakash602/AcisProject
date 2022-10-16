package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0561_InitiatePlacementSearchTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_0561_InitiatePlacementSearchTest.class);

	public _0561_InitiatePlacementSearchTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;

	String firstName = faker.name().firstName();
	String middleName = faker.name().firstName();
	String lastName = faker.name().lastName();

	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().firstName();
	String childLastName = faker.name().lastName();
	int count = 2;

	@Test(enabled = false, description = "US-0000561 Initiate Placement Search Placement Resource Account", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData("Demo", 3));
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setStatus("Applicant");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.setTextOnPlacement("Capacity",
					testData.get(Constants.PlacementAccount_SHEET).get("capacity"));
			placementResourcePage.setTextOnPlacement("Occupancy",
					testData.get(Constants.PlacementAccount_SHEET).get("occupancy"));
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("LocationName",
					testData.get(Constants.PlacementAccount_SHEET).get("locationName"));
			placementResourcePage.setTextOnSite("Street", testData.get(Constants.PlacementAccount_SHEET).get("street"));
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", testData.get(Constants.PlacementAccount_SHEET).get("city"));
			placementResourcePage.setState(testData.get(Constants.PlacementAccount_SHEET).get("state"));
			placementResourcePage.setTextOnSite("ZipCode",
					testData.get(Constants.PlacementAccount_SHEET).get("zipCode"));
			placementResourcePage.setTextOnSite("Latitude",
					testData.get(Constants.PlacementAccount_SHEET).get("latitude"));
			placementResourcePage.setTextOnSite("Longitude",
					testData.get(Constants.PlacementAccount_SHEET).get("longitude"));
			providerAgencyAccountPage.clickOnSaveSite();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000561 Initiate Placement Search Placement Resource Account");
		}

	}

	@Test(enabled = false, description = "UUS-0000561 Initiate Placement Search Create Provider Agency Account", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void CreateProviderAccount() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.clickNewButton();
				providerAgencyAccountPage.selectRadioButton();
				providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 2));
				providerAgencyAccountPage.setProviderAgencyType("LicensedChildPlacementAgency");
				providerAgencyAccountPage.clickOnSave();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000561 Initiate Placement Search Create Provider Agency Account");
		}

	}

	@Test(description = "US-0000561 Initiate Placement Search intake creation", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 2)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(
						faker.name().firstName(),
						faker.name().firstName(),
						faker.name().lastName(), "", "",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
//				testData.get(Constants.REPORTDETAILSPAGE).get("phone")
//				testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage.provideBirthdate(
						testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage
						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickRefresPersonButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.selectCaseHead(firstName + " " + middleName);
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				allegationID = allegationReportPage.getAllegationID();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0000561 Initiate Placement Search intake creation");
		}

	}

	@Test(description = "US-0000561 Initiate Placement Search intake approval", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 3)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 3) {
				String allegationReportIdNoAfterIsApprove = "";

				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();

				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0000561 Initiate Placement Search intake approval");
		}

	}

	

	@Test(description = "US-0000561 Initiate Placement Search Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 4)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 5) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(firstName + " " + middleName + " " + lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0000561 Initiate Placement Search Create Foster Care Case");
		}

	}

	@Test(description = "US-0000561 Initiate Placement Search Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 5)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 6) {
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
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000561 Initiate Placement Search Foster Care Case Add Person");
		}

	}

	@Test(description = "US-0000561 Initiate Placement Search Add Education Information to a Person record", groups = { "Simple",
			"ACIS_Regression", "Dharmesh" }, priority = 6)
	public void educationRecord() throws AcisException, InterruptedException {
		try {
			if (count == 4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.searchGlobalAccountRecord(childFirstName+" "+childMiddleName+" "+childLastName);
				personsInformationPage.clickEducationTab();
				personEducationPage.clickEducation();
				personEducationPage.verifyEducationRelated();
				personEducationPage.clickNewButton();
				personEducationPage.verifyEducationType();
				personEducationPage.clickNewSchool();
				personEducationPage.enterSchoolText("Name", faker.company().name());
				personEducationPage.setActive();
				personEducationPage.enterSchoolText("Address1", faker.address().buildingNumber());
				personEducationPage.enterSchoolText("Address2", faker.address().streetName());
				personEducationPage.enterSchoolText("City", faker.address().cityName());
				personEducationPage.enterSchoolText("State", faker.address().state());
				personEducationPage.enterSchoolText("Zip", "99999");
				personEducationPage.clickSaveButton("School");
				personEducationPage.selectGrade();
				personEducationPage.verifyIEP();
				personEducationPage.setDate("Start");
				personEducationPage.setDate("End");
				personEducationPage.clickSaveButton("Education");
				personEducationPage.verifySchoolName(testData.get(Constants.EDUCATIONPAGE).get("schoolName"));
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "US-0000561 Initiate Placement Search Add Education Information to a Person record");
		}

	}
	
	@Test(description = "US-0000561 Initiate Placement Search Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 7)
	public void FosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 7) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickPlacementTab();
				fosterCareCase_Page.clickNewPlacement();

//				newPlacement_OmniScriptPage.selectICPCPlacement("Yes");
//				newPlacement_OmniScriptPage.verifyPlacementTypeDisabled();
				newPlacement_OmniScriptPage.clickDownIconEdit();
				newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
				newPlacement_OmniScriptPage.saveButton();
				newPlacement_OmniScriptPage.selectICPCPlacement("No");
				newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
				newPlacement_OmniScriptPage.enterZipCode("94115");
				newPlacement_OmniScriptPage.selectStartDate();
				newPlacement_OmniScriptPage.enterRadius("10");
				newPlacement_OmniScriptPage.clickSearchButton();
				placementSearchResults_OmniScriptPage.verifyPlacementResourceNF();
				placementSearchResults_OmniScriptPage.clickPreviousButton();
				newPlacement_OmniScriptPage.clearZipCode();
				newPlacement_OmniScriptPage.enterZipCode("46011");
				newPlacement_OmniScriptPage.clickSearchButton();
				placementSearchResults_OmniScriptPage.verifyLabels();
				placementSearchResults_OmniScriptPage.selectFirstRecord();
				placementSearchResults_OmniScriptPage.clickSubmitButton();

			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000561 Initiate Placement Search Case Add Person");
		}

	}

}
