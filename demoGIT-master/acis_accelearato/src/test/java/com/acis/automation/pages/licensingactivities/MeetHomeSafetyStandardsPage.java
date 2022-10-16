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

public class MeetHomeSafetyStandardsPage extends PageBase   {

	public MeetHomeSafetyStandardsPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(MeetHomeSafetyStandardsPage.class);
	
	@FindBy (xpath = "//a[text()='Meet Home Safety Standards']")
    WebElement meetHomeSafetyStandardPage;
	
	@FindBy(xpath = "//h1//*[text()='Meet Home Safety Standards']")
	WebElement meetHomeSafetyStandardsVerify;

	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a//span")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement     taskOwner;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[contains(text(),'The prospective foster home meets safety requirements')]")
    WebElement 	standards_Messgae;
	
	@FindBy (xpath = "//*[contains(text(),'Reason:DCS will not license any household as a foster home until it meets state safety requirements.')]")
    WebElement reason;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	 @FindBy (xpath = "//*[contains(text(),'Please upload a copy of the following forms/ documentation:')]")
	  WebElement instruction_text;
	    
	  @FindBy (xpath = "//*[contains(text(),'Please upload a copy of the following forms/documentation (if applicable):')]")
	  WebElement instruction_textLine2;
	   
	 @FindBy (xpath = "//button[@title='Click for more information']")
	 WebElement instructionsHelpButton;
	 
	 @FindBy(xpath = "//*[contains(text(),'Help Text')]")
	    WebElement helpTextVerify;	
	 
	 
	 @FindBy (xpath = "//*[contains(text(),'These forms and other documentation are to be completed and uploaded by the prospective foster parent(s). If there is a firearm in the home, a firearm license/agreement must be provided. If foster parents will transport child(ren) in a vehicle, proof of car insurance must be provided. If there is a pet in the home, pet vaccination records must be provided. If there is a pool at the home, or other body of water, a body of water safety plan must be provided.')]")
	    WebElement instructions_HelpMessage;
	 
	 @FindBy (xpath = "//button[text()='Cancel']")
	 WebElement instructionsCancelButton;
	 
	 
	 
	 @FindBy (xpath = "//*[contains(text(),'Pass Threshold:  Applicants provide required forms/documentation to convey adherence to  safety standards.  All forms/documentation is uploaded via the licensing activity')]")
	 WebElement standardsMetIcon;
	
	@FindBy(xpath = "(//*[@placeholder='Select an Option'])[1]")
	WebElement  personHouseholdDropdown;
	
	@FindBy(xpath = "//span[@title='TwjJ  hfaD']")
	WebElement TwjJhfaD;
	
	@FindBy(xpath = "//span[@title='TwjJ  hfaD Home']")
	WebElement TwjJhfaDHome;
	
	@FindBy(xpath = "(//input[@placeholder='Select an Option'])[2]")
	WebElement documentTypedropdown;
	
	@FindBy(xpath = "//*[text()='Safe Sleep Form']")
	WebElement optionsafeSleepForm;
	
	@FindBy(xpath = "//*[text()='Emergency Procedures']")
	WebElement optionEmergencyProcedures;
	
	@FindBy(xpath = "//*[text()='Pet Vaccination']")
	WebElement optionPetVaccination;
	
	@FindBy(xpath = "//*[text()='Proof of Car Insurance']")
	WebElement optionProofofCarInsurance;
	
	@FindBy(xpath = "//*[text()='Firearms License/Agreement']")
	WebElement optionFirearmsLicenseAgreement;

	@FindBy(xpath = "//*[text()='Smoking Policy Acknowledgement']")
	WebElement optionSmokingPolicyAcknowledgement;
	
	@FindBy(xpath = "//*[text()='Body of Water Safety Plan']")
	WebElement optionBodyofWaterSafetyPlan;
	
	@FindBy(xpath = "//*[text()='Proof of Homeowners/Renters Insurance']")
	WebElement optionProofofHomeownersRenters;
	
	@FindBy(xpath = "//*[text()='Resource Family Home Physical Environment Checklist']")
	WebElement optionResourceFamilyHomePhysicalEnvironmentChecklist;
	
	@FindBy(xpath = "//*[text()='Pictures']")
	WebElement optionPictures;
	
	@FindBy(xpath = "(//span[text()='Upload Files'])[1]")
	WebElement addFilesButton;
	
	@FindBy(xpath = "//*[text()='Select Files']")
	WebElement selectFilesTitle;
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
	WebElement uploadFilesButton;
	
	@FindBy(xpath = "//button//span[text()='Done']")
	WebElement doneButton;
	
	@FindBy(xpath = "//*[text()='Edit Home meets safety requirements?']")
	WebElement editHomeMeetsButton;
	
	@FindBy(xpath = "//*[contains(text(),'Home meets safety requirements?')]")
	WebElement dropdownHomeMeetsButton;
	
	@FindBy(xpath = "//*[contains(text(),'Home meets safety requirements?')]/../../..//*[text()='--None--']")
	WebElement homeMeetsNone;
	
	@FindBy(xpath = "//*[contains(text(),'Home meets safety requirements?')]/../../..//*[text()='Yes']")
	WebElement homeMeetsYes;
	
	@FindBy(xpath = "//*[contains(text(),'Home meets safety requirements?')]/../../..//*[text()='No']")
	WebElement homeMeetsNo;
	
	@FindBy(xpath = "//*[contains(@title,'Edit Number of bedrooms')]")
	WebElement editNumberOfBedrooms;
			
	@FindBy(xpath = "//*[@name='ACIS_Number_of_bedrooms__c']")
	WebElement numberOfBedrooms;
	
	@FindBy(xpath = "//*[contains(@title,'Edit Number of beds')]")
	WebElement editNumberOfBeds;
	
	@FindBy(xpath = "//*[@name='ACIS_Number_of_beds__c']")
	WebElement numberOfBeds;
	
	@FindBy(xpath = "//button[contains(@title,'Edit Square Footage')]")
	WebElement editsquareFootage;
	
	@FindBy(xpath = "//*[@name='ACIS_Square_Footage__c']")
	WebElement squareFootage;
	
	@FindBy(xpath = "//*[text()='Edit Applicant signature date']")
	WebElement editSignatureDateButton;
	
	@FindBy(xpath = "//*[@title='Select a date']")
	WebElement signatureDateButton;
	
	@FindBy(xpath = "//*[contains(text(),'Applicant signature date')]/..//*[text()='15']")
    WebElement selectDate;
   
	
	@FindBy(xpath = "//button[@title='Edit Applicant signature date']")
    WebElement editApplicantSignatureDate;
	
	@FindBy(xpath = "//button[@title='Edit Standards Met?']")
	WebElement editStandardMetButton;
	
	@FindBy(xpath = "(//*[@name='standardsMet'])[last()]")
	WebElement dropdownStandardMet;
	
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
	
	@FindBy(xpath = "//button[text()='Cancel']")
    WebElement 	cancelButton;
	
	
	@FindBy(xpath = "//button[@name='SaveEdit']")
	WebElement saveButton;
	
	
	@FindBy(xpath ="//button[@title='Edit Description of Home']")
	 WebElement editDescriptionofHome;
	
	@FindBy(xpath ="//*[text()='Description of Home']/..//textarea")
	WebElement DescriptionofHome;
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Meet Home Safety Standards']")
    WebElement closeTabButton;
	
	@FindBy(xpath = "//*[@title='Edit Request Waiver?']")
	WebElement RequestWaiveredit;
	
	@FindBy(xpath = "//*[@title='Edit Request Variance?']")
	WebElement RequestVarianceedit;
	
	@FindBy(xpath = "//*[@title='Edit Waiver Request Comments']")
	WebElement Waivercomments;
	
	@FindBy(xpath = "//*[@title='Edit Variance Request Comments']")
	WebElement Variancecomments;
	
	@FindBy(xpath = "//*[text()='Request Waiver?']/../../..//*[text()='Yes']")
	WebElement RequestWaiverYes;
	
	@FindBy(xpath = "//*[text()='Request Variance?']/../../..//*[text()='Yes']")
	WebElement RequestVarianceYes;
	
	@FindBy(xpath = "//*[text()='Request Waiver?']/..//*[@autocomplete='off']")
	WebElement RequestWaivereditDrop;
	
	@FindBy(xpath = "//*[text()='Request Variance?']/..//*[@autocomplete='off']")
	WebElement RequestVarianceditDrop;
	
	@FindBy(xpath = "//*[text()='Waiver Request Comments']/../div/textarea")
	WebElement Waivercommentstextarea;
	
	@FindBy(xpath = "//*[text()='Variance Request Comments']/../div/textarea")
	WebElement variancecommentstextarea;
	
	
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Meet Home Safety Standards']");
	
	Actions act = new Actions(driver);
	
	/**
	 * Click  on meetHomeSafetyStandardPage
	 * @author swati.malviya
	 * @throws AcisException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * 
	 */
	
	 public void meetHomeSafetyStandardPageTab() throws AcisException {
	        logger.info("Clicking on meetHomeSafetyStandardPageTab");
	        Actions act = new Actions(driver);
	        act.sendKeys(Keys.END).build().perform();
	        waitForPageLoadTill(5);
	        waitForPageLoad();
	        act.sendKeys(Keys.HOME).build().perform();
	        waitForElement(meetHomeSafetyStandardPage);
	        clickWebElement(meetHomeSafetyStandardPage);
	        waitForPageLoadTill(5);
	        driver.navigate().refresh();
	        waitForPageLoadTill(10);
	        waitForPageLoad();
	        waitForElement(meetHomeSafetyStandardsVerify);
	        logger.info("Clicked on meetHomeSafetyStandardPageTab");
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
		Actions act = new Actions(driver);
        act.sendKeys(Keys.END).build().perform();
        waitForPageLoadTill(5);
        waitForPageLoad();
        act.sendKeys(Keys.HOME).build().perform();
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}

	
	
	/**
     * Check Standards Message
     * @author swati.malviya
     * @throws AcisException
     */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
//		clickWebElement(taskOwner);
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(Keys.ARROW_DOWN).build().perform();
//		waitForPageLoadTill(5);
//		hoverOverElement(standardsHelpButton);
//		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
	}
	
	
	
	 
	 /**
		 * Check Instruction Message
		 * @author swati.malviya
		 * @throws AcisException 
		 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instruction_text.isDisplayed(), "Error: Mismatch in Instructions Messages");
		Assert.assertTrue(instruction_textLine2.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(instructionsHelpButton);
		clickWebElemntUsingJavascriptExecutor(instructionsHelpButton);
		waitForElement(helpTextVerify);
		waitForPageLoadTill(10);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		clickWebElement(instructionsCancelButton);
		logger.info("Checked Instructions Message");
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
		scrollingToElementofAPage(personHouseholdDropdown);
		waitForElement(personHouseholdDropdown);
		clickWebElemntUsingJavascriptExecutor(personHouseholdDropdown);
		logger.info("Clicked on personHouseholdDropdown ");
	
		if(option=="twjhfaDHome") {
			logger.info(" Clicking on twjhfaDHome");
			waitForElement(TwjJhfaDHome);
			clickWebElement(TwjJhfaDHome);
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
			Actions act = new Actions(driver);
	        act.sendKeys(Keys.PAGE_DOWN).build().perform();
	        waitForPageLoadTill(5);
	        waitForPageLoad();
			waitForElement(documentTypedropdown);
			clickWebElement(documentTypedropdown);
			switch (option) {
			case "optionsafeSleepForm":
				waitForElement(optionsafeSleepForm);
				clickWebElement(optionsafeSleepForm);
				break;
			case "optionEmergencyProcedures":
				waitForElement(optionEmergencyProcedures);
				clickWebElement(optionEmergencyProcedures);
				break;
			case "optionPetVaccination":
				waitForElement(optionPetVaccination);
				clickWebElement(optionPetVaccination);
				break;
			case "optionProofofCarInsurance":
				waitForElement(optionProofofCarInsurance);
				clickWebElement(optionProofofCarInsurance);
				break;
			case "optionFirearmsLicenseAgreement":
				waitForElement(optionFirearmsLicenseAgreement);
				clickWebElement(optionFirearmsLicenseAgreement);
				break;
			case "optionSmokingPolicyAcknowledgement":
				waitForElement(optionSmokingPolicyAcknowledgement);
				clickWebElement(optionSmokingPolicyAcknowledgement);
				break;
			case "optionBodyofWaterSafetyPlan":
				waitForElement(optionBodyofWaterSafetyPlan);
				clickWebElement(optionBodyofWaterSafetyPlan);
				break;
			case "optionProofofHomeownersRenters":
				waitForElement(optionProofofHomeownersRenters);
				clickWebElement(optionProofofHomeownersRenters);
				break;
			case "optionResourceFamilyHomePhysicalEnvironmentChecklist":
				waitForElement(optionResourceFamilyHomePhysicalEnvironmentChecklist);
				clickWebElement(optionResourceFamilyHomePhysicalEnvironmentChecklist);
				break;
			case "optionPictures":
				waitForElement(optionPictures);
				clickWebElement(optionPictures);
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
		        logger.info("Clicking  on upload file button and upload file");
		        act.sendKeys(Keys.PAGE_DOWN).build().perform();
		        logger.info("Clicking on Page Down");
		        waitForElement(uploadFilesButton);
		        waitForPageLoadTill(5);
		        clickWebElemntUsingJavascriptExecutor(uploadFilesButton);
		        uploadFileUsingRobot(filepath);
		        waitForPageLoadTill(10);
		        logger.info("file uploaded successfully");
		    }
		
		/**
		 * Select Value for :  confirm Standards Met
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void confirmStandardsMet(String option) throws AcisException {
			logger.info("clicking on editHomeMeetsButton:"+option);
			waitForPageLoad();
			scrollingToElementofAPage(editHomeMeetsButton);
			waitForElement(editHomeMeetsButton);
			clickWebElemntUsingJavascriptExecutor(editHomeMeetsButton);
			waitForPageLoadTill(5);
			logger.info("clicking on dropdownHomeMeetsButton");
			waitForElement(dropdownHomeMeetsButton);
			clickWebElemntUsingJavascriptExecutor(dropdownHomeMeetsButton);
			
			switch (option) {
			case "None":
				waitForElement(homeMeetsNone);
				clickWebElement(homeMeetsNone);
				break;
			case "Yes":
				waitForElement(homeMeetsYes);
				clickWebElement(homeMeetsYes);
				break;
			case "No":
				waitForElement(homeMeetsNo);
				clickWebElement(homeMeetsNo);
				break;
			default:
				break;
			}
			logger.info("Seclected Home meet option:"+option);
		}
		
		/**
		 * Enter No Of Bedrooms
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void enterNoOfBedrooms(String strText) throws AcisException {
			logger.info("Clicking on editNumberOfBedrooms");
			scrollingToElementofAPage(editNumberOfBedrooms);
			waitForElement(editNumberOfBedrooms);
			clickWebElemntUsingJavascriptExecutor(editNumberOfBedrooms);
			enterText(numberOfBedrooms, strText);
			logger.info("Entered values of NumberOfBedrooms");
		}
		
		/**
		 * Enter No Of Beds
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void enterNoOfBeds(String strText) throws AcisException {
			logger.info("Clicking on editNumberOfBeds");
			scrollingToElementofAPage(editNumberOfBeds);
			waitForElement(editNumberOfBeds);
			clickWebElemntUsingJavascriptExecutor(editNumberOfBeds);
			enterText(numberOfBeds, strText);
			try
			{
				act.keyDown(numberOfBeds,Keys.SHIFT).sendKeys(strText).keyUp(Keys.SHIFT).build().perform();
				
			}catch (Exception e) {
				act.sendKeys(Keys.CONTROL).sendKeys(strText).perform();
			}
			
			logger.info("Entered values of NumberOfBeds");
		}
		
		/**
		 * Enter Description of Home
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void descriptionofHome(String strText) throws AcisException {
			logger.info("Clicking on Description of Home");
			 Actions act = new Actions(driver);
	        act.sendKeys(Keys.END).build().perform();
	        waitForPageLoadTill(5);
	        waitForPageLoad();
	        act.sendKeys(Keys.HOME).build().perform();
			scrollingToElementofAPage(editDescriptionofHome);
			waitForElement(editDescriptionofHome);
			clickWebElemntUsingJavascriptExecutor(editDescriptionofHome);
			waitForPageLoadTill(5);
			act.sendKeys(Keys.CONTROL).sendKeys(strText).perform();
			logger.info("Entered values of Description of Home");
		}
		
		/**
		 * Enter value for squareFootage
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void enterSquareFootage(String strText) throws AcisException {
			logger.info("Clicking on editSquareFootage");
			scrollingToElementofAPage(editsquareFootage);
			waitForElement(editsquareFootage);
			clickWebElemntUsingJavascriptExecutor(editsquareFootage);
			waitForPageLoadTill(5);
			scrollingToElementofAPage(squareFootage);
			enterText(squareFootage, strText);
			logger.info("Entered values of SquareFootage");
		}
		
		/**
		 * Enter value for Date
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void EnterDate() throws AcisException {
			logger.info("clicking on signatureDateButton");
			scrollingToElementofAPage(editApplicantSignatureDate);
			clickWebElemntUsingJavascriptExecutor(editApplicantSignatureDate);
			waitForPageLoadTill(5);
			scrollingToElementofAPage(signatureDateButton);
			clickWebElemntUsingJavascriptExecutor(signatureDateButton);
			waitForPageLoadTill(5);
			clickWebElemntUsingJavascriptExecutor(selectDate);
			logger.info("selected a Date");
			}
		
		
		
		/**
		 * Select Value for : Standards Met?
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
			waitForPageLoadTill(5);
			clickWebElement(saveButton);
			waitForPageLoadTill(5);
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
			clickWebElemntUsingJavascriptExecutor(cancelButton);
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
			while (isElementPresent(closeTabButtonBy)) {
				clickWebElement(closeTabButton);
				waitForPageLoadTill(5);
			}
			logger.info("Close Licensing Activity Tab");
			waitForElement(licensingActivitiesTitle);
			logger.info("Successfully Close Licensing Activity Tab");
			
		}
		
		
		public void WaiverandVarianceSection() throws AcisException {
			logger.info("Entering Request Waiver/Variance Section");
			waitForPageLoad();
			waitForPageLoadTill(9);
			scrollingToElementofAPage(RequestWaiveredit);
			clickWebElemntUsingJavascriptExecutor(RequestWaiveredit);
				waitForPageLoadTill(5);
				scrollingToElementofAPage(RequestWaivereditDrop);
				clickWebElemntUsingJavascriptExecutor(RequestWaivereditDrop);
				waitForPageLoadTill(5);			
					clickWebElement(RequestWaiverYes);
					waitForPageLoadTill(5);
					logger.info("Selected  value yes for Request Waiver");
					
					scrollingToElementofAPage(Waivercommentstextarea);
					waitForElement(Waivercommentstextarea);
					enterText(Waivercommentstextarea, "Demo");
					
					scrollingToElementofAPage(RequestVarianceedit);
						clickWebElemntUsingJavascriptExecutor(RequestVarianceedit);
						waitForPageLoadTill(5);
						scrollingToElementofAPage(RequestVarianceditDrop);
						clickWebElemntUsingJavascriptExecutor(RequestVarianceditDrop);
						waitForPageLoadTill(5);			
							clickWebElement(RequestVarianceYes);
							waitForPageLoadTill(5);
							logger.info("Selected  value yes for Request Variance");
							
							scrollingToElementofAPage(variancecommentstextarea);
							waitForElement(variancecommentstextarea);
							enterText(variancecommentstextarea, "Demo");
				
					
			
		
			
		}
		
		


}
