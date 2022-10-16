package com.acis.automation.testcases.postpermanency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0577_PostPermanencyDashboardTest extends TestBase {

	public _0577_PostPermanencyDashboardTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_0577_PostPermanencyDashboardTest.class);
	
	@Test(description = " US-0000577 Post Permanency Dashboard", groups = { "Low",
			"acisRegression", "Dharmesh" })

	public void postPermanencyDashboardSupervisor() throws AcisException, Exception {
		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectPostPermanencyCases();
			fosterCareHomePage.checkPostPermanencyLabel();
			
	}
	
	@Test(description = " US-0000577 Post Permanency Dashboard", groups = { "Low",
			"acisRegression", "Dharmesh" })

	public void postPermanencyDashboard() throws AcisException, Exception {
		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("permanencyWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("permanencyWorkerPassword"));
			home.verfiyHomePagePostPermanency();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			permanencyHomePage.clickPostPermanencyReport();
			permanencyHomePage.checkPostPermanencyReportLabel();
	}
}
