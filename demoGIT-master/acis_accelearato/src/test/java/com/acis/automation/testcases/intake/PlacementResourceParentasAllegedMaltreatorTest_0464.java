package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourceParentasAllegedMaltreatorTest_0464 extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(PlacementResourceParentasAllegedMaltreatorTest_0464.class);

	public PlacementResourceParentasAllegedMaltreatorTest_0464() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();

	@Test(description = "US-0000464 Placement Resource Parent as Alleged Maltreator Test ", groups = { "High",
			"acisRegression", "Khushboo" })

	public void placementResourceParentasAllegedMaltreatorTest()
			throws AcisException, InterruptedException, IOException {
		try {
			loginTest.login("Intake");
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
					testData.get(Constants.REPORTDETAILSPAGE).get("email"),
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			placementResourceInformationPage.clickOnAddButton();
			placementResourceInformationPage.searchPlacementResource();
			placementResourceInformationPage.enterTextPlacementName("kevin Account");
			placementResourceInformationPage.selectRadiobutton();
			placementResourceInformationPage.clickOnSaveButton();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0000464 Placement Resource Parent as Alleged Maltreator Test");

		}
	}
}