package com.acis.automation.testcases.basicMethods;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class InvestigationTest extends TestBase {

	public InvestigationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String firstName =  faker.name().firstName();;
	 String middleName =faker.name().lastName();
	 String lastName =faker.name().lastName();;

	 String secondfirstName = faker.name().firstName();
	 String secondmiddleName =faker.name().lastName();
	 String secondlastName = faker.name().lastName();

	 String  maltreator = firstName.concat(" ").concat(lastName);
	 String victim = secondfirstName.concat(" ").concat(secondlastName);

	@Test(description = "Intake creation from one person", groups = { "High", "aCIS_Regression", "Khushboo" })
	public void intakeCreationOnePerson() throws AcisException, Exception {
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
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
	}

	@Test(description = "Intake creation from Two person", groups = { "High", "aCIS_Regression", "Khushboo" })
	public void intakeCreationTwoPerson() throws AcisException, Exception {
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
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

		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName,secondmiddleName,secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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
	}

	@Test(description = "Intake Approval", groups = { "High", "aCIS_Regression", "Khushboo" })
	public String intakeApproval() throws AcisException, Exception {
		allegationReportPage.clickIntakeBtn();
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectAcceptAssign();
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.cancelIntakeOmniscript();
		allegationReportPage.verifyingAllegationReportStatus();
		return maltreator;

		
	}
	@Test(description = "Investigation workflow creation from one person", groups = { "High", "aCIS_Regression", "Khushboo" })
	public void investigationWorkFlow() throws AcisException, Exception {
		investigationCasePage.clickInvestigationWorkflow();
		reviewAllegationReport_OmniScriptPage.clickNextButton();
		personsInvovled_Workflow_OmniscriptPage.clickNextButton();
		establishRelationships__OmniScriptPage.clickCreateAddButton();
		establishRelationships__OmniScriptPage.searchText(maltreator, "Person");
		establishRelationships__OmniScriptPage.setRelationShip("Child-Father");
		establishRelationships__OmniScriptPage.searchText(victim, "Related");
		establishRelationships__OmniScriptPage.clickSaveButton("Save");
		establishRelationships__OmniScriptPage.clickNextButton();
		interview_OmniScriptPage.clickCreateInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interview_OmniScriptPage.provideDate();
		interview_OmniScriptPage.prvoideType("Visit");
		interview_OmniScriptPage.prvoideLocation("Biological Home");
		interview_OmniScriptPage.prvoideSubType("Child");
		interview_OmniScriptPage.prvoideMethod("Phone");
		interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
		interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
		interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
		interview_OmniScriptPage.clickSavebutton();
		interview_OmniScriptPage.closeCaregiverTab();
		interview_OmniScriptPage.clickNextButton();
		// Collateral
		collaterals_OmniScriptPage.clickCreateCollateral();
		collaterals_OmniScriptPage.iframeSwitch();
		collaterals_OmniScriptPage.setDate();
		collaterals_OmniScriptPage.setCheckbox("Scheduled");
		collaterals_OmniScriptPage.typePicklist("Collateral");
		collaterals_OmniScriptPage.subTypePicklist("MentalHealth");
		collaterals_OmniScriptPage.enterTextFieldValue("CollateralPerson", "Test");
		collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
		collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
		collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
		collaterals_OmniScriptPage.clickSaveButton();
		collaterals_OmniScriptPage.closeCollateraltab();
		collaterals_OmniScriptPage.clickNextButton();
		// Record
		recordReview_OmniScriptPage.enterTextRecordReview("abc");
		recordReview_OmniScriptPage.nextPage();
		findings_OmniScriptPage.addAllegation("Substantiated", maltreator);
		findings_OmniScriptPage.clickonSubmitButton();
}

	@Test(description = "Safety Assessment workflow", groups = { "High", "aCIS_Regression", "Khushboo" })
	public void safetyAssessment() throws AcisException, Exception {
		investigationCasePage.clickNewSafetyAssessmentButton();
		//Review Allegation page
		reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
		// Add new person
		personsInvolved_SA_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		personsInvolved_SA_OmniscriptPage.linkToCreateNewPerson();
		personsInvolved_SA_OmniscriptPage.setAllNames(firstName,middleName,lastName);
		personsInvolved_SA_OmniscriptPage.clickSaveButton("next");
		personsInvolved_SA_OmniscriptPage.closeCreateIntakePerson();
		personsInvolved_SA_OmniscriptPage.clickRefresPersonButton();
		personsInvolved_SA_OmniscriptPage.clickNextButton();
		
		// Add relationship 
		establishRelations_SA_OmniScriptPage.clickCreateAddButton();
		establishRelations_SA_OmniScriptPage.searchTexT("Person", firstName);
		establishRelations_SA_OmniScriptPage.setRelationShip("Child-Mother");
		establishRelations_SA_OmniScriptPage.searchTexT("Related", secondfirstName);
		establishRelations_SA_OmniScriptPage.clickSaveButton();
		establishRelations_SA_OmniScriptPage.clickNextButton();
		// Interview children
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
		interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(victim);
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
		interviewCaregivers_SA_OmniScriptPage.clickParticipantCheckbox(maltreator);
		interviewCaregivers_SA_OmniScriptPage.clickSavebutton();
		interviewCaregivers_SA_OmniScriptPage.switchToDefaultContent();
		interviewCaregivers_SA_OmniScriptPage.closeCaregiverTab();
		interviewCaregivers_SA_OmniScriptPage.clickNextButton();
		//Assess the home
		assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
		//Decision Making Tool page
		safetyScale_SA_OmniScriptPage.clickCreateAddButton();
		safetyScale_SA_OmniScriptPage.selectDeniedMedical("Yes");
		safetyScale_SA_OmniScriptPage.selectDrugAlcohol("No");
		safetyScale_SA_OmniScriptPage.selectHazardousUnsanitary("No");
		safetyScale_SA_OmniScriptPage.selectPromoteViolence("No");
		safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
		safetyScale_SA_OmniScriptPage.selectSpousalAbuse("Yes");
		safetyScale_SA_OmniScriptPage.clickSave();
		safetyScale_SA_OmniScriptPage.clickNextButton();
		//Safety Decision
		safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
//		safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(maltreator);
//		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
		investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
		investigationCasePage.closeAssessmentsTab();
}
	@Test(description = "Create Foster Care Case from Specific Case Head", groups = { "High",
			"aCIS_Regression", "Khushboo" })
	public String createFosterCareCaseFromCaseHeadAndSearchID(String personFullName ) throws AcisException, Exception {
	
		String fosterCaseID ;
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.selectAllCaseHeads();
		homePage_SFDCPage.searchRecordAndClick(personFullName);
		fosterCaseID=caseHeadPage.newFosterCase();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);		
		return fosterCaseID;
		
	}
	@Test(description="Establish Relationship When Adding Person to Investigation Case Action and submitting safety assesment work flow",groups = { "High",
			"aCIS_Regression", "Khushboo"})
		public void establishRelationshipSafetyAssesmsentflow( ) throws AcisException, Exception {
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickCreateAddButton();
			establishRelationships__OmniScriptPage.searchText(maltreator, "Person");
			establishRelationships__OmniScriptPage.setRelationShip("Child-Mother");
			establishRelationships__OmniScriptPage.searchText(victim, "Related");
			establishRelationships__OmniScriptPage.clickSaveButton("Save");
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickCreateInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interview_OmniScriptPage.provideDate();
			interview_OmniScriptPage.prvoideType("Visit");
			interview_OmniScriptPage.prvoideLocation("Biological Home");
			interview_OmniScriptPage.prvoideSubType("Child");
			interview_OmniScriptPage.prvoideMethod("Phone");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion",
					"Interviw profesionalopinion Demo");
			interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
			interview_OmniScriptPage.clickSavebutton();
			interview_OmniScriptPage.closeCaregiverTab();
			interview_OmniScriptPage.clickNextButton();
			// Collateral
			collaterals_OmniScriptPage.clickCreateCollateral();
			collaterals_OmniScriptPage.iframeSwitch();
			collaterals_OmniScriptPage.setDate();
			collaterals_OmniScriptPage.setCheckbox("Scheduled");
			collaterals_OmniScriptPage.typePicklist("Collateral");
			collaterals_OmniScriptPage.subTypePicklist("MentalHealth");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPerson", "Test");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
			collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
			collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
			collaterals_OmniScriptPage.clickSaveButton();
			collaterals_OmniScriptPage.closeCollateraltab();
			collaterals_OmniScriptPage.clickNextButton();
			// Record
			recordReview_OmniScriptPage.enterTextRecordReview("abc");
			recordReview_OmniScriptPage.nextPage();
			findings_OmniScriptPage.addAllegation("Substantiated", maltreator);
			findings_OmniScriptPage.clickonSubmitButton();

		}
	@Test(description = "create interview linkof investigation", groups = { "High", "aCIS_Regression", "Khushboo" })
	public void createInterview(String provideType,String prvoideLocation,String prvoideSubType,String prvoideMethod,String enterTextFieldValueOnInterview,String clickParticipantCheckbox) throws AcisException, Exception {
		interview_OmniScriptPage.clickCreateInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interview_OmniScriptPage.provideDate();
		interview_OmniScriptPage.prvoideType(provideType);
		interview_OmniScriptPage.prvoideLocation(prvoideLocation);
		interview_OmniScriptPage.prvoideSubType(prvoideSubType);
		interview_OmniScriptPage.prvoideMethod(prvoideMethod);
		interview_OmniScriptPage.enterTextFieldValueOnInterview(enterTextFieldValueOnInterview, "Interviw narrative Demo");
		interview_OmniScriptPage.enterTextFieldValueOnInterview(enterTextFieldValueOnInterview,"Interviw profesionalopinion Demo");
		interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
		interview_OmniScriptPage.clickSavebutton();
		interview_OmniScriptPage.closeCaregiverTab();


	}


	@Test(description = "Open Investigation case from Allegation ID", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public void openInvestigationCase( String allegationID) throws AcisException, Exception {
	
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
	}
	
	@Test(description = "Get Investigation case ID from Allegation ID record", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	public String getInvestigationID( String allegationID ) throws AcisException, Exception {
	
		String investigationCaseID;
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		investigationCaseID = investigationCasePage.getInvestigationID();
		
		homePage_SFDCPage.closeTabs();
		
		return investigationCaseID;
	
	}
}
