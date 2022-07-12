package sel_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectableUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement MultiSelectUse = driver.findElement(By.name("cars"));
		Select s=new Select(MultiSelectUse);
		System.out.println("Multiselect Status is"+s.isMultiple());
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		s.selectByValue("saab");
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.deselectAll();
		
		
		
		
		
		
		

	}

}
