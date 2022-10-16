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

public class CompleteCriminalHistoryBackgroundCheckForm_Portal_Page extends PageBase  {

	public CompleteCriminalHistoryBackgroundCheckForm_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

public static Logger logger = LoggerFactory.getLogger(CompleteCriminalHistoryBackgroundCheckForm_Portal_Page.class);
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy(xpath = "(//*[text()='Person']/../../../..//input)[1]")
    WebElement 	person_Dropdown;
	
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "//*[contains(text(),\"Neither Licensed Foster Parents nor residents of the home has a criminal record that would impede the applicant's ability to serve as a foster parent\")]")
    WebElement 	standards_Messgae;
	
	
	@FindBy(xpath = "//*[text()='Complete Criminal History Background Check Form']")
	WebElement criminalHistoryBackgroundCheckForm;
	
	
	@FindBy(xpath = "//h1//*[text()='Complete Criminal History Background Check Form']")
	WebElement criminalHistoryBackgroundCheckFormVerify;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[contains(text(),'For all persons ages 18 and older, please upload 1 signed copy of Criminal History Background Check (SF 53259) form')]")
    WebElement 	instructions_Messgae;
	
	
	Actions act = new Actions(driver);
	
	public void clickCriminalHistoryBackgroundCheckFormTab() throws AcisException {
		logger.info("Clicking on Complete Criminal History Background Check Form Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(criminalHistoryBackgroundCheckForm);
		clickWebElemntUsingJavascriptExecutor(criminalHistoryBackgroundCheckForm);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(criminalHistoryBackgroundCheckFormVerify);
		logger.info("Clicked on Complete Criminal History Background Check FormTab");

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
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
		driver.navigate().refresh();
		waitForPageLoad();
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
		logger.info("Checked Instructions Message");
	}
}
