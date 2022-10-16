package com.acis.automation.pages.licensingactivities;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class MeetAgeCitizenshipRequirementsPage extends PageBase {

	public MeetAgeCitizenshipRequirementsPage() throws AcisException {

		// TODO Auto-generated constructor stub
		super();

	}

	public static Logger logger = LoggerFactory.getLogger(MeetAgeCitizenshipRequirementsPage.class);

	
	@FindBy(xpath = "(//span[text()='Upload Files'])[1]")
	WebElement addFilesButton;
	
	@FindBy(xpath = "//*[text()='Select Files']")
	WebElement selectFilesTitle;
	
	@FindBy(xpath = "//span[text()='Upload Documentation']/ancestor::flexipage-component2//span[text()='Upload Files']")
	WebElement uploadFilesButton;
	
	@FindBy(xpath = "//button//span[text()='Done']")
	WebElement doneButton;
	
	@FindBy(xpath = "//button[text()='Edit']")
	WebElement editButton;
	
	@FindBy(xpath = "(//*[contains(text(),'age 21 years or older')]/../..//input)[1]")
	WebElement applicantAAge;
	
	@FindBy(xpath = "(//*[contains(text(),'US Citizen/Legal Immigrant')]/../..//input)[1]")
	WebElement applicantACitizen;
	
	@FindBy(xpath = "(//*[contains(text(),'age 21 years or older')]/../..//input)[2]")
	WebElement applicantBAge;
	
	@FindBy(xpath = "(//*[contains(text(),'US Citizen/Legal Immigrant')]/../..//input)[2]")
	WebElement applicantBCitizen;
	
	@FindBy(xpath = "(//*[contains(text(),'age 21 years or older')]/..//span[text()='Yes'])[1]")
	WebElement applicantAAgeYes;
	
	@FindBy(xpath = "(//*[contains(text(),'age 21 years or older')]/..//span[text()='No'])[1]")
	WebElement applicantAAgeNo;
	
	@FindBy(xpath = "(//*[contains(text(),'age 21 years or older')]/..//span[contains(text(),'None')])[1]")
	WebElement applicantAAgeNone;
	
	@FindBy(xpath = "(//*[contains(text(),'US Citizen/Legal Immigrant')]/..//span[text()='Yes'])[1]")
	WebElement applicantACitizenYes;
	
	@FindBy(xpath = "(//*[contains(text(),'US Citizen/Legal Immigrant')]/..//span[text()='No'])[1]")
	WebElement applicantACitizenNo;
	
	@FindBy(xpath = "(//*[contains(text(),'age 21 years or older')]/..//span[text()='Yes'])[2]")
	WebElement applicantBAgeYes;
	
	@FindBy(xpath = "(//*[contains(text(),'age 21 years or older')]/..//span[text()='No'])[2]")
	WebElement applicantBAgeNo;
	
	@FindBy(xpath = "(//*[contains(text(),'US Citizen/Legal Immigrant')]/..//span[text()='Yes'])[2]")
	WebElement applicantBCitizenYes;
	
	@FindBy(xpath = "(//*[contains(text(),'US Citizen/Legal Immigrant')]/..//span[text()='No'])[2]")
	WebElement applicantBCitizenNo;
	
	@FindBy(xpath = "//*[text()='Edit Standards Met?']")
	WebElement editStandards;
	
	@FindBy(xpath = "//*[text()='--None--']")
	WebElement none;
	
	@FindBy(xpath = "//*[text()='Meets']")
	WebElement meets;
	
	@FindBy(xpath = "//*[text()='Has Concerns']")
	WebElement hasConcerns;
	
	@FindBy(xpath = "//*[text()='Does not meet']")
	WebElement doesNotMeet;
	
	@FindBy(xpath = "//*[text()='Standards Met?']/..//input")
	WebElement stadardsMet;
	
	@FindBy(xpath = "//button[text()='Cancel']")
    WebElement 	cancelButton;
	
//	@FindBy(xpath = "//button[text()='Save']")
//    WebElement 	saveButton;
	
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	
	@FindBy(xpath = "//*[contains(text(),'Licensed Foster Parents must be over the age of 21 and a US citizen or legal immigrant admitted for legal residence')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: You must be an adult and be a citizen or legal immigrant to foster children')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Person']/../../../..//input)[1]")
    WebElement 	person_Dropdown;
	
	
	@FindBy(xpath = "(//*[text()='Document Type']/../../../..//input)[2]")
    WebElement 	documentType_Dropdown;
	
	@FindBy(xpath = "//*[text()='Meet Age & Citizenship Requirements']")
	WebElement meetAgesCitizenshipRequirements;
	
	@FindBy(xpath = "//h1//*[text()='Meet Age & Citizenship Requirements']")
	WebElement meetAgesCitizenshipRequirementsVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//button[@title='Edit Task']")
	WebElement edittask;
	
	@FindBy(xpath = "//*[text()='Task']/..//input")
	WebElement taskInputBox;
	
	@FindBy(xpath = "(//a[text()='Details'])[last()]")
	WebElement detailsTab;
	
	@FindBy(xpath = "//button[@title='Close Meet Age & Citizenship Requirements']")
	WebElement closeTabButton;

	public By closeTabButtonBy = By.xpath("//button[@title='Close Meet Age & Citizenship Requirements']");
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;
	
	@FindBy (xpath = "//button[@name='SaveEdit']")
	WebElement saveButton;
	/**
	 * Provide task value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideTaskValue(String taskValue) throws AcisException {
		logger.info("Providing task value: "+ taskValue);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
			
		waitForPageLoadTill(5);
		//scrollingToElementofAPage(edittask);
		clickWebElemntUsingJavascriptExecutor(edittask);
		waitForPageLoadTill(5);
		try {
			clickWebElement(detailsTab);
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        
	        enterText(taskInputBox, taskValue);
		}catch (Exception e) {
			enterText(taskInputBox, taskValue);
		}
		
		logger.info("Provided task value: "+ taskValue);
		waitForPageLoad();
		waitForPageLoadTill(5);

	}
	
	/**
	 * Close Licensing Activity Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeLicensingActivityTab() throws AcisException {
		logger.info("Close Licensing Activity Tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		while (isElementPresent(closeTabButtonBy)) {
			clickWebElement(closeTabButton);
			waitForPageLoadTill(5);
		}
		logger.info("Close Licensing Activity Tab");
		waitForElement(licensingActivitiesTitle);
		logger.info("Successfully Close Licensing Activity Tab");
		
	}
	/**
	 * Check Task  Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	public void clickLicenseActivitiesTab() throws AcisException {
		logger.info("Clicking on Meet Age and Citizenship Requirements Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(meetAgesCitizenshipRequirements);
		clickWebElement(meetAgesCitizenshipRequirements);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(meetAgesCitizenshipRequirementsVerify);
		logger.info("Clicked on Meet Age and Citizenship Requirements Tab");

	}
	
	
	/**
	 * Click on Add Files button and click on upload file button
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Clicking on Page Down");
		waitForElement(uploadFilesButton);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
	//	clickWebElement(doneButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		driver.navigate().refresh();
		logger.info("file uploaded successfully");
	}
	
	
	/**
	 * Edit Standards Met
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void editStandards() throws AcisException {
		logger.info("Clicking on Edit Button");
		waitForPageLoad();
		waitForElement(editButton);
		clickWebElement(editButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Edit");
	}
	
	/**
	 * Select Applicant A Age
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void selectApplicantAAge(String option) throws AcisException {
		logger.info("Selecting Applicant A Age:"+option);
		waitForPageLoad();
		waitForPageLoadTill(5);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		waitForElement(applicantAAge);
		clickWebElement(applicantAAge);
		switch (option) {
		case "Yes":
			waitForElement(applicantAAgeYes);
			clickWebElement(applicantAAgeYes);
			break;
		case "No":
			waitForElement(applicantAAgeNo);
			clickWebElement(applicantAAgeNo);
			break;
		case "None":
			waitForElement(applicantAAgeNone);
			clickWebElement(applicantAAgeNone);
		default:
			break;
		}
		logger.info("Selected Applicant A Age:"+option);
	}
	
	/**
	 * Select Application A Citizen
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void selectApplicantACitizen(String option) throws AcisException {
		logger.info("Selecting Applicant A Citizenship:"+option);
		waitForPageLoad();
		waitForElement(applicantACitizen);
		clickWebElement(applicantACitizen);
		switch (option) {
		case "Yes":
			waitForElement(applicantACitizenYes);
			clickWebElement(applicantACitizenYes);
			break;
		case "No":
			waitForElement(applicantACitizenNo);
			clickWebElement(applicantACitizenNo);
			break;
		default:
			break;
		}
		logger.info("Selected Applicant A Citizenship:"+option);
	}
	
	/**
	 * Select Applicant B Age
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void selectApplicantBAge(String option) throws AcisException {
		logger.info("Selecting Applicant B Age:"+option);
		waitForPageLoad();
		waitForElement(applicantBAge);
		clickWebElement(applicantBAge);
		switch (option) {
		case "Yes":
			waitForElement(applicantBAgeYes);
			clickWebElement(applicantBAgeYes);
			break;
		case "No":
			waitForElement(applicantBAgeNo);
			clickWebElement(applicantBAgeNo);
			break;
		default:
			break;
		}
		logger.info("Selected Applicant B Age:"+option);
	}
	
	/**
	 * Select Applicant B Citizen
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void selectApplicantBCitizen(String option) throws AcisException {
		logger.info("Selecting Applicant B Citizenship:"+option);
		waitForPageLoad();
		waitForElement(applicantBCitizen);
		clickWebElement(applicantBCitizen);
		switch (option) {
		case "Yes":
			waitForElement(applicantBCitizenYes);
			clickWebElement(applicantBCitizenYes);
			break;
		case "No":
			waitForElement(applicantBCitizenNo);
			clickWebElement(applicantBCitizenNo);
			break;
		default:
			break;
		}
		logger.info("Selected Applicant B Citizenship:"+option);
	}
	
	/**
	 * Edit Standards Met
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void selectStandardsMet(String option) throws AcisException {
		logger.info("Selecting Applicant B Citizenship:"+option);
		waitForPageLoad();
		waitForElement(editStandards);
		clickWebElemntUsingJavascriptExecutor(editStandards);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(stadardsMet);
		switch (option) {
		case "--None--":
			waitForElement(none);
			clickWebElemntUsingJavascriptExecutor(none);
			break;
		case "Meets":
			waitForElement(meets);
			clickWebElemntUsingJavascriptExecutor(meets);
			break;
		case "Has Concerns":
			waitForElement(hasConcerns);
			clickWebElemntUsingJavascriptExecutor(hasConcerns);
			break;
		case "Does not Meet":
			waitForElement(doesNotMeet);
			clickWebElemntUsingJavascriptExecutor(doesNotMeet);
			break;
		default:
			break;
		}
		logger.info("Selected Applicant B Citizenship:"+option);
		waitForPageLoadTill(5);
	}
	
	/**
	 * Click cancel button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickCancelButton() throws AcisException {
		logger.info("Clicking on cancel button");
		waitForPageLoadTill(5);
		clickWebElement(cancelButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on cancel button");
	}
	
	/**
	 * Click save button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking on save button");
		waitForPageLoadTill(5);
		clickWebElement(saveButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on save button");
	}
	
	/**
	 * Check Task Owner Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	/**
	 * Check Standards Message
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		clickWebElement(standardsHelpButton);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
	
	/**
	 * Delete File with from file name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void deleteFile(String fileName) throws AcisException {
		logger.info("Delete File with from file name: "+ fileName);
		clickWebElement(driver.findElement(By.xpath("//*[text()='" + fileName +"']/../../..//button[@title='Delete file']")));
		waitForPageLoadTill(5);
		logger.info("Deleted File with from file name: "+ fileName);
	}
	
	/**
	 * Select Person name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void selectPersonName(String personName) throws AcisException {
		logger.info("Select Person name: "+ personName);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(person_Dropdown);
		clickWebElement(person_Dropdown);
		waitForPageLoadTill(5);
		clickWebElement(driver.findElement(By.xpath("//span[@title='"+ personName+"']")));
		logger.info("Selected Person name: "+ personName);
	}
	
	
	/**
	 * Select doucment type
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void selectDocumentType(String type) throws AcisException {
		logger.info("Select doucment type: "+ type);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(documentType_Dropdown);
		clickWebElement(documentType_Dropdown);
		waitForPageLoadTill(5);
		clickWebElement(driver.findElement(By.xpath("//span[@title='"+ type+"']")));
		logger.info("Selected doucment type: "+ type);
	}
	
}
