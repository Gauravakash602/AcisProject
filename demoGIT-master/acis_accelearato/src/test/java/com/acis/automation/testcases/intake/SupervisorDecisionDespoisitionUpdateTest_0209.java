package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SupervisorDecisionDespoisitionUpdateTest_0209 extends TestBase {

	public SupervisorDecisionDespoisitionUpdateTest_0209() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String firstpersonName = faker.name().firstName();
	String FpersonmiddleName = faker.name().lastName();
	String FpersonlastName = faker.name().lastName();
	String secpersonName = faker.name().firstName();
	String SpersonmiddleName = faker.name().lastName();
	String SpersonlastName = faker.name().lastName();

	/***
	 * This class contains Test Script related to intake creation and
	 * supervisorDecissonDespositionUpdate Only applicable through supervisor login
	 */
	final static Logger logger = LoggerFactory.getLogger(SupervisorDecisionDespoisitionUpdateTest_0209.class);
	String allegationID;
	int count1 = 0, count2 = 0;

	@Test(enabled=true,description = "S-0209 Intake - Supervisor Decision and Disposition Field Updates", groups = { "High",
			"acisRegression", "Akash" })

	public void SupervisorDecisionDespoisitionUpdate() throws AcisException, InterruptedException, IOException {

		 String  victim = firstpersonName.concat(" ").concat(FpersonlastName);
		 String maltreator = secpersonName.concat(" ").concat(SpersonlastName);
	
			
		 
		 loginTest.login("Intake");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstpersonName, FpersonmiddleName, FpersonlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(secpersonName, SpersonmiddleName, SpersonlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		allegationID = allegationReportPage.getAllegationID();
	

	}

	@Test(enabled = true, description = "S-0209 Intake - Supervisor Decision and Disposition Field Updates final using supervisor", groups = {
			"High", "acisRegression", "Akash" }, priority = 1)
	public void AcceptAssign() throws AcisException, Exception {
		if (count1 == 0) {
			String allegationReportIdNoAfterIsApprove = "";

			
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);

			allegationReportPage.clickIntakeBtn();
			Thread.sleep(15000);
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();

			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			supervisorDecisionDepositionUpdatePage.scrollTill("scrolltwo");
			screeningDecision_OmniscriptPage.selectOverride();
			supervisorDecisionDepositionUpdatePage.verifyNoDispositionError(
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("depositionError"),
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("screeningLabel"));
			supervisorDecisionDepositionUpdatePage.scrollTill("scrolltwo");
			supervisorDecisionDepositionUpdatePage.selectingAcceptingAssign(
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("supervisorscreening"),
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("workerScreening"));
			supervisorDecisionDepositionUpdatePage.intakeNavigationToScreenDecission();
			supervisorDecisionDepositionUpdatePage.scrollTill("scrolltwo");
			screeningDecision_OmniscriptPage.selectOverride();
			supervisorDecisionDepositionUpdatePage.scrollTill("scrollUp");
			screeningDecision_OmniscriptPage.selectDisposition("investigation");
			screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.cancelButton();
			supervisorDecisionDepositionUpdatePage.verifyingSuperVisorOverride(
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("disposition"),
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("supervisorscreenDis"),
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("workerScreening"));

		}

		else {
			throw new Exception(
					"Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
		}
	}
}
