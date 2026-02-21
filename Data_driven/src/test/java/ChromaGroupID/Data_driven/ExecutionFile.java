package ChromaGroupID.Data_driven;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;

import utility.ReaderFile;
import utility.writefile;

public class ExecutionFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ReaderFile read = new ReaderFile();
		
		//read.readfile();
		
		writefile write = new writefile();
		
		 //write.writefile();
		
		read.readfile(write.writefile());

	}

}
