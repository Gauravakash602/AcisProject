package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ReviewChildMedicalConditionsMedicationImmunization_1443 extends TestBase {
	
	final static Logger logger = LoggerFactory.getLogger(ReviewChildMedicalConditionsMedicationImmunization_1443.class);
	
	public ReviewChildMedicalConditionsMedicationImmunization_1443() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
	String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
	String parentHome = createdData.get(Constants.FosterParentID_SHEET).get("home");
	
	String parentLastNameGlobal = createdData.get(Constants.FosterParentID_SHEET).get("lastNameGlobal");
	
	String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
	String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
	
	
	@Test(enabled = true,description = "S-1443-  Review Child Medical Conditions/Medication/Immunization as a Case worker", groups = { "High",
			"acisRegression", "Prateeksha" } , priority=0)
	public void reviewChildMedicalConditionsMedicationImmunizationCaseWorker() throws AcisException, InterruptedException, IOException, AWTException {
		
				loginTest.login("OOHWorker");		
				 homePage_SFDCPage.clickDownArrowAccount();
		            homePage_SFDCPage.selectAllAccount();
		            homePage_SFDCPage.searchGlobalAccountRecord(parentFirstName + " " +  parentLastNameGlobal + " " + parentHome);
				personHealthAppointmentsPage.clickOnParent1PersonAccount(parentFirstName + " " + parentLastName);
				personHealthAppointmentsPage.clickOnHealthTab();
				

				//Medical Conditions - Allergies
				personHealthAppointmentsPage.clickMedicalConditions();
				personHealthAppointmentsPage.newMedicalCondition("Non-clinical");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.conditionNonclinical("Allergies");
				personHealthAppointmentsPage.diagnosingDate();
				personHealthAppointmentsPage.endDate();
				personHealthAppointmentsPage.selectAllergiesType();
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToMedicalConditionsTab("Medical Conditions");
				
				
				//Medical Conditions - Adverse Reaction
				personHealthAppointmentsPage.clickNewMedicalConditions();
				personHealthAppointmentsPage.newMedicalCondition("Non-clinical");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.conditionNonclinical("Adverse Reaction");
				personHealthAppointmentsPage.selectAdverseReactionType();
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToMedicalConditionsTab("Medical Conditions");
				
				//Medical Conditions - Special Diet
				personHealthAppointmentsPage.clickNewMedicalConditions();
				personHealthAppointmentsPage.newMedicalCondition("Non-clinical");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.conditionNonclinical("Special Diet");
				personHealthAppointmentsPage.selectSpecialDietType();
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				//Immunizations
				personHealthAppointmentsPage.clickOnHealthTab();
				personHealthAppointmentsPage.clickImmunizations();
				personHealthAppointmentsPage.selectImmunizationType("Varicella (Chickenpox)");
				personHealthAppointmentsPage.administrationDate();
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				
				//Switching to External Portal Page
				accountPage.switchLoginPage();
				accountPage.enterUsernamePassword(userName, password);	
				personHealthAppointmentsPage.myAccountOnPortalPage(parentFirstName + " " + parentLastName);
				accountPage.clickRelatedTab();
				personHealthAppointmentsPage.verifyMedicalConditions();
				personHealthAppointmentsPage.backToPersonAccountPortal(parentFirstName + " " + parentLastName);
				accountPage.clickRelatedTab();
				personHealthAppointmentsPage.verifyImmunizations();
	}

	
	@Test(enabled = false,description = "S-1443-  Review Child Medical Conditions/Medication/Immunization as a Supervisor", groups = { "High",
			"acisRegression", "Prateeksha" } , priority=1)
	public void reviewChildMedicalConditionsMedicationImmunizationSupervisor() throws AcisException, InterruptedException, IOException, AWTException {
		
				loginTest.login("Supervisor");		
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(parentFirstName + " " + parentLastName + " " + parentHome);
				personHealthAppointmentsPage.clickOnParent1PersonAccount(parentFirstName + " " + parentLastName);
				personHealthAppointmentsPage.clickOnHealthTab();
				

				//Medical Conditions - Allergies
				personHealthAppointmentsPage.clickMedicalConditions();
				personHealthAppointmentsPage.newMedicalCondition("Non-clinical");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.conditionNonclinical("Allergies");
				personHealthAppointmentsPage.diagnosingDate();
				personHealthAppointmentsPage.endDate();
				personHealthAppointmentsPage.selectAllergiesType();
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToMedicalConditionsTab("Medical Conditions");
				
				
				//Medical Conditions - Adverse Reaction
				personHealthAppointmentsPage.clickNewMedicalConditions();
				personHealthAppointmentsPage.newMedicalCondition("Non-clinical");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.conditionNonclinical("Adverse Reaction");
				personHealthAppointmentsPage.selectAdverseReactionType();
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToMedicalConditionsTab("Medical Conditions");
				
				//Medical Conditions - Special Diet
				personHealthAppointmentsPage.clickNewMedicalConditions();
				personHealthAppointmentsPage.newMedicalCondition("Non-clinical");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.conditionNonclinical("Special Diet");
				personHealthAppointmentsPage.selectSpecialDietType();
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				//Immunizations
				personHealthAppointmentsPage.clickOnHealthTab();
				personHealthAppointmentsPage.clickImmunizations();
				personHealthAppointmentsPage.selectImmunizationType("Varicella (Chickenpox)");
				personHealthAppointmentsPage.administrationDate();
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				
				//Switching to External Portal Page
				accountPage.switchLoginPage();
				accountPage.enterUsernamePassword(userName, password);	
				personHealthAppointmentsPage.myAccountOnPortalPage(parentFirstName + " " + parentLastName);
				accountPage.clickRelatedTab();
				personHealthAppointmentsPage.verifyMedicalConditions();
				personHealthAppointmentsPage.backToPersonAccountPortal(parentFirstName + " " + parentLastName);
				accountPage.clickRelatedTab();
				personHealthAppointmentsPage.verifyImmunizations();
	}
}