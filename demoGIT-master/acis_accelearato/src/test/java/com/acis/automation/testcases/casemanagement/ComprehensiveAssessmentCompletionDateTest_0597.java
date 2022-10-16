package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ComprehensiveAssessmentCompletionDateTest_0597 extends TestBase {

	public ComprehensiveAssessmentCompletionDateTest_0597() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().lastName();
	String childLastName = faker.name().lastName();

	final static Logger logger = LoggerFactory.getLogger(ComprehensiveAssessmentCompletionDateTest_0597.class);

	@Test(description = "S-0597: Comprehensive Assessment Completion Date  by OOH Case Worker", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void completionDate() throws AcisException, InterruptedException, IOException {
		loginTest.login("OOHWorker");		
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		caseHeadPage.newFosterCaseWithoutHousholdMember();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseActionPage.refreshPage();
		newComprehensiveAssessmentpage.clickOnNewComprehenssieAssessment();
		newComprehensiveAssessmentpage.enterchild("Na");
		newComprehensiveAssessmentpage.clickNextButton();
		newComprehensiveAssessmentpage.clickAddAssessment();
		newComprehensiveAssessmentpage.addAssessmentCategoryType("SocialHistory");
		newComprehensiveAssessmentpage.selectStartDate("2019");
		// newComprehensiveAssessmentpage.enterComprehensiveAssessmentDetails("Demo");
		newComprehensiveAssessmentpage.clickonsave();
		newComprehensiveAssessmentpage.btnsubmit();
		newComprehensiveAssessmentpage.checkStatus();
	}
}
