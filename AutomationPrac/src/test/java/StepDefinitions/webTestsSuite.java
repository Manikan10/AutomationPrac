package StepDefinitions;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Reusables.CartPage;
import Reusables.HomeReuse;
import Reusables.LoginReuse;
import Reusables.SearchPage;
import Reusables.Utility;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class webTestsSuite {
	
	public static WebDriver driver;
	public static LoginReuse loginReuse;
	public static HomeReuse homeReuse;
	public static SearchPage searchPage;
	public static CartPage cartPage;
	public static Utility utility;
	public static String Url = "http://automationpractice.com/";
	
	//@Before	public void setup(String browser)
	@Before	public void setup()
	{
		//utility.browser(browser);
		
		System.setProperty("webdriver.chrome.driver","driver\\chrome\\chromedriver.exe");
        driver=new ChromeDriver(); 		
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	@Given("^Load the Website$")
	public void load_the_website () throws Throwable
	{
		try
		{
		homeReuse = new HomeReuse(driver);
		homeReuse.launchHome();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			driver.quit();
		}
	}
	
	@And("^Goto SignIn page$")
	public void goto_signin_page () throws Throwable
	{
		try
		{
		//homeReuse.clickSignin();
		//loginReuse = new LoginReuse(driver);
		loginReuse = homeReuse.clickSignin();
		loginReuse.launchLogin();
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			driver.quit();
		}
	}
	
	
	@When("^Enter the \"(.*)\" and \"(.*)\"$")
	public void enter_the_email_and_password (String email,String password) throws Throwable
	{
		try
		{
			loginReuse.enterEmail(email);
			loginReuse.enterPassword(password);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			driver.quit();
		}
	}
	
	@And("^Click on SignIn button$")
	public void click_on_signin_button () throws Throwable
	{
		try
		{
			loginReuse.clickLogin();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			driver.quit();
		}
	}
	
	@Then("^Ensure the \"(.*)\" error message is displayed$")
	public void ensure_the_expMessage_error_message_is_displayed (String expMessage) throws Throwable
	{
		try
		{
		loginReuse.validationMessage();
		assertEquals("Test Case Failed. Expected validation message is not shown.",expMessage, loginReuse.validationMsg );	
		System.out.println("Test Case Passed. Expected validation message is shown - " + loginReuse.validationMsg);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			driver.quit();
		}
	}
	
	@When("^Search for an \"(.*)\"$")
	public void search_for_an_item (String item) throws Throwable
	{
		homeReuse.searchItem(item);
		
	}
	
	@Then("^Results are displayed for an \"(.*)\"$")
	public void results_are_displayed_for_an_item (String item) throws Throwable
	{
		searchPage = new SearchPage(driver);
		
		searchPage.noResults();
		
		if(driver.findElements(By.xpath("//span[@class = 'lighter']")).size() != 0)
		{		
		searchPage.searchPageText();		
			if (searchPage.sText.contains(item) && searchPage.resultContainer.isDisplayed())
				System.out.println("Test is Passed." + item + "is available");
			else
			{
				System.out.println("Test is Failed. Error on the page");
			}
		}
		
		else
		{
			
			if(searchPage.noResultwarning.contains(item) && searchPage.noResultwarning.contains(searchPage.noItems))			
			{	
				System.out.println("Test is Passed. " + item +" is unavailable");
			}
			else if (searchPage.noResultwarning.contains(item) && searchPage.noResultwarning.contains(searchPage.blankItem))
			{
				System.out.println("Test is Passed. Enter any item to search");
			}
			else
			{
				System.out.println("Test is Failed. Error on Page");
			}
		}
			
	}


	@And("^Go to Cart$")
	public void go_to_cart() throws Throwable
	{
		cartPage = new CartPage(driver);
		cartPage.viewCart();
	}
	
	@Then("^No item is displayed in Cart$")
	public void no_item_is_displayed_in_cart() throws Throwable
	{
		assertEquals("Test is Failed", CartPage.expEmptyCartMsg, CartPage.eCText);
		System.out.println("Test is Passed");
	}
	
	@When("^Add an item under Home->Popular to Cart$")
	public void add_an_item_under_home_popular_to_cart() throws Throwable
	{
		System.out.println("Awaiting Development");
	}
	
	@Then("^Added item is displayed in Cart$")
	public void added_item_is_displayed_in_cart() throws Throwable
	{
		System.out.println("Awaiting Development");	
	}
	
    @When("^Remove an item from Cart$")
	public void remove_an_item_from_cart() throws Throwable
	{
    	System.out.println("Awaiting Development");
	}
    
    @Then("^Item is removed from Cart$")
   	public void item_is_removed_from_cart() throws Throwable
   	{
    	System.out.println("Awaiting Development");
   	}
	
	@After public void cleanUp()
	{ 
	      driver.quit(); 
	} 
}
