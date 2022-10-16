package com.acis.automation.pages.portalLicensingactivities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ReceiveReferences_Portal_Page extends PageBase {

	public ReceiveReferences_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Logger logger = LoggerFactory.getLogger(ReceiveReferences_Portal_Page.class);
	
	
	
	
	@FindBy (xpath = "//*[text()='Receive References']")
	WebElement receiveReferences;
	
	@FindBy (xpath = "//h1//*[text()='Receive References']")
	WebElement receiveReferencesVerify;
	
	
	
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	
	
	@FindBy(xpath = "//*[text()='Standards']")
    WebElement 	standards;
	
	@FindBy(xpath = "//*[contains(text(),'Four individuals stand as personal references affirming that the applicants will be capable foster parents')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: To help ensure only individuals of high standard and moral character are licensed as foster parents')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement taskOwner;	
	

	
	
	@FindBy(xpath = "//*[text()='Instructions']/..//*[text()='Help']/../../button")
    WebElement 	instructionsHelpButton;
	
	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement instructionsCancelButton;
	
	@FindBy(xpath = "//*[contains(text(),'Provide four personal references')]")
    WebElement 	instructions_Messgae;
	
	@FindBy (xpath = " //*[contains(text(),'Each reference is considered to be a personal reference for the household.  Provide a') and contains(text(),'minimum of four references')]")
	WebElement instructions_HelpMessage;
	

	
	
	
	
	
	@FindBy (xpath = "//*[@title='Add']")
	WebElement addReference;
	
	
	
	
	@FindBy (xpath = "//*[text()='First Name']/..//*[@type='text']")
	WebElement firstName;
	
	@FindBy (xpath = "//*[text()='Last Name']/..//*[@type='text']")
	WebElement lastName;
	
	@FindBy (xpath = "//*[text()='Phone Number']/..//*[@type='phone']")
	WebElement phoneNumber;
	
	@FindBy (xpath = "//*[text()='Email Address']/..//*[@type='text']")
	WebElement emailAddress;
	
	@FindBy (xpath = "//*[text()='Address']/..//*[@type='text']")
	WebElement address;
	
	
	
	
	@FindBy (xpath = "//*[@name='create']/../../..//*[text()='Cancel']")
	WebElement cancel;
	
	@FindBy (xpath = "//*[@name='create']/../../..//*[text()='Save']")
	WebElement save;
	
	@FindBy (xpath = "//*[@title='edit']")
	WebElement edit;
	
	
	
	
	/**
	 *  Click on Receive References
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void receiveReferencesTab() throws AcisException {
		logger.info("Clicking on receive References Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(receiveReferences);
		clickWebElement(receiveReferences);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(receiveReferencesVerify);
		logger.info("Clicked on receive References Tab");
	}
	
	
	/**
	 * Check Task Owner Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	
	
	/**
	 * Check Task Value
	 * @author prateeksha.mahesh
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
	
	
	
	
	/**
	 * Verifying standards
	 * @author prateeksha.mahesh
	 */
	public void verifyStandardsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
		clickWebElement(taskOwner);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		clickWebElement(standardsHelpButton);
	   // hoverOverElement(standardsHelpButton);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
		logger.info("Checked Standards Message");
}

	
	
	/**  Verifying Instructions 
	 *  @author prateeksha.mahesh
	 *  @throws AcisException
	 */

	public void verifyInstructionsMessage() throws AcisException {
		logger.info("Checking Instructions Message");
		Assert.assertTrue(instructions_Messgae.isDisplayed(), "Error: Mismatch in Instructions Messages");
		scrollingToElementofAPage(instructionsHelpButton);
		clickWebElement(instructionsHelpButton);
		Assert.assertTrue(instructions_HelpMessage.isDisplayed(), "Error: Mismatch in Instructions help Messages");
		logger.info("Checked Instructions Message");
	}
	
	
	
	/**
	 * Click on Add reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void addReference() throws AcisException {
		logger.info("Clicking on Add reference");
		waitForElement(addReference);
		clickWebElement(addReference);
		logger.info("Clicked on Add reference");	
	}
	
	
	/**
	 * Create New Reference
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void createNewReference() throws AcisException {
		logger.info("Clicking on First Name");
		waitForElement(firstName);
		clickWebElement(firstName);
		logger.info("Clicked on First Name");	
		
		logger.info("Clicking on Last Name");
		waitForElement(lastName);
		clickWebElement(lastName);
		logger.info("Clicked on Last Name");	
		
		logger.info("Clicking on Phone Number");
		waitForElement(phoneNumber);
		clickWebElement(phoneNumber);
		logger.info("Clicked on Phone Numbere");	
		
		logger.info("Clicking on Email Address");
		waitForElement(emailAddress);
		clickWebElement(emailAddress);
		logger.info("Clicked on Email Address");	
		
		logger.info("Clicking on Address");
		waitForElement(address);
		clickWebElement(address);
		logger.info("Clicked on Address");	
	}
	
	
	/**
	 * Click on Save
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void save() throws AcisException {
		logger.info("Clicking on Save");
		waitForElement(save);
		clickWebElement(save);
		logger.info("Clicked on Save");	
	}
	
	
	/**
	 * Click on Cancel
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void cancel() throws AcisException {
		logger.info("Clicking on Cancel");
		waitForElement(cancel);
		clickWebElement(cancel);
		logger.info("Clicked on Cancel");	
	}
	
	
	/**
	 * Click on edit
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	public void edit() throws AcisException {
		logger.info("Clicking on Edit");
		waitForElement(edit);
		clickWebElement(edit);
		logger.info("Clicked on Edit");	
	}
	
}
