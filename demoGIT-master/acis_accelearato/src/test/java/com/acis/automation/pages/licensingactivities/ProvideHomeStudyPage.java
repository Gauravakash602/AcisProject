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

public class ProvideHomeStudyPage extends PageBase{

	public ProvideHomeStudyPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(ProvideHomeStudyPage.class);
	
	
	@FindBy (xpath = "(//*[text()='Provide Home Study'])")
	WebElement provideHomeStudyTab;
	
	@FindBy (xpath = "//h1//*[text()='Provide Home Study']")
	WebElement provideHomeStudyVerify;
	
	
	
	
	
	
	
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
	
	@FindBy(xpath = "//h1[text()='Licensing Activities']")
    WebElement 	licensingActivitiesTitle;

	@FindBy(xpath = "//button[@title='Close Provide Home Study']")
    WebElement closeTabButton;
	
	public By closeTabButtonBy = By.xpath("//button[@title='Close Provide Home Study']");

	
	
	
	/**
	 *  Click on Provide Home Study
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	Actions act = new Actions(driver);
	
	public void provideHomeStudyTab() throws AcisException {
		logger.info("Clicking on Provide Home Study Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(5);
		waitForElement(provideHomeStudyTab);
		clickWebElemntUsingJavascriptExecutor(provideHomeStudyTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(provideHomeStudyVerify);
		logger.info("Clicked on Provide Home Study Tab");
	}
	
	
	
	
	
	
	/**
	 * Standards Met 
	 * @author prateeksha.mahesh
	 * @throws AcisException 
	 */
	
	public void selectStandardsMetValue(String option) throws AcisException {
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
	 * Close Licensing Activity Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeLicensingActivityTab() throws AcisException {
		logger.info("Close Licensing Activity Tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		while (isElementPresent(closeTabButtonBy)){
			clickWebElement(closeTabButton);
			waitForPageLoadTill(5);
		}
		logger.info("Close Licensing Activity Tab");
		waitForElement(licensingActivitiesTitle);
		logger.info("Successfully Close Licensing Activity Tab");
		
	}
}
