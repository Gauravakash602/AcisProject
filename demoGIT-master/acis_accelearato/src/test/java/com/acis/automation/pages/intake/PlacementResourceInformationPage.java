package com.acis.automation.pages.intake;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourceInformationPage extends PageBase {

	public PlacementResourceInformationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PlacementResourceInformationPage.class);

	@FindBy(xpath = "//*[text()='Add']")
	WebElement addButton;
	
	@FindBy(xpath = "//span[text()='Search']")
	WebElement searchButton;

	@FindBy(xpath = "//*[text()='Search for Placement Resource']//..//..//input")
	WebElement SearchforPlacementResource;

	@FindBy(xpath = "(//*[text()='Alleged Maltreator'])[1]//..//span")
	WebElement allegedMaltreator;

	@FindBy(xpath = "//*[text()='Placement Resource Information']//..//..//*[text()='Save']")
	WebElement btnSave;

	/*
	 * click on Add button
	 * 
	 * @khushboo
	 * 
	 * 
	 */
	public void clickOnAddButton() throws AcisException {
		logger.info("clicking on add button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(searchButton);
		clickWebElement(addButton);
		waitForPageLoad();
		logger.info("clicked on add button");
	}

	/*
	 * click on Search Placement Resource
	 * 
	 * @author khushboo
	 */
	public void searchPlacementResource() throws AcisException {
		logger.info("clicking on placement Search ");
		clickWebElement(SearchforPlacementResource);
		logger.info("clicked on placement Search ");

	}

	/**
	 * enter value in Placement name
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void enterTextPlacementName(String placementname) throws AcisException {
		logger.info("Entering child name : " + placementname);
		// waitForElement(childTextBox);
		enterText(SearchforPlacementResource, placementname);
		waitForPageLoadTill(5);
	//	waitForElement(driver.findElement(By.xpath("(//*[contains(text(),'" + placementname + "')])")));
		waitForElement(driver.findElement(By.xpath("(//*[contains(text(),'Placement Name:')])[last()]")));
		clickWebElement(driver.findElement(By.xpath("(//*[contains(text(),'Placement Name:')])[last()]")));
		//clickWebElement(driver.findElement(By.xpath("(//*[contains(text(),'" + placementname + "')])")));
		waitForPageLoadTill(5);
		logger.info("Entered child name : " + placementname);
	}

	/*
	 * select radio button of Alleged maltreator
	 * 
	 * @author khushboo
	 * 
	 * 
	 */
	public void selectRadiobutton() throws AcisException {
		logger.info("clicking on select radio button");
		waitForPageLoad();
		clickWebElement(allegedMaltreator);
		logger.info("clicked on select radio button");

	}

	/*
	 * click on save button
	 * 
	 * @author khushboo
	 */
	public void clickOnSaveButton() throws AcisException {
		logger.info("clicking on save button");
		clickWebElement(btnSave);
		logger.info("clicked on save button");

	}
}
