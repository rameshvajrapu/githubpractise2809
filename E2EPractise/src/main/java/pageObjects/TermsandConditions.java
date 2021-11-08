package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TermsandConditions {
	public WebDriver driver;
	
	private By termslink=By.linkText("Terms and conditions of use");
	private By Rule3text=By.cssSelector("#center_column > div > p:nth-child(7)");
	
	public TermsandConditions(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement termsandconditions()
	{
		return driver.findElement(termslink);
	}

	public WebElement rules3txt()
	{
		return driver.findElement(Rule3text);
	}

}
