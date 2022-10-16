package com.acis.automation.pages.interaction;

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

public class MeetingTypeInteractionPage  extends PageBase{

	public MeetingTypeInteractionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(MeetingTypeInteractionPage.class);
	
	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;
	
	@FindBy(xpath = "//input[@id='DateTime2']")
	WebElement interviewDateTime;
	
	@FindBy(xpath = "//span[text()='15']")
	WebElement date;
	
	@FindBy(xpath = "//select[@id='Location2']")
	WebElement location;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Foster Home']")
	WebElement locationFosterHome;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Biological Home']")
	WebElement locationBiologicalHome;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='DCS Office']")
	WebElement locationDcsOffice;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Service Provider']")
	WebElement locationServiceProvider;
	
	@FindBy(xpath = "//select[@id='Method2']")
	WebElement method;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Teleconference']")
	WebElement methodPhone;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Video Conference']")
	WebElement methodVideoConference;
	
	@FindBy(xpath = "//select[@id='SubtypeMerge']")
	WebElement subtype;
	
	@FindBy(xpath = "//select[@id='SubtypeMerge']//*[text()='Case Plan Review']")
	WebElement subtypeCasePlanReview;
	
	
	@FindBy(xpath = "//select[@id='ContactType2']")
	WebElement type;

	@FindBy(xpath = "//select[@id='ContactType2']//option[text()='Meeting']")
	WebElement typeMeeting;
	
	@FindBy(xpath = "//div[@id='Interviews_nextBtn']")
	WebElement saveButtonInterview;
	
	@FindBy(xpath = "//label[contains(text(),'Participants')]")
	WebElement participants;
	
	@FindBy(xpath = "(//*[@id='Participants']//input[@type='checkbox']//following-sibling::span)[1]")
	WebElement firstParticipantsCheckbox;
	
	@FindBy(xpath = "//button[@title='Close New Interaction']")
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
		try {
		clickWebElement(driver.findElement(By.xpath("//td[contains(text(),'"+participantName+"')]//preceding-sibling::td//span")));
		}
		catch (Exception e) {
			String nameList[]= participantName.split(" ");
			String firstName = nameList[0];
			String lastName = nameList[nameList.length -1];
			clickWebElement(driver.findElement(By.xpath("//td[contains(text(),'"+ firstName+"') and contains(text(),'"+ lastName+"')]//preceding-sibling::td//span")));
		
		}
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
		case "Meeting":
			clickWebElement(type);
			clickWebElement(typeMeeting);
			waitForPageLoadTill(2);
			logger.info("Selected type Visit");
			break;
			
		default:
			logger.info("Error : No Matching Selected Type Value");
			break;
		}
		
	}
	
	/**
	 * Select location
	 * @throws AcisException 
	 */
	public void prvoideLocation(String locationOption) throws AcisException {
		
		switch (locationOption) {
		case "Foster Home":
			clickWebElement(location);
			clickWebElement(locationFosterHome);
			waitForPageLoadTill(2);
			logger.info("Selected location Foster Home");	
			break;
			
		case "Biological Home":
			clickWebElement(location);
			clickWebElement(locationBiologicalHome);
			waitForPageLoadTill(2);
			logger.info("Selected location Biological Home");	
			break;
			
		case "DCS Office":
			clickWebElement(location);
			clickWebElement(locationDcsOffice);
			waitForPageLoadTill(2);
			logger.info("Selected location DCS office");	
			break;
			
		case "Service Provider":
			clickWebElement(location);
			clickWebElement(locationServiceProvider);
			waitForPageLoadTill(2);
			logger.info("Selected location Service Provider");	
			break;

		default:
			logger.info("No matching location value");	
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
		case "CasePlanReview":
			clickWebElement(subtype);
			clickWebElement(subtypeCasePlanReview);
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
     //    act.moveToElement(saveButtonInterview).click().perform();
         clickWebElement(saveButtonInterview);
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
	
	/**
	 * Check participant not present
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void checkParticipantNotPresent(String participantName) throws AcisException {
		logger.info("Checking participant not present");
		Assert.assertTrue((isElementPresent(By.xpath("//label[@for='Participants']/..//td[text()='"+participantName+"']")))==false , " Error: Participant name :" + participantName + "Present under participants");
		logger.info("Checked participant not present");
	}
	
	/**
	 * Verify Attempts options present
	 * @author mrunal.s.tilekar
	 */
	public void verifyAttemptsOption() {
		logger.info("Verifying Attempts options present");
		waitForElement(radioSuccessful);
		waitForElement(radioUnsuccessful);
		logger.info("Verified Attempts options present");
	}
	
}
