package com.acis.automation.pages.portalLicensingactivities;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CompleteHomeVisitFeedBack_Portal_Page extends PageBase{

	public CompleteHomeVisitFeedBack_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(CompleteHomeVisitFeedBack_Portal_Page.class);
	
	
	@FindBy (xpath = "//*[text()='Complete Home Visits']")
	WebElement completeHomeVisits;
	
	@FindBy (xpath = "//h1//*[text()='Complete Home Visits']")
	WebElement completeHomeVisitsVerify;
	
	
	
	
	@FindBy (xpath = "//*[text()='Task']/../..//*[@class='uiOutputText']")
	WebElement task_Value;
	
	@FindBy (xpath = "//*[text()='Task Owner']/../../..//*[@rel='noreferrer']")
	WebElement taskOwner_Value;
	
	
	
	
	@FindBy (xpath = "(//span[text()='Help']/../..//*[@type='button'])[2]")
	WebElement standardHelpButton;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: DCS will not license any household as a foster home unless the home environment is determined to be an appropriate place to foster children.')]")
	WebElement standardHelpMessage;
	
	@FindBy (xpath = "//*[contains(text(),'Household members participate in home visits and the home environment is') and contains(text(),'determined to be an appropriate place to foster children')]")
	WebElement standardMessage;

	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;
	
	
	
	
	@FindBy (xpath = "//*[contains(text(),'Perform necessary home visits with household members and upload') and contains(text(),'completed copies of  SAFE Questionnaires I, II, & Adult Child')]")
	WebElement instructionMessage;
	
	@FindBy (xpath = "//*[text()='Click for more information']")
	WebElement instructionHelpButton;
	
	@FindBy (xpath = "//*[contains(text(),'SAFE Questionnaire I is to be completed by prospective foster') and contains(text(),'parent(s). SAFE Questionnaire II and Adult Child SAFE') and contains(text(),'Questionnaire are for Foster Care Specialist only')]")
	WebElement sentence1;
	
	@FindBy (xpath = "//*[contains(text(),'1st Visit -  Orientation and opportunity to review any open forms') and contains(text(),'on the Licensing Application.  Schedule future home visit') ]")
	WebElement sentence2;
	
	@FindBy (xpath = "//*[contains(text(),'2nd Visit - SAFE Questionnaire I completed in advance and') and contains(text(),'reviewed during visit.  Walkthrough of the home is typically') and contains(text(),'performed during 2nd visit.  Schedule future home visit.  Collect') and contains(text(),'and upload Q1')]")
	WebElement sentence3;
	
	@FindBy (xpath = "//*[contains(text(),'3rd Visit - SAFE Questionnaire II completed on site with the') and contains(text(),'prospective FC parent.  Schedule any necessary future home visits.') and contains(text(),'Collect and upload Q2.')]")
	WebElement sentence4;
	
	@FindBy (xpath = "//button[@title='Cancel']")
	WebElement instructionCancelButton;
	
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFiles;
	
	
	
	@FindBy (xpath = "(//*[@name='docUploadDate'])[last()]")
	WebElement uploadDateDrop;
	
	@FindBy (xpath = "(//*[@name='docUploadDate'])[last()]/../..//*[text()='15']")
	WebElement SelectuploadDate;
	
	
	/**
	 *  Click on Complete Home Visits
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void completeHomeVisitsTab() throws AcisException {
		logger.info("Clicking on Agree to Complete Home Visits Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(completeHomeVisits);
		clickWebElement(completeHomeVisits);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(completeHomeVisitsVerify);
		logger.info("Clicked on Agree to Complete Home Visits Tab");
	}
	
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
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
		clickWebElement(taskOwner);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		Assert.assertTrue(standardMessage.isDisplayed(), "Error: Mismatch in standards Messages");
		clickWebElement(standardHelpButton);
		Assert.assertTrue(standardHelpMessage.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
	
	
	
	/** Verifying Instructions 
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructionMessage.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(instructionHelpButton);
		clickWebElement(instructionHelpButton);
		Assert.assertTrue(sentence1.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		Assert.assertTrue(sentence2.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		Assert.assertTrue(sentence3.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		Assert.assertTrue(sentence4.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionCancelButton);
		logger.info("Checked Instructions Message");
	}
	
	
	/** Click on upload file button and upload file
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicking on Page Down");
		waitForElement(uploadFiles);
		waitForPageLoadTill(5);
		clickWebElement(uploadFiles);
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
	 * Click on Upload Date
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void uploadDate() throws AcisException {
		logger.info("Clicking on Upload Date");
		waitForElement(uploadDateDrop);
		clickWebElement(uploadDateDrop);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(SelectuploadDate);
		logger.info("Clicked on Upload Date");
	}
}
