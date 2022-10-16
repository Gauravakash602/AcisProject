package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1465_DevelopCorrectiveActionPlanTest extends TestBase {

	public _1465_DevelopCorrectiveActionPlanTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String capnumber;

	@Test(enabled = true, description = "S:1465 : Develop Corrective Action Plan", groups = { "High", "acisRegression",
			"Khushboo" }, priority = 0)
	public void _1465_DevelopCorrectiveActionPlan()
			throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {

		loginTest.login("LicesningWorker");
		// homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.searchGlobalEnter("Ellina Gordon & Stefan Gordon Home");
		// homePage_SFDCPage.selectFosterParentAccount();
		correctivActionPlanPage.correctiveActionPlan();
		correctivActionPlanPage.selectWithProbation();
		correctivActionPlanPage.selectDate("Effective Date", "Jun 9, 2021");
		correctivActionPlanPage.selectDate("End Date", "Jun 11, 2021");
		correctivActionPlanPage.clickOnnextButton();
		personsInformationPage.clickRelatedTab();
		capnumber = correctivActionPlanPage.correctiveactionplan();
		correctivActionPlanPage.checkStatus();
		correctivActionPlanPage.enableButton();
		correctivActionPlanPage.submitForApproval();
		correctivActionPlanPage.checkStatus();
		homePage_SFDCPage.logoutUser();
		loginTest.login("Supervisor");
		correctivActionPlanPage.openNotification();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.searchGlobalEnter(capnumber);
		correctivActionPlanPage.checkStatus();
		correctivActionPlanPage.endorseToCentralOffice();
		homePage_SFDCPage.logoutUser();
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.searchGlobalEnter(capnumber);
		correctivActionPlanPage.submitForApproval();
		correctivActionPlanPage.checkStatus();

	}

}
