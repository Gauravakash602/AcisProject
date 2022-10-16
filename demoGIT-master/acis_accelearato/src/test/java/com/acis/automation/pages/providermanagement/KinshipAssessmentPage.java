package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class KinshipAssessmentPage extends PageBase {
	public static Logger logger = LoggerFactory.getLogger(KinshipAssessmentPage.class);

	public KinshipAssessmentPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//*[text()='Placement Resource Type'])[last()]//..//..//button")
	WebElement btnEdit;

	@FindBy(xpath = "//*[text()='Placement Resource Type']//..//input")
	WebElement resourceType;

	@FindBy(xpath = "(//*[text()='Foster Home'])[last()]")
	WebElement fosterHome;

	@FindBy(xpath = "//*[text()='Placement Provider']")
	WebElement placementProvider;

	@FindBy(xpath = "//*[text()='Placement Resource Subtype']//..//..//input")
	WebElement placementResourceSubtype;

	@FindBy(xpath = "//*[text()='DCS Foster Home - Unlicensed Relative']")
	WebElement DCSUnicensed;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement btnSave;

	@FindBy(xpath = "//*[text()='Kinship Assessment Checklists']//..//..//..//..//..//..//*[text()='New']")
	WebElement newBtnAssessment;

	@FindBy(xpath = "//*[text()='Kinship Assessment Checklist']")
	WebElement KinshipAssessmentChecklist;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement btnNext;

	@FindBy(xpath = "(//button[text()='Submit'])[last()]")
	WebElement btnSubmit;

	@FindBy(xpath = "//*[text()='Finish']")
	WebElement btnFinish;

	@FindBy(xpath = "(//*[contains(text(),'https://acis--qa')])[last()]")
	WebElement link;

	@FindBy(xpath = "((//*[text()='Placement Resource Type'])[2]//..//..//span)[3]")
	WebElement editlink;
	
	@FindBy(xpath="//*[text()='Accept']")
	WebElement btnAccept;
	
	@FindBy(xpath="//div[text()='Supervisor Comments']//..//..//..//..//textarea")
	WebElement txtcomments;

	/*
	 * click on edit button of placement resource account
	 * 
	 * @khushboo
	 * 
	 * 
	 */
	public void editPage() throws AcisException {
		logger.info("clicking on edit button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,400)");
		clickWebElement(btnEdit);
		waitForPageLoad();
		logger.info("clicked on edit button");

	}

	/*
	 * select placement Resource type
	 * 
	 * @khushboo
	 * 
	 */
	public void selectResourceType(String options) throws AcisException {
		logger.info("selecting Resourcing");
		/*
		 * Actions act = new Actions(driver);
		 * act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		 * scrollingToElementofAPage(resourceType);
		 */
		clickWebElemntUsingJavascriptExecutor(resourceType);
		switch (options) {
		case "Foster Home":
			waitForElementClickable(fosterHome);
			clickWebElemntUsingJavascriptExecutor(fosterHome);
			break;
		case "Placement Provider":
			clickWebElement(placementProvider);
			break;

		}
	}

	/*
	 * select Placement resource type
	 * 
	 * @khushboo
	 * 
	 * 
	 */
	public void selectPlacementResourceType(String options) throws AcisException {
		logger.info("selecting subtype");
		clickWebElement(placementResourceSubtype);
		switch (options) {
		case "DCS Unlicenced":
			clickWebElemntUsingJavascriptExecutor(DCSUnicensed);
			break;
		case "Placement Provider":
			clickWebElement(placementProvider);
			break;

		}
	}

	public void saveBtn() throws AcisException {
		logger.info("clicking on save button");
		clickWebElement(btnSave);
		waitForPageLoad();
		/*
		 * driver.navigate().refresh(); waitForPageLoadTill(10);
		 */		logger.info("clicked on save button");
	}

	/*
	 * click on new button of kinship assessment
	 * 
	 * 
	 * 
	 */
	public void kinshipAssessmentnew() throws AcisException {
		logger.info("clicking on new button of kinship");
		/*
		 * Actions act = new Actions(driver);
		 * act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		 * scrollingToElementofAPage(newBtnAssessment);
		 */
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,2000)");
		clickWebElement(newBtnAssessment);
		waitForPageLoad();
		logger.info("clicked on new button of kinship");

	}

	/*
	 * radio button kinship assessment checklist
	 * 
	 * @khushboo
	 * 
	 * 
	 */
	public void kinshipChecklist() throws AcisException {
		logger.info("clicking on radio button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		scrollingToElementofAPage(KinshipAssessmentChecklist);
		clickWebElement(KinshipAssessmentChecklist);
		clickWebElement(btnNext);
		waitForPageLoad();
		logger.info("clicked on radio button");

	}

	/*
	 * complete the flow by submit,next and finish
	 * 
	 */
	public void clickOnSubmit() throws AcisException {
		logger.info("click on submit button");
		clickWebElement(btnSubmit);
		waitForPageLoadTill(10);
		waitForPageLoad();
		clickWebElement(btnNext);
		waitForPageLoad();
		clickWebElement(btnFinish);
	}

	/*
	 * click link for supervisor approval
	 * 
	 * 
	 * 
	 */
	public void clickOnLink() throws AcisException {
		logger.info("clicking on link");
		clickWebElement(link);
		waitForPageLoadTill(10);

	}
	/*verify buttons
	 * @khushboo
	 * 
	 */
	public void checkButtons() throws AcisException {
		logger.info("checking on buttons");
		isElementPresent(By.xpath("//*[text()='Accept']"));
		isElementPresent(By.xpath("//*[text()='Return for Edits']"));
		logger.info("checked on buttons");
		
	}
	/*click on accept buttons
	 *@khushboo
	 */
	public void clickOnAccept() throws AcisException {
		logger.info("clicking  on Accept buttons");
		waitForPageLoad();
		clickWebElement(btnAccept);
		logger.info("clicking  on Accept buttons");	
	}
	/*fill testarea
	 * @Khushboo
	 * 
	 * 
	 */
	public void testComments(String text) throws AcisException {
		logger.info("text  on Accept buttons");
		waitForPageLoad();
		enterText(txtcomments, text);
		
	}
	/*clickon next and finish
	 * 
	 * 
	 * 
	 */
	public void supervisorFinishbutton() throws AcisException {
		clickWebElement(btnNext);
		waitForPageLoad();
		clickWebElement(btnFinish);
	}
	 
}
