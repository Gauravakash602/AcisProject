package com.acis.automation.pages.Placement;

import static org.testng.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PlacementPersonAccountPage extends PageBase{

	public PlacementPersonAccountPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PlacementPersonAccountPage.class);

	@FindBy(xpath = "//*[text()='Placement Type']/..//lightning-formatted-text")
	WebElement placementTypeValue;
	
	@FindBy(xpath = "(//a[text()='Details'])[2]")
	WebElement caseDetailsTab;
	
	@FindBy(xpath="(//*[text()='Photo of Family']//../..//div)[2]")
	WebElement textPhotoOfFamily;
	
	@FindBy(xpath="(//*[text()='SSN']//../..//div)[last()]")
	WebElement textSSN;
	
	@FindBy(xpath="(//*[text()='FEIN']//../..//div)[last()]")
	WebElement textFEIN;
	
	@FindBy(xpath="(//*[text()='Initial License Start Date']//../..//div)[last()]")
	WebElement initialLicenseStartDate;
	
	@FindBy(xpath="(//*[text()='Annual Review Date']//../..//div)[last()]")
	WebElement annualReviewDate;
	
	@FindBy(xpath="(//*[text()='License End Date']//../..//div)[last()]")
	WebElement licenceEnddate;
	
	@FindBy(xpath="(//*[text()='Placement Resource Type']//../..//div)[last()]")
	WebElement textPlacementResourceType;
	
	@FindBy(xpath="(//*[text()='Placement Resource Subtype']//../..//div)[last()]")
	WebElement textPlacementResourceSubtype;
	
	@FindBy(xpath="(//*[text()='Relicense Date']//../..//div)[last()]")
	WebElement textRelicenceDate;
	
	
	
	
	
	/**
	 * check Placement type value
	 * @author mrunal.s.tilekar
	 */
	public void checkPlacementTypeValue(String value) {
		logger.info("checking Placement type value: " + value);
		waitForPageLoadTill(5);
		
		switch (value) {
		case "Kinship":
			Assert.assertTrue(((placementTypeValue.getText().contains(value))), "Placement Value does not match " + "Actual Value: " + value 
					+"Expected Value: " + placementTypeValue.getText());
			logger.info("checked Placement type value: " + value);
			break;

		default:
			break;
		}
	}
	
	/**
	 * Click on Details Tab of Placement account
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickDetailsTabOfPlacementAccount() throws AcisException {
		logger.info("Clicking Investigation Case Details Tab");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(caseDetailsTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Investigation Case Details Tab");
	}
	
	
	/**
	 * Verify Parent 1 value
	 * @author mrunal.s.tilekar
	 */
	public void verifyParent1Value(String parentName) {
		logger.info("Verifying parent 1 value : " + parentName);
		waitForPageLoadTill(5);
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='Parent 1']/../..//*[text()='"+ parentName +"']")).isDisplayed()), "Parent 1 value does not match");
		logger.info("Verifyed parent 1 value : " + parentName);
	}
	
	/**
	 * Verify Address
	 * @author mrunal.s.tilekar
	 */
	public void verifyAddress(String address) {
		logger.info("Verifying address " + address);
		waitForPageLoadTill(5);
		Assert.assertTrue((driver.findElement(By.xpath("//div[contains(text(),'"+ address+"')]")).isDisplayed()), "Parent 1 value does not match");
		logger.info("Verifyed address : " + address);
	}
	/*validate Details tab fiels
	 * @author khushboo
	 * 
	 */
	public void verifyFields() {
		logger.info("Verifying Fields ");
		waitForPageLoad();
		Assert.assertTrue(textPhotoOfFamily.isDisplayed(),"Photos of family");
		Assert.assertTrue(textSSN.isDisplayed(),"SSN is displayed");
		Assert.assertTrue(textFEIN.isDisplayed(),"FEIN  is displayed");
		Assert.assertTrue(initialLicenseStartDate.isDisplayed(),"licence date is displayed");
		Assert.assertTrue(annualReviewDate.isDisplayed(),"annual review date is displayed");
		Assert.assertTrue(licenceEnddate.isDisplayed(),"Licence end date is displayed");
		Assert.assertTrue(textPlacementResourceType.isDisplayed(),"Placement Resource Type is displayed");
		Assert.assertTrue(textPlacementResourceSubtype.isDisplayed(),"Placement Resource subType is displayed");

		
	}
	/*verify difference of date
	 * 
	 *@author khushboo 
	 * 
	 */
	public void diffDateAnnualReviewDate() throws ParseException {
		// Custom date format
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);


		String duedate = annualReviewDate.getText();
		String opened = initialLicenseStartDate.getText();
		 Date d1 = null;
		 Date d2 = null;
		
			d1 = sdf.parse(duedate);
			d2= sdf.parse(opened);

		
	    long diffInMillies = Math.abs(d1.getTime() - d2.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    logger.info("The date difference is "+diff);
	
	}
	/*verify difference of date Relicence date
	 * 
	 *@author khushboo 
	 * 
	 */
	public void diffDateRelicence() throws ParseException {
		// Custom date format
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);


		String duedate = textRelicenceDate.getText();
		String opened = initialLicenseStartDate.getText();
		 Date d1 = null;
		 Date d2 = null;
		
			d1 = sdf.parse(duedate);
			d2= sdf.parse(opened);

		
	    long diffInMillies = Math.abs(d1.getTime() - d2.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	    logger.info("The date difference is "+diff);
	 

	}

	}

