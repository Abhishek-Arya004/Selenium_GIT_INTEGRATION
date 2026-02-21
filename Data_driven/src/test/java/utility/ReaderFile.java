package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaderFile {
	
	
	
	public void readfile(Workbook workbook) throws IOException {
		
		
	//	String filepath =System.getProperty("user.home") + "//Documents//Sample_data.xlsx"; // xlsx|xls
		
	//	String filepath = file;
		
	//	FileInputStream inputStream = new FileInputStream(filepath);
		
	//	Workbook workbook = new XSSFWorkbook(inputStream);
		
		Sheet sheet =workbook.getSheet("Owner_Details");
		
		sheet.getLastRowNum();
		
		sheet.getRow(0).getLastCellNum();
		
		String name = sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(name);
		
		
		for(int i = 0 ; i<sheet.getLastRowNum();i++) {
			
			
			for(int j = 0 ; j<sheet.getRow(i).getLastCellNum();j++) {
				
				
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "   ");
				
			}
			
			System.out.println();
			
		}
	
		
	}
	
	
	
	
	
	
	
	

}
