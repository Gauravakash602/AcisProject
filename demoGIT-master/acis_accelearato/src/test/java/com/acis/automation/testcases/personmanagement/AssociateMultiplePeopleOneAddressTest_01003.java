package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class AssociateMultiplePeopleOneAddressTest_01003 extends TestBase {

	
public AssociateMultiplePeopleOneAddressTest_01003() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

final static Logger logger = LoggerFactory.getLogger(AssociateMultiplePeopleOneAddressTest_01003.class);
	
	@Test(description = "US-01003 : Associate Multiple People to One Address w/out Duplicate Entry", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void associateMultiplePeopleOneAddressIntake() throws AcisException, Exception {
		
		String firstName = faker.name().firstName();
		String middleName =faker.name().firstName();
		String lastName = excel.getLastName();
		
		String secondfirstName = faker.name().firstName();
		String secondmiddleName = faker.name().firstName();
		String secondlastName = excel.getLastName();
		
		String thirdfirstName = faker.name().firstName();
		String thirdmiddleName = faker.name().firstName();
		String thirdlastName = excel.getLastName();

		String firstPersonName = firstName.concat(" ").concat(lastName);
		String secondPersonName =  secondfirstName.concat(" ").concat(secondlastName);
		
		loginTest.login("Intake");
		loginTest.intakeTest.clickNewButtonFromAllAllegations();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.clickSelectFromExistingAddress();
		createIntakePerson_OmniscriptPage.clickAddressFromExistingAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickEditRecordButton(secondfirstName);
		personsInvovled_OmniscriptPage.verifyAddressValues(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
				
		personsInvovled_OmniscriptPage.clickCancelButton();
		
	}
}
