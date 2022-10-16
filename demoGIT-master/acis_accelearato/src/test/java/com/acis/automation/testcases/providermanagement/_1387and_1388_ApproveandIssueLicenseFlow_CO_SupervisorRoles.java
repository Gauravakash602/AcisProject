package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1387and_1388_ApproveandIssueLicenseFlow_CO_SupervisorRoles  extends TestBase{

	public _1387and_1388_ApproveandIssueLicenseFlow_CO_SupervisorRoles() throws AcisException{
		// TODO Auto-generated constructor stub
	}
	String parentFirstName = faker.name().firstName();
	String parentLastName = faker.name().lastName();
	String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
	String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
	String phone = excel.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"), 5);
	String email,fosterParentInquiryID;

		
		//licensingApplicationPage.closeSubmitWindow(); 
	
	@Test(enabled=true,description = "US-0001387 and US-0001388 : Voluntary withdrawal scenario ", groups = { "High",
			"acisRegression", "sankari" },priority=1)
	
	
	public void License_VoluntaryWithdrawal() throws AcisException, InterruptedException, IOException, UnsupportedFlavorException
	{ 
				
		fosterParentInquiryID=basicProviderMgmFlowTest.CreatePlacementAccountandUpdateStatus(parentFirstName,parentLastName);
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName + " " + "Home");

		String Record_id = licensingApplicationPage.locateRecordID();
		
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);	
	
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.selectLicensingRecommendation("Voluntary Withdrawal");
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser();
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);	
		licensingApplicationPage.AcceptLicensingApplication();
		licensingApplicationPage.checkStatus("Application Withdrawn");
		
	}
	
	@Test(enabled=true,description = "US-0001387 and US-0001388 : Deny license accepted by CO ", groups = { "High",
			"acisRegression", "sankari" },priority=2)
	
	public void DenyLicense() throws AcisException, InterruptedException, IOException, UnsupportedFlavorException
	{ 
		fosterParentInquiryID=basicProviderMgmFlowTest.CreatePlacementAccountandUpdateStatus(parentFirstName,parentLastName);		
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName + " " + "Home");

		String Record_id = licensingApplicationPage.locateRecordID();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
	
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.selectLicensingRecommendation("Deny License");
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser(); 
		loginTest.login("Supervisor");
		
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications(); 
		homePage_SFDCPage.searchRecordAndClick(Record_id);		
		licensingApplicationPage.endorseToCO();
		licensingApplicationPage.checkStatus("Central Office Review");
		homePage_SFDCPage.logoutUser(); 
		
		
		loginTest.login("CentralOfficeWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);		
		
		licensingApplicationPage.Review_modification_Method1();
		licensingApplicationPage.ReviewModification_submitbutton();
		licensingApplicationPage.AcceptLicensingApplication();
		licensingApplicationPage.fillingDenylicenseFields();
	    licensingApplicationPage.clickSaveButton();
		licensingApplicationPage.checkStatus("Denied"); 
	
		
	}
	@Test(enabled=true,description = "US-0001387 and US-0001388 :Approve license ", groups = { "High",
			"acisRegression", "sankari" },priority=3)
	
	public void ApproveLicense() throws AcisException, InterruptedException, IOException, UnsupportedFlavorException
	{ 
		basicProviderMgmFlowTest.CreatePlacementAccount();
		accountPage.switchApplication();
		homePage_SFDCPage.logoutUser();
		loginTest.login("Admin");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName + " " + "Home");

		String Record_id = licensingApplicationPage.locateRecordID();

		homePage_SFDCPage.logoutUser();

		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.clickLicenseActivitiesTab();
		LicensingActivitiesCompletion.LicensingActivitiesCompletionwithoutWaiverandVariance_singleApplicant();
		homePage_SFDCPage.logoutUser();
		loginTest.login("LicesningWorker");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.selectLicensingRecommendation("Approve License");
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser();
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.AcceptLicensingApplication();
		licensingApplicationPage.checkStatus("Approved");

	}
	
	@Test(enabled=true,description = "US-0001387 and US-0001388 : Deny license request-CO returns for edit ", groups = { "High",
			"acisRegression", "sankari" },priority=4)
	
	public void DenyLicense_ReturnLicenseForEdit() throws AcisException, InterruptedException, IOException, UnsupportedFlavorException
	{ 
				
		fosterParentInquiryID=basicProviderMgmFlowTest.CreatePlacementAccountandUpdateStatus(parentFirstName,parentLastName);
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName + " " + "Home");

		String Record_id = licensingApplicationPage.locateRecordID();
	
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);	
	
		licensingApplicationPage.clicksubmit();
		licensingApplicationPage.selectLicensingRecommendation("Deny License");
	
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");
		homePage_SFDCPage.logoutUser(); 
		
		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);	
		licensingApplicationPage.endorseToCO();
		licensingApplicationPage.checkStatus("Central Office Review");
		homePage_SFDCPage.logoutUser(); 
	
		//CO Returns for edit
		loginTest.login("CentralOfficeWorker");
	    homePage_SFDCPage.clickDownArrowLicensingApplication();
	    homePage_SFDCPage.selectAllLicensingApplications();
	    homePage_SFDCPage.searchRecordAndClick(Record_id);	
	    licensingApplicationPage.ReturnforEdit();
		licensingApplicationPage.checkStatus("Supervisor Review");
	}
	
	
	
}
