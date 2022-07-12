package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
         Thread.sleep(1000);
         WebElement seleniumbutton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
         //By webelement Method
         //  seleniumbutton.click(); 
         //By using Action Class We need To create Action Class and Pass Driver Object
         
         Actions act=new Actions(driver);
         //act.click(seleniumbutton).perform();
         
         
         //How to Right Click (contextClick)using actions Class
         
        // WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
         
        // act.doubleClick(rightClickButton).perform();
         
         
         //how to double click using actions class
         WebElement doubleclickbutton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
         act.doubleClick(doubleclickbutton).perform();
         
	}

}
