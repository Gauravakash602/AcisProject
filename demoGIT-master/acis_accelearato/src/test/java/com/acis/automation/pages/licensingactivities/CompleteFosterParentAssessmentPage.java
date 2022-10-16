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

public class CompleteFosterParentAssessmentPage  extends PageBase{

	public CompleteFosterParentAssessmentPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Logger logger = LoggerFactory.getLogger(CompleteCriminalHistoryBackgroundCheckFormPage.class);
	
	
	
	@FindBy(xpath = "//*[text()='Complete Foster Parent Assessment']")
	WebElement completeFosterParentAssessment;
	
	@FindBy(xpath = "//h1//*[text()='Complete Foster Parent Assessment']")
	WebElement completeFosterParentAssessmentVerify;
	
	
	
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Details'])[2]")
    WebElement detailsVerify;
	
	@FindBy (xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	
	
	
	@FindBy (xpath = "//*[contains(text(),'Prospective foster parents must complete the compatibility inventory.')]")
	WebElement standardMessage;
	
	@FindBy (xpath = "(//span[text()='Help']/../..//button)[1]")
	WebElement standardHelpButton;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: The SAFE Compatibility Investory  helps placement workers  determine how appropriate a fit is between an applicant family and a child.')]")
	WebElement standardHelpMessage;
	
	
	
	
	@FindBy (xpath = "//*[contains(text(),'Please complete and upload a copy of the required SAFE ') and contains(text(),'Compatibility Inventory.  You may also upload a copy of the Child ') and contains(text(),'Behavioral / Health Challenges form (SF 53199) if applicable.')]")
	WebElement instructionUploadMessage;
	
	  
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[1]")
	WebElement person;
	
	
	 
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]")
	WebElement documantTypeDrop;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../..//*[text()='Child Behavioral / Health Challenges (SF 53199)']")
	WebElement drop1;
	
	@FindBy (xpath = "(//*[@class='slds-truncate']/..//span)[4]")
	WebElement drop2;
	
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	
	
	
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
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Complete Foster Parent Assessment']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Complete Foster Parent Assessment']");
	
	/**
	 * Click on Complete Foster Parent Assessment Tab
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	Actions act = new Actions(driver);
	
	public void clickCompleteFosterParentAssessmentTab() throws AcisException {
		logger.info("Clicking on Complete Foster Parent Assessment Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(completeFosterParentAssessment);
		clickWebElement(completeFosterParentAssessment);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(completeFosterParentAssessmentVerify);
		logger.info("Clicked on Complete Foster Parent Assessment Tab");
	}
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void checkTaskValue(String taskValue) throws AcisException {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Value: " + taskValue);
	}
	
	
	
	
	
	/**
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void checkTaskOwnerValue(String taskValue) throws AcisException {
		clickWebElement(detailsVerify);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		logger.info("Check Task Owner Value: " + taskValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskValue), "Error: Task Owner Value does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	
	 /**
	  * Verifying standards
	  * @author prateeksha.mahesh
	  * @throws AcisException
     */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		Assert.assertTrue(standardMessage.isDisplayed(), "Error: Mismatch in standards Messages");
		clickWebElement(standardHelpButton);
		Assert.assertTrue(standardHelpMessage.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
	
	
	
	/** Verifying Instructions - upload Documentation
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */
	public void verifyuploadDocumentationInstruction() throws AcisException {
		logger.info("Checking Instructions Message");
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Assert.assertTrue(instructionUploadMessage.isDisplayed(), "Error: Mismatch in Instructions Messages");
		logger.info("Checked Instructions Message");
	}
	
	
	
	/**
	 * Click on Person/Household
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void clickOnPerson(String dropDownOption, String personName, String personNameHome) throws AcisException {
		logger.info("Selecting Person/Household");
		waitForElement(person);
		clickWebElemntUsingJavascriptExecutor(person);
		switch(dropDownOption) {
		case "Person Name":
			logger.info("Selecting " + dropDownOption);
			waitForElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../..//*[text()='"+personName+"']")));
			clickWebElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../..//*[text()='"+personName+"']")));
			logger.info("Selected " + dropDownOption);
		break;
		case "Person Name Home":
			logger.info("Selecting " + dropDownOption);
			waitForElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../..//*[text()='"+personNameHome+"']")));
			clickWebElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../..//*[text()='"+personNameHome+"']")));
			logger.info("Selected " + dropDownOption);
		break;
		default:
		break;
		}	
		logger.info("Selected Person/Household");
	}
	
	
	
	/**
	 * Selecting Document Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void documentType(String option) throws AcisException {
		logger.info("Selecting Document Type");
		waitForElement(documantTypeDrop);
		//scrollingToElementofAPage(documantTypeDrop);
		clickWebElemntUsingJavascriptExecutor(documantTypeDrop);
		switch(option) {
		case "Child Behavioral / Health Challenges (SF 53199)":
			logger.info("Selecting Child Behavioral / Health Challenges (SF 53199)");
			waitForElement(drop1);
			clickWebElement(drop1);
			logger.info("Selected Child Behavioral / Health Challenges (SF 53199)");
		break;
		case "SAFE Compatibility Inventory":
			logger.info("Selecting SAFE Compatibility Inventory");
			waitForElement(drop2);
			clickWebElement(drop2);
			logger.info("Selected SAFE Compatibility Inventory");
		break;	
		default:
		break;
		}
		logger.info("Selected Document Type");
	}
	
	
	
	/** Click on upload file button and upload file for Upload Documentation Feild
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload1(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(uploadFilesButton);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
	}
	

	
	
	/**
	 * Select Value for : Standards Met?
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
