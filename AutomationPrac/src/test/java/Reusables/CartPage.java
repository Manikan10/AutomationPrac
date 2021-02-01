package Reusables;
//import static org.junit.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	public static String eCText;
	public static String expEmptyCartMsg;
	
	@FindBy(xpath = "//p[text() = 'Your shopping cart is empty.']")
	public WebElement emptyCartText;
	
	@FindBy(xpath = "//a[@title = 'View my shopping cart']")
	public WebElement viewCartBtn;
	
	
	public CartPage (WebDriver driver) {  
        this.driver = driver;  
        PageFactory.initElements(driver, this);
	 } 
	
	public void emptyCart()
	{
		try
		{
			expEmptyCartMsg = "Your shopping cart is empty.";
			eCText = this.emptyCartText.getText();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.emptyCart");
		}
	}
	
	public void viewCart()
	{
		try
		{
			this.viewCartBtn.click();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.viewCart");
		}
	}
}