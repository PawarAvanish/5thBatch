package Parameterization;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifyCell {
	
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\priyanka1.xlsx");
		
		CellType CT=WorkbookFactory.create(file).getSheet("Sheet1").getRow(10).getCell(0).getCellType();
	
	System.out.println(CT);
	}
}

