package com.acis.automation.testcases.postpermanency;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PostPermanencyServiceReferralsTest_0682 extends TestBase {

	public PostPermanencyServiceReferralsTest_0682() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	

	final static Logger logger = LoggerFactory.getLogger(PostPermanencyServiceReferralsTest_0682.class);
	String allegationID,fosterCaseID ,postPermanencyCaseID;
	int count;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=faker.name().lastName();

	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName = faker.name().lastName();

	String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);

	String firstPersonName = firstName.concat(" ").concat(lastName);
	String secondPersonName =  secondfirstName.concat(" ").concat(secondlastName);
	
	
	@Test(description = "US:0682 : Post Permanency - Service Referrals : Provider Agency creation", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 0)

		public void postPermanencyServiceReferralsProviderAgencyCreation() throws AcisException, InterruptedException, IOException 
	{
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();

				
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.clickNewButton();
		providerAgencyAccountPage.selectRadioButton();
		providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo",4));
		providerAgencyAccountPage.setProviderAgencyType("Mental Health Service");
		providerAgencyAccountPage.clickOnSave();
		providerAgencyAccountPage.clickRelatedTab();
		providerAgencyAccountPage.clickSiteLocationsTab();
		providerAgencyAccountPage.clickNewSiteLocations();
		providerAgencyAccountPage.setTextOnSite("LocationName", testData.get(Constants.ProviderAgencyAccount_SHEET).get("locationName"));
		providerAgencyAccountPage.setTextOnSite("Street", testData.get(Constants.ProviderAgencyAccount_SHEET).get("street"));
		providerAgencyAccountPage.checkPrimaryCheckBox();
		providerAgencyAccountPage.setTextOnSite("City", testData.get(Constants.ProviderAgencyAccount_SHEET).get("city"));
		providerAgencyAccountPage.setState(testData.get(Constants.ProviderAgencyAccount_SHEET).get("state"));
		providerAgencyAccountPage.setTextOnSite("ZipCode", testData.get(Constants.ProviderAgencyAccount_SHEET).get("zipCode"));
		providerAgencyAccountPage.clickOnSaveSite();
		count++;
	}
	
	

	@Test(description = "US:0682 : Post Permanency - Service Referrals", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 3)
		public void postPermanencyServiceReferralsActual() throws AcisException, Exception {
		
		if(count==1)
		{	
			
			allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithVictimMaltreator( secondfirstName, secondmiddleName, secondlastName,firstName, middleName, lastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("PermanencyWorker");
			loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(maltreator);
				
			/*Case management Pre-requisite*/
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPostPermanencyTab();
			fosterCareCase_Page.clickNewPostPermanency();
			postPermanencyPage.selectSubType("Post-Adoption");
			postPermanencyPage.selectMaltreatorVicitm();
			postPermanencyPage.clickSubmit();
			postPermanencyCaseID = postPermanencyPage.newPostPermanencyCase();
			
			/*Post Permanence  Pre-requisite*/
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(postPermanencyCaseID);
			postPermanencyPage.clickInsightsTab();
			fosterCareCase_Page.clickServiceReferralTab();
			fosterCareCase_Page.clickNewServiceReferral();
			serviceReferralPage.enterTextNameTextbox(firstPersonName);
			serviceReferralPage.selectingTypeOfService("Mental Health Service");
			serviceReferralPage.enteringText("City", testData.get(Constants.ProviderAgencyAccount_SHEET).get("city"));
			serviceReferralPage.enteringText("zipcode", testData.get(Constants.ProviderAgencyAccount_SHEET).get("zipCode"));
			serviceReferralPage.searchPage();
			serviceReferralPage.selectFirstRecord();
			serviceReferralPage.clickSubmitButton();
			homePage_SFDCPage.closeTabs();
			
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(postPermanencyCaseID);
			postPermanencyPage.clickInsightsTab();
			fosterCareCase_Page.clickServiceReferralTab();
			fosterCareCase_Page.verifyRecordType("Mental Health Service");
			
			homePage_SFDCPage.closeTabs();
			
		}
		else
		{
			throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
			
		}
	}
}
