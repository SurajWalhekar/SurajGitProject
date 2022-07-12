package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		
		WebElement courses = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		Wait.until(ExpectedConditions.visibilityOf(courses));
		courses.click();
		driver.close();
	     

	}

}
