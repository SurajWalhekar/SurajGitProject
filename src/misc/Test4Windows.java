package misc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4Windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com");
		Thread.sleep(2000);
		String mainpageID = driver.getWindowHandle();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		Thread.sleep(2000);
		Set<String> allpageID = driver.getWindowHandles();
		for (String all:allpageID) {
			if(!all.equals(mainpageID))
			{
				driver.switchTo().window(all);
				Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]"));
		        Thread.sleep(2000);
				
		   driver.switchTo().window(mainpageID);
		        
	String text = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).getText();
		        
				
				
				
				
				}
			}
				
				
				
		
		
		
		
		
		
		
	}

}
