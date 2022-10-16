package com.acis.automation.pages.safetyassessment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class SafetyAssessmentInterviewsPage extends PageBase  {

	public SafetyAssessmentInterviewsPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(SafetyAssessmentInterviewsPage.class);

	
	
	@FindBy(xpath = "(//*[text()='Next'])[last()]")
	WebElement next;
	
	@FindBy(xpath="//h1[text()='Assess the Home']")
	WebElement accesstheHomePAgelabel;
	
	
	
	
	/**
	 * click on Next button
	 * @author mrunal.s.tilekar
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(5);
		waitForElementClickable(next);
		clickWebElement(next);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Next button");
		waitForElement(accesstheHomePAgelabel);
		logger.info("On the acces the home page");

	}
}
