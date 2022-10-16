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

public class MeetAgeCitizenshipRequirements_Portal_Page extends PageBase {

	public MeetAgeCitizenshipRequirements_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Logger logger = LoggerFactory.getLogger(MeetAgeCitizenshipRequirements_Portal_Page.class);

	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
	WebElement 	uploadFilesButton;

	@FindBy(xpath = "(//*[text()='Person']/../../../..//input)[1]")
    WebElement 	person_Dropdown;
	
	
	@FindBy(xpath = "(//*[text()='Document Type']/../../../..//input)[2]")
    WebElement 	documentType_Dropdown;
	
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	
	@FindBy(xpath = "//*[contains(text(),'Licensed Foster Parents must be over the age of 21 and a US citizen or legal immigrant admitted for legal residence')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: You must be an adult and be a citizen or legal immigrant to foster children')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "//*[text()='Meet Age & Citizenship Requirements']")
	WebElement meetAgesCitizenshipRequirements;
	
	@FindBy(xpath = "//h1//*[text()='Meet Age & Citizenship Requirements']")
	WebElement meetAgesCitizenshipRequirementsVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	/**
	 * Check Task  Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskValue(String taskValue) {
		waitForPageLoadTill(5);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	public void clickLicenseActivitiesTab() throws AcisException {
		logger.info("Clicking on Meet Age and Citizenship Requirements Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(meetAgesCitizenshipRequirements);
		clickWebElemntUsingJavascriptExecutor(meetAgesCitizenshipRequirements);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(meetAgesCitizenshipRequirementsVerify);
		logger.info("Clicked on Meet Age and Citizenship Requirements Tab");

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
		
		
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForElement(uploadFilesButton);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
	//	clickWebElement(doneButton);
	//	waitForPageLoadTill(5);
		waitForPageLoad();
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
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
	 * Select doucment type
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void selectDocumentType(String type) throws AcisException {
		logger.info("Select doucment type: "+ type);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(documentType_Dropdown);
		clickWebElement(documentType_Dropdown);
		waitForPageLoadTill(5);
		clickWebElement(driver.findElement(By.xpath("//span[@title='"+ type+"']")));
		logger.info("Selected doucment type: "+ type);
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
	 * @throws AcisException 
	 */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		clickWebElement(standardsHelpButton);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
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
}
