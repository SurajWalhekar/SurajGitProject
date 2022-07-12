package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
         Thread.sleep(1000);
         
         WebElement src = driver.findElement(By.xpath("//a[@class='button button-orange']"));
         WebElement desti = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
         
         Actions act=new Actions(driver);
         act.dragAndDrop(src, desti).perform();

	}

}
