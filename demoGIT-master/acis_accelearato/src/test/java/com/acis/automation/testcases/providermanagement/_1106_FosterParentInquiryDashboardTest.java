package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1106_FosterParentInquiryDashboardTest extends TestBase {

	public _1106_FosterParentInquiryDashboardTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_1106_FosterParentInquiryDashboardTest.class);
	
	@Test(description = " US-0001106 IN - Foster Parent Inquiry Dashboards", groups = { "Low",
			"acisRegression", "Dharmesh" })

	public void fosterParentInquiryLicensingWorker() throws AcisException, Exception {
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePagePostPermanency();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			fosterParentInquiriesPage.clickFosterParentInquiriesPage();
			fosterParentInquiriesPage.checkFosterParentInquiryLabel();
			fosterParentInquiriesPage.clickFirstRecord();
			fosterParentInquiriesPage.verifyLicensingWorker();
	}
	
	@Test(description = " US-0001106 IN - Foster Parent Inquiry Dashboards", groups = { "Low",
			"acisRegression", "Dharmesh" })

	public void fosterParentInquirySupervisor() throws AcisException, Exception {
		
		 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		 home.verfiyHomePagePostPermanency();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			fosterParentInquiriesPage.clickFosterParentInquiriesSupervisorPage();
			fosterParentInquiriesPage.clickFirstRecord();
			fosterParentInquiriesPage.selectLicensingWorker();
	}
}
