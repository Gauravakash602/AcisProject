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

public class ReceiveReferencesPage  extends PageBase{

	public ReceiveReferencesPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(ReceiveReferencesPage.class);
	
	@FindBy (xpath = "//*[text()='Receive References']")
	WebElement receiveReference;
	
	@FindBy (xpath = "//h1//*[text()='Receive References']")
	WebElement receiveReferenceVerify;
	
	
	
	@FindBy (xpath = "(//*[text()='Task'])/../../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy (xpath = "(//*[text()='Task Owner'])/../../..//button[@title='Open ACIS Supervisor Preview']")
	WebElement taskOwnerValue;
	
	
	
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	@FindBy (xpath = " //*[contains(text(),'Four individuals stand as personal references affirming that the applicants will') and contains(text(),'be capable foster parents')]")
	WebElement standardMessage;
	
	@FindBy (xpath = " //*[contains(text(),'Reason: To help ensure only individuals of high standard and moral character are licensed as foster parents')]")
	WebElement standardHelpMessage;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardHelpButton;
	
	
	
	@FindBy (xpath = " //*[contains(text(),'Provide four personal references')]")
	WebElement instructionMessage;
	
	@FindBy (xpath = " //*[contains(text(),'Each reference is considered to be a personal reference for the household.  Provide a minimum of four references')]")
	WebElement instructionHelpMessage;
	
	@FindBy (xpath = "//*[text()='Instructions']/..//*[text()='Help']/../../button")
	WebElement instructionHelpButton;
	
	
	
	
	@FindBy (xpath = "//*[text()='Add Reference']")
	WebElement addReference;
	
	@FindBy (xpath = "//*[text()='First Name']/..//input")
	WebElement firstName;
	
	@FindBy (xpath = "//*[text()='Last Name']/..//input")
	WebElement lastName;
	
	@FindBy (xpath = "//*[text()='Phone Number']/..//input")
	WebElement phoneNumber;
	
	@FindBy (xpath = "//*[text()='Email Address']/..//input")
	WebElement emailAddress;
	
	@FindBy (xpath = "//*[text()='Date Reference Form Sent']/..//input")
	WebElement dateReferenceFormSent;
	
	@FindBy (xpath = "//*[text()='Date Reference Form Sent']/..//input/../..//[text()='4']")
	WebElement dateSelected;
	
	@FindBy (xpath = "//*[text()='Address']/..//input")
	WebElement address;

	@FindBy (xpath = "//*[text()='Additional Information']/..//input")
	WebElement additionalInfo;


	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../..//*[text()='John']")
	WebElement john;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../..//*[text()='Park']")
	WebElement park;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../..//*[text()='Danial']")
	WebElement danial;

	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]/../..//*[text()='Lara']")
	WebElement lara;

	
	@FindBy (xpath = "//*[text()='Cancel']/..//button")
	WebElement cancelButton;

	@FindBy (xpath = "//*[text()='Save']/..//button")
	WebElement saveButton;

	@FindBy (xpath = "//button[@title='edit']")
	WebElement editReference;
	
	@FindBy (xpath = "//button[@title='Delete file']")
	WebElement deleteReference;
	
	
	
	@FindBy (xpath = "(//*[text()='Reference Form']/../../..//*[@type='text'])[1]")
	WebElement reference;
	
	@FindBy (xpath = "//*[text()='Select a date']")
	WebElement referenceFormReceived;
	
	@FindBy (xpath = "(//*[@name='0'])[3]/../..//*[text()='4']")
	WebElement selectDate;
	
	
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFiles;

	
	
	@FindBy (xpath = "//*[text()='Add a row']/..//lightning-primitive-icon")
	WebElement addRemoveButton;
	
	

	@FindBy (xpath = "//*[contains(text(),'Please review and verify all uploaded documents. Upon completion of reviewing the uploaded documents, answer the questions below and confirm whether the standards have been met')]")
	WebElement instructionReference;
	
	@FindBy (xpath = "//*[@title='Edit Minimal of four refence forms received?']")
	WebElement minimal_of_four_references_edit;
	
	@FindBy (xpath = "//*[text()='Minimal of four refence forms received?']/..//input")
	WebElement minimal_of_four_references_drop;
	
	@FindBy (xpath = "//*[text()='Minimal of four refence forms received?']/../../..//*[text()='--None--']")
	WebElement minimal_of_four_references_None;
	
	@FindBy (xpath = "//*[text()='Minimal of four refence forms received?']/../../..//*[text()='Yes']")
	WebElement minimal_of_four_references_Yes;
	
	@FindBy (xpath = "//*[text()='Minimal of four refence forms received?']/../../..//*[text()='No']")
	WebElement minimal_of_four_references_No;
	
	
	
	@FindBy (xpath = "//*[text()='Edit Reference form received per reference?']")
	WebElement reference_form_received_per_reference_edit;
	
	@FindBy (xpath = "//*[text()='Reference form received per reference?']/..//input")
	WebElement reference_form_received_per_reference_drop;
	
	@FindBy (xpath = "//*[text()='Reference form received per reference?']/../../..//*[text()='--None--']")
	WebElement reference_form_received_per_reference_None;
	
	@FindBy (xpath = "//*[text()='Reference form received per reference?']/../../..//*[text()='Yes']")
	WebElement reference_form_received_per_reference_Yes;
	
	@FindBy (xpath = "//*[text()='Reference form received per reference?']/../../..//*[text()='No']")
	WebElement reference_form_received_per_reference_No;
	
	
	
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
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Does not meet']")
	WebElement standardsMetDoesNotMeet;
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Receive References']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Receive References']");
	
	/**
	 * Click on Receive Reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	Actions act = new Actions(driver);
	
	public void receiveReferenceTab() throws AcisException {
		logger.info("Clicking on Receive Reference Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(receiveReference);
        waitForElement(receiveReference);
        clickWebElemntUsingJavascriptExecutor(receiveReference);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(receiveReferenceVerify);
		logger.info("Clicked on Receive Reference Tab");
	}
	
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 */
	public void ChecktaskValue(String taskValue) {
		act.sendKeys(Keys.PAGE_UP).build().perform();
		waitForPageLoadTill(5);
		logger.info("Checking Task Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
		+ "Expected Value: " + taskValue);
		logger.info("Checked Task Value: " + taskValue);
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
	  * Verifying standards
	  * @author prateeksha.mahesh
     */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standardMessage.isDisplayed(), "Error: Mismatch in standards Messages");
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
	 * Verifying Instruction Message
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void InstructionMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructionMessage.isDisplayed(), "Error: Mismatch in Instructions Message");
		//clickWebElement(instructionHelpButton);
		//Assert.assertTrue(instructionHelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Message");
		logger.info("Checked Instructions Message");
	}
	
	
	
	/**
	 * Click on Add reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void addReference() throws AcisException {
		logger.info("Clicking on Add reference");
		waitForElement(addReference);
		clickWebElemntUsingJavascriptExecutor(addReference);
		logger.info("Clicked on Add reference");	
	}
	
	
	
	/**
	 * Click on First Name
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void firstName(String first) throws AcisException {
		logger.info("Clicking on First Name");
		enterText(firstName, first);
		logger.info("Clicked on First Name");	
		waitForPageLoadTill(5);
	}
	
	
	/**
	 * Click on Create New Reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void createReference() throws AcisException {
		logger.info("Clicking on Last Name");
		waitForElement(lastName);
		clickWebElement(lastName);
		logger.info("Clicked on Last Name");	
		
		logger.info("Clicking on Phone Number");
		waitForElement(phoneNumber);
		clickWebElement(phoneNumber);
		logger.info("Clicked on Phone Numbere");	
		
		logger.info("Clicking on Email Address");
		waitForElement(emailAddress);
		clickWebElement(emailAddress);
		logger.info("Clicked on Email Address");	
		
		logger.info("Clicking on Date Reference Form Sent");
		waitForElement(dateReferenceFormSent);
		clickWebElement(dateReferenceFormSent);
		logger.info("Clicked on Date Reference Form Sent");
		
		logger.info("Clicking on Address");
		waitForElement(address);
		clickWebElement(address);
		logger.info("Clicked on Address");	
		
		logger.info("Clicking on Additional Information");
		waitForElement(additionalInfo);
		clickWebElement(additionalInfo);
		logger.info("Clicked on Additional Information");
	}
	
	
	
	/**
	 * Click on Save Button of Create New Reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void save() throws AcisException {
		logger.info("Clicking on Save");
		waitForElement(saveButton);
		clickWebElement(saveButton);
		logger.info("Clicked on Save");	
		waitForPageLoadTill(5);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
	}
	
	
	
	/**
	 * Click on Cancel Button of Create New Reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void cancel() throws AcisException {
		logger.info("Clicking on Cancel");
		waitForElement(cancelButton);
		clickWebElement(cancelButton);
		logger.info("Clicked on Cancel");	
	}
	
	
	
	/**
	 * Click on edit Button of Create New Reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void editReference() throws AcisException {
		logger.info("Clicking on Edit ");
		waitForElement(editReference);
		clickWebElement(editReference);
		logger.info("Clicked on Edit");	
	}
	
	
	
	/**
	 * Click on delete Button of Create New Reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void deleteReference() throws AcisException {
		logger.info("Clicking on delete");
		waitForElement(deleteReference);
		clickWebElement(deleteReference);
		logger.info("Clicked on delete");	
	}
	
	
	
	/**
	 * Click on Reference 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void reference(String option) throws AcisException {
		logger.info("Clicking on Reference");
		clickWebElemntUsingJavascriptExecutor(reference);
		logger.info("Clicked on Reference");
		
		switch(option) {
		case "John":
			logger.info("Selecting John");
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(john);
			waitForPageLoadTill(5);
		break;
		case "Park":
			logger.info("Selecting Park");
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(park);	
			waitForPageLoadTill(5);
		break;
		case "Danial":
			logger.info("Selecting Danial");
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(danial);	
			waitForPageLoadTill(5);
		break;
		default:
			logger.info("Selecting Lara");
			waitForPageLoad();
			clickWebElemntUsingJavascriptExecutor(lara);	
			waitForPageLoadTill(5);
		break;	
		}
	}
	
	
	
	/**
	 * Click on Reference Form Received
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void referenceFormReceived() throws AcisException {
		logger.info("Clicking on Reference Form Received Drop Box");
		waitForElement(referenceFormReceived);
		clickWebElemntUsingJavascriptExecutor(referenceFormReceived);
		logger.info("Clicking on Reference Form Received Drop Box");
		logger.info("Selecting the Date");
		scrollingToElementofAPage(selectDate);
		clickWebElemntUsingJavascriptExecutor(selectDate);
		logger.info("Selected the Date");
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
	 * Click on Add/Remove 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void addRemove() throws AcisException {
		logger.info("Clicking on Add/Remove");
		waitForElement(addRemoveButton);
		clickWebElement(addRemoveButton);
		logger.info("Clicked on Add/Remove");	
	}
	
	
	
	/**
	 * Click on Minimal of four references?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void minimalOfFourReferences(String option) throws AcisException {
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoad();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		//act.sendKeys(Keys.ARROW_UP).build().perform();
		logger.info("Clicking on Minimal of four references? Edit");
	
		waitForElement(minimal_of_four_references_edit);
		scrollingToElementofAPage(minimal_of_four_references_edit);
		clickWebElemntUsingJavascriptExecutor(minimal_of_four_references_edit);
		logger.info("Clicked on Minimal of four references? Edit");
		
		logger.info("Clicking on Minimal of four references? Drop");
		
		waitForPageLoadTill(5);
		waitForElement(minimal_of_four_references_drop);
		
			clickWebElement(minimal_of_four_references_drop);
		
		logger.info("Clicked on Minimal of four references? Drop");
		
		switch(option) {
		case "Yes":
			logger.info("Clicking on Yes");
			waitForElement(minimal_of_four_references_Yes);
			clickWebElement(minimal_of_four_references_Yes);
			logger.info("Clicked on Yes");	
			break;
		case "No":
			logger.info("Clicking on No");
			waitForElement(minimal_of_four_references_No);
			clickWebElement(minimal_of_four_references_No);
			logger.info("Clicked on No");
			break;
		default:
			logger.info("Clicking on None");
			waitForElement(minimal_of_four_references_None);
			clickWebElement(minimal_of_four_references_None);
			logger.info("Clicked on None");
			break;
		}
	}
	
	
	
	/**
	 * Click on Reference form received per reference?
	 * @author prateeksha.mahesh
	 */
	public void referenceFormReceivedPerReference(String option) throws AcisException {
		logger.info("Clicking on Reference form received per reference Edit");
		waitForElement(reference_form_received_per_reference_edit);
		clickWebElemntUsingJavascriptExecutor(reference_form_received_per_reference_edit);
		logger.info("Clicking on Reference form received per reference Edit");
		
		logger.info("Clicking on Reference form received per reference Drop");
		waitForElement(reference_form_received_per_reference_drop);
		clickWebElemntUsingJavascriptExecutor(reference_form_received_per_reference_drop);
		logger.info("Clicking on Reference form received per reference Drop");
		
		switch(option) {
		case "Yes":
			logger.info("Clicking on Yes");
			waitForElement(reference_form_received_per_reference_Yes);
			clickWebElement(reference_form_received_per_reference_Yes);
			logger.info("Clicked on Yes");	
			break;
		case "No":
			logger.info("Clicking on No");
			waitForElement(reference_form_received_per_reference_No);
			clickWebElement(reference_form_received_per_reference_No);
			logger.info("Clicked on No");
			break;
		default:
			logger.info("Clicking on None");
			waitForElement(reference_form_received_per_reference_None);
			clickWebElement(reference_form_received_per_reference_None);
			logger.info("Clicked on None");
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
			waitForElement(standardsMetDoesNotMeet);
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
		while (isElementPresent(closeTabButtonBy)){
			clickWebElement(closeTabButton);
			waitForPageLoadTill(5);
		}
		logger.info("Close Licensing Activity Tab");
		waitForElement(licensingActivitiesTitle);
		logger.info("Successfully Close Licensing Activity Tab");
		
	}
}
