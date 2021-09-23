package pageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
	public WebDriver driver;

	private By ContactUsLink=By.cssSelector("#contact-link > a");
	private By SubjectHeading=By.cssSelector("#id_contact");
	private By DropDown=By.cssSelector("#id_contact > option:nth-child(2)");
	private By Email=By.cssSelector("input[id='email']");
	private By OrderReference=By.cssSelector("input[id='id_order']");
	private By Message= By.cssSelector("#message");
	private By SendMessage= By.cssSelector("button[id='submitMessage']");
	
	
	
	
	
	public ContactUs(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement contactuslnk()
	{
	return driver.findElement(ContactUsLink);
	}
	
	public WebElement subjectHeading()
	{
	return driver.findElement(SubjectHeading);
	}
	
	public WebElement dropdwnval()
	{
	return driver.findElement(DropDown);
	}
	
	public WebElement emailaddress()
	{
		return driver.findElement(Email);
	}
	
	public WebElement orderref()
	{
		return driver.findElement(OrderReference);
	}
	
	public WebElement msg()
	{
		return driver.findElement(Message);
	}
	public WebElement sendMessage()
	{
		return driver.findElement(SendMessage);
	}
	

}
