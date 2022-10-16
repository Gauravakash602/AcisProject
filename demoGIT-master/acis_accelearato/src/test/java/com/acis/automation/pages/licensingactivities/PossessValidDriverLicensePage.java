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

public class PossessValidDriverLicensePage extends PageBase {

	public PossessValidDriverLicensePage() throws AcisException {

		// TODO Auto-generated constructor stub
		super();

	}

	public static Logger logger = LoggerFactory.getLogger(PossessValidDriverLicensePage.class);

	
	@FindBy(xpath = "(//span[text()='Upload Files'])[1]")
	WebElement addFilesButton;
	
	@FindBy(xpath = "//*[text()='Select Files']")
	WebElement selectFilesTitle;
	
	@FindBy(xpath = "//button//span[text()='Upload Files']")
	WebElement uploadFilesButton;
	
	@FindBy(xpath = "//button//span[text()='Done']")
	WebElement doneButton;
	
	@FindBy(xpath = "//button[text()='Edit']")
	WebElement editButton;
	
	@FindBy(xpath = "(//*[contains(text(),'valid driver license')]/../..//input)[1]")
	WebElement applicantALicense;
	
	@FindBy(xpath = "//*[text()='Others possess valid driver license?']/../..//button")
	WebElement editotherLicense;
	
	@FindBy(xpath = "//*[text()='Others possess valid driver license?']/../..//input")
	WebElement otherLicense;
	
	@FindBy(xpath = "(//*[contains(text(),'valid driver license')]/../..//input)[2]")
	WebElement applicantBLicense;
	
	@FindBy(xpath = "(//*[contains(text(),'valid driver license')]/..//span[text()='Yes'])[1]")
	WebElement applicantALicenseYes;
	
	@FindBy(xpath = "(//*[contains(text(),'valid driver license')]/..//span[text()='No'])[1]")
	WebElement applicantALicenseNo;
	
	@FindBy(xpath = "(//*[contains(text(),'valid driver license')]/..//span[contains(text(),'None')])[1]")
	WebElement applicantALicenseNone;
	
	@FindBy(xpath = "//*[text()='Others possess valid driver license?']/..//*[text()='Yes']")
	WebElement otherLicenseYes;
	
	@FindBy(xpath = "//*[text()='Others possess valid driver license?']/..//*[text()='No']")
	WebElement otherLicenseNo;
	
	@FindBy(xpath = "(//*[contains(text(),'valid driver license')]/..//span[text()='Yes'])[2]")
	WebElement applicantBLicenseYes;
	
	@FindBy(xpath = "(//*[contains(text(),'valid driver license')]/..//span[text()='No'])[2]")
	WebElement applicantBLicenseNo;
	
	@FindBy(xpath = "//*[contains(@title,'Edit Standards Met')]")
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
	
	@FindBy(xpath = "//button[text()='Save']")
    WebElement 	saveButton;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "//*[contains(text(),'If a foster family provides for transportation of children, any vehicle used shall be licensed in accordance with state law and shall be maintained in safe operating condition')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "(//*[text()='Able to Drive']/../../../..//input)[1]")
    WebElement 	ableToDrive_Dropdown;
	
	@FindBy(xpath = "//*[text()='Possess Valid Driver License']")
	WebElement possessValidDriverLicense;
	
	@FindBy(xpath = "//h1//*[text()='Possess Valid Driver License']")
	WebElement possessValidDriverLicenseVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//button[@title='Edit Task']")
	WebElement edittask;
	
	@FindBy(xpath = "//*[text()='Task']/..//input")
	WebElement taskInputBox;
	
	@FindBy(xpath = "(//a[text()='Details'])[last()]")
	WebElement detailsTab;

	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Possess Valid Driver License']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Possess Valid Driver License']");
	
	/**
	 * Provide task value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideTaskValue(String taskValue) throws AcisException {
		logger.info("Providing task value: "+ taskValue);
		clickWebElemntUsingJavascriptExecutor(edittask);
		waitForPageLoadTill(5);
		clickWebElement(detailsTab);
		Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
		enterText(taskInputBox, taskValue);
		logger.info("Provided task value: "+ taskValue);
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
		logger.info("Clicking on Possess Valid Driver License Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(possessValidDriverLicense);
		clickWebElement(possessValidDriverLicense);
		waitForPageLoadTill(5);
		waitForPageLoad();
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(possessValidDriverLicenseVerify);
		logger.info("Clicked on Possess Valid Driver License Tab");

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
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(editButton);
		clickWebElement(editButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Edit");
	}
	
	
	/**
	 * Select Applicant A License
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void selectApplicantALicense(String option) throws AcisException {
		logger.info("Selecting Applicant A License:"+option);
		waitForPageLoad();
		waitForPageLoadTill(5);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(applicantALicense);
		clickWebElement(applicantALicense);
		switch (option) {
		case "Yes":
			waitForElement(applicantALicenseYes);
			clickWebElement(applicantALicenseYes);
			break;
		case "No":
			waitForElement(applicantALicenseNo);
			clickWebElement(applicantALicenseNo);
			break;
		case "None":
			waitForElement(applicantALicenseNone);
			clickWebElement(applicantALicenseNone);
		default:
			break;
		}
		logger.info("Selected Applicant A License:"+option);
	}
	
	/**
	 * Select Other Posses Valid License
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void selectOther(String option) throws AcisException {
		logger.info("Selecting Other Posses Valid License:"+option);
		waitForPageLoad();
		waitForElement(editotherLicense);
		scrollingToElementofAPage(editotherLicense);
		clickWebElemntUsingJavascriptExecutor(editotherLicense);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(otherLicense);
		switch (option) {
		case "Yes":
			waitForElement(otherLicenseYes);
			clickWebElement(otherLicenseYes);
			break;
		case "No":
			waitForElement(otherLicenseNo);
			clickWebElement(otherLicenseNo);
			break;
		default:
			break;
		}
		logger.info("Selected Other Posses Valid License:"+option);
	}
	
	/**
	 * Select Applicant B License
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void selectApplicantBLicense(String option) throws AcisException {
		logger.info("Selecting Applicant B License:"+option);
		waitForPageLoad();
		waitForElement(applicantBLicense);
		clickWebElement(applicantBLicense);
		switch (option) {
		case "Yes":
			waitForElement(applicantBLicenseYes);
			clickWebElement(applicantBLicenseYes);
			break;
		case "No":
			waitForElement(applicantBLicenseNo);
			clickWebElement(applicantBLicenseNo);
			break;
		default:
			break;
		}
		logger.info("Selected Applicant B License:"+option);
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
	 * Select Able to Drive type
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void selectAbleToDriveType(String type) throws AcisException {
		logger.info("Select Able to Drive  type: "+ type);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(ableToDrive_Dropdown);
		clickWebElement(ableToDrive_Dropdown);
		waitForPageLoadTill(5);
		clickWebElement(driver.findElement(By.xpath("//span[@title='"+ type+"']")));
		logger.info("Selected Able to Drive  type: "+ type);
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
