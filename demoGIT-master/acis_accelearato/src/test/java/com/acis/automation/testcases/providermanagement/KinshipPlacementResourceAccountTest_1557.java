package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class KinshipPlacementResourceAccountTest_1557 extends TestBase {

	public KinshipPlacementResourceAccountTest_1557() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(enabled = true, description = "US001557 :Kinship Placement Resource Account", groups = { "High",
			"acisRegression", "Khushboo" }, priority = 0)
	public void kinshipAssessment() throws AcisException, InterruptedException, IOException, AWTException {

		loginTest.login("OOHWorker");
		
		homePage_SFDCPage.clickDownArrowAccount();
		//homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchGlobalAccountRecord("Alexandra  Joseph & Linda  Joseph  Home");
		kinshipAssessmentPage.editPage();
		kinshipAssessmentPage.selectResourceType("Foster Home");
		kinshipAssessmentPage.selectPlacementResourceType("DCS Unlicenced");
		kinshipAssessmentPage.saveBtn();
		allegationReportPage.clickRelatedTab();
		kinshipAssessmentPage.kinshipAssessmentnew();
		kinshipAssessmentPage.kinshipChecklist();
		kinshipAssessmentPage.saveBtn();
		kinshipAssessmentPage.clickOnSubmit();
		homePage_SFDCPage.logoutUser();
	}
@Test(enabled = true, description = "US001557 :supervisor approval Placement Resource Account", groups = { "High",
				"acisRegression", "Khushboo" }, priority = 1)
		public void kinshipAssessmentSupervisorApproval() throws AcisException, InterruptedException, IOException, AWTException {

			loginTest.login("Supervisor");
			correctivActionPlanPage.openNotification();
			kinshipAssessmentPage.clickOnLink();
			kinshipAssessmentPage.checkButtons();
			kinshipAssessmentPage.clickOnAccept();
			kinshipAssessmentPage.testComments("test");
			kinshipAssessmentPage.supervisorFinishbutton();
			homePage_SFDCPage.logoutUser();
			loginTest.login("OOHWorker");
			homePage_SFDCPage.clickDownArrowHome();
			
		
		
		
	}
}