package com.acis.automation.testcases.basicMethods;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class IntakeTest extends TestBase {

	public IntakeTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(IntakeTest.class);
	
	
	@Test(description = "Intake Creation For Investigation with First Person Victim and Second Person Maltreator", groups = { "High",
			"acisRegression", "Mrunal" },priority = 0)

	public String intakeCreationInvestigationWithVictimMaltreator(String firstName, String middleName, String lastName, 
																String secondfirstName, String secondmiddleName, String secondlastName) throws AcisException, InterruptedException, IOException {
		 String allegationID ;
		 String  victim = firstName.concat(" ").concat(lastName);
		 String maltreator = secondfirstName.concat(" ").concat(secondlastName);
	
			
		 
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
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		return allegationID;
	
	}
	
	@Test(description = "Intake Creation For Investigation with One Person", groups = { "High",
			"acisRegression", "Mrunal" },priority = 0)

	public String intakeCreationInvestigationWithOnePerson(String firstName, String middleName, String lastName) throws AcisException, InterruptedException, IOException {
		 String allegationID ;
		 String  fullName = firstName.concat(" ").concat(lastName);
		
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
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
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
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectCaseHead(fullName);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationID = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			
		return allegationID;
	
	}
	
	@Test(description = "Intake Creation for Foster Care Case with One Person", groups = { "High",
			"acisRegression", "Mrunal" },priority = 0)

	public String intakeCreationFosterCareCaseWithOnePerson(String firstName, String middleName, String lastName) throws AcisException, Exception {
		
		String allegationID ;
		String  fullName = firstName.concat(" ").concat(lastName);
			
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
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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
		screeningDecision_OmniscriptPage.selectCaseHead(fullName);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		return allegationID;
		
		
	
	}
	

	@Test(description = "Intake Creation for Foster Care Case with Maltreator and Victim", groups = { "High",
			"acisRegression", "Mrunal" },priority = 0)

	public String intakeCreationFosterCareCaseWithVictimMaltreator(String firstName, String middleName, String lastName,
															String secondfirstName, String secondmiddleName, String secondlastName) throws AcisException, InterruptedException, IOException {
		
		String allegationID ;
		String  fullName = firstName.concat(" ").concat(lastName);
		
		 
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
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
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
		screeningDecision_OmniscriptPage.selectCaseHead(fullName);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		return allegationID;
	
	}
	

	@Test(description = "Intake Approval", groups = { "High",
			"acisRegression", "Mrunal" },priority = 1)

	public boolean intakeApproval(String allegationID) throws AcisException, Exception {

				
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
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
			allegationReportPage.closeIntakeOmniscript();
			screeningDecision_OmniscriptPage.cancelButton();
			allegationReportPage.refreshPageAndWait(10);
			allegationReportPage.verifyAllegationID(allegationID);
			allegationReportPage.verifyingAllegationReportStatus();
			homePage_SFDCPage.closeTabs();
			
			return true;
		}


	@Test(description = "Global Search Allegation ID", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public void searchAllegationID( String allegationID) throws AcisException, Exception {
		
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
	}

	
	
	@Test(description = "Create one Person on Person Involed Page ", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public void createOnePersonOnPersonInvaolvedPage(String firstName, String middleName, String lastName) throws AcisException, Exception {
		
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		
	}
	
	
	
	@Test(description = "Create Two Person on Person Involed Page", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public void createTwoPersonOnPersonInvaolvedPage(String firstName, String middleName, String lastName,
			String secondfirstName, String secondmiddleName, String secondlastName) throws AcisException, Exception {
		
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
	}
	
	
	@Test(description = "Click NewButton From AllAllegations", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public void clickNewButtonFromAllAllegations() throws AcisException, Exception {
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
   }
	
	
	
	@Test(description = "Create Two Persons on Person Invovled with all Details", groups = { "High",
			"acisRegression", "Mrunal" },priority = 0)

	public void createTwoPersonsWithAllDetails(String firstName, String middleName, String lastName, 
												String secondfirstName, String secondmiddleName, String secondlastName,
												String firstPersonPhone,String firstPersonEmail,String firstPersonStreet1, String firstPersonStreet2, 
												String firstPersonCity, String firstPersonZipcode , String firstPersonDOB, String firstPersonGender,
												String secondPersonPhone,String secondPersonEmail,String secondPersonStreet1, String secondPersonStreet2,
												String secondPersonCity, String secondPersonZipcode , String secondPersonDOB, String secondPersonGender) throws AcisException, InterruptedException, IOException {

		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.provideContactInformation(firstPersonPhone, firstPersonEmail);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",firstPersonStreet1);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",firstPersonStreet2);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",firstPersonCity);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",firstPersonZipcode);
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage.provideBirthdate(firstPersonDOB);
		createIntakePerson_OmniscriptPage.prvoideGender(firstPersonGender);
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.provideContactInformation(secondPersonPhone, secondPersonEmail);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",secondPersonStreet1);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",secondPersonStreet2);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",secondPersonCity);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",secondPersonZipcode);
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage.provideBirthdate(secondPersonDOB);
		createIntakePerson_OmniscriptPage.prvoideGender(secondPersonGender);
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
	}
	@Test(description = "Intake Creation For Investigation with First Person Maltreator", groups = { "High",
			"acisRegression", "Mrunal" },priority = 0)

	public String intakeCreationInvestigationWithMaltreator(String firstName, String middleName, String lastName,String Maltreator 
																) throws AcisException, InterruptedException, IOException {
		 String allegationID ;
		 String maltreator = firstName.concat(" ").concat(lastName);
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation(Maltreator);
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
	    allegationID=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();		
		return allegationID;
	
	}

}
