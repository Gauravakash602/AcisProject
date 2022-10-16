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

public class AgreetoResourceParentRolesandResponsibilitiesPage extends PageBase {

	public AgreetoResourceParentRolesandResponsibilitiesPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(AgreetoResourceParentRolesandResponsibilitiesPage.class);
	
	
	@FindBy (xpath = "//*[text()='Agree to Resource Parent Roles and Responsibilities']")
	WebElement agreetoResourceParentRolesandResponsibilities;
	
	@FindBy (xpath = "//h1//*[text()='Agree to Resource Parent Roles and Responsibilities']")
	WebElement agreetoResourceParentRolesandResponsibilitiesVerify;

	
	
	
	@FindBy(xpath = "//*[text()='Standards']")
    WebElement 	standards;
	
	@FindBy(xpath = "//*[contains(text(),'Resource Parents must agree to fulfill the Roles and Responsibilities outlined for Foster Parents in Indiana State Law, Regulations, and Department of Child Services Policy')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: DCS will not license any individual as a Foster Parent without agreement to comply with State Laws, Regulations, and DCS Policy governing Foster Care')]")
    WebElement 	standards_HelpMessgae;
	
	
	
	

	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy(xpath = "//*[contains(text(),'Please complete and upload a copy of the Resource Parent Role Acknowledgement (SF 54642)')]")
    WebElement 	instructions_Messgae;
	
	@FindBy (xpath = "//*[contains(text(),'This form is to be completed by prospective foster parents prior to receiving placement')]")
	WebElement instructions_HelpMessage;
	

	
	
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFilesButton;
	
	
	
	
	
	@FindBy (xpath = "//button[@title='Edit Applicant A acknowledges their role?']")
	WebElement applicantAAcknowledgesTheirRolePen;
	
	@FindBy (xpath = "//*[text()='Applicant A acknowledges their role?']/../../..//*[@autocomplete='off']")
	WebElement applicantAAcknowledgesTheirRoleDrop;
	
	@FindBy (xpath = "//*[text()='Applicant A acknowledges their role?']/../../..//*[text()='--None--']")
	WebElement dropBoxNone;
	
	@FindBy (xpath = "//*[text()='Applicant A acknowledges their role?']/../../..//*[text()='Yes']")
	WebElement dropBoxYes;
	
	@FindBy (xpath = "//*[text()='Applicant A acknowledges their role?']/../../..//*[text()='No']")
	WebElement dropBoxNo;
	

	
	
	@FindBy(xpath = "//*[contains(text(),'Edit Applicant A signature date')]")
    WebElement 	editApplicantA;
	
	@FindBy(xpath = "//*[contains(text(),'Applicant A signature date')]/..//input")
    WebElement 	applicantA_Dropdwon;
	
	@FindBy(xpath = "//*[contains(text(),'Applicant A signature date')]/..//*[text()='15']")
    WebElement 	applicantA_date;
	
	
	
	@FindBy (xpath = "//*[contains(text(),'Pass Threshold: Each applicant agrees to fulfill')]")
	WebElement standardsMetIcon;
	
	@FindBy (xpath = "//button[@title='Edit Standards Met?']")
	WebElement standardsMetPen;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[@name='standardsMet']")
	WebElement standardsMetDropBox;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='--None--']")
	WebElement standardMetNone;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Meets']")
	WebElement standardMetMeets;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Has Concerns']")
	WebElement standardMetHasConcerns;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Does not meet']")
	WebElement standardMetDoesNotMeet;
	
	
	
	@FindBy (xpath = "//*[@name='CancelEdit']")
	WebElement cancel;
	
	@FindBy (xpath = "//*[@name='SaveEdit']")
	WebElement save;
	
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;

	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Agree to Resource Parent Roles and Responsibilities']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Agree to Resource Parent Roles and Responsibilities']");
	
	/**
	 *  Click on Agree to Resource Parent Roles and Responsibilities
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void agreetoResourceParentRolesandResponsibilitiesTab() throws AcisException {
		logger.info("Clicking on Agree to Resource Parent Roles and Responsibilities Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(agreetoResourceParentRolesandResponsibilities);
		clickWebElement(agreetoResourceParentRolesandResponsibilities);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(agreetoResourceParentRolesandResponsibilitiesVerify);
		logger.info("Clicked on Agree to Resource Parent Roles and Responsibilities Tab");
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
//		clickWebElement(standardsHelpButton);
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
		 *  Click on Applicant A acknowledges their role?
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */

	public void applicant_A_AcknowledgesTheirRole(String option) throws AcisException {
		waitForPageLoadTill(5);
		waitForElement(applicantAAcknowledgesTheirRolePen);
		clickWebElemntUsingJavascriptExecutor(applicantAAcknowledgesTheirRolePen);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(applicantAAcknowledgesTheirRoleDrop);
		
		if(option=="--None--")
		{
			logger.info("Clicking on --None--");
			clickWebElement(dropBoxNone);
			waitForPageLoadTill(5);
			logger.info("Clicked on --None--");
		}
		
		else if(option=="Yes") {
			logger.info("Clicking on Yes");
			clickWebElement(dropBoxYes);
			waitForPageLoadTill(5);
			logger.info("Clicked on Yes");
		}
		
		else {
			logger.info("Clicking on No");
			clickWebElement(dropBoxNo);
			logger.info("Clicked on No");
		}
	}
	

	
	/**
	 * Click on Applicant A signature date
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

	public void selectApplicantAValue() throws AcisException {
		logger.info("Selecting Value for : Applicant A signature date");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(editApplicantA);
		clickWebElemntUsingJavascriptExecutor(editApplicantA);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(applicantA_Dropdwon);
		clickWebElemntUsingJavascriptExecutor(applicantA_Dropdwon);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(applicantA_date);
		logger.info("Selected Value for : Applicant A signature date");
		
	}
	
	
	/**
	 * Standards Met 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void selectStandardsMetValue(String option) throws AcisException {
		logger.info("Selecting Value for : Standards Met??");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standardsMetPen);
		clickWebElemntUsingJavascriptExecutor(standardsMetPen);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standardsMetDropBox);
		clickWebElemntUsingJavascriptExecutor(standardsMetDropBox);
		
		switch (option) {
		case "--None--":
			clickWebElement(standardMetNone);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
		
		case "Meets":
			clickWebElement(standardMetMeets);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Has Concerns":
			clickWebElement(standardMetHasConcerns);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Does Not Meet":
			clickWebElement(standardMetDoesNotMeet);
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
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
		waitForPageLoadTill(5);
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	/**
	 * Check Task Owner Value
	 * @@author prateeksha.mahesh
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
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
	

	
	

	

