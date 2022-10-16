package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1398_submitaFosterParentInquiryandprovideaDCSemailaddress extends TestBase{
	
	public _1398_submitaFosterParentInquiryandprovideaDCSemailaddress() throws AcisException {
	super();
	// TODO Auto-generated constructor stub
}

String parentFirstName = faker.name().firstName();
String parentLastName = faker.name().lastName();
String Parent2Fname=faker.name().firstName();
String Parent2Lname=faker.name().firstName();
String setdate = testData.get(Constants.AccountProviderManagemnt).get("dob");
String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
String phone = excel.generateRandomNumber(testData.get(Constants.AccountProviderManagemnt).get("phoneNoFirst"), 5);
String email;



@Test(description = "US-0001427 : Filling up Foster Parent Inquiry Form", groups = { "High",
		"acisRegression", "sankari" },priority=0)
public void FillingupFosterParentInquiryForm() throws AcisException, InterruptedException, IOException, AWTException, UnsupportedFlavorException {
	
	loginTest.login("LicesningWorker");

	home.verfiyHomePage();
	homePage_SFDCPage.closeTabs();
homePage_SFDCPage.clickDownArrowHome();
email=accountPage.swiitchEmailpage();
	accountPage.swiitchInquiryPage();
	fosterParentInquiryFormPage.verifyFirstLast();
	fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
	fosterParentInquiryFormPage.setParent1LastName(parentLastName);
	fosterParentInquiryFormPage.setDatewithData(setdate);
	fosterParentInquiryFormPage.setParent1PhoneNumber(phone);
	fosterParentInquiryFormPage.setParent1EmailAddress_DCSFormat();
	fosterParentInquiryFormPage.clickNextButton();
	fosterParentInquiryFormPage.DCSemail_ErrorVerification("ApplicantAEmail");
	fosterParentInquiryFormPage.EmailField_InformationalTextVerification();
	fosterParentInquiryFormPage.setenterParent2FirstName(Parent2Fname);
	fosterParentInquiryFormPage.setParent2EmailAddress_DCSFormat();
	fosterParentInquiryFormPage.clickNextButton();
	fosterParentInquiryFormPage.DCSemail_ErrorVerification("ApplicantBEmail");
	driver.close();
	
}



}
