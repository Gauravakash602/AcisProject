package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1122_EnforceRelativeKinConvertPersonAddressTest extends TestBase {

	public _1122_EnforceRelativeKinConvertPersonAddressTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_1122_EnforceRelativeKinConvertPersonAddressTest.class);

	@Test(description = "S-1122:Enforce Relative Kin Convert Person Address by ooh ", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void createKinshipOOH() throws AcisException, InterruptedException, IOException {
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
	}
	@Test(description = "S-1122:Enforce Relative Kin Convert Person Address by licencing ", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void createKinship() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
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

	}
	@Test(description = "S-1122:Enforce Relative Kin Convert Person Address by Investigator ", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void createKinshipByInvestigator() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
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
	}

}
