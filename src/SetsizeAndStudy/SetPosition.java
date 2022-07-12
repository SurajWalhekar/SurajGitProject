package SetsizeAndStudy;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
         Thread.sleep(1000);
         System.out.println(driver.manage().window().getPosition());
       org.openqa.selenium.Point p=new org.openqa.selenium.Point(100, 100);
       
         // using SetPosition method we can set the browser position
         
         driver.manage().window().setPosition(p);
         
         
         
        
         
         
         
         
         
         
         
         
         
      

	}

}
