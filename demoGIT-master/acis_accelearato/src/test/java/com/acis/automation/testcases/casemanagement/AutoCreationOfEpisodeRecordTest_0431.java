package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AutoCreationOfEpisodeRecordTest_0431 extends TestBase {

	public AutoCreationOfEpisodeRecordTest_0431() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(AutoCreationOfEpisodeRecordTest_0431.class);
	String allegationID, fosterCaseID, fullName;
	String childFirstName = "child".concat(faker.name().firstName());
	String childMiddleName = faker.name().firstName();
	String childLastName = faker.name().lastName();
	String childFullName = childFirstName + " " + childMiddleName + " " + childLastName;
	String childName = childFirstName + " " + childLastName;
	String childsecondFirstName = "child".concat(faker.name().firstName());
	String childsecondmiddleName = faker.name().firstName();
	String childsecondlastname = faker.name().firstName();

	static int count, count1;

	@Test(description = "S-0431: Auto creation of Episode record  by OOH Case Worker", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void episodeRecordCreation() throws AcisException, Exception {
		loginTest.login("OOHWorker");
		fosterCaseID =loginTest.caseMangementTest.createFosterCareCaseFromFirstRecord();
		loginTest.logout();
		loginTest.login("OOHWorker");
		String FullName=loginTest.caseMangementTest.FosterCareCreatePerson();
		System.out.println("FullName"+FullName);
		loginTest.logout();
		loginTest.login("OOHWorker");
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		//newLegalAction_OmniScriptPage.clickInsightsTab();
		newLegalAction_OmniScriptPage.clickOnCourtAction();
		Thread.sleep(10000);
		newLegalAction_OmniScriptPage.courtCaseNumber("1");
		newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		newLegalAction_OmniScriptPage.courtActionType("Court Order");
        courtActionOutcomesPage.addCourtActionParticipant("Name:"+" "+FullName+";");
		newLegalAction_OmniScriptPage.saveButton();
		Thread.sleep(10000);

		newLegalAction_OmniScriptPage.clickOnCourtAction();
		Thread.sleep(10000);
		newLegalAction_OmniScriptPage.courtCaseNumber("2");
		newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		newLegalAction_OmniScriptPage.courtActionType("Emergency");
        courtActionOutcomesPage.addCourtActionParticipant("Name:"+" "+FullName+";");
		newLegalAction_OmniScriptPage.saveButton();
		casePlanPage.refreshPage();

		caseActionPage.openCourtActions("First");
		caseHeadPage.clickRelatedTab("Second Related tab");
		// court outcomes
		courtActionOutcomesPage.clickOnNewbtn();
		courtActionOutcomesPage.enterCourtActionID("6488");
		courtActionOutcomesPage.setDateandTime();
		courtActionOutcomesPage.setlectType("Custody Granted");
		courtActionOutcomesPage.Savebutton();
		courtActionOutcomesPage.closeCourtOutComesTab();
		courtActionOutcomesPage.closeCourtOrder();
		driver.navigate().refresh();
		caseHeadPage.clickRelatedTab("Second Related tab");
		courtActionOutcomesPage.openChildRemoval();
	}
}
