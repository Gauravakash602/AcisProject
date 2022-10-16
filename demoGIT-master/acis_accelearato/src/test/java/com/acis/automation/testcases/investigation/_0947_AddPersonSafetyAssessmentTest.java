package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class _0947_AddPersonSafetyAssessmentTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(_0947_AddPersonSafetyAssessmentTest.class);

	public _0947_AddPersonSafetyAssessmentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* Note:
	 * This Test Class contains scripts for S-0115,S-0123,S-0108 */
	String allegationID,maltreator,victim,victimSecond;
	int count = 0;
	
	@Test(priority=0,description = "S-0947:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Intake Creation ", groups = { "High", "ACIS_Regression", "Dharmesh" })
	public void intakeCreation() throws AcisException, InterruptedException, IOException {
		try {
			LoginTest loginTest = new LoginTest();
			
			loginTest.login("intakeUserName");
			
			/*
			 * userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get(
			 * "intakeUserName"),
			 * testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			 */
			  home.verfiyHomePage(); 
			  maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").
			  concat(" ") .concat(testData.get(Constants.PersonInvovledAllData).get(
			  "firstPersonMiddleName")); 
			  victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").
			  concat(" ") .concat(testData.get(Constants.PersonInvovledAllData).get(  "secondPersonMiddleName"));
			  home.verfiyHomePage();
			  homePage_SFDCPage.closeTabs(); 
			  
			  homePage_SFDCPage.clickDownArrowAllegation();
			  homePage_SFDCPage.selectAllAllegation(); 
			  homePage_SFDCPage.clickNewButton();
			  reportDetailsOmniscriptPage.setDate("Intake");
			  reportDetailsOmniscriptPage.selectIntakeMethod();
			  reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.
			  REPORTDETAILSPAGE).get("firstName"),
			  testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
			  testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
			  testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
			  testData.get(Constants.REPORTDETAILSPAGE).get("email"),
			  testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			  reportDetailsOmniscriptPage
			  .enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get(
			  "locationOfIncident")); reportDetailsOmniscriptPage.setDate("Incident");
			  reportDetailsOmniscriptPage.clickNextBtn();			 
			investigationTest.intakeCreationTwoPerson();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			// Options : screenOut||familyServices||investigation
			// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("No");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			// Options : workerComments||supervisoryComments||narrative
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID = allegationReportPage.getAllegationID();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0947:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Intake Creation");

		}

	}
	
	@Test(priority=1,description = "S-0947:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Intake Approval", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void intakeApproval() throws AcisException {
		try {
			if (count == 1) {
				LoginTest loginTest = new LoginTest();
				
				loginTest.login("supervisorPassword");

				/*
				 * userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get(
				 * "supervisorUserName"),
				 * testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				 */				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				investigationTest.intakeApproval();
				/*
				 * allegationReportPage.clickIntakeBtn();
				 * reportDetailsOmniscriptPage.clickNextBtn();
				 * personsInvovled_OmniscriptPage.clickNextButton();
				 * agencyHistory_OmniscriptPage.clickNextButton();
				 * structuredDecisionMakingOmniscriptPage.clickNextButton();
				 * screeningDecision_OmniscriptPage.selectAcceptAssign();
				 * screeningDecision_OmniscriptPage.clickSubmitbtn();
				 * allegationReportPage.verifyingAllegationReportStatus();
				 */
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0947:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Intake Approval");

		}
	}
	
	@Test(priority=2,description = "S-0947:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Safety Assessment Investigation", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void safetyAssessmentInvestigation() throws AcisException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationSafetyAssessmentPage.newSafetyAssesment();
				reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
				// Add new person
				personsInvolved_SA_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				personsInvolved_SA_OmniscriptPage.linkToCreateNewPerson();
				personsInvolved_SA_OmniscriptPage.setAllNames(
						testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
						testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
						testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
				personsInvolved_SA_OmniscriptPage.clickSaveButton("first");
				reviewAllegationReport_SA_OmniScriptPage.verifyPersonCreated();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0947:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Safety Assessment Investigation");

		}
	}
	

	@Test(priority=3,description = "S-0947:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Safety Assessment Supervisor", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void safetyAssessmentSupervisor() throws AcisException {
		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationSafetyAssessmentPage.newSafetyAssesment();
				reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
				// Add new person
				personsInvolved_SA_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				personsInvolved_SA_OmniscriptPage.linkToCreateNewPerson();
				personsInvolved_SA_OmniscriptPage.setAllNames(
						testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
						testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
						testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
				personsInvolved_SA_OmniscriptPage.clickSaveButton("first");
				reviewAllegationReport_SA_OmniScriptPage.verifyPersonCreated();
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0947:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Safety Assessment Supervisor");

		}
	}
	
}
