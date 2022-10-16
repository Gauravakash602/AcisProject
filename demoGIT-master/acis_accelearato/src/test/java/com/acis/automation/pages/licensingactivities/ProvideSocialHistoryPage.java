package com.acis.automation.pages.licensingactivities;

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

public class ProvideSocialHistoryPage extends PageBase {

	public ProvideSocialHistoryPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(ProvideSocialHistoryPage.class);
	
	@FindBy (xpath = "//*[text()='Provide Social History']")
    WebElement provideSocialHistoryPage;
	
	@FindBy(xpath = "//h1//*[text()='Provide Social History']")
	WebElement provideSocialHistoryPageVerify;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy (xpath = "//*[contains(text(),'Please upload the completed Home Study assessment for the applicant(s) to review and sign.  Check the box when the proper Home Study documentation has been uploaded to let the applicant(s) know it is ready for review.')]")
	  WebElement instruction_text;
	    
	@FindBy (xpath = "//button[@title='Click for more information']")
	WebElement instructionsHelpButton;
	 
	@FindBy(xpath = "//*[contains(text(),'Help Text')]")
	 WebElement helpTextVerify;	
	 
	 
	 @FindBy (xpath = "//*[contains(text(),'The Structured Analysis Family Evaluation (SAFE) home study must be used by all DCS Regional Foster Care Specialists and LCPA licensing staff. Additional information regarding the SAFE home study may be found at ')]")
	    WebElement instructions_HelpMessage;
	 
	 @FindBy (xpath = "//button[text()='Cancel']")
	 WebElement instructionsCancelButton;
	 
	 @FindBy(xpath = "(//input[@placeholder='Select an Option'])[2]")
		WebElement documentTypedropdown;
	 
	 @FindBy(xpath = "//*[text()='Home Study']")
		WebElement homeStudy;
	 
	 @FindBy(xpath = "//*[text()='Select Files']")
	 WebElement selectFilesTitle;
		
		@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
		WebElement uploadFilesButton;
		
		@FindBy(xpath = "//button//span[text()='Done']")
		WebElement doneButton;
		
		@FindBy(xpath = "//*[text()='Submit Home Study to Applicant for Review']/..//span[1]")
		WebElement checkbox;
		
		 @FindBy(xpath = "(//input[@placeholder='Select an Option'])[4]")
		WebElement documentTypedropdown2;
		 
		@FindBy(xpath = "(//*[text()='Upload Files'])[2]")
		WebElement uploadFilesButton2;
			
		@FindBy(xpath = "//*[text()='Edit Date Applicant A Signed Home Study']")
		WebElement editDateApplicant_A_SignedHomeStudy;
		
		@FindBy(xpath = "//*[@title='Select a date']")
		WebElement dateButton;
		
		
		 @FindBy(xpath = "//*[@name='ACIS_Date_Applicant_A_Signed_Home_Study__c']/../..//*[text()='15']")
	        WebElement selectDate;
		
		@FindBy(xpath = "//button[@title='Edit Standards Met?']")
		WebElement editStandardMetButton;
		
		@FindBy(xpath = "(//*[@name='standardsMet'])[last()]")
		WebElement dropdownStandardMet;
		
		@FindBy(xpath = "//*[@name='standardsMet']/../../..//*[text()='--None--']")
		WebElement noneStandardsMet;
		
		@FindBy(xpath = "//*[text()='Meets']")
		WebElement meetsStandardsMet;
		
		@FindBy(xpath = "//*[text()='Has Concerns']")
		WebElement hasConcernStandardsMet;
		
		@FindBy(xpath = "//*[text()='Does not meet']")
		WebElement doesNotMeetStandardsMet;
		
		@FindBy(xpath = "//button[@name='SaveEdit']")
		WebElement saveButton;
		
		@FindBy(xpath = "//button[text()='Cancel']")
	    WebElement 	cancelButton;
		
		Actions act = new Actions(driver);
		

		/**
		 * Click  on provideSocialHistoryPage
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
		
		 public void provideSocialHistoryPageTab() throws AcisException {
		        logger.info("Clicking on provideSocialHistoryPageTab");
		        Actions act = new Actions(driver);
		        act.sendKeys(Keys.END).build().perform();
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        act.sendKeys(Keys.HOME).build().perform();
		        scrollingToElementofAPage(provideSocialHistoryPage);
		        waitForElement(provideSocialHistoryPage);
		        clickWebElemntUsingJavascriptExecutor(provideSocialHistoryPage);
		        driver.navigate().refresh();
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        waitForElement(provideSocialHistoryPageVerify);
		        logger.info("Clicked on provideSocialHistoryPageTab");
		    }
		 
		 /**
			 * Check Task Owner Value
			 * @author swati.malviya
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
		        logger.info("Check Task Value: " + taskValue);
		        Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText()
		                                    + "Expected Value: " + taskValue);
		        logger.info("Checked Task Value: " + taskValue);
		    }
		  
		  /**
			 * Check Instruction Message
			 * @author swati.malviya
			 * @throws AcisException 
			 */

		public void verifyInstructionsMessage() throws AcisException {
			logger.info("Checking Instructions Message");
			Assert.assertTrue(instruction_text.isDisplayed(), "Error: Mismatch in Instructions Messages");
			scrollingToElementofAPage(instructionsHelpButton);
			clickWebElemntUsingJavascriptExecutor(instructionsHelpButton);
			waitForElement(helpTextVerify);
			waitForPageLoadTill(10);
			Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
			clickWebElement(instructionsCancelButton);
			logger.info("Checked Instructions Message");
		}
		
		/**
		 * Select Value for : DocumentType 
		 * @author swati.malviya
		 * @throws AcisException 
		 */
			
			public void DocumentType(String option) throws AcisException {
				logger.info("clicking on documentTypedropdown:"+option );
				waitForPageLoad();
				act.sendKeys(Keys.PAGE_DOWN).build().perform();
		        waitForPageLoadTill(5);
		        waitForPageLoad();
				waitForElement(documentTypedropdown);
				clickWebElement(documentTypedropdown);
				logger.info("clicked on documentTypedropdown:"+option );
				waitForElement(homeStudy);
				clickWebElement(homeStudy);
				logger.info("clicked on homeStudy:"+option);
			}
			
			/**
			 * Click  on first upload file button and upload file
			 * @author swati.malviya
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
				 * Click checkbox
				 * @author swati.malviya
				 * @throws AcisException 
				 */
				
				public void checkbox() throws AcisException {
					logger.info("Clicking on checkbox");
					waitForPageLoadTill(5);
					scrollingToElementofAPage(checkbox);
					clickWebElemntUsingJavascriptExecutor(checkbox);
			    	waitForPageLoadTill(15);
					logger.info("Clicked on checkbox");
					waitForPageLoadTill(5);
			        waitForPageLoad();
			        refreshPage();
			        waitForPageLoadTill(10);
			        waitForPageLoad();
				}
			 /**
				 * Select Value for : DocumentType2 
				 * @author swati.malviya
				 * @throws AcisException 
				 */
					
					public void DocumentType2(String option) throws AcisException {
						logger.info("clicking on documentTypedropdown2:"+option );
						waitForPageLoad();
						act.sendKeys(Keys.PAGE_DOWN).build().perform();
				        waitForPageLoadTill(5);
				        waitForPageLoad();
						waitForElement(documentTypedropdown2);
						clickWebElement(documentTypedropdown2);
						logger.info("clicked on documentTypedropdown2:"+option );
						waitForElement(homeStudy);
						clickWebElement(homeStudy);
						logger.info("clicked on homeStudy:"+option);
					}
					
					/**
					 * Click  on second upload file button and upload file
					 * @author swati.malviya
					 * @throws AcisException 
					 * @throws AWTException 
					 * @throws InterruptedException 
					 * 
					 */
					
					
					
					 
					 public void clickAddFilesAndUpload2(String filepath) throws AcisException, InterruptedException, AWTException {
							
							driver.navigate().refresh();
							waitForPageLoadTill(10);
							waitForPageLoad();
							Actions act = new Actions(driver);
							act.sendKeys(Keys.PAGE_DOWN).build().perform();
							waitForPageLoad();
							act.sendKeys(Keys.PAGE_DOWN).build().perform();
							logger.info("Clicking on Page Down");
							waitForElement(uploadFilesButton2);
							waitForPageLoadTill(5);
							clickWebElement(uploadFilesButton2);
							logger.info("Clicked on Upload Button2");
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
						 * Enter value for Date
						 * @author swati.malviya
						 * @throws AcisException 
						 */
						
						public void EnterDate() throws AcisException {
							logger.info("clicking on editDateApplicant_A_SignedHomeStudy");
							waitForPageLoadTill(5);
							scrollingToElementofAPage(editDateApplicant_A_SignedHomeStudy);
							clickWebElemntUsingJavascriptExecutor(editDateApplicant_A_SignedHomeStudy);
							waitForPageLoadTill(5);
							clickWebElemntUsingJavascriptExecutor(dateButton);
							waitForPageLoadTill(5);
							clickWebElemntUsingJavascriptExecutor(selectDate);
							logger.info("selected a Date");
							}
						
						
						
						/**
						 * Select Value for : Standards Met?
						 * @author swati.malviya
						 * @throws AcisException 
						 */
						
						public void selectStandardsMet(String option) throws AcisException {
							logger.info("Selecting StandardsMet option:"+option);
							waitForPageLoad();
							scrollingToElementofAPage(editStandardMetButton);
							waitForElement(editStandardMetButton);
							clickWebElemntUsingJavascriptExecutor(editStandardMetButton);
							waitForPageLoadTill(5);
							clickWebElemntUsingJavascriptExecutor(dropdownStandardMet);
							switch (option) {
							case "Meets":
								waitForElement(meetsStandardsMet);
								clickWebElement(meetsStandardsMet);
								break;
							case "Has Concerns":
								waitForElement(hasConcernStandardsMet);
								clickWebElement(hasConcernStandardsMet);
								break;
							case "Does not Meet":
								waitForElement(doesNotMeetStandardsMet);
								clickWebElement(doesNotMeetStandardsMet);
								break;
							default:
								break;
							}
							logger.info("Selected StandardsMet option:"+option);
						
						
						}
						/**
						 * Click save button
						 * @author swati.malviya
						 * @throws AcisException 
						 */
						
						public void clickSaveButton() throws AcisException {
							logger.info("Clicking on save button");
							waitForPageLoadTill(5);
							clickWebElemntUsingJavascriptExecutor(saveButton);
					    	waitForPageLoadTill(15);
							logger.info("Clicked on save button");
						}
					
						/**
						 * Click cancel button
						 * @author swati.malviya
						 * @throws AcisException 
						 */
						public void clickCancelButton() throws AcisException {
							logger.info("Clicking on cancel button");
							waitForPageLoadTill(5);
							clickWebElemntUsingJavascriptExecutor(cancelButton);
							waitForPageLoadTill(5);
							logger.info("Clicked on cancel button");
						}

}
			
