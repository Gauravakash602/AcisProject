package com.acis.automation.pages.licensingactivities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;
import com.github.javafaker.Faker;

public class PortalPage extends PageBase {

	public PortalPage() throws AcisException {

		// TODO Auto-generated constructor stub
		super();

	}

	public static Logger logger = LoggerFactory.getLogger(PortalPage.class);

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//*[@name='ssn']")
	WebElement SocialSecuritynumber;
	@FindBy(xpath = "(//*[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click'])[1]")
	WebElement householdname;
	@FindBy(xpath = "//*[@name='p1schoolgrade']")
	WebElement schoolgrade;
	@FindBy(xpath = "//*[@name='p1schoolname']")
	WebElement schoolname;

	@FindBy(xpath = "//*[@name='street1']")
	WebElement street1;
	@FindBy(xpath = "//*[@name='city']")
	WebElement city;
	@FindBy(xpath = "//*[@name='county']")
	WebElement country;
	@FindBy(xpath = "//*[@name='state']")
	WebElement state;

	@FindBy(xpath = "//*[@name='zippostalcode']")
	WebElement zip;
	@FindBy(xpath = "//*[@name='directions']")
	WebElement directions;
	@FindBy(xpath = "//*[@name='appAMaiden']")
	WebElement maidenName;
	@FindBy(xpath = "(//*[@name='maritalA'])[1]")
	WebElement maritalstatus_single;
	@FindBy(xpath = "(//*[@name='licenseRev'])[2]")
	WebElement licenseRevision_OptNo;
	@FindBy(xpath = "(//*[@name='adoptovefosterhome'])[1]")
	WebElement adoptovefosterhome_optYes;
	@FindBy(xpath = "(//*[text()='Add Reference'])")

	WebElement addreferencebutton;
	@FindBy(xpath = "(//*[contains(text(),'First Name')]//following::div)[1]/input")
	WebElement Firstname;

	@FindBy(xpath = "//*[@type='phone']")
	WebElement Telephone;

	@FindBy(xpath = "//*[@class='slds-button slds-button_icon slds-button_icon-border']")
	WebElement refreshbutton;
	
	@FindBy(xpath = "//*[text()='Save']")
	WebElement Save;
	
	

	/**
	 * Clicking on Next Button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void clickNext() throws AcisException {
		logger.info("Clicking on Next Button");
		waitForPageLoad();
		waitForElement(nextButton);
		clickWebElement(nextButton);
		waitForPageLoadTill(20);
		waitForPageLoad();
		logger.info("Clicked on Next Button");
	}

	/**
	 * Clicking on Submit Button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void clickSubmitButton() throws AcisException {
		logger.info("Clicking on Submit Button");
		waitForPageLoad();
		waitForElement(submitButton);
		clickWebElement(submitButton);
		waitForPageLoadTill(20);
		waitForPageLoad();
		logger.info("Clicked on Submit Button");
	}

	/**
	 * Filling Portal first page,mandatory fields
	 * 
	 * @author Sankari Krishnan
	 * @throws AcisException
	 */

	public void FillingPortal_Firstpage() throws AcisException {
		Actions act = new Actions(driver);
		logger.info("Filling portal First page");
		waitForPageLoadTill(30);
		waitForElement(SocialSecuritynumber);
		enterText(SocialSecuritynumber, "123-23-1234");

		waitForElement(householdname);
		clickWebElement(householdname);
		act.sendKeys(Keys.ENTER).build().perform();

		waitForElement(schoolgrade);
		enterText(schoolgrade, "Graduate");

		waitForElement(schoolname);
		enterText(schoolname, "Public School");

	}

	/**
	 * Filling Portal second page,mandatory fields
	 * 
	 * @author Sankari Krishnan
	 * @throws AcisException
	 */

	public void FillingPortal_secondpage() throws AcisException {
		logger.info("Filling portal second page");
		waitForPageLoadTill(15);

		waitForElement(street1);

		enterText(street1, testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));

		enterText(city, testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));

		enterText(state, testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));

		enterText(country, testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCountry"));

		enterText(zip, testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));

		enterText(directions, "north");

	}

	public void FillingPortal_lastpage() throws AcisException {
		logger.info("Filling portal last page");
		waitForPageLoadTill(15);
		Faker faker = new Faker();
		String maidenname = faker.name().firstName();

		waitForElement(maidenName);
		enterText(maidenName, maidenname);
		logger.info("Filled maiden name"+maidenname);

		clickWebElemntUsingJavascriptExecutor(maritalstatus_single);
		logger.info("Marital status updated");

		clickWebElemntUsingJavascriptExecutor(licenseRevision_OptNo);
		logger.info("License revision radio button clicked");
		clickWebElemntUsingJavascriptExecutor(adoptovefosterhome_optYes);
		logger.info("adoptovefosterhome_optYes radio button clicked");

	}

	public void AddingReference() throws AcisException {
		logger.info("Adding reference");
		waitForPageLoadTill(15);

		for(int i=0;i<4;i++)
		{
			Faker faker = new Faker();
			String parentFirstName = faker.name().firstName();
			waitForElement(addreferencebutton);
			clickWebElemntUsingJavascriptExecutor(addreferencebutton);
		logger.info("clicked on addreferencebutton");
		
		waitForElement(Firstname);
		enterText(Firstname, parentFirstName);
		logger.info("Reference  name entered");

		enterText(Telephone, "1234567890");
		logger.info("Reference  Telephone entered");
		
		clickWebElemntUsingJavascriptExecutor(Save);
		logger.info("clicked on save");
		waitForPageLoadTill(15);
		
		}
		
		waitForElement(refreshbutton);
		clickWebElemntUsingJavascriptExecutor(refreshbutton);
		logger.info("clicked on refreshbutton");
		

	}

}
