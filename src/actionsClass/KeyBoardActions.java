package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
         Thread.sleep(1000);
         
         WebElement textbox = driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
         
         Actions act=new Actions(driver);
         act.sendKeys(textbox, "Suraj").perform();
         
         //how to Handle drpdown Using Actions class
         
         WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
         
         act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
         
         
	}

	
}
