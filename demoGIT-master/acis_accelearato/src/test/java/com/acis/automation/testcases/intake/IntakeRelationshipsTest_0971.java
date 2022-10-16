package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class IntakeRelationshipsTest_0971 extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(IntakeRelationshipsTest_0971.class);

	public IntakeRelationshipsTest_0971() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String firstName = faker.name().firstName();
	String middleName = faker.name().firstName();
	String lastName = faker.name().lastName();

	String secondFirstName = faker.name().firstName();
	String secondMiddleName = faker.name().firstName();
	String secondLastName = faker.name().lastName();
	
	//String maltreator = firstName.concat(" ").concat(lastName);
	String victim = secondFirstName.concat(" ").concat(secondMiddleName);
	String  fullName = firstName.concat(" ").concat(lastName);
	
	int count = 0;
	String allegationID;
	
	@Test(enabled = true,priority=0,description = "S-0971:Intake Relationships (Person Relationships)", groups = { "Medium", "ACIS_Regression",
			"Dharmesh" })
	public void intakeRelationship() throws AcisException, Exception {
		try {

			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			loginTest.intakeTest.createTwoPersonOnPersonInvaolvedPage(firstName, middleName, lastName, secondFirstName, secondMiddleName, secondLastName);
			agencyHistory_OmniscriptPage.clickCreateAddButton();	
			agencyHistory_OmniscriptPage.searchText(firstName.concat(" ").concat(lastName),"Person");
			agencyHistory_OmniscriptPage.searchText(secondFirstName.concat(" ").concat(secondLastName),"Related");
			agencyHistory_OmniscriptPage.setRelationShip("Child-Mother");
			agencyHistory_OmniscriptPage.clickSaveButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			//screeningDecision_OmniscriptPage.selectCaseHead(fullName);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			 allegationID=allegationReportPage.getAllegationID();
			allegationReportPage.clickRelatedTab();
		    allegationReportPage.clickIntakePerson(firstName.concat(" ").concat(lastName));
		    //insightsPage.verifyRelationship(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName), "Child-Mother", secondFirstName.concat(" ").concat(secondMiddleName).concat(" ").concat(secondLastName));
		    count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0971:Intake Relationships (Person Relationships)");
		}
	}


	@Test(priority=1,description = "S-0971:Intake Relationships (Person Relationships) Investigator", groups = { "Medium", "ACIS_Regression",
			"Dharmesh" })
	public void intakeRelationshipInvestigationVerify() throws AcisException, Exception {
		try {
				if (count == 1) {
                    loginTest.login("Supervisor");
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobal(allegationID);
					allegationReportPage.clickIntakeBtn();
					reportDetailsOmniscriptPage.clickNextBtn();
					personsInvovled_OmniscriptPage.clickNextButton();
					agencyHistory_OmniscriptPage.verifyRelationship(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName), "Child-Mother", secondFirstName.concat(" ").concat(secondMiddleName).concat(" ").concat(secondLastName));
					agencyHistory_OmniscriptPage.clickNextButton();
					structuredDecisionMakingOmniscriptPage.clickNextButton();
					screeningDecision_OmniscriptPage.selectAcceptAssign();
					screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
					screeningDecision_OmniscriptPage.clickSubmitbtn();
					screeningDecision_OmniscriptPage.cancelButton();
					allegationReportPage.verifyingAllegationReportStatus();
					allegationReportPage.clickRelatedTab();
				    allegationReportPage.clickIntakePerson(firstName.concat(" ").concat(lastName));
				    //insightsPage.verifyRelationship(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName), "Child-Mother", secondFirstName.concat(" ").concat(secondMiddleName).concat(" ").concat(secondLastName));
					count++;
				} else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0971:Intake Relationships (Person Relationships)");
		}

	}
}
