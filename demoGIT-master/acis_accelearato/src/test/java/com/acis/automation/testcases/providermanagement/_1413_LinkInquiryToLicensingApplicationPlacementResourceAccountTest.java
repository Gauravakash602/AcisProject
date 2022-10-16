package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1413_LinkInquiryToLicensingApplicationPlacementResourceAccountTest extends TestBase{

	public _1413_LinkInquiryToLicensingApplicationPlacementResourceAccountTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String account1_FirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
	String account1_LastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
	String account1_PersonName= account1_FirstName +" " + account1_LastName;
	
	String account1_email = createdData.get(Constants.FosterParentID_SHEET).get("userName");
	String account1_password = createdData.get(Constants.FosterParentID_SHEET).get("password");
	String fosterParentInquiryID_1 = createdData.get(Constants.FosterParentID_SHEET).get("fosterParentInquiryID");
	
	String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
	String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
	String phone = excel.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"), 5);
	String email;

	String fosterParentInquiryID_2;
	
	@Test(description = "US-0001413 IN Link Inquiry to Licensing Application and Placement Resource Account", groups = { "Medium",
			"acisRegression", "Mrunal" },priority=0)
	public void linkInquiryToLicensingApplicationPlacementResourceAccount() throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {
		
		account1_FirstName="Jenna";
		account1_LastName="Toffer";
		fosterParentInquiryID_1="PN - 00001573";
		account1_PersonName="Jenna Toffer";
		
		loginTest.login("LicesningWorker");

//		home.verfiyHomePage();
//		homePage_SFDCPage.closeTabs();
//		homePage_SFDCPage.clickDownArrowHome();
//		email=accountPage.swiitchEmailpage();
//		accountPage.swiitchInquiryPage();
//		fosterParentInquiryFormPage.verifyFirstLast();
//		fosterParentInquiryFormPage.setParent1FirstName(account1_FirstName);
//		fosterParentInquiryFormPage.setParent1LastName(account1_LastName);
//		fosterParentInquiryFormPage.setDatewithData(setdate);
//		fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
//		fosterParentInquiryFormPage.setParent1EmailAddress();
//		fosterParentInquiryFormPage.clickNextButton();
//		fosterInquirySecondPage.selectAddress("Jackson, MS, USA");
//		fosterInquirySecondPage.selectFosterCheckBox();
//		fosterInquirySecondPage.selectNext();
//		fosterInquirySecondPage.selectFinishCheckBox();
//		driver.close();
//		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		fosterParentInquiryID_2 = accountPage.getFosterParentInquiryID();
		accountPage.changeStatus("New Application on Existing Placement Resource");
		accountPage.selectPlacementResourceID(account1_FirstName, account1_LastName);
		accountPage.clickSaveButton();
		accountPage.clickCasePerson(account1_FirstName, account1_LastName);
		investigationCasePage.clickRelatedTabOfInvestigation();
		accountPage.clickFosterParentInquiriesTab();
		accountPage.checkFosterParentInquiriesID(fosterParentInquiryID_1);
		accountPage.checkFosterParentInquiriesID(fosterParentInquiryID_2);
		accountPage.closeFosterParentInquiriesTab();
		investigationCasePage.clickRelatedTabOfInvestigation();
		accountPage.clickLicensingApplicationsTab();
		accountPage.verifyLicensingApplicationsPersonName(account1_PersonName);
		
		homePage_SFDCPage.closeTabs();

	}
	
	
	@Test(description = "US-0001413 IN Link Inquiry to Licensing Application and Placement Resource Account", groups = { "Medium",
			"acisRegression", "Mrunal" },priority=1)
	public void linkInquiryToLicensingApplicationPlacementResourceAccountEmailValidation() throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {
	
	
		account1_email ="rayiw96006@pidhoes.com";
		
		loginTest.login("LicesningWorker");
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		accountPage.swiitchInquiryPage();
		fosterParentInquiryFormPage.verifyFirstLast();
		fosterParentInquiryFormPage.setParent1FirstName(account1_FirstName);
		fosterParentInquiryFormPage.setParent1LastName(account1_LastName);
		fosterParentInquiryFormPage.setDatewithData(setdate);
		fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
		fosterParentInquiryFormPage.setParent1EmailAddress(account1_email);
		fosterParentInquiryFormPage.clickNextButton();
		fosterInquirySecondPage.selectAddress("Jackson, MS, USA");
		fosterInquirySecondPage.selectFosterCheckBox();
		fosterInquirySecondPage.selectNext();
		fosterInquirySecondPage.selectFinishCheckBox();
	
		fosterParentInquiryFormPage.verifySameEmailAddressMessage();
		
		driver.close();
		accountPage.switchApplication();
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
	}
}
