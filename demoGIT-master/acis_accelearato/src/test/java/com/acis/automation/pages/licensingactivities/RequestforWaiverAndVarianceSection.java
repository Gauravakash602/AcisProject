package com.acis.automation.pages.licensingactivities;
import java.awt.AWTException;

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

public class RequestforWaiverAndVarianceSection extends PageBase {

	public RequestforWaiverAndVarianceSection() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Logger logger = LoggerFactory.getLogger(RequestforWaiverAndVarianceSection.class);
	
	@FindBy(xpath = "//*[@title='Edit Request Waiver?']")
	WebElement RequestWaiveredit;
	
	@FindBy(xpath = "//*[@title='Edit Request Variance?']")
	WebElement RequestVarianceedit;
	
	@FindBy(xpath = "//*[@title='Edit Waiver Request Comments']")
	WebElement Waivercomments;
	
	@FindBy(xpath = "//*[@title='Edit Variance Request Comments']")
	WebElement Variancecomments;
	
	@FindBy(xpath = "//*[text()='Request Waiver?']/../../..//*[text()='Yes']")
	WebElement RequestWaiverYes;
	
	@FindBy(xpath = "//*[text()='Request Variance?']/../../..//*[text()='Yes']")
	WebElement RequestVarianceYes;
	
	@FindBy(xpath = "//*[text()='Request Waiver?']/..//*[@autocomplete='off']")
	WebElement RequestWaivereditDrop;
	
	@FindBy(xpath = "//*[text()='Request Variance?']/..//*[@autocomplete='off']")
	WebElement RequestVarianceditDrop;
	
	@FindBy(xpath = "//*[text()='Waiver Request Comments']/../div/textarea")
	WebElement Waivercommentstextarea;
	
	@FindBy(xpath = "//*[text()='Variance Request Comments']/../div/textarea")
	WebElement variancecommentstextarea;
	
	@FindBy(xpath = "//*[@title='Edit Variance Request Comments']")
	WebElement variancecommentstextareaedit;
	
	@FindBy(xpath = "//*[@title='Edit Waiver Request Comments']")
	WebElement waiverecommentstextareaedit;
	
	Actions act = new Actions(driver);
	
	public void RequestforWaiverSection() throws AcisException {
		logger.info("Entering Request Waiver Section");
		waitForPageLoad();
		waitForPageLoadTill(9);
		scrollingToElementofAPage(RequestWaiveredit);
		clickWebElemntUsingJavascriptExecutor(RequestWaiveredit);
			waitForPageLoadTill(5);
			//scrollingToElementofAPage(RequestWaivereditDrop);
			clickWebElemntUsingJavascriptExecutor(RequestWaivereditDrop);
			waitForPageLoadTill(5);			
				clickWebElement(RequestWaiverYes);
				waitForPageLoadTill(5);
				logger.info("Selected  value yes for Request Waiver");
			
			//	scrollingToElementofAPage(Waivercommentstextarea);
			//	clickWebElemntUsingJavascriptExecutor(waiverecommentstextareaedit);
				waitForElement(Waivercommentstextarea);
				enterText(Waivercommentstextarea, "Demo");
				logger.info("waiver comment field updated successfully.");
	}
	
	public void RequestforVarianceSection() throws AcisException {		
			//	scrollingToElementofAPage(RequestVarianceedit);
					clickWebElemntUsingJavascriptExecutor(RequestVarianceedit);
					waitForPageLoadTill(5);
				//	scrollingToElementofAPage(RequestVarianceditDrop);
					clickWebElemntUsingJavascriptExecutor(RequestVarianceditDrop);
					waitForPageLoadTill(5);			
						clickWebElement(RequestVarianceYes);
						waitForPageLoadTill(5);
						logger.info("Selected  value yes for Request Variance");
						
					/*	scrollingToElementofAPage(variancecommentstextarea);
					//	clickWebElemntUsingJavascriptExecutor(variancecommentstextareaedit);
						waitForElement(variancecommentstextarea);
						enterText(variancecommentstextarea, "Demo");
						logger.info("variance comment updated"); */
						
			
				
		
	
		
	}

}
