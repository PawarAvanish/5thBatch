package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameter {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\priyanka1.xlsx");
		
		double data= WorkbookFactory.create(file).getSheet("Sheet1")
				
				.getRow(10).getCell(0).getNumericCellValue();
		System.out.println(data);
	
}
}
