package Academy.E2EPractise;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	LoginPage l;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver Initiated");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
	}
	
	@Test(dataProvider="getData")
	public void basepageNavigation(String Email, String Password) throws IOException
	{
		l=new LoginPage(driver);
		l.getEmail().sendKeys(Email);
		l.getPassword().sendKeys(Password);
		l.Submit().click();
		log.info("LoginFlow Successfull");
		
		
		
	}
	
	
	@Test
	public void newsletFlow() 
	{
		l.newslet().sendKeys("test44@test.com");
		l.submitnewsletter().click();
		log.info("Newsletter Successfully Opted");
	}
	
	@Test
	public void searchFlow()
	{
		l.topSearch().sendKeys("Fresh Fruits");
		l.searchButton().click();
		log.info("Search Successfull");
	}
	
	@Test
	public void tShirtFlow()
	{
		l.tShirts().click();
		l.tShirtSize().click();
		l.Sorting().click();
		l.dropDownOption().click();
	}
	
	
	
	@Test
	public void dressesLinks()
	{
		l.dresses1().click();
		l.summerDresses().click();
		log.info("Dresses Links Validated");
	}
	

		
	@Test
	public void socialMediaLinks()
	{
		l.faceBook().click();
		l.twitter().click();
		l.youTube().click();
		l.googlePlus().click();
		log.info("Successfully Clicked Social Media Links");
	}
	
	
	
		
		
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
		
	
	
	//@AfterTest
	//public void closedriver()
	//{
	//	driver.close();
	//}
		
		
		
		@DataProvider
		public Object[][] getData() 
		{
			Object[][] data= new Object[1][2];
			data[0][0]="test22201@test.com";
			data[0][1]="12389588";
			return data;
			
		
		
	}

}
