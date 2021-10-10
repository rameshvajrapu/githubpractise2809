package Academy.E2EPractise;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import resources.base;

public class FPassword extends base{
	public WebDriver driver;
	 
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver Initiated01092021");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
	}
	
	@Test
	public void fpassflow()
	{
		ForgotPassword f=new ForgotPassword(driver);
		 f.fpassword().click();
		 f.email().sendKeys("test3108@gmail.com");
		 f.retrievepass().click();
		 log.info("Forgot Password Flow SuccessFull");
               log.info("Forgot Password Flow SuccessFull latest");

	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
