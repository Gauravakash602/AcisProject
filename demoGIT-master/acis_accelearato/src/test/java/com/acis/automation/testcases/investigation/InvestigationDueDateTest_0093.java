package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class InvestigationDueDateTest_0093 extends TestBase {

	public InvestigationDueDateTest_0093() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	/***
	 * This class contains Test Script related to investigation and overriding Due
	 * date Only applicable through supervisor login
	 */
	final static Logger logger = LoggerFactory.getLogger(InvestigationDueDateTest_0093.class);
	public static String allegationID;

	@Test(priority = 0, description = "S-0093 Overriding Due  Date using supervisorLogin", groups = { "High",
			"acisRegression", "Khushboo" })

	public void overrideDueDateSupervisor() throws AcisException, InterruptedException, IOException {

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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S: 0093 create Intake flow  using Intake Login");
		}
	}

	@Test(priority = 1, description = "S-0093 Overriding Due  Date using supervisorLogin", groups = { "High",
			"acisRegression", "Khushboo" })

	public void EditDueDate() throws AcisException, InterruptedException, IOException {

		try {
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			investigationTest.intakeApproval();
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			findings_OmniScriptPage.clickDetailsTab();
			findings_OmniScriptPage.clickEditButton();
			allegationReportPage.clickonDuedate();
			findings_OmniScriptPage.setDate();
			personsInformationPage.clickSaveButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S: 0093 Overriding Due date using supervisor Login");
		}
	}

	@Test(priority = 2, description = "S:0083 verify Due  Date after 45 days using investigation login", groups = {
			"High", "acisRegression", "Khushboo" })

	public void verifyDueDateInvestigation() throws AcisException, InterruptedException, IOException {

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
			allegationID = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
			loginTest.login("Investigator");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			findings_OmniScriptPage.clickDetailsTab();
			allegationReportPage.verifyDuedate();
		} catch (Exception e) {

			getStackTrace(e, "Failed A:S:0083 verify Due  Date using investigation login");
		}
	}

	@Test(priority = 3, description = "S:0083 verify Due  Date after 45 days using supervisor login", groups = { "High",
			"acisRegression", "Khushboo" })

	public void verifyDueDateSupervisor() throws AcisException, InterruptedException, IOException {

		try {
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			findings_OmniScriptPage.clickDetailsTab();
			allegationReportPage.verifyDuedate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0083 verify Due  Date using Supervisor login");
		}
	}

}
