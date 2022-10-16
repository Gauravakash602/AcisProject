package com.acis.automation.pages.investigation;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;




public class PersonsInvovled_Workflow_OmniscriptPage extends PageBase{

	public PersonsInvovled_Workflow_OmniscriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
		final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_Workflow_OmniscriptPage.class);

		
		@FindBy(xpath = "(//*[text()='First Name']//..//..//..//input)[1]")
		WebElement firstNames;
		
		@FindBy(xpath = "//span[text()='Search']")
		WebElement searchButton;
		
		@FindBy(xpath = "//table//thead//tr//th[text()='FIRST NAME']")
		WebElement firstNameVerify;
		
		public By closeVerify = By.xpath("//button[text()='Close']");
		
		@FindBy(xpath = "//button[text()='Close']")
		WebElement close;
		
		@FindBy(xpath = "(//*[text()='Last Name']//..//..//..//input)[1]")
		WebElement lastNames;
		
		@FindBy(xpath = "(//*[text()='Date of Birth']//..//..//..//input)[1]")
		WebElement dateofBirth;

		
		@FindBy(xpath = "//span[contains(text(),'here')]/../..//button")
		WebElement linkCreateNewPerson;
		
		@FindBy(xpath = "//*[contains(text(),'Case Person')]/../../..//*[text()='First Name']/../../..//input")
		public static WebElement firstNameTextBox;

		@FindBy(xpath = "//*[contains(text(),'Case Person')]/../../..//*[text()='Last Name']/../../..//input")
		public static WebElement lastNameTextBox;

		@FindBy(xpath = "//*[contains(text(),'Case Person')]/../../..//*[text()='Middle Name']/../../..//input")
		public static WebElement middleNameTextBox;
		
		@FindBy(xpath = "(//*[contains(text(),'Case Person')]/../..//*[text()='Save'])[1]")
		WebElement saveButtonFirst;
		
		@FindBy(xpath = "(//*[contains(text(),'Case Person')]/../..//*[text()='Save'])[last()]")
		WebElement saveButton;
		
		@FindBy(xpath = "//span[contains(text(),'Refresh Person')]")
		WebElement refreshPersonsButton;
		
		@FindBy(xpath = "//*[contains(text(),'details are saved. Close this')]")
		WebElement saveVerify;
		
		@FindBy(xpath = "//*[text()='Close']")
		WebElement closeButton;
		
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		 @FindBy(xpath="//h1[text()='Establish Relationships']")
		 WebElement verifyEstablishLabel;

		 @FindBy(xpath = "(//*[contains(text(),'Case Person')]/../..//*[contains(text(),'Date of Birth')]/../..//input)[last()]")
		WebElement birthDateTextBox;
		 
		@FindBy(xpath = "(//*[contains(text(),'Case Person')]/../..//*[contains(text(),'Date of Birth')]/../..//*[text()='Pick a Year']/../..//select)[last()]")
		WebElement birthdateYearlist;
		
		@FindBy(xpath = "//*[contains(text(),'Case Person')]/../..//*[text()='Date of Birth']/../..//*[text()='15']")
		WebElement dateBirthdate;
	
		 
		 @FindBy(xpath = "//button[@title='Previous Month']")
		WebElement previousMonth;
		 
		 @FindBy(xpath = "(//*[contains(text(),'Case Person')]/../..//*[contains(text(),'Date of Death')]/..//input)[1]")
		WebElement deathDateTextbox;

		@FindBy(xpath = "//*[contains(text(),'Case Person')]/../..//*[contains(text(),'Date of Death')]/../..//span[text()='15']")
		WebElement dateOfDeath;
	 
		 
		 @FindBy(xpath="//*[contains(text(),'Case Person')]/../../..//*[text()='Cause of Death']")
		 WebElement causeOfDeathLabel;
		
		 @FindBy(xpath="//*[contains(text(),'Case Person')]/../../..//*[text()='Cause of Death']/..//input")
		 WebElement causeOfDeathInputbox;
		
		 @FindBy(xpath="//*[contains(text(),'Case Person')]/../../..//*[text()='Cause of Death']/..//span[@title='An injury resulting from abuse and/or neglect']")
		 WebElement causeOfDeath_injury;
		 
		 @FindBy(xpath="//*[contains(text(),'Case Person')]/../../..//*[text()='Cause of Death']/..//span[@title='Abuse and/or neglect were contributing factors']")
		 WebElement causeOfDeath_AbuseNeglect;
		
		 @FindBy(xpath="//*[contains(text(),'Case Person')]/../../..//*[text()='Cause of Death']/..//span[@title='Natural Causes']")
		 WebElement causeOfDeath_NaturalCauses;
		
		 public By causeOfDeathRequiredError = By.xpath("//*[contains(text(),'Cause of Death is required for children when Date of Death is entered')]");
		
		/**
		 * Click on close button
		 * 
		 * @author Dharmesh Krishna
		 * @throws AcisException
		 * @throws InterruptedException
		 */
		public void closeCreateIntakePerson() throws AcisException {
			logger.info("Closing CreateIntakePerson");
			waitForElement(saveVerify);
			clickWebElemntUsingJavascriptExecutor(closeButton);
			waitForPageLoadTill(5);
			waitForElement(refreshPersonsButton);
			logger.info("Added Person");
		}
		
		/**
		 * Click on refresh person button
		 * 
		 * @author mrunal.s.tilekar
		 */
		public void clickRefresPersonButton() throws AcisException {
			logger.info("Clicking refresh person button");
			waitForPageLoadTill(5);
			clickWebElemntUsingJavascriptExecutor(refreshPersonsButton);
			waitForPageLoadTill(5);
			logger.info("Clicked refresh person button");
			waitForPageLoadTill(5);
			logger.info("Successfully clicked refresh person button");

		}
		
		/**
		 * Set First name, middle name, last name
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void setAllNames(String firstName, String middleName, String lastName) throws AcisException {
			waitForElement(firstNameTextBox);
			enterText(firstNameTextBox, firstName);
			enterText(middleNameTextBox, middleName);
			enterText(lastNameTextBox, lastName);
			logger.info("Set First name, middle name, last name");
			waitForPageLoadTill(5);
		}

		/**
		 * Click on save button
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 * @throws InterruptedException 
		 */
		public void clickSaveButton(String option) throws AcisException, InterruptedException {
			switch(option)
			{
				case "first":
					logger.info("Clicking on save button");
					clickWebElemntUsingJavascriptExecutor(saveButtonFirst);
					waitForPageLoadTill(5);
					logger.info("Clicked on save button");
					break;
			
				case "next":
					logger.info("Clicking on save button");
					clickWebElemntUsingJavascriptExecutor(saveButton);
					waitForPageLoadTill(5);
					logger.info("Clicked on save button");
					break;
			}
			waitForPageLoadTill(5);
			
		}
		
		/**
		 * Search a person with valid input
		 * 
		 * @author akash.a.gaurav
		 * @throws AcisException
		 * @throws InterruptedException
		 */
		public void searchPersonUsingvalidData(String name, String str1) throws AcisException, InterruptedException {

			switch (name) {
			case "firstName":
				logger.info("Selecting first Name  and searching ");
				waitForElement(firstNames);
				enterText(firstNames, str1);
				waitForPageLoadTill(5);
				clickWebElement(searchButton);
				waitForElement(firstNameVerify);
				waitForPageLoadTill(5);
				if (isElementPresent(closeVerify)) {
					logger.info("Clicking on Close Button");
					waitForElementClickable(close);
					clickWebElement(close);
					logger.info("Clicked on Close Button");
				}
				logger.info("Searching using first person");
				break;

			case "lastName":
				logger.info("Seleting last name and searching ");
				waitForElement(lastNames);
				enterText(lastNames, str1);
				waitForPageLoadTill(5);
				clickWebElement(searchButton);
				waitForElement(firstNameVerify);
				waitForPageLoadTill(5);
				if (isElementPresent(closeVerify)) {
					logger.info("Clicking on Close Button");
					waitForElementClickable(close);
					clickWebElement(close);
					logger.info("Clicked on Close Button");
				}
				logger.info("Searching using lastname person");
				break;

			case "dob":
				logger.info("Selecting dob name and searching ");
				waitForElement(dateofBirth);
				enterText(dateofBirth, str1);
				waitForPageLoadTill(5);
				clickWebElement(searchButton);
				waitForElement(firstNameVerify);
				waitForPageLoadTill(5);
				if (isElementPresent(closeVerify)) {
					logger.info("Clicking on Close Button");
					waitForElementClickable(close);
					clickWebElement(close);
					logger.info("Clicked on Close Button");
				}
				logger.info("Searching using dob person");
				break;
			default:
				logger.info("Date: " + name + " not found");
				break;

			}

		}
		
		/***
		 * Link to create new person
		 * 
		 * @throws AcisException
		 */
		public void linkToCreateNewPerson() throws AcisException {
			waitForPageLoadTill(9);
			logger.info("Clikcing on link to create new person");
			Actions act = new Actions(driver);
			waitForPageLoadTill(9);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,650)");
			clickWebElemntUsingJavascriptExecutor(linkCreateNewPerson);
			logger.info("Clicked on link to create new person");
			waitForPageLoadTill(10);
		}
		
		/**
		 * click on Next button
		 * @author mrunal.s.tilekar
		 */
		public void clickNextButton() throws AcisException, InterruptedException {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.END).build().perform();
			waitForPageLoadTill(5);
			clickWebElement(nextButton);
			waitForPageLoad();
			waitForPageLoadTill(5);
			waitForElement(verifyEstablishLabel);
			logger.info("Clicked on Next button");

		}
		
		
		/**
		 * Verify error : Date of death can not be future date
		 * 
		 * @author mrunal.s.tilekar
		 * @throws AcisException
		 */
		public void provideDateOfDeath() throws AcisException {
			logger.info("Entering date of death");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_UP).build().perform();
			waitForPageLoadTill(5);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			waitForElementClickable(deathDateTextbox);
			clickWebElement(deathDateTextbox);
			try {
				waitForElementClickable(previousMonth);
				act.moveToElement(previousMonth).click().perform();
				waitForElementClickable(dateOfDeath);
				act.moveToElement(dateOfDeath).click().perform();
			} catch (Exception e) {
				act.sendKeys(Keys.ARROW_UP).build().perform();
				waitForElementClickable(deathDateTextbox);
				clickWebElement(deathDateTextbox);
			}


		}
		
		
		/**
		 * Enter Birth-date on Create Intake Person
		 * 
		 * @author Dharmesh Krishna
		 * @throws AcisException
		 */
		public void provideBirthdate(String year) throws AcisException {
			logger.info("Entering BirthDate");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_UP).build().perform();
			waitForPageLoadTill(5);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			waitForPageLoadTill(5);
			waitForElementClickable(birthDateTextBox);
			act.moveToElement(birthDateTextBox).click().perform();
			// clickWebElement(birthDateTextBox);
			waitForElementClickable(birthdateYearlist);
			act.moveToElement(birthdateYearlist).click().perform();

			Select birthyearList = new Select(birthdateYearlist);
			List<WebElement> elementCount = birthyearList.getOptions();
			int iSize = elementCount.size();

			for (int i = 0; i < iSize; i++) {
				String birthyearValue = elementCount.get(i).getText().trim();
				// System.out.println(birthyearValue);
				if (birthyearValue.equalsIgnoreCase(year)) {
					birthyearList.selectByVisibleText(year);
					logger.info(" matching birthyear Value");
					break;
				} else {
					System.out.println("No matching birthyear Value");
					logger.info("No matching birthyear Value");
				}

			}

			act.moveToElement(dateBirthdate).click().perform();
			logger.info("BirthDate entered");

		}
		
		
		/**
		 * Get current Year
		 * @author mrunal.s.tilekar
		 */
		public int getCurrentYear() {
			logger.info("Get current year");
			int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			System.out.println("Current Year: " + currentYear);
			return currentYear;
		}
		
		
		/**
		 * Verify Error: Cause of Death is required for children when Date of Death is entered.
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void verifyCauseOfDeathRequiredError() throws AcisException {
			logger.info("Veriying Error: Cause of Death is required for children when Date of Death is entered.");
			clickWebElement(saveButton);
			waitForPageLoadTill(5);
			scrollingToElementofAPage(causeOfDeathLabel);
			waitAndVerifyElement(causeOfDeathRequiredError);
			logger.info("Veriyed Error: Cause of Death is required for children when Date of Death is entered.");
			
		}
		
		
		/**
		 * Check Cause of death dropdown values
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void verifyCauseOfDeathValues() throws AcisException {
			logger.info("Checking Cause of death dropdown values");
			scrollingToElementofAPage(causeOfDeathInputbox);
			clickWebElement(causeOfDeathInputbox);
			waitForElement(causeOfDeath_injury);
			waitForElement(causeOfDeath_AbuseNeglect);
			waitForElement(causeOfDeath_NaturalCauses);
			logger.info("Checked Cause of death dropdown values");
			clickWebElement(causeOfDeathInputbox);
		}
		
		/**
		 * Select Cause of death
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void selectCauseOfDeath(String option) throws AcisException {
			logger.info("Selecting Cause of death : " + option);
			
			switch (option) {
			case "Injury":
				scrollingToElementofAPage(causeOfDeathInputbox);
				clickWebElement(causeOfDeathInputbox);
				waitForPageLoadTill(5);
				clickWebElement(causeOfDeath_injury);
				logger.info("Selected Cause of death : " + option);
				
				break;
				
			case "AbuseNeglect":
				scrollingToElementofAPage(causeOfDeathInputbox);
				clickWebElement(causeOfDeathInputbox);
				waitForPageLoadTill(5);
				clickWebElement(causeOfDeath_AbuseNeglect);
				logger.info("Selected Cause of death : " + option);
				
				break;
				
			case "NaturalCaused":
				scrollingToElementofAPage(causeOfDeathInputbox);
				clickWebElement(causeOfDeathInputbox);
				waitForPageLoadTill(5);
				clickWebElement(causeOfDeath_NaturalCauses);
				logger.info("Selected Cause of death : " + option);
				
				break;

			default:
				break;
			}
			
		}
		
}

