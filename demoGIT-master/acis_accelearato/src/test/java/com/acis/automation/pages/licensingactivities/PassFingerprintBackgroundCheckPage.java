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

public class PassFingerprintBackgroundCheckPage extends PageBase {

	public PassFingerprintBackgroundCheckPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(AccessToSafeWaterPage.class);
	
	@FindBy (xpath = "(//*[text()='Pass Fingerprint Background Check'])[last()]")
    WebElement passFingerprintBackgroundCheckPage;
	
	@FindBy(xpath = "//h1//*[text()='Pass Fingerprint Background Check']")
	WebElement passFingerprintBackgroundCheckPageVerify;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
	    WebElement     taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy (xpath = "//*[contains(text(),'Neither Licensed Foster Parents nor residents of the home has a criminal record that would') and contains(text(),\"impede the applicant's ability to serve as a foster parent\")]")
    WebElement standards_Messgae ;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	
	@FindBy (xpath = "//*[contains(text(),'Reason: DCS will not place a child in a home in which any resident has a criminal record that would impede the applicant’s ability to serve as a foster parent.')]")
    WebElement reason;
	
    @FindBy (xpath = "//*[contains(text(),'Pass Threshold: Applicant(s) and any adult household members have qualified background check results or an exception.The COBCU will qualify all persons whose Fingerprint-Based Check Report has no criminal history or reflects arrests and/or convictions that do not result in a conditionally disqualified or\r\n"+"disqualified status')]")
	WebElement standardsMetIcon;
    
    @FindBy(xpath = "(//*[@placeholder='Select an Option'])[1]")
	WebElement  personHouseholdDropdown;
	
    @FindBy(xpath = "//*[@class='slds-media__body']/../../..//*[@title='TwjJ hfaD']")
	WebElement TwjJhfaD;
    
    @FindBy(xpath = "(//*[@placeholder='Select an Option'])[2]")
   	WebElement  backgroundCheckDropdown;
   	
    @FindBy(xpath = "//*[@class='slds-media__body']/../../..//*[@title='FBI Fingerprinting']")
   	WebElement fBIFingerprinting;
       
    @FindBy(xpath = "(//span[text()='Upload Files'])[1]")
    WebElement addFilesButton;
		
	 @FindBy(xpath = "//*[text()='Select Files']")
	 WebElement selectFilesTitle;
		
	 @FindBy(xpath = "(//*[text()='Upload Files'])[1]")
	 WebElement uploadFilesButton;
		
	 @FindBy(xpath = "//button//span[text()='Done']")
	 WebElement doneButton;
	 
	 @FindBy(xpath = "(//*[@placeholder='Select an Option'])[3]")
	 WebElement resultDropdown;
		
	 @FindBy(xpath = "(//*[text()='Qualified'])")
	 WebElement qualified;
		
	 @FindBy(xpath = "//*[text()='Conditionally Disqualified']")
	 WebElement conditionallyDisqualified;
	 
	 @FindBy(xpath = "//*[text()='Disqualified']")
	 WebElement disqualified;
	 
	 @FindBy(xpath = "//*[text()='Exception']")
	 WebElement exception;
	 
	 @FindBy (xpath = "//*[text()='Applicant A substantiated as a CA/N perpetrator?']/..//button")
		WebElement Applicant_A_Pen;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/..//input)[1]")
		WebElement Applicant_A_Drop;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/../..//span[contains(text(),'None')])[1]")
		WebElement  Applicant_A_None;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/../..//span[text()='Yes'])[1]")
		WebElement  Applicant_A_Yes;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/../..//span[text()='No'])[1]")
		WebElement  Applicant_A_No;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/../..//span[text()='N/A'])[1]")
		WebElement  Applicant_A_NA;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/..//input)[2]")
		WebElement Applicant_B_Drop;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/../..//span[contains(text(),'None')])[last()]")
		WebElement  Applicant_B_None;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/../..//span[text()='Yes'])[last()]")
		WebElement  Applicant_B_Yes;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/../..//span[text()='No'])[last()]")
		WebElement  Applicant_B_No;
		
		@FindBy (xpath = "(//*[contains(text(),'qualified/exception granted')]/../..//span[text()='N/A'])[last()]")
		WebElement  Applicant_B_NA;
		
		
		
		@FindBy (xpath = "//*[text()='Applicant B substantiated as a CA/N perpetrator?']/..//button")
		WebElement Applicant_B_Pen;
		
		
		@FindBy (xpath = "//*[contains(text(),'Others 18+ qualified/exception granted')]/..//button")
		WebElement othersPerpetratorsPen;
		
		@FindBy (xpath = "//*[contains(text(),'Others 18+ qualified/exception granted')]/..//input")
		WebElement othersPerpetratorsDrop;
		
		@FindBy (xpath = "//*[contains(text(),'Others 18+ qualified/exception granted')]/../..//*[contains(text(),'None')]")
		WebElement othersPerpetratorsNone;
		
		@FindBy (xpath = "//*[contains(text(),'Others 18+ qualified/exception granted')]/../..//*[text()='Yes']")
		WebElement othersPerpetratorsYes;
		
		@FindBy (xpath = "//*[contains(text(),'Others 18+ qualified/exception granted')]/../..//*[text()='No']")
		WebElement othersPerpetratorsNo;
		
		@FindBy (xpath = "//*[contains(text(),'Others 18+ qualified/exception granted')]/../..//*[text()='N/A']")
		WebElement othersPerpetratorsNA;
	 
	
	 
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
	 
	 @FindBy (xpath = "//button[@title='Edit Request Waiver?']")
		WebElement requestWaiverPen;
		
		@FindBy (xpath = "//*[text()='Request Waiver?']/../../..//*[@autocomplete='off']")
		WebElement requestWaiverDrop;
		
		@FindBy (xpath = "//*[text()='Request Waiver?']/..//span[text()='--None--']")
		WebElement requestWaiverNone;
		
		@FindBy (xpath = "//*[text()='Request Waiver?']/../../..//*[text()='Yes']")
		WebElement requestWaiverYes;
		
		@FindBy (xpath = "//*[text()='Request Waiver?']/../../..//*[text()='No']")
		WebElement requestWaiverNo;
		
		
		
		@FindBy (xpath = "//button[@title='Edit Waiver Request Comments']")
		WebElement waiverRequestCommentsPen;
		
		@FindBy (xpath = "//*[text()='Waiver Request Comments']/../../..//*[@maxlength]")
		WebElement waiverRequestCommentsDrop;
		
		
		
		@FindBy (xpath = "//button[@title='Edit Request Variance?']")
		WebElement requestVariancePen;
		
		@FindBy (xpath = "//*[text()='Request Variance?']/../../..//*[@autocomplete='off']")
		WebElement requestVarianceDrop;
		
		@FindBy (xpath = "//*[text()='Request Variance?']/../../..//span[text()='--None--']")
		WebElement requestVarianceNone;
		
		@FindBy (xpath = "//*[text()='Request Variance?']/../../..//*[text()='Yes']")
		WebElement requestVarianceYes;
		
		@FindBy (xpath = "//*[text()='Request Variance?']/../../..//*[text()='No']")
		WebElement requestVarianceNo;
		
		
		
		@FindBy (xpath = "//button[@title='Edit Variance Request Comments']")
		WebElement varianceRequestCommentsPen;
		
		@FindBy (xpath = "//*[text()='Variance Request Comments']/../../..//*[@maxlength]")
		WebElement varianceRequestCommentsDrop;
		
		
		@FindBy(xpath = "//h1[text()='Licensing Activities']")
	    WebElement 	licensingActivitiesTitle;

		@FindBy(xpath = "//button[@title='Close Pass Fingerprint Background Check']")
	    WebElement closeTabButton;
	 
		public By closeTabButtonBy = By.xpath("//button[@title='Close Pass Fingerprint Background Check']");
		
	 Actions act = new Actions(driver);
	 
	 /**
		 * Click  on passFingerprintBackgroundCheckPage
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
		
		 public void passFingerprintBackgroundCheckPageTab() throws AcisException {
		        logger.info("Clicking on passFingerprintBackgroundCheckPage Tab");
		        Actions act = new Actions(driver);
		        act.sendKeys(Keys.END).build().perform();
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        act.sendKeys(Keys.HOME).build().perform();
		        waitForElement(passFingerprintBackgroundCheckPage);
		        clickWebElement(passFingerprintBackgroundCheckPage);
		        waitForPageLoadTill(5);
		        driver.navigate().refresh();
		        waitForPageLoadTill(10);
		        waitForPageLoad();
		        waitForElement(passFingerprintBackgroundCheckPageVerify);
		        logger.info("Clicked on passFingerprintBackgroundCheckPage Tab");
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
			logger.info("Check Task  Value: " + taskValue);
			Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
										+ "Expected Value: " + taskValue);
			logger.info("Checked Task  Value: " + taskValue);
		}
	 
		
		/**
	     * Check Standards Message
	     * @author swati.malviya
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
		 * Click  on personHousehold button and select option
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
		
		public void runBackgroundCheckPerson(String option) throws AcisException, InterruptedException {
			logger.info("Clicking on personHouseholdDropdown");
			waitForPageLoad();
			Actions act = new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).build().perform();
	        waitForPageLoadTill(5);
	        waitForPageLoad();
			waitForElement(personHouseholdDropdown);
			clickWebElement(personHouseholdDropdown);
			logger.info("Clicked on personHouseholdDropdown ");
		
			
			if(option=="twjhfaD"){
				logger.info("clicking on  TwjJhfaD ");
				waitForElement(TwjJhfaD);
				clickWebElement(TwjJhfaD);
				logger.info(" Clicked on TwjJhfaD ");
				}
		}
		
		/**
		 * Select Value for : Background Check Type 
		 * @author swati.malviya
		 * @throws AcisException 
		 */
			
		
		public void backgroundCheckType(String option) throws AcisException, InterruptedException {
			logger.info("Clicking on backgroundCheckDropdown");
			waitForPageLoad();
			Actions act = new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).build().perform();
	        waitForPageLoadTill(5);
	        waitForPageLoad();
			waitForElement(backgroundCheckDropdown);
			clickWebElement(backgroundCheckDropdown);
			waitForElement(fBIFingerprinting);
			clickWebElement(fBIFingerprinting);
			logger.info("Clicked on backgroundCheckDropdown");
		
		}
		
		/**
		 * Click  on upload file button and upload file
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
		
		
		public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
			logger.info("Clicking  on upload file button and upload file");
			waitForPageLoadTill(5);
			clickWebElement(uploadFilesButton);
			uploadFileUsingRobot(filepath);
			waitForPageLoadTill(5);
			logger.info("file uploaded successfully");
		}
        /**
    	 * Select Value for : Results 
    	 * @author swati.malviya
    	 * @throws AcisException 
    	 */
    		
      public void results(String option) throws AcisException {
	       logger.info("clicking on resultDropdown:"+option );
	       waitForPageLoad();
	       scrollingToElementofAPage(resultDropdown);
	       waitForElement(resultDropdown);
	       clickWebElemntUsingJavascriptExecutor(resultDropdown);
	       switch (option) {
	       case "qualified":
		   waitForElement(qualified);
		   clickWebElemntUsingJavascriptExecutor(qualified);
		   break;
	      case "conditionallyDisqualified":
		  waitForElement(conditionallyDisqualified);
		  clickWebElement(conditionallyDisqualified);
		  break;
	      case "disqualified":
		  waitForElement(disqualified);
		  clickWebElement(disqualified);
		  break;
	      case "exception":
		  waitForElement(exception);
		  clickWebElement(exception);
		  break;
	      default:
	       break;
	   }
	       logger.info("selected from resultDropdown:"+option);
	       waitForPageLoad();
       }
      
      /**
		 * Select Value for : applicantA
		 * @author swati.malviya
		 * @throws AcisException 
		 */
			
			
		public void applicantA(String option) throws AcisException, InterruptedException {
			logger.info("Clicking on Applicant A");
			waitForPageLoadTill(5);
//			scrollingToElementofAPage(Applicant_A_Pen);
//			 clickWebElemntUsingJavascriptExecutor(Applicant_A_Pen);
//			 waitForPageLoadTill(5);
			scrollingToElementofAPage(Applicant_A_Drop);
			clickWebElemntUsingJavascriptExecutor(Applicant_A_Drop);
		    logger.info("Clicked on  Applicant A");
		    
		   
			if(option=="--None--") {
			logger.info(" Clicking on --None-- ");
			waitForElement(Applicant_A_None);
			clickWebElement(Applicant_A_None);
			logger.info(" Clicked on --None-- ");
			}
			else if(option=="Yes") {
				logger.info(" Clicking on  yes");
				waitForElement(Applicant_A_Yes);
				clickWebElemntUsingJavascriptExecutor(Applicant_A_Yes);
				logger.info(" Clicked on Yes ");
				}
			else if (option=="No"){
				logger.info(" Clicking on No");
				waitForElement(Applicant_A_No);
				clickWebElement(Applicant_A_No);
				logger.info("Clicked on No");
				}
			else {
				logger.info(" Clicking on N/A");
				waitForElement(Applicant_A_NA);
				clickWebElement(Applicant_A_NA);
				logger.info("Clicked on N/A");
				}
			
		}
		
		/**
		 * Select Value for : applicant B
		 * @author swati.malviya
		 * @throws AcisException 
		 */
			
			
		 public void applicantB(String option) throws AcisException, InterruptedException {
		        logger.info("Clicking on Applicant B");
		        waitForPageLoadTill(5);
//		        scrollingToElementofAPage(Applicant_B_Pen);
//		         clickWebElemntUsingJavascriptExecutor(Applicant_B_Pen);
//		         waitForPageLoadTill(5);
		        scrollingToElementofAPage(Applicant_B_Drop);
		         clickWebElemntUsingJavascriptExecutor(Applicant_B_Drop);
		        logger.info("Clicked on  Applicant B");
		       
		      
		        if(option=="--None--") {
		        logger.info(" Clicking on --None-- ");
		        waitForElement(Applicant_B_None);
		        clickWebElement(Applicant_B_None);
		        logger.info(" Clicked on --None-- ");
		        }
		        else if(option=="Yes") {
		            logger.info(" Clicking on  yes");
		            waitForElement(Applicant_B_Yes);
		            clickWebElement(Applicant_B_Yes);
		            logger.info(" Clicked on Yes ");
		            }
		        else if (option=="No"){
		            logger.info(" Clicking on No");
		            waitForElement(Applicant_B_No);
		            clickWebElement(Applicant_B_No);
		            logger.info("Clicked on No");
		            }
		        else {
		            logger.info(" Clicking on N/A");
		            waitForElement(Applicant_B_NA);
		            clickWebElement(Applicant_B_NA);
		            logger.info("Clicked on N/A");
		            }
		       
		    }
		
		/**
		 * Select Value for : others Indicated perpetrators
		 * @author swati.malviya
		 * @throws AcisException 
		 */
			
			
		public void othersIndicatedperpetrators(String option) throws AcisException, InterruptedException {
			logger.info("Clicking on others Indicated perpetrators");
			scrollingToElementofAPage(othersPerpetratorsPen);
			waitForElement(othersPerpetratorsPen);
			 clickWebElemntUsingJavascriptExecutor(othersPerpetratorsPen);
			 waitForPageLoadTill(5);
			waitForElement(othersPerpetratorsDrop);
			 clickWebElemntUsingJavascriptExecutor(othersPerpetratorsDrop);
		    logger.info("Clicked on  others Indicated perpetrators");
			
			if(option=="--None--") {
			logger.info(" Clicking on --None-- ");
			waitForElement(othersPerpetratorsNone);
			clickWebElement(othersPerpetratorsNone);
			logger.info(" Clicked on --None-- ");
			}
			else if(option=="Yes") {
				logger.info(" Clicking on  yes");
				waitForElement(othersPerpetratorsYes);
				clickWebElement(othersPerpetratorsYes);
				logger.info(" Clicked on Yes ");
				}
			else if (option=="No"){
				logger.info(" Clicking on No");
				waitForElement(othersPerpetratorsNo);
				clickWebElement(othersPerpetratorsNo);
				logger.info("Clicked on No");
				}
			else {
				logger.info(" Clicking on N/A");
				waitForElement(othersPerpetratorsNA);
				clickWebElement(othersPerpetratorsNA);
				logger.info("Clicked on N/A");
				}
			
		}
		
		
		
      /**
		 * Select Value for :  confirm Standards Met
		 * @author swati.malviya
		 * @throws AcisException 
		 */
      
      public void selectStandardsMet(String option) throws AcisException {
			logger.info("Selecting StandardsMet option:"+option);
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
			scrollingToElementofAPage(saveButton);
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
			clickWebElement(cancelButton);
			waitForPageLoadTill(5);
			logger.info("Clicked on cancel button");
		}
		
		/**
		 * For Request Waiver? 
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void requestWaiver(String waiver) throws AcisException {
			logger.info("Clicking on Request Waiver? Pencil");
			scrollingToElementofAPage(requestWaiverPen);
			waitForElement(requestWaiverPen);
			clickWebElemntUsingJavascriptExecutor(requestWaiverPen);
			logger.info("Clicked on Request Waiver? Pencil");
			
			logger.info("Clicking on Request Waiver? Drop Box");
			waitForElement(requestWaiverDrop);
			clickWebElemntUsingJavascriptExecutor(requestWaiverDrop);
			logger.info("Clicked on Request Waiver? Drop Box");
			
			
			if(waiver == "--None--") {
				logger.info("Clicking on --None--");
				waitForElement(requestWaiverNone);
				clickWebElemntUsingJavascriptExecutor(requestWaiverNone);
				logger.info("Clicked on --None--");
			}
			
			else if(waiver == "Yes") {
				logger.info("Clicking on Yes");
				waitForElement(requestWaiverYes);
				clickWebElement(requestWaiverYes);
				logger.info("Clicked on No");
			}
			
			else {
				logger.info("Clicking on No");
				waitForElement(requestWaiverNo);
				clickWebElement(requestWaiverNo);
				logger.info("Clicked on NO");
			}
			
		}
		
		
		/**
		 * For Waiver Request Comments
		 * @author swati.malviya
		 * @throws AcisException 
		 */
	
		public void waiverRequestComments() throws AcisException {
			logger.info("Clicking on Request Waiver Comments Pencil");
			scrollingToElementofAPage(waiverRequestCommentsPen);
			waitForElement(waiverRequestCommentsPen);
			clickWebElemntUsingJavascriptExecutor(waiverRequestCommentsPen);
			logger.info("Clicked on Request Waiver Comments Pencil");
			
			logger.info("Clicking on Request Waiver Comments DropBox");
			waitForElement(waiverRequestCommentsDrop);
			clickWebElemntUsingJavascriptExecutor(waiverRequestCommentsDrop);
			logger.info("Clicked on Request Waiver Comments DropBox");
		}
		
		/**
		 * For Request Variance?
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		
		public void requestVariance(String Variance) throws AcisException {
			logger.info("Clicking on Request Variance? Pencil");
			scrollingToElementofAPage(requestVariancePen);
			waitForElement(requestVariancePen);
			clickWebElemntUsingJavascriptExecutor(requestVariancePen);
			logger.info("Clicked on Request Variance? Pencil");
			
			logger.info("Clicking on Request Variance? Drop Box");
			waitForElement(requestVarianceDrop);
			clickWebElemntUsingJavascriptExecutor(requestVarianceDrop);
			logger.info("Clicked on Request Variance? Drop Box");
			
			
			if(Variance == "--None--") {
				logger.info("Clicking on --None--");
				waitForElement(requestVarianceNone);
				clickWebElement(requestVarianceNone);
				logger.info("Clicked on --None--");
			}
			
			else if(Variance == "Yes") {
				logger.info("Clicking on Yes");
				waitForElement(requestVarianceYes);
				clickWebElement(requestVarianceYes);
				logger.info("Clicked on No");
			}
			
			else {
				logger.info("Clicking on No");
				waitForElement(requestVarianceNo);
				clickWebElement(requestVarianceNo);
				logger.info("Clicked on NO");
			}
			
		}
		
		/**
		 * For Variance Request Comments
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void varianceRequestComments() throws AcisException {
			logger.info("Clicking on Variance Request Comments Pencil");
			scrollingToElementofAPage(varianceRequestCommentsPen);
			waitForElement(varianceRequestCommentsPen);
			clickWebElemntUsingJavascriptExecutor(varianceRequestCommentsPen);
			logger.info("Clicked on Variance Request Comments Pencil");
			
			logger.info("Clicking on Variance Request Comments DropBox");
			waitForElement(varianceRequestCommentsDrop);
			clickWebElemntUsingJavascriptExecutor(varianceRequestCommentsDrop);
			logger.info("Clicked on Variance Request Comments DropBox");
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

