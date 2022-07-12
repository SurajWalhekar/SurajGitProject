package actionsClass;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
         Thread.sleep(1000);
        
         System.out.println(driver.manage().window().getSize());
         
         org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(1500, 500);
         
         driver.manage().window().setSize(d);
         

	}

}
