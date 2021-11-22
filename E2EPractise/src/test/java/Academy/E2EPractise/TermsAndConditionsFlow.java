package Academy.E2EPractise;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TermsandConditions;
import resources.base;

public class TermsAndConditionsFlow extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	
	
	@BeforeTest
	public void getURL() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver Initiated");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage Successfully");
	}
	
	@Test
	public void termscondtionsflw()
	{
		TermsandConditions tc=new TermsandConditions(driver);
		tc.termsandconditions().click();
		System.out.println(tc.rules3txt().getText());
		log.info("Terms And Conditions Flow Successfully on 22112021");
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
