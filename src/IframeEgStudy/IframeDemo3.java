package IframeEgStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		//Switch To parent Frame
		
		driver.switchTo().frame("frame1"); //Outer frame
		driver.switchTo().frame("frame3"); //inner frame
		
		//find web element checkbox
		
		driver.findElement(By.id("a")).click();
		
		//switch parent frame
		
		driver.switchTo().parentFrame();
		//Find the webelement input box
		driver.findElement(By.tagName("input")).sendKeys("Suraj");
		
		//Switch To Default Contain main page
         driver.switchTo().defaultContent();
         
         //switch to frame 2
        
         driver.switchTo().frame("frame2");
		 
		 //find webelement animal dropdown
		 WebElement dropDowneelement = driver.findElement(By.id("animals"));
		 System.out.println(dropDowneelement.getText());
		 Select dropDown = new Select(dropDowneelement);
		   dropDown.selectByVisibleText("Avatar");
		  WebElement Txt = driver.findElement(By.xpath("//option[text()='Avatar']"));
		  
		  System.out.println(Txt.getText());
		 Thread.sleep(2000);
		 
		 
		
		
		
		
		

	}

}
