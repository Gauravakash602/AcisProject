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

public class PassSexViolentOffenderBackgroundCheck_Portal_Page extends PageBase{

	public PassSexViolentOffenderBackgroundCheck_Portal_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

public static Logger logger = LoggerFactory.getLogger(PassSexViolentOffenderBackgroundCheck_Portal_Page.class);
	
	@FindBy(xpath = "(//*[text()='Upload Files'])[1]")
    WebElement 	uploadFilesButton;
	
	@FindBy(xpath = "//*[text()='Task Owner']/..//following-sibling::*//a")
    WebElement 	taskOwner_Value;
	
	@FindBy(xpath = "//*[contains(text(),'Neither Licensed Foster Parents nor residents of the home is a registered sex offender')]")
    WebElement 	standards_Messgae;
	
	@FindBy(xpath = "//*[text()='Standards']/..//*[text()='Help']/../../button")
    WebElement 	standardsHelpButton;
	
	@FindBy(xpath = "//*[contains(text(),'Reason: DCS will not place a child in a home in which the applicant or any resident is a registered sex offender')]")
    WebElement 	standards_HelpMessgae;
	
	@FindBy(xpath = "(//*[text()='Task Owner'])[1]")
    WebElement 	taskOwner;
	
	@FindBy(xpath = "//*[text()='Pass Sex/Violent Offender Background Check']")
	WebElement passSexViolentOffenderBackgroundCheck;
	
	
	@FindBy(xpath = "//h1//*[text()='Pass Sex/Violent Offender Background Check']")
	WebElement passSexViolentOffenderBackgroundCheckVerify;
	

	@FindBy(xpath = "(//*[text()='Task']/../..//span)[3]")
	WebElement task_Value;
	
	
	Actions act = new Actions(driver);
	
	public void clickPassSexViolentOffenderBackgroundCheckTab() throws AcisException {
		logger.info("Clicking on Pass Sex/Violent Offender Background Check Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(passSexViolentOffenderBackgroundCheck);
		clickWebElemntUsingJavascriptExecutor(passSexViolentOffenderBackgroundCheck);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(passSexViolentOffenderBackgroundCheckVerify);
		logger.info("Clicked on Pass Sex/Violent Offender Background Check Tab");

	}
	/**
	 * Check Task Owner Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskOwnerValue(String taskOwnerValue) {
		logger.info("Check Task Owner Value: " + taskOwnerValue);
		Assert.assertTrue((taskOwner_Value.getText()).contains(taskOwnerValue), "Error: Task OwnerValue does not match. Actual Value is :"+ taskOwner_Value.getText() 
									+ "Expected Value: " + taskOwnerValue);
		logger.info("Checked Task Owner Value: " + taskOwnerValue);
	}
	
	/**
	 * Check Standards Message
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyStandarsMessage() throws AcisException {
		logger.info("Checking Standards Message");
		Assert.assertTrue(standards_Messgae.isDisplayed(), "Error: Mismatch in standards Messages");
/*		clickWebElement(taskOwner);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		waitForPageLoadTill(5);
		hoverOverElement(standardsHelpButton);
		Assert.assertTrue(standards_HelpMessgae.isDisplayed(), "Error: Mismatch in standards help Messages");
*/		logger.info("Checked Standards Message");
	}
	
	/**
	 * Check Task  Value
	 * @author mrunal.s.tilekar
	 */
	public void checkTaskValue(String taskValue) {
		logger.info("Check Task  Value: " + taskValue);
		Assert.assertTrue((task_Value.getText()).contains(taskValue), "Error: Task OwnerValue does not match. Actual Value is :"+ task_Value.getText() 
									+ "Expected Value: " + taskValue);
		logger.info("Checked Task Owner Value: " + taskValue);
	}
	
}
