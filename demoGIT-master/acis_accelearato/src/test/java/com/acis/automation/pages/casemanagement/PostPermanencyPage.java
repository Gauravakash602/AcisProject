package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PostPermanencyPage extends PageBase {

	public PostPermanencyPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(PostPermanencyPage.class);

	@FindBy(xpath = "//*[text()='Type']/../../..//input")
	WebElement type;
	
	@FindBy(xpath = "//*[text()='Adoption']")
	WebElement adoption;
	
	@FindBy(xpath = "//*[text()='Guardianship']")
	WebElement guardianship;
	
	@FindBy(xpath = "(//lightning-input/div/span/label/span[1])[1]")
	WebElement casePerson;
	
	@FindBy(xpath = "//*[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "(//*[text()='Related'])[last()]")
	WebElement relatedTab;
	
	@FindBy(xpath = "(//*[text()='Case Persons'])[last()]")
	WebElement casePersonTab;
	
	@FindBy(xpath = "//*[text()='New Person']")
	WebElement newPerson;
	
	@FindBy(xpath = "//h1[text()='Persons Involved']")
	WebElement personInvolvedVerify;
	
	@FindBy(xpath = "//lightning-formatted-text[text()='Post Permanency']")
	WebElement postPermanencyVerify;
	
	
	@FindBy(xpath = "(//p[text()='Child Welfare Case ID']/..//lightning-formatted-text[contains(text(),'C-')])[last()]")
	WebElement chilWelfareCaseId;
	
	public By personInvolvedVerifyBy= By.xpath("//h1[text()='Person(s) Involved']");
	
	@FindBy(xpath = "(//*[contains(text(),'Child Welfare Case I')])[1]")
	WebElement caseActionIDLabel;

	@FindBy(xpath = "//*[text()='Insights']")
	WebElement insightsTab;
	
	@FindBy(xpath = "//*[text()='Services Provided']")
	WebElement servicesProvided;
	
	@FindBy(xpath = "//h1[text()='Services Provided']")
	WebElement servicesProvided_Title;
	
	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;
	
	@FindBy(xpath = "//h2[text()='New Services Provided']")
	WebElement newServicesProvidedTitle;
	
	@FindBy(xpath = "//*[text()='Service Type']/..//input")
	WebElement serviceType_inputBox;

	@FindBy(xpath = "//*[@title='Mental Health Service']")
	WebElement mentalHealthService;
	
	@FindBy(xpath = "//*[@title='Crisis Intervention']")
	WebElement crisisIntervention;
	
	@FindBy(xpath = "(//lightning-input/div/span/label/span)[1]")
	WebElement householdMemberCheckbox;
	
	@FindBy(xpath = "(//lightning-input/div/span/label/span)[3]")
	WebElement secondHouseholdMemberCheckbox;
	
	
	@FindBy(xpath = "//*[text()='Subtype']/../../..//input")
	WebElement subtype;
	
	@FindBy(xpath = "//*[text()='Post-Adoption']")
	WebElement Postadoption;
	
	@FindBy(xpath = "//*[text()='Post-Guardianship']")
	WebElement postguardianship;
	
	
	/**
	 * Select Type in Post Permanency Case Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void selectType(String option) throws AcisException {
		logger.info("Clicking on Type");
		waitForElement(type);
		clickWebElement(type);
		logger.info("Selecting option:"+option);
		switch (option) {
		case "Adoption":
			waitForElement(adoption);
			clickWebElement(adoption);
			break;
		case "Guardianship":
			waitForElement(guardianship);
			clickWebElement(guardianship);
			break;
		default:
			break;
		}
		logger.info("Selected option:"+option);
	}
	
	
	/**
	 * Select SubType in Post Permanency Case Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void selectSubType(String option) throws AcisException {
		logger.info("Clicking on SubType");
		waitForElement(subtype);
		clickWebElement(subtype);
		logger.info("Selecting option:"+option);
		switch (option) {
		case "Post-Adoption":
			waitForElement(Postadoption);
			clickWebElement(Postadoption);
			break;
		case "Post-Guardianship":
			waitForElement(postguardianship);
			clickWebElement(postguardianship);
			break;
		default:
			break;
		}
		logger.info("Selected option:"+option);
	}
	
	
	/**
	 * Click Submit button Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickSubmit() throws AcisException {
		logger.info("Clicking on Submit Button");
		clickWebElement(submitButton);
		waitForPageLoadTill(10);
		waitForPageLoad();
//		waitForElement(postPermanencyVerify);
		logger.info("Clicked on Submit Button");
	}
	
	
	/**
	 * Clicked on Related Tab on a Foster Care Case Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElement(relatedTab);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");

	}
	
	/**
	 * Clicked on New Person Tab on Froster Care Case Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickPersonTab() throws AcisException {
		logger.info("Clicking on New Person Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(casePersonTab);
		clickWebElemntUsingJavascriptExecutor(casePersonTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Person Tab");

	}
	
	/**
	 * Clicked on New Person on Case Person Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickNewPerson() throws AcisException {
		logger.info("Clicking on New Person Button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(newPerson);
		waitForPageLoadTill(10);
		if(isElementPresent(personInvolvedVerifyBy)==false)
		{
			waitForPageLoadTill(10);
		}
		waitForElement(personInvolvedVerify);
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(personInvolvedVerify);
		logger.info("Clicked on New Person Button");
	}
	
	/**
	 * Creating Post Permanency Case Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public String newPostPermanencyCase() throws AcisException {
		String postPermanencyCaseID;
		
		waitForElement(chilWelfareCaseId);
		postPermanencyCaseID = chilWelfareCaseId.getText();
		System.out.println("Created Post Permanency Case ID " + postPermanencyCaseID);
		testLoggerInfo("Created Post Permanency Case ID " + postPermanencyCaseID);
		return postPermanencyCaseID;
	}

	
	/**
	 * Click Insights Tab of Case Action page
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickInsightsTab() throws AcisException {
		logger.info("Clicking Insights Tab of Case Action page");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseActionIDLabel);
		Actions act = new Actions(driver);
		waitForElement(insightsTab);
//		act.moveToElement(insightsTab).click().perform();
		try {
			clickWebElement(insightsTab);
		} catch (Exception e) {
			clickWebElement(caseActionIDLabel);
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			waitForPageLoadTill(5);
			clickWebElement(insightsTab);
		}	
		waitForPageLoadTill(5);
		logger.info("Clicked Insights Tab of Case Action page");
	}
	
	
	/**
	 * Clicked on Services Provided Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickServicesProvided() throws AcisException {
		logger.info("Clicking on Services Provided Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(servicesProvided);
		clickWebElemntUsingJavascriptExecutor(servicesProvided);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(servicesProvided_Title);
		logger.info("Clicked on Services Provided Tab");

	}
	
	/**
	 * click new button
	 * 
	 * @author
	 * @throws AcisException
	 */
	public void clickNewButton() throws AcisException {
		logger.info("clicking new button");
		clickWebElemntUsingJavascriptExecutor(newButton);
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(newServicesProvidedTitle);
		logger.info("clicked new button");

	}

	
	/**
	 * Click on service type
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickServiceType() throws AcisException {
		logger.info("Clicking on service type");
		scrollingToElementofAPage(serviceType_inputBox);
		clickWebElement(serviceType_inputBox);
		waitForPageLoadTill(5);
		logger.info("Clicked on service type");
	}
	
	/**
	 * Check service type value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void checkServiceTypeValue(String typeValue) throws AcisException {
		logger.info("Check service type value:" + typeValue);
		Assert.assertTrue(isElementPresent(By.xpath("//*[@title='"+  typeValue +"']")), "Error: No matching service type value present");
		logger.info("Checked service type value:" + typeValue);
	}
	
	/** selecting both Maltreator and vicitm on Create New Post Permanency Case
	 * @author mrunal.s.tilekar
	 */
	public void selectMaltreatorVicitm() throws AcisException {
		logger.info("Selecting One Household Person Record");
		waitForPageLoad();
		waitForElement(householdMemberCheckbox);
		clickWebElement(householdMemberCheckbox);
		clickWebElement(secondHouseholdMemberCheckbox);
		waitForPageLoadTill(5);
		logger.info("Selected One Household Person Record");
	}
}

