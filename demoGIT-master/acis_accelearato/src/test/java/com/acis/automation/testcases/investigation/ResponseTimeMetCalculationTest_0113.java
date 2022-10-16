package com.acis.automation.testcases.investigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ResponseTimeMetCalculationTest_0113 extends TestBase {

	public ResponseTimeMetCalculationTest_0113() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ResponseTimeMetCalculationTest_0113.class);
	int count1,count2,count3;
	String allegationID_1, allegationID_2 , allegationID_3 ;
	String caseID_1, caseID_2 , caseID_3 ;
	
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

	String fifthfirstName = faker.name().firstName();
	String fifthmiddleName = faker.name().firstName();
	String fifthlastName = excel.getLastName();

	String sixthfirstName = faker.name().firstName();
	String sixthmiddleName = faker.name().firstName();
	String sixthlastName = excel.getLastName();


	String  victim1  = firstName.concat(" ").concat(lastName);
	String maltreator1 = secondfirstName.concat(" ").concat(secondlastName);

	String  victim2  = thirdfirstName.concat(" ").concat(thirdlastName);
	String maltreator2 = fourthfirstName.concat(" ").concat(fourthlastName);

	
	String  victim3  = fifthfirstName.concat(" ").concat(fifthlastName);
	String maltreator3 = sixthfirstName.concat(" ").concat(sixthlastName);

	
		/*#### This US Depends Upon Timezone*/
	@Test(description = " US :0113 Investigation Response Time Met Calculation : Intake Creation", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 0)

	public void responseTimeMetCalculationIntakeCreation() throws AcisException, Exception {
		 
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		//***  We have to Select today's date for this US  *****//
		reportDetailsOmniscriptPage.setIntakeDateToday();     
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.provideBirthdate(String.valueOf(personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-17));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.provideBirthdate(String.valueOf(personsInvovled_Workflow_OmniscriptPage.getCurrentYear()-17));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator1);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator1,victim1);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID_1=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
	    count1++;
	}
	
	
	
	
	
	@Test(description = " US :0113 Investigation Response Time Met Calculation (RT :yes)", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 2)

	public void responseTimeMetCalculation() throws AcisException, Exception {
		
		
		if(count1==1)
		{  	
			loginTest.intakeTest.intakeApproval(allegationID_1);
			loginTest.logout();
			loginTest.login("Supervisor");
			caseID_1= loginTest.investigationTest.getInvestigationID(allegationID_1);
			loginTest.caseMangementTest.searchFosterCaseID(caseID_1);
					
			caseActionPage.clickDetailsTab();
			detailsCaseActionPage.checkLabelsOnCaseActionDetailsPage("Response Time Met");
			detailsCaseActionPage.checkResponseTimeMetValue("No");
			
			/*Create  Safety Assessments*/
		
			caseHeadPage.clickRelatedTab("First Related tab");
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			
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
			interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(victim1);
			interviewChildren_SA_OmniScriptPage.clickSavebutton();
			interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
			interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			safetyScale_SA_OmniScriptPage.clickCreateAddButton();
			safetyScale_SA_OmniScriptPage.selectDeniedMedical("Yes");
			safetyScale_SA_OmniScriptPage.selectDrugAlcohol("No");
			safetyScale_SA_OmniScriptPage.selectHazardousUnsanitary("No");
			safetyScale_SA_OmniScriptPage.selectPromoteViolence("No");
			safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
			safetyScale_SA_OmniScriptPage.selectSpousalAbuse("Yes");
			safetyScale_SA_OmniScriptPage.clickSave();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim1);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.closeAssessmentsTab();
			
			caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			caseActionPage.clickDetailsTab();
			detailsCaseActionPage.checkLabelsOnCaseActionDetailsPage("Response Time Met");
			detailsCaseActionPage.checkResponseTimeMetValue("Yes");
			homePage_SFDCPage.closeTabs();
			
			
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
	 	}
	}
	
	
	@Test(enabled = false,description = " US :0113 Investigation Response Time Met Calculation : Intake Creation ", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 4)

	public void responseTimeMetCalculationIntakeCreationTwo() throws AcisException, Exception {
		 
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

		createIntakePerson_OmniscriptPage.setAllNames(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
														testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
														testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//		createIntakePerson_OmniscriptPage.provideContactInformation(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//																		testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//		createIntakePerson_OmniscriptPage.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
														testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
														testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//																		testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
		//createIntakePerson_OmniscriptPage.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
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
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator1);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator1,victim1);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID_1=allegationReportPage.getAllegationID();
	    
	    count2++;
	}
	
	
	
	@Test(enabled = false,description = " US :0113 Investigation Response Time Met Calculation : Intake Approval", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 5)

	public void responseTimeMetCalculationIntakeApprovalTwo() throws AcisException, Exception {
		
		if(count2==1)
		{
			/*login to supervisor to check*/
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
			
			
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			caseID_2 =caseActionPage.getCaseActionID();
			homePage_SFDCPage.closeTabs();
			
			count2++;
			
			
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
		
	}
	
	
	@Test(description = " US :0113 Investigation Response Time Met Calculation (RT:No)", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 6)

	public void responseTimeMetCalculationTwo() throws AcisException, Exception {
	
			allegationID_2=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(thirdfirstName, thirdmiddleName, thirdlastName,
																								fourthfirstName, fourthmiddleName, fourthfirstName);
					
			
			
			
			loginTest.login("Intake");
			loginTest.intakeTest.clickNewButtonFromAllAllegations();
			loginTest.intakeTest.createTwoPersonsWithAllDetails(thirdfirstName, thirdmiddleName, thirdlastName,
																fourthfirstName, fourthmiddleName, fourthfirstName, 
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
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator2);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator2, victim2);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID_2=allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			
			
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID_2);
			loginTest.logout();
			loginTest.login("Supervisor");
			caseID_2= loginTest.investigationTest.getInvestigationID(allegationID_2);
			loginTest.caseMangementTest.searchFosterCaseID(caseID_2);
				
			caseActionPage.clickDetailsTab();
			detailsCaseActionPage.checkLabelsOnCaseActionDetailsPage("Response Time Met");
			detailsCaseActionPage.checkResponseTimeMetValue("No");
			
			/*Create  Safety Assessments*/
			 caseHeadPage.clickRelatedTab("First Related tab");
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			establishRelations_SA_OmniScriptPage.clickNextButton();
			interviewChildren_SA_OmniScriptPage.clickCreateChildrenInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interviewChildren_SA_OmniScriptPage.provideDifferentDate("Next Month");
			interviewChildren_SA_OmniScriptPage.selectAttempts("Successfull");
			interviewChildren_SA_OmniScriptPage.prvoideType("Visit");
			interviewChildren_SA_OmniScriptPage.prvoideSubType("Child");
			interviewChildren_SA_OmniScriptPage.prvoideLocation("Biological Home");
			interviewChildren_SA_OmniScriptPage.prvoideMethod("FaceToFace");
			interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("narrative", "Interviw narrative Demo");
			interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("profesionalopinion","Interviw profesionalopinion Demo");
			interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(victim2);
			
			interviewChildren_SA_OmniScriptPage.clickSavebutton();
			interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
			interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			safetyScale_SA_OmniScriptPage.clickCreateAddButton();
			safetyScale_SA_OmniScriptPage.selectDeniedMedical("Yes");
			safetyScale_SA_OmniScriptPage.selectDrugAlcohol("No");
			safetyScale_SA_OmniScriptPage.selectHazardousUnsanitary("No");
			safetyScale_SA_OmniScriptPage.selectPromoteViolence("No");
			safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
			safetyScale_SA_OmniScriptPage.selectSpousalAbuse("Yes");
			safetyScale_SA_OmniScriptPage.clickSave();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim2);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.closeAssessmentsTab();
			
			caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			caseActionPage.clickDetailsTab();
			detailsCaseActionPage.checkLabelsOnCaseActionDetailsPage("Response Time Met");
			detailsCaseActionPage.checkResponseTimeMetValue("No");
			homePage_SFDCPage.closeTabs();
			
			
		}
		

	
	@Test(description = " US :0113 Investigation Response Time Met Calculation (RT:NA) ", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 9)

	public void responseTimeMetCalculationThree() throws AcisException, Exception {
		
			allegationID_3=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(fifthfirstName, fifthmiddleName, fifthlastName,
																								sixthfirstName, sixthmiddleName, sixthlastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID_3);
			loginTest.logout();
			loginTest.login("Supervisor");
			caseID_3= loginTest.investigationTest.getInvestigationID(allegationID_3);
			loginTest.caseMangementTest.searchFosterCaseID(caseID_3);

			caseActionPage.clickDetailsTab();
			detailsCaseActionPage.checkLabelsOnCaseActionDetailsPage("Response Time Met");
			detailsCaseActionPage.provideResponseTimeMetValue("NA");
			detailsCaseActionPage.clickSaveButton();
			detailsCaseActionPage.checkResponseTimeMetValue("N/A");
			homePage_SFDCPage.closeTabs();
			
		}
		
	
}
