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

public class CompleteChildCarePlan_Portal_page extends PageBase{

	public CompleteChildCarePlan_Portal_page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(CompleteChildCarePlan_Portal_page.class);
	
	@FindBy (xpath = "//*[text()='Complete Child Care Plan']")
	WebElement completeChildCarePlanTab;
	
	@FindBy (xpath = "//h1//*[text()='Complete Child Care Plan']")
	WebElement completeChildCarePlanVerify;
	
	
	
	@FindBy (xpath = "//*[text()='Task']/../..//*[@class='uiOutputText']")
	WebElement task_Value;
	
	@FindBy (xpath = "//*[text()='Task Owner']/../../..//*[@rel='noreferrer']")
	WebElement taskOwnerValue;
	
	
	
	@FindBy (xpath = "//*[contains(text(),'The prospective foster parents provide a plan outlining how they will care for the foster children in their home')]")
	WebElement standardMessage;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;

	@FindBy (xpath = "//*[contains(text(),'Reason:  To identify who will participate in caring for the children and that all non-household members identified are properly vetted to ensure they do not pose any threat to the safety of the children')]")
	WebElement standardHelpMessage;
	
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]")
	WebElement documentTypeDrop;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Child Care Plan']")
	WebElement document_drop1;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Application for Criminal History Background Check']")
	WebElement document_drop2;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='CPS History Form']")
	WebElement document_drop3;
	
	
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFiles;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]")
	WebElement allnecessarydocumentationuploaded;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]/../../..//*[text()='Yes']")
	WebElement dropYes;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]/../../..//*[text()='No']")
	WebElement dropNo;
	
	
	
	/**
	 * Click on Complete Child Care Plan
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	Actions act = new Actions(driver);

	public void completeChildCarePlanTab() throws AcisException {
		logger.info("Clicking on Complete Child Care Plan Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(completeChildCarePlanTab);
		clickWebElement(completeChildCarePlanTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(completeChildCarePlanVerify);
		logger.info("Clicked on Complete Child Care Plan Tab");
	}
	
	
	
	/**
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
	 */
	public void CheckTaskOwnerValue(String task_owner_value) {
		logger.info("Checking Task Owner Value: " + task_owner_value);
		Assert.assertTrue((taskOwnerValue.getText()).contains(task_owner_value), "Error: Task Owner Value does not match. Actual Value is :"+ taskOwnerValue.getText() 
		+ "Expected Value: " + task_owner_value);
		logger.info("Checking Task Owner Value: " + task_owner_value);
	}
	
	
	/**
	 * Check Task  Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Value: " + taskValue);
	}
	
	
	 /**
	  * Verifying standards
	  * @author prateeksha.mahesh
   */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standardMessage.isDisplayed(), "Error: Mismatch in standards Messages");
//		clickWebElement(taskOwner);
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		waitForPageLoadTill(5);
//		hoverOverElement(standardHelpButton);
//		Assert.assertTrue(standardHelpMessage.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
	
	
	/**
	 * Selecting Document Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void documentType(String option) throws AcisException {
		logger.info("Selecting Document Type");
		waitForPageLoad();
		waitForElement(documentTypeDrop);
		clickWebElemntUsingJavascriptExecutor(documentTypeDrop);
		switch(option) {
		case "Child Care Plan":
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(document_drop1);
			logger.info("Selected: " + option);
			break;
		case "Application for Criminal History Background Check":
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(document_drop2);
			logger.info("Selected: " + option);
			break;
		default:
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(document_drop3);
			logger.info("Selected: " + option);
			break;
		}
		logger.info("Selected Document Type");
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
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicking on Page Down");
		clickWebElemntUsingJavascriptExecutor(uploadFiles);
		waitForPageLoadTill(5);
		clickWebElement(uploadFiles);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
	}
	
	
	
	/**
	 * Checking whether All necessary documentation uploaded?  
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void allDocumentationUploaded(String option) throws AcisException {
		logger.info("Checking whether All necessary documentation uploaded");
		waitForElement(allnecessarydocumentationuploaded);
		clickWebElemntUsingJavascriptExecutor(allnecessarydocumentationuploaded);
		
		if(option == "Yes") {
			logger.info("Selecting:" + option);
			waitForElement(dropYes);
			clickWebElement(dropYes);
			logger.info("Selected:" + option);
		}
		else {
			logger.info("Selecting:" + option);
		     waitForElement(dropNo);
		     clickWebElement(dropNo);
		     logger.info("Selected:" + option);
	     }
		logger.info("Checked whether All necessary documentation uploaded");

	driver.navigate().refresh();
	waitForPageLoad();
	driver.navigate().refresh();
	waitForPageLoadTill(10);
}
}
