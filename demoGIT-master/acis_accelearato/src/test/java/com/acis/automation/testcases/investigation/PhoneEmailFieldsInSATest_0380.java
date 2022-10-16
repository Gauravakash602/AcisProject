package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

import net.bytebuddy.asm.Advice.Enter;

public class PhoneEmailFieldsInSATest_0380 extends TestBase{

	public PhoneEmailFieldsInSATest_0380() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	final static Logger logger = LoggerFactory.getLogger(PhoneEmailFieldsInSATest_0380.class);
	
	public static String allegationID ,caseID;
	int count1;
	
	String firstName=faker.name().firstName();
	String middleName=faker.name().firstName();
	String lastName=excel.getLastName();
	
	String secondfirstName = faker.name().firstName();
	String secondmiddleName = faker.name().firstName();
	String secondlastName = excel.getLastName();
	
	String thirdfirstName = faker.name().firstName();
	String thirdmiddleName = faker.name().firstName();
	String thirdlastName = excel.getLastName();

	String firstPersonName = firstName.concat(" ").concat(lastName);
	String newtPersonName = thirdfirstName.concat(" ").concat(thirdlastName);

	String  victim  = firstName.concat(" ").concat(lastName);
	String maltreator = secondfirstName.concat(" ").concat(secondlastName);
	
	String phoneFirstPerson = excel.generateRandomNumber(testData.get(Constants.PhoneEmailSA_SHEET).get("firstPersonNewPhone"), 4);
	String emailFirstPerson = excel.generateRandomOrgEmail(testData.get(Constants.PhoneEmailSA_SHEET).get("firstPersonNewEmail"), 4);
	
	String phoneNewPerson = excel.generateRandomNumber(testData.get(Constants.PhoneEmailSA_SHEET).get("NewPersonNewPhone"), 4);
	String emailNewPerson = excel.generateRandomOrgEmail(testData.get(Constants.PhoneEmailSA_SHEET).get("NewPersonNewEmail"), 4);
	


	
	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person",
			groups = { "High","acisRegression", "Mrunal" }, priority = 2)

	public void verifyPhoneEmailFieldsInSATest() throws AcisException, Exception {
		
				
			loginTest.login("Intake");
			loginTest.intakeTest.clickNewButtonFromAllAllegations();
			loginTest.intakeTest.createTwoPersonsWithAllDetails(firstName, middleName, lastName, 
																secondfirstName, secondmiddleName, secondlastName, 
																excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4),
																excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4), 
																testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"), testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
																testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"), testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"), 
																testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"), testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"), 
																excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4),
																excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4), 
																testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"), testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"),
																testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"), testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"), 
																testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"), testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
		    allegationID=allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("Investigator");
			loginTest.investigationTest.openInvestigationCase(allegationID);
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			//SA workflow
			//Review Allegation page
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			
			/*edit first person*/
			personsInvolved_SA_OmniscriptPage.clickEditRecordButton(firstPersonName);
			personsInvolved_SA_OmniscriptPage.enterTextFieldValueOnReviewAllegation_SA("first", "phone", phoneFirstPerson);
			personsInvolved_SA_OmniscriptPage.enterTextFieldValueOnReviewAllegation_SA("first", "emailId", emailFirstPerson);
			personsInvolved_SA_OmniscriptPage.clickSaveButtonAfterEdit("first");
			
			/*Add new person*/
			personsInvolved_SA_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			personsInvolved_SA_OmniscriptPage.linkToCreateNewPerson();
			personsInvolved_SA_OmniscriptPage.setAllNames(thirdfirstName, thirdmiddleName, thirdlastName);
			personsInvolved_SA_OmniscriptPage.enterTextFieldValueOnReviewAllegation_SA("first", "phone", phoneNewPerson);
			personsInvolved_SA_OmniscriptPage.enterTextFieldValueOnReviewAllegation_SA("first", "emailId", emailNewPerson);
			personsInvolved_SA_OmniscriptPage.clickSaveButton("next");
			personsInvolved_SA_OmniscriptPage.closeCreateIntakePerson();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
		
			reviewAllegationReport_SA_OmniScriptPage.closeSafetyAssessmentTab();
			investigationCasePage.closeAssessmentsTab();
			caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePerson(firstPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailFirstPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneFirstPerson);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.closePersonTab(firstPersonName);
		
		    investigationCasePage.clickCasePerson(newtPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailNewPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneNewPerson);
		    homePage_SFDCPage.closeTabs();
		    	
		    count1++;
		}
		
	
	
	
	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person - Intake User", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 3)

	public void verifyPhoneEmailFieldsInSAIntakeTest() throws AcisException, Exception {
	
		if(count1==1)
		{
			loginTest.login("Intake");
			loginTest.investigationTest.openInvestigationCase(allegationID);
			
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePerson(firstPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailFirstPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneFirstPerson);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.closePersonTab(firstPersonName);
		    
		    investigationCasePage.clickCasePerson(newtPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailNewPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneNewPerson);
		    homePage_SFDCPage.closeTabs();
		}
		else
	 	{
	 		throw new Exception("Pre requiste of Data Creation does not complete , CANNOT run this ts");
	 	}
		
		
	}
	
	
	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person - Supervisor User", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 4)

	public void verifyPhoneEmailFieldsInSASupervisorTest() throws AcisException, Exception {
	
		if(count1==1)
		{
			loginTest.login("Supervisor");
			loginTest.investigationTest.openInvestigationCase(allegationID);
			
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePerson(firstPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailFirstPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneFirstPerson);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.closePersonTab(firstPersonName);
		    
		    investigationCasePage.clickCasePerson(newtPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailNewPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneNewPerson);
		    homePage_SFDCPage.closeTabs();
		}
		else
	 	{
	 		throw new Exception("Pre requiste of Data Creation does not complete , CANNOT run this ts");
	 	}
		
		
	}

	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person - SystemAdmin User", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 5)

	public void verifyPhoneEmailFieldsInSASystemAdminTest() throws AcisException, Exception {
	
		if(count1==1)
		{
			loginTest.login("Admin");
			loginTest.investigationTest.openInvestigationCase(allegationID);
		
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePerson(firstPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailFirstPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneFirstPerson);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.closePersonTab(firstPersonName);
		    
		    investigationCasePage.clickCasePerson(newtPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailNewPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneNewPerson);
		    homePage_SFDCPage.closeTabs();
			
		}
		else
	 	{
	 		throw new Exception("Pre requiste of Data Creation does not complete , CANNOT run this ts");
	 	}
		
	}
}