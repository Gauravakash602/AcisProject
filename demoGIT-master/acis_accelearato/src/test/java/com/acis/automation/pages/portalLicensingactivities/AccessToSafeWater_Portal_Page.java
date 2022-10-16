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

public class AccessToSafeWater_Portal_Page extends PageBase{

	public AccessToSafeWater_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
public static Logger logger = LoggerFactory.getLogger(AccessToSafeWater_Portal_Page.class);
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy(xpath = "(//*[contains(text(),'All necessary documentation uploaded')]/..//input)")
    WebElement 	allDocumentsUpload_Dropdown;
	
	@FindBy(xpath = "(//*[contains(text(),'All necessary documentation uploaded')]/..//*[text()='Yes'])")
    WebElement 	allDocumentsUpload_Yes;
	
	@FindBy(xpath = "(//*[contains(text(),'All necessary documentation uploaded')]/..//*[text()='No'])")
    WebElement 	allDocumentsUpload_No;
	
	@FindBy(xpath = "(//*[text()='Document Type']/../../../..//input)[2]")
    WebElement 	documentType_Dropdown;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	

	
	@FindBy(xpath = "//*[contains(text(),'Licensed Foster Parents must have access to clean and safe water for cooking and drinking')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[contains(text(),'Please upload a copy of the Water Agreement form (SF 54612) and any supporting documentation required by the agreement')]")
    WebElement 	instructions_Messgae;
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement instructionsCancelButton;	
	
	@FindBy(xpath = "//*[contains(text(),'This agreement is to be completed by foster parents or applicants for foster home licensure.  The foster parents or applicants and the licensing worker must sign and date the agreement upon completion')]")
	WebElement instructions_HelpMessage;
	
	@FindBy(xpath = "//*[text()='Access to Safe Water']")
	WebElement accessToSafeWater;
	
	@FindBy(xpath = "//h1//*[text()='Access to Safe Water']")
	WebElement accessToSafeWaterVerify;
	
	Actions act = new Actions(driver);
	
	
	public void clickAccessToSafeWaterTab() throws AcisException {
		logger.info("Clicking on Complete Criminal History Background Check Form Tab");
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(accessToSafeWater);
		clickWebElemntUsingJavascriptExecutor(accessToSafeWater);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(accessToSafeWaterVerify);
		logger.info("Clicked on Complete Criminal History Background Check Form Tab");

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
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
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
	 * Check Standards Message
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		logger.info("Checked Standards Message");
	}
	

	/**
	 * Select Value for : All necessary documentation uploaded?  
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectAllDocumentValue(String option) throws AcisException {
		logger.info("Selecting Value for : All necessary documentation uploaded?  ");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(allDocumentsUpload_Dropdown);
		clickWebElement(allDocumentsUpload_Dropdown);
		waitForPageLoadTill(5);
		
		switch (option) {
		case "Yes":
			clickWebElement(allDocumentsUpload_Yes);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "No":
			clickWebElement(allDocumentsUpload_No);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
		
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
		scrollingToElementofAPage(standards_Messgae);
		clickWebElement(instructionsHelpButton);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
	}
	
	/**
	 * Delete File with from file name
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void deleteFile(String fileName) throws AcisException {
		logger.info("Delete File with from file name: "+ fileName);
		scrollingToElementofAPage(standards_Messgae);
		clickWebElement(driver.findElement(By.xpath("//*[text()='" + fileName +"']/../../..//button[@title='Delete file']")));
		waitForPageLoadTill(5);
		logger.info("Deleted File with from file name: "+ fileName);
	}
	
	
	
}
