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

public class ProvideSocialHistory_Portal_Page extends PageBase{

	public ProvideSocialHistory_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(ProvideSocialHistory_Portal_Page.class);

	
	
	@FindBy (xpath = "//*[text()='Provide Social History']")
	WebElement provideSocialHistory;
	
	@FindBy (xpath = "//h1//*[text()='Provide Social History']")
	WebElement provideSocialHistoryVerify;
	
	
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFilesButton;
	
	
	
	
	@FindBy (xpath = "//*[text()='Licensed Foster Parents must complete a home study assessment.']")
	WebElement standards_Messgae;
	
	
	
	
	
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy (xpath = "//*[contains(text(),'The Structured Analysis Family Evaluation (SAFE) home study must be used by all DCS Regional Foster Care Specialists and LCPA licensing') and contains(text(),'staff. Additional information regarding the SAFE home study may be found at')]")
	WebElement instructions_HelpMessage;
	
	@FindBy (xpath = "//*[contains(text(),'Please upload the completed Home Study assessment for the applicant(s) to review and sign.  Check the box when the proper Home Study') and contains(text(),'documentation has been uploaded to let the applicant(s) know it is ready for review')]")
	WebElement instruction_text;
	
	
	
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
		
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	
	
	
	/**
	 *  Click on Provide Social History
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void provideSocialHistoryTab() throws AcisException {
		logger.info("Clicking on Provide Social History Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(provideSocialHistory);
		clickWebElement(provideSocialHistory);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(provideSocialHistoryVerify);
		logger.info("Clicked on Provide Social History Tab");
	}
	
	
	
	
	/**
	 * Click  on upload file button and upload file
	 * @author prateeksha.mahesh
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
		clickWebElemntUsingJavascriptExecutor(uploadFilesButton);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
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
	
	
	
	/**
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
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
	 */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		waitForPageLoadTill(5);
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		logger.info("Checked Standards Message");
}
	
	
	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instruction_text.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(instructionsHelpButton);
		clickWebElement(instructionsHelpButton);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
	}
	
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task  Value: " + taskValue);
	}
	
	
}
