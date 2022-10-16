package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0933_EnforceRelativePlacementCreatKinshipPlacementResourceTest extends TestBase {

	public _0933_EnforceRelativePlacementCreatKinshipPlacementResourceTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_1143_FamilyFindingTest.class);

	@Test(description = "S-0933: Enforce RelativePlacement  Creat KinshipPlacement Resource Test by ooh ", groups = {
			"Medium", "ACIS_Regression", "Khushboo" })

	public void FamilyFindingOOH() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		// homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.clickNewButton();
		placementResourcePage.selectKPResourceRadioButton();
		createKinShipPage.selectChild("Benni b");
		createKinShipPage.selectCaseID();
		createKinShipPage.clickNextButton();
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.selectCheckBox();
		createKinShipPage.clickNextButton();
		createKinShipPage.clickSubmit();
		locateRelativesPage.openFamilyFinding();
		locateRelativesPage.selectCheckBox("Ask family members");
		locateRelativesPage.clickNextButton();
		personsInvovledPage.clickNextButton();
		establishRelationshipsPage.clickNext();
		createPlacementResourcePage.selectPlacementCreate("Yes");
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
		createKinShipPage.clickNextButton();
		createPlacementResourcePage.clickSubmitButton();
		newInteractionVisitsPage.clickNewbtnOfInteraction();
		newInteractionVisitsPage.selectVisitbtn();
		interview_OmniScriptPage.iframeSwitch();
		newInteractionVisitsPage.setDateandTime();
		newInteractionVisitsPage.selectType();
		newInteractionVisitsPage.selectAttempts("Successfull");
		newInteractionVisitsPage.selectSubtype("Biological Parent");
		newInteractionVisitsPage.txtNarrative("texting");
		newInteractionVisitsPage.txtProfessionalOpinion("demo");
		newInteractionVisitsPage.clickSaveButton();
		newInteractionVisitsPage.closeNewInteraction();

	}
}
