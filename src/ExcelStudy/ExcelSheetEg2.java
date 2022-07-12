package ExcelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile =new File("E:\\New folder (2)\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	
		int totalrows = mysheet.getLastRowNum();
		 int rowcount = totalrows;
		short totalcells = mysheet.getRow(totalrows).getLastCellNum();
		int cellcount = totalcells-1;
		System.out.println(rowcount);
		System.out.println(cellcount);
		
		for(int i=0;i<=rowcount;i++) {
			
			for (int j=0;j<=cellcount;j++)
			{
				Cell cellvalue = mysheet.getRow(i).getCell(j);
				
				CellType celltype = cellvalue.getCellType();
				if(celltype==CellType.STRING)
				{
					String value1 = cellvalue.getStringCellValue();
					
					System.out.print(value1+" ");
				}
				else if(celltype==CellType.NUMERIC)
				{
					double value2 = cellvalue.getNumericCellValue();
					System.out.print(value2+" ");
				}
				else if(celltype==CellType.BOOLEAN)
				{
					boolean value3 = cellvalue.getBooleanCellValue();
					System.out.print(value3+" ");
				}
				
				
				
				
			
			}
	System.out.println();	
		
		
		}
		
		
		
		
		
	}

}
