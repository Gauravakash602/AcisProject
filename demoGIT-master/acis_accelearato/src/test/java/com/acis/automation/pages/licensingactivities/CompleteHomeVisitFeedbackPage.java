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

public class CompleteHomeVisitFeedbackPage extends PageBase{

	public CompleteHomeVisitFeedbackPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(CompleteHomeVisitFeedbackPage.class);
	
	
	@FindBy (xpath = "//*[text()='Complete Home Visits']")
	WebElement completeHomeVisits;
	
	@FindBy (xpath = "//h1//*[text()='Complete Home Visits']")
	WebElement completeHomeVisitsVerify;
	
	
	
	@FindBy (xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	
	
	@FindBy (xpath = "(//span[text()='Help']/../..//button)[1]")
	WebElement standardHelpButton;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: DCS will not license any household as a foster home unless the home environment is determined to be an appropriate place to foster children.')]")
	WebElement standardHelpMessage;
	
	@FindBy (xpath = "//*[contains(text(),'Household members participate in home visits and the home environment is') and contains(text(),'determined to be an appropriate place to foster children')]")
	WebElement standardMessage;

	@FindBy(xpath = "(//*[text()='Details'])[2]")
    WebElement detailsVerify;
	
	
	
	@FindBy (xpath = "//*[contains(text(),'Perform necessary home visits with household members and upload') and contains(text(),'completed copies of  SAFE Questionnaires I, II, & Adult Child')]")
	WebElement instructionMessage;
	
	@FindBy (xpath = "//*[text()='Click for more information']/..//lightning-primitive-icon")
	WebElement instructionHelpButton;
	
	@FindBy (xpath = "//*[contains(text(),'SAFE Questionnaire I is to be completed by prospective foster') and contains(text(),'parent(s). SAFE Questionnaire II and Adult Child SAFE') and contains(text(),'Questionnaire are for Foster Care Specialist only')]")
	WebElement sentence1;
	
	@FindBy (xpath = "//*[contains(text(),'1st Visit -  Orientation and opportunity to review any open forms') and contains(text(),'on the Licensing Application.  Schedule future home visit') ]")
	WebElement sentence2;
	
	@FindBy (xpath = "//*[contains(text(),'2nd Visit - SAFE Questionnaire I completed in advance and') and contains(text(),'reviewed during visit.  Walkthrough of the home is typically') and contains(text(),'performed during 2nd visit.  Schedule future home visit.  Collect') and contains(text(),'and upload Q1')]")
	WebElement sentence3;
	
	@FindBy (xpath = "//*[contains(text(),'3rd Visit - SAFE Questionnaire II completed on site with the') and contains(text(),'prospective FC parent.  Schedule any necessary future home visits.') and contains(text(),'Collect and upload Q2.')]")
	WebElement sentence4;
	
	@FindBy (xpath = "//button[@title='Cancel']")
	WebElement instructionCancelButton;
	
	
	@FindBy (xpath ="((//*[@placeholder='Select an Option'])[1])[last()]")
	WebElement person;
	
	@FindBy (xpath ="(//*[@placeholder='Select an Option'])[1]/../..//*[text()='Stuart Little']")
	WebElement personDrop1;
	
	@FindBy (xpath ="(//*[@placeholder='Select an Option'])[1]/../..//*[text()='Stuart  Little Home']")
	WebElement personDrop2;
	
	
	
	@FindBy (xpath = "((//*[@placeholder='Select an Option'])[2])[last()]")
	WebElement documantTypeDrop;
	
	@FindBy (xpath = "((//*[@placeholder='Select an Option'])[2])[last()]/../../..//*[text()='SAFE Questionnaire I']")
	WebElement drop1;
	
	@FindBy (xpath = "((//*[@placeholder='Select an Option'])[2])[last()]/../../..//*[text()='SAFE Questionnaire II']")
	WebElement drop2;
	
	@FindBy (xpath = "((//*[@placeholder='Select an Option'])[2])[last()]/../../..//*[text()='Adult Child SAFE Questionnaire']")
	WebElement drop3;
	
	
	
	@FindBy (xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFiles;
	
	
	
	@FindBy (xpath = "(//*[@name='docUploadDate'])[last()]")
	WebElement uploadDateDrop;
	
	@FindBy (xpath = "//*[@name='docUploadDate']/../..//*[text()='15']")
	WebElement SelectuploadDate;
	
	
	
	@FindBy (xpath = "//*[text()='Interactions']")
	WebElement interactionTitle;
	
	@FindBy (xpath = "(//*[@title='New']/../..//*[text()='New'])[2]")
	WebElement interactionNewButtion;
	
	@FindBy (xpath = "//*[contains(text(),'Household members not present for any home visit')]")
	WebElement interactionReference;
	
	
	
	@FindBy (xpath = "//iframe[@title='accessibility title']")
	WebElement iFrame;
	
	
	@FindBy (xpath = "//*[@for='DateTime2']")
	WebElement dateTimeDrop;
	
	@FindBy (xpath = "//input[@id='DateTime2']/../..//*[text()='15']")
	WebElement selectDate;
	
	@FindBy (xpath = "(//span[@class='slds-radio--faux ng-scope'])[4]")
	WebElement attemptUnsuccessful;
	
	@FindBy (xpath = "//*[@for='ContactType2']")
	WebElement selectType;
	
	@FindBy (xpath = "//*[@for='ContactType2']/../..//*[text()='Visit']")
	WebElement selectVisit;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']")
	WebElement selectSubType;
	
	@FindBy (xpath = "//*[@for='SubtypeMerge']/../..//*[text()='Home Study Visit']")
	WebElement selectHomeStudyVisit;
	
	@FindBy (xpath = "//*[@id='Narrative2']")
	WebElement narrativeDrop ;
	
	@FindBy (xpath = "//*[@id='ProfessionalOpinion2']")
	WebElement professionalOpinion;
		
	@FindBy (xpath = " //*[@ng-model='p.vlcSelected']/..//span")
	WebElement checkBox;
	
	@FindBy (xpath = "//*[@class='ng-binding']/../..//*[text()='Save']")
	WebElement savePage;
	 
	@FindBy (xpath = " //*[contains(text(),'The interview details are saved. Close this tab to return to Licensing Activities') and contains(text(),'Workflow')]")
	WebElement confirmationMesssage;
	
	
	
	@FindBy (xpath = "//*[@class=\"title slds-truncate\" and text()='Complete Home Visits']")
	WebElement switchLicensingActivity;
	
	
	
	@FindBy (xpath = "//*[@title='Edit Foster Parents determined appropriate?']")
	WebElement fosterParentsdeterminedappropriateEdit;
	
	@FindBy (xpath = "//*[text()='Foster Parents determined appropriate?']/..//input")
	WebElement fosterParentsdeterminedappropriateDrop;
	
	@FindBy (xpath = "//*[text()='Foster Parents determined appropriate?']/..//*[text()='Yes']")
	WebElement fosterParentsdeterminedappropriateYes;
	
	@FindBy (xpath = "//*[text()='Foster Parents determined appropriate?']/..//*[text()='No']")
	WebElement fosterParentsdeterminedappropriateNo;
	
	@FindBy (xpath = "//*[text()='Foster Parents determined appropriate?']/..//*[text()='--None--']")
	WebElement fosterParentsdeterminedappropriateNone;
	
	
	
	@FindBy (xpath = "//*[text()='Did all Household Members participate in a visit?']/..//button")
	WebElement didAllHouseholdMembersparticipateEdit;
	
	@FindBy (xpath = "//*[text()='Did all Household Members participate in a visit?']/..//input")
	WebElement didAllHouseholdMembersparticipateDrop;
	
	@FindBy (xpath = "//*[text()='Did all Household Members participate in a visit?']/..//*[text()='No']")
	WebElement didAllHouseholdMembersparticipateNo;
	
	@FindBy (xpath = "//*[text()='Did all Household Members participate in a visit?']/..//*[text()='--None--']")
	WebElement didAllHouseholdMembersparticipateNone;
	
	@FindBy (xpath = "//*[text()='Did all Household Members participate in a visit?']/..//*[text()='Yes']")
	WebElement didAllHouseholdMembersparticipateYes;
	
	
	
	@FindBy (xpath ="//*[text()='If no, who did not participate and why?']/..//button")
	WebElement ifNoWhoDidNotParticipateAndWhyEdit;
	
	@FindBy (xpath ="//*[text()='If no, who did not participate and why?']/..//input")
	WebElement ifNoWhoDidNotParticipateAndWhyDrop;

	
	
	
	@FindBy (xpath = "//button[@title='Edit Standards Met?']")
	WebElement standardsMetEdit;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/..//*[@autocomplete='off']")
	WebElement standardsMetDrop;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='--None--']")
	WebElement standardMetNone;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Meets']")
	WebElement standardMetMeets;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Has Concerns']")
	WebElement standardMetHasConcerns;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Does not meet']")
	WebElement standardMetDoesNotMeet;
	
	
	@FindBy (xpath = "//*[@name='CancelEdit']")
	WebElement cancel;
	
	@FindBy (xpath = "//*[@name='SaveEdit']")
	WebElement save;
	
	@FindBy (xpath ="(//*[text()='Instructions'])[1]")
	WebElement verify;
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Complete Home Visits']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Complete Home Visits']");
	
	/**
	 *  Click on Complete Home Visits
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void completeHomeVisitsTab() throws AcisException {
		logger.info("Clicking on Complete Home Visits Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(completeHomeVisits);
		clickWebElement(completeHomeVisits);
		waitForPageLoadTill(5);
		waitForPageLoad();
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(completeHomeVisitsVerify);
		logger.info("Clicked on Complete Home Visits Tab");
	}
	
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void checkTaskValue(String taskValue) throws AcisException {
		clickWebElement(detailsVerify);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task Value does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Value: " + taskValue);
	}
	
	
	
	/**
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		//act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task Owner Value does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	
	 /**
	  * Verifying standards
	  * @author prateeksha.mahesh
	  * @throws AcisException
      */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		Assert.assertTrue(standardMessage.isDisplayed(), "Error: Mismatch in standards Messages");
		//clickWebElement(standardHelpButton);
		//Assert.assertTrue(standardHelpMessage.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
	
	
	
	/** Verifying Instructions 
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Assert.assertTrue(instructionMessage.isDisplayed(), "Error: Mismatch in Instructions Messages");
		waitForElement(instructionHelpButton);
		clickWebElement(instructionHelpButton);
		Assert.assertTrue(sentence1.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		Assert.assertTrue(sentence2.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		Assert.assertTrue(sentence3.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		Assert.assertTrue(sentence4.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionCancelButton);
		logger.info("Checked Instructions Message");
	}
	
	
	
	/**
	 * Click on Person/Household
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void clickOnPerson(String dropDownOption, String personName, String personNameHome) throws AcisException {
		logger.info("Selecting Person/Household");
		waitForElement(person);
		clickWebElemntUsingJavascriptExecutor(person);
		switch(dropDownOption) {
		case "Person Name":
			logger.info("Selecting " + dropDownOption);
			waitForElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../..//*[text()='"+personName+"']")));
			clickWebElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../..//*[text()='"+personName+"']")));
			logger.info("Selected " + dropDownOption);
		break;
		case "Person Name Home":
			logger.info("Selecting " + dropDownOption);
			waitForElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../..//*[text()='"+personNameHome+"']")));
			clickWebElement(driver.findElement(By.xpath("(//*[@placeholder='Select an Option'])[1]/../..//*[text()='"+personNameHome+"']")));
			logger.info("Selected " + dropDownOption);
		break;
		default:
		break;
		}	
		logger.info("Selected Person/Household");
	}
	
	
	
	
	/**
	 * Selecting Document Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void documentType(String option) throws AcisException {
		logger.info("Selecting Document Type");
		waitForElement(documantTypeDrop);
		//scrollingToElementofAPage(documantTypeDrop);
		clickWebElemntUsingJavascriptExecutor(documantTypeDrop);
		switch(option) {
		case "SAFE Questionnaire I":
			logger.info("Selecting SAFE Questionnaire I");
			waitForElement(drop1);
			clickWebElement(drop1);
			logger.info("Selected SAFE Questionnaire I");
		break;
		case "SAFE Questionnaire II":
			logger.info("Selecting SAFE Questionnaire II");
			waitForElement(drop2);
			clickWebElement(drop2);
			logger.info("Selected SAFE Questionnaire II");
		break;	
		default:
			logger.info("Selecting Adult Child SAFE Questionnaire");
			waitForElement(drop3);
			clickWebElement(drop3);
			logger.info("Selected Adult Child SAFE Questionnaire");
		break;
		}
		logger.info("Selected Document Type");
	}
	
	
	
	/** Click on upload file button and upload file
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickAddFilesAndUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(uploadFiles);
		waitForPageLoadTill(5);
		clickWebElement(uploadFiles);
		logger.info("Clicked on Upload Button");
		waitForPageLoadTill(5);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(10);
		logger.info("file uploaded successfully");
	}

	
	
	
	/**
	 * Select Interaction
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void interaction() throws AcisException {
		logger.info("Clicking on Interactions");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForElement(interactionTitle);
		clickWebElemntUsingJavascriptExecutor(interactionTitle);
		waitForPageLoadTill(10);
		waitForElement(interactionNewButtion);
		scrollingToElementofAPage(interactionNewButtion);
		clickWebElemntUsingJavascriptExecutor(interactionNewButtion);
		logger.info("Clicked on Interactions");
	}
	
	
	
	/**
	 * Click on Upload Date
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void uploadDate() throws AcisException {
		logger.info("Clicking on Upload Date");
		waitForElement(uploadDateDrop);
		//scrollingToElementofAPage(uploadDateDrop);
		clickWebElemntUsingJavascriptExecutor(uploadDateDrop);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(SelectuploadDate);
		logger.info("Clicked on Upload Date");
	}
	
	
	/**
	 * Selecting Date/Time
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void dateTime() throws AcisException {
		logger.info("Selecting Date/Time");
		waitForPageLoadTill(20);
		waitForPageLoad();
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
		clickWebElemntUsingJavascriptExecutor(selectVisit);
		logger.info("Selected Type");
	}
	
	
	
	/**
	 * Selecting Sub Type
	 * @author prateeksha.mahesh
	 * @throws AcisException  	
	 */
	public void selectSubType(String option) throws AcisException {
		logger.info("Selecting Sub Type");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//scrollingToElementofAPage(selectType);
		clickWebElemntUsingJavascriptExecutor(selectSubType);
		waitForPageLoad();
		switch(option) {
		case "Home Study Visit":
			waitForElement(selectHomeStudyVisit);
			scrollingToElementofAPage(selectHomeStudyVisit);
			clickWebElement(selectHomeStudyVisit);
		break;
		default:
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
	 * Selecting Participants
	 * @author prateeksha.mahesh
	 * @throws AcisException 	
	 */
	public void participants() throws AcisException {
		logger.info("Selecting Participants");
		scrollingToElementofAPage(checkBox);
		clickWebElemntUsingJavascriptExecutor(checkBox);
		logger.info("Selected Participants");
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
		Assert.assertTrue(confirmationMesssage.isDisplayed(), "Error: Mismatch in Confirmation Message");
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
	 * Clicking on Licensing Activity Tab
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void switchTab() throws AcisException {
		logger.info("Switching to Licensing Activity Tab");
		waitForElement(switchLicensingActivity);
		scrollingToElementofAPage(switchLicensingActivity);
		clickWebElemntUsingJavascriptExecutor(switchLicensingActivity);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Switched to Licensing Activity Tab");
	}
	
	
	/**
	 * Selecting Foster Parents determined appropriate?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void fosterParentsDeterminedAppropriate(String option) throws AcisException {
		logger.info("Selecting Foster Parents determined appropriate?");
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		act.sendKeys(Keys.ARROW_UP).build().perform();
		waitForElement(fosterParentsdeterminedappropriateEdit);
		clickWebElemntUsingJavascriptExecutor(fosterParentsdeterminedappropriateEdit);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(fosterParentsdeterminedappropriateDrop);
		
		switch(option) {
		case "Yes":
			logger.info("Selecting Yes");
			waitForElement(fosterParentsdeterminedappropriateYes);
			clickWebElement(fosterParentsdeterminedappropriateYes);
			logger.info("Selected Yes");
		break;
		case "No":
			logger.info("Selecting No");
			waitForElement(fosterParentsdeterminedappropriateNo);
			clickWebElement(fosterParentsdeterminedappropriateNo);
			logger.info("Selected No");
		break;
		default:
			logger.info("Selecting None");
			waitForElement(fosterParentsdeterminedappropriateNone);
			clickWebElement(fosterParentsdeterminedappropriateNone);
			logger.info("Selected None");
		break;
		}
		logger.info("Selected Foster Parents determined appropriate?");
	}
	
	
	
	
	/**
	 * Selecting Did all Household Members participate in a visit?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * 
	 */
	public void didAllHouseholdMembersParticipate(String option) throws AcisException {
		logger.info("Selecting - Did all Household Members participate ?");
		scrollingToElementofAPage(didAllHouseholdMembersparticipateEdit);
		clickWebElemntUsingJavascriptExecutor(didAllHouseholdMembersparticipateEdit);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(didAllHouseholdMembersparticipateDrop);
		
		switch(option) {
		case "Yes":
			logger.info("Selecting Yes");
			waitForElement(didAllHouseholdMembersparticipateYes);
			clickWebElement(didAllHouseholdMembersparticipateYes);
			logger.info("Selected Yes");
		break;
		case "No":
			logger.info("Selecting No");
			waitForElement(didAllHouseholdMembersparticipateNo);
			clickWebElement(didAllHouseholdMembersparticipateNo);
			logger.info("Selected No");
		break;
		default:
			logger.info("Selecting None");
			waitForElement(didAllHouseholdMembersparticipateNone);
			clickWebElement(didAllHouseholdMembersparticipateNone);
			logger.info("Selected None");
		break;
		}
		logger.info("Selected - Did all Household Members participate ?");
	}
	
	
	/**
	 * Select- If no, who did not participate and why?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void ifNoWhoDidNotParticipateAndWhy(String reason) throws AcisException {
		logger.info("Selecting- If no, who did not participate and why?");
		waitForElement(ifNoWhoDidNotParticipateAndWhyEdit);
		clickWebElemntUsingJavascriptExecutor(ifNoWhoDidNotParticipateAndWhyEdit);
		enterText(ifNoWhoDidNotParticipateAndWhyDrop, reason);
		logger.info("Selected- If no, who did not participate and why?");
	}
	
	/**
	 * Click On Cancel Button 
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
	 * Click On Save Button 
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
	 * Standards Met 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void selectStandardsMetValue(String option) throws AcisException {
		logger.info("Selecting Value for : Standards Met??");
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standardsMetEdit);
		clickWebElemntUsingJavascriptExecutor(standardsMetEdit);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(standardsMetDrop);
		clickWebElemntUsingJavascriptExecutor(standardsMetDrop);
		
		switch (option) {
		case "--None--":
			clickWebElement(standardMetNone);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
		
		case "Meets":
			clickWebElement(standardMetMeets);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Has Concerns":
			clickWebElement(standardMetHasConcerns);
			waitForPageLoadTill(5);
			logger.info("Selected  value: "+ option);
			break;
			
		case "Does Not Meet":
			clickWebElement(standardMetDoesNotMeet);
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
