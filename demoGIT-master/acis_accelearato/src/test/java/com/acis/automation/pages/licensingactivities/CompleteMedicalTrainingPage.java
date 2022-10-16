package com.acis.automation.pages.licensingactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CompleteMedicalTrainingPage extends PageBase{

	public CompleteMedicalTrainingPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(CompleteMedicalTrainingPage.class);
	
	@FindBy (xpath = "//*[text()='Complete Medical Training']")
	WebElement completeMedicalTraining;
	
	@FindBy (xpath = "//h1//*[text()='Complete Medical Training']")
	WebElement completeMedicalTrainingVerify;
	
	@FindBy (xpath = "//*[contains(text(),'The prospective foster parents complete CPR, First Aid, and Blood Born Pathogens/ Universal Precautions Trainings')]")
	WebElement standards;
	
	@FindBy (xpath = "//*[contains(text(),'Reason: To ensure Foster Parents have proper medical training before fostering children')]")
	WebElement reason;
	
	@FindBy (xpath = "//*[contains(text(),'Complete CPR, First Aid, and Blood Born Pathogens/ Universal Precautions Trainings and upload training certification documentation')]")
	WebElement instruction;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]")
	WebElement trainingTypeDropBox;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='CPR']")
	WebElement dropCPR;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='First Aid']")
	WebElement dropFirstAid;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Blood Borne Pathogens / Universal Precautions']")
	WebElement dropBloodBornePathogens;
	
	@FindBy (xpath = "(//*[@placeholder='Select an Option'])[2]/../../..//*[text()='Other']")
	WebElement dropOthers;
	
	@FindBy (xpath = "(//*[@name='0'])[3]")
	WebElement completionDateDropBox;
	
	@FindBy (xpath = "(//*[@name='0'])[3]/../..//*[text()='4']")
	WebElement completionDate;
	
	
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAcompletedmedicaltraining__c']")
	WebElement applicant_A_CompletedMedicalTrainingDrop;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAcompletedmedicaltraining__c']/../../..//*[text()='N/A']")
	WebElement applicant_A_CompletedMedicalTrainingNA;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAcompletedmedicaltraining__c']/../../..//*[text()='--None--']")
	WebElement applicant_A_CompletedMedicalTrainingNone;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAcompletedmedicaltraining__c']/../../..//*[text()='Yes']")
	WebElement applicant_A_CompletedMedicalTrainingYes;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAcompletedmedicaltraining__c']/../../..//*[text()='No']")
	WebElement applicant_A_CompletedMedicalTrainingNo;
	
	
	
	
	
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBcompletedmedicaltraining__c']")
	WebElement applicant_B_CompletedMedicalTrainingDrop;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBcompletedmedicaltraining__c']/../../..//*[text()='N/A']")
	WebElement applicant_B_CompletedMedicalTrainingNA;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBcompletedmedicaltraining__c']/../../..//*[text()='--None--']")
	WebElement applicant_B_CompletedMedicalTrainingNone;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBcompletedmedicaltraining__c']/../../..//*[text()='Yes']")
	WebElement applicant_B_CompletedMedicalTrainingYes;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBcompletedmedicaltraining__c']/../../..//*[text()='No']")
	WebElement applicant_B_CompletedMedicalTrainingNo;
	
	
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAmeetswithwaivervariance__c']")
	WebElement applicant_A_withWaiverVarianceDrop;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAmeetswithwaivervariance__c']/../../..//*[text()='N/A']")
	WebElement applicant_A_withWaiverVarianceNA;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAmeetswithwaivervariance__c']/../../..//*[text()='--None--']")
	WebElement applicant_A_withWaiverVarianceNone;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAmeetswithwaivervariance__c']/../../..//*[text()='Yes']")
	WebElement applicant_A_withWaiverVarianceYes;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantAmeetswithwaivervariance__c']/../../..//*[text()='No']")
	WebElement applicant_A_withWaiverVarianceNo;
	
	
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBmeetswithwaivervariance__c']")
	WebElement applicant_B_withWaiverVarianceDrop;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBmeetswithwaivervariance__c']/../../..//*[text()='N/A']")
	WebElement applicant_B_withWaiverVarianceNA;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBmeetswithwaivervariance__c']/../../..//*[text()='--None--']")
	WebElement applicant_B_withWaiverVarianceNone;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBmeetswithwaivervariance__c']/../../..//*[text()='Yes']")
	WebElement applicant_B_withWaiverVarianceYes;
	
	@FindBy (xpath = "//*[@name='ACIS_ApplicantBmeetswithwaivervariance__c']/../../..//*[text()='No']")
	WebElement applicant_B_withWaiverVarianceNo;
	
	
	
	@FindBy (xpath = "//*[contains(text(),'Pass Threshold:')]")
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
	
	@FindBy (xpath = "//*[@name='CancelEdit']")
	WebElement cancel;
	
	@FindBy (xpath = "//*[@name='SaveEdit']")
	WebElement save;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[contains(@title,'Close Complete Medical Training')]")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[contains(@title,'Close Complete Medical Training')]");
	
	/**
	 *  Click on Complete Medical Training
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */

	public void licensingActivityName() throws AcisException {
		logger.info("Clicking on Complete Medical Training");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(completeMedicalTraining);
		clickWebElemntUsingJavascriptExecutor(completeMedicalTraining);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(completeMedicalTrainingVerify);
		logger.info("Clicked on Complete Medical Training");
	
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
	
	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 */

	public void instructions() {
		logger.info("Varifying the Instructions");
		Assert.assertTrue(instruction.isDisplayed(), "Error : Instruction Message is not displayed Properly");
		logger.info("Varified the Instructions");
	}
	
	
	/**
	 * Click on Training Type
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */ 
	
	 public void trainingType(String option) throws AcisException{
		 
			logger.info("Clicking on Training Type DropBox");
			waitForElement(trainingTypeDropBox);
			clickWebElement(trainingTypeDropBox);
			logger.info("Clicked on Training Type DropBox");
			
				switch (option) {
				
				case "CPR":
					logger.info("Clicking on CPR");
					waitForElement(dropCPR);
					clickWebElement(dropCPR);
					logger.info("Clicked on CPR");
					break;
					
				case "First Aid":
					logger.info("Clicking on First Aid");
					waitForElement(dropFirstAid);
					clickWebElement(dropFirstAid);
					logger.info("Clicked on Suffix First Aid");
					break;
					
				case "Blood Borne Pathogens / Universal Precautions":
					logger.info("Clicking on Blood Borne Pathogens / Universal Precautions");
					waitForElement(dropBloodBornePathogens);
					clickWebElement(dropBloodBornePathogens);
					logger.info("Clicked on Blood Borne Pathogens / Universal Precautions");
					break;
					
				default:
					logger.info("Clicking on Other");
					waitForElement(dropOthers);
					clickWebElement(dropOthers);
					logger.info("Clicked on Other");	
					break;	
				}
	 }
	 
	 
		/**
		 * Click on Completion Date
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */ 
	 
		public void completionDate() throws AcisException {
			logger.info("Clicking on Completion Date DropBox");
			waitForElement(completionDateDropBox);
			clickWebElement(completionDateDropBox);
			logger.info("Clicked on Completion Date DropBox");
			
			logger.info("Clicking on Completion Date");
			waitForElement(completionDate);
			clickWebElement(completionDate);
			logger.info("Clicked on Completion Date");
		}

		
		/**
		 * Click on Applicant A completed medical training?
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */

		public void applicant_A_CompletedMedicalTraining(String option) throws AcisException {
		logger.info("Clicking on Applicant A completed medical training? DropBox");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForElement(applicant_A_CompletedMedicalTrainingDrop);
		scrollingToElementofAPage(applicant_A_CompletedMedicalTrainingDrop);
	jse.executeScript("arguments[0].click();",applicant_A_CompletedMedicalTrainingDrop);
	
	//	waitForElement(applicant_A_CompletedMedicalTrainingDrop);
	//	clickWebElement(applicant_A_CompletedMedicalTrainingDrop);
		logger.info("Clicked on Applicant A completed medical training? DropBox");
		
		
		if(option == "--None--") {
			logger.info("Clicking on --None--");
			waitForElement(applicant_A_CompletedMedicalTrainingNone);;
			clickWebElement(applicant_A_CompletedMedicalTrainingNone);
			logger.info("Clicked on --None--");
		}
		
		else if(option == "Yes") {
			logger.info("Clicking on Yes");
			waitForElement(applicant_A_CompletedMedicalTrainingYes);
			clickWebElement(applicant_A_CompletedMedicalTrainingYes);
			logger.info("Clicked on No");
		}
		
		else if(option == "No") {
			logger.info("Clicking on No");
			waitForElement(applicant_A_CompletedMedicalTrainingNo);
			clickWebElement(applicant_A_CompletedMedicalTrainingNo);
			logger.info("Clicked on NO");
		}
		else {
			logger.info("Clicking on N/A");
			waitForElement(applicant_A_CompletedMedicalTrainingNA);
			clickWebElement(applicant_A_CompletedMedicalTrainingNA);
			logger.info("Clicked on N/A");
		}
	}

	
		
		/**
		 * Click on Applicant B completed medical training?
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */

		public void applicant_B_CompletedMedicalTraining(String option) throws AcisException {
		logger.info("Clicking on Applicant B completed medical training? DropBox");
		waitForElement(applicant_B_CompletedMedicalTrainingDrop);
		clickWebElement(applicant_B_CompletedMedicalTrainingDrop);
		logger.info("Clicked on Applicant B completed medical training? DropBox");
		
		
		if(option == "--None--") {
			logger.info("Clicking on --None--");
			waitForElement(applicant_B_CompletedMedicalTrainingNone);;
			clickWebElement(applicant_B_CompletedMedicalTrainingNone);
			logger.info("Clicked on --None--");
		}
		
		else if(option == "Yes") {
			logger.info("Clicking on Yes");
			waitForElement(applicant_B_CompletedMedicalTrainingYes);
			clickWebElement(applicant_B_CompletedMedicalTrainingYes);
			logger.info("Clicked on No");
		}
		
		else if(option == "No") {
			logger.info("Clicking on No");
			waitForElement(applicant_B_CompletedMedicalTrainingNo);
			clickWebElement(applicant_B_CompletedMedicalTrainingNo);
			logger.info("Clicked on NO");
		}
		else {
			logger.info("Clicking on N/A");
			waitForElement(applicant_B_CompletedMedicalTrainingNA);
			clickWebElement(applicant_B_CompletedMedicalTrainingNA);
			logger.info("Clicked on N/A");
		}
	}
		
		
		
		/**
		 * Click on Applicant meets with waiver/variance?
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */

		public void applicant_A_meetsWithWaiverVariance(String option) throws AcisException {
		logger.info("Clicking on Applicant A meets with waiver/variance? DropBox");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForElement(applicant_A_withWaiverVarianceDrop);
		scrollingToElementofAPage(applicant_A_withWaiverVarianceDrop);
	jse.executeScript("arguments[0].click();",applicant_A_withWaiverVarianceDrop);
	//	waitForElement(applicant_A_withWaiverVarianceDrop);
	//	clickWebElement(applicant_A_withWaiverVarianceDrop);
		logger.info("Clicked on Applicant A meets with waiver/variance? DropBox");
		
		
		if(option == "--None--") {
			logger.info("Clicking on --None--");
			waitForElement(applicant_A_withWaiverVarianceNone);;
			clickWebElement(applicant_A_withWaiverVarianceNone);
			logger.info("Clicked on --None--");
		}
		
		else if(option == "Yes") {
			logger.info("Clicking on Yes");
			waitForElement(applicant_A_withWaiverVarianceYes);
			clickWebElement(applicant_A_withWaiverVarianceYes);
			logger.info("Clicked on No");
		}
		
		else if(option == "No") {
			logger.info("Clicking on No");
			waitForElement(applicant_A_withWaiverVarianceNo);
			clickWebElement(applicant_A_withWaiverVarianceNo);
			logger.info("Clicked on NO");
		}
		else {
			logger.info("Clicking on N/A");
			waitForElement(applicant_A_withWaiverVarianceNA);
			clickWebElement(applicant_A_withWaiverVarianceNA);
			logger.info("Clicked on N/A");
		}
	}
		
		
		
		/**
		 * Click on Applicant B meets with waiver/variance?
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */

		public void applicant_B_MeetsWithWaiverVariance(String option) throws AcisException {
		logger.info("Clicking on Applicant B meets with waiver/variance? DropBox");
		waitForElement(applicant_B_withWaiverVarianceDrop);
		clickWebElement(applicant_B_withWaiverVarianceDrop);
		logger.info("Clicked on Applicant B meets with waiver/variance? DropBox");
		
		
		if(option == "--None--") {
			logger.info("Clicking on --None--");
			waitForElement(applicant_B_withWaiverVarianceNone);;
			clickWebElement(applicant_B_withWaiverVarianceNone);
			logger.info("Clicked on --None--");
		}
		
		else if(option == "Yes") {
			logger.info("Clicking on Yes");
			waitForElement(applicant_B_withWaiverVarianceYes);
			clickWebElement(applicant_B_withWaiverVarianceYes);
			logger.info("Clicked on No");
		}
		
		else if(option == "No") {
			logger.info("Clicking on No");
			waitForElement(applicant_B_withWaiverVarianceNo);
			clickWebElement(applicant_B_withWaiverVarianceNo);
			logger.info("Clicked on NO");
		}
		else {
			logger.info("Clicking on N/A");
			waitForElement(applicant_B_withWaiverVarianceNA);
			clickWebElement(applicant_B_withWaiverVarianceNA);
			logger.info("Clicked on N/A");
		}
	}
		
		
		
		/**
		 * Standards Met 
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */

		public void standardsMet(String standard_option) throws AcisException {
			
				logger.info("Clicking on Standards Met Pencil");
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				waitForElement(standardsMetPen);
				scrollingToElementofAPage(standardsMetPen);
			jse.executeScript("arguments[0].click();",standardsMetPen);
				//waitForElement(standardsMetPen);
				//clickWebElement(standardsMetPen);
				logger.info("Clicked on Standards Met Pencil");
				
				logger.info("Clicking on Standards Met Drop Box");
				waitForElement(standardsMetDrop);
				jse.executeScript("arguments[0].click();",standardsMetDrop);
				//clickWebElement(standardsMetDrop);
				logger.info("Clicked on Standards Met Drop Box");
				
				if(standard_option=="--None--") {
					logger.info("Clicking on Standards Met --None--");
					waitForElement(standardMetNone);
					clickWebElement(standardMetNone);
					logger.info("Clicked on Standards Met --None--");
				}
				
				else if(standard_option=="Meets") {
					logger.info("Clicking on Standards Met Meets");
					waitForElement(standardMetMeets);
					clickWebElement(standardMetMeets);
					logger.info("Clicked on Standards Met Meets");
				}
				
				else if(standard_option=="Has Concerns") {
					logger.info("Clicking on Standards Met Has Concerns");
					waitForElement(standardMetHasConcerns);
					clickWebElement(standardMetHasConcerns);
					logger.info("Clicked on Standards Met Has Concerns");
				}
				
				else {
					logger.info("Clicking on Standards Met Does not meet");
					waitForElement(standardMetDoesNotMeet);
					clickWebElement(standardMetDoesNotMeet);
					logger.info("Clicked on Standards Met Does not meet");
				}
			}
		
		
		/**
		 * Click On Cancel Button 
		 * @author prateeksha.mahesh
		 * @throws AcisException 
		 */
			
		  public void cancelButton() throws AcisException {
			logger.info("Clicking on Cancel");
			waitForElement(cancel);
			clickWebElement(cancel);
			logger.info("Clicked on Cancel");
		}
		  
		  
		   /**
			 * Click On Save Button 
			 * @author prateeksha.mahesh
			 * @throws AcisException 
			 */

		  public void saveButton() throws AcisException {
			logger.info("Clicking on Save");
			waitForElement(save);
			clickWebElement(save);
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
					clickWebElemntUsingJavascriptExecutor(closeTabButton);
					waitForPageLoadTill(5);
				}
				logger.info("Close Licensing Activity Tab");
				waitForElement(licensingActivitiesTitle);
				logger.info("Successfully Close Licensing Activity Tab");
				
			}
}
	
	
	
	
