package com.acis.automation.testcases.investigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class CompleteRiskAssessmentTest_0094 extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(CompleteRiskAssessmentTest_0094.class);
	public static String allegationID;

	public CompleteRiskAssessmentTest_0094() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S:0094 Complete Risk Assessment-using investigator", groups = { "High", "acisRegression",
			"Khushboo" })
	public void completeRiskAssessment() throws AcisException, Exception {		
		loginTest.login("Intake");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
				testData.get(Constants.REPORTDETAILSPAGE).get("email"),
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		investigationTest.intakeApproval();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		loginTest.login("Investigator");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		investigationCasePage.clickRelatedTab();
		mandatoryPersonSearchSafetyAssesmentPage.clickOnNewSafetyAssessmentlink();
		reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
		personsInvolved_SA_OmniscriptPage.clickNextButton();
		establishRelations_SA_OmniScriptPage.clickNextButton();
		interviewChildren_SA_OmniScriptPage.clickNextButton();
		interviewCaregivers_SA_OmniScriptPage.clickNextButton();
		assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
		safetyScale_SA_OmniScriptPage.clickCreateAddButton();
		safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
		safetyScale_SA_OmniScriptPage.clickSave();
	}
}
