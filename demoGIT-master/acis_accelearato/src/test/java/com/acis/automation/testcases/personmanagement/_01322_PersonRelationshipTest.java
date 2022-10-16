package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _01322_PersonRelationshipTest extends TestBase{

	public _01322_PersonRelationshipTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	int count= 0;

	@Test(description = "US-0001322 IN Feedback - Person Relationships intake creation", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 0)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
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
				reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
						"",
						"",
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
//				createIntakePerson_OmniscriptPage
//						.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
//				createIntakePerson_OmniscriptPage
//						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
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
//				screeningDecision_OmniscriptPage.selectCaseHead(firstName+" "+middleName);
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0001322 IN Feedback - Person Relationships intake creation");
		}

	}

	
	@Test(description = "US-0001322 IN Feedback - Person Relationships", groups = { "Simple", "ACIS_Regression", "Dharmesh" },priority = 1)
	  public void PersonRelationshipTests() throws AcisException {
		 try {
				if (count==1) {
					 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
								testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
						home.verfiyHomePage();
						homePage_SFDCPage.closeTabs();
						homePage_SFDCPage.clickDownArrowAccount();
					    homePage_SFDCPage.selectAllAccount();
					    homePage_SFDCPage.searchGlobalAccountRecord(firstName+" "+lastName);
					    personRelationshipPage.clickNewRelationship();
					    personRelationshipPage.clickCreateAddButton();
					    personRelationshipPage.searchTexT("Person",firstName+" "+lastName);
					    personRelationshipPage.searchTexT("Related","ANdrew Last");
					    personRelationshipPage.setRelationShip("Stepchild-Stepparent");
					    personRelationshipPage.clickSaveButton();
					    personRelationshipPage.clickCreateAddButton();
					    personRelationshipPage.searchTexT("Person","ANdrew Last");
					    personRelationshipPage.searchTexT("Related",firstName+" "+lastName);
					    personRelationshipPage.setRelationShip("Child-Father");
					    personRelationshipPage.setDate("Start");
					    personRelationshipPage.setDate("End");
					    personRelationshipPage.clickSaveButton();
					    personRelationshipPage.clickSubmitButton();
					    personRelationshipPage.refreshPageAndWait(10);
					    personRelationshipPage.verifySortPerson(firstName+" "+lastName,"ANdrew Last");
					    personRelationshipPage.refreshPageAndWait(10);
					    personRelationshipPage.verifySortRelationship("Stepchild-Stepparent","Child-Father");
					    personRelationshipPage.refreshPageAndWait(10);
					    personRelationshipPage.verifySortRelated(firstName+" "+lastName,"ANdrew Last");
					count++;
				}else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}
				
			
			    
			  } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0001322 IN Feedback - Person Relationships");
}
	}
} 
