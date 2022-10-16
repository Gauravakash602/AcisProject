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

public class ObtainMedicalClearance_Portal_Page extends PageBase{

	public ObtainMedicalClearance_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(ObtainMedicalClearance_Portal_Page.class);
	
	
	@FindBy (xpath = "//*[text()='Obtain Medical Clearance']")
	WebElement obtainMedicalClearance;
	
	@FindBy (xpath = "//h1//*[text()='Obtain Medical Clearance']")
	WebElement obtainMedicalClearanceVerify;
	
	
	
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	@FindBy (xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
	WebElement taskOwner_Value;
	
	
		
	
	
	@FindBy(xpath = "//*[text()='Standards']")
    WebElement 	standards;
	
	@FindBy(xpath = "//*[contains(text(),'Prospective foster parents and all household members meet medical requirements')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: To ensure the Foster Parents and household members do not have any medical conditions that could jeopardize the health and safety of a foster child')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;
	
	
	
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy (xpath = "//*[contains(text(),'Complete and upload the Medical Report for Caregivers documentation  and, if applicable, the Medical Report for Household Members') and contains(text(),'documentation')]")
	WebElement instructions_text;
	
	@FindBy (xpath = "//*[contains(text(),'The Medical Report for Caregivers documentation must be completed for each applicant.  The Medical Report for Household Members') and contains(text(),'documentation must be completed for each household member who is not an applicant')]")
	WebElement  instructions_HelpMessage;

	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]")
	WebElement persondropbox;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='Hapo Zef']")
	WebElement dropHapo;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='Gapo Zef']")
	WebElement dropGapo;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='Rapoy Zef']")
	WebElement dropRapoy;
	
	
	
	
	/**
	 *  Click on Obtain Medical Clearance
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void obtainMedicalClearanceTab() throws AcisException {
		logger.info("Clicking on Obtain Medical Clearance Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(obtainMedicalClearance);
		clickWebElement(obtainMedicalClearance);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(obtainMedicalClearanceVerify);
		logger.info("Clicked on Obtain Medica lClearance Tab");
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
		
		//driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Clicking on Page Down");
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


public void clickAddFilesAndUpload_Updated(String filepath) throws AcisException, InterruptedException, AWTException {
	
	
	waitForPageLoadTill(10);
	waitForPageLoad();
	Actions act = new Actions(driver);
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys(Keys.TAB).build().perform();
	act.sendKeys(Keys.ENTER).build().perform();
	
	//waitForElement(uploadFilesButton);
	waitForPageLoadTill(5);
	//clickWebElement(uploadFilesButton);
	logger.info("Clicked on Upload Button");
	waitForPageLoadTill(5);
	uploadFileUsingRobot(filepath);
	waitForPageLoadTill(5);
//	clickWebElement(doneButton);
	waitForPageLoadTill(5);
	waitForPageLoad();
	
	logger.info("file uploaded successfully");
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

	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_text.isDisplayed(), "Error: Mismatch in Instruction Messages");
		scrollingToElementofAPage(standardsHelpButton);
		clickWebElement(instructionsHelpButton);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
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
	 * Check Task Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task  Value: " + taskValue);
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
	
	
}
