package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class LicensingWorkerHomePage extends PageBase{

	final static Logger logger = LoggerFactory.getLogger(LicensingWorkerHomePage.class);
	
	public LicensingWorkerHomePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public By myLicensedHomesSearchList = By.xpath("//*[@title='My Licensed Homes']/../../../../../..//*[@name='Account-search-input']");
	
	public By myUnLicensedHomesSearchList = By.xpath("//*[@title='My Unlicensed Homes']/../../../../../..//*[@name='Account-search-input']");
	
	public By myOpenFosterParentInquiriesSearchList = By.xpath("//*[@title='My Open Foster Parent Inquiries']/../../../../../..//*[@name='ACIS_Prospect__c-search-input']");
	
	public By myFosterParentApplicantsSearchList = By.xpath("//*[@title='My Foster Parent Applicants']/../../../../../..//*[@name='ACIS_Licensing_Application__c-search-input']");
	
	public By openRelicenseApplicationsSearchList = By.xpath("//*[@title='Open Relicense Applications']/../../../../../..//*[@name='ACIS_Licensing_Application__c-search-input']");
	
	public By openAnnualReviewsSearchList = By.xpath("//*[@title='Open Annual Reviews']/../../../../../..//*[@name='ACIS_Licensing_Application__c-search-input']");
	
	public By openCorrectiveActionPlansSearchList = By.xpath("//*[@title='Open Corrective Action Plans']/../../../../../..//*[@name='ACIS_Licensing_Application__c-search-input']");
	
	public By fosterParentInquiriesLicensingWorkerSearchList = By.xpath("//*[@title='Foster Parent Inquiries Licensing Worker']/../../../../../..//*[@name='ACIS_Prospect__c-search-input']");
	
	public By adoptionRecruitmentSearchList = By.xpath("//*[@title='Adoption Recruitment']/../../../../../..//*[@name='ACIS_Case_Person_Relationship__c-search-input']");
	
	
	
	public By accountName = By.xpath("//span[@title='Account Name']");
	
	public By placementResourceSubtype = By.xpath("//span[@title='Placement Resource Subtype']");
	
	public By licenseStatus = By.xpath("//span[@title='License Status']");
	
	public By address = By.xpath("//span[@title='Address']");
	
	public By phoneNumber = By.xpath("//span[@title='Phone Number']");
	
	public By occupancy = By.xpath("//span[@title='Occupancy']");
	
	public By capacity = By.xpath("//span[@title='Capacity']");
	
	public By initialLicenseStartDate = By.xpath("//span[@title='Initial License Start Date']");
	
	public By licenseEndDate = By.xpath("//span[@title='License End Date']");
	
	public By isPlacementHoldActive = By.xpath("//span[@title='Is Placement Hold Active']");
	
	
	public By placements = By.xpath("//span[text()='Placements']");

	
	
	public By recordID = By.xpath("//span[@title='Record ID']");
	
	public By placementResource = By.xpath("//span[@title='Placement Resource']");
	
	public By applicant_A_Phone = By.xpath("//span[@title='Applicant A Phone']");
	
	public By city = By.xpath("//span[@title='City']");
	
	public By county = By.xpath("//span[@title='County']");
	
	public By status = By.xpath("//span[@title='Status']");
	
	public By licenseRecommendation = By.xpath("//span[@title='License Recommendation']");
	
	public By dateOpened = By.xpath("//span[@title='Date Opened']");
	
	
	public By createdDateDescendingOrderBy = By.xpath("//*[contains(text(),'Sorted by Created Date')]/../../../../../../..//span[contains(text(),'Descending')]");
	
	public By createdDateAscendingOrderBy = By.xpath("//*[contains(text(),'Sorted by Created Date')]/../../../../../../..//span[contains(text(),'Ascending')]");
	
	@FindBy (xpath = "//a[@title='My Licensed Homes']")
	WebElement clickMyLicensedHomes;
	
	@FindBy (xpath = "//*[@title='My Unlicensed Homes']")
	WebElement clickMyUnlicensedHomes;
	
	@FindBy (xpath = "//*[@title='My Open Foster Parent Inquiries']")
	WebElement clickMyOpenFosterParentInquiries;
	
	@FindBy (xpath = "//*[@title='My Foster Parent Applicants']")
	WebElement clickMyFosterParentApplicants;
	
	@FindBy (xpath = "//*[@title='Open Relicense Applications']")
	WebElement clickOpenRelicenseApplications;
	
	@FindBy (xpath = "//*[@title='Open Annual Reviews']")
	WebElement clickOpenAnnualReviews;
	
	@FindBy (xpath = "//*[@title='Open Corrective Action Plans']")
	WebElement clickOpenCorrectiveActionPlans;
	
	@FindBy(xpath = "(//table/tbody/tr/th/span/a)[1]")
	WebElement firstRecord;
	
	
	@FindBy (xpath = "//*[text()='Change Owner']")
	WebElement changeAccountOwner;
	
	@FindBy (xpath = "//input[@title='Search Users']")
	WebElement searchUsers;
	
	@FindBy (xpath = "//button[@name='change owner']")
	WebElement changeOwnerButton;
	
	@FindBy (xpath = "//*[text()='License State']/../..//button")
	WebElement licenseStateEdit;
	
	@FindBy (xpath = "//*[text()='License State']/../..//input")
	WebElement licenseStateDrop;
	
	@FindBy (xpath = "//*[text()='License State']/../..//*[text()='Licensed']")
	WebElement licensed;
	
	@FindBy (xpath = "//*[text()='License State']/../..//*[text()='Expired']")
	WebElement expired;
	
	@FindBy (xpath = "//*[text()='License State']/../..//*[text()='Revoked']")
	WebElement revoked;
	
	@FindBy (xpath = "//*[text()='License State']/../..//*[text()='None']")
	WebElement none;
	
	@FindBy (xpath = "//*[text()='License State']/../..//*[text()='Withdrawn']")
	WebElement withdrawn;
	
	@FindBy (xpath = "//span[text()='Accounts']/../..//a")
	WebElement accountsPage;
	
	@FindBy (xpath = "//span[text()='Placement Resource Assessments']/../..//a")
	WebElement placementResourceAssessmentsPage;
	
	@FindBy (xpath = "//*[@title='Edit Placement Resource Subtype']")
	WebElement placementResourceSubtypeEdit;
	
	@FindBy (xpath = "//*[text()='Placement Resource Subtype']/..//input")
	WebElement placementResourceSubtypeDrop;
	
	@FindBy (xpath = "//*[text()='Placement Resource Subtype']/..//*[text()='DCS Foster Home - Licensed']")
	WebElement dcsFosterHomeLicensed;
	
	@FindBy (xpath = "//*[text()='Placement Resource Subtype']/..//*[text()='DCS Foster Home - Unlicensed Relative']")
	WebElement dcsFosterHomeUnlicensedRelative;
	
	@FindBy (xpath = "//*[text()='Placement Resource Subtype']/..//*[text()='DCS Foster Home - Licensed Relative']")
	WebElement dcsFosterHomeLicensedRelative;
	
	@FindBy (xpath = "//*[text()='Placement Resource Subtype']/..//*[text()='DCS Foster Home - Unlicensed Adoptive']")
	WebElement dcsFosterHomeUnlicensedAdoptive;
	
	@FindBy (xpath = "//*[text()='Placement Resource Subtype']/..//*[text()='LCPA Foster Home']")
	WebElement lcpaFosterHome;
	
	@FindBy (xpath = "//a[@title='Krystal  D souza & Jeevika  Thakur  Home']")
	WebElement disabilitesID;
	
	@FindBy (xpath = "//*[@title='Edit Status']")
	WebElement statusEdit;
	
	@FindBy (xpath = "//*[text()='Status']/..//input")
	WebElement statusDrop;
	
	@FindBy (xpath = "//*[text()='Status']/..//*[text()='Central Office Review']")
	WebElement centralOfficeReview;
	
	@FindBy (xpath = "//*[text()='Status']/..//*[text()='Approved']")
	WebElement approved;
	
	@FindBy (xpath = "//*[text()='Status']/..//*[text()='Supervisor Review']")
	WebElement supervisorReview;
	
	@FindBy (xpath = "//*[text()='Status']/..//*[text()='Closed']")
	WebElement closed;
	
	@FindBy (xpath = "//*[text()='Status']/..//*[text()='Open']")
	WebElement open;
	
	@FindBy (xpath = "//*[text()='Account Owner']/..//following-sibling::*//a")
	WebElement accountOwner_Value;
	
	@FindBy(xpath ="//*[contains(text(),'Sorted by Created Date')]")
	WebElement sortedByCreatedDate;
	
	@FindBy(xpath ="//span[@title='Created Date']")
	WebElement CreatedDateTitleTable;
	
	/**
	 * Verifying search within Lists on the Licensing Worker HomePage
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void verifySearchWithinLists() throws AcisException {
		logger.info("Verifying search within Lists on the Licensing Worker HomePage");
		waitForPageLoadTill(8);
		isElementPresent(myLicensedHomesSearchList);
		isElementPresent(myUnLicensedHomesSearchList);
		isElementPresent(myOpenFosterParentInquiriesSearchList);
		isElementPresent(myFosterParentApplicantsSearchList);
		isElementPresent(openRelicenseApplicationsSearchList);
		isElementPresent(openAnnualReviewsSearchList);
		isElementPresent(openCorrectiveActionPlansSearchList);
		isElementPresent(fosterParentInquiriesLicensingWorkerSearchList);
		isElementPresent(adoptionRecruitmentSearchList);
		logger.info("Verifyed search within Lists on the Licensing Worker HomePage");
	}
	
	
	/**
	 * Verifying all the fields on My Licensed Homes Page
	 * @author prateeksha.mahesh
	 */
	public void verifyFieldsOnMyLicensedHomes() throws AcisException {
		logger.info("Verifying all the fields on My Licensed Homes Page");
		waitForElement(clickMyLicensedHomes);
		clickWebElement(clickMyLicensedHomes);
		waitForPageLoadTill(8);
		isElementPresent(accountName);
		isElementPresent(placementResourceSubtype);
		isElementPresent(licenseStatus);
		isElementPresent(address);
		isElementPresent(phoneNumber);
		isElementPresent(occupancy);
		isElementPresent(capacity);
		isElementPresent(initialLicenseStartDate);
		isElementPresent(licenseEndDate);
		isElementPresent(isPlacementHoldActive);
		logger.info("Verifyed all the fields on My Licensed Homes Page");
	}
	
	
	/**
	 * Verifying all the fields on My Unlicensed Homes Page
	 * @author prateeksha.mahesh
	 */
	public void verifyFieldsOnMyUnlicensedHomes() throws AcisException {
		logger.info("Verifying all the fields on My Unlicensed Homes Page");
		waitForElement(clickMyUnlicensedHomes);
		clickWebElement(clickMyUnlicensedHomes);
		waitForPageLoadTill(8);
		isElementPresent(accountName);
		isElementPresent(placementResourceSubtype);
		isElementPresent(address);
		isElementPresent(phoneNumber);
		isElementPresent(placements);
		isElementPresent(capacity);
		logger.info("Verifyed all the fields on My Unlicensed Homes Page");
	}
	
	
	/**
	 * Verifying all the fields on My Open Foster Parent Inquiries Page
	 * @author prateeksha.mahesh
	 */
	public void verifyFieldsOnMyOpenFosterParentInquiries() throws AcisException {
		logger.info("Verifying all the fields on My Open Foster Parent Inquiries Page");
		waitForElement(clickMyOpenFosterParentInquiries);
		clickWebElement(clickMyOpenFosterParentInquiries);
		waitForPageLoadTill(8);
		isElementPresent(recordID);
		isElementPresent(placementResource);
		isElementPresent(applicant_A_Phone);
		isElementPresent(city);
		isElementPresent(county);
		isElementPresent(status);
		isElementPresent(licenseRecommendation);
		isElementPresent(dateOpened);
		logger.info("Verifyed all the fields on My Open Foster Parent Inquiries Page");
	}
	
	
	
	/**
	 * Verifying all the fields on My Foster Parent Applicants Page
	 * @author prateeksha.mahesh
	 */
	public void verifyFieldsOnMyFosterParentApplicants() throws AcisException {
		logger.info("Verifying all the fields on My Foster Parent Applicants Page");
		waitForElement(clickMyFosterParentApplicants);
		clickWebElement(clickMyFosterParentApplicants);
		waitForPageLoadTill(8);
		isElementPresent(recordID);
		isElementPresent(placementResource);
		isElementPresent(applicant_A_Phone);
		isElementPresent(city);
		isElementPresent(county);
		isElementPresent(status);
		isElementPresent(licenseRecommendation);
		isElementPresent(dateOpened);
		logger.info("Verifyed all the fields on My Foster Parent Applicants Page");
	}
	
	
	/**
	 * Verifying all the fields on Open Relicense Applications Page
	 * @author prateeksha.mahesh
	 */
	public void verifyFieldsOnOpenRelicenseApplications() throws AcisException {
		logger.info("Verifying all the fields on Open Relicense Applications Page");
		waitForElement(clickOpenRelicenseApplications);
		clickWebElement(clickOpenRelicenseApplications);
		waitForPageLoadTill(8);
		isElementPresent(recordID);
		isElementPresent(placementResource);
		isElementPresent(applicant_A_Phone);
		isElementPresent(city);
		isElementPresent(county);
		isElementPresent(status);
		isElementPresent(licenseRecommendation);
		isElementPresent(dateOpened);
		logger.info("Verifyed all the fields on Open Relicense Applications Page");
	}
	
	
	/**
	 * Verifying all the fields on Open Annual Reviews Page
	 * @author prateeksha.mahesh
	 */
	public void verifyFieldsOnOpenAnnualReviews() throws AcisException {
		logger.info("Verifying all the fields on Open Annual Reviews Page");
		waitForElement(clickOpenAnnualReviews);
		clickWebElement(clickOpenAnnualReviews);
		waitForPageLoadTill(8);
		isElementPresent(recordID);
		isElementPresent(placementResource);
		isElementPresent(applicant_A_Phone);
		isElementPresent(city);
		isElementPresent(county);
		isElementPresent(status);
		isElementPresent(dateOpened);
		logger.info("Verifyed all the fields on Open Annual Reviews Page");
	}
	
	
	
	/**
	 * Verifying all the fields on Open Corrective Action Plans Page
	 * @author prateeksha.mahesh
	 */
	public void verifyFieldsOnOpenCorrectiveActionPlans() throws AcisException {
		logger.info("Verifying all the fields on Open Corrective Action Plans Page");
		waitForElement(clickOpenCorrectiveActionPlans);
		clickWebElement(clickOpenCorrectiveActionPlans);
		waitForPageLoadTill(8);
		isElementPresent(recordID);
		isElementPresent(placementResource);
		isElementPresent(applicant_A_Phone);
		isElementPresent(city);
		isElementPresent(county);
		isElementPresent(status);
		isElementPresent(dateOpened);
		logger.info("Verifyed all the fields on Open Corrective Action Plans Page");
	}
	
	
	/**
	 * Verify Account Owner Name
	 * @author prateeksha.mahesh
	 */
	public void verifyAccountOwner(String owner) throws AcisException {
		logger.info("Verifing Account Owner Name " + owner);
		waitForPageLoadTill(5);
		Assert.assertTrue((accountOwner_Value.getText()).contains(owner), "Error: Account Owner Name does not match. Actual Value is :"+ accountOwner_Value.getText() 
		+ "Expected Value: " + owner);
		logger.info("Verifed the Account Owner Name " + owner);
	}

	
	
	
	/**
	 * Change the License State
	 * @author prateeksha.mahesh
	 */
	public void changeTheLicenseState(String licenseState) throws AcisException {
		logger.info("Change the License State" + licenseState);
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(licenseStateEdit);
		clickWebElemntUsingJavascriptExecutor(licenseStateEdit);
		waitForElement(licenseStateDrop);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(licenseStateDrop);
		switch(licenseState) {
		case "Expired":
			waitForElementClickable(expired);
			clickWebElemntUsingJavascriptExecutor(expired);
		break;
		case "Revoked":
			waitForElementClickable(revoked);
			clickWebElemntUsingJavascriptExecutor(revoked);
		break;
		case "None":
			waitForElementClickable(none);
			clickWebElemntUsingJavascriptExecutor(none);
		break;
		case "Withdrawn":
			waitForElementClickable(withdrawn);
			clickWebElemntUsingJavascriptExecutor(withdrawn);
		break;
		case "Licensed":
			waitForElementClickable(licensed);
			clickWebElemntUsingJavascriptExecutor(licensed);
		break;
		default:
		break;	
		}
		logger.info("Selected " + licenseState );
	}
	
	
	/**
	 * Click On First Record
	 * @author prateeksha.mahesh
	 */
	public void clickFirstRecord() throws AcisException {
		logger.info("Clicking on first Record from List View");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElementClickable(firstRecord);
		clickWebElement(firstRecord);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on first Record from List View");
     }
	
	
	/**
	 * Back to Accounts Page
	 * @author prateeksha.mahesh
	 */
	public void backToAccountsPage() throws AcisException {
		logger.info("Back to Accounts Page");
		waitForElementClickable(accountsPage);
		clickWebElement(accountsPage);
		waitForPageLoadTill(7);
		waitForPageLoad();
     }
	
	
	/**
	 * Back to Placement Resource Assessments Page
	 * @author prateeksha.mahesh
	 */
	public void backToPlacementResourceAssessmentsPage() throws AcisException {
		logger.info("Back to Placement Resource Assessments Page");
		waitForElementClickable(placementResourceAssessmentsPage);
		clickWebElement(placementResourceAssessmentsPage);
		waitForPageLoadTill(7);
		waitForPageLoad();
     }
	
	
	/**
	 * Verify whether the record is delisted
	 * @author prateeksha.mahesh
	 */
	public void verifyWhetherTheRecordIsDelisted(String accountName) {
		logger.info("Verifing whether the record is delisted");
		String accountNamePresent= firstRecord.getAttribute("value");
		Assert.assertNotEquals(accountNamePresent, accountName, "record is delisted");
		logger.info("Verifed whether the record is delisted");
	}
	
	
	/**
	 * Click On Placement Resource Subtype
	 * @author prateeksha.mahesh
	 */
	public void placementResourceSubtype(String option) throws AcisException {
		logger.info("Clicking on Placement Resource Subtype");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElementClickable(placementResourceSubtypeEdit);
		clickWebElemntUsingJavascriptExecutor(placementResourceSubtypeEdit);
		waitForPageLoadTill(5);
		waitForElement(placementResourceSubtypeDrop);
		clickWebElemntUsingJavascriptExecutor(placementResourceSubtypeDrop);
		waitForPageLoadTill(5);
	switch(option)	{
	case "DCS Foster Home - Unlicensed Adoptive":
		clickWebElemntUsingJavascriptExecutor(dcsFosterHomeUnlicensedAdoptive);
	break;
	case "DCS Foster Home - Licensed":
		//waitForElementClickable(dcsFosterHomeLicensed);
		clickWebElemntUsingJavascriptExecutor(dcsFosterHomeLicensed);
	break;
	case "DCS Foster Home - Unlicensed Relative":
		//waitForElementClickable(dcsFosterHomeUnlicensedRelative);
		clickWebElemntUsingJavascriptExecutor(dcsFosterHomeUnlicensedRelative);
	break;
	case "DCS Foster Home - Licensed Relative":
		//waitForElementClickable(dcsFosterHomeLicensedRelative);
		clickWebElemntUsingJavascriptExecutor(dcsFosterHomeLicensedRelative);
	break;
	case "LCPA Foster Home":
		//waitForElementClickable(lcpaFosterHome);
		clickWebElemntUsingJavascriptExecutor(lcpaFosterHome);
	break;
	default:
	break;	
	}
		logger.info("Selected" + option);
     }
	
	
	/**
	 * Verify whether the Placement Resource Subtype is changing
	 * @author prateeksha.mahesh
	 */
	public void verifyWhetherThePlacementResourceSubtypeChanging(String option) {
		waitForPageLoadTill(8);
		logger.info("Verifing whether the Placement Resource Subtype is changing");
		Assert.assertTrue(driver.findElement(By.xpath("(//table/tbody/tr/th/span/a)[1]/../../..//*[text()='"+option+"']")).isDisplayed());
		logger.info("Verifed whether the Placement Resource Subtype is changing");
	}
	
	/**
	 * Method for getting First Record Name
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	
	public String getFirstRecordName() throws AcisException {
		logger.info("Getting First Record Name");
		waitForPageLoad();
		waitForPageLoadTill(15);
		waitForElement(firstRecord);
		logger.info("Getting First Record Name");
		System.out.println("First Record Name : " + firstRecord.getText().trim());
		testLoggerInfo("Created First Record Name " + firstRecord.getText().trim());
		logger.info("Returning First Record Name");
		return (firstRecord.getText().trim());
	}
	
	
	/**
	 * Select Status field on Placement Resource Assessment
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	public void selectStatusOnPlacementResourceAssessment(String option) throws AcisException {
		logger.info("Clicking on Placement Resource Subtype");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElementClickable(statusEdit);
		clickWebElemntUsingJavascriptExecutor(statusEdit);
		waitForPageLoadTill(5);
		waitForElement(statusDrop);
		clickWebElemntUsingJavascriptExecutor(statusDrop);
		//clickWebElement(statusDrop);
		waitForPageLoadTill(5);
	switch(option)	{
	case "Open":
		//waitForElementClickable(open);
		clickWebElemntUsingJavascriptExecutor(open);
	break;
	case "Closed":
		//waitForElementClickable(closed);
		clickWebElemntUsingJavascriptExecutor(closed);
	break;
	case "Approved":
		//waitForElementClickable(approved);
		clickWebElemntUsingJavascriptExecutor(approved);
	break;
	case "Supervisor Review":
		//waitForElementClickable(supervisorReview);
		clickWebElemntUsingJavascriptExecutor(supervisorReview);
	break;
	case "Central Office Review":
		//waitForElementClickable(centralOfficeReview);
		clickWebElemntUsingJavascriptExecutor(centralOfficeReview);
	break;
	default:
	break;	
	}
		logger.info("Selected" + option);
     }
	
	/**
	 * 
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	public void sortAddressIDColumn( String order) throws AcisException {
		
		switch (order) {
		case "Ascending":
			while (isElementPresent(createdDateAscendingOrderBy)==false) {
				clickWebElemntUsingJavascriptExecutor(CreatedDateTitleTable);
				waitForPageLoadTill(3);	
			}
			Assert.assertTrue(sortedByCreatedDate.isDisplayed(), "Error: Not able to sort by Address ID");
			logger.info("Address ID column sorted by Ascending order");
			
			break;
			
		case "Descedning":
			
			while (isElementPresent(createdDateDescendingOrderBy)==false) {
				clickWebElemntUsingJavascriptExecutor(CreatedDateTitleTable);
				waitForPageLoadTill(3);
			}
			Assert.assertTrue(sortedByCreatedDate.isDisplayed(), "Error: Not able to sort by Address ID");
			logger.info("Address ID column sorted by Descedning order");
			break;

		default:
			logger.info("No matching order text");
			break;
		}	
	}
	
}
