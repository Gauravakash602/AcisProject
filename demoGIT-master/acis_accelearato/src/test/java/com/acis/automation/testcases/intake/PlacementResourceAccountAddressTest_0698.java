package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourceAccountAddressTest_0698 extends TestBase {

	public PlacementResourceAccountAddressTest_0698() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	
	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();

	@Test(description = "US-0698 & US-0664 Placement Resource Account Address Test ", groups = { "High", "acisRegression", "Varun" })

	public void verifyAddEditPersonalEventAtLearnerCenterSupervisor()
			throws AcisException, InterruptedException, IOException {
		try {
			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(firstName,
					lastName,
					middleName,
					testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
					testData.get(Constants.REPORTDETAILSPAGE).get("email"),
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			reportDetailsOmniscriptPage.enterLocationOfIncident("17 toms dr bloomington Il 61701");
			reportDetailsOmniscriptPage.locationEditfield("17 toms dr","bloomington","61701");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			reportDetailsOmniscriptPage.addressAsSamelocationofIncident();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			homePage_SFDCPage.closeTabs(); 
			System.out.println(firstName+" "+middleName+" "+lastName);
			homePage_SFDCPage.searchGlobalEnter(firstName+" "+middleName+" "+lastName);
			reportDetailsOmniscriptPage.verifyPersonAddress("17 toms dr");
			
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S-0698 & 664:Placement Resource Account Address Test");
			
		}
	}
}
