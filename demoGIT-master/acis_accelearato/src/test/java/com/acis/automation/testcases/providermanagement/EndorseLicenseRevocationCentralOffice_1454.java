package com.acis.automation.testcases.providermanagement;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EndorseLicenseRevocationCentralOffice_1454 extends TestBase {

	public EndorseLicenseRevocationCentralOffice_1454() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(EndorseLicenseRevocationCentralOffice_1454.class);

	String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
	String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");

	String allegationID, caseID;

	int count;

	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();

	String secondFirstName = faker.name().firstName();
	String secondMiddleName = faker.name().firstName();
	String secondLastName = faker.name().lastName();

	String effecteDateofRevocation;
	// DATA PREREQUISITE: ANY ACTIVE ACCOUNT WITH PLACEMENT RESOURCEMENT SUBTYPE as
	// "DCS Foster Home - Licensed"

	@Test(enabled=false,description = "US-0001454 - IN - Endorse License Revocation -CO", groups = { "High", "ACIS_Regression",
			"sankari" }, priority = 1)
	public void LicenseRevocation_AcceptedbyCO() throws AcisException, InterruptedException, AWTException, IOException, UnsupportedFlavorException {

		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
basicProviderMgmFlowTest.CreatePlacementAccountandUpdateStatus(firstName, lastName);
		
		homePage_SFDCPage.logoutUser();
		loginTest.login("Admin");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(firstName + " " + lastName + " "+"Home");
		String Record_id=licensingApplicationPage.locateRecordID();
		licensingApplicationPage.AdminLogin_PlacementTypeUpdate("Foster Home", "DCS Foster Home - Licensed");
		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);	
		licensingApplicationPage.AdminLogin_StatusUpdate("Approved");
	
		homePage_SFDCPage.logoutUser();

		loginTest.login("LicesningWorker");

		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount(); 
		homePage_SFDCPage.searchRecordAndClick("james  martin &" + " " + "jasintha  martin");
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.showMoreActions();
		licensingApplicationPage.clickLicensingRevocationButton();
		licensingApplicationPage.effectiveDateOfRevocation();
		licensingApplicationPage.notesFieldLicensingRevocation("Text");
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkLicenseStatus("Pending Revocation");
		licensingApplicationPage.relatedTab();

		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.checkStatus("Open");
		licensingApplicationPage.clickOnSubmitForRevocation();
		licensingApplicationPage.effectiveDateOfRevocation();
		licensingApplicationPage.whyLicenseBeingRevoked();

		licensingApplicationPage.clickAddFilesAndUpload1(fileupload);

		licensingApplicationPage.clickAddFilesAndUpload2(fileupload);
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");

		homePage_SFDCPage.logoutUser();

		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowHome();
		homePage_SFDCPage.DCSEndorsement_dashboardNavigation("Kashi  K  &" + " " + "Nathi n");
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.endorseToCO_licenserevocation();
		licensingApplicationPage.checkStatus("Central Office Review");
		homePage_SFDCPage.logoutUser();

		// CO Returns for edit
		loginTest.login("CentralOfficeWorker");
		homePage_SFDCPage.clickDownArrowHome();
		homePage_SFDCPage.DCSEndorsement_dashboardNavigation("Kashi  K  &" + " " + "Nathi n");
		
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.Revocationletterreceiveddate();
		licensingApplicationPage.relatedTab();
		obtainMedicalClearance_Portal_Page.clickAddFilesAndUpload(fileupload);
		licensingApplicationPage.UpdateDocumentTyp_salesforce("Receipt of Certified Letter");
		//Clicking on accept button to accept the revocation
		licensingApplicationPage.AcceptLicensingApplication();
		licensingApplicationPage.checkStatus("Closed");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount(); 
		
		homePage_SFDCPage.searchRecordAndClick("Kashi  K  &" + " " + "Nathi n");
		licensingApplicationPage.checkLicenseStatus("Closed");
		licensingApplicationPage.checkLicenseState("Revoked");
		
		

	}
	@Test(enabled=true,description = "US-0001454 - IN - Endorse License Revocation -CO", groups = { "High", "ACIS_Regression",
	"sankari" }, priority = 0)
	public void LicenseRevocation_AppealGrantedbyCO() throws AcisException, InterruptedException, AWTException, IOException {

		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";

	/*	loginTest.login("LicesningWorker");

		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount(); 
		homePage_SFDCPage.searchRecordAndClick("james  martin &" + " " + "jasintha  martin");
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.showMoreActions();
		licensingApplicationPage.clickLicensingRevocationButton();
		licensingApplicationPage.effectiveDateOfRevocation();
		licensingApplicationPage.notesFieldLicensingRevocation("Text");
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkLicenseStatus("Pending Revocation");
		licensingApplicationPage.relatedTab();

		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.checkStatus("Open");
		licensingApplicationPage.clickOnSubmitForRevocation();
		licensingApplicationPage.effectiveDateOfRevocation();
		licensingApplicationPage.whyLicenseBeingRevoked();

		licensingApplicationPage.clickAddFilesAndUpload1(fileupload);

		licensingApplicationPage.clickAddFilesAndUpload2(fileupload);
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");

		homePage_SFDCPage.logoutUser();*/

		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount(); 
		homePage_SFDCPage.searchRecordAndClick("james  martin &" + " " + "jasintha  martin");
		//homePage_SFDCPage.clickDownArrowHome();
		//homePage_SFDCPage.DCSEndorsement_dashboardNavigation("james  martin &" + " " + "jasintha  martin");
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.endorseToCO_licenserevocation();
		licensingApplicationPage.checkStatus("Central Office Review");
		homePage_SFDCPage.logoutUser();

		// CO Returns for edit
		loginTest.login("CentralOfficeWorker");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount(); 
		homePage_SFDCPage.searchRecordAndClick("james  martin &" + " " + "jasintha  martin");
		//homePage_SFDCPage.clickDownArrowHome();
		//homePage_SFDCPage.DCSEndorsement_dashboardNavigation("james  martin &" + " " + "jasintha  martin");
		
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.ChoosingFosterParentAppeal_yes();
		licensingApplicationPage.Appealreceiveddate();
		
		licensingApplicationPage.Clicking_AppealGrantedButton();
		licensingApplicationPage.AppealGrantedDate();
		licensingApplicationPage.clickAddFilesAndUpload1(fileupload);
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Closed");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount(); 
		
		homePage_SFDCPage.searchRecordAndClick("james  martin &" + " " + "jasintha  martin");
		licensingApplicationPage.checkLicenseStatus("Active");
		licensingApplicationPage.checkLicenseState("Licensed");
	}


}
