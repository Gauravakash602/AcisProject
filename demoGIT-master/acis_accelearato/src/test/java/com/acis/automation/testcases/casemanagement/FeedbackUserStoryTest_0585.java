package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class FeedbackUserStoryTest_0585 extends TestBase {

	public FeedbackUserStoryTest_0585() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(FeedbackUserStoryTest_0585.class);
	String allegationID,fosterCaseID , fullName;
	String childFirstName="child".concat(faker.name().firstName());
	String childMiddleName=faker.name().firstName();
	String childLastName=faker.name().lastName();
	String childFullName= childFirstName + " " + childMiddleName + " " +childLastName;
	String childName= childFirstName +  " " +childLastName;
	static int count,count1;
	
	/*A-001235 covered in S-0431 -AutoCreationOfEpisodeRecordTest */
	
	/*Status field on Placement Creation has been removed. So below TS is INVLID*/
	@Test(enabled = false,description = " US:0585  Sprint 9 Feedback User Story - Licensing Worker", groups = {
			"High", "acisRegression", "Mrunal" },priority = 0)
	public void feedbackUserStoryLicensingWorker() throws AcisException, InterruptedException, IOException {
		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", "Demo");
			placementResourcePage.setPlacementType("Kinship");
			placementResourcePage.checkStatus("Approved");
			placementResourcePage.checkStatus("InProgress");
			placementResourcePage.checkStatus("OnHold");
			placementResourcePage.checkStatus("Closed");
			placementResourcePage.clickCancelButton();
			homePage_SFDCPage.closeTabs();
			
	}		
	
	
	@Test(enabled = false,description = "US:0585 : Create Out-of-Home Services Case : Intake creation", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 1)

		public void feedbackUserStoryIntake() throws AcisException, InterruptedException, IOException {
			try {

			String firstName=faker.name().firstName();
			String middleName=faker.name().firstName();
			String lastName=faker.name().lastName();
			fullName = firstName+" "+middleName+" "+lastName;
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
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
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
			screeningDecision_OmniscriptPage.selectCaseHead(fullName);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationID = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			count++;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
		}

	}

	@Test(enabled = false,description = "US:585 : Sprint 9 Feedback User Story : Intake approval", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 2)
	public void feedbackUserStorySupervisor() throws AcisException, Exception {
		if(count ==1)
		{	
			String allegationReportIdNoAfterIsApprove = "";

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
			screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
			allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
			homePage_SFDCPage.closeTabs();
			count++;
		}
			else {
				throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
			}

	}



	@Test(description = " US:0585 : Sprint 9 Feedback User Story", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 3)
	public void feedbackUserStory() throws AcisException, Exception {
			
			String firstName=faker.name().firstName();
			String middleName=faker.name().firstName();
			String lastName=faker.name().lastName();
			fullName = firstName+" "+lastName;
			count1=0;
			
			allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("Supervisor");
			fosterCaseID=loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName);
		
		   /*Case management Pre-requisite*/
			/*Create Case Person*/
			caseActionPage.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			personsInvovled_CP_OmniscriptPage.searchPersonUsingInvalidData("firstName", excel.generateRandomTestData(excel.generateRandomTestData("", 6),4));
			personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			
			 count1++;
			 investigationCasePage.closeCasePersonTab();
			 
			 /*Creating child removal episode process*/
			 caseActionPage.clickInsightsTab();
			 fosterCareCase_Page.clickCourtAction();
			 newLegalAction_OmniScriptPage.clickOnCourtAction();
			 newLegalAction_OmniScriptPage.courtCaseNumber("1");
			 newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
			 newLegalAction_OmniScriptPage.courtActionType("Court Order");
			 newLegalAction_OmniScriptPage.addCourtActionParticipant(childFirstName, childMiddleName, childLastName);
			 newLegalAction_OmniScriptPage.saveButton();
			 courtActionPage.closeCourtActionTab();
		
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			 caseActionPage.clickInsightsTab();
			 fosterCareCase_Page.clickCourtAction();
			 courtActionPage.clickFirstRecordCourtOrder();
			 caseHeadPage.clickRelatedTab("Second Related tab");
			//court outcomes
			 
			courtActionOutcomesPage.clickCourtActionOutcomes();
			 courtActionOutcomesPage.setlectType("Custody Granted");
			 courtActionOutcomesPage.provideTodayDate();
//			 courtActionOutcomesPage.enterCourtActionID("6488");
			 courtActionOutcomesPage.Savebutton();
				
			 courtActionOutcomesPage.closeCourtOutComesTab();
			 courtActionOutcomesPage.closeCourtActionOutcomeWindow();
			 courtActionOutcomesPage.closeCourtOrder();
			 courtActionPage.closeCourtActionTab();
				
				/*Check child removal episode record details*/
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			 caseActionPage.clickRelatedTab();
			 fosterCareCase_Page.clickChildRemovalEpisodes();
			 childRemovalEpisodePage.clickFirstChildRemovalRecord();
			 childRemovalEpisodePage.clickDetailsTab();
			 childRemovalEpisodePage.checkFieldsChildRemovalEpisode();
			 childRemovalEpisodePage.closeChildRemovalEpisodeRecordWindow();
			 childRemovalEpisodePage.closeChildRemovalEpisodeTab();
			
			/*Check No New button for Child removal Episode*/
		    caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
		    caseActionPage.clickRelatedTab();
		    fosterCareCase_Page.clickChildRemovalEpisodes();
		    childRemovalEpisodePage.checkNewButtonChildRemovalEpisodes();
		    childRemovalEpisodePage.clickChildName(childFullName);
		    caseHeadPage.clickRelatedTab("Second Related tab");
		    childRemovalEpisodePage.clickChildRemovalEpisodesPersonRecord();
		    childRemovalEpisodePage.checkNewButtonChildRemovalEpisodes();
		    homePage_SFDCPage.closeTabs();
		   
		      
		}
		
		

		@Test(description = " US:0585 : Sprint 9 Feedback User Story : fields under Services to the Child(ren)", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 4)

		public void feedbackUserStoryCasePlan() throws AcisException, Exception {
			
		if(count1==1)
		{	
			loginTest.login("Supervisor");
			loginTest.caseMangementTest.searchFosterCaseID(fosterCaseID);
		   /*Case management Pre-requisite*/
		
		   /*Case Plan flow  : Checking fields under Services to the Child(ren)*/
			caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
		    caseActionPage.clickInsightsTab();
		    fosterCareCase_Page.clickCasePlanTab();
		    casePlanPage.clickNewCasePlan();
		    permanencyPlan_OmniScriptPage.clickNextButton();
		    servicesToTheChildren_OmniScriptPage.selectChildDropdown(childFirstName);
		    servicesToTheChildren_OmniScriptPage.placement("No");
		    servicesToTheChildren_OmniScriptPage.clickNextButton();
		    serviceAgreementWithParents_OmniScriptPage.clickNextButton();
		    visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
		    visitationPlan_OmniScriptPage.addSiblingVisitations("No");
		    visitationPlan_OmniScriptPage.clickNext();
		    serviceToProviderPage.clickNext();
		    serviceToProviderPage.clickSubmit();
			casePlanPage.clickActiveCasePlan();
		    casePlanPage.checkFieldsServiceToChildren(childFullName , childName);
		    casePlanPage.closeNewCasePlanWindow();
		    homePage_SFDCPage.closeTabs();
		      
		}
			else {
				throw new Exception("Pre-requisite for Child Creation Does Not completed Successfully, so can not run this test");
			}
		}	
}
