package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SupervisoryApprovalofSafetyAssessmentTest_01131 extends TestBase  {

	public SupervisoryApprovalofSafetyAssessmentTest_01131() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(SupervisoryApprovalofSafetyAssessmentTest_01131.class);

	
	int count1, count2;
	String allegationID,caseID , allegationID_1 , fosterCaseID;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName = excel.getLastName();
	
	String thirdfirstName = faker.name().firstName();
	String thirdmiddleName = faker.name().firstName();
	String thirdlastName = excel.getLastName();
	
	String fourthfirstName = faker.name().firstName();
	String fourthmiddleName = faker.name().firstName();
	String fourthlastName = excel.getLastName();
	
	String  victim = firstName.concat(" ").concat(lastName);
	String maltreator = secondfirstName.concat(" ").concat(secondlastName);

	String victim_OOH = thirdfirstName.concat(" ").concat(thirdlastName);
	String maltreator_OOH  = fourthfirstName.concat(" ").concat(fourthlastName);
	


	
	@Test(enabled = false,description = "US01131: Supervisory Approval of Safety Assessment : Intake Creation", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 0)

	public void supervisoryApprovalofSafetyAssessmentIntakeLogin() throws AcisException, InterruptedException, IOException {
	
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					"",
					"",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			
//			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
		    allegationID=allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			
			count1++;
	}
	
	@Test(enabled = false,description = "US01131: Supervisory Approval of Safety Assessment :  Intake Approval", groups = { "High",
			"acisRegression", "Mrunal" },priority = 1)

	public void supervisoryApprovalofSafetyAssessmentApproval() throws AcisException, Exception {
	
		if(count1 ==1)
		{
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
			
			allegationReportPage.verifyingAllegationReportStatus();
			homePage_SFDCPage.closeTabs();
			
			count1++;
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
	  	
		
		
	}
	
	@Test(description = "US01131: Supervisory Approval of Safety Assessment :  Investigation USer", groups = { "High",
			"acisRegression", "Mrunal" },priority = 2)

	public void supervisoryApprovalofSafetyAssessmentInvestigation() throws AcisException, Exception {
		
		
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
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
		    allegationID=allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("Investigator");
			loginTest.investigationTest.openInvestigationCase(allegationID);
			
			
			/*Safety Assessment flow*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			//Review Allegation page
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelations_SA_OmniScriptPage.clickNextButton();
			// Interview children
			interviewChildren_SA_OmniScriptPage.clickCreateChildrenInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interviewChildren_SA_OmniScriptPage.provideDifferentDate("Today");
			interviewChildren_SA_OmniScriptPage.prvoideType("Visit");
			interviewChildren_SA_OmniScriptPage.selectAttempts("Successfull");
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
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			//Assess the home
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			//Decision Making Tool page
			safetyScale_SA_OmniScriptPage.clickNextButton();
			//Safety Decision
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.closeAssessmentsTab();
		
			/*Verify on Interaction -> On its participant -> Safety Assessment block present*/
			
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickInteractionsTab();
			investigationCasePage.verifyInteraction();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.verifyInteractionsParticipants();
			investigationCasePage.clickParticipantsTab();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.verifySafetyAssessmentBlockPresent();
			investigationCasePage.closeParticipantRecordTab();
			investigationCasePage.closeParticipantTab();
			investigationCasePage.closeInteractionRecordTab();
			investigationCasePage.closeInteractionTab();
			
			
			/* Workflow */
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickInvestigationWorkflow();
		
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			personsInvovled_Workflow_OmniscriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickCreateInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interview_OmniScriptPage.provideDate();
			interview_OmniScriptPage.prvoideType("Visit");
			interview_OmniScriptPage.selectAttempts("Successfull");
			interview_OmniScriptPage.prvoideLocation("Biological Home");
			interview_OmniScriptPage.prvoideSubType("Child");
			interview_OmniScriptPage.prvoideMethod("FaceToFace");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
			interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
			interview_OmniScriptPage.clickSavebutton();
			interview_OmniScriptPage.closeCaregiverTab();
			interview_OmniScriptPage.clickNextButton();
			// Collateral
			collaterals_OmniScriptPage.clickNextButton();
			// Record
			recordReview_OmniScriptPage.enterTextRecordReview("abc");
			recordReview_OmniScriptPage.clickNextButton();
			//Findings
			findings_OmniScriptPage.addAllegation("Substantiated", maltreator);
			findings_OmniScriptPage.clickonSubmitButton();
			
			
			/*Verify on Interaction -> On its participant -> Safety Assessment block not present*/
			
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickInteractionsTab();
			investigationCasePage.verifyInteraction();
			investigationCasePage.sortInteractionIDColumn("Descedning");
			investigationCasePage.clickFirstRecord();
			investigationCasePage.verifyInteractionsParticipants();
			investigationCasePage.clickParticipantsTab();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.verifySafetyAssessmentBlockNotPresent();
			investigationCasePage.closeParticipantRecordTab();
			investigationCasePage.closeParticipantTab();
			investigationCasePage.closeInteractionRecordTab();
			investigationCasePage.closeInteractionTab();
			
	
			/*Check Assessment type*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationSafetyAssessmentPage.checkTypeOfSafetyAssessment("Safety Assessment Investigation");
	//		investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			
			
			homePage_SFDCPage.closeTabs();
			count1++;		
			
		}
		
	
	@Test(priority=3,description = "US01131: Supervisory Approval of Safety Assessment :  Supervisor User", groups = {
			"Medium", "ACIS_Regression", "Mrunal" })
	public void supervisoryApprovalofSafetyAssessmentSupervisor() throws AcisException, Exception {
	
		if (count1 == 1) {
				loginTest.login("Supervisor");
				loginTest.investigationTest.openInvestigationCase(allegationID);
			
				/*Safety Assessment flow*/
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickAssessmentsTab();
				
				/*Accept SA*/
				investigationSafetyAssessmentPage.clickFirstRecord();
				investigationSafetyAssessmentPage.clickSafetyAssessmentRecordButton();
				reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
				personsInvolved_SA_OmniscriptPage.clickNextButton();
				establishRelations_SA_OmniScriptPage.clickNextButtonOfApprovalFlow();
				safetyAssessmentInterviewsPage.clickNextButton();
				assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
				safetyScale_SA_OmniScriptPage.clickNextButton();
				//Safety Decision
				safetyDecision_SA_OmniScriptPage.selectSafetyAssessmentStatus("override");
				safetyDecision_SA_OmniScriptPage.clickEditonPerticipantOverride(victim);
				safetyDecision_SA_OmniScriptPage.safetyDecissions("Conditionally Safe");
				safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
				
				investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
				investigationSafetyAssessmentPage.closeSafetyAssessmentRecordTab();
				
				/*Check Assessment type*/
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickAssessmentsTab();
				investigationSafetyAssessmentPage.checkTypeOfSafetyAssessment("Safety Assessment Investigation");
				investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
				investigationCasePage.closeAssessmentsTab();
				
				/*Verify on Interaction -> On its participant -> Safety Assessment block present*/
				
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickInteractionsTab();
				investigationCasePage.verifyInteraction();
				investigationCasePage.sortInteractionIDColumn("Ascending");
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifyInteractionsParticipants();
				investigationCasePage.clickParticipantsTab();
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifySafetyAssessmentBlockPresent();
				investigationCasePage.closeParticipantRecordTab();
				investigationCasePage.closeParticipantTab();
				investigationCasePage.closeInteractionRecordTab();
				investigationCasePage.closeInteractionTab();
				
				
				/*Verify on Interaction -> On its participant -> Safety Assessment block not present*/
				
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickInteractionsTab();
				investigationCasePage.verifyInteraction();
				investigationCasePage.sortInteractionIDColumn("Descedning");
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifyInteractionsParticipants();
				investigationCasePage.clickParticipantsTab();
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifySafetyAssessmentBlockNotPresent();
				investigationCasePage.closeParticipantRecordTab();
				investigationCasePage.closeParticipantTab();
				investigationCasePage.closeInteractionRecordTab();
				investigationCasePage.closeInteractionTab();
				
				
				
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		
	}
	
	
	@Test(enabled = false,description = "US01131: Supervisory Approval of Safety Assessment :  Intake creation", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 4)

		public void supervisoryApprovalofSafetyAssessmentIntake() throws AcisException, InterruptedException, IOException {
			try {

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
			
			createIntakePerson_OmniscriptPage.setAllNames(fourthfirstName, fourthmiddleName, fourthlastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
//			createIntakePerson_OmniscriptPage.setAllNames(fifthfirstName, fifthmiddleName, fifthlastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator_OOH);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator_OOH, victim_OOH);
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationID_1 = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			count2++;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
		}

	}

	@Test(enabled = false,description = "US01131: Supervisory Approval of Safety Assessment :  Intake approval", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 5)
	public void supervisoryApprovalofSafetyAssessmentSupervisorApproval() throws AcisException, Exception {
		if(count2 ==1)
		{	
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
			allegationReportPage.verifyingAllegationReportStatus();
			homePage_SFDCPage.closeTabs();
			count2++;
		}
			else {
				throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
			}

	}



	@Test(description = "US01131: Supervisory Approval of Safety Assessment :  OOH User", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 6)
	public void supervisoryApprovalofSafetyAssessmentOOHUser() throws AcisException, Exception {
	
			loginTest.login("Intake");
			loginTest.intakeTest.clickNewButtonFromAllAllegations();
			loginTest.intakeTest.createTwoPersonsWithAllDetails(thirdfirstName, thirdmiddleName, thirdlastName, 
																fourthfirstName, fourthmiddleName, fourthlastName, 
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
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator_OOH);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator_OOH, victim_OOH);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationID_1 = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID_1);
			loginTest.logout();
			loginTest.login("OOHWorker");
		
			fosterCaseID = loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadBySelectingMaltreatorVictimAndSearchID(maltreator_OOH);
			
			loginTest.caseMangementTest.searchFosterCaseID(fosterCaseID);
			
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			//Review Allegation page
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
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
			interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(victim_OOH);
			interviewChildren_SA_OmniScriptPage.clickSavebutton();
			interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
			interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			// Interview Care giver 
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			//Assess the home
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			//Decision Making Tool page
			safetyScale_SA_OmniScriptPage.clickNextButton();
			//Safety Decision
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim_OOH);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.closeAssessmentsTab();
		
			/*Verify on Interaction -> On its participant -> Safety Assessment block present*/
			
			investigationCasePage.clickInsightTabOfInvestigation();
			investigationCasePage.clickInteractionsTab();
			investigationCasePage.verifyInteraction();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.verifyInteractionsParticipants();
			investigationCasePage.clickParticipantsTab();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.verifySafetyAssessmentBlockPresent();
			investigationCasePage.closeParticipantRecordTab();
			investigationCasePage.closeParticipantTab();
			investigationCasePage.closeInteractionRecordTab();
			investigationCasePage.closeInteractionTab();
			
			/*Create Interaction of type Meeting*/
			investigationCasePage.clickInsightTabOfInvestigation();
			investigationCasePage.clickInteractionsTab();
			
			newInteractionPage.clickNewButton();
			newInteractionPage.selectInteractionType("Meeting");
			newInteractionPage.clickNextButton();
			
			meetingTypeInteractionPage.iframeSwitch();
			meetingTypeInteractionPage.provideDate();
			meetingTypeInteractionPage.prvoideType("Meeting");
			meetingTypeInteractionPage.selectAttempts("Successfull");
			meetingTypeInteractionPage.prvoideLocation("Biological Home");
			meetingTypeInteractionPage.prvoideSubType("CasePlanReview");
			meetingTypeInteractionPage.prvoideMethod("VideoConference");
			meetingTypeInteractionPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
			meetingTypeInteractionPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
			meetingTypeInteractionPage.clickParticipantCheckbox(victim_OOH);
			meetingTypeInteractionPage.clickSavebutton();
			meetingTypeInteractionPage.closeNewInteraction();
			
			/*Verify on Interaction -> On its participant -> Safety Assessment block not present*/
			
			investigationCasePage.clickInsightTabOfInvestigation();
			investigationCasePage.clickInteractionsTab();
			investigationCasePage.verifyInteraction();
			investigationCasePage.sortInteractionIDColumn("Descedning");
			investigationCasePage.clickFirstRecord();
			investigationCasePage.verifyInteractionsParticipants();
			investigationCasePage.clickParticipantsTab();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.verifySafetyAssessmentBlockNotPresent();
			investigationCasePage.closeParticipantRecordTab();
			investigationCasePage.closeParticipantTab();
			investigationCasePage.closeInteractionRecordTab();
			investigationCasePage.closeInteractionTab();
			
	
			/*Check Assessment type*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationSafetyAssessmentPage.checkTypeOfSafetyAssessment("Safety Assessment Foster Care");
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			
			
			homePage_SFDCPage.closeTabs();
			count2++;		
		   
		      
		}
	
	
	@Test(description = "US01131: Supervisory Approval of Safety Assessment :    Supervisor User", groups = {
			"Medium", "ACIS_Regression", "Mrunal" },priority=7)
	public void supervisoryApprovalofSafetyAssessmentSupervisorFosterCareCase() throws AcisException, Exception {

			if (count2 == 1) 
			{
				loginTest.login("Supervisor");
				loginTest.caseMangementTest.searchFosterCaseID(fosterCaseID);
				
				/*Safety Assessment flow*/
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickAssessmentsTab();
				
				/*Accept SA*/
				investigationSafetyAssessmentPage.clickFirstRecord();
				investigationSafetyAssessmentPage.clickSafetyAssessmentRecordButton();
				reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
				personsInvolved_SA_OmniscriptPage.clickNextButton();
				establishRelations_SA_OmniScriptPage.clickNextButtonOfApprovalFlow();
				safetyAssessmentInterviewsPage.clickNextButton();
				assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
				safetyScale_SA_OmniScriptPage.clickNextButton();
				//Safety Decision
				safetyDecision_SA_OmniScriptPage.selectSafetyAssessmentStatus("override");
				safetyDecision_SA_OmniScriptPage.clickEditonPerticipantOverride(victim_OOH);
				safetyDecision_SA_OmniScriptPage.safetyDecissions("Conditionally Safe");
				safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
				
				investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
				
				/*Check Assessment type*/
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickAssessmentsTab();
				investigationSafetyAssessmentPage.checkTypeOfSafetyAssessment("Safety Assessment Foster Care");
				investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
				
				/*Verify on Interaction -> On its participant -> Safety Assessment block present*/
				
				investigationCasePage.clickInsightTabOfInvestigation();
				investigationCasePage.clickInteractionsTab();
				investigationCasePage.verifyInteraction();
				investigationCasePage.sortInteractionIDColumn("Ascending");
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifyInteractionsParticipants();
				investigationCasePage.clickParticipantsTab();
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifySafetyAssessmentBlockPresent();
				investigationCasePage.closeParticipantRecordTab();
				investigationCasePage.closeParticipantTab();
				investigationCasePage.closeInteractionRecordTab();
				investigationCasePage.closeInteractionTab();
				
				
				/*Verify on Interaction -> On its participant -> Safety Assessment block not present*/
				
				investigationCasePage.clickInsightTabOfInvestigation();
				investigationCasePage.clickInteractionsTab();
				investigationCasePage.verifyInteraction();
				investigationCasePage.sortInteractionIDColumn("Descedning");
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifyInteractionsParticipants();
				investigationCasePage.clickParticipantsTab();
				investigationCasePage.clickFirstRecord();
				investigationCasePage.verifySafetyAssessmentBlockNotPresent();
				investigationCasePage.closeParticipantRecordTab();
				investigationCasePage.closeParticipantTab();
				investigationCasePage.closeInteractionRecordTab();
				investigationCasePage.closeInteractionTab();
				
				
				
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
	}
	
		
}
