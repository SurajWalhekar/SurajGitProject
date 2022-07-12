package PopUpSudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("alertButton")).click();
		
		//to handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
		
      Alert alt = driver.switchTo().alert();
      
      //alert is an interface which Contains abstract methods like
      
    //1. accept(): use to click on ok button.
	//. dismiss(): use to click on cancel button.
	//. getText(): use to get text present in a alert popup.
      
      System.out.println(alt.getText());
      alt.accept();
      
      
      
      
      
      
      
      
		  
		

	}

}
