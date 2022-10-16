package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class InteractionsCleanUpTest_1202 extends TestBase  {

	public InteractionsCleanUpTest_1202() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	String allegationID_1,allegationID_2,fosterCaseID , firstPersonfullName, firstPersonName  , secondPersonfullName, secondPersonName;
	int count1,count2;
	
	@Test(enabled = false,description = "US:01202 : Interactions Clean-Up : Intake creation", groups = { "High",
		"acisRegression", "Mrunal" }, priority = 0)

	public void interactionsCleanUpTestFosterCareCaseIntake() throws AcisException, InterruptedException, IOException {
		try {

			String firstName=faker.name().firstName();
			String middleName=faker.name().firstName();
			String lastName=faker.name().lastName();
			
			String secondfirstName = faker.name().firstName();
			String secondmiddleName = faker.name().firstName();
			String secondlastName = faker.name().lastName();

			firstPersonfullName = firstName+" "+middleName+" "+lastName;
			firstPersonName = firstName+" "+ lastName;
			
			secondPersonfullName = secondfirstName +" " + secondmiddleName +" " + secondlastName;
			secondPersonName = secondfirstName+ " " + secondlastName;
			
		
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
		
		createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		
		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
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
		screeningDecision_OmniscriptPage.selectCaseHead(firstPersonfullName);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.clickSubmitbtn();

		allegationID_1 = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		count1++;

	} catch (Exception e) {
		// TODO Auto-generated catch block
		getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
	}

}

	@Test(enabled = false,description = "US:01202 : Interactions Clean-Up : Intake approval", groups = { "High",
		"acisRegression", "Mrunal" }, priority = 1)
	public void interactionsCleanUpTestFosterCareCaseSupervisor() throws AcisException, Exception {
	if(count1==1)
	{
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
		
		allegationReportPage.verifyingAllegationReportStatus();
		homePage_SFDCPage.closeTabs();
		count1++;
	}
		else {
			throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
		}

	
}



	@Test(description = "US:01202 : Interactions Clean-Up : Foster Care case", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void interactionsCleanUpTestFosterCareCase() throws AcisException, Exception {
	
	
		String firstName=faker.name().firstName();
		String middleName=faker.name().firstName();
		String lastName=excel.getLastName();
		
		String secondfirstName = faker.name().firstName();
		String secondmiddleName = faker.name().firstName();
		String secondlastName = excel.getLastName();

		firstPersonfullName = firstName+" "+middleName+" "+lastName;
		firstPersonName = firstName+" "+ lastName;
		
		secondPersonfullName = secondfirstName +" " + secondmiddleName +" " + secondlastName;
		secondPersonName = secondfirstName+ " " + secondlastName;
		
				
		loginTest.login("Intake");
		loginTest.intakeTest.clickNewButtonFromAllAllegations();
		loginTest.intakeTest.createTwoPersonsWithAllDetails(firstName, middleName, lastName, 
															secondfirstName, secondmiddleName, secondlastName, 
															excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4),
															excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4), 
															testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"), testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
															testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"), testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"), 
															String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)), testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"), 
															excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4),
															excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4), 
															testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"), testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"),
															testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"), testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"), 
															String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)), testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		screeningDecision_OmniscriptPage.selectCaseHead(firstPersonName);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationID_1 = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		loginTest.logout();
		loginTest.intakeTest.intakeApproval(allegationID_1);
		loginTest.logout();
		loginTest.login("Supervisor");
		loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadBySelectingMaltreatorVictimAndSearchID(firstPersonName);
		
		/*Case management Pre-requisite*/
	     caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
	 	
	     /*Check in SA flow*/
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickAssessmentsTab();
		investigationCasePage.clickNewSafetyAssessmentButton();
		//Review Allegation page
		reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
		personsInvolved_SA_OmniscriptPage.clickNextButton();
		establishRelations_SA_OmniScriptPage.clickNextButton();
		interviewChildren_SA_OmniScriptPage.clickCreateChildrenInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interviewChildren_SA_OmniScriptPage.provideDifferentDate("Today");
		interviewChildren_SA_OmniScriptPage.selectAttempts("Successfull");
		interviewChildren_SA_OmniScriptPage.prvoideType("Visit");
		interviewChildren_SA_OmniScriptPage.prvoideSubType("Child");
		interviewChildren_SA_OmniScriptPage.prvoideLocation("Biological Home");
		interviewChildren_SA_OmniScriptPage.prvoideMethod("FaceToFace");
		interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("narrative", "Interviw narrative Demo");
		interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("profesionalopinion","Interviw profesionalopinion Demo");
		interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(firstPersonName);
		interviewChildren_SA_OmniScriptPage.clickSavebutton();
		interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
		interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
		interviewChildren_SA_OmniScriptPage.clickNextButton();
		// Interview Care giver 
		interviewCaregivers_SA_OmniScriptPage.clickCreateChildrenInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interviewCaregivers_SA_OmniScriptPage.provideDate();
		interviewCaregivers_SA_OmniScriptPage.selectAttempts("Successfull");
		interviewCaregivers_SA_OmniScriptPage.prvoideType("Visit");
		interviewCaregivers_SA_OmniScriptPage.prvoideSubType("Child");
		interviewCaregivers_SA_OmniScriptPage.prvoideLocation("Biological Home");
		interviewCaregivers_SA_OmniScriptPage.prvoideMethod("FaceToFace");
		interviewCaregivers_SA_OmniScriptPage.enterTextFieldValueOnInterviewChildren("narrative", "Interviw narrative Demo");
		interviewCaregivers_SA_OmniScriptPage.enterTextFieldValueOnInterviewChildren("profesionalopinion","Interviw profesionalopinion Demo");
		interviewCaregivers_SA_OmniScriptPage.clickSavebutton();
		interviewCaregivers_SA_OmniScriptPage.switchToDefaultContent();
		interviewCaregivers_SA_OmniScriptPage.closeCaregiverTab();
		interviewCaregivers_SA_OmniScriptPage.clickNextButton();
		//Assess the home
		assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
		//Decision Making Tool page
		safetyScale_SA_OmniScriptPage.clickNextButton();
		//Safety Decision
		safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(firstPersonfullName);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
		investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
		investigationCasePage.closeAssessmentsTab();
		
		/*Edit SA and check*/
		/*Safety Assessment flow*/
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickAssessmentsTab();
		
		investigationSafetyAssessmentPage.clickFirstRecord();
		investigationSafetyAssessmentPage.clickSafetyAssessmentRecordButton();
		reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
		personsInvolved_SA_OmniscriptPage.clickNextButton();
		establishRelations_SA_OmniScriptPage.clickNextButtonOfApprovalFlow();
		interview_OmniScriptPage.clickCreateInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interview_OmniScriptPage.verifyAttemptsOption();
		interview_OmniScriptPage.closeCaregiverTabCheck();
		investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
		investigationSafetyAssessmentPage.closeSafetyAssessmentRecordTab();
		investigationCasePage.closeAssessmentsTab();
		
		/*Check in all Interaction types*/
		
		/*Create Interaction of type Visit*/
		investigationCasePage.clickInsightTabOfInvestigation();
		investigationCasePage.clickInteractionsTab();
		newInteractionVisitsPage.clickNewbtnOfInteraction();
		newInteractionVisitsPage.selectVisitbtn();
		interview_OmniScriptPage.iframeSwitch();
		newInteractionVisitsPage.verifyAttemptsOption();
		newInteractionVisitsPage.switchToDefaultContent();
		newInteractionVisitsPage.closeNewInteraction();
		

		/*Create Interaction of type Meeting*/
		
//		investigationCasePage.clickInsightTabOfInvestigation();
//		investigationCasePage.clickInteractionsTab();
		newInteractionVisitsPage.clickNewbtnOfInteraction();
		newInteractionPage.selectInteractionType("Meeting");
		newInteractionPage.clickNextButton();
		meetingTypeInteractionPage.iframeSwitch();
		meetingTypeInteractionPage.verifyAttemptsOption();
		newInteractionVisitsPage.switchToDefaultContent();
		newInteractionVisitsPage.closeNewInteraction();
		
		/*Create Interaction of type Collateral contact*/
		newInteractionVisitsPage.clickNewbtnOfInteraction();
		newInteractionPage.selectInteractionType("CollateralContact");
		newInteractionPage.clickNextButton();
		collateralTypeInteractionPage.iframeSwitch();
		collateralTypeInteractionPage.verifyAttemptsOption();
		newInteractionVisitsPage.switchToDefaultContent();
		newInteractionVisitsPage.closeNewInteraction();
		
		investigationCasePage.closeInteractionTab();
	
		/*check in Family finding*/
		locateRelativesPage.openFamilyFinding();
		locateRelativesPage.selectCheckBox("Ask family members");
		locateRelativesPage.verifyAttemptsOption();
		
		/* ################### INVALID PART ################ */
/*		locateRelativesPage.clickNextButton();
		personsInvovledPage.clickNextButton();
		// Add relationship 
		establishRelationshipsPage.clickCreateAddButton();
		establishRelationshipsPage.searchText(firstPersonName, "Person");
		establishRelationshipsPage.setRelationShip("Child-Mother");
		establishRelationshipsPage.searchText( secondPersonName, "Related");
		establishRelationshipsPage.clickSaveButton("first");
	
		establishRelationshipsPage.clickNext();
		createPlacementResourcePage.selectPlacementCreate("Yes");
		createKinShipPage.selectParentText("Parent 1",firstPersonName);
		createKinShipPage.clickNextButton();
		createKinShipPage.clickNextButton();
		createPlacementResourcePage.clickSubmitButton();
		
		/*#####################  Now below Functionality in INVALID #######################*/
		/*Check person gets created under case person with type Kinship*/
/*		investigationCasePage.clickRelatedTabOfInvestigation();
		investigationCasePage.clickCasePersonTab();
		investigationCasePage.sortAddressIDColumn("Descedning");
		investigationCasePage.clickCasePerson(firstPersonfullName);
		placementPersonAccountPage.checkPlacementTypeValue("Kinship");
		investigationCasePage.closeCasePersonIdTab();
		investigationCasePage.closeCasePersonTab();
		
		/*check in Family finding : Placement Account exist error*/
/*		locateRelativesPage.openFamilyFinding();
		locateRelativesPage.selectCheckBox("Ask family members");
		locateRelativesPage.verifyAttemptsOption();
		locateRelativesPage.clickNextButton();
		personsInvovledPage.clickNextButton();
		establishRelationshipsPage.clickNext();
		createPlacementResourcePage.selectPlacementCreate("Yes");
		createKinShipPage.selectParentText("Parent 1",firstPersonName);
		createKinShipPage.clickNextButton();
		createKinShipPage.clickNextButton();
		householdMembersPage.verifyPlacementAccountError();
*/		
		homePage_SFDCPage.closeTabs();
	
	  	}
	
	


	@Test(enabled = false,description = "US:01202 : Interactions Clean-Up : Investigation case : Intake Creation", groups = { "High",
			"acisRegression", "Mrunal" } ,priority = 3)

	public void interactionsCleanUpTestInvestigationIntakeCreation() throws AcisException, InterruptedException, IOException {
			
 
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		String firstName=excel.generateRandomTestData(excel.generateRandomTestData("FP", 4),4);
		String middleName=excel.generateRandomTestData(excel.generateRandomTestData("FP", 3),3);
		String lastName=excel.generateRandomTestData(excel.generateRandomTestData("FP", 3),3);
		
		String secondfirstName = excel.generateRandomTestData(excel.generateRandomTestData("", 4), 4);
		String secondmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("", 3), 3);
		String secondlastName = excel.generateRandomTestData(excel.generateRandomTestData("", 3), 4);
		
		String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
		 String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);
		
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
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
	//	createIntakePerson_OmniscriptPage.provideContactInformation(
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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

	//	createIntakePerson_OmniscriptPage.provideContactInformation(
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		// Options : screenOut||familyServices||investigation
		// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		// Options : workerComments||supervisoryComments||narrative
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(victim);
		
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID_2=allegationReportPage.getAllegationID();
	    
		
		count2++;
	}
	
	
	@Test(enabled = false,description = " US:01202 : Interactions Clean-Up : Investigation case:  Intake Approval", groups = { "High",
			"acisRegression", "Mrunal" } ,priority = 4)

	public void interactionsCleanUpTestInvestigationIntakeApproval() throws AcisException, Exception {
		
		if(count2 ==1)
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID_2);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatus();
			
			count2++;
			
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
 
	}
	
	@Test(description = "US:01202 : Interactions Clean-Up : Investigation case", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 5)

	public void interactionsCleanUpTestInvestigation() throws AcisException, Exception {
			
	
		String firstName=faker.name().firstName();
		String middleName=faker.name().firstName();
		String lastName=faker.name().firstName();

		String secondfirstName = faker.name().firstName();
		String secondmiddleName = faker.name().firstName();
		String secondlastName = excel.getLastName();

		firstPersonfullName = firstName+" "+middleName+" "+lastName;
		firstPersonName = firstName+" "+ lastName;

			
			allegationID_2=loginTest.intakeTest.intakeCreationInvestigationWithOnePerson(firstName, middleName, lastName);
			
			
			
			loginTest.login("Intake");
			loginTest.intakeTest.clickNewButtonFromAllAllegations();
			loginTest.intakeTest.createTwoPersonsWithAllDetails(firstName, middleName, lastName, 
																secondfirstName, secondmiddleName, secondlastName, 
																excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4),
																excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4), 
																testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"), testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
																testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"), testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"), 
																String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)), testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"), 
																excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4),
																excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4), 
																testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"), testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"),
																testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"), testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"), 
																String.valueOf((personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-16)), testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectCaseHead(firstPersonName);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationID_2 = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID_2);
			loginTest.logout();
			loginTest.login("Investigator");
			loginTest.investigationTest.openInvestigationCase(allegationID_2);
			
		    /*Check in SA flow*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			//Review Allegation page
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelations_SA_OmniScriptPage.clickNextButton();
			interviewChildren_SA_OmniScriptPage.clickCreateChildrenInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interviewChildren_SA_OmniScriptPage.provideDifferentDate("Today");
			interviewChildren_SA_OmniScriptPage.selectAttempts("Successfull");
			interviewChildren_SA_OmniScriptPage.prvoideType("Visit");
			interviewChildren_SA_OmniScriptPage.prvoideSubType("Child");
			interviewChildren_SA_OmniScriptPage.prvoideLocation("Biological Home");
			interviewChildren_SA_OmniScriptPage.prvoideMethod("FaceToFace");
			interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("narrative", "Interviw narrative Demo");
			interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("profesionalopinion","Interviw profesionalopinion Demo");
			interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(firstPersonName);
			interviewChildren_SA_OmniScriptPage.clickSavebutton();
			interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
			interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			// Interview Care giver 
			interviewCaregivers_SA_OmniScriptPage.clickCreateChildrenInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interviewCaregivers_SA_OmniScriptPage.provideDate();
			interviewCaregivers_SA_OmniScriptPage.selectAttempts("Successfull");
			interviewCaregivers_SA_OmniScriptPage.prvoideType("Visit");
			interviewCaregivers_SA_OmniScriptPage.prvoideSubType("Child");
			interviewCaregivers_SA_OmniScriptPage.prvoideLocation("Biological Home");
			interviewCaregivers_SA_OmniScriptPage.prvoideMethod("FaceToFace");
			interviewCaregivers_SA_OmniScriptPage.enterTextFieldValueOnInterviewChildren("narrative", "Interviw narrative Demo");
			interviewCaregivers_SA_OmniScriptPage.enterTextFieldValueOnInterviewChildren("profesionalopinion","Interviw profesionalopinion Demo");
			interviewCaregivers_SA_OmniScriptPage.clickSavebutton();
			interviewCaregivers_SA_OmniScriptPage.switchToDefaultContent();
			interviewCaregivers_SA_OmniScriptPage.closeCaregiverTab();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			//Assess the home
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			//Decision Making Tool page
			safetyScale_SA_OmniScriptPage.clickNextButton();
			//Safety Decision
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(firstPersonfullName);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.closeAssessmentsTab();
			
			/*Edit SA and check*/
			/*Safety Assessment flow*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			
			investigationSafetyAssessmentPage.clickFirstRecord();
			investigationSafetyAssessmentPage.clickSafetyAssessmentRecordButton();
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelations_SA_OmniScriptPage.clickNextButtonOfApprovalFlow();
			interview_OmniScriptPage.clickCreateInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interview_OmniScriptPage.verifyAttemptsOption();
			interview_OmniScriptPage.closeCaregiverTabCheck();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationSafetyAssessmentPage.closeSafetyAssessmentRecordTab();
			investigationCasePage.closeAssessmentsTab();
			
			/*Check in all Interaction types*/
			
			/*Create Interaction of type Visit*/
			investigationCasePage.clickInsightTabOfInvestigation();
			investigationCasePage.clickInteractionsTab();
			newInteractionVisitsPage.clickNewbtnOfInteraction();
			newInteractionVisitsPage.selectVisitbtn();
			interview_OmniScriptPage.iframeSwitch();
			newInteractionVisitsPage.verifyAttemptsOption();
			newInteractionVisitsPage.switchToDefaultContent();
			newInteractionVisitsPage.closeNewInteraction();
			

			/*Create Interaction of type Meeting*/
			
//			investigationCasePage.clickInsightTabOfInvestigation();
//			investigationCasePage.clickInteractionsTab();
			newInteractionVisitsPage.clickNewbtnOfInteraction();
			newInteractionPage.selectInteractionType("Meeting");
			newInteractionPage.clickNextButton();
			meetingTypeInteractionPage.iframeSwitch();
			meetingTypeInteractionPage.verifyAttemptsOption();
			newInteractionVisitsPage.switchToDefaultContent();
			newInteractionVisitsPage.closeNewInteraction();
			
			/*Create Interaction of type Collateral contact*/
			newInteractionVisitsPage.clickNewbtnOfInteraction();
			newInteractionPage.selectInteractionType("CollateralContact");
			newInteractionPage.clickNextButton();
			collateralTypeInteractionPage.iframeSwitch();
			collateralTypeInteractionPage.verifyAttemptsOption();
			newInteractionVisitsPage.switchToDefaultContent();
			newInteractionVisitsPage.closeNewInteraction();
			
			investigationCasePage.closeInteractionTab();
		
			/*check in Family finding*/
			locateRelativesPage.openFamilyFinding();
			locateRelativesPage.selectCheckBox("Ask family members");
			locateRelativesPage.verifyAttemptsOption();
			
			/* ################### INVALID PART ################ */
	/*		locateRelativesPage.clickNextButton();
			personsInvovledPage.clickNextButton();
			// Add relationship 
			establishRelationshipsPage.clickCreateAddButton();
			establishRelationshipsPage.searchText(firstPersonName, "Person");
			establishRelationshipsPage.setRelationShip("Child-Mother");
			establishRelationshipsPage.searchText( secondPersonName, "Related");
			establishRelationshipsPage.clickSaveButton("first");
		
			establishRelationshipsPage.clickNext();
			createPlacementResourcePage.selectPlacementCreate("Yes");
			createKinShipPage.selectParentText("Parent 1",firstPersonName);
			createKinShipPage.clickNextButton();
			createKinShipPage.clickNextButton();
			createPlacementResourcePage.clickSubmitButton();
			
			/*#####################  Now below Functionality in INVALID #######################*/
			/*Check person gets created under case person with type Kinship*/
	/*		investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.sortAddressIDColumn("Descedning");
			investigationCasePage.clickCasePerson(firstPersonfullName);
			placementPersonAccountPage.checkPlacementTypeValue("Kinship");
			investigationCasePage.closeCasePersonIdTab();
			investigationCasePage.closeCasePersonTab();
			
			/*check in Family finding : Placement Account exist error*/
	/*		locateRelativesPage.openFamilyFinding();
			locateRelativesPage.selectCheckBox("Ask family members");
			locateRelativesPage.verifyAttemptsOption();
			locateRelativesPage.clickNextButton();
			personsInvovledPage.clickNextButton();
			establishRelationshipsPage.clickNext();
			createPlacementResourcePage.selectPlacementCreate("Yes");
			createKinShipPage.selectParentText("Parent 1",firstPersonName);
			createKinShipPage.clickNextButton();
			createKinShipPage.clickNextButton();
			householdMembersPage.verifyPlacementAccountError();
	*/		
			homePage_SFDCPage.closeTabs();
		
	
		}
		
 
	
}
