package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//how to find no of rows in table
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
	     int totalNumOfRows = rows.size();
	     System.out.println("Total No Of Rows In Table"+totalNumOfRows);
	     
	     //how To Find no of columns in table
	     List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
	      int totalNumOfColumns = columns.size();
	
	
	
	}

	
}
