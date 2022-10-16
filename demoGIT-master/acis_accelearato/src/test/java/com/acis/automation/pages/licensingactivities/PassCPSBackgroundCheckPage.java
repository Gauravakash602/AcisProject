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

public class PassCPSBackgroundCheckPage extends PageBase {

	public PassCPSBackgroundCheckPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(PassCPSBackgroundCheckPage.class);
	
	@FindBy (xpath = "//*[text()='Pass CPS Background Check']")
	WebElement passCPSBackgroundCheck;
	
	@FindBy (xpath = "//h1//*[text()='Pass CPS Background Check']")
	WebElement passCPSBackgroundCheckVerify;
	
	@FindBy (xpath = "//*[contains(text(),'Neither Licensed Foster Parents nor residents of the home has been indicated as a perpetrator of abuse or neglect against a child')]")
	WebElement standards;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: DCS will not place a child in a home in which any resident has indicated CPS history that would impede the foster parent')]")
	WebElement reason;
	
	@FindBy (xpath = "//*[contains(text(),'Please upload the following 1 signed copy of Indiana Request for a CPS History Check(SF 52802) form for each household member 6+ years old')]")
	WebElement instructionUpload;
	
	@FindBy (xpath = "//*[contains(text(),'For all persons ages 6 and older, please upload CPS Background Check results for every state the subject of the check has lived in the last 5 years')]")
	WebElement instructionRunBackground;
	
	@FindBy (xpath = "//*[text()='Upload Files']")
	WebElement firstUpload;

	@FindBy (xpath = "(//*[text()='Upload Files'])[2]")
	WebElement secondUpload;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]")
	WebElement selecAnOptionDropBox;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]/../../..//*[text()='Qualified']")
	WebElement dropQualified;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]/../../..//*[text()='Disqualified']")
	WebElement dropDisqualified;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]/../../..//*[text()='CPS History Waiver Granted']")
	WebElement dropCPSHistoryWaiverGranted;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[5]/../../..//*[text()='CPS History Waiver Not Granted']")
	WebElement dropCPSHistoryWaiverNotGranted;
	
	
	
	@FindBy (xpath = "//*[text()='Applicant A substantiated as a CA/N perpetrator?']/..//button")
	WebElement Applicant_A_Pen;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/..//input)[1]")
	WebElement Applicant_A_Drop;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/../..//span[contains(text(),'None')])[1]")
	WebElement  Applicant_A_None;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/../..//span[text()='Yes'])[1]")
	WebElement  Applicant_A_Yes;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/../..//span[text()='No'])[1]")
	WebElement  Applicant_A_No;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/../..//span[text()='N/A'])[1]")
	WebElement  Applicant_A_NA;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/..//input)[2]")
	WebElement Applicant_B_Drop;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/../..//span[contains(text(),'None')])[last()]")
	WebElement  Applicant_B_None;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/../..//span[text()='Yes'])[last()]")
	WebElement  Applicant_B_Yes;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/../..//span[text()='No'])[last()]")
	WebElement  Applicant_B_No;
	
	@FindBy (xpath = "(//*[contains(text(),'substantiated as a CA/N perpetrator')]/../..//span[text()='N/A'])[last()]")
	WebElement  Applicant_B_NA;
	
	
	
	@FindBy (xpath = "//*[text()='Applicant B substantiated as a CA/N perpetrator?']/..//button")
	WebElement Applicant_B_Pen;
	
	
	@FindBy (xpath = "//*[contains(text(),'Others substantiated as a perpetrators of CA/N?')]/..//button")
	WebElement othersPerpetratorsPen;
	
	@FindBy (xpath = "//*[text()='Others substantiated as a perpetrators of CA/N?']/../../..//input")
	WebElement othersPerpetratorsDrop;
	
	@FindBy (xpath = "//*[text()='Others substantiated as a perpetrators of CA/N?']/../../..//*[text()='--None--']")
	WebElement othersPerpetratorsNone;
	
	@FindBy (xpath = "//*[text()='Others substantiated as a perpetrators of CA/N?']/../../..//*[text()='Yes']")
	WebElement othersPerpetratorsYes;
	
	@FindBy (xpath = "//*[text()='Others substantiated as a perpetrators of CA/N?']/../../..//*[text()='No']")
	WebElement othersPerpetratorsNo;
	
	@FindBy (xpath = "//*[text()='Others substantiated as a perpetrators of CA/N?']/../../..//*[text()='N/A']")
	WebElement othersPerpetratorsNA;
	
	
	
	@FindBy (xpath = "//*[contains(text(),'Pass Threshold: CPS check results for applicants and residents of the home ages 6+ years verify no indications as perpetrator of child abuse or')]")
	WebElement standardsMetIcon;
	
	@FindBy (xpath = "//button[@title='Edit Standards Met?']")
	WebElement standardsMetPen ;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[@placeholder='Select an Option']")
	WebElement standardsMetDrop;

	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='--None--']")
	WebElement standardMetNone;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Meets']")
	WebElement standardMetMeets;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Has Concerns']")
	WebElement standardMetHasConcerns;
	
	@FindBy (xpath = "//*[text()='Standards Met?']/../../..//*[text()='Does not meet']")
	WebElement standardMetDoesNotMeet;
	
	
	
	@FindBy (xpath = "//button[@title='Edit Request Waiver?']")
	WebElement requestWaiverPen;
	
	@FindBy (xpath = "//*[text()='Request Waiver?']/../../..//*[@autocomplete='off']")
	WebElement requestWaiverDrop;
	
	@FindBy (xpath = "//*[text()='Request Waiver?']/../../..//*[text()='--None--']")
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
	
	@FindBy (xpath = "//*[text()='Request Variance?']/../../..//*[text()='--None--']")
	WebElement requestVarianceNone;
	
	@FindBy (xpath = "//*[text()='Request Variance?']/../../..//*[text()='Yes']")
	WebElement requestVarianceYes;
	
	@FindBy (xpath = "//*[text()='Request Variance?']/../../..//*[text()='No']")
	WebElement requestVarianceNo;
	
	
	
	@FindBy (xpath = "//button[@title='Edit Variance Request Comments']")
	WebElement varianceRequestCommentsPen;
	
	@FindBy (xpath = "//*[text()='Variance Request Comments']/../../..//*[@maxlength]")
	WebElement varianceRequestCommentsDrop;
	
	
	
	@FindBy (xpath = "//*[@name='CancelEdit']")
	WebElement cancel;
	
	@FindBy (xpath = "//*[@name='SaveEdit']")
	WebElement save;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Pass CPS Background Check']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Pass CPS Background Check']");
	
	
	/**
	 *  Click on Pass CPS Background Check
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void licensingActivityName() throws AcisException {
		logger.info("Clicking on Pass CPS Background Check");
		Actions act = new Actions(driver);
        act.sendKeys(Keys.END).build().perform();
        waitForPageLoadTill(5);
        waitForPageLoad();
        act.sendKeys(Keys.HOME).build().perform();
		waitForElement(passCPSBackgroundCheck);
		clickWebElement(passCPSBackgroundCheck);
		waitForPageLoadTill(5);
		waitForPageLoad();
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(passCPSBackgroundCheckVerify);
		logger.info("Clicked on Pass CPS Background Check");
}
	
	 /**
	  * Verifying standards
	  * @author prateeksha.mahesh
     */
	
	public void standards() {
		logger.info("Varifying the Standards");
		Assert.assertTrue(standards.isDisplayed(), "Error : Standard Message is not displayed Properly");
		Assert.assertTrue(reason.isDisplayed(), "Error : Reason Message is not displayed Properly");
		logger.info("Varified the Standards");
	
	}
	
	
	/**  Verifying Instructions of Upload Documentation
	 *  @author prateeksha.mahesh
	 */
	
	public void instructionsupload() {
		logger.info("Varifying the Instructions");
		Assert.assertTrue(instructionUpload.isDisplayed(), "Error : Instruction Message of Upload Documentation is not displayed Properly");
		logger.info("Varified the Instructions");
	}
	
	
	/**  Verifying Instructions of Run Background Check
	 *  @author prateeksha.mahesh
	 */
	public void instructionrunBackground() {
		logger.info("Varifying the Instructions");
		Assert.assertTrue(instructionRunBackground.isDisplayed(), "Error : Instruction Message of Run Background Check is not displayed Properly");
		logger.info("Varified the Instructions");
	}
	
	
	
	/**
	 * Click  on upload file button and upload file
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickOnFirstUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		logger.info("Clicking  on First upload file button and upload file");
		waitForPageLoad();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        waitForPageLoadTill(5);
        waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(firstUpload);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
		logger.info("file uploaded successfully");
	}
	
	
	/**
	 * Click  on upload file button and upload file
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	public void clickOnSecondUpload(String filepath) throws AcisException, InterruptedException, AWTException {
		logger.info("Clicking  on Second upload file button and upload file");
		waitForPageLoad();
		Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        waitForPageLoadTill(5);
        waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(secondUpload);
		uploadFileUsingRobot(filepath);
		waitForPageLoadTill(5);
		logger.info("file uploaded successfully");
		 
	}
	
	
	/**
	 * Click on Applicant A indicated CA/N perpetrator?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void results(String option) throws AcisException {
		logger.info("Clicking on Results Drop Box");
		scrollingToElementofAPage(selecAnOptionDropBox);
		waitForElement(selecAnOptionDropBox);
		clickWebElemntUsingJavascriptExecutor(selecAnOptionDropBox);
		logger.info("Clicked on Results Drop Box");
		
		switch(option) {
		
		case "Qualified":
			logger.info("Clicking on Qualified");
			waitForElement(dropQualified);
			clickWebElement(dropQualified);
			logger.info("Clicked on Qualified");
			break;
		
		case "Disqualified":
			logger.info("Clicking on Disqualified");
			waitForElement(dropDisqualified);
			clickWebElement(dropDisqualified);
			logger.info("Clicked on Disqualified");
			break;
			
		case "CPS History Waiver Granted":
			logger.info("Clicking on CPS History Waiver Granted");
			waitForElement(dropCPSHistoryWaiverGranted);
			clickWebElement(dropCPSHistoryWaiverGranted);
			logger.info("Clicked on CPS History Waiver Granted");
		break;
		
		default:
			logger.info("Clicking on CPS History Waiver Granted");
			waitForElement(dropCPSHistoryWaiverNotGranted);
			clickWebElement(dropCPSHistoryWaiverNotGranted);
			logger.info("Clicked on CPS History Waiver Granted");
			break;
		}
		
}
	
	/**
	 * Click on Applicant A indicated CA/N perpetrator?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
    public void applicant_A_Indicated_perpetrator(String applicant_A_option) throws AcisException {
    	
    	logger.info("Clicking on Applicant A indicated CA/N perpetrator? Pencil");
    	waitForPageLoad();
//    	scrollingToElementofAPage(Applicant_A_Pen);
//		waitForElement(Applicant_A_Pen);
//		clickWebElemntUsingJavascriptExecutor(Applicant_A_Pen);
//		logger.info("Clicked on Applicant A indicated CA/N perpetrator? Pencil");
//		
		logger.info("Clicking on Applicant A indicated CA/N perpetrator? DropBox");
		waitForElement(Applicant_A_Drop);
		scrollingToElementofAPage(Applicant_A_Drop);
		clickWebElemntUsingJavascriptExecutor(Applicant_A_Drop);
		waitForPageLoadTill(5);
		logger.info("Clicked on Applicant A indicated CA/N perpetrator? DropBox");
		
		switch(applicant_A_option) {
		
		case "--None--":
			logger.info("Clicking on --None--");
			waitForElement(Applicant_A_None);
			clickWebElemntUsingJavascriptExecutor(Applicant_A_None);
			logger.info("Clicked on --None--");
			break;
			
		case "Yes":
			logger.info("Clicking on Yes");
			clickWebElemntUsingJavascriptExecutor(Applicant_A_Yes);
			waitForPageLoadTill(5);
			logger.info("Clicked on Yes");
			break;	
			
			
		case "No":
			logger.info("Clicking on No");
			waitForElement(Applicant_A_No);
			clickWebElemntUsingJavascriptExecutor(Applicant_A_No);
			logger.info("Clicked on No");
			break;		
			
		default:
			logger.info("Clicking on N/A");
			waitForElement(Applicant_A_NA);
			clickWebElemntUsingJavascriptExecutor(Applicant_A_NA);
			logger.info("Clicked on N/A");	
			break;
		}
		
    }
    
	/**
	 * Click on Applicant B indicated CA/N perpetrator?
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

		public void applicant_B_Indicated_perpetrator(String applicant_B_option) throws AcisException {
	    	
	    	logger.info("Clicking on Applicant B indicated CA/N perpetrator? Pencil");
	    	waitForPageLoad();
//	    	scrollingToElementofAPage(Applicant_B_Pen);
//			waitForElement(Applicant_B_Pen);
//			clickWebElemntUsingJavascriptExecutor(Applicant_B_Pen);
//			logger.info("Clicked on Applicant B indicated CA/N perpetrator? Pencil");
			
			logger.info("Clicking on Applicant B indicated CA/N perpetrator? DropBox");
			waitForElement(Applicant_B_Drop);
			scrollingToElementofAPage(Applicant_B_Drop);
			clickWebElemntUsingJavascriptExecutor(Applicant_B_Drop);
			waitForPageLoadTill(5);
			logger.info("Clicked on Applicant B indicated CA/N perpetrator? DropBox");
			
			switch(applicant_B_option) {
			
			case "--None--":
				logger.info("Clicking on --None--");
				waitForElement(Applicant_B_None);
				clickWebElemntUsingJavascriptExecutor(Applicant_B_None);
				logger.info("Clicked on --None--");
				break;
				
			case "Yes":
				logger.info("Clicking on Yes");
				waitForElement(Applicant_B_Yes);
				clickWebElemntUsingJavascriptExecutor(Applicant_B_Yes);
				logger.info("Clicked on Yes");
				break;	
				
			case "No":
				logger.info("Clicking on No");
				waitForElement(Applicant_B_No);
				clickWebElemntUsingJavascriptExecutor(Applicant_B_No);
				logger.info("Clicked on No");
				break;		
				
			default:
				logger.info("Clicking on N/A");
				waitForElement(Applicant_B_NA);
				clickWebElemntUsingJavascriptExecutor(Applicant_B_NA);
				logger.info("Clicked on N/A");	
				break;
			}	
		
    }
		
		/**
		 * Click on Others indicated perpetrators of CA/N?
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */
		
		public void OthersIndicatedPerpetrators(String applicant_B_option) throws AcisException {
	    	
	    	logger.info("Clicking on Others indicated perpetrators of CA/N? Pen");
	    	scrollingToElementofAPage(othersPerpetratorsPen);
			waitForElement(othersPerpetratorsPen);
			clickWebElemntUsingJavascriptExecutor(othersPerpetratorsPen);
			logger.info("Clicked on Others indicated perpetrators of CA/N? Pen");
			
			logger.info("Clicking on Others indicated perpetrators of CA/N? DropBox");
			waitForElement(othersPerpetratorsDrop);
			clickWebElemntUsingJavascriptExecutor(othersPerpetratorsDrop);
			logger.info("Clicked on Others indicated perpetrators of CA/N? DropBox");
			
			switch(applicant_B_option) {
			
			case "--None--":
				logger.info("Clicking on --None--");
				waitForElement(othersPerpetratorsNone);
				clickWebElemntUsingJavascriptExecutor(othersPerpetratorsNone);
				logger.info("Clicked on --None--");
				break;
				
			case "Yes":
				logger.info("Clicking on Yes");
				waitForElement(othersPerpetratorsYes);
				clickWebElemntUsingJavascriptExecutor(othersPerpetratorsYes);
				logger.info("Clicked on Yes");
				break;	
				
			case "No":
				logger.info("Clicking on No");
				waitForElement(othersPerpetratorsNo);
				clickWebElemntUsingJavascriptExecutor(othersPerpetratorsNo);
				logger.info("Clicked on No");
				break;		
				
			default:
				logger.info("Clicking on N/A");
				waitForElement(othersPerpetratorsNA);
				clickWebElemntUsingJavascriptExecutor(othersPerpetratorsNA);
				logger.info("Clicked on N/A");	
				break;
			}	
    }
     
		/**
		 * Standards Met 
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */
		
		public void standardsMet(String standard_option) throws AcisException {
			
				logger.info("Clicking on Standards Met Pencil");
				scrollingToElementofAPage(standardsMetPen);
				waitForElement(standardsMetPen);
				clickWebElemntUsingJavascriptExecutor(standardsMetPen);
				logger.info("Clicked on Standards Met Pencil");
				
				logger.info("Clicking on Standards Met Drop Box");
				waitForElement(standardsMetDrop);
				clickWebElemntUsingJavascriptExecutor(standardsMetDrop);
				logger.info("Clicked on Standards Met Drop Box");
				
				if(standard_option=="--None--") {
					logger.info("Clicking on Standards Met --None--");
					waitForElement(standardMetNone);
					clickWebElemntUsingJavascriptExecutor(standardMetNone);
					logger.info("Clicked on Standards Met --None--");
				}
				
				else if(standard_option=="Meets") {
					logger.info("Clicking on Standards Met Meets");
					waitForElement(standardMetMeets);
					clickWebElemntUsingJavascriptExecutor(standardMetMeets);
					logger.info("Clicked on Standards Met Meets");
				}
				
				else if(standard_option=="Has Concerns") {
					logger.info("Clicking on Standards Met Has Concerns");
					waitForElement(standardMetHasConcerns);
					clickWebElemntUsingJavascriptExecutor(standardMetHasConcerns);
					logger.info("Clicked on Standards Met Has Concerns");
				}
				
				else {
					logger.info("Clicking on Standards Met Does not meet");
					waitForElement(standardMetDoesNotMeet);
					clickWebElemntUsingJavascriptExecutor(standardMetDoesNotMeet);
					logger.info("Clicked on Standards Met Does not meet");
				}
			}
		
		/**
		 * For Request Waiver? 
		 * @author prateeksha.mahesh
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
				clickWebElement(requestWaiverNone);
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
		 * @author prateeksha.mahesh
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
		 * @author prateeksha.mahesh
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
		 * @author prateeksha.mahesh
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
		 * Click On Cancel Button 
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */		
		  public void cancelButton() throws AcisException {
			logger.info("Clicking on Cancel");
			waitForElement(cancel);
			clickWebElemntUsingJavascriptExecutor(cancel);
			logger.info("Clicked on Cancel");
		}

		  
		  /**
			 * Click On Save Button 
			 * @author prateeksha.mahesh
			 * @throws AcisException 
			 */
	 
		  public void saveButton() throws AcisException {
			logger.info("Clicking on Save");
			scrollingToElementofAPage(save);
			waitForElement(save);
			clickWebElemntUsingJavascriptExecutor(save);
			logger.info("Clicked on Save");
		} 
		  
		  
		   /**
			 *  Check Task Owner Value
			 * @author prateeksha.mahesh
			 */

		  public void checkTaskOwnerValue(String taskOwnerValue) {
				logger.info("Check Task Owner Value: " + taskOwnerValue);
				Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
											+ "Expected Value: " + taskOwnerValue);
				logger.info("Checked Task Owner Value: " + taskOwnerValue);
			}
		  
		
		 
		  public void checkTaskValue(String taskValue) {
		        logger.info("Check Task Value: " + taskValue);
		        Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText()
		                                    + "Expected Value: " + taskValue);
		        logger.info("Checked Task Value: " + taskValue);
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
    
    
	
	
