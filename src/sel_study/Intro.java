package sel_study;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");

       // driver.findElement(By.xpath("//input[@id='autocomplete']"));
        
        //driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
      //  Thread.sleep(5000);
       // driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Amol");
        
        
     //  Thread.sleep(5000);
      //  driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
        
        
        
	}

}
