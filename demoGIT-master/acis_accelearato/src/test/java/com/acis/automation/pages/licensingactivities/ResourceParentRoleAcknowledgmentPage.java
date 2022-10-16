package com.acis.automation.pages.licensingactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ResourceParentRoleAcknowledgmentPage extends PageBase{

	public ResourceParentRoleAcknowledgmentPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(ResourceParentRoleAcknowledgmentPage.class);

	@FindBy(xpath = "//button[@title='Edit Task']")
	WebElement edittask;
	
	@FindBy(xpath = "//*[text()='Task']/..//input")
	WebElement taskInputBox;
	
	@FindBy(xpath = "(//a[text()='Details'])[last()]")
	WebElement detailsTab;
	
	@FindBy(xpath = "//*[text()='Resource Parent Role Acknowledgment']")
	WebElement resourceParentRoleAcknowledgment;
	
	
	@FindBy(xpath = "//h1//*[text()='Resource Parent Role Acknowledgment']")
	WebElement resourceParentRoleAcknowledgmentVerify;
	
	@FindBy(xpath = "//*[text()='Task']/../..//lightning-formatted-text")
	WebElement task_Value;
	
	@FindBy(xpath = "//*[contains(text(),'For all persons ages 18 and older, please upload 1 signed copy of Criminal History Background Check (SF 53259) form')]")
    WebElement 	instructions_Messgae;
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Resource Parent Role Acknowledgment']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Resource Parent Role Acknowledgment']");

	
	Actions act = new Actions(driver);
	
	public void clickResourceParentRoleAcknowledgmentTab() throws AcisException {
		logger.info("Clicking on Resource Parent Role Acknowledgment Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(resourceParentRoleAcknowledgment);
		clickWebElemntUsingJavascriptExecutor(resourceParentRoleAcknowledgment);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(resourceParentRoleAcknowledgmentVerify);
		logger.info("Clicked on Resource Parent Role Acknowledgment Tab");

	}
	
	/**
	 * Provide task value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideTaskValue(String taskValue) throws AcisException {
		logger.info("Providing task value: "+ taskValue);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();	
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(edittask);
		waitForPageLoadTill(5);
		clickWebElement(detailsTab);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
		enterText(taskInputBox, taskValue);
		logger.info("Provided task value: "+ taskValue);
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
