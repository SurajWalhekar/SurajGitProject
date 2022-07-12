package KiteTest;

import org.testng.annotations.Test;

import KiteTestBaseUtility.Base;
import KiteTestBaseUtility.Utility;
import TestNGPOM.KiteHomePage;
import TestNGPOM.KiteLogInPage;
import TestNGPOM.KitePinPge;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class UserIdValidation extends Base {
	KiteLogInPage login;
	KitePinPge pin;
	KiteHomePage home;
	
  @Test
  public void ValidationOfUserId() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.GetUserID(),Utility.readDataFromExcelSheet(2, 0));
	  Utility.screenshot(driver, 1234);
  }
  @BeforeMethod
  public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException
  {
	login.sendUserName(Utility.readDataFromExcelSheet(2, 0));
	login.sendPassword(Utility.readDataFromExcelSheet(3, 0));
	login.clickonLoginButtion();
	Thread.sleep(2000);
	
	pin.sendPin(Utility.readDataFromExcelSheet(4, 0));
	pin.clickoncontinueButton();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException 
  {
	  home.LogOut();
  }

  @BeforeClass
  public void beforeClass()
  { 
	  BrowserInitialize();
	 login=new KiteLogInPage(driver);
	 pin=new KitePinPge(driver);
	 home=new KiteHomePage(driver);
	 
	  
  }
  

  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
