package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class FreezeIntakeTest_037 extends TestBase  {

	public FreezeIntakeTest_037() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

final static Logger logger = LoggerFactory.getLogger(FreezeIntakeTest_037.class);

	String allegationIDIntake,allegationIDAdmin,allegationIDSupervisor;
	
	int countIntake=0,countAdmin=0,countSupervisor=0;
	
	String firstName = faker.name().firstName();
	String middleName = faker.name().firstName();
	String lastName = faker.name().lastName();

	String secondFirstName = faker.name().firstName();
	String secondMiddleName = faker.name().firstName();
	String secondLastName = faker.name().lastName();
	
	
	String maltreator = firstName.concat(" ").concat(lastName);
	
	String victim = secondFirstName.concat(" ").concat(secondMiddleName);
	
	String allegationID;
	
	
	
	@Test(priority=0,description = "US-037:Freeze Intake using Intake Screening Agent User", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyDetailsGuidedFreezeIntake() throws AcisException, Exception {
		
		try {
			
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			loginTest.intakeTest.createTwoPersonOnPersonInvaolvedPage(firstName, middleName, lastName, secondFirstName, secondMiddleName, secondLastName);

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
			//Option : Check || Uncheck
			allegationReportPage.freezeIntake("Check");
			allegationIDIntake=allegationReportPage.getAllegationID();
			countIntake++;
			}
			catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Intake Screening Agent User");
	        }
	}
	
	
	@Test(priority=1,description = "US-037:Freeze Intake using Intake Screening Agent User Check", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyDetailsGuidedFreezeIntakeCheck() throws AcisException, InterruptedException {
		
		try {
			if (countIntake == 1) {
				loginTest.login("Intake");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				//homePage_SFDCPage.searchGlobal(allegationIDIntake);
				allegationReportPage.intakeDetailsCannotModify();
				allegationReportPage.intakeGuidedCannotModify();
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		}
			catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Intake Screening Agent User Check");
	        }
		
	}

	
	@Test(priority=2,description = "US-037:Freeze Intake using ACIS System Admin User", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeAdmin() throws AcisException, Exception {
		try {	
			
			loginTest.login("Supervisor");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			loginTest.intakeTest.createTwoPersonOnPersonInvaolvedPage(firstName, middleName, lastName, secondFirstName, secondMiddleName, secondLastName);
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
			//Option : Check || Uncheck
			allegationReportPage.freezeIntake("Check");
			allegationIDAdmin=allegationReportPage.getAllegationID();
				countAdmin++;
			 } 
			 catch (Exception e) {
		            // TODO Auto-generated catch block
		            getStackTrace(e, "Failed US-037:Freeze Intake using ACIS System Admin User");
		        }
	}

	
	@Test(priority=3,description = "US-037:Freeze Intake using ACIS System Admin User Check", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeAdminCheck() throws AcisException, InterruptedException, IOException {
		 try {
			if (countAdmin == 1) {
				loginTest.login("Supervisor");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDAdmin);
				allegationReportPage.clickRelatedTab();
				//allegationReportPage.clickIntakePersonsTab();
				allegationReportPage.intakeRelatedCannotModify();
				countAdmin++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
				
	 } 
			 catch (Exception e) {
		            // TODO Auto-generated catch block
		            getStackTrace(e, "Failed US-037:Freeze Intake using ACIS System Admin User Check");
		        }
	}

//	
	@Test(priority=4,description = "US-037:Freeze Intake using ACIS System Admin User Uncheck", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeAdminUncheck() throws AcisException, InterruptedException, IOException {
		 try {
				if (countAdmin == 2) {
					loginTest.login("Admin");
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobal(allegationIDAdmin);
					allegationReportPage.freezeIntake("Uncheck");
					allegationReportPage.clickRelatedTab();
					//allegationReportPage.clickIntakePersonsTab();
					allegationReportPage.intakeRelatedCanModify();
				} else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}
				
			 } 
			 catch (Exception e) {
		            // TODO Auto-generated catch block
		            getStackTrace(e, "Failed US-037:Freeze Intake using ACIS System Admin User Uncheck");
		        }
	}

//	
	@Test(priority=4,description = "US-037:Freeze Intake using Supervisor User", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeSupervisor() throws AcisException, Exception {
		try {

				loginTest.login("Admin");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				loginTest.intakeTest.createTwoPersonOnPersonInvaolvedPage(firstName, middleName, lastName, secondFirstName, secondMiddleName, secondLastName);
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
				//Option : Check || Uncheck
				allegationReportPage.freezeIntake("Check");
				allegationIDSupervisor=allegationReportPage.getAllegationID();
				countSupervisor++;
				
		 	} catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Supervisor User");
	        }
	}
	
	
	@Test(priority=5,description = "US-037:Freeze Intake using Supervisor User Check", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeSupervisorCheck() throws AcisException, InterruptedException, IOException {
		try {
			if (countSupervisor == 1) {

				loginTest.login("Admin");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDSupervisor);
				allegationReportPage.clickRelatedTab();
				//allegationReportPage.clickIntakePersonsTab();
				allegationReportPage.intakeRelatedCannotModify();
				countSupervisor++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
				
			
		 	} catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Supervisor User Check");
	        }
	}
	
	@Test(priority=6,description = "US-037:Freeze Intake using Supervisor User Uncheck", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeSupervisorUncheck() throws AcisException, InterruptedException, IOException {
		try {
			if (countSupervisor == 2) {

				loginTest.login("Supervisor");
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDSupervisor);
				allegationReportPage.freezeIntake("Uncheck");
				allegationReportPage.clickRelatedTab();
				//allegationReportPage.clickIntakePersonsTab();
				allegationReportPage.intakeRelatedCanModify();	
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
				
			
		 	} catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Supervisor User Uncheck");
	        }
	}
}

