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

public class ResourceParentRoleAcknowledgment_Portal_Page extends PageBase{

	public ResourceParentRoleAcknowledgment_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(ResourceParentRoleAcknowledgment_Portal_Page.class);
	
	
	@FindBy (xpath = "//*[text()='Resource Parent Role Acknowledgment']")
	WebElement resourceParentRoleAcknowledgment;
	
	@FindBy (xpath = "//h1//*[text()='Resource Parent Role Acknowledgment']")
	WebElement resourceParentRoleAcknowledgmentVerify;
	
	
	

	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	
	
	
	@FindBy(xpath = "//*[@data-key='info']")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "(//*[contains(text(),'Reason: You must be an adult and be a citizen or legal immigrant to foster children')])[1]")
    WebElement 	standards_HelpMessgae;

		
	
	
	
	
	@FindBy (xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
	WebElement taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;
	
	//@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	//WebElement task_Value;
	
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]")
	WebElement persondropbox;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='Hapo Zef']")
	WebElement dropHapo;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='Gapo Zef']")
	WebElement dropGapo;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='Rapoy Zef']")
	WebElement dropRapoy;
	
	

	@FindBy (xpath = "(//span[text()='Resource Parent Role Acknowledgment'])[2]")
	WebElement verify;
	
	
	
	
	/**
	 *  Click on resource Parent Role Acknowledgment
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void resourceParentRoleAcknowledgmentTab() throws AcisException {
		logger.info("Clicking on Resource Parent Role AcknowledgmentPortal Page Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(resourceParentRoleAcknowledgment);
		clickWebElement(resourceParentRoleAcknowledgment);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(resourceParentRoleAcknowledgmentVerify);
		logger.info("Clicked on Resource Parent Role AcknowledgmentPortal Page Tab");
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
	 * Verifying standards
	 * @author prateeksha.mahesh
	 */
    public void verifyStandarsMessage() throws AcisException {
        Actions act = new Actions(driver);
        logger.info("Checking Standards Message");
        clickWebElement(verify);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        waitForPageLoadTill(5);
        scrollingToElementofAPage(standardsHelpButton);
        Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
        logger.info("Checked Standards Message");
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
	 * Click on Person
	 * @author prateeksha.mahesh
	 * @ AcisException
	 */
	
	public void person(String option) throws AcisException {
		logger.info("Clicking on Person Dropbox");
		waitForElement(persondropbox);
		clickWebElement(persondropbox);
		logger.info("Clicked on Person DropBox");
		
		switch(option) {
		case "Hapo Zef":
		{
			logger.info("Clicking on Hapo Zef");
			waitForElement(dropHapo);
			clickWebElement(dropHapo);
			logger.info("Clicked on Hapo Zef");
			break;
		}
		case "Gapo Zef":
		{
			logger.info("Clicking on Gapo Zef");
			waitForElement(dropGapo);
			clickWebElement(dropGapo);
			logger.info("Clicked on Gapo Zef");
			break;
		}
		default:
		{
			logger.info("Clicking on Rapoy Zef");
			waitForElement(dropRapoy);
			clickWebElement(dropRapoy);
			logger.info("Clicked on Rapoy Zef");
			break;
	    }
	
		}
	}
	
}
	
	
	
	
	

//	/**
//	 * Check Task Value
//	 * @author prateeksha.mahesh
//	 */
//	public void checkTaskValue(String taskValue) {
//		logger.info("Check Task  Value: " + taskValue);
//		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
//									+ "Expected Value: " + taskValue);
//		logger.info("Checked Task Owner Value: " + taskValue);
//	}
//	




