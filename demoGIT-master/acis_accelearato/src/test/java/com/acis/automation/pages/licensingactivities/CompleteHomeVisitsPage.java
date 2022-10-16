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

public class CompleteHomeVisitsPage extends PageBase  {

	public CompleteHomeVisitsPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(CompleteHomeVisitsPage.class);
	
	@FindBy (xpath = "(//*[text()='Complete Home Visits'])")
    WebElement completeHomeVisitsPage;

	@FindBy(xpath = "//*[text()='Task Owner']/../../..//span[@class='test-id__field-label']")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy (xpath = "//*[contains(text(),'Household members participate in home visits and the home environment is determined to be an appropriate place to foster children')]")
    WebElement standards ;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: DCS will not license any household as a foster home unless the home environment is determined to be an appropriate place to foster children')]")
    WebElement reason;
	
	 @FindBy (xpath = "//*[contains(text(),'Perform necessary home visits with household members and upload completed copies of  Safe Questionnaires I & II')]")
	 WebElement instructionsText;
	   
	 @FindBy (xpath = "//button[@title='Click for more information']")
	 WebElement instructionsIcon;
	 
	 @FindBy (xpath = "//*[contains(text(),'Pass Threshold:  Household visits conducted, SAFE Questionnaires I & II completed by prospective foster parents and uploaded, and household determined to be an  appropriate place for children')]")
	 WebElement standardsMetIcon;
	
	@FindBy(xpath = "//span[text()='Edit Home Visit Date']")
	WebElement editHomeVisitDate;
	
	@FindBy(xpath = "(//span[text()='Select a date'])[1]")
	WebElement selectadate ;
	
	@FindBy(xpath ="(//*[text()='Select a date']/../..//*[text()='14'])[1]")
	WebElement selectdateas14;
	
	@FindBy(xpath = "//input[@placeholder='Select an Option']")
	WebElement documentTypeDropdown;
	
	@FindBy(xpath = "//span[@title='Safe Questionnaire I']")
	WebElement safeQuestionnaireI;
	
	@FindBy(xpath = "//span[@title='Safe Questionnaire II']")
	WebElement safeQuestionnaireII;
	
	@FindBy(xpath = "(//span[text()='Upload Files'])[1]")
	WebElement addFilesButton;
	
	@FindBy(xpath = "//*[text()='Select Files']")
	WebElement selectFilesTitle;
	
	@FindBy(xpath = "//button//span[text()='Upload Files']")
	WebElement uploadFilesButton;
	
	@FindBy(xpath = "//button//span[text()='Done']")
	WebElement doneButton;
	
	@FindBy(xpath = "//input[@name='docUploadDate']")
	WebElement uploadDate;
	
	@FindBy(xpath ="//*[@name='docUploadDate']/../..//*[text()='15']")
	WebElement selectdate;
	
	@FindBy(xpath = "//span[text()='Gender']")
	WebElement gender;
	
	@FindBy(xpath = "//button[@title='Edit Foster Parents determined appropriate?']")
	WebElement editFosterParentsDeterminedAppropriate;
	
	@FindBy(xpath = "(//*[contains(text(),'Foster Parents determined appropriate?')])[last()]")
	WebElement dropdownOfEditFosterParents;
	
	@FindBy(xpath = "//*[contains(text(),'Foster Parents determined appropriate?')]/../../..//*[text()='Yes']")
	WebElement editFosterParentsYes;
	
	@FindBy(xpath = "//*[contains(text(),'Foster Parents determined appropriate?')]/../../..//*[text()='No']")
	WebElement  editFosterParentsNo;
	
	@FindBy(xpath = "(//*[@class='//*[contains(text(),'Foster Parents determined appropriate?')]/../../..//*[text()='--None--']")
	WebElement editFosterParentsNone;
	
	@FindBy(xpath = "//button[@title='Edit Did all Household Members participate ?']")
	WebElement editDidHouseHoldMembersParticipate;
	
	@FindBy(xpath = "//*[contains(text(),'Did all Household Members participate ?')]")
	WebElement dropDownOfAllHouseHoldmembersParticipate;
	
	@FindBy(xpath = "//*[contains(text(),'Did all Household Members participate ?')]/../../..//*[text()='Yes']")
	WebElement allParticipateYes;
	
	@FindBy(xpath = "//*[contains(text(),'Did all Household Members participate ?')]/../../..//*[text()='No']")
	WebElement allParticipateNo;
	
	@FindBy(xpath = "//*[contains(text(),'Did all Household Members participate ?')]/../../..//*[text()='--None--']")
	WebElement allParticipateNone;
	
	@FindBy(xpath = "//button[@title='Edit Standards Met?']")
	WebElement editButtonOfStandardsMet;
	
	@FindBy(xpath = "//*[@name='standardsMet']")
	WebElement dropDownStandardsMet;
	
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
	
	/**
	 * Click  on complete Home Visits Page
	 * @author swati.malviya
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	
	 public void agreetoResourceParentRolesandResponsibilitiesTab() throws AcisException {
	        logger.info("Clicking on completeHomeVisitsPage Tab");
	        Actions act = new Actions(driver);
	        act.sendKeys(Keys.END).build().perform();
	        waitForPageLoadTill(5);
	        waitForPageLoad();
	        act.sendKeys(Keys.HOME).build().perform();
	        scrollingToElementofAPage(completeHomeVisitsPage);
	        clickWebElemntUsingJavascriptExecutor(completeHomeVisitsPage);
	        waitForPageLoadTill(5);
	        driver.navigate().refresh();
	        waitForPageLoadTill(5);
	        waitForPageLoad();
	        waitForElement(completeHomeVisitsPage);
	        logger.info("Clicked on completeHomeVisitsPage Tab");
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
	
	public void standards() throws AcisException {
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
	 * Check Instruction
	 * @author swati.malviya
	 * @throws AcisException 
	 */
	
	 public void instructions() throws AcisException  {
	        logger.info("Varifying the Instructions");
	        Assert.assertTrue(instructionsText.isDisplayed(), "Error : Instruction Message is not displayed Properly");
	        clickWebElement(instructionsIcon);
	        Assert.assertTrue(instructionsIcon.isDisplayed(), "Error : Click here for more information - Message is not displayed Properly");
	        logger.info("Varified the Instructions");
	}	
	 
	 /**
		 * Check Instruction Message
		 * @author swati.malviya
		 * @throws AcisException 
		 */

	 public void verifyInstructionMessage() throws AcisException {
	        Actions act = new Actions(driver);
	        logger.info("Checking Instruction Message");
	        Assert.assertTrue(instructionsText.isDisplayed(), "Error: Mismatch in Instruction Messages");
	        clickWebElement(taskOwner);
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        act.sendKeys(Keys.ARROW_DOWN).build().perform();
	        waitForPageLoadTill(5);
	        hoverOverElement(instructionsIcon);
	        Assert.assertTrue(instructionsIcon.isDisplayed(), "Error: Mismatch in standards help Messages");
	        logger.info("Checked Instruction Message");
	    }
	
	
	 /**
		 * Click  on date button and select date in Information
		 * @author swati.malviya
		 * @throws AcisException 
		 * @throws AWTException 
		 * @throws InterruptedException 
		 * 
		 */
	
	
	public void Information() throws AcisException, InterruptedException {
		logger.info("Clicking on editHomeVisitDate");
		clickWebElement(editHomeVisitDate);
		waitForElement(selectadate);
		clickWebElement(selectadate);
		logger.info("Clicked on selectadate ");
		waitForElement(selectdateas14);
		clickWebElement(selectdateas14);
		logger.info(" Successfully Selected a date and time");
	}
	
	 /**
	 * Click  on upload documentation button and select option
	 * @author swati.malviya
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	
	public void UploadDocumentation(String document_type) throws AcisException, InterruptedException {
		logger.info("Clicking on documentTypedropdown");
		waitForElement(documentTypeDropdown);
		clickWebElement(documentTypeDropdown);
		logger.info("Clicked on documentTypeDropdown ");
		
		if(document_type=="safeQuestionnaireI") {
			logger.info(" Clicking on safeQuestionnaireI ");
			waitForElement(safeQuestionnaireI);
			clickWebElement(safeQuestionnaireI);
			logger.info(" Clicked on safeQuestionnaireI ");
			}
		else{
			logger.info(" Clicking on safeQuestionnaireII ");
			waitForElement(safeQuestionnaireII);
			clickWebElement(safeQuestionnaireII);
			logger.info(" Clicked on safeQuestionnaireII ");
			}
		
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
	 * Select Value for : Foster Parents
	 * @author swati.malviya
	 * @throws AcisException 
	 */
		
		
	public void FosterParentsDetermined(String option) throws AcisException, InterruptedException {
		logger.info("Clicking on editFosterParentsDeterminedAppropriate");
		scrollingToElementofAPage(editFosterParentsDeterminedAppropriate);
		waitForElement(editFosterParentsDeterminedAppropriate);
		clickWebElement(editFosterParentsDeterminedAppropriate);
		waitForElement(dropdownOfEditFosterParents);
		clickWebElement(dropdownOfEditFosterParents);
	    logger.info("Clicked on editFosterParents dropdown");
		
		if(option=="--None--") {
		logger.info(" Clicking on --None-- ");
		waitForElement(editFosterParentsNone);
		clickWebElement(editFosterParentsNone);
		logger.info(" Clicked on --None-- ");
		}
		else if(option=="Yes") {
			logger.info(" Clicking on  yes");
			waitForElement(editFosterParentsYes);
			clickWebElement(editFosterParentsYes);
			logger.info(" Clicked on Yes ");
			}
		else {
			logger.info(" Clicking on No");
			waitForElement(editFosterParentsNo);
			clickWebElement(editFosterParentsNo);
			logger.info("Clicked on No");
			}
	}
		
	/**
	 * Select Value for : All Household members
	 * @author swati.malviya
	 * @throws AcisException 
	 */
		
		public void AllHouseHoldmembersParticipate(String option) throws AcisException, InterruptedException {
			logger.info("Clicking on dropDownOfAllHouseHoldmembersParticipate");
			scrollingToElementofAPage(editDidHouseHoldMembersParticipate);
			clickWebElement(editDidHouseHoldMembersParticipate);
			waitForElement(dropDownOfAllHouseHoldmembersParticipate);
			clickWebElement(dropDownOfAllHouseHoldmembersParticipate);
			logger.info("Clicked on dropDownOfAllHouseHoldmembersParticipate");
			
			if(option=="--None--") {
			logger.info(" Clicking on --None-- ");
			waitForElement(allParticipateNone);
			clickWebElement(allParticipateNone);
			logger.info(" Clicked on --None-- ");
			}
			else if(option=="Yes") {
				logger.info(" Clicking on  yes");
				waitForElement(allParticipateYes);
				clickWebElement(allParticipateYes);
				logger.info(" Clicked on Yes ");
				}
			else {
				logger.info(" Clicking on No");
				waitForElement(allParticipateNo);
				clickWebElement(allParticipateNo);
				logger.info(" Clicked on No ");
				}
		}
		
		/**
		 * Select Value for :  confirm Standards Met
		 * @author swati.malviya
		 * @throws AcisException 
		 */
			
			public void standardsMet(String standard_option) throws AcisException, InterruptedException {
				logger.info("Clicking on editButtonOfStandardsMet");
				waitForElement(editButtonOfStandardsMet);
				clickWebElement(editButtonOfStandardsMet);
				logger.info("Clicked on editButtonOfStandardsMet");
				waitForElement(dropDownStandardsMet);
				clickWebElement(dropDownStandardsMet);
				logger.info("Clicked on dropDownStandardsMet ");
				
				if(standard_option=="--None--") {
				logger.info(" Clicking on Standards Met --None-- ");
				waitForElement(noneStandardsMet);
				clickWebElement(noneStandardsMet);
				logger.info(" Clicked on Standards Met --None-- ");
				}
				
				else if(standard_option=="Meets") {
					logger.info(" Clicking on Standards Met Meets");
					waitForElement(meetsStandardsMet);
					clickWebElement(meetsStandardsMet);
					logger.info(" Clicked on Standards Met Meets ");
					}
		
				else if(standard_option=="--None--") {
					logger.info(" Clicking on Standards Met Has Concerns ");
					waitForElement(hasConcernStandardsMet);
					clickWebElement(hasConcernStandardsMet);
					logger.info(" Clicked on Standards Met Has Concerns");
					}
				
				else {
					logger.info(" Clicking on Standards Met Does not meet ");
					waitForElement(doesNotMeetStandardsMet);
					clickWebElement(doesNotMeetStandardsMet);
					logger.info("Clicked on Standards Met Does not meet");
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
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

