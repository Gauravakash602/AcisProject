package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class OutOfHomeServicesCaseClosureTest_0219  extends TestBase {
	
	public OutOfHomeServicesCaseClosureTest_0219() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(OutOfHomeServicesCaseClosureTest_0219.class);

	String allegationID,fosterCaseID , fullName;
	String allegationID1,fosterCaseID1 , fullName1;
	int count,count1;
	
	/* ########################### Whole US INVALID #####################*/
	
		@Test(enabled = false,description = " US:0219 : Out-of-Home Services Case Closure by Case Worker :Intake", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 2)
		public void outOfHomeServicesCaseClosureActual() throws AcisException, Exception {
		
			String file_one = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
			String file_two = Constants.UPLOAD_FILE_PATH + "Akashdemo.txt";
			
			String firstName=faker.name().firstName();
			String middleName=faker.name().firstName();
			String lastName=faker.name().firstName();
			fullName = firstName+" "+lastName;
			
			allegationID=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("Intake");
			loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName);
		
			fosterCareCase_Page.clickCloseCaseButton();
//			System.out.println(file_one);
//			uploadSupportingDocumentationPage.uploadSupportFile(file_one);
//			uploadSupportingDocumentationPage.uploadSupportFile(file_two);
//			uploadSupportingDocumentationPage.deleteFileUploaded("Akashdemo.txt");
//			uploadSupportingDocumentationPage.clickNextBtn();
			caseClosureDecisionPage.enterTextFieldValue("Demo comment");
			caseClosureDecisionPage.clickSubmitbtn();
			caseActionPage.checkStatusValue("Submitted");
			homePage_SFDCPage.closeTabs();
		}
		
	


			@Test(enabled = false,description = " US:0219 : Out-of-Home Services Case Closure by Case Worker :Investigation", groups = { "High",
					"aCIS_Regression", "Mrunal" },priority = 5)
			public void outOfHomeServicesCaseClosureActualInvestigation() throws AcisException, Exception {
				
				String file_one = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
				String file_two = Constants.UPLOAD_FILE_PATH + "Akashdemo.txt";
			
				String firstName=faker.name().firstName();
				String middleName=faker.name().firstName();
				String lastName=faker.name().firstName();
				fullName1 = firstName+" "+lastName;
						
			
				allegationID1=loginTest.intakeTest.intakeCreationFosterCareCaseWithOnePerson(firstName, middleName, lastName);
				loginTest.logout();
				loginTest.intakeTest.intakeApproval(allegationID1);
				loginTest.logout();
				loginTest.login("Investigator");
				loginTest.caseMangementTest.createFosterCareCaseFromCaseHeadAndSearchID(fullName1);
			
					
				fosterCareCase_Page.clickCloseCaseButton();
//				System.out.println(file_one);
//				uploadSupportingDocumentationPage.uploadSupportFile(file_one);
//				uploadSupportingDocumentationPage.uploadSupportFile(file_two);
//				uploadSupportingDocumentationPage.deleteFileUploaded("Akashdemo.txt");
//				uploadSupportingDocumentationPage.clickNextBtn();
				caseClosureDecisionPage.enterTextFieldValue("Demo comment");
				caseClosureDecisionPage.clickSubmitbtn();
				caseActionPage.checkStatusValue("Submitted");
				homePage_SFDCPage.closeTabs();
				
			}
			
				
}
