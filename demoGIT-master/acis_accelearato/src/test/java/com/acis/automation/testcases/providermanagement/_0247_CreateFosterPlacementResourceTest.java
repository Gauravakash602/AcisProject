package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.providermanagement.FosterPlacementPage;
import com.acis.automation.utilities.AcisException;

public class _0247_CreateFosterPlacementResourceTest extends TestBase {

	public _0247_CreateFosterPlacementResourceTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_0247_CreateFosterPlacementResourceTest.class);

	@Test(description = "S-0247 Provider Management - Create Foster Placement Resource  ", groups = { "High", "acisRegression", "Khushboo" })

	public void createFosterPlacement() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		fosterPlacementPage.clickOnNew();
		fosterPlacementPage.clickOnRadioButton("Placement Resource");
		providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 4));
		fosterPlacementPage.saveButton();
		Thread.sleep(1000);
		fosterPlacementPage.clickOnEditButton();
		//fosterPlacementPage.textareaParent();
		fosterPlacementPage.numberOfChildren("1");
		fosterPlacementPage.selectAge();
		fosterPlacementPage.saveButton();
	}
}
