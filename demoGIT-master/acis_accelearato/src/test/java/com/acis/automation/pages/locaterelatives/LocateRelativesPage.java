package com.acis.automation.pages.locaterelatives;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class LocateRelativesPage extends PageBase {

	public LocateRelativesPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(LocateRelativesPage.class);

	@FindBy(xpath = "//span[text()='Ask family members']")
	WebElement askFamilyMembersBox;

	@FindBy(xpath = "//span[text()='Check public records']")
	WebElement checkPublicRecordsBox;

	@FindBy(xpath = "//span[text()='Check eligibility cases']")
	WebElement checkEligibilityCasesBox;

	@FindBy(xpath = "//span[text()='Check social media']")
	WebElement checkSocialMediaBox;

	@FindBy(xpath = "//input[@placeholder='Initials']")
	WebElement initialsText;

	@FindBy(xpath = "//h1[text()='Family Finding']")
	WebElement verifyLocateRelatives;

	@FindBy(xpath = "//button/*[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[text()='Persons Involved']")
	WebElement personsInvolvedVerify;

	@FindBy(xpath = "//*[contains(text(),'I confirm that I have adequately searched for existing relative')]")
	WebElement signatureMessage;

	@FindBy(xpath = "//*[contains(text(),'Enter initials to confirm that the checklist items above have been completed to the best of your ability')]")
	WebElement initialsMessage;

	@FindBy(xpath = "//*[contains(text(),'Check the boxes for each of the following items as you complete them')]")
	WebElement checkboxMessage;

	// Khushboo
	
	@FindBy(xpath="(//*[@data-key='down'])[3]")
	WebElement downArrow;
	
	@FindBy(xpath="//*[text()='Family Finding']")
	WebElement FamilyFinding;
	@FindBy(xpath = "//*[text()='First Name']//..//..//..//input")
	WebElement textFirstName;

	@FindBy(xpath = "//*[text()='Possible Relationship']//..//..//..//input")
	WebElement textPossibleRelationship;

	@FindBy(xpath = "//*[text()='Date/Time']//..//..//..//input")
	WebElement dateTime;
	
	@FindBy(xpath="//*[text()='20']")
	WebElement selectDate;
	
	@FindBy(xpath="(//*[text()='Successful']//..//span)[1]")
	WebElement successul;
	
	@FindBy(xpath="(//*[text()='Unsuccessful']//..//span)[1]")
	WebElement Unsucessful;
	
	@FindBy(xpath = "(//*[text()='Successful']/..//span)[1]")
	WebElement radioSuccessful;

	@FindBy(xpath = "(//*[text()='Unsuccessful']/..//span)[1]")
	WebElement radioUnsuccessful;
	

	@FindBy(xpath="//*[text()='Relatives Verification Checklists']")
	WebElement RelativesVerificationChecklists;
	
	@FindBy(xpath="(//*[contains(text(),'RVC0')])[1]")
	WebElement recordRelatives;
	
	@FindBy(xpath="(//*[text()='Related'])[last()]")
	WebElement tabRelated;	
	
	By interactionsID=By.xpath("(//*[contains(text(),'INT-00')])[last()]");
	
	/**
	 * Select CheckBox
	 * 
	 * @throws AcisException
	 */
	public void selectCheckBox(String strText) throws AcisException {
		waitForElement(verifyLocateRelatives);
		switch (strText) {
		case "Ask family members":
			clickWebElement(askFamilyMembersBox);
			logger.info("Selected CheckBox: " + strText);
			break;
		case "Check public records":
			clickWebElement(checkPublicRecordsBox);
			logger.info("Selected CheckBox: " + strText);
			break;
		case "Check eligibility cases":
			clickWebElement(checkEligibilityCasesBox);
			logger.info("Selected CheckBox: " + strText);
			break;
		case "Check social media":
			clickWebElement(checkSocialMediaBox);
			logger.info("Selected CheckBox: " + strText);
			break;
		default:
			logger.info(strText + " CheckBox not found");
			break;
		}

	}

	/***
	 * @author Dharmesh Krishna Enter Intitals on locate Relatives
	 * @throws AcisException
	 */
	public void enterInitials(String str) throws AcisException {
		waitForPageLoadTill(4);
		waitForPageLoad();
		waitForElement(verifyLocateRelatives);
		logger.info("entering input text area");

		Actions act = new Actions(driver);
		enterText(initialsText, str);
		act.sendKeys(Keys.ENTER).perform();
		logger.info("entered input area");

		waitForPageLoadTill(9);
		waitForPageLoad();
	}

	/**
	 * click next button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Next button");
		waitForElement(personsInvolvedVerify);
		logger.info("Select Meeting Location  Page loaded");
	}

	/**
	 * Check messages on this page
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void verifyMessages() {
		logger.info("Checking messages");
		waitForElement(checkboxMessage);
		waitForElement(askFamilyMembersBox);
		waitForElement(checkEligibilityCasesBox);
		waitForElement(checkPublicRecordsBox);
		waitForElement(checkSocialMediaBox);
		waitForElement(initialsMessage);
		waitForElement(signatureMessage);
		logger.info("Checked messages");
	}

	/*
	 * set first name in relative
	 * 
	 * @khushboo
	 */
	public void enterField(String option, String text) throws AcisException {
		logger.info("enter text in relative section");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(textFirstName);
		switch (option) {
		case "First Name":
			clickWebElement(textFirstName);
			enterText(textFirstName, text);
			break;
		case "Possible Relationship":
			clickWebElement(textPossibleRelationship);
			enterText(textPossibleRelationship, text);
			break;
		default:
			logger.info("not available");

		}

	}
	/*set date and time
	 * @khushboo
	 * 
	 */
	public void setDate() throws AcisException {
		logger.info("Set date");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(dateTime);
		clickWebElement(dateTime);
		clickWebElement(selectDate);
	}
	
	/*
	 * set first name in relative
	 * 
	 * @khushboo
	 */
	public void setAttempt(String option) throws AcisException {
		logger.info("enter text in relative section");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(successul);
		switch (option) {
		case "SuccessFul ":
			clickWebElement(successul);
			break;
		case "UnsuccessFul":
			clickWebElement(Unsucessful);
			break;
		default:
			logger.info("not available");

		}

	}
/*open family findings
 * @khushboo
 * 
 * 
 */
	public void openFamilyFinding() throws AcisException {
		logger.info("selecting family finding");
		
		  waitForPageLoadTill(10); 
		  driver.navigate().refresh();
		  waitForPageLoadTill(10);
		  waitForElement(downArrow);
		  clickWebElement(downArrow);
		 
			/*
			 * waitForPageLoadTill(10); Actions act=new Actions(driver);
			 * act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
			 * scrollingToElementofAPage(FamilyFinding); scrollUpTillPageStart();
			 */
		clickWebElement(FamilyFinding);
	}
	
	/**
	 * Verify Attempts options present
	 * @author mrunal.s.tilekar
	 */
	public void verifyAttemptsOption() {
		logger.info("Verifying Attempts options present");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForElement(radioSuccessful);
		waitForElement(radioUnsuccessful);
		logger.info("Verified Attempts options present");
	}

	/*check initials Text
	 * 
	 * @khushboo
	 * 
	 */
	public void checkIntialsText() throws AcisException {
		logger.info("checking initials  text");
		if(verifyElementNotPresent(initialsText)==false) {
			logger.info("no initials text  is present ");
		}
		else {
			logger.info("Element is present");
		}
}
	/*open Relatives verification checklist
	 * @khushboo
	 * 
	 * 
	 *
	 */
	public void openVerificationChecklist() throws AcisException {
		logger.info("open Relatives verification checklist");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(RelativesVerificationChecklists);
		clickWebElement(RelativesVerificationChecklists);
		waitForPageLoad();
		clickWebElement(recordRelatives);
		waitForPageLoadTill(10);
		clickWebElement(tabRelated);
		isElementPresent(interactionsID);
		
		
	}

}
