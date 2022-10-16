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

public class AccessToSafeWaterPage  extends PageBase {

	public AccessToSafeWaterPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Logger logger = LoggerFactory.getLogger(AccessToSafeWaterPage.class);
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy(xpath = "(//*[contains(text(),'All necessary documentation uploaded')]/..//input)")
    WebElement 	allDocumentsUpload_Dropdown;
	
	@FindBy(xpath = "(//*[contains(text(),'All necessary documentation uploaded')]/..//*[text()='Yes'])")
    WebElement 	allDocumentsUpload_Yes;
	
	@FindBy(xpath = "(//*[contains(text(),'All necessary documentation uploaded')]/..//*[text()='No'])")
    WebElement 	allDocumentsUpload_No;
	
	@FindBy(xpath = "//*[text()='Household has access to safe water?']/..//button")
    WebElement 	editHouseholdAccess;
	
	@FindBy(xpath = "//*[contains(text(),'Edit Applicant A signature date')]")
    WebElement 	editApplicantA;
	
	@FindBy(xpath = "//*[contains(text(),'Household has access to safe water')]/..//input")
    WebElement 	householdAccess_Dropdown;
	
	@FindBy(xpath = "//*[contains(text(),'Household has access to safe water')]/..//*[text()='Yes']")
    WebElement 	householdAccess_Yes;
	
	@FindBy(xpath = "//*[contains(text(),'Household has access to safe water')]/..//*[text()='No']")
    WebElement 	householdAccess_No;
	
	@FindBy(xpath = "(//*[contains(text(),'signature date')]/..//input)[1]")
    WebElement 	applicantA_Dropdwon;
	
	@FindBy(xpath = "(//*[contains(text(),'signature date')]/..//*[text()='15'])[1]")
    WebElement 	applicantA_date;
	
	@FindBy(xpath = "(//*[contains(text(),'signature date')]/..//input)[2]")
    WebElement 	applicantB_Dropdwon;
	
	@FindBy(xpath = "(//*[contains(text(),'signature date')]/..//*[text()='15'])[2]")
    WebElement 	applicantB_date;
	
	@FindBy(xpath = "//*[contains(@title,'Edit Standards Met')]")
    WebElement 	editStandardsMet;
	
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
	
	@FindBy(xpath = "(//*[text()='Document Type']/../../../..//input)[2]")
    WebElement 	documentType_Dropdown;
	
	@FindBy(xpath = "//*[text()='Document Type']")
    WebElement 	documentTypeTitle;
	
	@FindBy(xpath = "//*[contains(text(),'Licensed Foster Parents must have access to clean and safe water for cooking and drinking')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Access to Safe Water']")
	WebElement accessToSafeWater;
	
	@FindBy(xpath = "//h1//*[text()='Access to Safe Water']")
	WebElement accessToSafeWaterVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[contains(text(),'Please upload a copy of the Water Agreement form (SF 54612) and any supporting documentation required by the agreement')]")
    WebElement 	instructions_Messgae;
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement instructionsCancelButton;	
	
	@FindBy(xpath = "//*[contains(text(),'This agreement is to be completed by foster parents or applicants for foster home licensure.  The foster parents or applicants and the licensing worker must sign and date the agreement upon completion')]")
	WebElement instructions_HelpMessage;
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Access to Safe Water']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Access to Safe Water']");
	
	Actions act = new Actions(driver);
	
	public void clickAccessToSafeWaterTab() throws AcisException {
		logger.info("Clicking on Complete Criminal History Background Check Form Tab");
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(accessToSafeWater);
		clickWebElemntUsingJavascriptExecutor(accessToSafeWater);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(accessToSafeWaterVerify);
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
	//	act.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Clicking on Page Down");
		waitForElement(uploadFilesButton);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
	}
	
	/**
	 * Select Value for : All necessary documentation uploaded?  
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectAllDocumentValue(String option) throws AcisException {
		logger.info("Selecting Value for : All necessary documentation uploaded?  ");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(allDocumentsUpload_Dropdown);
		clickWebElemntUsingJavascriptExecutor(allDocumentsUpload_Dropdown);
		waitForPageLoadTill(5);
		
		switch (option) {
		case "Yes":
			clickWebElement(allDocumentsUpload_Yes);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "No":
			clickWebElement(allDocumentsUpload_No);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
		
	}
	
	/**
	 * Select Value for :Household has access to safe water?
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectHouseHoldAccessValue(String option) throws AcisException {
		logger.info("Selecting Value for : Household has access to safe water?");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(editHouseholdAccess);
		clickWebElemntUsingJavascriptExecutor(editHouseholdAccess);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(householdAccess_Dropdown);
		clickWebElemntUsingJavascriptExecutor(householdAccess_Dropdown);
		
		switch (option) {
		case "Yes":
			clickWebElement(householdAccess_Yes);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "No":
			clickWebElement(householdAccess_No);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
		
	}
	
	/**
	 * Select Value for : Applicant A signature date
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectApplicantAValue() throws AcisException {
		logger.info("Selecting Value for : Applicant A signature date");
		waitForPageLoadTill(5);
//		scrollingToElementofAPage(editApplicantA);
//		clickWebElemntUsingJavascriptExecutor(editApplicantA);
//		waitForPageLoadTill(5);
		scrollingToElementofAPage(applicantA_Dropdwon);
		clickWebElemntUsingJavascriptExecutor(applicantA_Dropdwon);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(applicantA_date);
		logger.info("Selected Value for : Applicant A signature date");
		
	}
	
	/**
	 * Select Value for :  signature date for 2nd person
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectApplicantBValue() throws AcisException {
		logger.info("Selecting Value for : Applicant B signature date");
		waitForPageLoadTill(5);
//		scrollingToElementofAPage(editApplicantA);
//		clickWebElemntUsingJavascriptExecutor(editApplicantA);
//		waitForPageLoadTill(5);
		scrollingToElementofAPage(applicantB_Dropdwon);
		clickWebElemntUsingJavascriptExecutor(applicantB_Dropdwon);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(applicantB_date);
		logger.info("Selected Value for : Applicant B signature date");
		
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
	 * Select doucment type
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void selectDocumentType(String type) throws AcisException {
		logger.info("Select doucment type: "+ type);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standards_Messgae);
		clickWebElemntUsingJavascriptExecutor(documentType_Dropdown);
		waitForPageLoadTill(5);
		clickWebElement(driver.findElement(By.xpath("//span[@title='"+ type+"']")));
		waitForPageLoadTill(5);
		clickWebElement(documentTypeTitle);
//		act.sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(5);
		logger.info("Selected doucment type: "+ type);
	}
	
	
	/**
	 * Check Standards Message
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		waitForPageLoadTill(5);
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		logger.info("Checked Standards Message");
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
	 * Check Instructions Message
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(standards_Messgae);
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
		scrollingToElementofAPage(standards_Messgae);
		clickWebElement(driver.findElement(By.xpath("//*[text()='" + fileName +"']/../../..//button[@title='Delete file']")));
		waitForPageLoadTill(5);
		logger.info("Deleted File with from file name: "+ fileName);
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
