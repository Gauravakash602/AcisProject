package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AgencyHistoryStepTest0716 extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(AgencyHistoryStepTest0716.class);

	public AgencyHistoryStepTest0716() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S-0716: Intake- Agency History Steps", groups = { "Medium", "ACIS_Regression", "Khushboo" })

	public void agencyHistorySteps() throws AcisException, InterruptedException, IOException {

		String allegationID;
		String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
		String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
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
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "Rachel");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.setAllNames("firstn", "middlen", "lastn");
		// createIntakePerson_OmniscriptPage.prvoideSuffix("I");
		// createIntakePerson_OmniscriptPage.provideContactInformation("(123) 456-7890",
		// "demo@demo.com");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", "street");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", "street");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", "city");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", "12345");
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.verifyStatus();

	}
}
