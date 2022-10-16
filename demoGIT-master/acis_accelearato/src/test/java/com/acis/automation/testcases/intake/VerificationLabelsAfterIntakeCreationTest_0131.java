package com.acis.automation.testcases.intake;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class VerificationLabelsAfterIntakeCreationTest_0131 extends TestBase {

	public VerificationLabelsAfterIntakeCreationTest_0131() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	String firstpersonName = faker.name().firstName();
	String FpersonmiddleName = faker.name().lastName();
	String FpersonlastName = faker.name().lastName();
	String secpersonName = faker.name().firstName();
	String SpersonmiddleName = faker.name().lastName();
	String SpersonlastName = faker.name().lastName();

	/***
	 * This class contains Test Script related to intake creation and verification
	 * of labels a Only applicable through java docs
	 */
	final static Logger logger = LoggerFactory.getLogger(VerificationLabelsAfterIntakeCreationTest_0131.class);
	String AllegationReportIDIntake, allegationID;

	@Test(description = "US:0131 Verifying Intake Labels  ", groups = { "High", "acisRegression", "Akash" })

	public void VerifyingLabelsAfterIntakeCreation()
			throws AcisException, InterruptedException, IOException, AWTException {
		loginTest.login("Supervisor");
		String maltreator = firstpersonName.concat(" ").concat(FpersonlastName);
		String victim = secpersonName.concat(" ").concat(SpersonlastName);
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		// testData.get(Constants.REPORTDETAILSPAGE).get("phone")
		// testData.get(Constants.REPORTDETAILSPAGE).get("email")
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstpersonName,FpersonmiddleName,FpersonlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//		createIntakePerson_OmniscriptPage
//				.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(secpersonName,SpersonmiddleName,SpersonlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
//		createIntakePerson_OmniscriptPage
//				.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		// Options : screenOut||familyServices||investigation
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("screenOut");
		// Options : workerComments||supervisoryComments||narrative
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);

		// Options : screenOut||familyServices||investigation

		screeningDecision_OmniscriptPage.selectOverride();
		supervisorDecisionDepositionUpdatePage.scrollTill("scrollUp");
		screeningDecision_OmniscriptPage.selectDisposition("familyServices");// family
		screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");

		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationID = allegationReportPage.getAllegationID();
		verificationLabelsAfterIntakeCreationPage.clickingOnCaseID();
		verificationLabelsAfterIntakeCreationPage.verifyFieldInCaseIntakeDetail();
		verificationLabelsAfterIntakeCreationPage.verifyAllegationCasePerson(allegationID);
		verificationLabelsAfterIntakeCreationPage.verifyCasePersonRelatedList();

		String fileupload = Constants.UPLOAD_FILE_PATH + "Akashdemo.txt";
		
		  filesPage.clickAddFilesAndUpload(fileupload);
		  filesPage.verifyFileUploaded("DemoDoc");
		 
		verificationLabelsAfterIntakeCreationPage.clickAddFilesAndUpload(fileupload);
		// filesPage.verifyFileUploaded("DemoDoc");
		verificationLabelsAfterIntakeCreationPage.verifyFileUploaded("Akashdemo");

	}
}
