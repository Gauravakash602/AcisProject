package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class FosterParentInquiriesPage extends PageBase {

	public FosterParentInquiriesPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(FosterParentInquiriesPage.class);
	
	
	
	@FindBy(xpath="//*[text()='Foster Parent Inquiries Licensing Worker']")
	WebElement fosterParentInquiries;
	
	@FindBy(xpath="//*[text()='Foster Parent Inquiries Supervisor']")
	WebElement fosterParentInquiriesSupervisor;
	
	@FindBy(xpath="//span[text()='Permanency Tool']")
	WebElement permanencyTool;
	
	@FindBy(xpath="//span[@title='Created Date']")
	WebElement createdDate;
	
	@FindBy(xpath="//span[@title='County']")
	WebElement county;
	
	@FindBy(xpath="//span[@title='City']")
	WebElement city;
	
	@FindBy(xpath="//span[@title='Phone Number']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//span[@title='Applicant B Name']")
	WebElement applicantBName;
	
	@FindBy(xpath="//span[@title='Applicant A  Name']")
	WebElement applicantAName;
	
	@FindBy(xpath="//span[@title='Status']")
	WebElement status;
	
	@FindBy(xpath="//span[@title='Foster Parent Inquiry ID']")
	WebElement fosterParentInquiryID;
	
	@FindBy(xpath = "(//table/tbody/tr/th/span/a)[1]")
	WebElement firstRecord;
	
	@FindBy(xpath = "//*[text()='Licensing worker']/../..//*[text()='ACIS Licensing Worker']")
	WebElement acisLicensingWorker;
	
	@FindBy(xpath = "//button[@name='Edit']")
	WebElement editButton;
	
	@FindBy(xpath = "//*[text()='Licensing worker']/../..//input")
	WebElement licensingWorker;
	
	@FindBy(xpath = "//lightning-base-combobox-formatted-text[@title='ACIS Licensing Worker']")
	WebElement licensingWorkerSelect;
	
	@FindBy(xpath = "//button[@name='SaveEdit']")
	WebElement saveButton;
	
	/**
	 * Select Licensing Worker in Foster Parent Inquiry Page Supervisor
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void selectLicensingWorker() throws AcisException {
		logger.info("Select Licensing Worker in Foster Parent Inquiry");
		waitForElement(editButton);
		clickWebElement(editButton);
		waitForPageLoadTill(5);
		waitForElement(licensingWorker);
		enterText(licensingWorker, "ACIS licensing Worker");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(licensingWorkerSelect);
		clickWebElement(licensingWorkerSelect);
		logger.info("Selected Licensing Worker in Foster Parent Inquiry");
		clickWebElement(saveButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
	}
	
	
	/**
	 * Click on First Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyLicensingWorker() throws AcisException {
		logger.info("Verify Licensing Worker");
		waitForPageLoadTill(5);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(acisLicensingWorker);
		logger.info("Verified Licensing Worker");

	}
	
	/**
	 * Click on First Record
	 * Created By Dharmesh
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
		logger.info("Clicked on first Record from List View");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(10);

	}
	
	/**
	 * check Post Permanency Report  label
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void checkFosterParentInquiryLabel() throws AcisException {
		logger.info("Verifying Foster Parent Inquiries Page label");
		waitForPageLoadTill(5);
		waitForElement(fosterParentInquiryID);
		waitForElement(status);
		waitForElement(applicantAName);
		waitForElement(applicantBName);
		waitForElement(phoneNumber);
		waitForElement(city);
		waitForElement(county);
		waitForElement(createdDate);
		waitForPageLoad();
		logger.info("Verifying Foster Parent Inquiries Page label");
	}
	

	/**
	 * 	Click Post Permanency Report
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void clickFosterParentInquiriesPage() throws AcisException {
		logger.info("Clicking on Foster Parent Inquiries Page");
		waitForPageLoadTill(10);
		waitForPageLoad();
		clickWebElement(permanencyTool);
		waitForPageLoadTill(5);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(fosterParentInquiries);
		clickWebElemntUsingJavascriptExecutor(fosterParentInquiries);
		waitForPageLoadTill(10);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		switchToDefaultContent();
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Foster Parent Inquiries Page");
	}
	

	/**
	 * 	Click on Foster Parent Inquiries Supervisor 
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void clickFosterParentInquiriesSupervisorPage() throws AcisException {
		logger.info("Clicking on Foster Parent Inquiries Page");
		waitForPageLoadTill(10);
		waitForPageLoad();
		clickWebElement(permanencyTool);
		waitForPageLoadTill(5);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForElement(fosterParentInquiriesSupervisor);
		clickWebElemntUsingJavascriptExecutor(fosterParentInquiriesSupervisor);
		waitForPageLoadTill(10);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(10);
		waitForPageLoad();
		switchToDefaultContent();
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on Foster Parent Inquiries Page");
	}
	
	
}
