package com.acis.automation.pages.interaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CollateralTypeInteractionPage extends PageBase {

	public CollateralTypeInteractionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CollateralTypeInteractionPage.class);
	
	//Mrunal
	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;
	
	@FindBy(xpath = "//input[@id='DateTime2']")
	WebElement interviewDateTime;
	
	@FindBy(xpath = "//span[text()='15']")
	WebElement date;
	
	@FindBy(xpath = "//select[@id='Location2']")
	WebElement location;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Foster Home']")
	WebElement locationFosterHome;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Biological Home']")
	WebElement locationBiologicalHome;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='DCS Office']")
	WebElement locationDcsOffice;
	
	@FindBy(xpath = "//select[@id='Location2']//option[text()='Service Provider']")
	WebElement locationServiceProvider;
	
	@FindBy(xpath = "//select[@id='Method2']")
	WebElement method;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Teleconference']")
	WebElement methodPhone;
	
	@FindBy(xpath = "//select[@id='Method2']//option[text()='Video Conference']")
	WebElement methodVideoConference;
	
	@FindBy(xpath = "//select[@id='SubtypeMerge']")
	WebElement subtype;
	
	@FindBy(xpath = "//select[@id='SubtypeMerge']//*[text()='Medical']")
	WebElement subtypeMedical;
	
	@FindBy(xpath = "//select[@id='ContactType2']")
	WebElement type;

	@FindBy(xpath = "//select[@id='ContactType2']//option[contains(text(),'Collateral')]")
	WebElement typeCollateral;
	
	@FindBy(xpath = "//div[@id='Interviews_nextBtn']")
	WebElement saveButtonInterview;
	
	@FindBy(xpath = "//button[@title='Close New Interaction']")
	WebElement closeNewInteractionButton;
	
	@FindBy(xpath = "//*[contains(text(),'details are saved. Close ')]")
	WebElement closeInteractionMessage;
	
	@FindBy(xpath = "//textarea[@id='Narrative2']")
	WebElement narrative;
	
	@FindBy(xpath = "//textarea[@id='ProfessionalOpinion2']")
	WebElement professionalOpinion;
	
	@FindBy(xpath = "//input[@id='CollateralName']")
	WebElement collateralName;

	@FindBy(xpath = "//input[@id='CollateralPhone/Email']")
	WebElement collaterealPhoneEmail;
	
	@FindBy(xpath = "(//*[text()='Collateral'])[last()]")
	WebElement newTnteractionType;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "(//*[text()='Successful']/..//span)[1]")
	WebElement radioSuccessful;

	@FindBy(xpath = "(//*[text()='Unsuccessful']/..//span)[1]")
	WebElement radioUnsuccessful;
	
	/**
	 * Owner : Mrunal
	 * Description: Switch iFrame
	 * @throws AcisException 
	 */
	public void iframeSwitch() throws AcisException {
		logger.info("Switching to iframe");			
		switchToFrameByWebElement(iframe);
		logger.info("Switching to iframe");	
	}

	
	
	
	
	/**
	 * Select Date on New Collateral
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void selectDate() throws AcisException {
		logger.info(" Selecting start date");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElementClickable(interviewDateTime);
		clickWebElemntUsingJavascriptExecutor(interviewDateTime);
		clickWebElement(date);
		logger.info("Enter Date");	
		logger.info(" Selected start date");

	}
	
	/**
	 * Select Subtype Picklist on New Collateral 
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void setSubtype(String option) throws AcisException {
		logger.info("Selecting Text:"+option);
		switch (option) {
		case "medical":
			clickWebElement(subtype);
			clickWebElement(subtypeMedical);
			logger.info("Selected Text:"+option);
			break;
		default:
			break;
		}

	}
	
	/**
	 * Set Text on New Collateral
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void setText(String option,String strText) throws AcisException {
		logger.info("Entering Text:"+option);
		switch (option) {
		case "CollateralName":
			enterText(collateralName, strText);
			logger.info("Entered Text:"+option);
			break;
		case "Narrative":
			enterText(narrative, strText);
			logger.info("Entered Text:"+option);
			break;
		case "ProfessionalOpinion":
			enterText(professionalOpinion, strText);
			logger.info("Entered Text:"+option);
			break;
		default:
			break;
		}

	}
	public void selectRadioButton() throws AcisException {
		logger.info("Selecting New Interactions Radio Button");
		waitForElement(newTnteractionType);
		clickWebElement(newTnteractionType);
		clickWebElement(nextButton);
		logger.info("Selected New Interactions Radio Button");
	}
	/**
	 * Click on Save
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void clickSave() throws AcisException {
		Actions act = new Actions(driver);
        act.sendKeys(Keys.END).build().perform();
        waitForPageLoadTill(5);
        act.moveToElement(saveButtonInterview).click().perform();
			waitForPageLoadTill(5);
			waitForPageLoad();
			logger.info("clicked on Save button");
	}
	
	
	/**
	 * Select type
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void prvoideType(String typeOption) throws AcisException {
		waitForPageLoad();
		
		switch (typeOption) {
		case "Collateral":
			clickWebElement(type);
			clickWebElement(typeCollateral);
			waitForPageLoadTill(2);
			logger.info("Selected type Visit");
			break;
			
		default:
			logger.info("Error : No Matching Selected Type Value");
			break;
		}
		
	}
	
	/**
	 * Select location
	 * @throws AcisException 
	 */
	public void prvoideLocation(String locationOption) throws AcisException {
		
		switch (locationOption) {
		case "Foster Home":
			clickWebElement(location);
			clickWebElement(locationFosterHome);
			waitForPageLoadTill(2);
			logger.info("Selected location Foster Home");	
			break;
			
		case "Biological Home":
			clickWebElement(location);
			clickWebElement(locationBiologicalHome);
			waitForPageLoadTill(2);
			logger.info("Selected location Biological Home");	
			break;
			
		case "DCS Office":
			clickWebElement(location);
			clickWebElement(locationDcsOffice);
			waitForPageLoadTill(2);
			logger.info("Selected location DCS office");	
			break;
			
		case "Service Provider":
			clickWebElement(location);
			clickWebElement(locationServiceProvider);
			waitForPageLoadTill(2);
			logger.info("Selected location Service Provider");	
			break;

		default:
			logger.info("No matching location value");	
			break;
		}
		
		
	}
	
	/**
	 * Select method
	 * @throws AcisException 
	 */
	public void prvoideMethod(String methodOption) throws AcisException {
		
		switch (methodOption) {
		case "Phone":
			clickWebElement(method);
			clickWebElement(methodPhone);
			waitForPageLoadTill(2);
			logger.info("Selected methhod Phone");
			break;
			
		case "VideoConference":
			clickWebElement(method);
			clickWebElement(methodVideoConference);
			waitForPageLoadTill(2);
			logger.info("Selected methhod FaceToFace");
			break;

		default:
			logger.info("No matching method option");
			break;
		}
		

	}
	
	
	/**
	 * Close New Interaction
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeNewInteraction() throws AcisException {
		logger.info("Closing New Interaction");
		waitForElement(closeInteractionMessage);
		switchToDefaultContent();
		clickWebElemntUsingJavascriptExecutor(closeNewInteractionButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Closed New Interaction");
	}
	
	/*
	 * select attempts
	 * 
	 * @khushboo
	 * 
	 */
	public void selectAttempts(String option) throws AcisException {
		logger.info("selecting attempts");
		switch (option) {
		case "Successfull":
			clickWebElement(radioSuccessful);
			break;
		case "UnSuccessful":
			clickWebElement(radioUnsuccessful);
			break;
		default:
			logger.info("incorrect attempts");

		}
	}
	
	/**
	 * Verify Attempts options present
	 * @author mrunal.s.tilekar
	 */
	public void verifyAttemptsOption() {
		logger.info("Verifying Attempts options present");
		waitForElement(radioSuccessful);
		waitForElement(radioUnsuccessful);
		logger.info("Verified Attempts options present");
	}
}
