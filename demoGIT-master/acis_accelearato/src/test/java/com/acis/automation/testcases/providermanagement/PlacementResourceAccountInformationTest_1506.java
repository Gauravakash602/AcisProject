package com.acis.automation.testcases.providermanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourceAccountInformationTest_1506 extends TestBase{
	final static Logger logger = LoggerFactory.getLogger(PlacementResourceAccountInformationTest_1506.class);


	public PlacementResourceAccountInformationTest_1506() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(description = "S-1506 - Placement Resource Account Information", groups = { "High",
			"acisRegression", "Khushboo" })
	public void placementResourceAccountInformation() throws AcisException, Exception {
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.clickOnFosterParentAccount();
		homePage_SFDCPage.clickOnFirstRecord();
		placementPersonAccountPage.verifyFields();
		placementPersonAccountPage.diffDateAnnualReviewDate();
		placementPersonAccountPage.diffDateRelicence();

}
}