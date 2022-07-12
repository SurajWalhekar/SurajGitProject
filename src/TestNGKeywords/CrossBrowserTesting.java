package TestNGKeywords;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
       @Parameters("browserName")
	   @Test
	  public void myMethod(String name) throws InterruptedException 
	  {
		  WebDriver driver = null;
		  if(name.equals("firefox"))
		  {
		    System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-4.1.4\\geckodriver.exe");
		    driver = new FirefoxDriver();
		  }
		  /*else if(name.equals("chrome"))
		  {
		        System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
				driver = new ChromeDriver();
		  }
		  
		  driver.manage().window().maximize();
		  driver.get("https://vctcpune.com/selenium/practice.html");*/
			
		  Thread.sleep(2000);
		  
		 driver.close();
	  }
	
		
		
	
		
	
  }


