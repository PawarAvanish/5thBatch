package Parameterization;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Verifycellbooleanstringnumeric {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file= new FileInputStream("C:\\Users\\Lenovo\\Desktop\\priyanka1.xlsx");
		
		Cell Cellinfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0);

		
	 
	 CellType CT = Cellinfo.getCellType();
		
		if(CT==CellType.STRING) {
			System.out.println(Cellinfo.getStringCellValue());
			
		}
		else if(CT==CellType.NUMERIC) {
			System.out.println(Cellinfo.getNumericCellValue());
		}
		
		else if (CT==CellType.BOOLEAN) {
			System.out.println(Cellinfo.getBooleanCellValue());
		}
	}

}
