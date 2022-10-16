package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ReCalculateAgeAtTimeTest_0916 extends TestBase {

	public ReCalculateAgeAtTimeTest_0916() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String allegationID, fosterCaseID;

	String firstName = faker.name().firstName();
	String middleName =faker.name().lastName();
	String lastName = faker.name().lastName();

	String childFirstName = faker.name().firstName();
	String childMiddleName =faker.name().lastName();
	String childLastName = faker.name().lastName();
	final static Logger logger = LoggerFactory.getLogger(ReCalculateAgeAtTimeTest_0916.class);

	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated of intake creation", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 1)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
		try {
			{
				loginTest.login("Intake");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(
						testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
//				testData.get(Constants.REPORTDETAILSPAGE).get("phone")
//				testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage.provideBirthdate(
						testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage
						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
				screeningDecision_OmniscriptPage.selectCaseHead(firstName + " " + middleName + " " + lastName);
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				// screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationID = allegationReportPage.getAllegationID();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria intake creation");
		}
	}

	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated  intake approval", groups = {
			"High", "acisRegression", "khushboo" }, priority = 2)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
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
			screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.cancelIntakeOmniscript();
			allegationID = allegationReportPage.getAllegationID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria intake approval");
		}
	}


	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated create foster care case", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 3)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			{
				loginTest.login("OOHWorker");
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(firstName + " " + middleName + " " + lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0916:ReCalculate Age at Time of...Fields When DOB is updated create foster care case");
		}
	}

	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated by foster care case", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 4)
	public void checkAgeAtTimeOFReport() throws AcisException, InterruptedException, IOException {
		try {
			{
				loginTest.login("OOHWorker");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				caseHeadPage.clickOnNewPerson();
				//establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.searchPersonUsingInvalidData("firstName",
						excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
				personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
				personsInvovled_CP_OmniscriptPage.btnSave();
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0916:ReCalculate Age at Time of...Fields When DOB is updated by foster care case");
		}

	}
}