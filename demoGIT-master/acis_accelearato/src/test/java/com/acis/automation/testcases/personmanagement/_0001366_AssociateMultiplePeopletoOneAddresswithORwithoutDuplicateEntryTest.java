package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0001366_AssociateMultiplePeopletoOneAddresswithORwithoutDuplicateEntryTest extends TestBase {
	
	final static Logger logger = LoggerFactory.getLogger(_0001366_AssociateMultiplePeopletoOneAddresswithORwithoutDuplicateEntryTest.class);
	
	public _0001366_AssociateMultiplePeopletoOneAddresswithORwithoutDuplicateEntryTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String fosterCaseID;
	
	String firstName = faker.name().firstName();
	String middleName =faker.name().lastName();
	String lastName = faker.name().lastName();
	
	String  fullName = firstName+" "+middleName+" "+lastName;
	
	String address = testData.get(Constants.AddressLocation_SHEET).get("Address");
	
	
	@Test(description = "US-0001366 - Associate Multiple People to One Address w/out Duplicate Entry", groups = { "High",
			"acisRegression", "Prateeksha" },priority=0)
	public void AssociateMultiplePeopletoOneAddresswithOrWithoutDuplicateEntry() throws AcisException, Exception {
			
		loginTest.login("Supervisor");
		fosterCaseID=loginTest. caseMangementTest.createFosterCareCaseFromFirstRecord();
		loginTest.caseMangementTest.FosterCareCreatePerson();
		loginTest.logout();
		loginTest.login("Supervisor");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		fosterCareCase_Page.clickRelatedTab();
		fosterCareCase_Page.clickPersonTab();
		addressPage.selectPersonAccount(fullName);
		addressPage.closeCasePersonTab();
		addressPage.RelatedTabPersonAccount();
		relatedPersonTabPage.clickAddressTab();
		addressPage.closePersonAccountTab(fullName);
		addressPage.clickOnNewButton();
		addressPage.fillAddressDetails(address);
		addressPage.selectCasePersonsWhoseAddressIsSame();
		addressPage.clickSaveButton();
		addressPage.verifyingAddressUpdated();	
	 }
	
}




