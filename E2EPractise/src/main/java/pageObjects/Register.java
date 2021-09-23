package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
	public WebDriver driver;
	
	private By EmailAddress1=By.cssSelector("input[id='email_create']");
	private By createAnAccountButton=By.cssSelector("#SubmitCreate > span");
	private By Gender=By.cssSelector("input[id='id_gender1']");
	private By FirstName=By.cssSelector("input[id='customer_firstname']");
	private By LastName=By.cssSelector("input[id='customer_lastname']");
	private By Password=By.cssSelector("input[id='passwd']");
	private By Days=By.cssSelector("select[id='days']");
	private By Day=By.cssSelector("#days > option:nth-child(21)");
	private By Months=By.cssSelector("select[id='months']");
	private By Month=By.cssSelector("#months > option:nth-child(5)");
	private By Years=By.cssSelector("select[id='years']");
	private By Year=By.cssSelector("#years > option:nth-child(33)");
	private By Newsletter=By.cssSelector("input[id='newsletter']");
	private By Optin=By.cssSelector("input[id='optin']");
	private By FName=By.cssSelector("input[id='firstname']");
	private By LName=By.cssSelector("input[id='lastname']");
	private By Company=By.cssSelector("input[id='company']");
	private By Address1=By.cssSelector("input[id='address1']");
	private By Address2=By.cssSelector("input[id='address2']");
	private By City=By.cssSelector("input[id='city']");
	private By States=By.cssSelector("select[id='id_state']");
	private By State=By.cssSelector("#id_state > option:nth-child(45)");
	private By ZipCode=By.cssSelector("input[id='postcode']");
	private By AdditionalInformation=By.cssSelector("#other");
	private By HomePhone=By.cssSelector("input[id='phone']");
	private By MobilePhone=By.cssSelector("input[id='phone_mobile']");
	private By Alias=By.cssSelector("input[id='alias']");
	private By RegisterButton=By.cssSelector("#submitAccount > span");
	
	
	
	public Register(WebDriver driver) {
		this.driver=driver;// TODO Auto-generated constructor stub
	}

	public WebElement emailAddress()
	{
	return driver.findElement(EmailAddress1);
	}
	
	public WebElement createAccountButton()
	{
	return driver.findElement(createAnAccountButton);
	}
	
	public WebElement gender()
	{
		return driver.findElement(Gender);
	}
	
	public WebElement firstname()
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement lastname()
	{
		return driver.findElement(LastName);
	}

	public WebElement password()
	{
		return driver.findElement(Password);
	}
	public WebElement days()
	{
		return driver.findElement(Days);
		
	}
	public WebElement day()
	{
		return driver.findElement(Day);
		
	}
	public WebElement months()
	{
		return driver.findElement(Months);
		
	}
	public WebElement month()
	{
		return driver.findElement(Month);
		
	}
	public WebElement years()
	{
		return driver.findElement(Years);
		
	}
	public WebElement year()
	{
		return driver.findElement(Year);
		
	}
	public WebElement newsletter()
	{
		return driver.findElement(Newsletter);
		
	}
	public WebElement optin()
	{
		return driver.findElement(Optin);
		
	}
	public WebElement fname()
	{
		return driver.findElement(FName);
		
	}
	public WebElement lname()
	{
		return driver.findElement(LName);
		
	}
	public WebElement company()
	{
		return driver.findElement(Company);
		
	}
	public WebElement address1()
	{
		return driver.findElement(Address1);
		
	}
	public WebElement address2()
	{
		return driver.findElement(Address2);
		
	}
	public WebElement city()
	{
		return driver.findElement(City);
		
	}
	public WebElement states()
	{
		return driver.findElement(States);
		
	}
	public WebElement state()
	{
		return driver.findElement(State);
		
	}
	public WebElement zipcode()
	{
		return driver.findElement(ZipCode);
		
	}
	public WebElement additionalinformation()
	{
		return driver.findElement(AdditionalInformation);
		
	}
	public WebElement homephone()
	{
		return driver.findElement(HomePhone);
		
	}
	public WebElement mobilephone()
	{
		return driver.findElement(MobilePhone);
		
	}
	public WebElement alias()
	{
		return driver.findElement(Alias);
		
	}
	public WebElement registerbutton()
	{
		return driver.findElement(RegisterButton);
	}

}
