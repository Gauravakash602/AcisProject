package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CaseHeadUpdateTest_0888 extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(CaseHeadUpdateTest_0888.class);

	public CaseHeadUpdateTest_0888() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	/***
	 * This script include US-0018 && US-007
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 */

	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();

	String secondFirstName = faker.name().firstName();
	String secondMiddleName = faker.name().lastName();
	String secondLastName = faker.name().lastName();

	String thirdFirstName = faker.name().firstName();
	String thirdMiddleName = faker.name().lastName();
	String thirdLastName = faker.name().lastName();
	
	String allegationID;
	
	String maltreator = firstName.concat(" ").concat(lastName);
	
	String victim = secondFirstName.concat(" ").concat(secondMiddleName);
	
	String intakeCaseID, allegationIDFirst, allegationIDSecond;
	int count = 0;

	@Test(priority = 0, description = "S-0888:Existing Active Investigation Case(s)-During Intake Part 2 CaseHeadCheck", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void caseHeadCheck() throws AcisException, Exception {
		try {
	
			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			loginTest.intakeTest.createTwoPersonOnPersonInvaolvedPage(secondFirstName, secondMiddleName, secondLastName,firstName, middleName, lastName);
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.verifyRequiredFields();
			// Options : screenOut||familyServices||investigation
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationIDFirst = allegationReportPage.getAllegationID();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0888:Existing Active Investigation Case(s)-During Intake Part 2 CaseHeadCheck");
		}

	}

	
	
	@Test(description = "Failed S-0888:Existing Active Investigation Case(s)-During Intake Part 2 intake approval", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 1) {
				
				loginTest.login("Supervisor");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDFirst);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				screeningDecision_OmniscriptPage.cancelButton();
				intakeCaseID = allegationReportPage.getIntakeCaseID();
				allegationReportPage.verifyCaseHead(maltreator);
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed Failed S-0888:Existing Active Investigation Case(s)-During Intake Part 2 intake approval");
		}

	}


	
	@Test(priority = 2, description = "S-0888:Existing Active Investigation Case(s)-During Intake Part 2 SameCaseHeadCheck", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void SameCaseHeadCheck() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				loginTest.login("Intake");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(thirdFirstName, thirdMiddleName, thirdLastName);
				createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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

				// Options : workerComments||supervisoryComments||narrative
				screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
				// Options : newCase||existingCase
				screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				screeningDecision_OmniscriptPage.verifyRequiredFields();
				// Options : screenOut||familyServices||investigation
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.verifyingAllegationReportStatusSubmitted();
				allegationIDSecond = allegationReportPage.getAllegationID();
				count++;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0888:Existing Active Investigation Case(s)-During Intake Part 2 SameCaseHeadCheck");
		}

	}

	

	@Test(description = "Failed S-0888:Existing Active Investigation Case(s)-During Intake Part 2 intake approval", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 3)
	public void OverrideSupervisorSame() throws AcisException, InterruptedException, IOException {
		String maltreator = firstName.concat(" ").concat(middleName);
		try {
			if (count == 3) {
				loginTest.login("Supervisor");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDSecond);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				screeningDecision_OmniscriptPage.cancelButton();
				allegationReportPage.VerifyIntakeCaseID(intakeCaseID);
				allegationReportPage.verifyCaseHead(maltreator);
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed Failed S-0888:Existing Active Investigation Case(s)-During Intake Part 2 intake approval");
		}
	}

		

	@Test(priority = 4, description = "S-0888:Existing Active Investigation Case(s)-During Intake Part 2 UnknownCaseHeadCheck", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void UnknownCaseHeadCheck() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			String maltreator = firstName.concat(" ").concat(middleName);
			String victim = thirdFirstName.concat(" ").concat(thirdMiddleName);
			String allegationID;
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(thirdFirstName, thirdMiddleName, thirdLastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
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

			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.verifyRequiredFields();
//			// Options : screenOut||familyServices||investigation
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("Yes");
			screeningDecision_OmniscriptPage.verifySelectActiveInvestigationCase();
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("No");
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
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.cancelButton();
			allegationReportPage.verifyCaseHead("Unknown");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0888:Existing Active Investigation Case(s)-During Intake Part 2 UnknownCaseHeadCheck");
		}

	}
}
