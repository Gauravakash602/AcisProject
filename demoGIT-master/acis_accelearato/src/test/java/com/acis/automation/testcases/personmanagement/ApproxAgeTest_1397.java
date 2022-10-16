package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ApproxAgeTest_1397 extends TestBase {

	public ApproxAgeTest_1397() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;
	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();
	String date;

	@Test(priority=2,description = "S-1397: Create Intake by intake", groups = { "Medium", "ACIS_Regression", "Khushboo" })

	public void createIntake() throws AcisException, InterruptedException, IOException {
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
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		reportDetailsOmniscriptPage.addressAsSamelocationofIncident();
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		date = createIntakePerson_OmniscriptPage.getDOB();
		reviewAllegationReport_SA_OmniScriptPage.EditApproxAge();	
		reviewAllegationReport_SA_OmniScriptPage.validateErrorMessageOfApproxAge();
		homePage_SFDCPage.logoutUser();

	}
	@Test(priority=1,description = "S-1397: Create Fosterperson by intake", groups = { "Medium", "ACIS_Regression", "Khushboo" })

	public void createFoster() throws AcisException, InterruptedException, IOException {
		loginTest.login("Intake");		
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.clickFirstRecord();
		fosterCaseID = caseHeadPage.newFosterCaseWithoutHousholdMember();
		investigationCasePage.clickRelatedTab();
		fosterCareCase_Page.clickPersonTab();
		fosterCareCase_Page.clickNewPerson();
		personsInvovled_CP_OmniscriptPage.searchNewPerson(firstName);
		personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", firstName, middleName, lastName);
		personsInvovled_CP_OmniscriptPage.provideBirthdate("first","2019");
		reviewAllegationReport_SA_OmniScriptPage.EditApproxAge();	
		reviewAllegationReport_SA_OmniScriptPage.validateErrorMessageOfApproxAge();

		
		


}
}