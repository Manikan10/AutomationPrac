package Reusables;
//import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	public String sText;
	public String noResultwarning;
	public String noItems;
	public String blankItem;
	
	@FindBy(xpath = "//span[@class = 'lighter']")
	public WebElement searchedText;
	
	@FindBy(xpath = "//div[@class = 'product-image-container']")
	public WebElement resultContainer;
	
	@FindBy(xpath = "//p[@class = 'alert alert-warning']")
	public WebElement noResultsText;	
	
	
	public SearchPage (WebDriver driver) {  
        this.driver = driver;  
        PageFactory.initElements(driver, this);
	 } 
	
	public void searchPageText()
	{
		try
		{
			sText = this.searchedText.getText().toLowerCase();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.searchPageText");
		}
	}
	
	public void noResults() 
	{
		try
		{
			noResultwarning = this.noResultsText.getText();
			noItems = "No results were found for your search";
			blankItem = "Please enter a search keyword";
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Login.noResults");
		}
	}

}