package TestNGStudy1;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteTestBaseUtility.Base;
import KiteTestBaseUtility.Utility;
import TestNGPOM.KiteHomePage;
import TestNGPOM.KiteLogInPage;
import TestNGPOM.KitePinPge;

public class ValidateKiteAppUserName extends Base{
	KiteLogInPage login;
	KitePinPge pin;
	KiteHomePage home;
    
    @BeforeClass
	
	public void LaunchBrowser()
	{
		 BrowserInitialize();
		 login=new KiteLogInPage(driver);
		 pin=new KitePinPge(driver);
		 home=new KiteHomePage(driver);
		 
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUserName(Utility.readDataFromProp("UN"));
		login.sendPassword(Utility.readDataFromProp("PWD"));
		login.clickonLoginButtion();
		
		pin.sendPin(Utility.readDataFromProp("PIN"));
		pin.clickoncontinueButton();
	
		
		
		
	}
  @Test 
  public void ValidateUserName() throws IOException 
  {
	  Assert.assertEquals(home.GetUserID(),Utility.readDataFromProp("UN"));
	  Utility.screenshot(driver, 1234);
	  
  }
  
  
  @AfterMethod
  public void LogoutFromKiteApp() throws InterruptedException 
  {
	  home.LogOut();
	  Reporter.log("Logging Out",true);
	  
  }
  @AfterClass
  public void CloseBrowser() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("Closing Browser..",true);
	  driver.close();
	  
	  
  }
  
}
