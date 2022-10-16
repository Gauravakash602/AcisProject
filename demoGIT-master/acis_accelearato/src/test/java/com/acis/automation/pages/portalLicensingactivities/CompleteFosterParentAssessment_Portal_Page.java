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

public class CompleteFosterParentAssessment_Portal_Page  extends PageBase{

	public CompleteFosterParentAssessment_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Logger logger = LoggerFactory.getLogger(CompleteFosterParentAssessment_Portal_Page.class);

	
	
	@FindBy(xpath = "//*[text()='Complete Foster Parent Assessment']")
	WebElement completeFosterParentAssessment;
	
	@FindBy(xpath = "//h1//*[text()='Complete Foster Parent Assessment']")
	WebElement completeFosterParentAssessmentVerify;
	
	

	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy (xpath = "(//*[@title='Edit Task']/..//span)[2]")
	WebElement task_Value;
	
	
	@FindBy (xpath = "//*[contains(text(),'Prospective foster parents must complete the compatibility inventory.')]")
	WebElement standardMessage;
	
	@FindBy (xpath = "(//span[text()='Help']/../..//button)[1]")
	WebElement standardHelpButton;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: The SAFE Compatibility Investory  helps placement workers  determine how appropriate a fit is between an applicant family and a child.')]")
	WebElement standardHelpMessage;
	
	
	@FindBy (xpath = "//*[contains(text(),'Please complete and upload a copy of the required SAFE ') and contains(text(),'Compatibility Inventory.  You may also upload a copy of the Child ') and contains(text(),'Behavioral / Health Challenges form (SF 53199) if applicable.')]")
	WebElement instructionUploadMessage;
	
	
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
	WebElement 	uploadFilesButton;
	
	
	@FindBy(xpath = "(//*[text()='Person']/../../../..//input)[1]")
    WebElement 	person_Dropdown;
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]")
	WebElement documantTypeDrop;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../..//*[text()='Child Behavioral / Health Challenges (SF 53199)']")
	WebElement drop1;
	
	@FindBy (xpath = "(//*[@class='slds-truncate']/..//span)[4]")
	WebElement drop2;
	

	
	
	
	/**
	 * Click on Complete Foster Parent Assessment Tab
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	Actions act = new Actions(driver);
	
	public void clickCompleteFosterParentAssessmentTab() throws AcisException {
		logger.info("Clicking on Complete Foster Parent Assessment Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(completeFosterParentAssessment);
		clickWebElement(completeFosterParentAssessment);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(completeFosterParentAssessmentVerify);
		logger.info("Clicked on Complete Foster Parent Assessment Tab");
	}
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void checkTaskValue(String taskValue) throws AcisException {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Value: " + taskValue);
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
	  * Verifying standards
	  * @author prateeksha.mahesh
	  * @throws AcisException
    */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		Assert.assertTrue(standardMessage.isDisplayed(), "Error: Mismatch in standards Messages");
		//clickWebElement(standardHelpButton);
		//Assert.assertTrue(standardHelpMessage.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
	
	
	
	/** Verifying Instructions - upload Documentation
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */
	public void verifyuploadDocumentationInstruction() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructionUploadMessage.isDisplayed(), "Error: Mismatch in Instructions Messages");
		logger.info("Checked Instructions Message");
	}
	
	
	
	/** Click on upload file button and upload file for Upload Documentation Feild
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(uploadFilesButton);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
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
	 * Selecting Document Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void documentType(String option) throws AcisException {
		logger.info("Selecting Document Type");
		waitForElement(documantTypeDrop);
		//scrollingToElementofAPage(documantTypeDrop);
		clickWebElemntUsingJavascriptExecutor(documantTypeDrop);
		switch(option) {
		case "Child Behavioral / Health Challenges (SF 53199)":
			logger.info("Selecting Child Behavioral / Health Challenges (SF 53199)");
			waitForElement(drop1);
			clickWebElement(drop1);
			logger.info("Selected Child Behavioral / Health Challenges (SF 53199)");
		break;
		case "SAFE Compatibility Inventory":
			logger.info("Selecting SAFE Compatibility Inventory");
			waitForElement(drop2);
			clickWebElement(drop2);
			logger.info("Selected SAFE Compatibility Inventory");
		break;	
		default:
		break;
		}
		logger.info("Selected Document Type");
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
}
