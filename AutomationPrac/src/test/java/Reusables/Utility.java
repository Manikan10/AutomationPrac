package Reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
	
	WebDriver driver;
	public String browserName;
	public static String Url = "http://automationpractice.com/";
	
	public void browser(String browserName)
	{
	if (browserName.equalsIgnoreCase("Chrome")) 
    {
		System.setProperty("webdriver.chrome.driver","driver\\chrome\\chromedriver.exe");
        driver=new ChromeDriver(); 
    } 
    else if (browserName.equalsIgnoreCase("Firefox")) 
    {
    	System.setProperty("webdriver.gecko.driver","driver\\firefox\\geckodriver.exe");
    	driver = new FirefoxDriver();
    } 
    else if (browserName.equalsIgnoreCase("IE")) 
    {
        //Set IEDriver path and initiate IE
    } 
    else 
    {
        System.out.println("Error Message----> " + "browser name not mentioned properly");
        System.exit(0);
    }
		driver.get(Url);
		driver.manage().window().maximize();
	}

}