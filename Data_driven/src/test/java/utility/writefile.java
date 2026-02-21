package utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writefile {
	
	
 public static Workbook writefile() throws IOException {
	 
	 
	 File file = new File(System.getProperty("user.home") + "//Documents//Sample_data2.xlsx");
	 
	 file.createNewFile();
	 
	// String filepath =System.getProperty("user.home") + "//Documents//Sample_data1.xlsx";
	 
	 

	 
	 Workbook workbook = new XSSFWorkbook();
	 
	Sheet sheet= workbook.createSheet("student_data");
	 
	 Row header = sheet.createRow(0);
	 
	 header.createCell(0).setCellValue("Name");
	 header.createCell(1).setCellValue("lastname");
	 header.createCell(2).setCellValue("mobilenumber");
	 
	 FileOutputStream outputstream = new FileOutputStream(file);
	 workbook.write(outputstream);
	 
	// workbook.close();
	 
	 
	// workbook.getSheetAt(1);
	 
	 //Sheet sheet = workbook.getSheetAt(1);
	 
	 //sheet.getRow(0).createCell(0).setCellValue("this writing on file");
	 
	// workbook.close();
	 
	 
	 
	 return workbook;
	 
	 
 }

}
