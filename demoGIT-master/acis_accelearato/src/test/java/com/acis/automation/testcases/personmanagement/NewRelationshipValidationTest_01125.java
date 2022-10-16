package com.acis.automation.testcases.personmanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class NewRelationshipValidationTest_01125 extends TestBase  {

	public NewRelationshipValidationTest_01125() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewRelationshipValidationTest_01125.class);
	
	String allegationID ;
	int count1;
	
	String firstName = faker.name().firstName();
	String middleName =faker.name().firstName();
	String lastName = excel.getLastName();
	
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName = excel.getLastName();
	 
	 String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	 String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);

	
	@Test(description = "US01125 : New Relationship validation : Intake Person Creation" , groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 0)
	   public void newRelationshipValidationTestIntake() throws AcisException, Exception 
	
	{
		loginTest.login("Intake");
		loginTest.intakeTest.clickNewButtonFromAllAllegations();
		loginTest.intakeTest.createTwoPersonOnPersonInvaolvedPage(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		homePage_SFDCPage.closeTabs();
		count1++;
	}

	
	
	@Test(description = "US01125 : New Relationship validation : Account Validation : Intake" , groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 1)
	   public void newRelationshipValidationTestAccountValidationIntake() throws AcisException, InterruptedException, AWTException, IOException 
	
	{
		  loginTest.login("Intake");
	      homePage_SFDCPage.clickDownArrowAccount();
	      homePage_SFDCPage.selectAllAccount();
	      homePage_SFDCPage.searchGlobalAccountRecord(victim);
	      personsInformationPage.clickInsightsTab();
	      insightsPage.clickNewRelationship();
	      personRelationshipPage.clickCreateAddButton();
	      personRelationshipPage.verifyErrorMessage(victim);
	      personRelationshipPage.searchTexT("Person", firstName+" ");
	      personRelationshipPage.searchTexT("Related", secondfirstName+" ");
	      personRelationshipPage.setRelationShip("Child-Mother");
	      personRelationshipPage.clickSaveButton();
	      homePage_SFDCPage.closeTabs(); 
	
	}
	
}
