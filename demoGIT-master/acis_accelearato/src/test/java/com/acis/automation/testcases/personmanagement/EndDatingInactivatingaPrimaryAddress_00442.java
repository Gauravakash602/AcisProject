package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class EndDatingInactivatingaPrimaryAddress_00442 extends TestBase{
	
	final static Logger logger = LoggerFactory.getLogger(EndDatingInactivatingaPrimaryAddress_00442.class);

	public EndDatingInactivatingaPrimaryAddress_00442() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	

	PersonAccountCreationTest AddPerson = new PersonAccountCreationTest();
	
	LoginTest login =new LoginTest();
	
	@Test(description = "S-000442: End Dating/Inactivating a without Primary Address", groups = { "small",
			"ACIS_Regression", "Varun" })

	public void searchEDPrimaryAddress() throws AcisException, Exception {
	try {
		AddPerson.personAccountCreationTest();
		login.login("Supervisor");
		home.verfiyHomePage();
        homePage_SFDCPage.closeTabs();
        homePage_SFDCPage.clickDownArrowAccount();
        homePage_SFDCPage.selectAllAccount();
        homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
        personsInformationPage.clickRelatedTab();
        relatedPersonTabPage.clickAddressTab();
        relatedPersonTabPage.createnewaddresswithoutPrimaryAddress("12 Toms Dr, Bloomington, IL, USA");
	}
	catch (Exception e) {
        // TODO Auto-generated catch block
        getStackTrace(e, "Failed US-000442:End Dating/Inactivating a with Primary Address");
    }

	}

	@Test(description = "S-000442: End Dating/Inactivating a with Primary Address", groups = { "small",
			"ACIS_Regression", "Varun" })

	public void verifyAddressEndDate() throws AcisException, Exception {
	try {

		login.login("Supervisor");
		home.verfiyHomePage();
        homePage_SFDCPage.closeTabs();
        homePage_SFDCPage.clickDownArrowAccount();
        homePage_SFDCPage.selectAllAccount();
        homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
        personsInformationPage.clickRelatedTab();
        relatedPersonTabPage.clickAddressTab();
        relatedPersonTabPage.createnewaddresswithPrimaryAddress("12 Toms Dr, Bloomington, IL, USA");
	}
        catch (Exception e) {
            // TODO Auto-generated catch block
            getStackTrace(e, "Failed US-000442:End Dating/Inactivating a with Primary Address");
        }
	
	
	
	
	}
}
