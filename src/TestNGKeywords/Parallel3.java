package TestNGKeywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	 public void VCTCLaunch() throws InterruptedException 
	  {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/");
			Reporter.log("VCTC Launche",true);
			Thread.sleep(2000);
			driver.close();
  }
}
