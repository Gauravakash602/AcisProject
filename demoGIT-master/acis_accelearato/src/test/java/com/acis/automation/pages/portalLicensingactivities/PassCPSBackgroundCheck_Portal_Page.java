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

public class PassCPSBackgroundCheck_Portal_Page extends PageBase{

	public PassCPSBackgroundCheck_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Logger logger = LoggerFactory.getLogger(PassCPSBackgroundCheck_Portal_Page.class);
	
	@FindBy(xpath = "//*[text()='Pass CPS Background Check']")
	WebElement passCPSBackgroundCheckPortal;
	
	@FindBy(xpath = "//h1//*[text()='Pass CPS Background Check']")
	WebElement passCPSBackgroundCheckPortalVerify;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement 	taskOwner;
	
	@FindBy(xpath = "//*[contains(text(),'Neither Licensed Foster Parents nor residents of the home has been indicated as a perpetrator of abuse or neglect against a child')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: DCS will not place a child in a home in which any resident has indicated CPS history that would impede the foster parent’s ability to serve as a foster parent')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Person']/../../../..//input)[1]")
    WebElement 	person_Dropdown;

	@FindBy(xpath = "//*[text()='AlwarsASXXxxxsaxs axsaxsssax']")
    WebElement AlwarsASXXxxxsaxs	;
	
	@FindBy(xpath = "(//*[text()='Kranti k' and @class='slds-truncate'])")
    WebElement Krantik	;
	
	@FindBy(xpath = "(//*[text()='chinchildone c' and @class='slds-truncate'])")
    WebElement 	chinchildonec;
	
	@FindBy(xpath = "(//*[text()='chinchildtwo c' and @class='slds-truncate'])")
    WebElement chinchildtwoc;
	
	@FindBy(xpath = "(//*[@placeholder='Select an Option'])[2]")
    WebElement 	documentType_Dropdown;
	
	@FindBy(xpath = "(//*[text()='Request for CPS History Check (SF 52802)'])")
	WebElement requestforCPSHistoryCheck;
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	Actions act = new Actions(driver);
	
	public void clickpassCPSBackgroundCheckPortalTab() throws AcisException {
		logger.info("Clicking on passCPSBackgroundCheckPortal Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(passCPSBackgroundCheckPortal);
		clickWebElemntUsingJavascriptExecutor(passCPSBackgroundCheckPortal);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(passCPSBackgroundCheckPortalVerify);
		logger.info("Clicked passCPSBackgroundCheckPortal Tab");

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
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	
	/**
	 * Check Standards Message
	 * @author swati.malviya
	 * @throws AcisException 
	 */
	public void standarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		clickWebElement(standardsHelpButton);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
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
	}
	
	
	/**
	 * Select Document Type
	 * @author swati.malviya
	 * @throws AcisException 
	 * 
	 */
	public void selectDocumentType() throws AcisException {
		logger.info("Select Document Type Dropdown");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(documentType_Dropdown);
		clickWebElement(documentType_Dropdown);
		waitForPageLoadTill(5);
		clickWebElement(requestforCPSHistoryCheck);
		logger.info("Selected Document Type");
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
		clickWebElement(uploadFilesButton);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
		logger.info("file uploaded successfully");
		  waitForPageLoadTill(5);
	        waitForPageLoad();
	        refreshPage();
	        waitForPageLoadTill(10);
	        waitForPageLoad();
	}
	
	/**
	 * Delete File with from file name
	 * @author swati.malviya
	 * @throws AcisException 
	 */
	public void deleteFile(String fileName) throws AcisException {
		logger.info("Delete File with from file name: "+ fileName);
		clickWebElement(driver.findElement(By.xpath("//*[text()='Or drop files']")));
		waitForPageLoadTill(5);
		logger.info("Deleted File with from file name: "+ fileName);
	}
	
}
