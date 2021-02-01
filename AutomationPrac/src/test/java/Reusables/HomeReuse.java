package Reusables;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeReuse {
	
	WebDriver driver;
	
	public static String apTitle = "My Store";
	
	@FindBy(className = "login")
	public WebElement sign_in;
	
	@FindBy(id = "search_query_top")
	public WebElement searchBox;
	
	@FindBy(name = "submit_search")
	public WebElement enterSearch;
	
	public HomeReuse (WebDriver driver) {  
        this.driver = driver;  
        PageFactory.initElements(driver, this);
	 } 
	
	public LoginReuse clickSignin()
	{
		try
		{
		this.sign_in.click();
		return new LoginReuse(this.driver);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.signin");
		}
		return null;
	}
	
	public void launchHome()
	{
		try
		{
			String actapTitle = driver.getTitle();
			assertEquals("Test is failed",actapTitle,apTitle);
			
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.launchHome");
		}
	}
	
	public void searchItem(String a)
	{
		try
		{
		this.searchBox.sendKeys(a);
		this.enterSearch.click();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.searchItem");
		}
	}
	
}
