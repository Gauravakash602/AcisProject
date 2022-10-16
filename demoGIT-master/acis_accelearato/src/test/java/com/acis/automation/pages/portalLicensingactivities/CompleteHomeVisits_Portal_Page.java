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

public class CompleteHomeVisits_Portal_Page extends PageBase {

	

	public CompleteHomeVisits_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CompleteHomeVisits_Portal_Page.class);

	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy (xpath = "//*[contains(text(),'Household members participate in home visits and the home environment is determined to be an appropriate place to foster children')]")
    WebElement standards ;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: DCS will not license any household as a foster home unless the home environment is determined to be an appropriate place to foster children')]")
    WebElement reason;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
	WebElement 	uploadFilesButton;
	
	 @FindBy (xpath = "//*[contains(text(),'Perform necessary home visits with household members and upload completed copies of  Safe Questionnaires I & II')]")
	 WebElement InstructionsText;
	   
	 @FindBy (xpath = "//button[@title='Click for more information']")
	 WebElement InstructionsIcon;
	 
	 @FindBy (xpath = "//*[contains(text(),'Pass Threshold:  Household visits conducted, SAFE Questionnaires I & II completed by prospective foster parents and uploaded, and household determined to be an  appropriate place for children')]")
	 WebElement standardsMetIcon;
	 
	 
	 @FindBy(xpath = "//iframe[@title='accessibility title']")
		WebElement iframe;
		
		@FindBy(xpath = "//input[@id='DateTime2']")
		WebElement interviewDateTime;
		
		@FindBy(xpath = "//span[text()='15']")
		WebElement date;
		@FindBy(xpath = "//select[@id='Method2']")
		WebElement method;
		
		@FindBy(xpath = "//select[@id='Method2']//option[text()='Teleconference']")
		WebElement methodPhone;
		
		@FindBy(xpath = "//select[@id='Method2']//option[text()='Video Conference']")
		WebElement methodVideoConference;
		
		@FindBy(xpath = "//select[@id='SubtypeMerge']")
		WebElement subtype;
		
		@FindBy(xpath = "//select[@id='SubtypeMerge']//*[text()='Home Study Visit']")
		WebElement subtypeHomeStudyVisit;
		
		@FindBy(xpath = "//select[@id='ContactType2']")
		WebElement type;

		@FindBy(xpath = "//select[@id='ContactType2']//option[text()='Visit']")
		WebElement typeVisit;
		
		@FindBy(xpath = "//div[@id='Interviews_nextBtn']")
		WebElement saveButtonInterview;
		
		@FindBy(xpath = "//label[@for='Participants']")
		WebElement participants;
		
		@FindBy(xpath = "(//*[@id='Participants']//input[@type='checkbox']//following-sibling::span)[1]")
		WebElement firstParticipantsCheckbox;
		
		@FindBy(xpath = "//button[@title='Close Interview']")
		WebElement closeNewInteractionButton;
		
		@FindBy(xpath = "//*[contains(text(),'details are saved. Close ')]")
		WebElement closeInteractionMessage;
		
		@FindBy(xpath = "//textarea[@id='Narrative2']")
		WebElement narrative;
		
		@FindBy(xpath = "//textarea[@id='ProfessionalOpinion2']")
		WebElement professionalOpinion;
		
		@FindBy(xpath = "(//*[text()='Successful']/..//span)[1]")
		WebElement radioSuccessful;

		@FindBy(xpath = "(//*[text()='Unsuccessful']/..//span)[1]")
		WebElement radioUnsuccessful;
		
		
	 
	 
	 /**
		 * Click  on upload file button and upload file
		 * @author mrunal.s.tilekar
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
		 * Check Task Owner Value
		 * @author mrunal.s.tilekar
		 */
		public void checkTaskOwnerValue(String taskOwnerValue) {
			logger.info("Check Task Owner Value: " + taskOwnerValue);
			Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
										+ "Expected Value: " + taskOwnerValue);
			logger.info("Checked Task Owner Value: " + taskOwnerValue);
		}
		
		/**
		 * Check standards
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void verifyStandards() throws AcisException {
	        logger.info("Varifying the Standards");
	        Assert.assertTrue(standards.isDisplayed(), "Error : Standard Message is not displayed Properly");
	        clickWebElement(standardsHelpButton);
	        Assert.assertTrue(reason.isDisplayed(), "Error : Reason Message is not displayed Properly");
	        logger.info("Varified the Standards");
	   
	    }

		/**
		 * Owner : Mrunal
		 * Description: Switch iFrame
		 * @throws AcisException 
		 */
		public void iframeSwitch() throws AcisException {
			logger.info("Switching to iframe");			
			switchToFrameByWebElement(iframe);
			logger.info("Switching to iframe");	
		}

		/**
		 * Check Participant checkbox by name
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void clickParticipantCheckbox(String participantName) throws AcisException {
			
			scrollingToElementofAPage(participants);
			clickWebElement(driver.findElement(By.xpath("//td[contains(text(),'"+participantName+"')]//preceding-sibling::td//span")));
			logger.info("Checked Participant"+participantName+" checkbox");
		}
		
		/**
		 * Owner : Mrunal
		 * Description: Enter Date
		 * @throws AcisException 
		 */
		public void provideDate() throws AcisException {
			waitForElementClickable(interviewDateTime);
			clickWebElemntUsingJavascriptExecutor(interviewDateTime);
			clickWebElement(date);
			logger.info("Enter Date");	
		}
		
		
		/**
		 * Select type
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void prvoideType(String typeOption) throws AcisException {
			waitForPageLoad();
			
			switch (typeOption) {
			case "Visit":
				clickWebElement(type);
				clickWebElement(typeVisit);
				waitForPageLoadTill(2);
				logger.info("Selected type Visit");
				break;
				
			default:
				logger.info("Error : No Matching Selected Type Value");
				break;
			}
			
		}
		
		
		/**
		 * Select subtype
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void prvoideSubType(String subtypeOption) throws AcisException {
			
			switch (subtypeOption) {
			case "HomeStudyVisit":
				clickWebElement(subtype);
				clickWebElement(subtypeHomeStudyVisit);
				waitForPageLoadTill(2);
				logger.info("Selected subtype child");
				break;
				
			
			default:
				logger.info("No seleted subtype");
				break;
			}
		
		}
		
		/**
		 * Select method
		 * @throws AcisException 
		 */
		public void prvoideMethod(String methodOption) throws AcisException {
			
			switch (methodOption) {
			case "Phone":
				clickWebElement(method);
				clickWebElement(methodPhone);
				waitForPageLoadTill(2);
				logger.info("Selected methhod Phone");
				break;
				
			case "VideoConference":
				clickWebElement(method);
				clickWebElement(methodVideoConference);
				waitForPageLoadTill(2);
				logger.info("Selected methhod FaceToFace");
				break;

			default:
				logger.info("No matching method option");
				break;
			}
			

		}
		
		/**
		 * Click on Save button
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void clickSavebutton() throws AcisException {
			 Actions act = new Actions(driver);
	         act.sendKeys(Keys.END).build().perform();
	         waitForPageLoadTill(5);
	         act.moveToElement(saveButtonInterview).click().perform();
				waitForPageLoadTill(5);
				waitForPageLoad();
				logger.info("clicked on Save button");
			}
		
		/**
		 * Close New Interaction
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void closeNewInteraction() throws AcisException {
			logger.info("Closing New Interaction");
			waitForElement(closeInteractionMessage);
			switchToDefaultContent();
			clickWebElemntUsingJavascriptExecutor(closeNewInteractionButton);
			waitForPageLoadTill(5);
			waitForPageLoad();
			logger.info("Closed New Interaction");
		}
		
		
		
		/**
		 * all textbox
		 * @author mrunal.s.tilekar
		 * @param textFieldName
		 * @param strValue
		 * @throws AcisException
		 */
		
		
		public void enterTextFieldValueOnInterview(String textFieldName, String strValue) throws AcisException {
			switch(textFieldName)
			{
			   case "narrative":
				   waitForElement(narrative);
					enterText(narrative, strValue);
					logger.info("narrative entered");
			      break;
			      
			   case "profesionalopinion":
				   waitForElement(professionalOpinion);
					enterText(professionalOpinion, strValue);
					logger.info("profesionalopinion entered");
			      break;
			   
			   default : 
				   logger.info("Text Field Value: " + textFieldName+"did not find");
			}
		
		}
		
		/*
		 * select attempts
		 * 
		 * @khushboo
		 * 
		 */
		public void selectAttempts(String option) throws AcisException {
			logger.info("selecting attempts");
			switch (option) {
			case "Successfull":
				clickWebElement(radioSuccessful);
				break;
			case "UnSuccessful":
				clickWebElement(radioUnsuccessful);
				break;
			default:
				logger.info("incorrect attempts");

			}
		}		
}
