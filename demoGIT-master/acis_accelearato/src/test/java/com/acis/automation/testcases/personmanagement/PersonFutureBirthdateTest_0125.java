package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonFutureBirthdateTest_0125 extends TestBase {

	public PersonFutureBirthdateTest_0125() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonFutureBirthdateTest_0125.class);
	
	@Test(description = "US-0125 : Person Management - Future Birthdate Age -Intake User", groups = { "Simple",
			"aCIS_Regression", "Mrunal" })
	   public void verifyFutureBirthdateIntake() throws AcisException, InterruptedException {
		
			 System.out.println("in test : 125 ");
			 loginTest.login("Intake");
		      homePage_SFDCPage.clickDownArrowAccount();
			  homePage_SFDCPage.selectAllAccount();
			  homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
			  editPersonAccountPage.clickEditButton("first");
		      editPersonAccountPage.enterFutureBirthDate();
		      editPersonAccountPage.clickSaveButton();
		      personsInformationPage.clickDetailsTab();
		      editPersonAccountPage.verifyAgeValue();
	    
	}
	
	@Test(description = "US-0125 : Person Management - Future Birthdate Age -Investigation User", groups = { "Simple",
			"aCIS_Regression", "Mrunal" })
	   public void verifyFutureBirthdateInvestigation() throws AcisException, InterruptedException {
			      
		loginTest.login("Investigator");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
		editPersonAccountPage.clickEditButton("first");
		editPersonAccountPage.enterFutureBirthDate();
		editPersonAccountPage.clickSaveButton();
		personsInformationPage.clickDetailsTab();
		editPersonAccountPage.verifyAgeValue();
	    
	}
	
	
	@Test(description = "US-0125 : Person Management - Future Birthdate Age -Supervisor User", groups = { "Simple",
			"aCIS_Regression", "Mrunal" })
	   public void verifyFutureBirthdateSupervisor() throws AcisException, InterruptedException {
			 System.out.println("in test : 125 Supervisor");
		      
			 loginTest.login("Supervisor");
		      homePage_SFDCPage.clickDownArrowAccount();
			  homePage_SFDCPage.selectAllAccount();
			  homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
			  editPersonAccountPage.clickEditButton("first");
		      editPersonAccountPage.enterFutureBirthDate();
		      editPersonAccountPage.clickSaveButton();
		      personsInformationPage.clickDetailsTab();
		      editPersonAccountPage.verifyAgeValue();
		      homePage_SFDCPage.closeTabs();

	}
}
