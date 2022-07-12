package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
         Thread.sleep(2000);
         
         KiteLogInPage login=new KiteLogInPage(driver);
         login.sendUserName();
         login.sendPassword();
         login.clickonLoginButtion();
         
         Thread.sleep(2000); 
         
         KitePinPge pin=new KitePinPge(driver);
         pin.sendPin();
         pin.clickoncontinueButton();
         
         Thread.sleep(2000);
         
         KiteHomePage home=new KiteHomePage(driver);
         
         home.validateUserName();
         home.LogOut();
         
         driver.close();
         
         

	}

}
