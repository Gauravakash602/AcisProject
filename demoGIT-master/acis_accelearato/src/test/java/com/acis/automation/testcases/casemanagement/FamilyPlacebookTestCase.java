package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class FamilyPlacebookTestCase extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(FamilyPlacebookTestCase.class);

	public FamilyPlacebookTestCase() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;

	String narrativeData = testData.get(Constants.OOhservicesCasePage).get("narrative");

	String caseId = testData.get(Constants.FamilyPlaceBook).get("CaseNo");

	String permanency = testData.get(Constants.OOhservicesCasePage).get("permanencyStatus");

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	int count = 0;

	@Test(enabled = true, description = "US:0183  Foster Id creation for case management pre requisite 1", groups = {
			"High", "acisRegression", "Akash" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
//			homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(enabled = false, description = "US-0183 Family Playbook - Create New Case Plan", groups = { "High",
			"acisRegression", "Akash" }, priority = 1)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		String narrativeData = testData.get(Constants.OOhservicesCasePage).get("narrative");

		String caseId = testData.get(Constants.FamilyPlaceBook).get("CaseNo");

		String permanency = testData.get(Constants.OOhservicesCasePage).get("permanencyStatus");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);

		visitationPlan_OmniScriptPage.casePlan();
		// visitationPlan_OmniScriptPage.addPermanencyPlan("First");
		permanencyPlan_OmniScriptPage.primaryGoalFirst("guardanship");
		permanencyPlan_OmniScriptPage.setPermanencyNarrative(narrativeData);
		visitationPlan_OmniScriptPage.addButton();
		// visitationPlan_OmniScriptPage.addPermanencyPlan("Second");
		permanencyPlan_OmniScriptPage.primaryGoalSecond("adoption");
		permanencyPlan_OmniScriptPage.setPermanencyNarrative2(narrativeData);
		visitationPlan_OmniScriptPage.submitPermanency();
		visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
		visitationPlan_OmniScriptPage.addSiblingVisitations("No");
		visitationPlan_OmniScriptPage.clickNext();
		serviceToProviderPage.clickSubmit();
		visitationPlan_OmniScriptPage.closePlan();

		familyPlacebookPage.newCaseLinK();

		casePlanReviewPage.editingAgenyPlan();
		familyPlacebookPage.fillingFamilyAgencyform("blank");
		casePlanReviewPage.savingClickingNewCasePlan();
		familyPlacebookPage.verifycasePlanIncompetent();

		// personIncomePage.deleteAllData();

	}

	@Test(enabled = true, description = "US-0183 Family Playbook - Create New Case Plan selcting nO", groups = { "High",
			"acisRegression", "Akash" }, priority = 2)
	public void CreatePlacementAccountSelctingNo() throws AcisException, InterruptedException, IOException {

		String caseId = testData.get(Constants.FamilyPlaceBook).get("CaseId");

		String parental = testData.get(Constants.OOhservicesCasePage).get("parentalStatus");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();

		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);

		familyPlacebookPage.casePlan();

		casePlanReviewPage.editingAgenyPlan();

		familyPlacebookPage.fillingFamilyAgencyform("PermanencyPlan");
		familyPlacebookPage.fillingFamilyAgencyform("PermanencyPlan1");
		familyPlacebookPage.fillingFamilyAgencyform("Placement");
		familyPlacebookPage.fillingFamilyAgencyform("Placement1");

		familyPlacebookPage.fillingFamilyAgencyform("Health");
		familyPlacebookPage.fillingFamilyAgencyform("Health1");
		familyPlacebookPage.fillingFamilyAgencyform("Education");
		familyPlacebookPage.fillingFamilyAgencyform("Education1");
		familyPlacebookPage.fillingFamilyAgencyform("MentalHealth");
		familyPlacebookPage.fillingFamilyAgencyform("MentalHealth1");
		familyPlacebookPage.fillingFamilyAgencyform("Other");
		familyPlacebookPage.fillingFamilyAgencyform("other1");
		familyPlacebookPage.fillingFamilyAgencyform("read");
		familyPlacebookPage.fillingFamilyAgencyform("read1");
		familyPlacebookPage.fillingFamilyAgencyform("serviceAgreement");
		familyPlacebookPage.fillingFamilyAgencyform("serviceAgreement1");
		familyPlacebookPage.fillingFamilyAgencyform("parentalVisitation");
		familyPlacebookPage.fillingFamilyAgencyform("parentalVisitation1");
		familyPlacebookPage.fillingFamilyAgencyform("sibling");
		familyPlacebookPage.fillingFamilyAgencyform("sibling1");
		familyPlacebookPage.fillingFamilyAgencyform("serviceProvider");
		familyPlacebookPage.fillingFamilyAgencyform("serviceProvider1");
		casePlanReviewPage.savingClickingNewCasePlan();
		familyPlacebookPage.newCasePlanAfterFillingAllDropdowns();
		familyPlacebookPage.clickNext();
		serviceToProviderPage.clickSubmit();

		serviceToProviderPage.closeButton();
		visitationPlan_OmniScriptPage.verifyInterview(parental);

		// personIncomePage.deleteAllData();

	}
}
