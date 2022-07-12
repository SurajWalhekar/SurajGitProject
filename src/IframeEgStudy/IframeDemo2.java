package IframeEgStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overviw-summery.html");
		Thread.sleep(1000);
	
		//Switch to 1st Frame by webelement
		WebElement iframeEement = driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(iframeEement);
		WebElement linkText = driver.findElement(By.linkText("org.openqa.selenium"));
		linkText.click();
		System.out.println(linkText.getText());
	
	   
		//Switch to 1st Frame by Index
	    //driver.switchTo().frame(0);
	    //driver.findElement(By.linkText("org.openqa.selenium")).click();
		
	    //Switch to 1st Frame by Name
	   //driver.switchTo().frame("packageListFrame");
		
	   //driver.findElement(By.linkText("org.openqa.selenium")).click();
	    //Switch to 1st Frame by webelement
		
		//Switch To main Frame
		driver.switchTo().defaultContent();//main page
		
		//switch To 2nd Frame
		driver.switchTo().frame(1);
		
		//find web element "Alert" link text of 2nd frame.
		driver.findElement(By.linkText("Alert")).click();
		
         //switch to main page
		
		driver.switchTo().defaultContent();//main page
		
		//find and print total iframes on webpage
		
		int noOfiframes = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("No of iframes:" + noOfiframes ); 
		
		
		
		
		
	   
	   
	   
	
	}

}
