package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CourtActionFieldUpdateTest_0614 extends TestBase {

	public CourtActionFieldUpdateTest_0614() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	String allegationID, fosterCaseID;

   String firstName = faker.name().firstName();
	String middleName = faker.name().firstName();
	String lastName = faker.name().lastName();
	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().lastName();
	String childLastName = faker.name().lastName();


	@Test(description = "US:0614 Case Management - Adding New Court Action & Verify Court Action Type list box", groups = {
			"High", "acisRegression", "Varun" }, priority = 1)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			loginTest.login("Supervisor");
			fosterCaseID =loginTest.caseMangementTest.createFosterCareCaseFromFirstRecord();
			loginTest.logout();
			loginTest.login("Supervisor");
			String FullName=loginTest.caseMangementTest.FosterCareCreatePerson();
			System.out.println("FullName"+FullName);
			loginTest.logout();
			loginTest.login("Supervisor");
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			caseActionPage.clickInsightsTab();
	        fosterCareCase_Page.clickCourtAction();
	        courtActionOutcomesPage.newlegalAction("12345");
	        courtActionOutcomesPage.verifyCourtActionTypelistbox();
	        courtActionOutcomesPage.verifyNextCourtActionTypelistbox();
	        courtActionOutcomesPage.CourtActionSelectType("CourtOrder");
	        System.out.println(firstName+" "+lastName);
	        courtActionOutcomesPage.addCourtActionParticipant("Name:"+" "+FullName+";");
	        courtActionOutcomesPage.Savebutton();
	        loginTest.logout();
			loginTest.login("Supervisor");
	    	homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			caseActionPage.clickInsightsTab();
			fosterCareCase_Page.clickCourtAction();
	        courtActionOutcomesPage.clickCourtActionId("12345"); 
	        courtActionOutcomesPage.setDateandTime();
	        courtActionOutcomesPage.courtActionOutcomeSavebtn();
	        loginTest.logout();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}



	
	@Test(description = "US:0614 Case Management -Verify Error message: Only one Court Action Outcome can be created per Court Action record", groups = {
			"High", "acisRegression", "Varun" }, priority = 2)
	public void verifyErrormessage() throws AcisException, InterruptedException, IOException {
		
		try {
			loginTest.login("Supervisor");	
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			caseActionPage.clickInsightsTab();
			fosterCareCase_Page.clickCourtAction();
	        courtActionOutcomesPage.clickCourtActionId("12345"); 
//	        courtActionOutcomesPage.setlectType("Custody Granted");    
	        courtActionOutcomesPage.setDateandTime();
	        courtActionOutcomesPage.courtActionOutcomeSavebtn();
	        courtActionOutcomesPage.verifyErrormessage();
//	        courtActionOutcomesPage.clickonCancel();
	        	       
		}
		
		catch(Exception e) {
			
			getStackTrace(e,
					"Failed US:0614 Case Management - Verify Error message: Only one Court Action Outcome can be created per Court Action record");
			
		}
	}
	
	@Test(enabled=false,description = "US:0614 Case Management -Verify Error message: Only one Court Action Outcome can be created per Court Action record", groups = {
			"High", "acisRegression", "Varun" }, priority = 3)
	public void verifyActiveRemovalEpisodeErrormessage() throws AcisException, InterruptedException, IOException {
		
		try {
			loginTest.login("Supervisor");			
			homePage_SFDCPage.closeTabs();
	        homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
	        caseActionPage.clickInsightsTab();
	        fosterCareCase_Page.clickCourtAction();
	        courtActionOutcomesPage.courtActionoutcomespage("12345");
	        courtActionOutcomesPage.setlectType("Custody Granted");    
	        courtActionOutcomesPage.setDateandTime();
	        courtActionOutcomesPage.courtActionOutcomeSavebtn();
	        courtActionOutcomesPage.verifyCourtactionTypemessage();
//	        courtActionOutcomesPage.clickonCancel();
	        
	        
	        	       
		}
		
		catch(Exception e) {
			
			getStackTrace(e,
					"Failed US:0614 Case Management - Verify Error message: Only one Court Action Outcome can be created per Court Action record");
			
		}
	}
	
	@Test(enabled=false,description = "US:614 Case Management - Verify the date of Entry", groups = {
			"High", "acisRegression", "Varun" }, priority = 4)
	public void verifyDateofEntry() throws AcisException, InterruptedException, IOException {
		try {
			loginTest.login("Supervisor");
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			courtActionOutcomesPage.verifythedateofEntry();
			
		}
	
	catch(Exception e) {
			
			getStackTrace(e,
					"Failed US:0614 Case Management - Verify the date of Entry");
			
		}
	
}
}
