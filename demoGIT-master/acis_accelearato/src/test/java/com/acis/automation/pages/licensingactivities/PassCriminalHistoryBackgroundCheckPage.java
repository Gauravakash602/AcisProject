package com.acis.automation.pages.licensingactivities;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PassCriminalHistoryBackgroundCheckPage extends PageBase{

	public PassCriminalHistoryBackgroundCheckPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(PassCriminalHistoryBackgroundCheckPage.class);
	
	
	@FindBy (xpath ="//*[text()='Pass Criminal History Background Check']")
	WebElement passCriminalHistoryBackgroundCheck;
	
	@FindBy (xpath ="//h1//*[text()='Pass Criminal History Background Check']")
	WebElement passCriminalHistoryBackgroundCheckVerify;
	
	
	
	@FindBy(xpath = "(//*[@data-label='Details']/..//*[text()='Details'])[2]")
    WebElement detailsVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement taskOwner_Value;
	
	
	
	@FindBy (xpath ="//*[contains(text(),\\\"Neither Licensed Foster Parents nor residents of the home has a criminal record that would impede the applicant's ability to serve as a foster parent\\\")]")
	WebElement standardMessage;
	
	
	
	@FindBy (xpath ="//*[contains(text(),'For all persons ages 18 and older, please upload 1 signed copy of ') and contains(text(),'Criminal History Background Check (SF 53259) form')]")
	WebElement uploadDocumentationInstruction;
	
	@FindBy (xpath ="(//*[@placeholder='Select an Option'])[1]")
	WebElement personHouseholdDropBox;
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton1;
	
	
	
	@FindBy (xpath ="//*[contains(text(),'For all persons ages 18 and older, please attach a copy of background check results per household member')]")
	WebElement runBackgroundCheckInstruction;
	
	@FindBy (xpath ="(//*[@placeholder='Select an Option'])[3]")
	WebElement housHolddropBox;
	
	@FindBy (xpath ="(//*[text()='Upload Files'])[2]")
	WebElement uploadFilesButton2;
	
	
	
	@FindBy (xpath ="(//*[@placeholder='Select an Option'])[5]")
	WebElement selectResults;
	
	@FindBy (xpath ="(//*[@placeholder='Select an Option'])[5]/../..//*[text()='History Found']")
	WebElement resultsHistoryFound;
	
	@FindBy (xpath ="(//*[@placeholder='Select an Option'])[5]/../..//*[text()='No History Found']")
	WebElement resultsNoHistoryFound;
	
	
	@FindBy (xpath ="//*[contains(text(),'Please review and verify all uploaded documents. Upon completion of reviewing the uploaded documents, answer the questions below and confirm whether the standards have been met')]")
	WebElement confirmStandardsInstruction;
	
	
	
	@FindBy (xpath ="(//*[@placeholder='Select a value'])[1]")
	WebElement Applicant_A_Drop;
	
	@FindBy (xpath ="(//*[@placeholder='Select a value']/../../..//*[text()='Yes'])[1]")
	WebElement Applicant_A_Yes;
	
	@FindBy (xpath ="(//*[@placeholder='Select a value']/../../..//*[text()='No'])[1]")
	WebElement Applicant_A_No;
	
	@FindBy (xpath ="(//*[@placeholder='Select a value']/../../..//*[text()='--None--'])[1]")
	WebElement Applicant_A_None;
	
	@FindBy (xpath = "(//*[@placeholder='Select a value']/../../..//*[text()='N/A'])[1]")
	WebElement Applicant_A_NA;
	
	
	@FindBy (xpath ="(//*[@placeholder='Select a value'])[2]")
	WebElement Applicant_B_Drop;
	
	@FindBy (xpath ="(//*[@placeholder='Select a value']/../../..//*[text()='Yes'])[2]")
	WebElement Applicant_B_Yes;
	
	@FindBy (xpath ="(//*[@placeholder='Select a value']/../../..//*[text()='No'])[2]")
	WebElement Applicant_B_No;
	
	@FindBy (xpath ="(//*[@placeholder='Select a value']/../../..//*[text()='--None--'])[2]")
	WebElement Applicant_B_None;
	
	@FindBy (xpath = "(//*[@placeholder='Select a value']/../../..//*[text()='N/A'])[2]")
	WebElement Applicant_B_NA;
	
	
	
	@FindBy (xpath ="//*[contains(text(),'Any other household members name-based court record check return: felony conviction, total of 4 or more misdemeanors, or misdemeanor that may be related to health and safety of children?')]/..//button")
	WebElement other_Household_Edit;
	
	@FindBy (xpath ="//*[contains(text(),'Any other household members')]/..//input")
	WebElement other_Household_Drop;
	
	@FindBy (xpath ="//*[contains(text(),'Any other household members')]/..//*[text()='Yes']")
	WebElement other_Household_Yes;
	
	@FindBy (xpath ="//*[contains(text(),'Any other household members')]/..//*[text()='No']")
	WebElement other_Household_No;
	
	@FindBy (xpath ="((//*[@placeholder='Select an Option'])[6])[last()]/../../..//*[text()='--None--']")
	WebElement other_Household_None;
	
	@FindBy (xpath ="(//*[text()='Delete file'])[2]")
	WebElement deleteRunBackgroundCheck;
	
	
	@FindBy(xpath = "//*[contains(@title,'Edit Standards Met')]")
    WebElement 	editStandardsMet;
	
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
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Pass Criminal History Background Check']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Pass Criminal History Background Check']");
	
	
	/**
	 * Click on Pass Criminal History Background Check Form
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	Actions act = new Actions(driver);
	
	public void clickPassCriminalHistoryBackgroundCheckFormTab() throws AcisException {
		logger.info("Clicking on Pass Criminal History Background Check Form Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(passCriminalHistoryBackgroundCheck);
		clickWebElemntUsingJavascriptExecutor(passCriminalHistoryBackgroundCheck);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(passCriminalHistoryBackgroundCheckVerify);
		logger.info("Clicked on Pass Criminal History Background Check Form Tab");
	}
	
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void checkTaskValue(String taskValue) throws AcisException {
		clickWebElement(detailsVerify);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Value: " + taskValue);
	}
	
	
	
	/**
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task Owner Value does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	
	
	 /**
	  * Verifying standards
	  * @author prateeksha.mahesh
	  * @throws AcisException
     */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		Assert.assertTrue(standardMessage.isDisplayed(), "Error: Mismatch in standards Messages");
		logger.info("Checked Standards Message");
	}
	
	
	/** Verifying Instructions - upload Documentation
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */
	public void verifyuploadDocumentationInstruction() throws AcisException {
		logger.info("Checking Instructions Message");
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Assert.assertTrue(uploadDocumentationInstruction.isDisplayed(), "Error: Mismatch in Instructions Messages");
		logger.info("Checked Instructions Message");
	}
	
	
	
	/** Click on upload file button and upload file for Upload Documentation Feild
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload1(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(uploadFilesButton1);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton1);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
	}
	
	
	
	/** Verifying Instructions - Run Background Check
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */
	public void verifyrunBackgroundCheckInstruction() throws AcisException {
		logger.info("Checking Instructions Message");
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		Assert.assertTrue(runBackgroundCheckInstruction.isDisplayed(), "Error: Mismatch in Instructions Messages");
		logger.info("Checked Instructions Message");
	}
	
	
	
	/** Click on upload file button and upload file for Run Background Checks
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload2(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(uploadFilesButton2);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton2);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
	}
	
	
	/**
	 * Selecting Results
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void clickOnResults(String results) throws AcisException {
		logger.info("Clicking on Results");
		waitForPageLoadTill(5);
		waitForElement(selectResults);
		clickWebElemntUsingJavascriptExecutor(selectResults);
		waitForPageLoadTill(5);
		switch(results) {
		case "History Found":
			logger.info("Selecting " + results);
			waitForElement(resultsHistoryFound);
			clickWebElement(resultsHistoryFound);
			logger.info("Selecting " + results);
		break;
		case "No History Found":
			logger.info("Selecting " + results);
			waitForElement(resultsNoHistoryFound);
			clickWebElement(resultsNoHistoryFound);
			logger.info("Selecting " + results);
		break;
		default:
		break;	
		}
		waitForPageLoadTill(5);
		logger.info("Selected the result field");
	}
	
	
	
	/** Verifying Instructions - Confirm Standards Met
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */
	public void verifyconfirmStandardsInstruction() throws AcisException {
		logger.info("Checking Instructions Message");
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		//Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoad();
		act.sendKeys(Keys.PAGE_UP).build().perform();
		waitForPageLoad();
		Assert.assertTrue(confirmStandardsInstruction.isDisplayed(), "Error: Mismatch in Instructions Messages");
		logger.info("Checked Instructions Message");
	}
	
	
	
	/**
	 * Click on Question related to Applicant A
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	public void questionRelatedToApplicant_A(String option) throws AcisException {
		logger.info("Clicking on Question related to Applicant A Drop");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForElement(Applicant_A_Drop);
		scrollingToElementofAPage(Applicant_A_Drop);
	jse.executeScript("arguments[0].click();",Applicant_A_Drop);
		//clickWebElement(Applicant_A_Drop);
		logger.info("Clicked on Question related to Applicant A Drop");
		
		switch(option) {
		case "Yes":
			logger.info("Clicking on "+ option);
			waitForElement(Applicant_A_Yes);
			clickWebElement(Applicant_A_Yes);
			logger.info("Clicked on "+ option);	
		break;
		case "No":
			logger.info("Clicking on "+ option);
			waitForElement(Applicant_A_No);
			clickWebElement(Applicant_A_No);
			logger.info("Clicked on "+ option);
		break;
		case "N/A":
			logger.info("Clicking on "+ option);
			waitForElement(Applicant_A_NA);
			clickWebElement(Applicant_A_NA);
			logger.info("Clicked on "+ option);
		break;
		case "None":
			logger.info("Clicking on "+ option);
			waitForElement(Applicant_A_None);
			clickWebElement(Applicant_A_None);
			logger.info("Clicked on "+ option);
		break;
		}
	}
	
	
	/**
	 * Click on Question related to Applicant B
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	public void questionRelatedToApplicant_B(String option) throws AcisException {
		logger.info("Clicking on Question related to Applicant B Drop");
		waitForElement(Applicant_B_Drop);
		clickWebElemntUsingJavascriptExecutor(Applicant_B_Drop);
		logger.info("Clicked on Question related to Applicant B Drop");
		
		switch(option) {
		case "Yes":
			logger.info("Clicking on "+ option);
			waitForElement(Applicant_B_Yes);
			clickWebElement(Applicant_B_Yes);
			logger.info("Clicked on "+ option);	
		break;
		case "No":
			logger.info("Clicking on "+ option);
			waitForElement(Applicant_B_No);
			clickWebElement(Applicant_B_No);
			logger.info("Clicked on "+ option);
		break;
		case "N/A":
			logger.info("Clicking on "+ option);
			waitForElement(Applicant_B_NA);
			clickWebElement(Applicant_B_NA);
			logger.info("Clicked on "+ option);
		break;
		case "None":
			logger.info("Clicking on "+ option);
			waitForElement(Applicant_B_None);
			clickWebElement(Applicant_B_None);
			logger.info("Clicked on "+ option);
		break;
		}
	}
	
	
	
	
	/**
	 * Click on Question related to Other Household Members
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	public void questionRelatedToOtherHouseholdMembers(String option) throws AcisException {
		logger.info("Clicking on Question related to Other Household Members Edit");
		waitForElement(other_Household_Edit);
		clickWebElemntUsingJavascriptExecutor(other_Household_Edit);
		logger.info("Clicking on Question related to Other Household Members Edit");
		
		logger.info("Clicking on Question related to Other Household Members Drop");
		waitForElement(other_Household_Drop);
		clickWebElemntUsingJavascriptExecutor(other_Household_Drop);
		logger.info("Clicking on Question related to Other Household Members Drop");
		
		switch(option) {
		case "Yes":
			logger.info("Clicking on "+ option);
			waitForElement(other_Household_Yes);
			clickWebElement(other_Household_Yes);
			logger.info("Clicked on "+ option);	
		break;
		case "No":
			logger.info("Clicking on "+ option);
			waitForElement(other_Household_No);
			clickWebElement(other_Household_No);
			logger.info("Clicked on "+ option);
		break;
		default:
			logger.info("Clicking on "+ option);
			waitForElement(other_Household_None);
			clickWebElement(other_Household_None);
			logger.info("Clicked on "+ option);
		break;
		}
		waitForPageLoadTill(5);
	}
	
	
	/**
	 * Click on delete Button of Run Background Check
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void deleteRunBackgroundCheckFile() throws AcisException {
		logger.info("Click on delete Button of Run Background Check");
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		//act.sendKeys(Keys.ARROW_UP).build().perform();
		//scrollingToElementofAPage(deleteRunBackgroundCheck);
		waitForElement(deleteRunBackgroundCheck);
		clickWebElemntUsingJavascriptExecutor(deleteRunBackgroundCheck);
		waitForPageLoadTill(10);
		logger.info("Clicked on delete Button of Run Background Check and Deleted the file");	
	}
	
	/**
	 * Standards Met 
	 * @author prateeksha.mahesh
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
		while (isElementPresent(closeTabButtonBy)){
			clickWebElement(closeTabButton);
			waitForPageLoadTill(5);
		}
		logger.info("Close Licensing Activity Tab");
		waitForElement(licensingActivitiesTitle);
		logger.info("Successfully Close Licensing Activity Tab");
		
	}
}
	
