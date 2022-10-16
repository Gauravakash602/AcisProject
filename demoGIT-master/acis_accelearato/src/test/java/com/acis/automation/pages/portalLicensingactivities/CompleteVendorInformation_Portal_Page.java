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

public class CompleteVendorInformation_Portal_Page extends PageBase{

	public CompleteVendorInformation_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(CompleteVendorInformation_Portal_Page.class);
	 
	
	
	@FindBy (xpath = "//*[text()='Complete Vendor Information']")
	WebElement completeVendorInformation;
	
	@FindBy (xpath = "//h1//*[text()='Complete Vendor Information']")
	WebElement completeVendorInformationVerify;
	
	
	
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	
	
	@FindBy(xpath = "//*[text()='Standards']")
    WebElement 	standards;
	
	@FindBy(xpath = "//*[contains(text(),'The prospective foster parents provide a Direct Deposit Authorization, W-9, and a DCS User Agreement Foster Care Portal/KT')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: To enable DCS to pay Foster Care per diems to licensed Foster Parents')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;

	
	
	@FindBy (xpath = "//*[contains(text(),'Provide Direct Deposit Authorization, W-9, and completed a DCS User Agreement Foster Care Portal/KT and upload the documentation')]")
	WebElement instructionText;
	
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]")
	WebElement person;
	
	@FindBy (xpath = "//*[@placeholder='Select an Option']/../../..//*[text()='Hapo  Zef Home']")
	WebElement hapohome;
	
	@FindBy (xpath = "//*[@placeholder='Select an Option']/../../..//*[text()='Hapo Zef']")
	WebElement hapo;
	
	
	
	
	@FindBy (xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
	WebElement taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]")
	WebElement documentType;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Direct Deposit Authorization']")
	WebElement dropdown1;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='W-9']")
	WebElement dropdown2;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='DCS User Agreement Foster Care Portal/KT']")
	WebElement dropdown3;
	
	
	
	
	/**
	 *  Click on Complete Vendor Information
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void completeVendorInformationTab() throws AcisException {
		logger.info("Clicking on Complete Vendor Information Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(completeVendorInformation);
		clickWebElement(completeVendorInformation);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(completeVendorInformationVerify);
		logger.info("Clicked on Complete Vendor Information Tab");
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
	 * Verifying standards
	 * @author prateeksha.mahesh
	 */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		clickWebElement(taskOwner);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		clickWebElement(standardsHelpButton);
		//hoverOverElement(standardsHelpButton);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
}

	/**
	 * Verifying Instruction
	 * @author prateeksha.mahesh
	 */
	public void instruction() {
		logger.info("Checking Instruction Text Message");
		Assert.assertTrue(instructionText.isDisplayed(), "Error: Mismatch in Instruction Text Messages");
		logger.info("Checked Instruction Text Message");
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
	 * Check Task Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	
	
	
	/**
	 * Click on Person/Household
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void person(String option) throws AcisException {
		logger.info("Clicking on Person Dropbox");
		waitForElement(person);
		clickWebElement(person);
		logger.info("Clicked on Person DropBox");
		
		switch(option) {
		case "Hapo  Zef Home":
		{
			logger.info("Clicking on Hapo  Zef Home");
			waitForElement(hapohome);
			clickWebElement(hapohome);
			logger.info("Clicked on Hapo  Zef Home");
			break;
		}
		
	default:
		{
			logger.info("Clicking on Hapo Zef");
			waitForElement(hapo);
			clickWebElement(hapo);
			logger.info("Clicked on Hapo Zef");
			break;
	
		}
	
		}
	}
	/**
	 * Click on Document Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void documentType(String option) throws AcisException {
		logger.info("Clicking on Document Type DropBox");
		waitForElement(documentType);
		clickWebElement(documentType);
		logger.info("Clicked on Document Type DropBox");
		
		switch(option)
		{
		case "Direct Deposit Authorization":
		{
			logger.info("Clicking on Direct Deposit Authorization");
			waitForElement(dropdown1);
			clickWebElement(dropdown1);
			logger.info("Clicked on Direct Deposit Authorization");
			break;
		}
		case "W-9":
		{
			logger.info("Clicking on W-9");
			waitForElement(dropdown2);
			clickWebElement(dropdown2);
			logger.info("Clicked on W-9");
			break;
		}
		default:
		{
			logger.info("Clicking on DCS User Agreement Foster Care Portal/KT");
			waitForElement(dropdown3);
			clickWebElement(dropdown3);
			logger.info("Clicked on DCS User Agreement Foster Care Portal/KT");
			break;
		}
	}	
  }
}
	
	
