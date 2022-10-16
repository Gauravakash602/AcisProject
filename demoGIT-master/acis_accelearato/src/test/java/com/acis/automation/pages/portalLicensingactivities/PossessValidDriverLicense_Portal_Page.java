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

public class PossessValidDriverLicense_Portal_Page extends PageBase {

	public PossessValidDriverLicense_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

public static Logger logger = LoggerFactory.getLogger(PossessValidDriverLicense_Portal_Page.class);

	
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	
	@FindBy(xpath = "//*[contains(text(),'If a foster family provides for transportation of children, any vehicle used shall be licensed in accordance with state law and shall be maintained in safe operating condition')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "(//*[text()='Able to Drive']/../../../..//input)[1]")
    WebElement 	ableToDrive_Dropdown;
	
	@FindBy(xpath = "//*[text()='Possess Valid Driver License']")
	WebElement possessValidDriverLicense;
	
	@FindBy(xpath = "//h1//*[text()='Possess Valid Driver License']")
	WebElement possessValidDriverLicenseVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//span[@class='uiOutputText']")
	WebElement task_Value;
	
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
		scrollingToElementofAPage(possessValidDriverLicense);
		clickWebElemntUsingJavascriptExecutor(possessValidDriverLicense);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(possessValidDriverLicenseVerify);
		logger.info("Clicked on Possess Valid Driver License Tab");

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
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Clicking on Page Down");
		logger.info("Select Able to Drive  type: "+ type);
		waitForPageLoadTill(5);
		clickWebElement(ableToDrive_Dropdown);
		waitForPageLoadTill(5);
		clickWebElement(driver.findElement(By.xpath("//span[@title='"+ type+"']")));
		logger.info("Selected Able to Drive  type: "+ type);
	}
	
}
