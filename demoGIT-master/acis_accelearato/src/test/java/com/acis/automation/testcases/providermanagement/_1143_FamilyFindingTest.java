package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1143_FamilyFindingTest extends TestBase {
	public _1143_FamilyFindingTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_1143_FamilyFindingTest.class);

	@Test(description = "S-1143:Family Finding by ooh ", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void FamilyFindingOOH() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		// homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.clickNewButton();
		placementResourcePage.selectKPResourceRadioButton();
		createKinShipPage.selectChild("FirstNameAEDO");
		createKinShipPage.selectCaseID();
		createKinShipPage.clickNextButton();
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
		createKinShipPage.selectAddress("NXP Main Entrance, Austin, TX, USA");
		createKinShipPage.selectType("Home");
		createKinShipPage.clickNextButton();
		createKinShipPage.clickSubmit();
		locateRelativesPage.openFamilyFinding();
	//	locateRelativesPage.enterInitials("abc");
		locateRelativesPage.selectCheckBox("Ask family members");
		/*
		 * locateRelativesPage.enterField("First Name", "First");
		 * locateRelativesPage.enterField("Possible Relationship", "Child-Parent");
		 * locateRelativesPage.setDate(); locateRelativesPage.setAttempt("SuccessFul");
		 */
		locateRelativesPage.clickNextButton();
		personsInvovledPage.clickNextButton();
		establishRelationshipsPage.clickNext();
		createPlacementResourcePage.selectPlacementCreate("Yes");
		// createPlacementResourcePage.selectParent("" , "Parent 1");
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
	//	createKinShipPage.selectAddress("NXP Main Entrance, Austin, TX, USA");
	//	createKinShipPage.selectType("Home");
		createKinShipPage.clickNextButton();
		createPlacementResourcePage.clickSubmitButton();
	}
	@Test(description = "S-1143:Family Findings by licencing ", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void FamilyFindinglicencing() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		// homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.clickNewButton();
		placementResourcePage.selectKPResourceRadioButton();
		createKinShipPage.selectChild("FirstNameAEDO");
		createKinShipPage.selectCaseID();
		createKinShipPage.clickNextButton();
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
		createKinShipPage.selectAddress("NXP Main Entrance, Austin, TX, USA");
		createKinShipPage.selectType("Home");
		createKinShipPage.clickNextButton();
		createKinShipPage.clickSubmit();
		locateRelativesPage.openFamilyFinding();
	//	locateRelativesPage.enterInitials("abc");
		locateRelativesPage.selectCheckBox("Ask family members");
		/*
		 * locateRelativesPage.enterField("First Name", "First");
		 * locateRelativesPage.enterField("Possible Relationship", "Child-Parent");
		 * locateRelativesPage.setDate(); locateRelativesPage.setAttempt("SuccessFul");
		 */
		locateRelativesPage.clickNextButton();
		personsInvovledPage.clickNextButton();
		establishRelationshipsPage.clickNext();
		createPlacementResourcePage.selectPlacementCreate("Yes");
		// createPlacementResourcePage.selectParent("" , "Parent 1");
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
	//	createKinShipPage.selectAddress("NXP Main Entrance, Austin, TX, USA");
	//	createKinShipPage.selectType("Home");
		createKinShipPage.clickNextButton();
		createPlacementResourcePage.clickSubmitButton();
	}
	@Test(description = "S-1143 Family Findings Supervisor ", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void FamilyFindingSupervisor() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		// homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.clickNewButton();
		placementResourcePage.selectKPResourceRadioButton();
		createKinShipPage.selectChild("FirstNameAEDO");
		createKinShipPage.selectCaseID();
		createKinShipPage.clickNextButton();
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
		createKinShipPage.selectAddress("NXP Main Entrance, Austin, TX, USA");
		createKinShipPage.selectType("Home");
		createKinShipPage.clickNextButton();
		createKinShipPage.clickSubmit();
		locateRelativesPage.openFamilyFinding();
	//	locateRelativesPage.enterInitials("abc");
		locateRelativesPage.selectCheckBox("Ask family members");
		/*
		 * locateRelativesPage.enterField("First Name", "First");
		 * locateRelativesPage.enterField("Possible Relationship", "Child-Parent");
		 * locateRelativesPage.setDate(); locateRelativesPage.setAttempt("SuccessFul");
		 */
		locateRelativesPage.clickNextButton();
		personsInvovledPage.clickNextButton();
		establishRelationshipsPage.clickNext();
		createPlacementResourcePage.selectPlacementCreate("Yes");
		// createPlacementResourcePage.selectParent("" , "Parent 1");
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.clickNextButton();
	//	createKinShipPage.selectAddress("NXP Main Entrance, Austin, TX, USA");
	//	createKinShipPage.selectType("Home");
		createKinShipPage.clickNextButton();
		createPlacementResourcePage.clickSubmitButton();
	}


}
