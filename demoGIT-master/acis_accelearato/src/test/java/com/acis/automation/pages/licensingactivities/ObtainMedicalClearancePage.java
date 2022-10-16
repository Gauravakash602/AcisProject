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

public class ObtainMedicalClearancePage extends PageBase{

	public ObtainMedicalClearancePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(ProvideSocialHistoryPage.class);
	
	@FindBy (xpath = "//*[text()='Obtain Medical Clearance']")
    WebElement obtainMedicalClearancePage;
	
	@FindBy(xpath = "//h1//*[text()='Obtain Medical Clearance']")
	WebElement obtainMedicalClearancePageVerify;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//lightning-formatted-text)")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[contains(text(),'Prospective foster parents and all household members meet medical requirements.')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: To ensure the Foster Parents and household members do not have any medical conditions that could jeopardize the health and safety of a foster child.')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy (xpath = "//*[contains(text(),'Complete and upload the Medical Report for Caregivers documentation  and, if applicable, the Medical Report for Household Members documentation.')]")
	  WebElement instruction_text;
	    
	@FindBy (xpath = "//button[@title='Click for more information']")
	WebElement instructionsHelpButton;
	 
	@FindBy(xpath = "//*[contains(text(),'Help Text')]")
	 WebElement helpTextVerify;	
	 
	 
	 @FindBy (xpath = "//*[contains(text(),'The Medical Report for Caregivers documentation must be completed for each applicant.  The Medical Report for Household Members documentation must be completed for each household member who is not an applicant.')]")
	 WebElement instructions_HelpMessage;
	 
	 @FindBy (xpath = "//button[text()='Cancel']")
	 WebElement instructionsCancelButton;
	 
	 @FindBy(xpath = "//*[text()='Select Files']")
	 WebElement selectFilesTitle;
		
	 @FindBy(xpath = "(//*[text()='Upload Files'])[1]")
	 WebElement uploadFilesButton;
		
	 @FindBy(xpath = "//button//span[text()='Done']")
	 WebElement doneButton;
		
	 
	 
	 @FindBy(xpath = "(//*[text()=' meet medical requirements?']/..//input)[1]")
	 WebElement meetMedicalRequirementsDropPerson1;
		 
	 @FindBy (xpath = "(//*[text()=' meet medical requirements?']/../../..//*[text()='--None--'])[1]")
	 WebElement dropdownNonePerson1;
			
	 @FindBy (xpath = "(//*[text()=' meet medical requirements?']/..//*[text()='Yes'])[1]")
	 WebElement dropdownYesPerson1;
			
	 @FindBy (xpath = "(//*[text()=' meet medical requirements?']/../../..//*[text()='No'])[1]")
	 WebElement dropdownNoPerson1;
	 
	 
	 @FindBy (xpath ="(//*[text()=' meet medical requirements?']/..//input)[2]")
		WebElement meetMedicalRequirementsDropPerson2;
	 
	 @FindBy (xpath ="(//*[text()=' meet medical requirements?']/../../..//*[text()='--None--'])[2]")
		WebElement dropdownNonePerson2;
	 
	 @FindBy (xpath ="(//*[text()=' meet medical requirements?']/..//*[text()='Yes'])[2]")
		WebElement dropdownYesPerson2;
	 
	 @FindBy (xpath ="(//*[text()=' meet medical requirements?']/../../..//*[text()='No'])[2]")
		WebElement dropdownNoPerson2;
	 
	 
	 
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

	 @FindBy(xpath = "//button[@title='Close Obtain Medical Clearance']")
	    WebElement closeTabButton;
	 
	 public By closeTabButtonBy = By.xpath("//button[@title='Close Obtain Medical Clearance']");

	 
	 Actions act = new Actions(driver);
		

		/**
		 * Click  on obtainMedicalClearancePage
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
		
		 public void obtainMedicalClearancePageTab() throws AcisException {
		        logger.info("Clicking on obtainMedicalClearancePageTab");
		        Actions act = new Actions(driver);
		        act.sendKeys(Keys.END).build().perform();
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        act.sendKeys(Keys.HOME).build().perform();
		        scrollingToElementofAPage(obtainMedicalClearancePage);
		        waitForElement(obtainMedicalClearancePage);
		        clickWebElemntUsingJavascriptExecutor(obtainMedicalClearancePage);
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        driver.navigate().refresh();
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        waitForElement(obtainMedicalClearancePageVerify);
		        logger.info("Clicked on obtainMedicalClearancePageTab");
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
		        Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText()
		                                    + "Expected Value: " + taskValue);
		        logger.info("Checked Task Value: " + taskValue);
		    }
		  
		  /**
			 * Verifying standards
			 * @author swati.malviya
			 */
			public void verifyStandardsMessage() throws AcisException {
				logger.info("Checking Standards Message");
//				Actions act = new Actions(driver);
//				act.sendKeys(Keys.PAGE_DOWN).build().perform();
//				waitForPageLoadTill(5);
//				act.sendKeys(Keys.ARROW_UP).build().perform();
//				act.sendKeys(Keys.ARROW_UP).build().perform();
//				waitForPageLoadTill(5);
				Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
//				waitForPageLoadTill(5);
//				clickWebElement(standardsHelpButton);
//				Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
				logger.info("Checked Standards Message");
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
		 * Click  on first upload file button and upload file
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
		
		 public void clickAddFirstFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		        logger.info("Clicking  on first upload file button and upload file");
		        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		        logger.info("Clicking on Page Down");
		        waitForElement(uploadFilesButton);
		        waitForPageLoadTill(5);
		        clickWebElemntUsingJavascriptExecutor(uploadFilesButton);
		        uploadFileUsingRobot(filepath);
		        waitForPageLoadTill(10);
		        logger.info(" first file uploaded successfully");
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        refreshPage();
		        waitForPageLoadTill(10);
		        waitForPageLoad();
		    }
		 
		   /**
			 * Click on meet medical requirements? for Person 1
			 * @author swati.malviya
			 * @throws AcisException 
			 */
			
			public void meetmedicalrequirementsPerson1(String option) throws AcisException {
				Actions act = new Actions(driver);
				act.sendKeys(Keys.PAGE_DOWN).build().perform();
				waitForPageLoadTill(5);
				logger.info("Clicking on meet medical requirements? DropBox for Person 1");
				waitForElement(meetMedicalRequirementsDropPerson1);
				clickWebElemntUsingJavascriptExecutor(meetMedicalRequirementsDropPerson1);
				
				if(option == "--None--") {
					logger.info("Clicking on --None--");
					waitForElement(dropdownNonePerson1);
					clickWebElemntUsingJavascriptExecutor(dropdownNonePerson1);
					logger.info("Clicked on --None--");
				}
				
				else if(option == "Yes") {
					logger.info("Clicking on Yes");
					waitForElement(dropdownYesPerson1);
					clickWebElemntUsingJavascriptExecutor(dropdownYesPerson1);
					logger.info("Clicked on No");
				}
				
				else {
					logger.info("Clicking on No");
					waitForElement(dropdownNoPerson1);
					clickWebElemntUsingJavascriptExecutor(dropdownNoPerson1);
					logger.info("Clicked on NO");
				}	
				logger.info("Selected meet medical requirements? for Person 1");
			}
			
			
			
			   /**
				 * Click on meet medical requirements? for Person 2
				 * @author swati.malviya
				 * @throws AcisException 
				 */
				
				public void meetmedicalrequirementsPerson2(String option) throws AcisException {
					waitForPageLoadTill(5);
					logger.info("Clicking on meet medical requirements? DropBox for Person 2");
					waitForElement(meetMedicalRequirementsDropPerson2);
					clickWebElemntUsingJavascriptExecutor(meetMedicalRequirementsDropPerson2);
	
					if(option == "--None--") {
						logger.info("Clicking on --None--");
						waitForElement(dropdownNonePerson2);
						clickWebElemntUsingJavascriptExecutor(dropdownNonePerson2);
						logger.info("Clicked on --None--");
					}
					
					else if(option == "Yes") {
						logger.info("Clicking on Yes");
						waitForElement(dropdownYesPerson2);
						clickWebElemntUsingJavascriptExecutor(dropdownYesPerson2);
						logger.info("Clicked on No");
					}
					
					else {
						logger.info("Clicking on No");
						waitForElement(dropdownNoPerson2);
						clickWebElemntUsingJavascriptExecutor(dropdownNoPerson2);
						logger.info("Clicked on NO");
					}	
					logger.info("Selected meet medical requirements? for Person 2");
				}
			
			
			
			
			
			
			/**
			 * Select Value for : Standards Met?
			 * @author swati.malviya
			 * @throws AcisException 
			 */
			
			public void selectStandardsMet(String option) throws AcisException {
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
