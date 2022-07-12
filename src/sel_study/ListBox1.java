package sel_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-java-4.1.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
       
		
		//1. Identify Listbox to Be Handled and stored it in reference variable
		
		WebElement ListBox1 = driver.findElement(By.name("dropdown-class-example"));
		
		//2.  Create An object of Select Class Which Will Accept Webelement As Argument
		
		Select s=new Select(ListBox1);
		
		
		//3.By Using One Of the Select Class methods we Can Select Values From List Box Like
		
		s.selectByVisibleText("Option3");
		Thread.sleep(2000);
		s.selectByValue("option1");
		Thread.sleep(2000);
		
		s.selectByIndex(2);
		
		
		

	}

}
