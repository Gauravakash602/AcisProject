package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ChangeLinkedInvestigationonAllegationreportTest_0935 extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(ChangeLinkedInvestigationonAllegationreportTest_0935.class);
	String allegation_ID, caseId, caseIdTwo, allegation_ID2;
	String maltreatorFN =faker.name().firstName();
	String maltreatorMN =faker.name().firstName();
	String maltreator = maltreatorFN.concat(" ").concat(maltreatorMN);
	String victimExtraFN = faker.name().firstName();
	String victimExtraLN =faker.name().lastName();
	
	String victimExtra = victimExtraFN.concat(" ").concat(victimExtraLN);

	public ChangeLinkedInvestigationonAllegationreportTest_0935() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test(priority = 0,description = " US-0935 : Change Linked Investigation on Allegation report", groups = {
			"High", "aCIS_Regression", "Priyanka" })
	public void verifySearchedAllegationReportInfoIntake() throws AcisException, InterruptedException, IOException {
		try {
	    loginTest.login("Intake");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(maltreatorFN, maltreatorMN, maltreatorFN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(victimExtraFN, victimExtraLN, victimExtraFN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		//screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victimExtra);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegation_ID2 = allegationReportPage.getAllegationID();
		loginTest.logout();
	    loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.searchGlobal(allegation_ID2);
		allegationReportPage.clickIntakeBtn();
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectAcceptAssign();
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.getAllegatinID(allegation_ID2);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		caseId = investigationCasePage.getCaseId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "US-0935 : Change Linked Investigation on Allegation report");
		}
	}

	@Test(priority = 1,description = " US-0935 : Change Linked Investigation on Allegation report", groups = {
			"High", "aCIS_Regression", "Priyanka" })
	public void investigationStatusChange() throws AcisException, InterruptedException, IOException {
		try {
		loginTest.login("Intake");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegation_ID2);//I-00001622
		allegationReportPage.clickEditButton();
        //allegationReportPage.verifyChangeInvestigationAndHereLink(caseId);//00001369
		investigationCasePage.clickSaveButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0935 : Change Linked Investigation on Allegation report");
		}
		 
	}
	
	
}
