package com.acis.automation.testcases.investigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class FindingsTest_0107 extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(FindingsTest_0107.class);

	public FindingsTest_0107() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	 String firstName = faker.name().firstName();
	 String middleName = "";
	 String lastName = faker.name().lastName();

	 String secondfirstName = faker.name().firstName();
	 String secondmiddleName = "";
	 String secondlastName = faker.name().lastName();
	 String  victim_one = firstName.concat(" ").concat(lastName);
	 String maltreator = secondfirstName.concat(" ").concat(secondlastName);

	public static String allegationID, victim, victimSecond;
	@Test(priority = 1, description = "S:0107 Investigation - Findings   using investigation User", groups = { "Simple",
			"ACIS_Regression", "Khushboo" })
	public void FindingsInvestigator() throws AcisException, InterruptedException {
		try {
			allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
			loginTest.logout();			
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			investigationTest.intakeApproval();
			 allegationReportPage.verifyingAllegationReportStatus(); 
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickCreateInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interview_OmniScriptPage.provideDate();
			interview_OmniScriptPage.selectAttempts("Successfull");
			interview_OmniScriptPage.prvoideType("Visit");
			interview_OmniScriptPage.prvoideLocation("Biological Home");
			interview_OmniScriptPage.prvoideSubType("Child");
			interview_OmniScriptPage.prvoideMethod("FaceToFace");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interview narrative Demo");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion",
					"Interviw profesionalopinion Demo");
			interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
			interview_OmniScriptPage.clickSavebutton();
			interview_OmniScriptPage.closeCaregiverTab();
			interview_OmniScriptPage.clickNextButton();

			// Collateral
			collaterals_OmniScriptPage.clickCreateCollateral();
			collaterals_OmniScriptPage.iframeSwitch();
			collaterals_OmniScriptPage.setDate();
			collaterals_OmniScriptPage.selectAttempts("Successfull");
			//collaterals_OmniScriptPage.setCheckbox("Scheduled");
			collaterals_OmniScriptPage.typePicklist("Collateral");
			collaterals_OmniScriptPage.subTypePicklist("MentalHealth");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPerson", "Test");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
			collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
			collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
			collaterals_OmniScriptPage.clickSaveButton();
			collaterals_OmniScriptPage.closeCollateraltab();
			collaterals_OmniScriptPage.clickNextButton();
			// Record
			recordReview_OmniScriptPage.nextPage();
			// verify interview record
			findings_OmniScriptPage.verifyInterviewContactRecords();
			// add worker summary
			findings_OmniScriptPage.txtWorkerSummary();
			// verify save later button
			findings_OmniScriptPage.clickOnSaveForLater();
			findings_OmniScriptPage.verifySaveForLater();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed :S:0107 Investigation - Findings   using investigation User");
		}

	}

	@Test(priority = 2, description = "S:0107 Findings -Alligation  using investigation User", groups = { "Simple",
			"ACIS_Regression", "Khushboo" })
	public void reviewAlligationFindingsInvestigator() throws AcisException, InterruptedException {
		try {			
			loginTest.login("Investigator");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickNextButton();
			collaterals_OmniScriptPage.clickNextButton();
			recordReview_OmniScriptPage.nextPage();
			// Record
			findings_OmniScriptPage.addAllegation("Ruled Out", maltreator);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0107 Findings -Alligation  using investigation User");
		}

	}


	@Test(priority = 3, description = "S:0107 Investigation -Edit interview records Findings using investigation User", groups = {
			"Simple", "ACIS_Regression", "Khushboo" })
	public void editinterviewrecordFindingsInvestigator() throws AcisException, InterruptedException {
		try {
					
			loginTest.login("Investigator");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickNextButton();
			collaterals_OmniScriptPage.clickNextButton();
			recordReview_OmniScriptPage.nextPage();
			findings_OmniScriptPage.editInterviewRecord();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0107 Investigation -Edit interview records Findings using investigation User");
		}

	}
	
}
