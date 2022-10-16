package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonSearchUpdatesCreatingNewTest_0644 extends TestBase {

	public PersonSearchUpdatesCreatingNewTest_0644() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	/***
	 * This class contains Test Script related to intake creation
	 */
	final static Logger logger = LoggerFactory.getLogger(PersonSearchUpdatesCreatingNewTest_0644.class);

	@Test(description = "US-0644 Person Search Test using supervisor login ", groups = { "High", "acisRegression",
			"Akash" })

	public void personSearchSupervisor() throws AcisException, InterruptedException, IOException {

		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
				testData.get(Constants.REPORTDETAILSPAGE).get("email"),
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.selectingAddingPerson();
		searchPerson_OmniscriptPage.selectingRoleAndClickingcheckBoxSearchPage("AllegedMallternator");
		searchPerson_OmniscriptPage.refreshButton();
		verificationLabelsAfterIntakeCreationPage.verifyCreateLink();

		personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_OmniscriptPage.verifyspecificFieldPresent();
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();

	}

	@Test(enabled = true, description = "US-0644 Person Search Test using intake login", groups = { "High",
			"acisRegression", "Akash" })

	public void personSearchIntake() throws AcisException, InterruptedException, IOException {

		loginTest.login("Intake");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
				testData.get(Constants.REPORTDETAILSPAGE).get("email"),
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.selectingAddingPerson();
		searchPerson_OmniscriptPage.selectingRoleAndClickingcheckBoxSearchPage("AllegedMallternator");
		searchPerson_OmniscriptPage.refreshButton();
		verificationLabelsAfterIntakeCreationPage.verifyCreateLink();

		personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_OmniscriptPage.verifyspecificFieldPresent();
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();

	}

	@Test(enabled = true, description = "US-0644 Person Search Test using investigation login", groups = { "High",
			"acisRegression", "Akash" })

	public void personSearchInvestigation() throws AcisException, InterruptedException, IOException {

		loginTest.login("Investigator");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
				testData.get(Constants.REPORTDETAILSPAGE).get("email"),
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.selectingAddingPerson();
		searchPerson_OmniscriptPage.selectingRoleAndClickingcheckBoxSearchPage("AllegedMallternator");
		searchPerson_OmniscriptPage.refreshButton();
		verificationLabelsAfterIntakeCreationPage.verifyCreateLink();

		personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_OmniscriptPage.verifyspecificFieldPresent();
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();


	}

}
