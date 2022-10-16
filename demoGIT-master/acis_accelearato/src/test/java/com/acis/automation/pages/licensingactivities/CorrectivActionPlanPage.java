package com.acis.automation.pages.licensingactivities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class CorrectivActionPlanPage extends PageBase {

	public CorrectivActionPlanPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CorrectivActionPlanPage.class);

	@FindBy(xpath = "(//*[@data-key='down'])[3]")
	WebElement downArrow;

	@FindBy(xpath = "//*[text()='Corrective Action Plan']")
	WebElement correctiveActionPlan;

	@FindBy(xpath = "//*[text()='With probation']//..//..//..//span")
	WebElement withProbation;

	@FindBy(xpath = "//*[text()='Effective Start Date']")
	WebElement EffectiveStartDate;

	@FindBy(xpath = "//*[text()='Effective Start Date']//..//..//..//input")
	WebElement textEffectiveStartDate;

	@FindBy(xpath = "//*[text()='End Date']//..//..//..//input")
	WebElement textEndDate;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement btnNext;

	@FindBy(xpath = "//*[text()='Finish']")
	WebElement btnFinish;

	@FindBy(xpath = "//*[@data-key='notification']")
	WebElement tabnotification;

	@FindBy(xpath = "((//a//div//div)[3]//span)[1]")
	WebElement firstnotification;

	@FindBy(xpath = "//*[text()='Corrective Action Plan']")
	WebElement tabCorrectiveActionPlan;

	@FindBy(xpath = "(//*[contains(text(),'CAP-')])[1]")
	WebElement correctiveActionPlanNumber;

	@FindBy(xpath = "//*[text()='Submit for Approval']")
	WebElement btnSubmitForApproval;

	@FindBy(xpath = "//*[text()='Endorse to Central Office']")
	WebElement EndorsetoCentralOffice;

	@FindBy(xpath = "//*[text()='Corrective Action Plans DCS']")
	WebElement CorrectiveActionPlansDCS;

	@FindBy(xpath = "//*[text()='Approve']")
	WebElement btnApprove;

	@FindBy(xpath = "//*[text()='Status']//..//..//lightning-formatted-text")
	WebElement checkStatus;

	@FindBy(xpath = "//*[text()='Start Date']//..//..//..//lightning-formatted-text")
	WebElement startDate;

	@FindBy(xpath = "//*[text()='End Date']//..//..//..//lightning-formatted-text")
	WebElement EndDate;

	@FindBy(xpath = "(//table/tbody/tr/th/span/a)[1]")
	WebElement firstRecord;

	@FindBy(xpath = "(//*[text()='Edit'])[last()]")
	WebElement btnEdit;

	@FindBy(xpath = "(//*[text()='Delete'])")
	WebElement btnDelete;

	/*
	 * open corrective action plan
	 * 
	 * @khushboo
	 * 
	 */
	public void correctiveActionPlan() throws AcisException {
		logger.info("open corrective action plan");
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		clickWebElement(downArrow);
		clickWebElement(correctiveActionPlan);
	}

	/*
	 * select with probation
	 * 
	 * @khushboo
	 * 
	 * 
	 */
	public void selectWithProbation() throws AcisException {
		logger.info("selecting with probation");
		clickWebElement(withProbation);
		logger.info("selected with probation");

	}

	/*
	 * select date
	 * 
	 */
	public void selectDate(String option, String date) {
		logger.info("selecting Date");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		scrollingToElementofAPage(EffectiveStartDate);
		switch (option) {
		case "Effective Date":
			textEffectiveStartDate.sendKeys(date);
			break;
		case "End Date":
			textEndDate.sendKeys(date);
			break;

		}
	}

	/*
	 * click on next button
	 * 
	 * @khushboo
	 * 
	 */
	public void clickOnnextButton() throws AcisException {
		logger.info("clicking on next button");
		clickWebElement(btnNext);
		logger.info("clicked on next button");
		waitForPageLoadTill(10);
		clickWebElement(btnFinish);

	}

	/*
	 * open notification
	 * 
	 * @khushboo
	 * 
	 * 
	 */
	public void openNotification() throws AcisException {
		logger.info("clicking on notification button");
		clickWebElement(tabnotification);
		clickWebElement(firstnotification);

	}

	/*
	 * open corrective action plan
	 * 
	 * 
	 */
	public String correctiveactionplan() throws AcisException {
		logger.info("open corrective action plan");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		scrollingToElementofAPage(tabCorrectiveActionPlan);
		String capnumber = correctiveActionPlanNumber.getText();
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(correctiveActionPlanNumber);
		return capnumber;
	}

	/*
	 * submit for approval
	 * 
	 * 
	 * 
	 */
	public void submitForApproval() throws AcisException {
		logger.info("submit for approval");
		clickWebElement(btnSubmitForApproval);
		waitForPageLoadTill(10);
		clickWebElement(btnFinish);

	}

	/*
	 * open corrective action plan DCS
	 * 
	 * @khushboo
	 * 
	 * 
	 */
	public void correctiveActionPlanDCS() throws AcisException {
		logger.info("open corrective action plan DCS");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		scrollingToElementofAPage(CorrectiveActionPlansDCS);
		clickWebElement(CorrectiveActionPlansDCS);
		waitForPageLoadTill(10);

	}

	/*
	 * approve from central officer worker
	 * 
	 * 
	 */
	public void approval() throws AcisException {
		logger.info("open corrective action plan DCS");
		clickWebElement(btnApprove);
		waitForPageLoadTill(10);
		clickWebElement(btnFinish);

	}

	/*
	 * check status
	 * 
	 * @khushboo
	 * 
	 */
	public void checkStatus() {
		logger.info("checking status");
		String status = checkStatus.getText();
		logger.info("checking status" + status);
		String startdate = startDate.getText();
		logger.info("Start Date:" + startdate);
		String endDate = EndDate.getText();
		logger.info("Start Date:" + endDate);
	}

	/**
	 * Click on First Record Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickFirstRecord() throws AcisException {
		logger.info("Clicking on first Record from List View");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElementClickable(firstRecord);
		clickWebElement(firstRecord);
		waitForPageLoadTill(10);
		waitForPageLoad();

	}

	/*
	 * verify Edit,Sumit for approval or delete are enable
	 * 
	 * @khushboo
	 * 
	 * @throws AcisException
	 * 
	 */
	public void enableButton() {
		logger.info(" checking buttons availble");
		waitForElement(btnSubmitForApproval);
		waitForElement(btnEdit);
		waitForElement(btnDelete);
		logger.info(" checked buttons availble");


	}
	/*submit to endorse to Central Office
	 * @author khushboo
	 * 
	 *@throws AcisException 
	 * 
	 * 
	 */
	public void endorseToCentralOffice() throws AcisException {
		logger.info("submit to endorse to Central Office");
		clickWebElement(EndorsetoCentralOffice);
		logger.info("submitted to endorse to Central Office");
		
	}
	

}