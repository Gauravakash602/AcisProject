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

public class ProveFinancialStabilityPage extends PageBase {

	public ProveFinancialStabilityPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
              
	final static Logger logger = LoggerFactory.getLogger(ProveFinancialStabilityPage.class);
	
	@FindBy (xpath = "//*[text()='Prove Financial Stability']")
	WebElement proveFinancialStability;
	
	@FindBy (xpath = "//*[contains(text(),'Licensed Foster Homes must have sufficient income and appropriate fiscal management to maintain its stability and security without a foster care payment')]")
	WebElement standards;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: Foster care payments received on behalf of the child are intended for the sole benefit and care of the child while in foster care')]")
	WebElement reason;
	
	@FindBy (xpath = "//*[contains(text(),'Please complete and upload a copy of the Financial Verification for Foster Family Homes (SF 55734) and any supporting documentation required by the verification form')]")
	WebElement instructionstext;
	
	@FindBy (xpath = "//button[@title='Click for more information']")
	WebElement instructionsIcon;
	
	@FindBy (xpath = "//*[@placeholder='Select an Option']")
	WebElement personHouseholdDropbox;
	
	@FindBy (xpath = "//*[@placeholder='Select an Option']/../../..//*[text()='TwjJ  hfaD Home']")
	WebElement personHouseholdTwjJhfaDHome;
	
	
	@FindBy (xpath = "//*[@placeholder='Select an Option']/../../..//*[text()='TwjJ hfaD']")
	WebElement personHouseholdTwjJhfaD;
	
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]")
	WebElement documentTypeDropBox;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Financial Verification for Foster Family Homes (SF 55734)']")
	WebElement dropBox1;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Financial Verification Document']")
	WebElement dropbox2;
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFilesButton;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]")
	WebElement allNecessaryDocumentationUploaded;  
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]/../../..//*[text()='Yes']")
	WebElement uploadedYes;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[3]/../../..//*[text()='No']")
	WebElement uploadedNo;
	
	
	@FindBy (xpath = "//button[@title='Edit Total Monthly Take Home Income']")
	WebElement totalMonthlyTakeHomeIncomePen;
	
	@FindBy (xpath = "//*[@name='ACIS_Total_Monthly_Take_Home_Income__c']")
	WebElement totalMonthlyTakeHomeIncomeDrop;
	
	@FindBy (xpath = "//button[@title='Edit Total Monthly Household Expenses']")
	WebElement totalMonthlyHouseholdExpensesPen;
	
	@FindBy (xpath = "//*[@name='ACIS_Total_Monthly_Household_Expenses__c']")
	WebElement totalMonthlyHouseholdExpensesDrop;
	
	
	@FindBy (xpath ="//*[text()='Monthly income covers expenses/debts?']/..//button")
	WebElement monthlyIncomeCoversExpensesDebtsEdit;
	
	@FindBy (xpath = "//*[text()='Monthly income covers expenses/debts?']/..//input")
	WebElement monthlyIncomeCoversExpensesDebtsDrop;
	
	@FindBy (xpath = "//*[text()='Total Monthly Take Home Income']/..//input")
	WebElement monthlyIncome;
	
	@FindBy (xpath = "//*[text()='Total Monthly Household Expenses']/..//input")
	WebElement monthlyExpense;
	
	@FindBy (xpath = "//*[text()='Monthly income covers expenses/debts?']/../../..//*[text()='--None--']")
	WebElement dropdownNone;
	
	@FindBy (xpath = "//*[text()='Monthly income covers expenses/debts?']/../../..//*[text()='Yes']")
	WebElement dropdownYes;
	
	@FindBy (xpath = "//*[text()='Monthly income covers expenses/debts?']/../../..//*[text()='No']")
	WebElement dropdownNo;
	
	
	
	@FindBy (xpath = "//button[@title='Edit Applicant A signature date']")
	WebElement applicantASignatureDatePen;
	
	@FindBy (xpath = "//*[@name='ACIS_Applicant_A_signature_date__c']")
	WebElement applicantASignatureDateDropbox;

	@FindBy (xpath = "//*[@name='ACIS_Applicant_A_signature_date__c']/../..//*[text()='15']")
	WebElement applicantASignatureDate;
	
	
	
	@FindBy (xpath = "//*[@name='ACIS_Applicant_B_signature_date__c']")
	WebElement applicantBSignatureDateDropbox;

	@FindBy (xpath = "//*[@name='ACIS_Applicant_B_signature_date__c']/../..//*[text()='15']")
	WebElement applicantBSignatureDate;
	
	
	
	@FindBy (xpath = "//*[contains(text(),'Pass Threshold: Completed Financial Verification for Foster Family Home (SF55734) confirming monthly income covers monthly expenses, signed by Applicant(s) and uploaded via licensing activity')]")
	WebElement standardsMetIcon;
	
	@FindBy (xpath = "//button[@title='Edit Standards Met?']")
	WebElement standardsMetPen;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[@placeholder='Select an Option']")
	WebElement standardsMetDrop;

	
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
	
	@FindBy(xpath = "//h1//*[text()='Prove Financial Stability']")
	WebElement proveFinancialStabilityVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//button[text()='Edit']")
	WebElement editButton;
	
	
	@FindBy(xpath = "//*[contains(text(),'Licensed Foster Homes must have sufficient income and appropriate fiscal management to maintain its stability and security without a foster care payment.')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: Foster care payments received on behalf of the child are intended for the sole benefit and care of the child while in foster care.')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;	
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy(xpath = "//*[contains(text(),'Please complete and upload a copy of the Financial Verification for Foster Family Homes (SF 55734) and any supporting documentation required by the verification form.')]")
    WebElement 	instructions_Messgae;
	
	@FindBy (xpath = "//*[contains(text(),'Income and expense information should be verified with appropriate documentation including, but not limited to: pay check stubs, tax forms, and monthly utility or other account statements. Required items needing verification are indicated on the form.')]")
	WebElement instructions_HelpMessage;
	
	@FindBy(xpath = "//*[contains(text(),'Help Text')]")
    WebElement helpTextVerify;	
	
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Prove Financial Stability']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Prove Financial Stability']");
	
	
	/**
	 * Edit Standards Met
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void editStandards() throws AcisException {
		logger.info("Clicking on Edit Button");
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(editButton);
		clickWebElement(editButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Edit");
	}
	
	
	/**
	 * Enter Income and Expenses
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void enterIncome(String option,String strText) throws AcisException {
		switch (option) {
		case "Income":
			waitForPageLoadTill(5);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			logger.info("Entering Monthly Income");
			waitForPageLoadTill(5);
			enterText(monthlyIncome, strText);
			logger.info("Entered Monthly Income");
			break;
		case "Expenses":
			waitForPageLoadTill(5);
			logger.info("Entering Monthly Expenses");
			enterText(monthlyExpense, strText);
			logger.info("Entered Monthly Expenses");
			break;
		default:
			break;
		}
	}
	
	/**
	 * Verifying standards
	 * @author prateeksha.mahesh
	 */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		waitForPageLoadTill(5);
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		waitForPageLoadTill(5);
		clickWebElement(standardsHelpButton);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
}

	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(instructionsHelpButton);
//		clickWebElement(instructionsHelpButton);
//		waitForElement(helpTextVerify);
//		waitForPageLoadTill(10);
//		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
//		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
	}
	
	
	/**
	 * Check Task  Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskValue(String taskValue) {
		waitForPageLoadTill(5);
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	
	/**
	 * Click on Prove Financial Stability Tab 
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	
	public void clickLicenseActivitiesTab() throws AcisException {
		logger.info("Clicking on Prove Financial Stability Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(proveFinancialStability);
		clickWebElement(proveFinancialStability);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(proveFinancialStabilityVerify);
		logger.info("Clicked on Prove Financial Stability Tab");

	}
	
	
	
	/**
	 *  Click on Prove Financial Stability
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void licensingActivityName() throws AcisException {
		logger.info("Clicking on Prove Financial Stability");
		waitForElement(proveFinancialStability);
		clickWebElement(proveFinancialStability);
		waitForPageLoadTill(5);
		logger.info("Clicked on Prove Financial Stability");
	}
	
	
	
	 /**
	  * Verifying standards
	  * @author prateeksha.mahesh
      */
	
	public void standards() {
		logger.info("Varifying the Standards");
		Assert.assertTrue(standards.isDisplayed(), "Error : Standard Message is not displayed Properly");
		Assert.assertTrue(reason.isDisplayed(), "Error : Reason Message is not displayed Properly");
		logger.info("Varified the Standards");
}
	

	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 */
	
	public void instructions() {
		logger.info("Varifying the Instructions");
		Assert.assertTrue(instructionstext.isDisplayed(), "Error : Instruction Message is not displayed Properly");
		Assert.assertTrue(instructionsIcon.isDisplayed(), "Error : Click here for more information - Message is not displayed Properly");
		logger.info("Varified the Instructions");
}
	
	
	/**
	 * Click on Person/Household
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

	public void personHousehold(String name, String person1, String person2) throws AcisException {
		
		logger.info("Clicking on Person/Household DropBox");
		waitForElement(personHouseholdDropbox);
		clickWebElement(personHouseholdDropbox);
		logger.info("Clicked on Person/Household DropBox");
		
		switch(name){
		case "person1":
			logger.info("Clicking on Person/Household" + name);
			waitForElement(driver.findElement(By.xpath("//*[@placeholder='Select an Option']/../../..//*[text()='"+person1+"']")));
			clickWebElement(driver.findElement(By.xpath("//*[@placeholder='Select an Option']/../../..//*[text()='"+person1+"']")));
			logger.info("Clicked on Person/Household" + name);	
		break;
		case "person2":
			logger.info("Clicking on Person/Household" + name);
			waitForElement(driver.findElement(By.xpath("//*[@placeholder='Select an Option']/../../..//*[text()='"+person2+"']")));
			clickWebElement(driver.findElement(By.xpath("//*[@placeholder='Select an Option']/../../..//*[text()='"+person2+"']")));
			logger.info("Clicked on Person/Household" + name);	
		}
	
	}
	
	
	/**
	 * Click on Document Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

      public void documentType(String document) throws AcisException {
    	Actions act = new Actions(driver);
  		act.sendKeys(Keys.PAGE_DOWN).build().perform();
    	waitForPageLoadTill(10);
  		waitForPageLoad();
		logger.info("Clicking on Document Type DropBox");
		waitForElement(documentTypeDropBox);
		clickWebElement(documentTypeDropBox);;
		logger.info("Clicked on Document Type DropBox");
		
		if(document== "Financial Verification for Foster Family Homes (SF 55734)")
		{
			logger.info("Clicking on Financial Verification for Foster Family Homes (SF 55734)");
			waitForElement(dropBox1);
			clickWebElement(dropBox1);
			logger.info("Clicked on Financial Verification for Foster Family Homes (SF 55734)");	
	}
		else {
			logger.info("Clicking on Financial Verification Document");
			waitForElement(dropbox2);
			clickWebElement(dropbox2);
			logger.info("Clicked on Financial Verification Document");	
		}
	
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
		driver.navigate().refresh();
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
	 
	
	
	/**
	 * Click on All necessary documentation uploaded?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

	public void  necessaryDocumentation(String option) throws AcisException { 
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		logger.info("Clicking on All necessary documentation uploaded?");
		waitForElement(allNecessaryDocumentationUploaded);
		clickWebElement(allNecessaryDocumentationUploaded);
		logger.info("Clicked on All necessary documentation uploaded?");
		
		if(option == "Yes") {
			logger.info("Clicking on Yes");
			waitForElement(uploadedYes);
			clickWebElement(uploadedYes);
			logger.info("Clicked on Yes");
		}
		
		else {
			logger.info("Clicking on No");
			waitForElement(uploadedNo);
			clickWebElement(uploadedNo);
			logger.info("Clicked on NO");
		}
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		
	}
		
		
	
	/**
	 * Click on Monthly income covers expenses/debts?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void monthlyIncomeCoversExpensesdebts(String month) throws AcisException {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		logger.info("Clicking on Monthly income covers expenses/debts?");
		waitForElement(monthlyIncomeCoversExpensesDebtsEdit);
		clickWebElemntUsingJavascriptExecutor(monthlyIncomeCoversExpensesDebtsEdit);
		waitForElement(monthlyIncomeCoversExpensesDebtsDrop);
		clickWebElemntUsingJavascriptExecutor(monthlyIncomeCoversExpensesDebtsDrop);
		
		if(month == "--None--") {
			logger.info("Clicking on --None--");
			waitForElement(dropdownNone);
			clickWebElemntUsingJavascriptExecutor(dropdownNone);
			logger.info("Clicked on --None--");
		}
		
		else if(month == "Yes") {
			logger.info("Clicking on Yes");
			waitForElement(dropdownYes);
			clickWebElemntUsingJavascriptExecutor(dropdownYes);
			logger.info("Clicked on No");
		}
		
		else {
			logger.info("Clicking on No");
			waitForElement(dropdownNo);
			clickWebElemntUsingJavascriptExecutor(dropdownNo);
			logger.info("Clicked on NO");
		}
		logger.info("Selected - Monthly income covers expenses/debts?");
	}
	
	
	/**
	 * Click on Applicant 1 signature date
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void applicant1SignatureDate() throws AcisException {
		logger.info("Clicking on Applicant 1 signature date Dropbox");
		waitForElement(applicantASignatureDateDropbox);
		clickWebElemntUsingJavascriptExecutor(applicantASignatureDateDropbox);
		logger.info("Clicked on Applicant 1 signature date Dropbox");
		
		logger.info("Clicking on Applicant 1 signature date");
		waitForElement(applicantASignatureDate);
		clickWebElemntUsingJavascriptExecutor(applicantASignatureDate);
		logger.info("Clicked on Applicant 1 signature date");
	}
	
	
	/**
	 * Click on Applicant 2 signature date
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void applicant2SignatureDate() throws AcisException {
		logger.info("Clicking on Applicant 2 signature date Dropbox");
		waitForElement(applicantBSignatureDateDropbox);
		clickWebElemntUsingJavascriptExecutor(applicantBSignatureDateDropbox);
		logger.info("Clicked on Applicant 2 signature date Dropbox");
		
		logger.info("Clicking on Applicant 2 signature date");
		waitForElement(applicantBSignatureDate);
		clickWebElemntUsingJavascriptExecutor(applicantBSignatureDate);
		logger.info("Clicked on Applicant 2 signature date");
	}
	
	
	/**
	 * Standards Met 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

public void standardsMet(String standard_option) throws AcisException {
		
		logger.info("Clicking on Standards Met Pencil");
		waitForElement(standardsMetPen);
		clickWebElemntUsingJavascriptExecutor(standardsMetPen);
		logger.info("Clicked on Standards Met Pencil");
		
		logger.info("Clicking on Standards Met Drop Box");
		waitForElement(standardsMetDrop);
		clickWebElemntUsingJavascriptExecutor(standardsMetDrop);
		logger.info("Clicked on Standards Met Drop Box");
		
		if(standard_option=="None") {
			logger.info("Clicking on Standards Met --None--");
			waitForElement(standardMetNone);
			clickWebElemntUsingJavascriptExecutor(standardMetNone);
			logger.info("Clicked on Standards Met --None--");
		}
		
		else if(standard_option=="Meets") {
			logger.info("Clicking on Standards Met Meets");
			waitForElement(standardMetMeets);
			clickWebElemntUsingJavascriptExecutor(standardMetMeets);
			logger.info("Clicked on Standards Met Meets");
		}
		
		else if(standard_option=="Has Concerns") {
			logger.info("Clicking on Standards Met Has Concerns");
			waitForElement(standardMetHasConcerns);
			clickWebElemntUsingJavascriptExecutor(standardMetHasConcerns);
			logger.info("Clicked on Standards Met Has Concerns");
		}
		
		else {
			logger.info("Clicking on Standards Met Does not meet");
			waitForElement(standardMetDoesNotMeet);
			clickWebElemntUsingJavascriptExecutor(standardMetDoesNotMeet);
			logger.info("Clicked on Standards Met Does not meet");
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
	
  public void cancelButton() throws AcisException {
	logger.info("Clicking on Cancel");
	waitForElement(cancel);
	clickWebElement(cancel);
	logger.info("Clicked on Cancel");
}
  

   /**
	 * Click On Save Button 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

  public void saveButton() throws AcisException {
	logger.info("Clicking on Save");
	waitForElement(save);
	clickWebElement(save);
	waitForPageLoad();
	waitForPageLoadTill(5);
	refreshPage();
	waitForPageLoadTill(10);
	waitForPageLoad();
	logger.info("Clicked on Save");
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
