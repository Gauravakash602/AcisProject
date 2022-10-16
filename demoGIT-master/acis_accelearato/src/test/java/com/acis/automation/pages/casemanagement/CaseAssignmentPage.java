package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CaseAssignmentPage extends PageBase {

	public CaseAssignmentPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CaseAssignmentPage.class);

	@FindBy(xpath = "//span[text()='Approve']")
	WebElement approveRadio;
	
	@FindBy(xpath = "//span[text()='Override']")
	WebElement overrideRadio;
	
	@FindBy(xpath = "//span[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//span[contains(text(),'ACIS Investigator')]")
	WebElement selectNewOwnerInvestigator;
	
	@FindBy(xpath = "//*[text()='Select New Owner']/../..//input")
	WebElement selectNewOwner;
	
	@FindBy(xpath = "//*[text()='Comments']/../..//textarea")
	WebElement comments;
	
	Actions act = new Actions(driver);
	
	/**
	 * Clicked on Assign Owner on a Foster Care Case Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void selectApproval(String button) throws AcisException {
		logger.info("Clicking on Assign Owner Button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		switch (button) {
		case "Approve":
			waitForElement(approveRadio);
			clickWebElement(approveRadio);
			break;
		case "Override":
			waitForElement(overrideRadio);
			clickWebElement(overrideRadio);
			break;
		default:
			break;
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Assign Owner Button");

	}
	
	/**
	 * Clicking on Submit button Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickSubmit() throws AcisException {
		logger.info("Clicking on Submit Button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForPageLoadTill(5);
		waitForElement(submitButton);
		clickWebElemntUsingJavascriptExecutor(submitButton);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Submit Button");

	}
	
	/**
	 *Entering comments on Assign Owner Page Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void enterComments(String comment) throws AcisException {
		logger.info("Entering Comments");
		scrollDownTillPageEnd();
		enterText(comments, comment);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Entered Comments");

	}
	
	/**
	 * Select New Case Owner on Assign Owner Page Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void selectNewOwner() throws AcisException {
		logger.info("Clicking on Assign Owner Button");
		clickWebElement(selectNewOwner);
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(selectNewOwnerInvestigator);
		clickWebElement(selectNewOwnerInvestigator);
		
		logger.info("Clicked on Assign Owner Button");

	}
	
	
	
	/**
	 * Select New Case Owner on Assign Owner Page Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void selectNewOwner(String ownerValue) throws AcisException {
		logger.info("Clicking on Assign Owner Button");
		clickWebElement(selectNewOwner);
		waitForPageLoadTill(5);
		waitForPageLoad();
		switch (ownerValue) {
		case "Case Worker":
			clickWebElement(driver.findElement(By.xpath("//span[contains(text(),'"+ ownerValue +"')]")));
			waitForPageLoadTill(5);
			break;

		default:
			break;
		}
		
		
		logger.info("Clicked on Assign Owner Button");

	}
	
}
