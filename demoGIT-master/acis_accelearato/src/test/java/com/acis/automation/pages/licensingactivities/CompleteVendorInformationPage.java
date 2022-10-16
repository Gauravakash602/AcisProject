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

public class CompleteVendorInformationPage extends PageBase {

	public CompleteVendorInformationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(AccessToSafeWaterPage.class);
	
	@FindBy (xpath = "(//*[text()='Complete Vendor Information'])")
    WebElement completeVendorInformationPage;
	
	@FindBy(xpath = "//*[text()='Task Owner']/../../..//span[@class='test-id__field-label']")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy (xpath = "//*[contains(text(),'The prospective foster parents provide a Direct Deposit Authorization, W-9, and a DCS User Agreement Foster Care Portal/KT')]")
    WebElement standards ;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: To enable DCS to pay Foster Care per diems to licensed Foster Parents')]")
    WebElement reason;
	
    @FindBy (xpath = "//*[contains(text(),'Pass Threshold:  Applicants provide Direct Deposit Authorization, W-9, and a DCS User Agreement Foster Care Portal/KT.  All documentation is uploaded via the licensing activity.')]")
	WebElement standardsMetIcon;
    
    @FindBy(xpath = "(//*[@placeholder='Select an Option'])[1]")
	WebElement  personHouseholdDropdown;
	
	@FindBy(xpath = "//*[text()='TwjJ  hfaD Home']/../../..//*[@class='slds-icon slds-icon-text-default slds-icon_x-small']")
	WebElement  twjhfaDHome;
	
	@FindBy(xpath = "//*[@placeholder='Select an Option']/../../..//*[text()='TwjJ hfaD']")
	WebElement TwjJhfaD;
	
	 @FindBy(xpath = "(//*[@placeholder='Select an Option'])[2]")
		WebElement documentTypedropdown;
	 
	 @FindBy(xpath = "//*[text()='Direct Deposit Authorization']")
		WebElement directDepositAuthorization;
	 
	 @FindBy(xpath = "//*[text()='W-9']")
		WebElement w9;
	 
	 @FindBy(xpath = "//*[text()='DCS User Agreement Foster Care Portal/KT']")
		WebElement DCSUserAgreementFosterCare;
	 
	 @FindBy(xpath = "(//span[text()='Upload Files'])[1]")
		WebElement addFilesButton;
		
	 @FindBy(xpath = "//*[text()='Select Files']")
		WebElement selectFilesTitle;
		
	 @FindBy(xpath = "//button//span[text()='Upload Files']")
		WebElement uploadFilesButton;
		
		@FindBy(xpath = "//button//span[text()='Done']")
		WebElement doneButton;
		
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

		@FindBy(xpath = "//h1[text()='Licensing Activities']")
	    WebElement 	licensingActivitiesTitle;

		@FindBy(xpath = "//button[@title='Close Complete Vendor Information']")
	    WebElement closeTabButton;
		
		public By closeTabButtonBy = By.xpath("//button[@title='Close Complete Vendor Information']");

		
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
		
		/**
		 * Click  on completeVendorInformationPage
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
		
		 public void completeVendorInformationPageTab() throws AcisException {
		        logger.info("Clicking on completeVendorInformationPageTab");
		        Actions act = new Actions(driver);
		        act.sendKeys(Keys.END).build().perform();
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        act.sendKeys(Keys.HOME).build().perform();
		        scrollingToElementofAPage(completeVendorInformationPage);
		        clickWebElemntUsingJavascriptExecutor(completeVendorInformationPage);
		        waitForPageLoadTill(5);
		        driver.navigate().refresh();
		        waitForPageLoadTill(5);
		        waitForPageLoad();
		        waitForElement(completeVendorInformationPage);
		        logger.info("Clicked on completeVendorInformationPage Tab");
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
			Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
										+ "Expected Value: " + taskValue);
			logger.info("Checked Task Owner Value: " + taskValue);
		}

		/**
		 * Check standards
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void standards() throws AcisException  {
	        logger.info("Varifying the Standards");
	        Assert.assertTrue(standards.isDisplayed(), "Error : Standard Message is not displayed Properly");
	        clickWebElement(standardsHelpButton);
	        Assert.assertTrue(reason.isDisplayed(), "Error : Reason Message is not displayed Properly");
	        logger.info("Varified the Standards");
	   
	    }
		
		/**
	     * Check Standards Message
	     * @author swati.malviya
	     * @throws AcisException
	     */
	    public void verifyStandarsMessage() throws AcisException {
	    
	        Actions act = new Actions(driver);
	        logger.info("Checking Standards Message");
	        Assert.assertTrue(standards.isDisplayed(), "Error: Mismatch in standards Messages");
	        clickWebElement(taskOwner);
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        waitForPageLoadTill(5);
	        hoverOverElement(standardsHelpButton);
	        Assert.assertTrue(reason.isDisplayed(), "Error: Mismatch in standards help Messages");
	        logger.info("Checked Standards Message");
	    }
		
		 /**
		 * Click  on upload documentation button and select option
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
		
		public void UploadDocumentation(String option) throws AcisException, InterruptedException {
			logger.info("Clicking on personHouseholdDropdown");
			waitForElement(personHouseholdDropdown);
			clickWebElement(personHouseholdDropdown);
			logger.info("Clicked on personHouseholdDropdown ");
		
			if(option=="twjhfaDHome") {
				logger.info(" Clicking on twjhfaDHome");
				waitForElement(twjhfaDHome);
				clickWebElement(twjhfaDHome);
				logger.info(" Clicked on twjhfaDHome ");
				}
			else{
				logger.info("clicking on  TwjJhfaD ");
				waitForElement(TwjJhfaD);
				clickWebElement(TwjJhfaD);
				logger.info(" Clicked on TwjJhfaD ");
				}
		}
		
		/**
		 * Select Value for : DocumentType 
		 * @author swati.malviya
		 * @throws AcisException 
		 */
			
		
		public void DocumentType(String option) throws AcisException {
			logger.info("clicking on documentTypedropdown:"+option );
			waitForPageLoad();
			waitForElement(documentTypedropdown);
			clickWebElement(documentTypedropdown);
			switch (option) {
			case "directDepositAuthorization":
				waitForElement(directDepositAuthorization);
				clickWebElement(directDepositAuthorization);
				break;
			case "w9":
				waitForElement(w9);
				clickWebElement(w9);
				break;
			case "DCSUserAgreementFosterCare":
				waitForElement(DCSUserAgreementFosterCare);
				clickWebElement(DCSUserAgreementFosterCare);
				break;
			default:
				break;
			}
			logger.info("clicked on documentTypedropdown:"+option);
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
			
			driver.navigate().refresh();
			waitForPageLoad();
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			waitForElement(uploadFilesButton);
			waitForPageLoadTill(5);
			clickWebElement(uploadFilesButton);
			waitForPageLoadTill(5);
			uploadFileUsingRobot(filepath);
			waitForPageLoadTill(5);
		//	clickWebElement(doneButton);
		//	waitForPageLoadTill(5);
			waitForPageLoad();
			driver.navigate().refresh();
			logger.info("file uploaded successfully");
		}
		
		/**
		 * Select Value for :  confirm Standards Met
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
	 
	 


