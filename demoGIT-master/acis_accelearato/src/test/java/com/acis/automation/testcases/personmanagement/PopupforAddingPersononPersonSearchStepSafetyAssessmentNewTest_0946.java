package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PopupforAddingPersononPersonSearchStepSafetyAssessmentNewTest_0946 extends TestBase {

	final static Logger logger = LoggerFactory
			.getLogger(PopupforAddingPersononPersonSearchStepSafetyAssessmentNewTest_0946.class);

	public PopupforAddingPersononPersonSearchStepSafetyAssessmentNewTest_0946() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	 String firstName = faker.name().firstName();
	 String middleName = "";
	 String lastName = faker.name().lastName();

	 String secondfirstName = faker.name().firstName();
	 String secondmiddleName = "";
	 String secondlastName = faker.name().lastName();
	 String  victim = firstName.concat(" ").concat(lastName);
	 String maltreator = secondfirstName.concat(" ").concat(secondlastName);

	String allegationID, victimSecond;
	int count = 0;
	@Test(priority = 0, description = "S-0946:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Intake Creation ", groups = {
			"High", "ACIS_Regression", "Khushboo" })
	public void intakeCreation() throws AcisException, InterruptedException, IOException {
		try {
			allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
			loginTest.logout();			
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			investigationTest.intakeApproval();
			loginTest.logout();			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					" Failed S-0946:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Intake Creation");

		}

	}

	@Test(priority = 1, description = "S-0946:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Safety Assessment Investigation", groups = {
			"Medium", "ACIS_Regression", "Khushboo" })
	public void safetyAssessmentInvestigation() throws AcisException {
		try {
			if (count == 2) {
				loginTest.login("Investigator");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationSafetyAssessmentPage.newSafetyAssesment();
				reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
				searchPerson_OmniscriptPage.verifyPersonInvolvedTable();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					" Failed S-0946:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Safety Assessment Investigation");

		}
	}

	@Test(priority = 2, description = "S-0946:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Safety Assessment Supervisor", groups = {
			"Medium", "ACIS_Regression", "Khushboo" })
	public void safetyAssessmentSupervisor() throws AcisException {
		try {
			if (count == 3) {
				loginTest.login("Supervisor");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationSafetyAssessmentPage.newSafetyAssesment();
				reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
				searchPerson_OmniscriptPage.verifyPersonInvolvedTable();
				} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					" Failed S-0946:Pop-up for Adding Person on Person Search Step (Safety Assessment-Edit) Safety Assessment Supervisor");

		}
	}

}
