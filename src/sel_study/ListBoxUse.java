package sel_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        Thread.sleep(2000);
        
        WebElement BirthDate = driver.findElement(By.name("birthday_day"));
        
		Select s1=new Select(BirthDate);
		s1.selectByVisibleText("28");
		  Thread.sleep(2000);
		  WebElement birthdaymonth = driver.findElement(By.name("birthday_month"));
	        
			Select s2=new Select(birthdaymonth);
			//s2.selectByVisibleText("Jun");
			s2.selectByIndex(5);
			Thread.sleep(2000);
			
	        
	        WebElement birthdayyear = driver.findElement(By.name("birthday_year"));
	        
			Select s3=new Select(birthdayyear);
			s3.selectByValue("1997");
			  Thread.sleep(2000);
			  
			  
			
			
			
			
			  
		
		
	}

}
