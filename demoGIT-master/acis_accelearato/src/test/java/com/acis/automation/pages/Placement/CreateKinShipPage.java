package com.acis.automation.pages.Placement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CreateKinShipPage extends PageBase {
	public CreateKinShipPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CreateKinShipPage.class);

	@FindBy(xpath = "//*[text()='Select the Child']//..//..//input")
	WebElement textSelectchild;

	@FindBy(xpath = "//*[text()='Case']//..//..//..//input")
	WebElement textCase;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement btnNext;

	@FindBy(xpath = "//*[contains(text(),'Case id: C-0000')]")
	WebElement caseID;

	@FindBy(xpath = "//*[text()='Parent 1']//..//..//..//input")
	WebElement textParent1;

	@FindBy(xpath = "//*[contains(text(),'Name: FirstName')]")
	WebElement firstParent;

	@FindBy(xpath = "//*[text()='Parent 2']//..//..//..//input")
	WebElement textParent2;

	@FindBy(xpath = "//*[contains(text(),'Name: Joe')]")
	WebElement secondParent;

	// Home Information
	@FindBy(xpath = "//*[text()='Address']//..//..//input")
	WebElement textaddress;

	@FindBy(xpath = "//*[contains(text(),'NXP Main Entrance, Austin, TX, USA')]")
	WebElement selectAddress;

	@FindBy(xpath = "//*[text()='Type']//..//..//..//input")
	WebElement selectType;

	@FindBy(xpath = "//*[text()='Type']//..//..//..//input//..//../..//*[text()='Home']")
	WebElement typeHome;

	@FindBy(xpath = "//*[text()='Type']//..//..//..//input//..//../..//*[text()='Mailing']")
	WebElement typeMailing;

	@FindBy(xpath = "//*[text()='Type']//..//..//..//input//..//../..//*[text()='Business']")
	WebElement typeBusiness;

	@FindBy(xpath = "//*[text()='Type']//..//..//..//input//..//../..//*[text()='School']")
	WebElement typeSchool;

	@FindBy(xpath = "//*[text()='Type']//..//..//..//input//..//../..//*[text()='Other']")
	WebElement typeOther;

	@FindBy(xpath = "//*[text()='Submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//*[text()='Would you like to use the primary address for parent 1 as address for placement resource account?']//..//span")
	WebElement checkBox;

	/*
	 * enter text in select case
	 * 
	 * created by khushboo
	 */
	public void selectChild(String text) throws AcisException {
		logger.info("entering text in select child");
		clickWebElement(textSelectchild);
		/*
		 * enterText(textSelectchild, text);
		 * waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'Name:" +
		 * text + "')])[last()]"))); Actions action =new Actions(driver);
		 * action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'" +
		 * text + "')])[last()]"))).click().perform();
		 */
		enterText(textSelectchild, text);
		waitForPageLoadTill(5);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Name: Benni ')][last()]"))).click().perform();

		logger.info("entered text in select child");
	}

	/*
	 * enter case id created by khushboo
	 * 
	 */
	public void selectCaseID() throws AcisException {
		logger.info("selecting case id");
		clickWebElement(textCase);
		waitForPageLoadTill(5);
		// clickWebElement(caseID);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Case ID: C-0000')][last()]"))).click()
				.perform();

		logger.info("selected case id");

	}

	/*
	 * enter text in select case
	 * 
	 * created by khushboo
	 */
	public void selectChildText(String text) throws AcisException {
		logger.info("entering text in select child");
		clickWebElement(textSelectchild);

		enterText(textSelectchild, text);
		waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'"+ text + "')])[last()]")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'" + text + "')])[last()]"))).click()
				.perform();

		logger.info("entered text in select child");
	}

	/*
	 * click on next button created by khushboo
	 * 
	 */
	public void clickNextButton() throws AcisException {
		logger.info("clicking on next button");
		clickWebElement(btnNext);
		waitForPageLoadTill(10);
		logger.info("clicked on next button");
	}

	/*
	 * select parent created by khushboo
	 * 
	 */
	public void selectParent(String option,String Parent) throws AcisException {
		logger.info("selecting on parent");
		switch (option) {
		case "Parent 1":
			clickWebElement(textParent1);
			waitForPageLoadTill(5);
			// clickWebElement(firstParent);
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'"+ Parent +"')][last()]")))
					.click().perform();

			break;
		case "Parent 2":
			clickWebElement(textParent2);
			clickWebElement(secondParent);
			break;

		default:
			logger.info("no such parent is here");
		}
	}
	
	/*
	 * select parent created by khushboo
	 * 
	 */
	public void selectParentText(String option,String Name) throws AcisException {
		logger.info("selecting on parent");
		switch (option) {
		case "Parent 1":
			waitForPageLoadTill(5);
			clickWebElement(textParent1);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("//span[contains(text(),'"+ Name +"')][last()]")));
			clickWebElement(driver.findElement(By.xpath("//span[contains(text(),'"+ Name +"')][last()]")));

			break;
		case "Parent 2":
			clickWebElement(textParent2);
			clickWebElement(secondParent);
			break;

		default:
			logger.info("no such parent is here");
		}
	}

	/*
	 * select address created by khushboo
	 * 
	 */
	public void selectAddress(String text) throws AcisException {
		logger.info("selecting address");
		clickWebElement(textaddress);
		enterText(textaddress, text);
		waitForPageLoadTill(5);
		// clickWebElement(firstParent);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'" + text + "')][last()]"))).click()
				.perform();

		// clickWebElement(selectAddress);
		logger.info("selected Address");

	}

	/*
	 * select type created by khushboo
	 * 
	 */
	public void selectType(String option) throws AcisException {
		logger.info("selecting type");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(selectType);
		clickWebElement(selectType);
		switch (option) {
		case "Home":
			clickWebElement(typeHome);
			break;
		case "Mailing":
			clickWebElement(typeMailing);
			break;
		case "School":
			clickWebElement(typeSchool);
			break;
		case "Business":
			clickWebElement(typeBusiness);
			break;
		case "Other":
			clickWebElement(typeOther);
			break;

		default:
			logger.info("no such type is available");
		}
	}

	/*
	 * click on submit button created by khushboo
	 * 
	 * 
	 */
	public void clickSubmit() throws AcisException {
		logger.info("clicking on submit button");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(btnSubmit);
		clickWebElement(btnSubmit);
		logger.info("clicked on submit button");
		waitForPageLoad();
	}
	/*click on checkbox
	 * 
	 * 
	 */
	public void selectCheckBox() throws AcisException {
		logger.info("selecting checkbox");
		clickWebElement(checkBox);
		logger.info("selecting checkbox");

		
	}
}
