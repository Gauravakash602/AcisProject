package com.acis.automation.pages.locaterelatives;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.casemanagement.FosterCareCase_Page;
import com.acis.automation.utilities.AcisException;

public class HouseholdMembersPage extends PageBase{

	public HouseholdMembersPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(FosterCareCase_Page.class);

	@FindBy(xpath = "//*[contains(text(),'We have a Placement Account Created With the Same Name')]")
	WebElement placementAccountError;
	
	
	/**
	 * Verify placement Account error
	 * @author mrunal.s.tilekar
	 */
	public void verifyPlacementAccountError() {
		logger.info("Verifying placement Account error");
		waitForElement(placementAccountError);
		logger.info("Verifyed placement Account error");
	}

}
