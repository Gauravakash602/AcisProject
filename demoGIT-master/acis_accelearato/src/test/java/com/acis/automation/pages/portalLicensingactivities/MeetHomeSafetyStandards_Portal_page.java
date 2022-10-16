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

public class MeetHomeSafetyStandards_Portal_page extends PageBase{

	public MeetHomeSafetyStandards_Portal_page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
public static Logger logger = LoggerFactory.getLogger(PassFingerprintBackgroundCheck_Portal_Page.class);

 	@FindBy(xpath = "//*[text()='Meet Home Safety Standards']")
 	WebElement meetHomeSafetyStandardsPortal;
 	
 	@FindBy(xpath = "//h1//*[text()='Meet Home Safety Standards']")
	WebElement meetHomeSafetyStandardsVerify;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement 	taskOwner;
	
	@FindBy(xpath = "//*[contains(text(),'The prospective foster home meets safety requirements')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	
	@FindBy(xpath = "//*[contains(text(),'Reason: DCS will not license any household as a foster home until it meets state safety requirements')]")
    WebElement 	standards_HelpMessgae;
	
	 @FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Click for more information']/../../button")
	    WebElement     instructionsHelpButton;
	   
	    @FindBy(xpath = "//button[@title='Cancel']")
	    WebElement instructionsCancelButton;
	   
	    @FindBy (xpath = "//*[contains(text(),'These forms and other documentation are to be completed and uploaded by the prospective foster parent(s). If there is a firearm in the home, a firearm license/agreement must be provided. If foster parents will transport child(ren) in a vehicle, proof of car insurance must be provided. If there is a pet in the home, pet vaccination records must be provided. If there is a pool at the home, or other body of water, a body of water safety plan must be provided.')]")
	    WebElement instructions_HelpMessage;
	   
	    @FindBy (xpath = "//*[contains(text(),'Please upload a copy of the following forms/ documentation:')]")
	    WebElement instruction_text;
	    
	    @FindBy (xpath = "//*[contains(text(),'Please upload a copy of the following forms/documentation (if applicable):')]")
	    WebElement instruction_textLine2;
	    
	    
	    
	    @FindBy(xpath = "//*[contains(text(),'Help Text')]")
	    WebElement helpTextVerify;	
	 
	 @FindBy(xpath = "(//*[text()='Person/Household']/../../../..//input)[1]")
	    WebElement 	personHousehold_Dropdown;

		@FindBy(xpath = "//*[text()='Yusuf Pathan']")
	    WebElement YusufPathan;
		
		@FindBy(xpath = "//*[text()='Yusuf  Pathan Home']")
	    WebElement YusufPathanHome	;

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
		
		@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
	    WebElement 	uploadFilesButton;
		
		@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
		WebElement task_Value;
		
		@FindBy(xpath = "(//*[contains(text(),'Did all required documents uploaded?')]/..//input)")
	    WebElement 	allDocumentsUpload_Dropdown;
		
		@FindBy(xpath = "(//*[contains(text(),'Did all required documents uploaded?')]/..//*[text()='Yes'])")
	    WebElement 	allDocumentsUpload_Yes;
		
		@FindBy(xpath = "(//*[contains(text(),'Did all required documents uploaded?')]/..//*[text()='No'])")
	    WebElement 	allDocumentsUpload_No;
		
		/* @FindBy(xpath="(//*[text()='Instructions'])[1]") */
		@FindBy(xpath="(//*[text()='Upload Documentation'])[last()]//..//..//..//..//..//div[2]//div//div//div")
		WebElement labelInstructions;
		
		
		
		Actions act = new Actions(driver);
		
		public void clickMeetHomeSafetyStandardsTab() throws AcisException {
			logger.info("Clicking on meetHomeSafetyStandards Tab");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.END).build().perform();
			waitForPageLoadTill(5);
			waitForPageLoad();
			act.sendKeys(Keys.HOME).build().perform();
			scrollingToElementofAPage(meetHomeSafetyStandardsPortal);
			clickWebElemntUsingJavascriptExecutor(meetHomeSafetyStandardsPortal);
			waitForPageLoad();
			waitForPageLoadTill(5);
			driver.navigate().refresh();
			waitForPageLoadTill(5);
			waitForPageLoad();
			waitForElement(meetHomeSafetyStandardsVerify);
			logger.info("Clicked on meetHomeSafetyStandards Tab");

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
			Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
										+ "Expected Value: " + taskValue);
			logger.info("Checked Task  Value: " + taskValue);
		}
	 
	
		
		/**
		 * Check Standards Message
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		public void verifyStandarsMessage() throws AcisException {
			logger.info("Checking Standards Message");
			Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
//			clickWebElement(taskOwner);
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			act.sendKeys(Keys.ARROW_DOWN).build().perform();
//			waitForPageLoadTill(5);
//			hoverOverElement(standardsHelpButton);
//			Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
			logger.info("Checked Standards Message");
		}
		
		/**
		 * Check Instruction
		 * @author swati.malviya
		 * @throws AcisException 
		 */
		
		public void verifyInstructionsMessage() throws AcisException {
			logger.info("Checking Instructions Message");
			Assert.assertTrue(instruction_text.isDisplayed(), "Error: Mismatch in Instructions Messages");
			Assert.assertTrue(instruction_textLine2.isDisplayed(), "Error: Mismatch in Instructions Messages");
			scrollingToElementofAPage(instructionsHelpButton);
			clickWebElement(instructionsHelpButton);
			waitForElement(helpTextVerify);
			waitForPageLoadTill(10);
			Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
			clickWebElement(instructionsCancelButton);
			logger.info("Checked Instructions Message");
		}
		
		
		
			 
		 
		 /**
			 * Select Person name
			 * @author swati.malviya
			 * @throws AcisException 
			 * 
			 */
			public void selectPersonHouseholdName(String personName) throws AcisException {
				logger.info("Select PersonHousehold name: "+ personName);
				waitForPageLoadTill(5);
				scrollingToElementofAPage(personHousehold_Dropdown);
				clickWebElement(personHousehold_Dropdown);
				waitForPageLoadTill(5);
				clickWebElement(driver.findElement(By.xpath("//span[@title='"+ personName+"']")));
				logger.info("Selected Person name: "+ personName);
				
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
					waitForPageLoadTill(5);
					clickWebElement(uploadFilesButton);
					uploadFileUsingRobot(filepath);
					waitForPageLoadTill(5);
					logger.info("file uploaded successfully");
					waitForPageLoadTill(5);
			        waitForPageLoad();
			        refreshPage();
			        waitForPageLoadTill(10);
			        waitForPageLoad();
				}
				
				/**
				 * Delete File with from file name
				 * @author swati.malviya
				 * @throws AcisException 
				 */
				public void deleteFile(String fileName) throws AcisException {
					logger.info("Delete File with from file name: "+ fileName);
					clickWebElement(driver.findElement(By.xpath("//*[text()='Or drop files']")));
					waitForPageLoadTill(5);
					logger.info("Deleted File with from file name: "+ fileName);
				}
				
				/**
				 * Select Value for : Did all required documents uploaded?    
				 * @author swati.malviya
				 * @throws AcisException 
				 */
				public void selectAllDocumentValue(String option) throws AcisException {
					logger.info("Selecting Value for : Did all required documents uploaded?    ");
					waitForPageLoadTill(5);
					scrollingToElementofAPage(allDocumentsUpload_Dropdown);
					clickWebElement(allDocumentsUpload_Dropdown);
					waitForPageLoadTill(5);
					
					switch (option) {
					case "Yes":
						clickWebElement(allDocumentsUpload_Yes);
						waitForPageLoadTill(5);
						logger.info("Selected  value: "+ option);
						break;
						
					case "No":
						clickWebElement(allDocumentsUpload_No);
						waitForPageLoadTill(5);
						logger.info("Selected  value: "+ option);
						break;

					default:
						logger.info("No matching value found");
						break;
						
					}
					
					
				}
				
	/*check upload Documentations
	 * 
	 * @author khushboo
	 * 			
	 */
				public void checkUploadInstructions() {
					logger.info("checking instructions");
					Actions act =new Actions(driver);
					act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
					scrollingToElementofAPage(labelInstructions);
					waitForElement(labelInstructions);
					String uploadDocumentationstext=labelInstructions.getText();
					logger.info("The instructions"+uploadDocumentationstext);
				}
				
}