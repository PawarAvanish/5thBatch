package Parameterization;

import java.io.FileInputStream;



import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Basic {
	
	
	public static void main(String[] args) throws EncryptedDocumentException,IOException{
      FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Book1.xlsx");
		
		String data= WorkbookFactory.create(file).getSheet("Sheet1")
				
				.getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
	
	}

}
