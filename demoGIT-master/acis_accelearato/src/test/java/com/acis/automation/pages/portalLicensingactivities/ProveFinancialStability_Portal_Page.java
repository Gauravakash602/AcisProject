package com.acis.automation.pages.portalLicensingactivities;

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

public class ProveFinancialStability_Portal_Page extends PageBase{

	public ProveFinancialStability_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(ProveFinancialStability_Portal_Page.class);
	
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy (xpath = "//*[contains(text(),'Licensed Foster Homes must have sufficient income and appropriate fiscal management to maintain its stability and security without a foster care payment')]")
	WebElement standards;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: Foster care payments received on behalf of the child are intended for the sole benefit and care of the child while in foster care')]")
	WebElement reason;
	
	@FindBy (xpath = "//*[contains(text(),'Licensed Foster Homes must have sufficient income and appropriate fiscal management to maintain its stability and security without a foster care payment')]")
	WebElement instructionText;
	
	@FindBy (xpath = "//*[text()='Click for more information']")
	WebElement instructionIcon;
	
	@FindBy (xpath = "//*[@placeholder='Select an Option']")
	WebElement personHousehold;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]")
	WebElement documentType;

	@FindBy (xpath = "//*[text()='Financial Verification for Foster Family Homes (SF 55734)']")
	WebElement docDropdown1;
	
	@FindBy (xpath = "//*[text()='Financial Verification Document']")
	WebElement docDropdown2;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]")
	WebElement allNecessaryDocumentationUploadedDrop;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]/../../..//*[text()='Yes']")
	WebElement allNecessaryDocumentationUploadedYes;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]/../../..//*[text()='No']")
	WebElement allNecessaryDocumentationUploadedNo;
	
	@FindBy (xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
	WebElement taskOwner_Value;
	

	@FindBy(xpath = "//*[text()='Prove Financial Stability']")
	WebElement proveFinancialStability;
	
	@FindBy(xpath = "//h1//*[text()='Prove Financial Stability']")
	WebElement proveFinancialStabilityVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//span[@class='uiOutputText']")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[contains(text(),'Licensed Foster Homes must have sufficient income and appropriate fiscal management to maintain its stability and security without a foster care payment.')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: Foster care payments received on behalf of the child are intended for the sole benefit and care of the child while in foster care.')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "//*[contains(text(),'Help Text')]")
    WebElement helpTextVerify;	
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;	
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy(xpath = "//*[contains(text(),'Please complete and upload a copy of the Financial Verification for Foster Family Homes (SF 55734) and any supporting documentation required by the verification form.')]")
    WebElement 	instructions_Messgae;
	
	@FindBy (xpath = "//*[contains(text(),'Income and expense information should be verified with appropriate documentation including, but not limited to: pay check stubs, tax forms, and monthly utility or other account statements. Required items needing verification are indicated on the form.')]")
	WebElement instructions_HelpMessage;
	
	/**
	 * Verifying standards
	 * @author prateeksha.mahesh
	 */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		waitForPageLoadTill(5);
		clickWebElement(standardsHelpButton);
		waitForElement(standards_HelpMessgae);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
}

	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(instructionsHelpButton);
		clickWebElement(instructionsHelpButton);
		waitForElement(helpTextVerify);
		waitForPageLoadTill(10);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
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
		logger.info("Clicking on Prove Financial Stability Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(proveFinancialStability);
		clickWebElemntUsingJavascriptExecutor(proveFinancialStability);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(proveFinancialStabilityVerify);
		logger.info("Clicked on Prove Financial Stability Tab");

	}
	
	
	
	/**
	 * Click and Upload Files
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
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
	 * Verifying Standards
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void standards() throws AcisException {
	    logger.info("Verifying Standards Message");
		Assert.assertTrue(standards.isDisplayed(), "Error : Standard Message is not displayed Properly");
		clickWebElement(standardsHelpButton);
		Assert.assertTrue(reason.isDisplayed(), "Error : Reason Message is not displayed Properly");
		logger.info("Verified Standards Message");
	}
	
	
	/**
	 * Verifying Instructions
	 * @author prateeksha.mahesh
	 */
	public void instructions() {
		logger.info("Verifying Instruction Message");
		Assert.assertTrue(instructionText.isDisplayed(), "Error : Instruction Text Message is not displayed Properly");
		Assert.assertTrue(instructionIcon.isDisplayed(), "Error :Click here for more information - Message is not displayed Properly");
		logger.info("Verifying Instruction Message");
	}
	
	
	/**
	 * Click on Person/Household
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void personHousehold() throws AcisException {
		logger.info("Clicking on Person/Household DropBox");
		waitForElement(personHousehold);
		clickWebElement(personHousehold);
		logger.info("Clicked on Person/Household DropBox");
	}
	
	
	
	/**
	 * Click on Document Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void documentType(String option) throws AcisException {
		waitForPageLoadTill(10);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Clicking on Document Type DropBox");
		waitForElement(documentType);
		clickWebElement(documentType);
		logger.info("Clicked on Document Type DropBox");
		
		if(option == "Financial Verification for Foster Family Homes (SF 55734)")
		{
			logger.info("Clicking on Financial Verification for Foster Family Homes (SF 55734)");
			waitForElement(docDropdown1);
			clickWebElement(docDropdown1);
			logger.info("Clicked on Financial Verification for Foster Family Homes (SF 55734)");
		}
		else {
			logger.info("Clicking on Financial Verification Document");
			waitForElement(docDropdown2);
			clickWebElement(docDropdown2);
			logger.info("Clicked on Financial Verification Document");
		}
	}
	
	
	/**
	 * Click on All necessary documentation uploaded?  
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void allDocuments(String option) throws AcisException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicking on All necessary documentation uploaded?");
		waitForElement(allNecessaryDocumentationUploadedDrop);
		clickWebElement(allNecessaryDocumentationUploadedDrop);
		logger.info("Clicked on All necessary documentation uploaded?");
		
		if(option == "Yes") {
			logger.info("Clicking on Yes");
			waitForElement(allNecessaryDocumentationUploadedYes);
			clickWebElement(allNecessaryDocumentationUploadedYes);
			logger.info("Clicked on Yes");
		}
		else {
			logger.info("Clicking on No");
			waitForElement(allNecessaryDocumentationUploadedNo);
			clickWebElement(allNecessaryDocumentationUploadedNo);
			logger.info("Clicked on No");
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
	}
	
	
	/**
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		waitForPageLoadTill(5);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	
	/**
	 * Delete File with from file name
	 * @author prateeksha.mahesh
	 */
	public void deleteFile(String fileName) throws AcisException {
		logger.info("Delete File with from file name: "+ fileName);
		clickWebElement(driver.findElement(By.xpath("//*[text()='" + fileName +"']/../../..//button[@title='Delete file']")));
		waitForPageLoadTill(5);
		logger.info("Deleted File with from file name: "+ fileName);
	}
}

	
