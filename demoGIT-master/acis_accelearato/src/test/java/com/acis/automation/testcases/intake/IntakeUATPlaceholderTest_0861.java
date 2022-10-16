package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class IntakeUATPlaceholderTest_0861 extends TestBase{

	public IntakeUATPlaceholderTest_0861() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(IntakeUATPlaceholderTest_0861.class);
	String fosterCaseID;
	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().firstName();
	String childLastName = faker.name().lastName();

	
	@Test(enabled=false, description = "S-0861 Allegation Report - Intake UAT Placeholder - Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
			
			loginTest.login("Supervisor");
			fosterCaseID=loginTest.caseMangementTest.createFosterCareCaseFromFirstRecord();
			loginTest.caseMangementTest.FosterCareCreatePerson();
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0861 Allegation Report - Intake UAT Placeholder - Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

		
	@Test(description = "S-0861 Allegation Report - Intake UAT Placeholder", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 2)
	public void IntakeRecord() throws AcisException, InterruptedException, IOException {
		try {
			
				loginTest.login("Supervisor");
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
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "First");
				searchPerson_OmniscriptPage.selectingAddingPerson();
				personsInvovled_OmniscriptPage.clickRefresPersonButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				// Options : screenOut||familyServices||investigation
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
//				screeningDecision_OmniscriptPage.selectCaseHead("Unknown");
				screeningDecision_OmniscriptPage.caseHeadInfo();
				screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("Yes");
				screeningDecision_OmniscriptPage.activeCaseInvestigationInfo();
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
//				allegationReportPage.caseHeadInfo();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0861 Allegation Report - Intake UAT Placeholder");
		}

	}
	
	
}
