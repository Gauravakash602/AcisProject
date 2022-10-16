package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class Sprint26feedbackstorypart2Test_1518 extends TestBase{

	public Sprint26feedbackstorypart2Test_1518() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(enabled=true,description = "US001518 :Sprint 26 feedback story part", groups = { "High",
			"acisRegression", "Khushboo" },priority=0)
	public void waiverandvariancesectionVerification_LW() throws AcisException, InterruptedException, IOException, AWTException {
	
	loginTest.login("LicesningWorker");
	homePage_SFDCPage.clickDownArrowLicensingApplication();
	homePage_SFDCPage.selectAllLicensingApplications();
	homePage_SFDCPage.searchRecordAndClick("latha ram & lali ram Home");	
	licensingApplicationPage.checkStatus("Initial App Pending");
	allegationReportPage.clickRelatedTab();
	licensingApplicationPage.openLicenseApplication();
	licensingApplicationPage.checkRequestModification();
	licensingApplicationPage.editRequestModification();
	licensingApplicationPage.selectEndDate();
	licensingApplicationPage.clickOnSaveButton();
	



}
}