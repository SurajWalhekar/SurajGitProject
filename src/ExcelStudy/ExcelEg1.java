package ExcelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\New folder (2)\\Book2.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		System.out.println(mysheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(mysheet.getRow(1).getCell(0).getNumericCellValue());
		
		 int totalrows = mysheet.getLastRowNum();
		
        short totalcells = mysheet.getRow(totalrows).getLastCellNum();
        int cellcount = totalcells-1;
        System.out.println(totalrows);
        System.out.println(cellcount);
	}

}
