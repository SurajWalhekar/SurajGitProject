package Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
        // Thread.sleep(10000);
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
         driver.close();

	}

}
