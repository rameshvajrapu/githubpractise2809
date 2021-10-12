package Academy.E2EPractise;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Register;
import resources.base;

public class Registration extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void getURL() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver Initiated");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
	}
	
	@Test(dataProvider="getData1")
	
	public void registrationFlow(String Email, String FirstName, String LastName,String Password,String FirstName1, 
			String LastName1, String Company, String Address1, String Address2, String City, String ZipCode, String AdditionalInformation,String HomePhone, String Mobile, String Alias )
	{
		Register r=new Register(driver);
		r.emailAddress().sendKeys(Email);
		r.createAccountButton().click();
		r.gender().click();
		r.firstname().sendKeys(FirstName);
		r.lastname().sendKeys(LastName);
		r.password().sendKeys(Password);
		r.days().click();
		r.day().click();
		r.months().click();
		r.month().click();
		r.years().click();
		r.year().click();
		r.newsletter().click();
		r.optin().click();
		r.fname().sendKeys(FirstName1);
		r.lname().sendKeys(LastName1);
		r.company().sendKeys(Company);
		r.address1().sendKeys(Address1);
		r.address2().sendKeys(Address2);
		r.city().sendKeys(City);
		r.states().click();
		r.state().click();
		r.zipcode().sendKeys(ZipCode);
		r.additionalinformation().sendKeys(AdditionalInformation);
		r.homephone().sendKeys(HomePhone);
		r.mobilephone().sendKeys(Mobile);
		r.alias().sendKeys(Alias);
		r.registerbutton().click();
		log.info("Registration Flow SuccessFull12102021");
		
		
		
		
		}
	
	@DataProvider
	public Object[][] getData1() 
	{
		Object[][] data= new Object[1][15];
		data[0][0]="test2009second@gmail.com";
		data[0][1]="Jon";
		data[0][2]="Snow";
		data[0][3]="123453";
		data[0][4]="Jon";
		data[0][5]="Snow";
		data[0][6]="GOT Team";
		data[0][7]="US";
		data[0][8]="GOT Team";
		data[0][9]="NH";
		data[0][10]="58956";
		data[0][11]="GOT Lead Role";
		data[0][12]="123456789";
		data[0][13]="9885098850";
		data[0][14]="Jon Snow";
		return data;
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
