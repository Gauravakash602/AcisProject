package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class ReviewChildHealthCareProviderDetailsTest_1442 extends TestBase {
	
	final static Logger logger = LoggerFactory.getLogger(ReviewChildHealthCareProviderDetailsTest_1442.class);
	
	public ReviewChildHealthCareProviderDetailsTest_1442() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(description = "S-1442 - Review Child Health Care Provider Details", groups = { "High",
			"acisRegression", "Prateeksha" })
	public void reviewChildHealthCareProviderDetails() throws AcisException, InterruptedException, IOException, AWTException {
		
		String disabilitiesID;
		
		String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
		String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
		String parentHome = createdData.get(Constants.FosterParentID_SHEET).get("home");
		String parentLastNameGlobal = createdData.get(Constants.FosterParentID_SHEET).get("lastNameGlobal");
		
		String healthCareProvider = faker.name().firstName();
		String insuranceProvider =faker.name().lastName();
		
		String userName = createdData.get(Constants.FosterParentID_SHEET).get("userName");
		String password = createdData.get(Constants.FosterParentID_SHEET).get("password");
		
				loginTest.login("OOHWorker");		
			    homePage_SFDCPage.clickDownArrowAccount();
	            homePage_SFDCPage.selectAllAccount();
	            homePage_SFDCPage.searchGlobalAccountRecord(parentFirstName + " " +  parentLastNameGlobal + " " + parentHome);
				personHealthAppointmentsPage.clickOnParent1PersonAccount(parentFirstName + " " + parentLastName);
				personHealthAppointmentsPage.clickOnHealthTab();
				
				
				//Health Care Provider
				personHealthAppointmentsPage.clickNewButtonOnHealth();
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.enterNameHealthCareProvider(healthCareProvider);
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				
				//Disabilities / Special Needs
				personHealthAppointmentsPage.clickOnHealthTab();
				personHealthAppointmentsPage.clickDisabilitiesSpecialNeeds();
				personHealthAppointmentsPage.clinicallyDiagnosedDisability("Yes");
				personHealthAppointmentsPage.selectTypeFieldFromNewDisabilities("Visually or Hearing Impaired");
				personHealthAppointmentsPage.diagnosingDate();
				personHealthAppointmentsPage.endDate();
				personHealthAppointmentsPage.enterHealthCareProviderName(healthCareProvider);
				personHealthAppointmentsPage.clickSaveButton();
				disabilitiesID = personHealthAppointmentsPage.getDisabilitiesID();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
						
				
				//Insurance Provider
				personHealthAppointmentsPage.clickOnHealthTab();
				personHealthAppointmentsPage.insuranceProviderTab();
				personHealthAppointmentsPage.clickNewButtonOnInsurance();
				personHealthAppointmentsPage.selectRadio("Insurance Provider");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.enterNameHealthCareProvider(insuranceProvider);
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				//Health Exam
				personHealthAppointmentsPage.clickOnHealthTab();
				personHealthAppointmentsPage.healthExamTab();
				personHealthAppointmentsPage.clickNewButtonOnInsurance();
				personHealthAppointmentsPage.selectRadio("Health Exam");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.enterHealthCareProviderName(healthCareProvider);
				personHealthAppointmentsPage.enterSpecialNeedID(disabilitiesID);
				personHealthAppointmentsPage.enterCommentsHealthExam("Text");
				personHealthAppointmentsPage.enterSystemInformationField("1");
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				//Medication
				personHealthAppointmentsPage.clickOnHealthTab();
				personHealthAppointmentsPage.clickMedicationField("Text");
				personHealthAppointmentsPage.enterHealthCareProviderName(healthCareProvider);
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				//Medical Conditions
				personHealthAppointmentsPage.clickOnHealthTab();
				personHealthAppointmentsPage.clickMedicalConditions();
				personHealthAppointmentsPage.newMedicalCondition("Clinical");
				personHealthAppointmentsPage.clickNextButton();
				personHealthAppointmentsPage.SelectCondition("Bronchitis");
				personHealthAppointmentsPage.enterHealthCareProviderName(healthCareProvider);
				personHealthAppointmentsPage.clickSaveButton();
				personHealthAppointmentsPage.backToPersonAccount(parentFirstName + " " + parentLastName);
				
				
				//Switching to External Portal Page
				accountPage.switchLoginPage();
				accountPage.enterUsernamePassword(userName, password);	
				personHealthAppointmentsPage.myAccountOnPortalPage(parentFirstName + " " + parentLastName);
				accountPage.clickRelatedTab();
				personHealthAppointmentsPage.verifyHealthCareProvider();
				personHealthAppointmentsPage.backToPersonAccountPortal(parentFirstName + " " + parentLastName);
				accountPage.clickRelatedTab();
				personHealthAppointmentsPage.verifyInsuranceProvider();
	}
	
	// Acceptance Criteria - A-003159, A-003160, A-003155 and A-003161 of US-1443 is covered in this script.

}