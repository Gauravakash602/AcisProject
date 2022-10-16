package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SecureCaseTest_0155 extends TestBase {

	public SecureCaseTest_0155() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	

	final static Logger logger = LoggerFactory.getLogger(InvestigationCaseTest_0098.class);

	public static String allegationID, investigationCaseID;
	int count;

	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName = excel.getLastName();

	 String  victim = firstName.concat(" ").concat(lastName);
	 String maltreator = secondfirstName.concat(" ").concat(secondlastName);
	
	
	@Test(description = "US:0155: Secure Case ", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 2)

	public void secureCase() throws AcisException, Exception {
	
			allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("Supervisor");
			investigationCaseID= loginTest.investigationTest.getInvestigationID(allegationID);
			loginTest.caseMangementTest.searchFosterCaseID(investigationCaseID);
			
			
			investigationCasePage.clickDetailsTab();
			investigationCasePage.checkSharingOption("Not Present");
			investigationCasePage.clickEditPrivateHiddenCase();
			investigationCasePage.clickSaveButton();
			investigationCasePage.checkSharingOption("Present");
			investigationCasePage.clickOnSharingOption();
			investigationCasePage.provideUserInSharingOption("ACIS Investigator");
			investigationCasePage.clickSaveButton();
			
			investigationCasePage.clickEditPrivateHiddenCase();
			investigationCasePage.clickSaveButton();
			investigationCasePage.checkSharingOption("Not Present");
	
			
	}
}
