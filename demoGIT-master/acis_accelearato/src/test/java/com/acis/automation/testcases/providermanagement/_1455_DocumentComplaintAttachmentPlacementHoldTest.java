package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _1455_DocumentComplaintAttachmentPlacementHoldTest extends TestBase {

	public _1455_DocumentComplaintAttachmentPlacementHoldTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(_1455_DocumentComplaintAttachmentPlacementHoldTest.class);
	

	String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
	String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
	
	
	String allegationID,caseID;
	
	String firstName = faker.name().firstName();
	String middleName =faker.name().lastName();
	String lastName = faker.name().lastName();
	
	
	String secondFirstName = faker.name().firstName();
	String secondMiddleName = faker.name().firstName();
	String secondLastName = faker.name().lastName();
	
	String maltreator = secondFirstName.concat(" ").concat(secondMiddleName).concat(secondLastName);
	String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);	
	
	
	@Test(description = "US-0001455 - Document Complaint Attachment/Placement Hold", groups = {
			"High", "ACIS_Regression", "Prateeksha" }, priority = 0)
	public void documentComplaintAttachmentPlacementHold() throws AcisException, InterruptedException, AWTException {
		
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";	
		
			loginTest.login("LicesningWorker");
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowLicensingApplication();
			homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
			
			//Creating a new Placement Hold
			licensingApplicationPage.selectPlacementResourceAccount();
			licensingApplicationPage.relatedTab();
			licensingApplicationPage.createNewPlacementHold();
			licensingApplicationPage.enterStartdate();
			licensingApplicationPage.enterreason();
			licensingApplicationPage.saveButton_licensingpopup();
		
			//Editing the existing Placement Hold 
			licensingApplicationPage.placementHoldIsEditable("Start Date");
			licensingApplicationPage.placementHoldIsEditable("Reason");
			licensingApplicationPage.placementHoldIsEditable("End Date");
			licensingApplicationPage.placementHoldIsEditable("Why is this placement hold ending?");
			
			
			//Verifying created Placement hold on the Related List
			licensingApplicationPage.switchToHomeTab();
			licensingApplicationPage.refreshButtonPlacementHold();
			licensingApplicationPage.verifingButtonsOnRelatedTab();
			
			
			//Deleting the Created Placement hold
			licensingApplicationPage.deletePlacementHold();
			licensingApplicationPage.refreshButtonPlacementHold();
			licensingApplicationPage.verifingButtonsOnRelatedTab();
			
			//Creating a new Complaint
			licensingApplicationPage.createNewComplaint();
			licensingApplicationPage.enterComments();
			licensingApplicationPage.enterComplaintdate();
			licensingApplicationPage.saveButton_licensingpopup();
			
			
			//Editing the existing Complaint 
			licensingApplicationPage.complaintIsEditable("Complaint Date");
			licensingApplicationPage.complaintIsEditable("Comments");
			licensingApplicationPage.clickAddFilesAndUpload(fileupload);
			
			//Verifying created Complaint on the Related List
			licensingApplicationPage.switchToHomeTab();
			licensingApplicationPage.refreshButtonComplaint();
		}
		
	
	@Test(description = "US-0001455 - Document Complaint Attachment/Placement Hold For AC-A-003185", groups = { "High",
			"ACIS_Regression", "Prateeksha" }, priority = 1)
	
	//Checking whether system automatically creates a Placement Hold on the Placement Resource 
	
	public void automaticaticCreationOfPlacementHold() throws AcisException, Exception {

	allegationID=loginTest.intakeTest.intakeCreationInvestigationWithVictimMaltreator(firstName, middleName, lastName, secondFirstName, secondMiddleName, secondLastName);
			loginTest.logout();
			loginTest.intakeTest.intakeApproval(allegationID);
			loginTest.logout();
			loginTest.login("LicesningWorker");
			loginTest.investigationTest.getInvestigationID(allegationID);
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.searchGlobal(allegationID);
        investigationCasePage.clickRelatedTabOfInvestigation();
        investigationCasePage.clickCasePersonTab();
        investigationCasePage.clickNewPerson();
        investigationCasePage.waitForPageLoadTill(10);
        investigationCasePage.closeCasePersonTab();
        licensingApplicationPage.searchPersonUsingvalidData("Suraj","Suraj","LastName");
        licensingApplicationPage.selectRoleFromDropDown("Alleged Maltreator");
        
        homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.searchRecordAndClick(parentFirstName + " " + parentLastName);
		licensingApplicationPage.selectPlacementResourceAccount();
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.automaticPlacementHold();
	}

	
	/*
	 * Acceptance Criteria :- A-003186 and A-003187 need to be covered in Future,
	 * because those are related to Placement Functionality and currently that whole
	 * flow is broken
	 */
	
	
}
	
	


