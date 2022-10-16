package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class AddressRecordCreationSafetyAssessmentTest_0372 extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(AddressRecordCreationSafetyAssessmentTest_0372.class);

	public AddressRecordCreationSafetyAssessmentTest_0372() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String allegationID;

	@Test(description = "S:0372 Investigation - Address Record Creation From safety Assessment", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })
	public void addressRecordCreations() throws AcisException, InterruptedException, IOException {
		try {
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
			caseActionPage.refreshPage();
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			caseHeadPage.clickRelatedTab("Second Related tab");
			mandatoryPersonSearchSafetyAssesmentPage.clickOnNewSafetyAssessmentlink();
			reviewAllegationReport_SA_OmniScriptPage.clickEditFirstRecordButton();
			mandatoryPersonSearchSafetyAssesmentPage.editAddressFromSafetyAssessment("victoria");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S:0372 Investigation - Address Record Creation From safety Assessment");

		}
	}
}
