package sel_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
         Thread.sleep(10000);
         driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
         Thread.sleep(3000);
         
         WebElement GetOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
         
         System.out.println(GetOtpButton.isEnabled());
         
		driver.findElement(By.id("mobileNumber")).sendKeys("9765127202");
		Thread.sleep(3000);
		
		System.out.println(GetOtpButton.isEnabled());
		GetOtpButton.click();
		
	}

}
