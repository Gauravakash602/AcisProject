package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class _1086_MultipleContactsTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1086_MultipleContactsTest.class);

	public _1086_MultipleContactsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "US-0001086 Multiple Contacts on a Service Provider Account", groups = { "High",
			"acisRegression", "dharmesh" })
	public void CreatePlacementAccountLicensing() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			providerAgencyAccountPage.selectRadioButton();
			providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 4));
			providerAgencyAccountPage.clickOnSave();
			providerAgencyAccountPage.clickRelatedTab();
			providerAgencyAccountPage.clickContactsTab();
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			String name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0001086 Multiple Contacts on a Service Provider Account");
		}
	}

	@Test(description = "US-0001086 Multiple Contacts on a Service Provider Account", groups = { "High",
			"acisRegression", "dharmesh" })
	public void CreatePlacementAccountIntake() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			providerAgencyAccountPage.selectRadioButton();
			providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 4));
			providerAgencyAccountPage.clickOnSave();
			providerAgencyAccountPage.clickRelatedTab();
			providerAgencyAccountPage.clickContactsTab();
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			String name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0001086 Multiple Contacts on a Service Provider Account");
		}
	}

	@Test(description = "US-0001086 Multiple Contacts on a Service Provider Account", groups = { "High",
			"acisRegression", "dharmesh" })
	public void CreatePlacementAccountSupervisor() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			providerAgencyAccountPage.selectRadioButton();
			providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 4));
			providerAgencyAccountPage.clickOnSave();
			providerAgencyAccountPage.clickRelatedTab();
			providerAgencyAccountPage.clickContactsTab();
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			String name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0001086 Multiple Contacts on a Service Provider Account");
		}
	}

	@Test(description = "US-0001086 Multiple Contacts on a Service Provider Account", groups = { "High",
			"acisRegression", "dharmesh" })
	public void CreatePlacementAccountCaseWorker() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			providerAgencyAccountPage.selectRadioButton();
			providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 4));
			providerAgencyAccountPage.clickOnSave();
			providerAgencyAccountPage.clickRelatedTab();
			providerAgencyAccountPage.clickContactsTab();
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			String name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0001086 Multiple Contacts on a Service Provider Account");
		}
	}

	@Test(description = "US-0001086 Multiple Contacts on a Service Provider Account", groups = { "High",
			"acisRegression", "dharmesh" })
	public void CreatePlacementAccountInvestigator() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			providerAgencyAccountPage.selectRadioButton();
			providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 4));
			providerAgencyAccountPage.clickOnSave();
			providerAgencyAccountPage.clickRelatedTab();
			providerAgencyAccountPage.clickContactsTab();
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			String name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
			providerAgencyAccountPage.clickNewContact();
			providerAgencyAccountPage.enterContact("Phone", "999999999");
			name = excel.generateRandomTestData(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			providerAgencyAccountPage.enterContact("LastName", name);
			providerAgencyAccountPage.clickOnSaveContact();
			providerAgencyAccountPage.closeContact(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0001086 Multiple Contacts on a Service Provider Account");
		}
	}
}
