package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class OverrideScreeningDecisionTest_0039 extends TestBase {

	public OverrideScreeningDecisionTest_0039() throws AcisException {
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
	 * This class contains Test Script related to intake creation and overriding
	 * decission Only applicable through supervisor login
	 */
	final static Logger logger = LoggerFactory.getLogger(OverrideScreeningDecisionTest_0039.class);
	String allegationID;
	public String AllegatnID;


	@Test(enabled=true,description = "US:0039 Overriding Screening Decission using supervisorLogin", groups = {
			"High", "acisRegression", "Akash" }, priority = 0)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {

		
	
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
	    allegationID=allegationReportPage.getAllegationID();
				
		allegationReportPage.verifyingAllegationReportStatusSubmitted();

	}

	@Test(enabled = true, description = "US:0039 Overriding Screening Decission using supervisorLogin", groups = {
			"High", "acisRegression", "Akash" }, priority = 1)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {

		String allegationReportIdNoAfterIsApprove = "";
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();

		homePage_SFDCPage.searchGlobal(allegationID);
		
	allegationReportPage.clickIntakeBtn();
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();

	screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		// Options : workerComments||supervisoryComments||narrative
	screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");

		screeningDecision_OmniscriptPage.selectOverride();
		screeningDecision_OmniscriptPage.selectDisposition("investigation");// family
		screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn(); 

		allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
		allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);

	}
}
