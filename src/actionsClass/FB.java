package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
         Thread.sleep(1000);
         WebElement day = driver.findElement(By.id("day"));
         Actions act=new Actions(driver);
         act.click(day).perform();
         for(int i=1;i<28;i++);
         {
        	 act.sendKeys(Keys.ARROW_DOWN).perform();
        	 Thread.sleep(100);
         }
         act.sendKeys(Keys.ENTER).perform();
         

	}

}
