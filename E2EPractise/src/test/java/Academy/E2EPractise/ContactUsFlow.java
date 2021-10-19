package Academy.E2EPractise;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ContactUs;
import resources.base;

public class ContactUsFlow extends base {
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
	
	
	@Test
	public void contus()
	{
		ContactUs cu=new ContactUs(driver);
		cu.contactuslnk().click();
		cu.subjectHeading().click();
		cu.dropdwnval().click();
		cu.emailaddress().sendKeys("test235@test22.com");
		cu.orderref().sendKeys("1435455");
		cu.msg().sendKeys("message details with reference number #1435455 ");
		cu.sendMessage().click();
		log.info("ContactUs Flow successfull");
	}
	
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
