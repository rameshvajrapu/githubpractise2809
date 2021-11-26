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
<<<<<<< HEAD
		cu.emailaddress().sendKeys("test123@test123.com");
		cu.orderref().sendKeys("1432434");
		cu.msg().sendKeys("message details with reference number #1432434");
		cu.sendMessage().click();
		log.info("ContactUs Flow SuccessFull");

=======
		cu.emailaddress().sendKeys("test22@test22.com");
		cu.orderref().sendKeys("1435455");
		cu.msg().sendKeys("message details with reference number #1435455 ");
		cu.sendMessage().click();
		log.info("ContactUs Flow successFull");
>>>>>>> dev
	}
	
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
