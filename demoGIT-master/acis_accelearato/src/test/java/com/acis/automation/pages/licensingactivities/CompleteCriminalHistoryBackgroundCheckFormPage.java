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

public class CompleteCriminalHistoryBackgroundCheckFormPage extends PageBase {

	public CompleteCriminalHistoryBackgroundCheckFormPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}


	public static Logger logger = LoggerFactory.getLogger(CompleteCriminalHistoryBackgroundCheckFormPage.class);
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy(xpath = "//*[contains(text(),'Edit Received signed forms for all adults')]")
    WebElement 	editReceivedSignedForms;
	
	@FindBy(xpath = "//*[contains(text(),'Received signed forms for all adults')]/..//input")
    WebElement 	ReceivedSignedForms_Dropdown;
	
	@FindBy(xpath = "//*[contains(text(),'Received signed forms for all adults')]/..//*[text()='Yes']")
    WebElement 	ReceivedSignedForms_Yes;
	
	@FindBy(xpath = "//*[contains(text(),'Received signed forms for all adults')]/..//*[text()='No']")
    WebElement 	ReceivedSignedForms_No;
	

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
	
	@FindBy(xpath = "//button[text()='Cancel']")
    WebElement 	cancelButton;
	
	@FindBy(xpath = "//button[text()='Save']")
    WebElement 	saveButton;
	
	@FindBy(xpath = "(//*[text()='Person']/../../../..//input)[1]")
    WebElement 	person_Dropdown;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	
	@FindBy(xpath = "//*[contains(text(),\"Neither Licensed Foster Parents nor residents of the home has a criminal record that would impede the applicant's ability to serve as a foster parent\")]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Complete Criminal History Background Check Form']")
	WebElement completeCriminalHistoryBackgroundCheckForm;
	
	
	@FindBy(xpath = "//h1//*[text()='Complete Criminal History Background Check Form']")
	WebElement completeCriminalHistoryBackgroundCheckFormVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[contains(text(),'For all persons ages 18 and older, please upload 1 signed copy of Criminal History Background Check (SF 53259) form')]")
    WebElement 	instructions_Messgae;
	
	
	Actions act = new Actions(driver);
	
	public void clickCompleteCriminalHistoryBackgroundCheckFormTab() throws AcisException {
		logger.info("Clicking on Complete Criminal History Background Check Form Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(completeCriminalHistoryBackgroundCheckForm);
		clickWebElemntUsingJavascriptExecutor(completeCriminalHistoryBackgroundCheckForm);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(completeCriminalHistoryBackgroundCheckFormVerify);
		logger.info("Clicked on Complete Criminal History Background Check Form Tab");

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
		driver.navigate().refresh();
		waitForPageLoadTill(10);
	}
	
	/**
	 * Select Value for : Received signed forms for all adults?Received signed forms for all adults?
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectReceivedSignedFormsValue(String option) throws AcisException {
		logger.info("Selecting Value for : Received signed forms for all adults?Received signed forms for all adults");
		waitForPageLoadTill(5);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(editReceivedSignedForms);
		clickWebElemntUsingJavascriptExecutor(editReceivedSignedForms);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(ReceivedSignedForms_Dropdown);
		clickWebElemntUsingJavascriptExecutor(ReceivedSignedForms_Dropdown);
		
		switch (option) {
		case "Yes":
			clickWebElement(ReceivedSignedForms_Yes);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "No":
			clickWebElement(ReceivedSignedForms_No);
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
		waitForPageLoadTill(5);
		clickWebElement(saveButton);
		waitForPageLoadTill(5);
		logger.info("Clicked on save button");
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
	 * Check Task Owner Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	/**
	 * Check Standards Message
	 * @author mrunal.s.tilekar
	 */
	public void verifyStandarsMessage() {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
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
	 * Check Task  Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	/**
	 * Check Instructions Message
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
		logger.info("Checked Instructions Message");
	}
}
