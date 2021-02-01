package Reusables;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginReuse {
	
	WebDriver driver;
	
	public static String apLoginTitle = "Login - My Store";
	public String validationMsg;
	
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "passwd")
	public WebElement password;
	
	@FindBy(id = "SubmitLogin")
	public WebElement login_button;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-danger')]/ol/li")
	public WebElement validation_message;
	
	
	public LoginReuse (WebDriver driver) {  
        this.driver = driver;  
        PageFactory.initElements(driver, this);
	 } 
	
	public void enterEmail(String u)
	{
		try
		{
		this.email.sendKeys(u);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.enterEmail");
		}
	}
	
	public void enterPassword(String p)
	{
		try
		{
		this.password.sendKeys(p);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.enterPassword");
		}
	}
	
	public void clickLogin()
	{
		try
		{
		this.login_button.click();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.clickLogin");
		}
	}
	
	public void launchLogin()
	{
		try
		{
			String actapLoginTitle = "";
			actapLoginTitle = driver.getTitle();
			assertEquals("Test is failed",actapLoginTitle,apLoginTitle);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.launchLogin");
		}
	}
	
	public void validationMessage()
	{
		try
		{
		validationMsg = this.validation_message.getText();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.validationMessage");
		}
	}

}
