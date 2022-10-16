package com.acis.automation.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * /** This class is for defining objects of Login page and defining methods on
 * those objects.
 *
 */

public class UserLoginPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(UserLoginPage.class);

	public UserLoginPage() throws AcisException {
	}

	@FindBy(xpath = "//*[@id='username']")

	WebElement textBoxUserName;

	public By textBoxUserNameLocator = By.xpath("//*[@id='username']");

	public By labelOrgNameLocator = By.xpath("//*[@class='text-lg text-lg-orgname']");

	@FindBy(id = "password")

	WebElement textBoxPassword;

	@FindBy(xpath = "//input[@id='Login']")

	WebElement buttonLogin;

	@FindBy(xpath = "//*[text()='Logout']")
	WebElement ButtonLogout;

	By TextBoxUserNameLocator = By.xpath("//*[@id='txtUsername']");
	By phoneRegisterVerify = By.xpath("//a[text()=\"I Don't Want to Register My Phone\"]");

	@FindBy(xpath = "//a[text()=\"I Don't Want to Register My Phone\"]")
	WebElement phoneRegister;

	public static By homeVerify = By.xpath("//*[@title='BlazeDemo']");
	
	@FindBy(xpath = "//*[@title='BlazeDemo']")
	WebElement TextAppName;
	
	/**
	 * Reusable method is used login to application for flightBooking
	 * 
	 * @param strUserName
	 * @param strPassword
	 * @throws AcisException
	 * @throws InterruptedException
	 * 
	 */
	public void loginUserToApplication(String strUserName, String strPassword) throws AcisException, InterruptedException {
		try {
			waitForPageLoad();
			
			clickLoginBtn();
			Thread.sleep(10000);
			waitForPageLoad();
			if(isElementPresent(homeVerify))
			{
				Thread.sleep(10000);
				waitForPageLoad();
				String name = TextAppName.getText().trim();
				Assert.assertEquals(name, "BlazeDemo", "Failed to verify Home Page ");
			}
			else
			{
				Thread.sleep(10000);
				waitForPageLoad();
				refreshPage();
				Thread.sleep(10000);
				waitForPageLoad();
				String name = TextAppName.getText().trim();
				Assert.assertEquals(name, "ACIS", "Failed to verify Home Page ");
			}

		} catch (Exception e) {
			waitForPageLoad();
			enterUserName(strUserName);
			enterPassword(strPassword);
			clickLoginBtn();
			Thread.sleep(10000);
			waitForPageLoad();
			if(isElementPresent(homeVerify))
			{
				Thread.sleep(10000);
				waitForPageLoad();
				String name = TextAppName.getText().trim();
				Assert.assertEquals(name, "ACIS", "Failed to verify Home Page ");
			}
			else
			{
				Thread.sleep(10000);
				waitForPageLoad();
				refreshPage();
				Thread.sleep(10000);
				waitForPageLoad();
				String name = TextAppName.getText().trim();
				Assert.assertEquals(name, "ACIS", "Failed to verify Home Page ");
			}

		}

	}

	/**
	 * 
	 * @param strUserName
	 * @throws AcisException
	 */

	public void enterUserName(String strUserName) throws AcisException {
		waitForElement(textBoxUserName);
		enterText(textBoxUserName, strUserName);
		logger.info("Entered UserName as: " + strUserName);
		testLoggerInfo("Entered UserName as: " + strUserName);
	}

	/**
	 * 
	 * @param strPassword
	 * @throws AcisException
	 */
	public void enterPassword(String strPassword) throws AcisException {
		enterText(textBoxPassword, strPassword);
		logger.info("Entered Password ");

		testLoggerInfo("Entered Password ");

	}

	/**
	 * This method is used to click on Login button
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 */

	public void clickLoginBtn() throws AcisException {
		clickWebElement(buttonLogin);
		logger.info("Clicked on Login button");

		testLoggerInfo("Clicked on Login button");

	}

	/**
	 * This method is used to check whether User name check box is preset or not
	 * 
	 * @return
	 * @throws AcisException
	 */
	public boolean isUserNameTextBoxPresent() throws AcisException {
		if (isElementPresent(textBoxUserNameLocator)) {
			logger.info("UserName TextBox is Present");

			testLoggerInfo("UserName TextBox is Present");

			return true;
		} else {
			logger.info("UserName TextBox is not Present");

			testLoggerInfo("UserName TextBox is not Present");
			return false;
		}
	}

	
	
	
	
	
	
	/**
	 * Reusable method is used login to application for all other test scripts
	 * 
	 * @param strUserName
	 * @param strPassword

	 * @throws InterruptedException
	 * @throws FileNotFoundException 
	 * 
	 */
	public void loginUserToFlightApplication() throws AcisException, InterruptedException, FileNotFoundException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Properties	prop= new Properties();             //D:\New folder\FreeCrmProject\src\main\java\com\crm\qa\config\config.properties
		
		FileInputStream ip= new FileInputStream("E:\\workspace\\FreeCrmProject\\src\\main\\java\\com\\crm\\qa\\config\\config.properties"); 
		
			waitForPageLoad();
			Thread.sleep(10000);
			waitForPageLoad();
			if(isElementPresent(homeVerify))
			{
				Thread.sleep(10000);
				waitForPageLoad();
				String name = TextAppName.getText().trim();
				Assert.assertEquals(name, "ACIS", "Failed to verify Home Page ");
			}
	}}
	

	
	
