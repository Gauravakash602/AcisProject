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

public class PassFingerprintBackgroundCheck_Portal_Page extends PageBase{

	public PassFingerprintBackgroundCheck_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
public static Logger logger = LoggerFactory.getLogger(PassFingerprintBackgroundCheck_Portal_Page.class);

	@FindBy(xpath = "//*[text()='Pass Fingerprint Background Check']")
	WebElement passFingerprintBackgroundCheckPortal;
	
	@FindBy(xpath = "//h1//*[text()='Pass Fingerprint Background Check']")
	WebElement  passFingerprintBackgroundCheckVerify;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement 	taskOwner;
	
	@FindBy(xpath = "//*[contains(text(),'Neither Licensed Foster Parents nor residents of the home has a criminal record that would') and contains(text(),\"impede the applicant's ability to serve as a foster parent\")]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: DCS will not place a child in a home in which any resident has a criminal record that would impede the applicant’s ability to serve as a foster parent')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	Actions act = new Actions(driver);
	
	public void passFingerprintBackgroundCheckPortalTab() throws AcisException {
		logger.info("Clicking on passFingerprintBackgroundCheckPortal Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(passFingerprintBackgroundCheckPortal);
		clickWebElemntUsingJavascriptExecutor(passFingerprintBackgroundCheckPortal);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(passFingerprintBackgroundCheckVerify);
		logger.info("Clicked on passFingerprintBackgroundCheckPortal Tab");

	}
	
	/**
	 * Check Task Owner Value
	 * @author swati.malviya
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	/**
	 * Check Task  Value
	 * @author swati.malviya
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task  Value: " + taskValue);
	}
	
	
	
	/**
	 * Check Standards Message
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
//		clickWebElement(taskOwner);
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		waitForPageLoadTill(5);
//		hoverOverElement(standardsHelpButton);
//		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
		waitForPageLoadTill(5);
        waitForPageLoad();
        refreshPage();
        waitForPageLoadTill(10);
        waitForPageLoad();
	}
	
	/**
	 * Click  on upload file button and upload file
	 * @author swati.malviya
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		logger.info("Clicking  on upload file button and upload file");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(uploadFilesButton);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
		logger.info("file uploaded successfully");
	}

}
