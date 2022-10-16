package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.casemanagement.CaseHead_page;
import com.acis.automation.utilities.AcisException;

public class CreateNewCaseHeadTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(CreateNewCaseHeadTest.class);

	public CreateNewCaseHeadTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(description = "S-0136: Create New case head by Supervisor", groups = {
			"Medium", "ACIS_Regression", "Khushboo" })

	public void createNewCaseHead() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToFlightApplication();
		home.verfiyHomePage();

	
		

}
}
