package com.acis.automation.pages.portalLicensingactivities;

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

public class CompletePreServiceTraining_Portal_Page extends PageBase {

	
	public CompletePreServiceTraining_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}


	final static Logger logger = LoggerFactory.getLogger(CompletePreServiceTraining_Portal_Page.class);
	
	
	@FindBy (xpath = "//*[text()='Complete Pre-Service Training']")
	WebElement completePreServiceTraining;
	
	@FindBy (xpath = "//h1//*[text()='Complete Pre-Service Training']")
	WebElement completePreServiceTrainingVerify;
	
	


	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	
	
	
	@FindBy(xpath = "//*[text()='Standards']")
    WebElement 	standards;
	
	@FindBy(xpath = "//*[contains(text(),'The prospective foster parents complete Resource and Adoptive Parent Trainings I, II, and III')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: To ensure Foster Parents are properly trained before fostering children')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;
	
	
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy(xpath = "//*[contains(text(),'Indicate Resource and Adoptive Parent Training (RAPT) I, II, and III attendance and upload training certification documentation')]")
    WebElement 	instructions_Messgae;
	
	@FindBy (xpath = "//*[contains(text(),'RAPT II is an online training course and the certificate must be uploaded by you. Please upload RAPT I and III certificates if you have') and contains(text(),'them as well')]")
	WebElement instructions_HelpMessage;

	 
	
	 
	 @FindBy(xpath = "(//*[@placeholder='Select an Option'])[1]")
	 WebElement  personDropdown;
	 
	 
	 
	 
	 
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
		
	 @FindBy(xpath = "//*[text()='Select a date']/../..//*[text()='16']")
	 WebElement selectDate;
	
	
	 
	 /**
		 * Check Complete PreService Training
		 * @author swati.malviya
		 */
		Actions act = new Actions(driver);
		
		public void completePreServiceTrainingTab() throws AcisException {
			logger.info("Clicking on Complete Pre Service Training Tab");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.END).build().perform();
			waitForPageLoadTill(5);
			waitForPageLoad();
			act.sendKeys(Keys.HOME).build().perform();
			scrollingToElementofAPage(completePreServiceTraining);
			clickWebElement(completePreServiceTraining);
			waitForPageLoad();
			waitForPageLoadTill(5);
			driver.navigate().refresh();
			waitForPageLoadTill(5);
			waitForPageLoad();
			waitForElement(completePreServiceTrainingVerify);
			logger.info("Clicked on Complete Pre Service Training Tab");
		}
	 
	 
	 /**
		 * Check standards
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		public void verifyStandardsMessage() throws AcisException {
			logger.info("Checking Standards Message");
			Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
//			clickWebElement(taskOwner);
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			waitForPageLoadTill(5);
//			clickWebElement(standardsHelpButton);
//			//hoverOverElement(standardsHelpButton);
//			Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
			logger.info("Checked Standards Message");
	}
		/**
		 * Check Instruction
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void verifyInstructionsMessage() throws AcisException {
			logger.info("Checking Instructions Message");
			Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
			scrollingToElementofAPage(instructionsHelpButton);
			clickWebElement(instructionsHelpButton);
			Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
			clickWebElement(instructionsCancelButton);
			logger.info("Checked Instructions Message");
		}
		
		 
		 
		 
		 /**
			 * Select Person name
			 * @author mrunal.s.tilekar
			 * @throws AcisException 
			 * 
			 */
			public void selectPersonName(String personName) throws AcisException {
				logger.info("Select Person name: "+ personName);
				waitForPageLoadTill(5);
				scrollingToElementofAPage(personDropdown);
				clickWebElement(personDropdown);
				waitForPageLoadTill(5);
				clickWebElement(driver.findElement(By.xpath("//span[@title='"+ personName+"']")));
				logger.info("Selected Person name: "+ personName);
			}

			
			
			 /**
			 * Select Value for : Training Type 
			 * @author swati.malviya
			 * @throws AcisException 
			 */
		 public void trainingType(String option) throws AcisException
		 {
		       logger.info("clicking on Training Type Dropdown:"+option );
		        waitForPageLoad();
		        waitForElement(trainingTypeDropdown);
		        clickWebElement(trainingTypeDropdown);
		        
		       switch (option) {
		        case "rapt1certificate":
			      waitForElement(rapt1certificate);
			      clickWebElement(rapt1certificate);
			      break;
			    
		       case "rapt2certificate":
			     waitForElement(rapt2certificate);
			     clickWebElement(rapt2certificate);
			    break;
			    
		       default:
			     waitForElement(rapt3certificate);
			     clickWebElement(rapt3certificate);
			  break;
		   }
		       logger.info("selected from Training Type Dropdown:"+option);
	       }		
		 
		 
		 
		 /**
			 * Select Value for : Date Attended 
			 * @author swati.malviya
			 * @throws AcisException 
			 */
		 public void selectDateAttendedValue() throws AcisException {
				logger.info("Selecting Value for : dateAttended");
				waitForPageLoadTill(5);
				scrollingToElementofAPage(DateButton);
				clickWebElement(DateButton);
				waitForPageLoadTill(5);
				clickWebElement(selectDate);
				waitForPageLoadTill(5);
				logger.info("Selected Value for : dateAttended");
				
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
				waitForPageLoadTill(5);
				waitForPageLoad();
				refreshPage();
				waitForPageLoadTill(10);
				waitForPageLoad();
			}
			
			
			
			 /**
			 * Check Task Owner Value
			 * @author swati.malviya
			 */
			public void checkTaskOwnerValue(String taskOwnerValue) {
				waitForPageLoadTill(5);
				waitForPageLoad();
				refreshPage();
				waitForPageLoadTill(10);
				waitForPageLoad();
				logger.info("Check Task Owner Value: " + taskOwnerValue);
				Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
											+ "Expected Value: " + taskOwnerValue);
				logger.info("Checked Task Owner Value: " + taskOwnerValue);
			}
			
		
			
			/**
			 * Check Task Value
			 * @author prateeksha.mahesh
			 */
			public void checkTaskValue(String taskValue) {
				logger.info("Check Task Value: " + taskValue);
				Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
											+ "Expected Value: " + taskValue);
				logger.info("Checked Task Value: " + taskValue);
			}
	
}
