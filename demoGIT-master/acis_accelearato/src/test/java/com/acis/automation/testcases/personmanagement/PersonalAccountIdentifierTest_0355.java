package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonalAccountIdentifierTest_0355 extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(PersonalAccountIdentifierTest_0355.class);

	public PersonalAccountIdentifierTest_0355() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S-035:Person Management - Account-ID  using Intake User", groups = { "Simple",
			"ACIS_Regression", "Khushboo" })
	public void personalAccountIdentifierIntake() throws AcisException, InterruptedException {
		try {
			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAccount();
		    homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickOnFirstRecord();
		//    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
		    Thread.sleep(20000);
			homePage_SFDCPage.verifyAccountID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0000477:Person Management - Account-ID");

		}

	}

	@Test(description = "S-035:Person Management - Account-ID  using  Supervisor User", groups = { "Simple",
			"ACIS_Regression", "Khushboo" })
	public void personalAccountIdentifierSupervisor() throws AcisException, InterruptedException {
		try {
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickOnFirstRecord();
			Thread.sleep(20000);
			homePage_SFDCPage.verifyAccountID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0355:Person Management - Account-ID using  Supervisor User");

		}

	}

	@Test(description = "S-0355:Person Management - Account-ID   using Investigator User", groups = { "Simple",
			"ACIS_Regression", "Khushboo" })
	public void personalAccountIdentifierInvestigator() throws AcisException, InterruptedException {
		try {
			loginTest.login("Investigator");
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickOnFirstRecord();
			Thread.sleep(20000);
			homePage_SFDCPage.verifyAccountID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0355:Person Management - Account-ID using Investigator User");

		}
	}

	@Test(description = "S-0355:Person Management - Account-ID  using Admin User", groups = { "Simple",
			"ACIS_Regression", "Khushboo" })
	public void personalAccountIdentifierAdmin() throws AcisException, InterruptedException {
		try {
			loginTest.login("Admin");
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickOnFirstRecord();
			Thread.sleep(20000);
			homePage_SFDCPage.verifyAccountID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0355:Person Management - Account-ID using admin User");

		}

	}

}