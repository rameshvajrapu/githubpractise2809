package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	private By Email=By.cssSelector("input[id='email']");
	private By Password=By.cssSelector("input[id='passwd']");
	private By Submit=By.cssSelector("#SubmitLogin > span");
	private By validateText=By.xpath("//*[@id='center_column']/h1");
	private By newsletterfield=By.cssSelector("input[id='newsletter-input']");
	private By newsusbmit= By.cssSelector("button[name='submitNewsletter']");
	private By Search=By.cssSelector("input[id='search_query_top']");
	private By searchButton1=By.cssSelector("button[name='submit_search']");
	private By tShirts1=By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");
	private By longsize=By.cssSelector("div[id='uniform-layered_id_attribute_group_3']");
	private By sort=By.id("selectProductSort");
	private By dropdownoption1=By.cssSelector("#selectProductSort > option:nth-child(2)");
	private By HeaderImage=By.cssSelector("#header > div.banner > div > div > a > img");
	private By FB=By.cssSelector("#social_block > ul > li.facebook > a");
	private By Twtr=By.cssSelector("#social_block > ul > li.twitter > a");
	private By YT=By.cssSelector("#social_block > ul > li.youtube > a");
	private By Google= By.cssSelector("#social_block > ul > li.google-plus > a");
	private By Dresses=By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
	private By sdresses=By.cssSelector("#categories_block_left > div > ul > li.last > a");
	private By forgotPassword=By.cssSelector("#login_form > div > p.lost_password.form-group > a");
	private By fEmail=By.cssSelector("input[id='email']");
	private By forgotSubmit=By.cssSelector("#form_forgotpassword > fieldset > p > button > span");
	private By topSearch=By.cssSelector("input[id='search_query_top']");
	private By btnsearch=By.cssSelector("button[name='submit_search']");
	private By newsletterlatest=By.cssSelector("input[id='newsletter-input']");
	private By submitlatest=By.cssSelector("#newsletter_block_left > div > form > div > button");
	private By cntus=By.cssSelector("#contact-link > a");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getEmail()
	{
		return driver.findElement(Email);
	}
		
		public WebElement getPassword()
		{
			return driver.findElement(Password);
			
		}
		
		public WebElement Submit()
		{
			return driver.findElement(Submit);
		}
		public WebElement validateText()
		{
			return driver.findElement(validateText);
		}
		
		public WebElement newslet()
		{
			return driver.findElement(newsletterfield);
		}
		public WebElement submitnewsletter()
		{
			return driver.findElement(newsusbmit);
		}
		public WebElement topSearch()
		{
			return driver.findElement(Search);
		}
		public WebElement searchButton()
		{
			return driver.findElement(searchButton1);
		}
		
		
		public WebElement tShirts()
		{
			return driver.findElement(tShirts1);
		}
		public WebElement tShirtSize()
		{
			return driver.findElement(longsize);
		}
		public WebElement Sorting()
		{
			return driver.findElement(sort);
		}
		
		public WebElement dropDownOption()
		{
			return driver.findElement(dropdownoption1);
		}
		public WebElement HeaderIMG()
		{
			return driver.findElement(HeaderImage);
		}
		public WebElement faceBook()
		{
			return driver.findElement(FB);
		}
		public WebElement twitter()
		{
			return driver.findElement(Twtr);
		}
		public WebElement youTube()
		{
			return driver.findElement(YT);
		}
		public WebElement googlePlus()
		{
			return driver.findElement(Google);
		}
		public WebElement dresses1()
		{
			return driver.findElement(Dresses);
		}
		public WebElement summerDresses()
		{
			return driver.findElement(sdresses);
		}
		
		public WebElement fPassword()
		{
			return driver.findElement(forgotPassword);
		}
		
		public WebElement forgotEmail()
		{
			return driver.findElement(fEmail);
		}
		public WebElement fSubmit()
		{
			return driver.findElement(forgotSubmit);
		}
		public WebElement tsearch()
		{
			return driver.findElement(topSearch);
		}
		public WebElement buttonSearch()
		{
			return driver.findElement(btnsearch);
		}
		public WebElement newsletterltst()
		{
			return driver.findElement(newsletterlatest);
		}
		
		public WebElement submitltst()
		{
			return driver.findElement(submitlatest);
		}
		public WebElement cntuslnk()
		{
			return driver.findElement(cntus);
		}
	}



