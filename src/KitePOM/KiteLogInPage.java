package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage {
	//1.Data members
	
	@FindBy (id = "userid")   private WebElement userName;
	@FindBy (id = "password")  private WebElement password;
	@FindBy (xpath = "//button[@class='button-orange wide']")private WebElement loginbutton;
	
	
   //2.Constructor
	
	public KiteLogInPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	//3.Methods
	
	public void sendUserName() 
	
	{
	userName.sendKeys("ELR321");
	
	
	}
	public void sendPassword()
	{
		password.sendKeys("Dhana1111");
	}
	public void clickonLoginButtion()
	{
		loginbutton.click();
	}
	
	
	
	

}
