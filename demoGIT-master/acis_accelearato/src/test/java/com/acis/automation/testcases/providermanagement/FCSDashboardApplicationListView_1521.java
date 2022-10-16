package com.acis.automation.testcases.providermanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;

import com.acis.automation.utilities.AcisException;


public class FCSDashboardApplicationListView_1521 extends TestBase {
	
	final static Logger logger = LoggerFactory.getLogger(FCSDashboardApplicationListView_1521.class);
	
	public FCSDashboardApplicationListView_1521() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String	recordIDOpenCorrectiveActionPlans;
	
	
	/*
	 * The Pre-requisite for this Test Script is that all the fields on Licensing
	 * Worker Home page should contain atleast two records. Otherwise this Test
	 * Script becomes Invalid.
	 */
	
	
	@Test(description = "S-1521 - FCS Dashboard: Application List View", groups = { "High",
			"acisRegression", "Prateeksha" }, priority=0)
	public void fcsDashboardApplicationListView() throws AcisException, Exception {

		
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowHome();
		licensingWorkerHomePage.verifySearchWithinLists();
		
		//My Licensed Homes
		licensingWorkerHomePage.verifyFieldsOnMyLicensedHomes();
		String	accountNameLicensed=licensingWorkerHomePage.getFirstRecordName();
		licensingWorkerHomePage.clickFirstRecord();
		licensingWorkerHomePage.verifyAccountOwner("ACIS Licensing Worker");
		licensingWorkerHomePage.changeTheLicenseState("Expired");
		accountPage.clickOnSaveButton();
		licensingWorkerHomePage.backToAccountsPage();
		licensingWorkerHomePage.verifyWhetherTheRecordIsDelisted(accountNameLicensed);
		
		
		//My Unlicensed Homes
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		licensingWorkerHomePage.verifyFieldsOnMyUnlicensedHomes();
		licensingWorkerHomePage.clickFirstRecord();
		licensingWorkerHomePage.verifyAccountOwner("ACIS Licensing Worker");
		licensingWorkerHomePage.placementResourceSubtype("DCS Foster Home - Unlicensed Relative");
		accountPage.clickOnSaveButton();
		licensingWorkerHomePage.backToAccountsPage();
		licensingWorkerHomePage.verifyWhetherThePlacementResourceSubtypeChanging("DCS Foster Home - Unlicensed Relative");
		licensingWorkerHomePage.clickFirstRecord();
		licensingWorkerHomePage.placementResourceSubtype("DCS Foster Home - Unlicensed Adoptive");
		accountPage.clickOnSaveButton();
		licensingWorkerHomePage.backToAccountsPage();
		licensingWorkerHomePage.verifyWhetherThePlacementResourceSubtypeChanging("DCS Foster Home - Unlicensed Adoptive");
		
		
		//My Open Foster Parent Inquiries
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		licensingWorkerHomePage.verifyFieldsOnMyOpenFosterParentInquiries();
		licensingWorkerHomePage.sortAddressIDColumn("Ascending");
		licensingWorkerHomePage.sortAddressIDColumn("Descedning");
		
		
		
		//My Foster Parent Applicants
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		licensingWorkerHomePage.verifyFieldsOnMyFosterParentApplicants();
		String	recordIDFosterParentApplicants=licensingWorkerHomePage.getFirstRecordName();
		licensingWorkerHomePage.clickFirstRecord();
		licensingWorkerHomePage.selectStatusOnPlacementResourceAssessment("Closed");
		accountPage.clickOnSaveButton();
		licensingWorkerHomePage.backToPlacementResourceAssessmentsPage();
		licensingWorkerHomePage.verifyWhetherTheRecordIsDelisted(recordIDFosterParentApplicants);
		
		
		//Open Relicense Applications
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		licensingWorkerHomePage.verifyFieldsOnOpenRelicenseApplications();
		String	recordIDOpenRelicenseApplications=licensingWorkerHomePage.getFirstRecordName();
		licensingWorkerHomePage.clickFirstRecord();
		licensingWorkerHomePage.selectStatusOnPlacementResourceAssessment("Closed");
		accountPage.clickOnSaveButton();
		licensingWorkerHomePage.backToPlacementResourceAssessmentsPage();
		licensingWorkerHomePage.verifyWhetherTheRecordIsDelisted(recordIDOpenRelicenseApplications);
		
		
		//Open Annual Reviews
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		licensingWorkerHomePage.verifyFieldsOnOpenAnnualReviews();
		String	recordIDOpenAnnualReviews=licensingWorkerHomePage.getFirstRecordName();
		licensingWorkerHomePage.clickFirstRecord();
		licensingWorkerHomePage.selectStatusOnPlacementResourceAssessment("Closed");
		accountPage.clickOnSaveButton();
		licensingWorkerHomePage.backToPlacementResourceAssessmentsPage();
		licensingWorkerHomePage.verifyWhetherTheRecordIsDelisted(recordIDOpenAnnualReviews);
		
		
		//Open Corrective Action Plans
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		licensingWorkerHomePage.verifyFieldsOnOpenCorrectiveActionPlans();
		recordIDOpenCorrectiveActionPlans = licensingWorkerHomePage.getFirstRecordName();
		
	}
	
	
	
	@Test(description = "S-1521 - FCS Dashboard: Application List View - Open Corrective Action Plans", groups = { "High",
			"acisRegression", "Prateeksha" }, priority=1)
	public void ChangeStatusOfOpenCorrectiveActionPlans() throws AcisException, Exception {
		
		loginTest.login("Admin");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(recordIDOpenCorrectiveActionPlans);
		licensingWorkerHomePage.selectStatusOnPlacementResourceAssessment("Closed");
		accountPage.clickOnSaveButton();
		loginTest.logout();
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowHome();
		licensingWorkerHomePage.verifyFieldsOnOpenCorrectiveActionPlans();
		licensingWorkerHomePage.verifyWhetherTheRecordIsDelisted(recordIDOpenCorrectiveActionPlans);
		
	}
	
	
}