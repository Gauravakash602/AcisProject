package com.acis.automation.pages.interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewInteractionPage extends PageBase  {

	public NewInteractionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(NewInteractionPage.class);

	@FindBy(xpath = "(//*[text()='Meeting'])[last()]")
	WebElement meetingRadionButton;
	
	@FindBy(xpath = "(//*[text()='Collateral Contact'])[last()]")
	WebElement collateralContactRadioButton;
	
	@FindBy(xpath = "(//*[text()='Visit'])[last()]")
	WebElement visitRadioButton;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//div[@title='New']")
	WebElement newButton;
	
	@FindBy(xpath = "//h2[text()='New Interaction']")
	WebElement newInteractionTitle;
	
	
	/**
	 * Click on New button 
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickNewButton() throws AcisException {
		logger.info("Clicking on New button");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(newButton);
		waitForPageLoadTill(5);
		waitForElement(newInteractionTitle);
		logger.info("Clicked on New button");
	}
	
	/**
	 * Click on Next Button
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickNextButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("Clicked on Next button");
		
	}
	
	
	/**
	 * Select type of interaction
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectInteractionType(String typeOfInteraction) throws AcisException {
		logger.info("Selecting type of interaction");
		waitForPageLoad();
		waitForPageLoadTill(5);
		switch (typeOfInteraction) {
		case "Visit":
			clickWebElement(visitRadioButton);
			logger.info("Selected method: " + typeOfInteraction);
			break;

		case "Meeting":
			clickWebElement(meetingRadionButton);
			logger.info("Selected method: " + typeOfInteraction);
			break;
			
		case "CollateralContact":
			clickWebElement(collateralContactRadioButton);
			logger.info("Selected method: " + typeOfInteraction);
			break;
		default:
			break;
		}
		
	}	
}
