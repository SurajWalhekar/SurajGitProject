package IframeEgStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Thread.sleep(1000);   
		driver.switchTo().frame("moneyiframe");
		String nseindex = driver.findElement(By.id("nseindex")).getText();
	
	    System.out.println(nseindex);

	}

}
