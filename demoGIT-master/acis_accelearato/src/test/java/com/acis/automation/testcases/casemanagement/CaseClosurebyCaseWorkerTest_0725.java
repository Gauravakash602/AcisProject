package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CaseClosurebyCaseWorkerTest_0725 extends TestBase {

	public CaseClosurebyCaseWorkerTest_0725() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID, fullName;
	 static int count, count1;
	//String allegationID, fosterCaseID;
	
	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().lastName();
	String childLastName = faker.name().lastName();
	
	String secondChildFirstName = faker.name().firstName();
	String secondChildMiddleName = faker.name().firstName();
	String secondChildLastName = faker.name().lastName();

	@Test(description = "S-0725: Out-of-Home Services Case Closure by Case Worker", groups = { "High",
			"ACIS_Regression", "Khushboo" })

	public void caseclosure() throws AcisException, InterruptedException, IOException {
		loginTest.login("OOHWorker");
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		caseHeadPage.newFosterCaseWithoutHousholdMember();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		//personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseActionPage.refreshPage();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", secondChildFirstName, secondChildMiddleName, secondChildLastName);
		//personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseActionPage.refreshPage();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseActionPage.openCasePerson();
		detailsPersonTabPage.clickDetailsTab();
		detailsPersonTabPage.editDateOfDeath("2020");
		detailsPersonTabPage.clickOnSaveButton();
		/*
		 * caseActionPage.openCaseclosure(); caseActionPage.refreshPage();
		 * caseActionPage.fetchComments();
		 */
	}
}