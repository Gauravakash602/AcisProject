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

public class CompleteFamilyNetworkDiagramPage extends PageBase{

	public CompleteFamilyNetworkDiagramPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(CompleteFamilyNetworkDiagramPage.class);
	
	
	@FindBy (xpath = "//*[text()='Complete Family Network Diagram']")
	WebElement completeFamilyNetworkDiagram;
	
	@FindBy (xpath = "//h1//*[text()='Complete Family Network Diagram']")
	WebElement completeFamilyNetworkDiagramVerify;
	
	
	
	
	@FindBy(xpath = "//*[text()='Standards']")
    WebElement 	standards;
	
	@FindBy(xpath = "//*[contains(text(),'The prospective foster parents provide a family network diagram for the household')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: To provide DCS a clear understanding of the household members and their relationships with any other individuals who may have contact with the foster child(ren)')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement 	taskOwner;

	
	
	@FindBy(xpath = "//*[contains(text(),'Please complete and upload a copy of the Family Network Diagram')]")
    WebElement 	instructions_Messgae;
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement instructionsCancelButton;	
	
	@FindBy(xpath = "//*[contains(text(),'The Family Network Diagram (FND) is a pictorial representation of a family’s connections to') and contains(text(),'their extended family, persons, and/or systems in their environment')]")
	WebElement instructions_HelpMessage;
	
	
	
	
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFilesButton;
	
	
	
	@FindBy (xpath = "//*[@title='Edit Family Network Diagram provided by home?']")
	WebElement familyNetworkDiagramprovidedbyhomePen;
	
	@FindBy (xpath = "//*[text()='Family Network Diagram provided by home?']/../../..//*[@autocomplete='off']")
	WebElement familyNetworkDiagramprovidedbyhomeDrop;
	
	@FindBy (xpath = "//*[text()='Family Network Diagram provided by home?']/../../..//*[text()='--None--']")
	WebElement dropDownNone;
	
	@FindBy (xpath = "//*[text()='Family Network Diagram provided by home?']/../../..//*[text()='Yes']")
	WebElement dropDownYes;
	
	@FindBy (xpath = "//*[text()='Family Network Diagram provided by home?']/../../..//*[text()='No']")
	WebElement dropDownNo;
	
	
	
	
	@FindBy(xpath = "//*[contains(@title,'Edit Standards Met')]")
    WebElement 	editStandardsMet;
	
	@FindBy(xpath = "//*[contains(text(),'Standards Met')]/..//input")
    WebElement 	standardsMet_Dropdown;
	
	@FindBy(xpath = "//*[text()='--None--']")
	WebElement standardsMet_None;
	
	@FindBy(xpath = "//*[@data-value='Meets']")
    WebElement 	standardsMet_Meets;
	
	@FindBy(xpath = "//*[@data-value='Has Concerns']")
    WebElement 	standardsMet_HasConcerns;
	
	@FindBy(xpath = "//*[@data-value='Does not Meet']")
    WebElement 	standardsMet_DoesNotMeet;
	
	
	
	@FindBy (xpath = "//*[@name='CancelEdit']")
	WebElement cancel;
	
	@FindBy (xpath = "//*[@name='SaveEdit']")
	WebElement save;
	
	
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "//*[text()='Task']/../../..//lightning-formatted-text")
	WebElement task_Value;
	

	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Complete Family Network Diagram']")
    WebElement closeTabButton;
	

	public By closeTabButtonBy = By.xpath("//button[@title='Close Complete Family Network Diagram']");
	
	
	/**
	 *  Click on Complete Family Network Diagram
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void completeFamilyNetworkDiagramTab() throws AcisException {
		logger.info("Clicking on Complete Family Network Diagram Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(5);
		waitForElement(completeFamilyNetworkDiagram);
		clickWebElemntUsingJavascriptExecutor(completeFamilyNetworkDiagram);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(completeFamilyNetworkDiagramVerify);
		logger.info("Clicked on Complete Family Network Diagram Tab");
	}
	
	
	
	 /**
	  * Verifying standards
	  * @author prateeksha.mahesh
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
	
	
	
	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 */
	
	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(standardsHelpButton);
		clickWebElement(instructionsHelpButton);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
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
	 * Click on Family Network Diagram provided by home?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void familyNetworkDiagramprovidedbyhome(String option) throws AcisException {
		waitForPageLoadTill(5);
		scrollingToElementofAPage(familyNetworkDiagramprovidedbyhomePen);
		clickWebElemntUsingJavascriptExecutor(familyNetworkDiagramprovidedbyhomePen);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(familyNetworkDiagramprovidedbyhomeDrop);
		
		if(option=="--None--")
		{
			logger.info("Clicking on --None--");
			clickWebElement(dropDownNone);
			waitForPageLoadTill(5);
			logger.info("Clicked on --None--");
		}
		
		else if(option=="Yes") {
			logger.info("Clicking on Yes");
			clickWebElement(dropDownYes);
			waitForPageLoadTill(5);
			logger.info("Clicked on Yes");
		}
		
		else {
			logger.info("Clicking on No");
			clickWebElement(dropDownNo);
			logger.info("Clicked on No");
		}
	}
	
	
	/**
	 * Standards Met 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void selectStandardsMetValue(String option) throws AcisException {
		logger.info("Selecting Value for : Standards Met??");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(editStandardsMet);
		clickWebElemntUsingJavascriptExecutor(editStandardsMet);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standardsMet_Dropdown);
		clickWebElemntUsingJavascriptExecutor(standardsMet_Dropdown);
		
		switch (option) {
		case "--None--":
			clickWebElement(standardsMet_None);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
		
		case "Meets":
			clickWebElement(standardsMet_Meets);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Has Concerns":
			clickWebElement(standardsMet_HasConcerns);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Does Not Meet":
			clickWebElement(standardsMet_DoesNotMeet);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;

		default:
			logger.info("No matching value found");
			break;
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		
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
	 *  Check Task Owner Value
	 * @author prateeksha.mahesh
	 */

	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	
	
	
	/**
	 * Check Task  Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Value: " + taskValue);
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

