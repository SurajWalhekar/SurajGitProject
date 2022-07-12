package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("swift");
		Thread.sleep(2000);
	  List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
				System.out.println(searchResults.size());
				for(WebElement r:searchResults)// for getting text only
				{
				System.out.println(r.getText());
				}
				for(WebElement result:searchResults)// for clicking on required result
				{
				WebElement result1;
				String actualText = result.getText();
				String expectedText= "swift dzire";
				if(actualText.equals(expectedText)) {
					result.click();
					
					
				}
				driver.findElement(By.linkText("Images")).click();
				}
				
				
		
	}

}
