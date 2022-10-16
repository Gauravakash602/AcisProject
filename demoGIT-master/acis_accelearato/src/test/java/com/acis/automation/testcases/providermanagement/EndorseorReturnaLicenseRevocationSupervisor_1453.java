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

public class EndorseorReturnaLicenseRevocationSupervisor_1453 extends TestBase {

	public EndorseorReturnaLicenseRevocationSupervisor_1453() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(EndorseorReturnaLicenseRevocationSupervisor_1453.class);

	String parentFirstName = createdData.get(Constants.FosterParentID_SHEET).get("firstName");
	String parentLastName = createdData.get(Constants.FosterParentID_SHEET).get("lastName");
	String parentLastNameGlobal = createdData.get(Constants.FosterParentID_SHEET).get("lastNameGlobal");
	String parentHome = createdData.get(Constants.FosterParentID_SHEET).get("home");

	int count;
	String LicenseStatus;

	String firstName = faker.name().firstName();
	String middleName = faker.name().lastName();
	String lastName = faker.name().lastName();

	// DATA PREREQUISITE: ANY ACTIVE ACCOUNT WITH PLACEMENT RESOURCEMENT SUBTYPE as
	// "DCS Foster Home - Licensed"

	@Test(description = "US-0001453 - IN - Initiate a License Revocation", groups = { "High", "ACIS_Regression",
			"sankari" }, priority = 0)
	public void initiateALicenseRevocation()
			throws AcisException, InterruptedException, AWTException, IOException, UnsupportedFlavorException {
		firstName = "Romeo ";
		lastName = "Cartar";
		String Record_id ="LA-000858";
		String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";

		
	/*	basicProviderMgmFlowTest.CreatePlacementAccountandUpdateStatus(firstName, lastName);

		homePage_SFDCPage.logoutUser();
		loginTest.login("Admin");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(firstName + " " + lastName + " " + "Home");
		licensingApplicationPage.AdminLogin_PlacementTypeUpdate("Foster Home", "DCS Foster Home - Licensed");
		String Record_id = licensingApplicationPage.locateRecordID();

		homePage_SFDCPage.clickDownArrowLicensingApplication();
		homePage_SFDCPage.selectAllLicensingApplications();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.AdminLogin_StatusUpdate("Approved");

		homePage_SFDCPage.logoutUser(); */
		loginTest.login("LicesningWorker");

		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(firstName + " " + lastName + " " + "Home");
	//	String Record_id = licensingApplicationPage.locateRecordID();
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
		// licensingApplicationPage.effectiveDateAutoPopulated("May 27, 2020");
		licensingApplicationPage.whyLicenseBeingRevoked();
		// licensingApplicationPage.notesFieldAutoPopulated("Text");
		licensingApplicationPage.clickAddFilesAndUpload1(fileupload);

		licensingApplicationPage.clickAddFilesAndUpload2(fileupload);
		licensingApplicationPage.clickNextButton();
		licensingApplicationPage.checkStatus("Supervisor Review");
		// licensingApplicationPage.chatterPostAutomaticallyCreated("Maria ron &
		// maronron Home");
		homePage_SFDCPage.logoutUser();

		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowHome();
		homePage_SFDCPage.DCSEndorsement_dashboardNavigation(Record_id);
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.endorseToCO_licenserevocation();
		licensingApplicationPage.checkStatus("Central Office Review");
		homePage_SFDCPage.logoutUser();

		// CO Returns for edit
		loginTest.login("CentralOfficeWorker");
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.searchRecordAndClick(Record_id);
		licensingApplicationPage.relatedTab();
		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.ReturnforEdit_Revocationscenario();
		licensingApplicationPage.checkStatus("Supervisor Review");

		loginTest.login("Supervisor");
		homePage_SFDCPage.clickDownArrowHome();
		homePage_SFDCPage.DCSEndorsement_dashboardNavigation(Record_id);
		licensingApplicationPage.relatedTab();
		count = licensingApplicationPage.LicenseRevocationRecordsCount();
		licensingApplicationPage.clickOnLicensingRevocation();
		licensingApplicationPage.ReturnforEdit_Revocationscenario();
		licensingApplicationPage.checkStatus("Open");

		licensingApplicationPage.deleterevocationrecord();
		licensingApplicationPage.Verification_AfterRevocationRecord_Deletion(count);

	}

}
