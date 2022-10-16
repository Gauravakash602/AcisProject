package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.testcases.basicMethods.CaseMangementTest;
import com.acis.automation.utilities.AcisException;

public class _1355_LicenseRevisionFCInquiryDashboardFeedback extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(_1355_LicenseRevisionFCInquiryDashboardFeedback.class);

	public _1355_LicenseRevisionFCInquiryDashboardFeedback() throws AcisException{
		// TODO Auto-generated constructor stub
	}

//	CaseMangementTest createplacement = new CaseMangementTest();
	String FirstName = faker.name().firstName(); 
	
	@Test(description = "US-0001355 Provider Management - Create Placement Resource Account and LicenseRevisionFCInquiryDashboard Approve", groups = {
			"High", "acisRegression", "Varun" }, priority = 0)
	public void LicenseRevisionApprovemethod() throws AcisException, InterruptedException, IOException {
		try {
			loginTest.login("LicesningWorker");
			caseMangementTest.createPlacementAccount(FirstName, EnvironmentName, EnvironmentName, EnvironmentName, EnvironmentName, EnvironmentName, EnvironmentName, EnvironmentName, suiteName, strAppBuildVersion, currentBrowserName, accessToken, EnvironmentName);
			providerAgencyAccountPage.uploadDocument("Test");
			loginTest.logout();
			loginTest.login("Supervisor");
			homePage_SFDCPage.closeTabs();
	        homePage_SFDCPage.clickDownArrowAccount();
	        homePage_SFDCPage.selectAllAccount();
	        homePage_SFDCPage.searchGlobalAccountRecord(FirstName);
	        providerAgencyAccountPage.licenseRevision();
	        loginTest.logout();
	        loginTest.login("CentralOfficeWorker");
	        homePage_SFDCPage.closeTabs();
	        homePage_SFDCPage.clickDownArrowAccount();
	        homePage_SFDCPage.selectAllAccount();
	        homePage_SFDCPage.searchGlobalAccountRecord(FirstName);
	        providerAgencyAccountPage.approvelicenseRevision("Approve");
	        
			
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0001355 Provider Management - Create Placement Resource Account and licensing Application Approve");
		}
		}
	
	@Test(description = "US-0001355 Provider Management - Create Placement Resource Account and LicenseRevisionFCInquiryDashboard Deny", groups = {
			"High", "acisRegression", "Varun" }, priority = 0)
	public void LicenseRevisionDenymethod() throws AcisException, InterruptedException, IOException {
		try {
			loginTest.login("LicesningWorker");
			caseMangementTest.createPlacementAccount(FirstName, EnvironmentName, EnvironmentName, EnvironmentName, EnvironmentName, EnvironmentName, EnvironmentName, EnvironmentName, suiteName, strAppBuildVersion, currentBrowserName, accessToken, EnvironmentName);
			providerAgencyAccountPage.uploadDocument("Test");
			loginTest.logout();
			loginTest.login("Supervisor");
			homePage_SFDCPage.closeTabs();
	        homePage_SFDCPage.clickDownArrowAccount();
	        homePage_SFDCPage.selectAllAccount();
	        homePage_SFDCPage.searchGlobalAccountRecord(FirstName);
	        providerAgencyAccountPage.licenseRevision();
	        loginTest.logout();
	        loginTest.login("CentralOfficeWorker");
	        homePage_SFDCPage.closeTabs();
	        homePage_SFDCPage.clickDownArrowAccount();
	        homePage_SFDCPage.selectAllAccount();
	        homePage_SFDCPage.searchGlobalAccountRecord(FirstName);
	        providerAgencyAccountPage.approvelicenseRevision("Deny");
	        
			
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0001355 Provider Management - Create Placement Resource Account and licensing Application Deny");
		}
		}
	
}
