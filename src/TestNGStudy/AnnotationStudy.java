package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validateUserID() 
  {
	  Reporter.log("User ID Validated",true);
	  
	  }
 @Test
 public void validateDashBoard() 
 {
	 Reporter.log("DashBoard Validated",true);
	 
 }
 @BeforeMethod
 public void loginToKiteApp()
 {
	 Reporter.log("login Sucsses",true);
 }
 @BeforeClass
 public void launchBrowser() 
 {
	 Reporter.log("browser launched",true); 
 }
 @AfterClass
 public void closeBrowser() 
 {
	 Reporter.log("browser closed",true);  
 }
 @AfterMethod
 public void logoutFromKiteApp()
 {
	 Reporter.log("logging out",true);  
 }
}
