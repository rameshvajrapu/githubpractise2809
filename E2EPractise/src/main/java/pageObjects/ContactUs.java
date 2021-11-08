package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
	
	public WebDriver driver;
	private By contactuslink=By.cssSelector("#contact-link > a");
	private By subjectheading=By.cssSelector("select[id='id_contact']");
	private By subjectoption=By.cssSelector("#id_contact > option:nth-child(2)");
	private By emailaddress=By.cssSelector("input[id='email']");
	private By orderrefercnce=By.cssSelector("input[id='id_order']");
	private By Message=By.cssSelector("textarea[id='message']");
	private By submit=By.cssSelector("button[id='submitMessage']");
	
	
	public ContactUs(WebDriver driver) {
		this.driver=driver;// TODO Auto-generated constructor stub
	}

	public WebElement contactuslnk()
	{
		return driver.findElement(contactuslink);
		
	}
	
	public WebElement subjecthead()
	{
		return driver.findElement(subjectheading);
	}
	
	public WebElement subjectoptn()
	{
		return driver.findElement(subjectoption);
	}
	public WebElement emailadress()
	{
		return driver.findElement(emailaddress);
	}
	public WebElement orderref()
	{
		return driver.findElement(orderrefercnce);
	}
	
	public WebElement mesage()
	{
		return driver.findElement(Message);
	}
	public WebElement submitmsg()
	{
		return driver.findElement(submit);
	}


}
