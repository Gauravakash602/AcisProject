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

public class PassSexViolentOffenderBackgroundCheckPage extends PageBase{

	public PassSexViolentOffenderBackgroundCheckPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Logger logger = LoggerFactory.getLogger(PassSexViolentOffenderBackgroundCheckPage.class);
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy(xpath = "//*[contains(@title,'Edit Applicant A registered as sex offender')]")
    WebElement 	editApplicatnASexOffender;
	
	@FindBy(xpath = "//*[contains(@title,'Edit Applicant B registered as sex offender')]")
    WebElement 	editApplicatnBSexOffender;
	
	@FindBy(xpath = "//*[text()='Any residents registered sex offenders?']/..//button")
    WebElement 	editResidentsSexOffenders;
	
	@FindBy(xpath = "//*[contains(@title,'Edit Standards Met')]")
    WebElement 	editStandardsMet;
	
	@FindBy(xpath = "(//*[text()='Results']/../../../..//input[@placeholder='Select an Option'])[3]")
    WebElement 	resultsDropdown;
	
	@FindBy(xpath = "//*[@title='Match']")
    WebElement 	result_Match;
	
	@FindBy(xpath = "//*[@title='No Match']")
    WebElement 	result_NoMatch;

	@FindBy(xpath = "//*[@name='ACIS_Applicant_A_registered_sex_offender__c']")
    WebElement 	applicantA_Dropdown;
	
	@FindBy(xpath = "(//*[contains(text(),'registered as sex offender')]/..//input)[2]")
    WebElement 	applicantB_Dropdown;
	
	@FindBy(xpath = "//*[contains(text(),'Any residents registered sex offenders')]/..//input")
    WebElement 	residents_Dropdown;
	
	@FindBy(xpath = "(//*[contains(text(),'registered as sex offender')]/../..//*[text()='Yes'])[1]")
    WebElement 	applicantA_Yes;
	
	@FindBy(xpath = "(//*[contains(text(),'registered as sex offender')]/../..//*[text()='No'])[1]")
    WebElement 	applicantA_No;
	
	@FindBy(xpath = "(//*[contains(text(),'registered as sex offender')]/../..//*[text()='Yes'])[last()]")
    WebElement 	applicantB_Yes;
	
	@FindBy(xpath = "(//*[contains(text(),'registered as sex offender')]/../..//*[text()='No'])[last()]")
    WebElement 	applicantB_No;
	
	@FindBy(xpath = "(//*[contains(text(),'registered as sex offender')]/../..//*[text()='NA'])[last()]")
    WebElement 	applicantB_NA;
	
	@FindBy(xpath = "//*[contains(text(),'Any residents registered sex offenders')]/..//*[text()='Yes']")
    WebElement 	residents_Yes;
	
	@FindBy(xpath = "//*[contains(text(),'Any residents registered sex offenders')]/..//*[text()='No']")
    WebElement 	residents_No;
	
	@FindBy(xpath = "//*[contains(text(),'Any residents registered sex offenders')]/..//*[text()='N/A']")
    WebElement 	residents_NA;
	
	@FindBy(xpath = "//button[text()='Cancel']")
    WebElement 	cancelButton;
	
	@FindBy(xpath = "//button[text()='Save']")
    WebElement 	saveButton;
	
	
	@FindBy(xpath = "//*[contains(text(),'Standards Met')]/..//input")
    WebElement 	standardsMet_Dropdown;
	
	@FindBy(xpath = "//*[text()='--None--']")
	WebElement standardsMet_None;
	
	@FindBy(xpath = "//*[@data-value='Meets']")
    WebElement 	standardsMet_Meets;
	
	@FindBy(xpath = "//*[@data-value='Has Concerns']")
    WebElement 	standardsMet_HasConcerns;
	
	@FindBy(xpath = "//*[@data-value='Does not Meet']")
    WebElement 	standardsMet_DoesNotMeet;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement 	taskOwner;
	
	@FindBy(xpath = "//*[text()='Standards']")
    WebElement 	standards;
	
	@FindBy(xpath = "//*[contains(text(),'Neither Licensed Foster Parents nor residents of the home is a registered sex offender')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: DCS will not place a child in a home in which the applicant or any resident is a registered sex offender')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "//*[contains(text(),'For all persons ages 14 and older, please upload National Sex Offender Registry Check results for every state the subject of the check has lived in the last 5 years')]")
    WebElement 	instructions_Messgae;
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement instructionsCancelButton;	
	
	@FindBy(xpath = "//*[contains(text(),'Conduct a National Sex Offender Registry Check for all') and contains(text(),'persons age 14 years and older and print the results via the') and contains(text(),'Dru Sjodin National Sex Offender Public website at')]")
	WebElement instructions_HelpMessage;
	
	@FindBy(xpath = "//*[text()='Pass Sex/Violent Offender Background Check']")
	WebElement passSexViolentOffenderBackgroundCheck;
	
	
	@FindBy(xpath = "//h1//*[text()='Pass Sex/Violent Offender Background Check']")
	WebElement passSexViolentOffenderBackgroundCheckVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "(//a[@title='Details'])[last()]")
	WebElement detailsTab;
	
	@FindBy(xpath = "//button[@title='Edit Results']")
	WebElement editResults;
	
	@FindBy(xpath = "//*[text()='Results']/../..//a")
	WebElement editResults_Dropdown;

	@FindBy(xpath = "//button[@title='Save']")
    WebElement 	saveButton_FileTab;

	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Pass Sex/Violent Offender Background Check']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Pass Sex/Violent Offender Background Check']");
	
	Actions act = new Actions(driver);
	
	public void clickPassSexViolentOffenderBackgroundCheckTab() throws AcisException {
		logger.info("Clicking on Pass Sex/Violent Offender Background Check Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(passSexViolentOffenderBackgroundCheck);
		clickWebElement(passSexViolentOffenderBackgroundCheck);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(passSexViolentOffenderBackgroundCheckVerify);
		logger.info("Clicked on Pass Sex/Violent Offender Background Check Tab");

	}
	
	/**
	 * Click  on upload file button and upload file
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		logger.info("Clicking  on upload file button and upload file");
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Clicking on Page Down");
		waitForElement(uploadFilesButton);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
	}
	
	/**
	 * Select Result value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectResult(String resultValue) throws AcisException {
		logger.info("Selecting Result value : " + resultValue );
		scrollingToElementofAPage(resultsDropdown);
		clickWebElement(resultsDropdown);
		waitForPageLoadTill(5);
		
		switch (resultValue) {
		case "Match":
			clickWebElement(result_Match);
			waitForPageLoadTill(5);
			logger.info("Selected result value: "+ resultValue);
			break;
			
		case "No Match":
			clickWebElement(result_NoMatch);
			waitForPageLoadTill(5);
			logger.info("Selected result value: "+ resultValue);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
	}
	
	
	/**
	 * Select Result value after opening file tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectResultFileTab(String resultValue) throws AcisException {
		logger.info("Selecting Result value : " + resultValue );
		scrollingToElementofAPage(editResults);
		clickWebElemntUsingJavascriptExecutor(editResults);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(editResults_Dropdown);
		waitForPageLoadTill(5);
		
		switch (resultValue) {
		case "Match":
			clickWebElement(result_Match);
			waitForPageLoadTill(5);
			logger.info("Selected result value: "+ resultValue);
			break;
			
		case "No Match":
			clickWebElement(result_NoMatch);
			waitForPageLoadTill(5);
			logger.info("Selected result value: "+ resultValue);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
	}
	
	
	/**
	 * Select Value for : Applicant A registered as sex offender?Applicant A registered as sex offender?
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectApplicantAValue(String option) throws AcisException {
		logger.info("Selecting Value for : Applicant A registered as sex offender?Applicant A registered as sex offender");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(applicantA_Dropdown);
		waitForElement(applicantA_Dropdown);
		clickWebElemntUsingJavascriptExecutor(applicantA_Dropdown);
		waitForPageLoadTill(5);
//		scrollingToElementofAPage(applicantA_Dropdown);
		//clickWebElemntUsingJavascriptExecutor(applicantA_Dropdown);
		
		switch (option) {
		case "Yes":
			clickWebElement(applicantA_Yes);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "No":
			clickWebElement(applicantA_No);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
		
	}
	
	/**
	 * Select Value for : Applicant B registered as sex offender?Applicant A registered as sex offender?
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectApplicantBValue(String option) throws AcisException {
		logger.info("Selecting Value for : Applicant B registered as sex offender?Applicant A registered as sex offender");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(editApplicatnBSexOffender);
		clickWebElemntUsingJavascriptExecutor(editApplicatnBSexOffender);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(applicantB_Dropdown);
		clickWebElemntUsingJavascriptExecutor(applicantB_Dropdown);
		
		switch (option) {
		case "Yes":
			clickWebElement(applicantB_Yes);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "No":
			clickWebElement(applicantB_No);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		case "NA":
			clickWebElement(applicantB_NA);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
		
	}
	
	/**
	 * Select Value for : Any residents registered sex offenders?
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectResidentsValue(String option) throws AcisException {
		logger.info("Selecting Value for : Any residents registered sex offenders?");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(editResidentsSexOffenders);
		clickWebElemntUsingJavascriptExecutor(editResidentsSexOffenders);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(residents_Dropdown);
		clickWebElemntUsingJavascriptExecutor(residents_Dropdown);
		
		switch (option) {
		case "Yes":
			clickWebElement(residents_Yes);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "No":
			clickWebElement(residents_No);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "NA":
			clickWebElement(residents_NA);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
		
	}
	
	/**
	 * Select Value for : Standards Met?
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectStandardsMetValue(String option) throws AcisException {
		logger.info("Selecting Value for : Standards Met??");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(editStandardsMet);
		clickWebElemntUsingJavascriptExecutor(editStandardsMet);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standardsMet_Dropdown);
		clickWebElemntUsingJavascriptExecutor(standardsMet_Dropdown);
		
		switch (option) {
		case "--None--":
			clickWebElement(standardsMet_None);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
		
		case "Meets":
			clickWebElement(standardsMet_Meets);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Has Concerns":
			clickWebElement(standardsMet_HasConcerns);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Does Not Meet":
			clickWebElement(standardsMet_DoesNotMeet);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
		
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
		waitForPageLoadTill(8);
//		clickWebElement(saveButton);
		clickWebElemntUsingJavascriptExecutor(saveButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on save button");
	}
	
	
	/**
	 * Click save button on file tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSaveButtonFileTab() throws AcisException {
		logger.info("Clicking on save button");
		waitForPageLoadTill(5);
		clickWebElement(saveButton_FileTab);
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
		clickWebElement(taskOwner);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
	
		waitForPageLoadTill(5);
		hoverOverElement(standardsHelpButton);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
	
	/**
	 * Check Instructions Message
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(standardsHelpButton);
		clickWebElement(instructionsHelpButton);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
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
	 * Check Task  Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	
	/**
	 * Open File
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickOnFileName(String fileName) throws AcisException {
		logger.info("Clicking on file name: " + fileName);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//a[@title='"+ fileName+"']")));
		waitForPageLoadTill(10);
		logger.info("Clicked on file name: " + fileName);
		refreshPage();
		waitForPageLoadTill(10);
		logger.info("Clicked on file name: " + fileName);
	}
	
	
	/**
	 * Click on Details Tab 
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickDetailsTabOfOpenedFile() throws AcisException {
		logger.info("Clicking Details Tab");
		clickWebElemntUsingJavascriptExecutor(detailsTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked  Details Tab");
	}
	
	
	/**
	 * Close opened file tab 
	 * @param only file name without extension
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeOpenFileTab(String fileName) throws AcisException {
		logger.info("Close opened file tab");
		if (isElementPresent(By.xpath("//*[@title='Close "+ fileName +"']"))) {

			clickWebElement(driver.findElement(By.xpath("//*[@title='Close "+ fileName +"']")));
			waitForPageLoadTill(5);
		}
		logger.info("Close opened file tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("successfully Close opened file tab");
			
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
	
}
