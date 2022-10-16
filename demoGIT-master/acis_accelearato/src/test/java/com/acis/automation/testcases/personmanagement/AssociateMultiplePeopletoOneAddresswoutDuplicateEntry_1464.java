package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AssociateMultiplePeopletoOneAddresswoutDuplicateEntry_1464 extends TestBase{

	public AssociateMultiplePeopletoOneAddresswoutDuplicateEntry_1464()throws AcisException {
		// TODO Auto-generated constructor stub
		
		super();
	
	}
	final static Logger logger = LoggerFactory.getLogger(AssociateMultiplePeopletoOneAddresswoutDuplicateEntry_1464.class);

	String Firstname = faker.name().firstName();
	String Middlename = faker.name().lastName();
	String Lastname =faker.name().lastName();
	String forestID;
	
	
	
	@Test(description = "US:1464 person Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Varun" }, priority = 0)
	public void AssociateMultiplePeopletoOneAddresswout() throws AcisException, InterruptedException, IOException {
   
		{
			try {
				loginTest.login("Supervisor");
				forestID =loginTest.caseMangementTest.createFosterCareCaseFromFirstRecord();
				loginTest.logout();
				loginTest.login("Supervisor");
				loginTest.caseMangementTest.FosterCareCreatePerson();
				loginTest.logout();
				loginTest.login("Supervisor");
				loginTest.caseMangementTest.FosterCareCreatePersonwithExistingAddress();
				
			} 
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
   
        }
   
	
	}

	
	
}
