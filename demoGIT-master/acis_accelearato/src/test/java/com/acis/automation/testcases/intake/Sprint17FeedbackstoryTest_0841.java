package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class Sprint17FeedbackstoryTest_0841 extends TestBase {

	public Sprint17FeedbackstoryTest_0841() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, maltreator, victim, victimSecond;
	String fosterCaseID;
	int count = 0;
	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();

	@Test(priority=1,description = "US:841 Sprint 17 Technical Improvement Feedback story Test", groups = { "High",
			"acisRegression", "Khushboo" })
	public void intakeCreation() throws AcisException, InterruptedException, IOException {
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
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "Rachel");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage.setAllNames("firstName", "middleName", "lastName");
			// createIntakePerson_OmniscriptPage.prvoideSuffix("I");
			// createIntakePerson_OmniscriptPage.provideContactInformation("(123) 456-7890",
			// "demo@demo.com");
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", "street");
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", "street");
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", "city");
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", "12345");
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			// AC 2235,2236 &2237
			searchPerson_OmniscriptPage.checkFirstName();
			personsInvovled_OmniscriptPage.clickNextButton();
			// Intake flow
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
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationID = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.cancelIntakeOmniscript();
			allegationReportPage.verifyingAllegationReportStatus();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
		
			loginTest.login("OOHWorker");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			// AC2324
			allegationReportPage.clickonAlligationRecord();
			caseHeadPage.verifyCaseHead();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-841:Sprint 17 Technical Improvement Feedback story Test	sR4D");

		}
	}

	@Test(priority=2,description = "US:841 Sprint 17 placement record Technical Improvement Feedback story Test", groups = { "High",
			"acisRegression", "Khushboo" })
	public void createFoster() throws AcisException, InterruptedException, IOException {
		try {
			loginTest.login("OOHWorker");
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCase();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("TDM");
			//AC 2327
			addMeetingAttendeesPage.checkErrorMessage();
			//AC 2328
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
			loginTest.login("OOHWorker");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("CasePlanReview");
			addMeetingAttendeesPage.checkErrorMessage();
			//AC2329
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
			loginTest.login("OOHWorker");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("Case Transfer");
			addMeetingAttendeesPage.checkErrorMessageCaseTransfer();
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-841:Sprint 17 placement record Technical Improvement Feedback story Test	sR4D");

			}
}
}