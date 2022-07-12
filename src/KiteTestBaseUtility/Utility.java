package KiteTestBaseUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static String readDataFromExcelSheet(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("E:\\New folder (2)\\KiteTest.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	 public static void screenshot(WebDriver driver,int TCID) throws IOException
	 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("E:\\Screenshot\\Testcaseid"+TCID+".png");
		FileHandler.copy(src, Destination);
		}
		
		public static String readDataFromProp(String key) throws IOException
		{
			Properties prop=new Properties();
			FileInputStream myfile=new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\26March-B-Batch\\Selenium Study\\Myproperties.properties");
			prop.load(myfile);
			String keys = prop.getProperty(key);
			return keys;
			
			
		}
		
		
		
		
		
	}
	


