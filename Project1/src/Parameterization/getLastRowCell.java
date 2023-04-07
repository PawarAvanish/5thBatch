package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getLastRowCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\priyanka.xlsx");
		
		int LastRowNumber= WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(LastRowNumber+1);
	}

}
