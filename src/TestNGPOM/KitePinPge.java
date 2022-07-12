package TestNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPge {
	
	//1.Data members
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;

	
	
	//2.Constructor
	
	public KitePinPge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendPin(String pin)
	{
		PIN.sendKeys(pin);
		
		
	}
	public void clickoncontinueButton()
	{
		continueButton.click();
	}
}
