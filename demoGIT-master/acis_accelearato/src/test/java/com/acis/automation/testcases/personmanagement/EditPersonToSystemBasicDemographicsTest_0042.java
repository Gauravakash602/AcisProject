package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EditPersonToSystemBasicDemographicsTest_0042  extends TestBase {

	public EditPersonToSystemBasicDemographicsTest_0042() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(EditPersonToSystemBasicDemographicsTest_0042.class);
	String allegation_ID,dob ;
	String phone, email;
	int count;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	String intakePersonName=firstName.concat(" ").concat(lastName);
	    
	String fullName=firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	
	/*All Below TS depends upon timezone. IF Timezone of application and system are different then it will FAIL*/
	
	
	@Test(description = "US-0042 : Edit Person to the System Basic Demographics - Intake User", groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 0)
	   public void EditPersonToSystemBasicDemographicsIntake() throws AcisException, Exception {
		
		System.out.println("In 42");
		count=0;
		
		phone =excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4);
		email =excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4);


			loginTest.login("Intake");
			loginTest.intakeTest.clickNewButtonFromAllAllegations();

			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
			createIntakePerson_OmniscriptPage.provideContactInformation(phone, email);
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
	//		dob=createIntakePerson_OmniscriptPage.getDOB();
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
			dob=personsInvovled_OmniscriptPage.getDOB();

			personsInvovled_OmniscriptPage.clickCancelButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		    screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		    screeningDecision_OmniscriptPage.clickSubmitbtn();
		    allegationReportPage.closeIntakeOmniscript();
			screeningDecision_OmniscriptPage.cancelButton();
			allegationReportPage.refreshPageAndWait(10);
		    allegation_ID = allegationReportPage.getAllegationID();
		    
		    allegationReportPage.checkStatusIntakeRecord("Submitted");
		    
		    count=1;
		    
			loginTest.intakeTest.searchAllegationID(allegation_ID);
		    allegationReportPage.clickIntakeBtn();
		    
		    reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
			personsInvovled_OmniscriptPage.verifyFirstnameLastnamerequired();
			personsInvovled_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			personsInvovled_OmniscriptPage.verifyZipCodeFormat("1234");
			personsInvovled_OmniscriptPage.verifyFutureDeathError();
			personsInvovled_OmniscriptPage.verifyRaceOptions();
//			personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
			personsInvovled_OmniscriptPage.clickCancelButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.closeIntakeOmniscript();
			screeningDecision_OmniscriptPage.cancelButton();
			allegationReportPage.refreshPageAndWait(10);
			allegation_ID = allegationReportPage.getAllegationID();

		       
		    allegationReportPage.clickRelatedTab();
		    allegationReportPage.clickIntakePerson(intakePersonName);
		    
		    /*Verify Details on Details Tab*/
		    personsInformationPage.clickDetailsTabAfterIntakeOS();
		    detailsPersonTabPage.checkFullNameSuffix(fullName);
		    detailsPersonTabPage.checkPhoneValue(phone);
	//	    detailsPersonTabPage.checkEmailValue(email);
		    detailsPersonTabPage.checkGenderValue(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
		    
		    detailsPersonTabPage.checkDOBValue(dob);
		    personsInformationPage.verifyPrimaryAddressDetails( testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		    /*Verify Details on Related Tab*/
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", email);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phone);
	        phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickAddressTab();
		    addressPage.verifyRecordWithPrimaryCheck(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		    homePage_SFDCPage.closeTabs();
		    

		 }

	
	@Test(description = "US-0042 : Edit Person to the System Basic Demographics -Supervisor User", groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 1)
	   public void EditPersonToSystemBasicDemographicsSupervisor() throws AcisException, Exception {
		
		 	System.out.println("In 42");
		 	
		 	if(count==1)
		 	{
		 		loginTest.login("Supervisor");
				loginTest.intakeTest.searchAllegationID(allegation_ID);
			    allegationReportPage.clickIntakeBtn();
			    
			    reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
				personsInvovled_OmniscriptPage.verifyFirstnameLastnamerequired();
				personsInvovled_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
				personsInvovled_OmniscriptPage.verifyZipCodeFormat("1234");
				personsInvovled_OmniscriptPage.verifyFutureDeathError();
				personsInvovled_OmniscriptPage.verifyRaceOptions();
//				personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
				personsInvovled_OmniscriptPage.clickCancelButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.closeIntakeOmniscript();
				screeningDecision_OmniscriptPage.cancelButton();
				allegationReportPage.refreshPageAndWait(10);
			    allegation_ID = allegationReportPage.getAllegationID();
			    
			    allegationReportPage.clickRelatedTab();
				 allegationReportPage.clickIntakePerson(intakePersonName);
			    /*Verify Details on Details Tab*/
			    personsInformationPage.clickDetailsTabAfterIntakeOS();
			    detailsPersonTabPage.checkFullNameSuffix(fullName);
			    detailsPersonTabPage.checkPhoneValue(phone);
		//	    detailsPersonTabPage.checkEmailValue(email);
			    detailsPersonTabPage.checkGenderValue(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
			    detailsPersonTabPage.checkDOBValue(dob);
			    personsInformationPage.verifyPrimaryAddressDetails( testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
			    													testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
			    													testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			    /*Verify Details on Related Tab*/
			    personsInformationPage.clickRelatedTabAfterInatakeOS();
			    relatedPersonTabPage.clickPhoneAndEmailTab();
			    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", email);
			    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phone);
		        phoneEmailInformationPage.closePhoneEmailTab();
			    personsInformationPage.clickRelatedTabAfterInatakeOS();
			    relatedPersonTabPage.clickAddressTab();
			    addressPage.verifyRecordWithPrimaryCheck(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			    homePage_SFDCPage.closeTabs();
		 	}
		 	else
		 	{
		 		throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
		 	}
		  
		  	
		 }
	
	
	@Test(description = "US-0042 : Edit Person to the System Basic Demographics -Investigation User", groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 2)
	   public void EditPersonToSystemBasicDemographicsInvestigation() throws AcisException, Exception {
		
		 	System.out.println("In 42");
		 	
		 	if(count==1)
		 	{
		 		loginTest.login("Investigator");
				loginTest.intakeTest.searchAllegationID(allegation_ID);
			    
			    allegationReportPage.clickIntakeBtn();
			    
			    reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
				personsInvovled_OmniscriptPage.verifyFirstnameLastnamerequired();
				personsInvovled_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
				personsInvovled_OmniscriptPage.verifyZipCodeFormat("1234");
				personsInvovled_OmniscriptPage.verifyFutureDeathError();
				personsInvovled_OmniscriptPage.verifyRaceOptions();
//				personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
				personsInvovled_OmniscriptPage.clickCancelButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.closeIntakeOmniscript();
				screeningDecision_OmniscriptPage.cancelButton();
				allegationReportPage.refreshPageAndWait(10);
			    allegation_ID = allegationReportPage.getAllegationID();
			    
			    allegationReportPage.clickRelatedTab();
				 allegationReportPage.clickIntakePerson(intakePersonName);
			     
			    /*Verify Details on Details Tab*/
			    personsInformationPage.clickDetailsTabAfterIntakeOS();
			    detailsPersonTabPage.checkFullNameSuffix(fullName);
			    detailsPersonTabPage.checkPhoneValue(phone);
	//		    detailsPersonTabPage.checkEmailValue(email);
			    detailsPersonTabPage.checkGenderValue(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
			    detailsPersonTabPage.checkDOBValue(dob);
			    personsInformationPage.verifyPrimaryAddressDetails( testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
			    													testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
			    													testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			    /*Verify Details on Related Tab*/
			    personsInformationPage.clickRelatedTabAfterInatakeOS();
			    relatedPersonTabPage.clickPhoneAndEmailTab();
			    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", email);
			    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phone);
		        phoneEmailInformationPage.closePhoneEmailTab();
			    personsInformationPage.clickRelatedTabAfterInatakeOS();
			    relatedPersonTabPage.clickAddressTab();
			    addressPage.verifyRecordWithPrimaryCheck(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			    homePage_SFDCPage.closeTabs();
		 	}
		 	else
		 	{
		 		throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
		 	}
		  
		  	

		 }
	
	
	/* #############     ADMIN ACCESS Limited #######################*/
	
	@Test(enabled = false,description = "US-0042 : Edit Person to the System Basic Demographics - SystemAdmin User", groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 3)
	   public void EditPersonToSystemBasicDemographicsSsytemAdmin() throws AcisException, Exception {
		
		 	System.out.println("In 42");
		 	
		 	if(count==1)
		 	{
		 		loginTest.login("Admin");
				loginTest.intakeTest.searchAllegationID(allegation_ID);
			    
			    allegationReportPage.clickIntakeBtn();
			    
			    reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
				personsInvovled_OmniscriptPage.verifyFirstnameLastnamerequired();
				personsInvovled_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
				personsInvovled_OmniscriptPage.verifyZipCodeFormat("1234");
				personsInvovled_OmniscriptPage.verifyFutureDeathError();
				personsInvovled_OmniscriptPage.verifyRaceOptions();
//				personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
				personsInvovled_OmniscriptPage.clickCancelButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.closeIntakeOmniscript();
				screeningDecision_OmniscriptPage.cancelButton();
				allegationReportPage.refreshPageAndWait(10);
			  
			    allegation_ID = allegationReportPage.getAllegationID();
			    
			    allegationReportPage.clickRelatedTab();
				 allegationReportPage.clickIntakePerson(intakePersonName);
			    /*Verify Details on Details Tab*/
			    personsInformationPage.clickDetailsTabAfterIntakeOS();
			    detailsPersonTabPage.checkFullNameSuffix(fullName);
			    detailsPersonTabPage.checkPhoneValue(phone);
		//	    detailsPersonTabPage.checkEmailValue(email);
			    detailsPersonTabPage.checkGenderValue(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
			    detailsPersonTabPage.checkDOBValue(dob);
			    personsInformationPage.verifyPrimaryAddressDetails( testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
			    													testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
			    													testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			    /*Verify Details on Related Tab*/
			    personsInformationPage.clickRelatedTabAfterInatakeOS();
			    relatedPersonTabPage.clickPhoneAndEmailTab();
			    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", email);
			    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phone);
		        phoneEmailInformationPage.closePhoneEmailTab();
			    personsInformationPage.clickRelatedTabAfterInatakeOS();
			    relatedPersonTabPage.clickAddressTab();
			    addressPage.verifyRecordWithPrimaryCheck(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			    homePage_SFDCPage.closeTabs();
		 	}
		 	else
		 	{
		 		throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
		 	}
		  

		 }
}
