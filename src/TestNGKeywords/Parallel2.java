package TestNGKeywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	  public void FacebookLaunch() throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://en-gb.facebook.com/");
			Reporter.log("facebook Launche",true);
			Thread.sleep(2000);
			driver.close();
  }
}
