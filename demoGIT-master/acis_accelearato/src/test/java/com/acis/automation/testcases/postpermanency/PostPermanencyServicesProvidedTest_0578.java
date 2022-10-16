package com.acis.automation.testcases.postpermanency;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PostPermanencyServicesProvidedTest_0578  extends TestBase {

	public PostPermanencyServicesProvidedTest_0578() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(PostPermanencyServicesProvidedTest_0578.class);
	
	String allegationID,fosterCaseID ,postPermanencyCaseID;
	int count;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=faker.name().lastName();
	String fullName = firstName+" "+middleName+" "+lastName;
	
	
	@Test(description = "US:0578 : Post Permanency - Services Provided", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 2)
		public void permanencyDashboardDefaultPermanencyGoalActual() throws AcisException, Exception {
		
			allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("PermanencyWorker");
			loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName);
			
			/*Case management Pre-requisite*/
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPostPermanencyTab();
			fosterCareCase_Page.clickNewPostPermanency();
			postPermanencyPage.selectSubType("Post-Adoption");
			postPermanencyPage.clickSubmit();
			postPermanencyCaseID = postPermanencyPage.newPostPermanencyCase();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(postPermanencyCaseID);
		
			postPermanencyPage.clickInsightsTab();
			postPermanencyPage.clickServicesProvided();
			postPermanencyPage.clickNewButton();
			postPermanencyPage.clickServiceType();
			postPermanencyPage.checkServiceTypeValue("Mental Health Service");
			postPermanencyPage.checkServiceTypeValue("Crisis Intervention");
		
			homePage_SFDCPage.closeTabs();
			
		}
		
}
