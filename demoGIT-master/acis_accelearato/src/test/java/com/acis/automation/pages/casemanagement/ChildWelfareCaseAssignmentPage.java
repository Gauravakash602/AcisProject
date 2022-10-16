package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ChildWelfareCaseAssignmentPage extends PageBase {

	public ChildWelfareCaseAssignmentPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ChildWelfareCaseAssignmentPage.class);

	@FindBy(xpath = "//*[text()='Related']")
	WebElement relatedTab;
	
	@FindBy(xpath = "//*[text()='Round Robin Assignees']")
	WebElement roundRobinAssigneesTab;
	
	@FindBy(xpath = "//*[text()='ACIS Investigator']/../../..//*[contains(text(),'RR-000')]")
	WebElement acisInvestigatorAssignee;
	
	@FindBy(xpath = "//*[contains(text(),'Edit R')]/../..//button[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath = "//*[contains(text(),'Edit RR')]/../..//input[@name='ACIS_Is_Active__c']")
	WebElement activeCheckBox;
	
	@FindBy(xpath = "//*[text()='Round Robin Assignee']/../../../..//button[text()='Edit']")
	WebElement editButton;
	
	@FindBy(xpath = "//*[text()='Current Caseload']/../../../..//input")
	WebElement currentCaseLoadText;
	
	@FindBy(xpath = "//*[text()='Current Caseload']/../..//lightning-formatted-number")
	WebElement currentCaseLoad;
	
	public By InvestigatorActiveCheck = By.xpath("//*[text()='ACIS Investigator']/../../..//img[@alt='True']");
	
	

	/**
	 * Click Active current case load
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public Boolean checkActiveInvestigator() throws AcisException {
		waitForElement(acisInvestigatorAssignee);
		if (isElementPresent(InvestigatorActiveCheck)) {
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	/**
	 * Click Active current case load
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void checkCurrentCaseVerify(int check) throws AcisException {
		waitForElement(driver.findElement(By.xpath("//*[text()='Current Caseload']/../..//lightning-formatted-number[contains(text(),'"+check+"')]")));
	}
	
	/**
	 * Click Active current case load
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public String getCurrentCaseLoad() throws AcisException {
		logger.info("Current Case Load is "+currentCaseLoad.getText().trim());
		return(currentCaseLoad.getText().trim());
	}
	
	/**
	 * Click Active CheckBox
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void checkActive(Boolean check) throws AcisException {
		logger.info("Clicking on Active CheckBOX");
		if (check==false) {
			waitForElement(activeCheckBox);
			clickWebElement(activeCheckBox);
			waitForPageLoadTill(5);
			waitForPageLoad();
		}
		logger.info("Clicked on Active CheckBOX");
	}
	
	
	/**
	 * Click Save Button
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking on Save Button");
		waitForElement(saveButton);
		clickWebElement(saveButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Save Button");
		
	}
	
	/**
	 * Click Edit Button
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void clickEditButton() throws AcisException {
		logger.info("Clicking on Edit Button");
		waitForElement(editButton);
		clickWebElement(editButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Edit Button");
		
	}
	
	/**
	 * Enter Edit Current CaseLoad
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void enterCurrentCaseLoad() throws AcisException {
		logger.info("Clicking on Edit Button");
		waitForElement(currentCaseLoadText);
		enterText(currentCaseLoadText, "2");
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Edit Button");
		
	}
	
	/**
	 * Click on Investigator Assignee Record
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void clickAcisInvestigatorAssignee() throws AcisException {
		logger.info("Clicking on Investigator Assignee ID");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(acisInvestigatorAssignee);
		clickWebElement(acisInvestigatorAssignee);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Investigator Assignee ID");
		
	}
	
	/**
	 * Click RelatedTab
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(relatedTab);
		clickWebElement(relatedTab);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Related Tab");
		
	}
	
	/**
	 * Click on Round Robin Assignees Tab
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void clickRoundRobinAssigneesTab() throws AcisException {
		logger.info("Clicking on Round Robin Assignees Tab");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(roundRobinAssigneesTab);
		clickWebElement(roundRobinAssigneesTab);
		waitForPageLoadTill(5);
		waitForPageLoad();
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Round Robin Assignees Tab");
		
	}
	

}