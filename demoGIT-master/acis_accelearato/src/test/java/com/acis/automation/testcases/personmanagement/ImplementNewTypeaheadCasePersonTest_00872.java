package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ImplementNewTypeaheadCasePersonTest_00872 extends TestBase  {

	public ImplementNewTypeaheadCasePersonTest_00872() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID;
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	
	@Test(description = "US:00872 Implement Updates - Implement New/Remove Typeahead-FC", groups = {
			"High", "acisRegression", "Mrunal" }, priority = 1)
	public void implementNewTypeaheadCasePersonValidation() throws AcisException, Exception {
		
				loginTest.login("Supervisor");
				fosterCaseID= loginTest.caseMangementTest.createFosterCareCaseFromFirstRecord();
				loginTest.logout();
				loginTest.login("Intake");
				loginTest.caseMangementTest.searchFosterCaseID(fosterCaseID);
					/*Create Case Person*/
				caseActionPage.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
				personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", firstName, middleName, lastName);
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				reviewAllegationReport_OmniScriptPage.searchPersonUsingvalidData("firstName", firstName);
				reviewAllegationReport_OmniScriptPage.searchRecordLabelsVerify();

				
		}	
	
}
