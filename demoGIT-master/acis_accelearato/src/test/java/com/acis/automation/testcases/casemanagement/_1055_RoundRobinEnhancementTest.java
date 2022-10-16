package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1055_RoundRobinEnhancementTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_1055_RoundRobinEnhancementTest.class);

	public _1055_RoundRobinEnhancementTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID;

	@Test(description = "S-1055 Round Robin Enhancement", groups = {"High", "acisRegression", "Dharmesh" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			Boolean check;
			String load;
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.selectChildWelfareCaseAssignments();
			childWelfareCaseAssignmentPage.clickRelatedTab();
			childWelfareCaseAssignmentPage.clickRoundRobinAssigneesTab();
			check = childWelfareCaseAssignmentPage.checkActiveInvestigator();
			childWelfareCaseAssignmentPage.clickAcisInvestigatorAssignee();
			load = childWelfareCaseAssignmentPage.getCurrentCaseLoad();
			childWelfareCaseAssignmentPage.clickEditButton();
			childWelfareCaseAssignmentPage.enterCurrentCaseLoad();
			childWelfareCaseAssignmentPage.checkActive(check);
			childWelfareCaseAssignmentPage.clickSaveButton();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCase();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickAssignOwner();
			caseAssignmentPage.selectApproval("Approve");
			caseAssignmentPage.clickSubmit();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.selectChildWelfareCaseAssignments();
			childWelfareCaseAssignmentPage.clickRelatedTab();
			childWelfareCaseAssignmentPage.clickRoundRobinAssigneesTab();
			childWelfareCaseAssignmentPage.clickAcisInvestigatorAssignee();
			childWelfareCaseAssignmentPage.checkCurrentCaseVerify(Integer.parseInt(load)+1);
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.selectChildWelfareCaseAssignments();
			childWelfareCaseAssignmentPage.clickRelatedTab();
			childWelfareCaseAssignmentPage.clickRoundRobinAssigneesTab();
			check = childWelfareCaseAssignmentPage.checkActiveInvestigator();
			childWelfareCaseAssignmentPage.clickAcisInvestigatorAssignee();
			load = childWelfareCaseAssignmentPage.getCurrentCaseLoad();
			childWelfareCaseAssignmentPage.clickEditButton();
			childWelfareCaseAssignmentPage.enterCurrentCaseLoad();
			childWelfareCaseAssignmentPage.checkActive(check);
			childWelfareCaseAssignmentPage.clickSaveButton();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCase();
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickAssignOwner();
			caseAssignmentPage.selectApproval("Override");
			caseAssignmentPage.selectNewOwner();
			caseAssignmentPage.enterComments("Demo");
			caseAssignmentPage.clickSubmit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-1055 Round Robin Enhancement");
		}

	}
}
