package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class FosterParentasAllegedMaltreatorinAllegationReportTest_0462 extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(FosterParentasAllegedMaltreatorinAllegationReportTest_0462.class);

	public FosterParentasAllegedMaltreatorinAllegationReportTest_0462() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S-00462: Foster Parent as Alleged Maltreator in the Allegation Report", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })
	public void createFosterParentFromAlligationReport() throws AcisException, InterruptedException, IOException {
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
//		testData.get(Constants.REPORTDETAILSPAGE).get("phone")
//		testData.get(Constants.REPORTDETAILSPAGE).get("email")
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		placementResourceInformationPage.clickOnAddButton();
		placementResourceInformationPage.searchPlacementResource();
		placementResourceInformationPage.enterTextPlacementName("kevin Account");
		placementResourceInformationPage.selectRadiobutton();
		placementResourceInformationPage.clickOnSaveButton();

	}
}
