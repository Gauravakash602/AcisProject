package com.acis.automation.pages.licensingactivities;

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

public class CompleteChildCarePlanPage extends PageBase{

	public CompleteChildCarePlanPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(CompleteChildCarePlanPage.class);
	
	@FindBy (xpath = "//*[text()='Complete Child Care Plan']")
	WebElement completeChildCarePlan;
	
	@FindBy (xpath = "//h1//*[text()='Complete Child Care Plan']")
	WebElement completeChildCarePlanVerify; 

	
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy (xpath = "(//*[text()='Task Owner'])[1]/../..//lightning-button-icon")
	WebElement taskOwnerValue;
	
	
	

	@FindBy (xpath = "//*[contains(text(),'The prospective foster parents provide a plan outlining how they will care') and contains(text(),'for the foster children in their home')]")
	WebElement standardMessage;

	@FindBy (xpath = " //*[contains(text(),'Reason:  To identify who will participate in caring for the children and that all non-household members identified are properly vetted to ensure they do not pose') and contains(text(),'any threat to the safety of the children')]")
	WebElement standardHelpMessage;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardHelpButton;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]")
	WebElement documentTypeDrop;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Child Care Plan']")
	WebElement document_drop1;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Application for Criminal History Background Check']")
	WebElement document_drop2;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='CPS History Form']")
	WebElement document_drop3;
	


	@FindBy (xpath = "(//*[@name='0'])[3]/..//span")
	WebElement approvedCheckBox;
	
	
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFiles1;

	

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]")
	WebElement allnecessarydocumentationuploaded1;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]/../../..//*[text()='Yes']")
	WebElement dropYes1;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]/../../..//*[text()='No']")
	WebElement dropNo1;
	

	
	@FindBy (xpath = " //*[contains(text(),'Provide a child care plan identifying all who will assist in caring for the') and contains(text(),'children in the home and for each identified non-household member provide 1)') and contains(text(),' for Criminal History Background Check and 2)  CPS History Check') and contains(text(),'Form')]")
	WebElement instructionMessage;
	
	@FindBy (xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
	WebElement instructionsHelpButton;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy (xpath = " //*[contains(text(),'Pass Threshold:  Household provides a Child Care Plan.  For each non-household member identified in the plan a 1) Application for Criminal History Background Check and 2)  CPS History Check Form is') and contains(text(),'provided.    All documentation is uploaded via the licensing activity')]")
	WebElement instructionHelpMessage;
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]")
	WebElement backgroundCheckType;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]/../../..//*[text()='CPS History (with Results)']")
	WebElement backbround_drop1;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]/../../..//*[text()='Criminal Background Check History']")
	WebElement backbround_drop2;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]/../../..//*[text()='Sexual/Violent Offender Registry']")
	WebElement backbround_drop3;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]/../../..//*[text()='Fingerprint Check']")
	WebElement backbround_drop4;
	
	

	@FindBy (xpath = "(//*[text()='Upload Files'])[2]")
	WebElement uploadFiles2;
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[6]")
	WebElement results;
	

	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[6]/../../..//*[text()='Qualified']")
	WebElement DropQualified;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[6]/../../..//*[text()='Disqualified']")
	WebElement DropDisqualified;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[6]/../../..//*[text()='Waiver']")
	WebElement DropWaiver;
	
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[7]")
	WebElement allnecessarydocumentationuploaded2;	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[7]/../../..//*[text()='Yes']")
	WebElement dropYes2;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[7]/../../..//*[text()='No']")
	WebElement dropNo2;


	@FindBy (xpath = "//*[@title='Edit Is there an appropriate Child Care Plan?']")
	WebElement isThereAnAppropriateChildCarePlanEdit;

	@FindBy (xpath = "//*[text()='Is there an appropriate Child Care Plan?']/../../..//*[@autocomplete='off']")
	WebElement isThereAnAppropriateChildCarePlanDrop;
	
	@FindBy (xpath = "//*[text()='Is there an appropriate Child Care Plan?']/../../..//*[text()='Yes']")
	WebElement childCarePlanYes;
	
	@FindBy (xpath = "//*[text()='Is there an appropriate Child Care Plan?']/../../..//*[text()='No']")
	WebElement childCarePlanNo;
	
	@FindBy (xpath = "//*[text()='Is there an appropriate Child Care Plan?']/../../..//*[text()='--None--']")
	WebElement childCarePlanNone;
	
	
	@FindBy (xpath = "//*[@name='CancelEdit']")
	WebElement cancel;
	
	@FindBy (xpath = "//*[@name='SaveEdit']")
	WebElement save;
	
	
	
	@FindBy (xpath = "//*[text()='Edit Standards Met?']")
	WebElement standardsMetEdit;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[@placeholder='Select an Option']")
	WebElement standardsMetDrop;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='--None--']")
	WebElement standardsMetNone;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Meets']")
	WebElement standardsMetMeets;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Has Concerns']")
	WebElement standardsMetHasConcerns;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Does not Meet']")
	WebElement standardsMetDoesNotMeet;

	@FindBy(xpath = "//button[@title='Edit Task']")
	WebElement edittask;
	
	@FindBy(xpath = "//*[text()='Task']/..//input")
	WebElement taskInputBox;
	
	@FindBy(xpath = "(//a[text()='Details'])[last()]")
	WebElement detailsTab;

	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Complete Child Care Plan']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Complete Child Care Plan']");
	
	/**
	 * Provide task value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideTaskValue(String taskValue) throws AcisException {
		logger.info("Providing task value: "+ taskValue);
		clickWebElemntUsingJavascriptExecutor(edittask);
		waitForPageLoadTill(5);
		clickWebElement(detailsTab);
		Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
		enterText(taskInputBox, taskValue);
		logger.info("Provided task value: "+ taskValue);
	}

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
		waitForElement(completeChildCarePlan);
		clickWebElement(completeChildCarePlan);
		waitForPageLoadTill(5);
		waitForPageLoad();
		driver.navigate().refresh();
		waitForPageLoadTill(10);
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
		driver.navigate().refresh();
		waitForPageLoad();
		driver.navigate().refresh();
		waitForPageLoadTill(10);
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
	 * Checking Approved
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void approved() throws AcisException {
		logger.info("Checking for Approval");
		waitForElement(approvedCheckBox);
		clickWebElemntUsingJavascriptExecutor(approvedCheckBox);
		logger.info("Checked for Approval");
	}
	
	
	
	/**
	 * Click  on upload file button and upload file
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload1(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicking on Page Down");
		clickWebElemntUsingJavascriptExecutor(uploadFiles1);
		waitForPageLoadTill(5);
		clickWebElement(uploadFiles1);
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
	public void allDocumentationUploaded1(String option) throws AcisException {
		logger.info("Checking whether All necessary documentation uploaded");
		waitForElement(allnecessarydocumentationuploaded1);
		clickWebElemntUsingJavascriptExecutor(allnecessarydocumentationuploaded1);
		
		if(option == "Yes") {
			logger.info("Selecting:" + option);
			waitForElement(dropYes1);
			clickWebElement(dropYes1);
			logger.info("Selected:" + option);
		}
		else {
			logger.info("Selecting:" + option);
		     waitForElement(dropNo1);
		     clickWebElement(dropNo1);
		     logger.info("Selected:" + option);
	     }
		logger.info("Checked whether All necessary documentation uploaded");
	}

	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 */
	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructionMessage.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(instructionsHelpButton);
		clickWebElemntUsingJavascriptExecutor(instructionsHelpButton);
		Assert.assertTrue(instructionHelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
	}
	
	
	/**
	 * Selecting Background Check Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void backgroundCheckType(String option) throws AcisException {
		logger.info("Selecting Background Check Type");
		waitForPageLoad();
		waitForElement(backgroundCheckType);
		clickWebElemntUsingJavascriptExecutor(backgroundCheckType);
		
		switch(option) {
		case "CPS History (with Results)":
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(backbround_drop1);
			logger.info("Selected: " + option);
			break;
		case "Criminal Background Check History":
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(backbround_drop2);
			logger.info("Selected: " + option);
			break;
		case "Sexual/Violent Offender Registry":
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(backbround_drop3);
			logger.info("Selected: " + option);
			break;
		default:
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(backbround_drop4);
			logger.info("Selected: " + option);
			break;
		}
		logger.info("Selected Background Check Type");
	}
		
		
	
	/**
	 * Click  on upload file button and upload file
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload2(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicking on Page Down");
		clickWebElemntUsingJavascriptExecutor(uploadFiles2);
		waitForPageLoadTill(5);
		clickWebElement(uploadFiles2);
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
	 * Selecting Results
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void results(String option) throws AcisException {
		logger.info("Selecting Results");
		waitForPageLoad();
		waitForElement(results);
		clickWebElemntUsingJavascriptExecutor(results);

		switch(option) {
		case "Qualified":
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(DropQualified);
			logger.info("Selected: " + option);
			break;
		case "Disqualified":
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(DropDisqualified);
			logger.info("Selected: " + option);
			break;
		default:
			logger.info("Selecting: " + option);
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(DropWaiver);
			logger.info("Selected: " + option);
			break;
		}
		logger.info("Selected Results");
	}
	
	/**
	 * Checking whether All necessary documentation uploaded?  
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void allDocumentationUploaded2(String option) throws AcisException {
		logger.info("Checking whether All necessary documentation uploaded");
		waitForElement(allnecessarydocumentationuploaded2);
		clickWebElemntUsingJavascriptExecutor(allnecessarydocumentationuploaded2);
		if(option == "Yes") {
			logger.info("Selecting:" + option);
			waitForElement(dropYes2);
			clickWebElement(dropYes2);
			logger.info("Selected:" + option);
		}
		else {
			logger.info("Selecting:" + option);
		     waitForElement(dropNo2);
		     clickWebElement(dropNo2);
		     logger.info("Selected:" + option);
	     }
		logger.info("Checked whether All necessary documentation uploaded");
	}
	
	/**
	 * Checking - Is there an appropriate Child Care Plan?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void isThereAnAppropriateChildCarePlan(String option) throws AcisException {
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoad();
		logger.info("Checking wherther there is as appropriate Child Care Plan");
		scrollingToElementofAPage(isThereAnAppropriateChildCarePlanEdit);
		clickWebElemntUsingJavascriptExecutor(isThereAnAppropriateChildCarePlanEdit);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(isThereAnAppropriateChildCarePlanDrop);
		logger.info("Checked wherther there is as appropriate Child Care Plan");
	switch(option) {
	case "Yes":
		logger.info("Selecting:" + option);
	     waitForElement(childCarePlanYes);
	     clickWebElemntUsingJavascriptExecutor(childCarePlanYes);
	     logger.info("Selected:" + option);
	     break;
	case "No":
		logger.info("Selecting:" + option);
		 waitForElement(childCarePlanNo);
		 clickWebElemntUsingJavascriptExecutor(childCarePlanNo);
	     logger.info("Selected:" + option);
	     break;
	default:
		logger.info("Selecting:" + option);
		 waitForElement(childCarePlanNone);
		 clickWebElemntUsingJavascriptExecutor(childCarePlanNone);
	     logger.info("Selected:" + option);
	     break;
	   }
	}

	

	/**
	 * Click On Cancel Button 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

	public void clickCancelButton() throws AcisException {
		logger.info("Clicking on cancel button");
		waitForPageLoadTill(5);
		clickWebElement(cancel);
		waitForPageLoadTill(5);
		logger.info("Clicked on cancel button");
	}
	
	
	
	/**
	 * Click On Save Button 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking on save button");
		waitForPageLoadTill(5);
		clickWebElement(save);
		waitForPageLoadTill(5);
		logger.info("Clicked on save button");
	}
	
	
	
	/**
	 * Standards Met 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void selectStandardsMetValue(String option) throws AcisException {
		logger.info("Selecting Value for : Standards Met??");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standardsMetEdit);
		clickWebElemntUsingJavascriptExecutor(standardsMetEdit);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standardsMetDrop);
		clickWebElemntUsingJavascriptExecutor(standardsMetDrop);
		
		switch (option) {
		case "--None--":
			clickWebElement(standardsMetNone);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
		
		case "Meets":
			clickWebElement(standardsMetMeets);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Has Concerns":
			clickWebElement(standardsMetHasConcerns);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Does Not Meet":
			clickWebElement(standardsMetDoesNotMeet);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
	}
	
	/**
	 * Close Licensing Activity Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeLicensingActivityTab() throws AcisException {
		logger.info("Close Licensing Activity Tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		while (isElementPresent(closeTabButtonBy)) {
			clickWebElement(closeTabButton);
			waitForPageLoadTill(5);
		}
		logger.info("Close Licensing Activity Tab");
		waitForElement(licensingActivitiesTitle);
		logger.info("Successfully Close Licensing Activity Tab");
		
	}
}
