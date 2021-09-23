package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ForgotPassword {
	public WebDriver driver;
	private By ForgotPassword=By.xpath("//*[@id=\"login_form\"]/div/p[1]/a");
	private By Email=By.cssSelector("input[id='email']");
	private By RetrivePassword=By.cssSelector("#form_forgotpassword > fieldset > p > button > span");
	
		
	
	
	
	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement fpassword()
	{
		return driver.findElement(ForgotPassword);
	}
	
	public WebElement email()
	{
		return driver.findElement(Email);
	}
	public WebElement retrievepass()
	{
		return driver.findElement(RetrivePassword);
	}

}
