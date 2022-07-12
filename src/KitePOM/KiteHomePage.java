package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
   @FindBy(xpath = "//span[@class='user-id']") private WebElement username;
   
   @FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
	


 //2.Constructor

      public KiteHomePage(WebDriver driver)
      {
    	  
    	PageFactory.initElements(driver, this);  
      }
     //3.
      
      public void validateUserName()
      
      {
    	  
    	  String expectedUserName = "ELR321";
    	  String actualUserName = username.getText();
    	  
    	  if(expectedUserName.equals(actualUserName))
    	  {
    		  
    		  System.out.println("Actual And Expected UserID Are Matching TC Is Passed");
    		  
    		   }
    	  else {
    		  
              System.out.println("Actual And Expected UserID Are Not Matching TC Is Failed");
    	  }}
    	  
    	  
    	  public void LogOut() throws InterruptedException
    	  
    	  {
    		  username.click();
    		 Thread.sleep(200);
    		 logoutButton.click();
    		 
    		  
    		  
    	  }
    	  
    	  
    	  
      
    	  
    	  
      }



      
      
      
      
      
      
      



