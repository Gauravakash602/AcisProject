package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ExistingActiveInvestigationCaseDuringIntakeTest_0137 extends TestBase {

	public ExistingActiveInvestigationCaseDuringIntakeTest_0137() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(ExistingActiveInvestigationCaseDuringIntakeTest_0137.class);

	String allegationID_1 , allegationID_2, intakeCaseID , investigationCaseID  ;
	int count1;
	 String firstName = faker.name().firstName();
	 String middleName = "";
	 String lastName = faker.name().lastName();

	 String secondfirstName = faker.name().firstName();
	 String secondmiddleName = "";
	 String secondlastName = faker.name().lastName();

	 String thirdfirstName = faker.name().firstName();
	 String thirdmiddleName = "";
	 String thirdlastName = faker.name().lastName();

	 String  victim_one = firstName.concat(" ").concat(lastName);
	 String maltreator_one = secondfirstName.concat(" ").concat(secondlastName);
	 String  victim_two = thirdfirstName.concat(" ").concat(thirdlastName);
	
//	 String  victim_oneFullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
//	 String maltreator_oneFullName = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);
//	 String  victim_twoFullName = thirdfirstName.concat(" ").concat(thirdmiddleName).concat(" ").concat(thirdlastName);
	
	
	@Test(enabled = false,description = " US:0137 Existing Active Investigation Case(s)-During Intake - Intake Creation", groups = { "High",
			"acisRegression", "Mrunal" },priority = 0)

	public void existingActiveInvestigationCaseIntakeCreation() throws AcisException, InterruptedException, IOException {
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
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
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator_one);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator_one, victim_one);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID_1=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		
		
		count1++;
	
	}
	
	@Test(enabled = false,description = " US:0137 Existing Active Investigation Case(s)-During Intake - Intake Approval", groups = { "High",
			"acisRegression", "Mrunal" },priority = 1)

	public void existingActiveInvestigationCaseIntakeApproval() throws AcisException, Exception {

		if(count1 ==1) {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID_1);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.closeIntakeOmniscript();
			screeningDecision_OmniscriptPage.cancelButton();
			allegationReportPage.verifyingAllegationReportStatus();
			 intakeCaseID =allegationReportPage.getIntakeCaseID();
			investigationCaseID = allegationReportPage.getInvestigationCaseID();
				
			homePage_SFDCPage.closeTabs();
			count1++;

		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
	  	
	}
	
	@Test(description = " US:0137 Existing Active Investigation Case(s)-During Intake - Intake Creation ", groups = { "High",
			"acisRegression", "Mrunal" },priority = 2)

	public void existingActiveInvestigationCaseNewIntakeCreation() throws AcisException, Exception {
		
		
		allegationID_1=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondfirstName, secondmiddleName, secondlastName);
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID_1);
		loginTest.intakeTest.searchAllegationID(allegationID_1);
		intakeCaseID =allegationReportPage.getIntakeCaseID();
		investigationCaseID = allegationReportPage.getInvestigationCaseID();
		loginTest.logout();
		loginTest.login("Intake");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(thirdfirstName, thirdmiddleName, thirdlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", firstName, lastName);
		searchPerson_OmniscriptPage.selectPerson(firstName, lastName, "AllegedVictim", "No");
		searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", secondfirstName, secondlastName);
		searchPerson_OmniscriptPage.selectPerson(secondfirstName, secondlastName, "AllegedMallternator", "Yes");
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator_one);
		screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("Yes");
		screeningDecision_OmniscriptPage.selectActiveInvestigationCaseID(investigationCaseID);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("existingCase");
//		screeningDecision_OmniscriptPage.selectExistingCaseHistory(intakeCaseID);
		screeningDecision_OmniscriptPage.newAllegations("Neglect",maltreator_one, victim_one);
		screeningDecision_OmniscriptPage.newAllegationsNext("Sex Abuse",maltreator_one, victim_two);
		
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID_2=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		count1++;
	
	}
	
	
	
	
	@Test(description = " US:0137 Existing Active Investigation Case(s)-During Intake - Intake Approval two", groups = { "High",
			"acisRegression", "Mrunal" },priority = 3)

	public void existingActiveInvestigationCaseIntakeApprovalTwo() throws AcisException, Exception {

		if(count1 ==1) {
			
			loginTest.login("Supervisor");
			loginTest.intakeTest.searchAllegationID(allegationID_2);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator_one);
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("Yes");
			screeningDecision_OmniscriptPage.selectActiveInvestigationCaseID(investigationCaseID);		
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.closeIntakeOmniscript();
			screeningDecision_OmniscriptPage.cancelButton();
			allegationReportPage.verifyingAllegationReportStatus();	
			homePage_SFDCPage.closeTabs();
			count1++;

		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
	  	
	}
	
	@Test(description = " US:0137 Existing Active Investigation Case(s)-During Intake - Validation", groups = { "High",
			"acisRegression", "Mrunal" },priority = 4)

	public void existingActiveInvestigationCaseNewValidation() throws AcisException, Exception {
		
		if(count1 ==2) {
				
		loginTest.login("Intake");
		loginTest.intakeTest.searchAllegationID(allegationID_2);
		allegationReportPage.VerifyIntakeCaseID(intakeCaseID);
		allegationReportPage.verifyInvestigationCaseID(investigationCaseID);
		allegationReportPage.clickonAlligationRecord();
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickCasePersonTab();
		investigationCasePage.verifyCasePerson(victim_one);
		investigationCasePage.verifyCasePerson(maltreator_one);
		investigationCasePage.verifyCasePerson(victim_two);
		investigationCasePage.closeCasePersonTab();
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickAllegationTab();
		investigationCasePage.verifyAllegationRecord("Abuse", "Neglect", maltreator_one, victim_one, victim_one);
		investigationCasePage.verifyAllegationRecord("Sex Abuse", "", maltreator_one, victim_two, "");
		homePage_SFDCPage.closeTabs();
		
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Data Creation Does Not completed Successfully, so can not run this test");
	 	}
		
	}	

}
