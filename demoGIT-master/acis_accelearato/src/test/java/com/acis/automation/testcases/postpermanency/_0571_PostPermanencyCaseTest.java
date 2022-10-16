package com.acis.automation.testcases.postpermanency;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class _0571_PostPermanencyCaseTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(_0571_PostPermanencyCaseTest.class);

	public _0571_PostPermanencyCaseTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID,postPermanencyCaseID,fosterCaseIDOOH,postPermanencyCaseIDOOH,fosterCaseIDPost,postPermanencyCaseIDPost;

	String firstName = faker.name().firstName();
	String middleName = faker.name().firstName();
	String lastName = faker.name().lastName();

	String childFirstName = faker.name().firstName();
	String childMiddleName = faker.name().firstName();
	String childLastName = faker.name().lastName();
	int count = 1;

	
	@Test(description = "US-0000571 Post Permanency Case Create Foster Care Case Investigator", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.clickFirstRecord();
				fosterCaseID = caseHeadPage.newFosterCase();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0000571 Post Permanency Case Create Foster Care Case Investigator");
		}

	}


	@Test(description = "US-0000571 Post Permanency Case Care Case Add Person Investigator", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 2)
	public void FosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPostPermanencyTab();
				fosterCareCase_Page.clickNewPostPermanency();
				postPermanencyPage.selectType("Adoption");
				postPermanencyPage.clickSubmit();
				postPermanencyCaseID = postPermanencyPage.newPostPermanencyCase();
				postPermanencyPage.clickRelatedTab();
				postPermanencyPage.clickPersonTab();
				postPermanencyPage.clickNewPerson();
				personsInvovled_PP_OmniscriptPage.searchNewPerson(childFirstName);
				personsInvovled_PP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_PP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_PP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_PP_OmniscriptPage.prvoideGender("first", "Male");
				personsInvovled_PP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_PP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000571 Post Permanency Case Add Person Investigator");
		}

	}
	
	@Test(description = "US-0000571 Post Permanency Case Interactions Investigator", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 3)
	public void PostPermanencyCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(postPermanencyCaseID);
				newInteractionVisitsPage.clickNewbtnOfInteraction();
				newInteractionVisitsPage.selectVisitbtn();
				interview_OmniScriptPage.iframeSwitch();
				newInteractionVisitsPage.setDateandTime();
				newInteractionVisitsPage.selectType();
				newInteractionVisitsPage.selectAttempts("Successfull");
				newInteractionVisitsPage.selectSubtype("Biological Parent");
				newInteractionVisitsPage.txtNarrative("texting");
				newInteractionVisitsPage.txtProfessionalOpinion("demo");
				newInteractionVisitsPage.clickSaveButton();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000571 Post Permanency Case Interactions Investigator");
		}

	}

	@Test(description = "US-0000571 Post Permanency Case Create Foster Care Case OOhCaseWorker", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 4)
	public void CreateFosterCareCaseOOhCaseWorker() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.clickFirstRecord();
				fosterCaseIDOOH = caseHeadPage.newFosterCase();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US-0000571 Post Permanency Case Create Foster Care Case OOhCaseWorker");
		}

	}


	@Test(description = "US-0000571 Post Permanency Case Care Case Add Person OOhCaseWorker", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 5)
	public void FosterCareCaseOOhCaseWorker() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 5) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseIDOOH);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPostPermanencyTab();
				fosterCareCase_Page.clickNewPostPermanency();
				postPermanencyPage.selectType("Adoption");
				postPermanencyPage.clickSubmit();
				postPermanencyCaseIDOOH = postPermanencyPage.newPostPermanencyCase();
				postPermanencyPage.clickRelatedTab();
				postPermanencyPage.clickPersonTab();
				postPermanencyPage.clickNewPerson();
				personsInvovled_PP_OmniscriptPage.searchNewPerson(childFirstName);
				personsInvovled_PP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_PP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_PP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_PP_OmniscriptPage.prvoideGender("first", "Male");
				personsInvovled_PP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_PP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000571 Post Permanency Case Add Person OOhCaseWorker");
		}

	}
	
	@Test(description = "US-0000571 Post Permanency Case Interactions OOhCaseWorker", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 6)
	public void PostPermanencyCaseOOhCaseWorker() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 6) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(postPermanencyCaseIDOOH);
				newInteractionVisitsPage.clickNewbtnOfInteraction();
				newInteractionVisitsPage.selectVisitbtn();
				interview_OmniScriptPage.iframeSwitch();
				newInteractionVisitsPage.setDateandTime();
				newInteractionVisitsPage.selectType();
				newInteractionVisitsPage.selectAttempts("Successfull");
				newInteractionVisitsPage.selectSubtype("Biological Parent");
				newInteractionVisitsPage.txtNarrative("texting");
				newInteractionVisitsPage.txtProfessionalOpinion("demo");
				newInteractionVisitsPage.clickSaveButton();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0000571 Post Permanency Case Interactions OOhCaseWorker");
		}
	}
	
		@Test(description = "US-0000571 Post Permanency Case Create Foster Care Case PostPermanency", groups = {
				"High", "acisRegression", "Dharmesh" }, priority = 7)
		public void CreateFosterCareCasePostPermanency() throws AcisException, InterruptedException, IOException {
			try {
				if (count == 7) {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
					home.verfiyHomePage();
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowCaseHead();
					homePage_SFDCPage.selectAllCaseHeads();
					homePage_SFDCPage.clickFirstRecord();
					fosterCaseIDPost = caseHeadPage.newFosterCase();
					count++;
				} else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e, "Failed US-0000571 Post Permanency Case Create Foster Care Case PostPermanency");
			}

		}


		@Test(description = "US-0000571 Post Permanency Case Care Case Add Person PostPermanency", groups = {
				"High", "acisRegression", "Dharmesh" }, priority = 8)
		public void FosterCareCasePostPermanency() throws AcisException, InterruptedException, IOException {
			try {
				if (count == 8) {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("permanencyWorkerUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("permanencyWorkerPassword"));
					home.verfiyHomePage();
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobalFosterCase(fosterCaseIDPost);
					fosterCareCase_Page.clickRelatedTab();
					fosterCareCase_Page.clickPostPermanencyTab();
					fosterCareCase_Page.clickNewPostPermanency();
					postPermanencyPage.selectType("Adoption");
					postPermanencyPage.clickSubmit();
					postPermanencyCaseIDPost = postPermanencyPage.newPostPermanencyCase();
					postPermanencyPage.clickRelatedTab();
					postPermanencyPage.clickPersonTab();
					postPermanencyPage.clickNewPerson();
					personsInvovled_PP_OmniscriptPage.searchNewPerson(childFirstName);
					personsInvovled_PP_OmniscriptPage.clickCreateAddButton();
					personsInvovled_PP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
					personsInvovled_PP_OmniscriptPage.provideBirthdate("first", "2010");
					personsInvovled_PP_OmniscriptPage.prvoideGender("first", "Male");
					personsInvovled_PP_OmniscriptPage.clickSaveButton("first");
					personsInvovled_PP_OmniscriptPage.clickNextButton();
					establishRelationships_CP_OmniScriptPage.clickSubmit();
					count++;
				} else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US-0000571 Post Permanency Case Add Person PostPermanency");
			}

		}
		
		@Test(description = "US-0000571 Post Permanency Case Interactions PostPermanency", groups = {
				"High", "acisRegression", "Dharmesh" }, priority = 9)
		public void PostPermanencyCasePostPermanency() throws AcisException, InterruptedException, IOException {
			try {
				if (count == 9) {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("permanencyWorkerUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("permanencyWorkerPassword"));
					home.verfiyHomePage();
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobalFosterCase(postPermanencyCaseIDPost);
					newInteractionVisitsPage.clickNewbtnOfInteraction();
					newInteractionVisitsPage.selectVisitbtn();
					interview_OmniScriptPage.iframeSwitch();
					newInteractionVisitsPage.setDateandTime();
					newInteractionVisitsPage.selectType();
					newInteractionVisitsPage.selectAttempts("Successfull");
					newInteractionVisitsPage.selectSubtype("Biological Parent");
					newInteractionVisitsPage.txtNarrative("texting");
					newInteractionVisitsPage.txtProfessionalOpinion("demo");
					newInteractionVisitsPage.clickSaveButton();
				} else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US-0000571 Post Permanency Case Interactions PostPermanency");
			}

		}

	

}
