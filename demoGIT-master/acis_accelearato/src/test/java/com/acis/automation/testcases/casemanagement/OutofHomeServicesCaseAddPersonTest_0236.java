package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class OutofHomeServicesCaseAddPersonTest_0236 extends TestBase {


	public OutofHomeServicesCaseAddPersonTest_0236() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(OutofHomeServicesCaseAddPersonTest_0236.class);
	String childFirstName = "child".concat(faker.name().firstName());
	String childMiddleName = faker.name().firstName();
	String childLastName = faker.name().firstName();
	
	String childsecondFirstName= "child".concat(faker.name().firstName());
	String childsecondmiddleName = faker.name().firstName();
	String childsecondlastname = faker.name().firstName();
	
	
	String childFullName = childFirstName + " " + childMiddleName + " " + childLastName;
	String childName = childFirstName + " " + childLastName;
	static int count, count1;

	@Test(description = "S-0236: Add person on service  case  by OOH Case Worker", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void addPerson() throws AcisException, InterruptedException, IOException {
		loginTest.login("OOHWorker");		
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		Thread.sleep(1000);
		caseHeadPage.newFosterCaseWithoutHousholdMember();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childsecondFirstName,childsecondmiddleName, childsecondmiddleName);
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "13");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseHeadPage.clickRelatedTab("Second Related tab");
		// A-00719
		caseActionPage.clickonCaseActionHistory();
		caseActionPage.checkLabelsOnCaseActionHistory("Date");
		caseActionPage.checkLabelsOnCaseActionHistory("Field");
		caseActionPage.checkLabelsOnCaseActionHistory("User");
		caseActionPage.checkLabelsOnCaseActionHistory("Original Value");
		caseActionPage.checkLabelsOnCaseActionHistory("New value");
		
		
	}
}