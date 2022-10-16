package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class NewRelationshipButtonTest_0771 extends TestBase {

	public NewRelationshipButtonTest_0771() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewRelationshipButtonTest_0771.class);

	@Test(description = "S-0771: Too validate New ReleationShip  Button  by OOH Case Worker", groups = { "Large",
			"ACIS_Regression", "Khushboo" })

	public void NewRelationship() throws AcisException, InterruptedException, IOException {
		loginTest.login("OOHWorker");
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		caseHeadPage.newFosterCaseWithoutHousholdMember();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseActionPage.checkButtons("New Relationship");
		caseActionPage.checkButtons("New Person");
		caseActionPage.clickonNewRelationshipButton();
	}
}