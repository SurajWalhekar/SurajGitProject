package CrossBrowserstudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	@Parameters("browserName")
    @Test
  public void BrowserTest(String browserName) {
		WebDriver driver =null;
		if(browserName.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver", "E:\\selenium-java-4.1.4\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();}
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
				
				//provide userid
				driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
				
				//provide password
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Year@123");
				
				//click on login button
				driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
				
				//provide pin
				driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
				
				//click on continue
				
				driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
				
				
				//find userid
				String ActualUserid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
			
			
				String ExpecxtedUserid="DV1510";
				
				if(ActualUserid.equals(ExpecxtedUserid))
					
				{
					System.out.println("TC passed user id is matching");
				}
				else {
					System.out.println("TC failed user id is not-matching");
					
				}
		    driver.close();


  }
}
