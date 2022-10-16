package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1093_CreateKinshipPlacementResourcefromAccountsTest extends TestBase {

	public _1093_CreateKinshipPlacementResourcefromAccountsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(_1093_CreateKinshipPlacementResourcefromAccountsTest.class);
	
	@Test(description = "S-1093:Create KinshipPlacementResource from Accounts", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void createKinshipPlacementResource() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		//homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.clickNewButton();
		placementResourcePage.selectKPResourceRadioButton();
		createKinShipPage.selectChild("Benni b");
		createKinShipPage.selectCaseID();
		createKinShipPage.clickNextButton();
		createKinShipPage.selectParent("Parent 1","Name:");
		createKinShipPage.selectCheckBox();
	//	createKinShipPage.selectParent("Parent 2");
		createKinShipPage.clickNextButton();
	//	createKinShipPage.selectAddress("NXP Main Entrance, Austin, TX, USA");
	//	createKinShipPage.selectType("Home");
		//createKinShipPage.clickNextButton();
		createKinShipPage.clickSubmit();
}
	}
