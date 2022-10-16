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

public class CompletePreServiceTrainingPages extends PageBase {

	public CompletePreServiceTrainingPages() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(AccessToSafeWaterPage.class);
	
	
	@FindBy (xpath = "(//*[text()='Complete Pre-Service Training'])")
    WebElement completePreServiceTraining;
	
	@FindBy (xpath = "//h1//*[text()='Complete Pre-Service Training']")
	WebElement completePreServiceTrainingVerify;
	
	
	
	
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	@FindBy(xpath = "//*[contains(text(),'The prospective foster parents complete Resource and Adoptive Parent Trainings I, II, and III.')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: To ensure Foster Parents are properly trained before fostering children')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	
	
	
	@FindBy(xpath = "//*[contains(text(),'Indicate Resource and Adoptive Parent Training (RAPT) I, II, and III attendance') and contains(text(),'and upload training certification documentation')]")
    WebElement 	instructions_Messgae;
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement instructionsCancelButton;	
	
	@FindBy(xpath = "//*[contains(text(),'RAPT II is an online training course and the certificate must be uploaded by you.') and contains(text(),'Please upload RAPT I and III certificates if you have them as well')]")
	WebElement instructions_HelpMessage;
	


	    
	 @FindBy(xpath = "(//*[@placeholder='Select an Option'])[2]")
	 WebElement  trainingTypeDropdown;
	 
	 @FindBy(xpath = "//*[text()='RAPT I Certificate']")
	 WebElement rapt1certificate;
	 
	 @FindBy(xpath = "//*[text()='RAPT II Certificate']")
	 WebElement rapt2certificate ;
	 
	 @FindBy(xpath = "//*[text()='RAPT III Certificate']")
	 WebElement rapt3certificate;
	 
	 
	 
	 @FindBy(xpath = "//*[@title='Select a date']")
	 WebElement DateButton;
		
	 @FindBy(xpath = "(//*[@name='0'])[3]/../..//*[text()='4']")
	 WebElement selectDate;
	 
	 
	 
	 
	 @FindBy(xpath = "//button[@title='Edit Applicant(s) completed RAPT I, II & III?']")
	 WebElement editCompletedRapt;
		
	 @FindBy(xpath = "//*[contains(text(),'Applicant(s) completed RAPT I, II & III?')]/..//input")
	 WebElement dropdownCompletedRapt;
	 
	 @FindBy(xpath = "//*[contains(text(),'Applicant(s) completed RAPT I, II & III?')]/../../..//*[text()='Yes']")
		WebElement completedRaptYes;
	 
	 @FindBy(xpath = "//*[contains(text(),'Applicant(s) completed RAPT I, II & III?')]/../../..//*[text()='No']")
		WebElement completedRaptNo;
	 
	 @FindBy(xpath = "//*[contains(text(),'Applicant(s) completed RAPT I, II & III?')]/../../..//*[text()='--None--']")
		WebElement completedRaptNone;
	 
	 @FindBy (xpath ="(//*[@placeholder='Select an Option'])[1]")
		WebElement personHouseholdDropbox;

	 
		
		
		
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
	 
		@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
	    WebElement 	uploadFilesButton;
		
		@FindBy(xpath = "//button[contains(@title,'Close Complete Pre-Service Training')]")
		WebElement closeTabButton;
		
		public By closeTabButtonBy = By.xpath("//button[contains(@title,'Close Complete Pre-Service Training')]");
		
		@FindBy(xpath = "//h1[text()='Licensing Activities']")
	    WebElement 	licensingActivitiesTitle;
	 
	 /**
	  * Click  on complete Pre Service Training
	  * @author prateeksha.mahesh
	  * @throws AcisException 
	  * @throws AWTException 
	  * @throws InterruptedException 
	  */
	Actions act = new Actions(driver);
	public void completePreServiceTrainingTab() throws AcisException {
		logger.info("Clicking on Complete Pre Service Training Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(completePreServiceTraining);
		clickWebElemntUsingJavascriptExecutor(completePreServiceTraining);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(completePreServiceTrainingVerify);
		logger.info("Clicked on Complete Pre Service Training Tab");
	}

		
	/**
	 * Click  on upload file button and upload file
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicking on Page Down");
		clickWebElemntUsingJavascriptExecutor(uploadFilesButton);
		waitForPageLoadTill(5);
		clickWebElement(uploadFilesButton);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
		//	clickWebElement(doneButton);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
	}
		
	
	/**
	  * Check Standards Message
	  * @author prateeksha.mahesh
	  * @throws AcisException
	  */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
//			clickWebElement(taskOwner);
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			waitForPageLoadTill(5);
//			hoverOverElement(standardsHelpButton);
//			Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
		
	    
	 /**
	  * Check Instruction Message
	  * @author prateeksha.mahesh
	  * @throws AcisException 
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
		 * Select Value for : Training Type 
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */		
		 public void trainingType(String option) throws AcisException {
			waitForPageLoadTill(10);
			waitForPageLoad();
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			logger.info("clicking on training Type Dropdown");
			waitForElement(trainingTypeDropdown);
			clickWebElemntUsingJavascriptExecutor(trainingTypeDropdown);
			logger.info("clicked on training Type Dropdown");	 
		   switch (option) {
		       case "RAPT I Certificate":
		    	   logger.info("clicking on RAPT I Certificate");
		    	   waitForElement(rapt1certificate);
		    	   clickWebElement(rapt1certificate);
		    	   logger.info("clicking on RAPT I Certificate");
			   break;
		       case "RAPT II Certificate":
		    	   logger.info("clicking on RAPT II Certificate");
		    	   waitForElement(rapt2certificate);
		    	   clickWebElement(rapt2certificate);
		    	   logger.info("clicking on RAPT II Certificate");
			   break;
		      default:
		    	  logger.info("clicking on RAPT III Certificate");
		    	  waitForElement(rapt3certificate);
		    	  clickWebElement(rapt3certificate);
		    	  logger.info("clicking on RAPT III Certificate");
			  break;
		   } 
	     }		

		 
	 /**
	  * Select Value for : Date Attended 
	  *@author prateeksha.mahesh
	  * @throws AcisException 
	  */ 
	 public void selectDateAttendedValue() throws AcisException {
		logger.info("Selecting Value for : dateAttended");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(DateButton);
		clickWebElemntUsingJavascriptExecutor(DateButton);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(selectDate);
		waitForPageLoadTill(5);
		logger.info("Selected Value for : dateAttended");			
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
			waitForElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='"+person1+"']")));
			clickWebElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='"+person1+"']")));
			logger.info("Clicked on Person/Household" + name);	
		break;
		case "person2":
			logger.info("Clicking on Person/Household" + name);
			waitForElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='"+person2+"']")));
			clickWebElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../../..//*[text()='"+person2+"']")));
			logger.info("Clicked on Person/Household" + name);	
		}		
	}
	
		 
	 /**
	  * Select Value for : applicantCompletedRapt
	  * @author prateeksha.mahesh
	  * @throws AcisException 
	  */		
	public void applicantCompletedRapt(String option) throws AcisException, InterruptedException {
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		//scrollingToElementofAPage(editCompletedRapt);
		waitForElement(editCompletedRapt);
		clickWebElemntUsingJavascriptExecutor(editCompletedRapt);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(dropdownCompletedRapt);
				
	if(option=="--None--")
		{
		logger.info("Clicking on --None--");
		waitForElement(completedRaptNone);
		clickWebElemntUsingJavascriptExecutor(completedRaptNone);
	     waitForPageLoadTill(5);
	   	logger.info("Clicked on --None--");
	     }
	else if(option=="Yes") {
		logger.info("Clicking on Yes");
		waitForElement(completedRaptYes);
		clickWebElemntUsingJavascriptExecutor(completedRaptYes);
		waitForPageLoadTill(5);
		logger.info("Clicked on Yes");
		}
	else {
		logger.info("Clicking on No");
		waitForElement(completedRaptNo);
		clickWebElemntUsingJavascriptExecutor(completedRaptNo);
		waitForPageLoadTill(5);
		logger.info("Clicked on No");
		}
	}
	
			 
	 /**
	  * Select Value for :  confirm Standards Met
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
	 * Click save button
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
	 * Click cancel button
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
	 * Check Task  Value
	 * @author swati.malviya
	 */
	public void checkTaskValue(String taskValue) {
		act.sendKeys(Keys.PAGE_UP).build().perform();
		waitForPageLoadTill(5);
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
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
		while (isElementPresent(closeTabButtonBy)) {
			clickWebElement(closeTabButton);
			waitForPageLoadTill(5);
		}
		logger.info("Close Licensing Activity Tab");
		waitForElement(licensingActivitiesTitle);
		logger.info("Successfully Close Licensing Activity Tab");
		
	}
}
