package com.acis.automation.pages.interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ConductStaffingPage extends PageBase{

	public ConductStaffingPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(ConductStaffingPage.class);
	
	@FindBy (xpath = "//*[@title='Select List View']")
	WebElement dropDown;
	
	@FindBy (xpath = "//*[@data-label='Insights']/../..//*[text()='Insights']")
	WebElement insightsTab;
	
	@FindBy (xpath = "//button[@type='button']/../..//*[text()='New']")
	WebElement newTab;
	
	@FindBy (xpath = "//*[text()='Meeting']")
	WebElement radioMeeting;
	
	@FindBy (xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy (xpath = "//*[@for='DateTime2']")
	WebElement dateTimeDrop;
	
	@FindBy (xpath = "//input[@id='DateTime2']/../..//*[text()='15']")
	WebElement selectDate;
	
	@FindBy (xpath = "//*[@for='ContactType2']")
	WebElement selectType;
	
	@FindBy (xpath = "//*[@for='ContactType2']/../..//*[text()='Meeting']")
	WebElement selectMeeting;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']")
	WebElement selectSubType;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']/../..//*[text()='Case Plan Review']")
	WebElement selectCasePlanReview;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']/../..//*[text()='Court Hearing']")
	WebElement selectCourtHearing;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']/../..//*[text()='Recruiting']")
	WebElement selectRecruiting;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']/../..//*[text()='Case Transfer']")
	WebElement selectCaseTransfer;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']/../..//*[text()='Verbal Agreement']")
	WebElement selectVerbalAgreement;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']/../..//*[text()='Staffing']")
	WebElement selectStaffing;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']/../..//*[text()='-- Clear --']")
	WebElement selectclear;
	
	@FindBy (xpath = "//*[@id='Narrative2']")
	WebElement narrativeDrop ;
	
	@FindBy (xpath = "//*[@id='ProfessionalOpinion2']")
	WebElement professionalOpinion;
	
	@FindBy (xpath = "//*[text()='Unsuccessful']")
	WebElement attemptUnsuccessful;
	
	@FindBy (xpath = "//label[@for='Participants']")
	WebElement regardingLabel;
	
	@FindBy (xpath = "//*[@class='ng-binding']/../..//*[text()='New']")
	WebElement participantsNewButton;
	
	@FindBy (xpath = "(//*[@ng-trim='false'])[2]")
	WebElement participantsUserName;
	
	@FindBy (xpath = "//*[@ng-click='saveEditChanges($event)']")
	WebElement participantsSave;
	
	@FindBy (xpath = "//*[contains(text(),'The interview details are saved. Close this tab to return to the investigation workflow')]")
	WebElement confirmationMessage;
	
	@FindBy (xpath = "//*[@class='ng-binding']/../..//*[text()='Save']")
	WebElement savePage;

	@FindBy (xpath = "(//*[contains(@title,'INT')])[1]")
	WebElement interactionID;

	@FindBy (xpath = "(//*[@title='Interactions'])[2]")
	WebElement interaction;
	
	@FindBy (xpath = "(//*[@data-tab-value='relatedListsTab']/../..//*[text()='Related'])[2]")
	WebElement interactionRelated;
	
	@FindBy (xpath = "(//*[@title='Users'])[2]")
	WebElement verifyUserAdded;
	
	@FindBy (xpath = "//*[@title='Automated Process']")
	WebElement automatedProcesstitle;
	
	@FindBy (xpath = "//h1//*[text()='Automated Process']")
	WebElement automatedProcessVerify;
	
	@FindBy (xpath = "//iframe[@title='accessibility title']")
	WebElement iFrame;
	
	@FindBy (xpath = " (//*[text()='Select']/../../..//span)[last()]")
	WebElement checkBox;
	
	@FindBy (xpath = "//a[@role='menuitem'][contains(.,'Automated Process')]")
	WebElement automatedProcess;
	
	@FindBy (xpath = "//*[@title='Interactions']/..//*[text()='Interactions']")
	WebElement interactionTitle;
	
	@FindBy (xpath = "(//*[@title='Schedule Meeting']/../../..//*[text()='New'])[2]")
	WebElement newInteraction;
	
	
	@FindBy (xpath = "(//*[@class=' virtualAutocompleteOptionText']/../..//*[text()='Kinship Placement Resource Accounts'])[1]")
	WebElement fosterAccount;

	@FindBy (xpath = "(//*[@class=' virtualAutocompleteOptionText'])[1]")
	WebElement selectAll;
	
	@FindBy (xpath = "//*[@data-tab-value='relatedListsTab']/..//*[text()='Related']")
	WebElement relatedTab;

	@FindBy (xpath = "(//*[@title='New Meeting']/..//*[text()='New Meeting'])[2]")
	WebElement newMeeting;
	

	
	
	
	/**
	 * Selecting Insights Tab
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	public void insightsTab() throws AcisException {
		logger.info("Selecting Insights Tab");
		waitForElement(insightsTab);
		clickWebElemntUsingJavascriptExecutor(insightsTab);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(15);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(10);
		waitForPageLoad();
		scrollingToElementofAPage(interactionTitle);
		clickWebElemntUsingJavascriptExecutor(interactionTitle);
		waitForPageLoadTill(10);
		logger.info("Selected Insights Tab");
	}
	
	
	/**
	 * Selecting Interaction
	 * 	@author prateeksha.mahesh
	 * @throws AcisException  
	*/
	public void interactions() throws AcisException {
		logger.info("Clicking on New Button");
		waitForElement(newInteraction);
		clickWebElement(newInteraction);
		logger.info("Clicked on New Button");
		waitForPageLoadTill(10);
		logger.info("Selecting New Interaction");
		waitForElement(radioMeeting);
		clickWebElemntUsingJavascriptExecutor(radioMeeting);
		waitForElement(nextButton);
		clickWebElement(nextButton);
		logger.info("Selected New Interaction");
	   	waitForPageLoadTill(20);
	   	waitForPageLoad();
	}


	
	/**
	 * Selecting Date/Time
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void dateTime() throws AcisException {
		logger.info("Selecting Date/Time");
        waitForPageLoad();
        scrollingToElementofAPage(dateTimeDrop);
		clickWebElemntUsingJavascriptExecutor(dateTimeDrop);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(selectDate);
		logger.info("Selected Date/Time");
	}
	
	
	
	/**
	 * Selecting Attempt
	 * @author prateeksha.mahesh
	 * @throws AcisException 	
	 */
	public void attempt() throws AcisException {
		logger.info("Selecting Attempt");
		waitForElementClickable(attemptUnsuccessful);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(attemptUnsuccessful);
		logger.info("Selected Attempt");
	}

	
	
	/**
	 * Selecting Type
	 * @author prateeksha.mahesh
	 * @throws AcisException  	
	 */
	public void selectType() throws AcisException {
		logger.info("Selecting Type");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//scrollingToElementofAPage(selectType);
		clickWebElemntUsingJavascriptExecutor(selectType);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(selectMeeting);
		logger.info("Selected Type");
	}
	
	
	
	/**
	 * Selecting SubType
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 	
	 */
	public void selectSubType(String option) throws AcisException {
		logger.info("Selecting Sub Type");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//scrollingToElementofAPage(selectSubType);
		clickWebElemntUsingJavascriptExecutor(selectSubType);
		waitForPageLoadTill(5);
		
		switch(option) {
		case "Case Plan Review":
			logger.info("Selecting Case Plan Review");	
			waitForElement(selectCasePlanReview);
			clickWebElement(selectCasePlanReview);
			waitForPageLoad();
			logger.info("Selected Case Plan Review");
		break;
		
		case "Court Hearing":
			logger.info("Selecting Court Hearing");	
			waitForElement(selectCourtHearing);
			clickWebElement(selectCourtHearing);
			waitForPageLoad();
			logger.info("Selected Court Hearing");
		break;
		
		case "Recruiting":
			logger.info("Selecting Recruiting");	
			waitForElement(selectRecruiting);
			clickWebElement(selectRecruiting);
			waitForPageLoad();
			logger.info("Selected Recruiting");
		break;
		
		case "Case Transfer":
			logger.info("Selecting Case Transfer");	
			waitForElement(selectCaseTransfer);
			clickWebElement(selectCaseTransfer);
			waitForPageLoad();
			logger.info("Selected Case Transfer");
		break;
		
		case "Verbal Agreement":
			logger.info("Selecting Verbal Agreement");	
			waitForElement(selectVerbalAgreement);
			clickWebElement(selectVerbalAgreement);
			waitForPageLoad();
			logger.info("Selected Verbal Agreement");
		break;
		
		case "Staffing":
			logger.info("Selecting Staffing");	
			waitForElement(selectStaffing);
			clickWebElement(selectStaffing);
			waitForPageLoad();
			logger.info("Selected Staffing");
		break;
		
		default:
			logger.info("Selecting Clear");	
			waitForElement(selectclear);
			clickWebElement(selectclear);
			waitForPageLoad();
			logger.info("Selected Clear");
			break;
		}
		logger.info("Selected Sub Type");
	}
	
	
	
	/**
	 * Selecting Narrative
	 * @author prateeksha.mahesh	
	 * @throws AcisException 
	 */
	public void narrative(String text) throws AcisException {
		logger.info("Selecting Narrative");
		logger.info("Entering Text in Narrative field");
		enterText(narrativeDrop, text);
		logger.info("Entered Text in Narrative field");	
		waitForPageLoadTill(5);
		logger.info("Selected Narrative");	
	}

	
	
	/**
	 * Selecting professional Opinion
	 * @author prateeksha.mahesh	
	 * @throws AcisException 
	 */
	public void professionalOpinion(String text) throws AcisException {
		logger.info("Selecting Professional Opinion");
		logger.info("Entering Text in Professional Opinion field");
		enterText(professionalOpinion, text);
		logger.info("Entered Text in Professional Opinion field");	
		waitForPageLoadTill(5);
		logger.info("Selected Professional Opinion");	
	}	
	
	
	
	/**
	 * Verifying Regarding Section
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 	
	 */
	public void regarding() throws AcisException {
		logger.info("Verifying Regarding Section");
		scrollingToElementofAPage(checkBox);
		clickWebElemntUsingJavascriptExecutor(checkBox);
		logger.info("Verified Regarding Section");
	}
	
	
	/**
	 * Adding Participants
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 	
	 */
	public void participants(String text) throws AcisException {
		logger.info("Adding Participants");
		waitForElement(participantsNewButton);
		clickWebElement(participantsNewButton);
		scrollingToElementofAPage(participantsUserName);
		clickWebElemntUsingJavascriptExecutor(participantsUserName);
		logger.info("Entering User Name");
		waitForPageLoadTill(10);
		enterText(participantsUserName, text);
		waitForElement(automatedProcess);
		clickWebElemntUsingJavascriptExecutor(automatedProcess);
		logger.info("Entered User Name");	
		waitForPageLoadTill(5);
		logger.info("Clicking on Save");
		waitForElement(participantsSave);
		clickWebElement(participantsSave);
		logger.info("Clicked on Save");
		logger.info("Participants are Added");
	}
	
	
	
	/**
	 * Clicking on Save Button of the page
	 * 	@author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void saveButton() throws AcisException {
		logger.info("Clicking on Save Button of the page");
		waitForElement(savePage);
		clickWebElement(savePage);
		logger.info("Clicked on Save Button of the page");
	}
	
	
	
	/**
	 * Verifying Confirmation Message
	 * @author prateeksha.mahesh	
	 */
	public void confirmationMessage() {
		logger.info("Verifying Confirmation Message");
		waitForPageLoadTill(20);
		Assert.assertTrue(confirmationMessage.isDisplayed(), "Error: Mismatch in Confirmation Message");
		logger.info("Verified Confirmation Message");
	}
	
	
	
	/**
	 * Switching to IFrame
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */	
	public void iframeSwitch() throws AcisException {
		logger.info("Switching to iframe");			
		switchToFrameByWebElement(iFrame);
		logger.info("Switched to iframe");	
	}

	
	
	/**
	 * Verifying Added Users on User related list on Interaction
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void verifyingUsers() throws AcisException {
		logger.info("Verifying Added Users on User related list on Interaction");
//		waitForElement(interaction);
//		clickWebElemntUsingJavascriptExecutor(interaction);
		waitForPageLoadTill(10);
		waitForElement(interactionID);
		clickWebElemntUsingJavascriptExecutor(interactionID);
		waitForPageLoadTill(10);
		clickWebElemntUsingJavascriptExecutor(interactionRelated);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(10);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(verifyUserAdded);
		waitForPageLoadTill(10);
		clickWebElemntUsingJavascriptExecutor(automatedProcesstitle);
		waitForPageLoadTill(5);
		waitForElement(automatedProcessVerify);
		logger.info("Verified Added Users on User related list on Interaction");	
	}
	
	
	
	/**
	 * Selecting Foster Parent Account option from DropDown
	 * 	@author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void allOptionForFosterParent() throws AcisException {
		logger.info("Selecting Foster Parent Account option from DropDown");
		scrollingToElementofAPage(dropDown);
		clickWebElemntUsingJavascriptExecutor(dropDown);
		waitForPageLoad();
		waitForElement(fosterAccount);
		clickWebElemntUsingJavascriptExecutor(fosterAccount);
		logger.info("Selected Foster Parent Account option from DropDown");
		waitForPageLoad();
	}
	
		
		
	/**
	 * Selecting Related Tab
	 * @author prateeksha.mahesh
	 * @throws AcisException
	 */
	Actions act = new Actions(driver);
	public void relatedTab() throws AcisException {
		logger.info("Selecting Related Tab");
		waitForElement(relatedTab);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(15);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(10);
		waitForPageLoad();
		scrollingToElementofAPage(interactionTitle);
		clickWebElemntUsingJavascriptExecutor(interactionTitle);
		waitForPageLoadTill(10);
		logger.info("Selected Related Tab");
	}
		
		
	/**
	 * Selecting New Meeting of Interactions
	 * @author prateeksha.mahesh
	 * @throws AcisException  
	 */
	public void interactionsForPlacementResource() throws AcisException {
		logger.info("Clicking on New Meeting");
		waitForElement(newMeeting);
		clickWebElemntUsingJavascriptExecutor(newMeeting);
		waitForPageLoadTill(20);
		logger.info("Clicked on New Meeting");
	}
}
