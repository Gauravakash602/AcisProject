package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1423_MarkActivitiesCompletewhenConfirmStandardsMetcompleteTest extends TestBase{

	public _1423_MarkActivitiesCompletewhenConfirmStandardsMetcompleteTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(description = "S-1423 mark Activities Complete when Confirm Standards Met complete ", groups = { "Medium", "ACIS_Regression", "Khushboo" })

	public void markActivitiesCompletewhenConfirmStandardsMetcomplete() throws AcisException, InterruptedException, IOException {

	loginTest.login("LicesningWorker");
	
	homePage_SFDCPage.clickDownArrowLicensingApplication();
	homePage_SFDCPage.selectAllLicensingApplications();
	homePage_SFDCPage.clickFirstRecord();
	licensingApplicationPage.clickLicenseActivitiesTab();
	meetAgeCitizenshipRequirementsPage.clickLicenseActivitiesTab();
	meetAgeCitizenshipRequirementsPage.selectApplicantAAge("Yes");
	meetAgeCitizenshipRequirementsPage.selectApplicantACitizen("Yes");
	meetAgeCitizenshipRequirementsPage.selectStandardsMet("Meets");
    meetAgeCitizenshipRequirementsPage.provideTaskValue("Upload Documentation");
}
}
